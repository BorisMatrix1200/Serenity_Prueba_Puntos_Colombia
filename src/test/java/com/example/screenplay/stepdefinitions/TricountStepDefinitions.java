package com.example.screenplay.stepdefinitions;

import com.example.screenplay.questions.*;
import com.example.screenplay.tasks.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Definiciones de pasos para los escenarios de pruebas de la aplicación Tricount.
 * <p>
 * Esta clase contiene los métodos que implementan los pasos de los escenarios escritos en Gherkin
 * para la automatización de pruebas con Cucumber y Serenity BDD. Incluye la inicialización del actor,
 * la ejecución de tareas y la validación de resultados mediante preguntas personalizadas.
 */
public class TricountStepDefinitions {

    @Managed(driver = "appium")
    AppiumDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new Cast());
    }

    @Dado("el usuario abre la aplicación Tricount en un dispositivo Android con la app instalada")
    public void elUsuarioAbreLaAplicacionTricountEnAndroid()  {
        OnStage.theActorCalled("Usuario").can(BrowseTheWeb.with(driver));
    }

    /**
     * Paso para iniciar sesión con una cuenta de Google, diferenciando entre cuenta válida e inválida.
     * @param googleAccount Correo de la cuenta de Google a utilizar.
     */
    @Cuando("el usuario inicia sesión con la cuenta de Google {string}")
    public void elUsuarioIniciaSesionConLaCuentaDeGoogle(String googleAccount) {
        if (googleAccount.equals("cuenta_invalida@gmail.com")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    LoginIncorrectWithGoogle.withAccount(googleAccount)
            );
        } else {
            System.out.println("No se ha iniciando sesión con la cuenta de Google: " + googleAccount);
        }
    }

    /**
     * Paso para validar que el usuario ve un mensaje específico en la pantalla.
     * @param string Mensaje esperado.
     */
    @Then("el usuario ve el mensaje {string}")
    public void elUsuarioVeElMensaje(String string) {
        seeThat(LoginMessage.text(), equalTo("Couldn’t find your Google Account"));
    }

    /**
     * Paso para indicar que el usuario ya ha iniciado sesión correctamente.
     */
    @Given("el usuario ha iniciado sesión")
    public void elUsuarioHaIniciadoSesión() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginWithGoogle.login()
        );
    }

    /**
     * Paso para crear un grupo con nombre y participantes especificados.
     * @param string Nombre del grupo.
     * @param string2 Participantes del grupo.
     */
    @When("el usuario crea un grupo llamado {string} con participantes {string}")
    public void elUsuarioCreaUnGrupoLlamadoConParticipantes(String string, String string2) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateGroup.withData(string, string2)
        );
    }

    /**
     * Paso para validar que el usuario está en el grupo y el label "Viaje Cartagena" está presente.
     */
    @Given("el usuario está en el grupo")
    public void elUsuarioEstáEnElGrupo() {

        // Validar que el label "Viaje Cartagena" esté presente
        OnStage.theActorInTheSpotlight().should(
                seeThat(ViajeCartagenaLabel.isVisibleWithCorrectText(), equalTo(true))
        );
    }

    /**
     * Paso para agregar un gasto con descripción Hotel pagado por Ana.
     * @param int1 Parámetro no utilizado (puede ser eliminado si no es necesario).
     */
    @When("el usuario agrega un gasto con descripción Hotel pagado por Ana")
    public void elUsuarioAgregaUnGastoDeConDescripciónHotelPagadoPorAna(Integer int1) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddExpense.addExpense()
        );
    }

    /**
     * Paso para validar que el gasto Hotel aparece en la lista de gastos del grupo.
     */
    @Then("el gasto Hotel aparece en la lista de gastos del grupo")
    public void elGastoHotelApareceEnLaListaDeGastosDelGrupo() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ListExpensesLabel.isVisibleWithCorrectText(), equalTo(true))
        );
    }

    /**
     * Paso para consultar el resumen de saldos del grupo.
     */
    @Given("el usuario consulta el resumen de saldos")
    public void elUsuarioConsultaElResumenDeSaldos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewBalances.viewBalances()
        );
    }

    /**
     * Paso para ver que un usuario debe dinero a otro.
     *
     */
    @When("el usuario ve que Luis debe a Ana")
    public void elUsuarioVeQueLuisDebeAAna() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewBalances.viewBalances()
        );
    }

    /**
     * Paso para registrar un pago de Luis a Ana y validar el campo receptor.
     *
     */
    @And("Luis registra un pago a Ana")
    public void luisRegistraUnPagoDeAAna() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SettleDebt.settleDebt()
        );

        // Validar que el label "Receiver" esté presente
        OnStage.theActorInTheSpotlight().should(
                seeThat(ReceiverFieldMessage.isVisibleWithCorrectText(), equalTo(true))
        );
    }

    /**
     * Paso para validar que la deuda entre Luis y Ana se liquida correctamente.
     */
    @Then("la deuda entre Luis y Ana se liquida")
    public void laDeudaEntreLuisYAnaSeLiquida() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(BalanceSummaryMessage.isVisibleWithCorrectText(), equalTo(true))
        );
    }

}
