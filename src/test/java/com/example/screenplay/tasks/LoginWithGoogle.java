package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.example.screenplay.ui.LoginPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * Tarea personalizada para realizar el inicio de sesión exitoso con una cuenta de Google.
 * <p>
 * Esta clase implementa el patrón Screenplay de Serenity BDD para automatizar el flujo de login con una cuenta de Google válida,
 * incluyendo la navegación por los botones y la selección de la cuenta correcta.
 */
public class LoginWithGoogle implements Task {

    /**
     * Ejecuta la tarea de iniciar sesión con una cuenta de Google válida.
     * Navega por los botones de la pantalla de login y selecciona la cuenta correcta.
     * @param actor El actor que realiza la tarea.
     * @param <T> Tipo del actor.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(LoginPage.PROFILE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.PROFILE_BUTTON),
            WaitUntil.the(LoginPage.GOOGLE_LOGIN_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.GOOGLE_LOGIN_BUTTON),
            WaitUntil.the(LoginPage.GOOGLE_EMAILCORRECT_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.GOOGLE_EMAILCORRECT_BUTTON),
            WaitUntil.the(LoginPage.PROFILE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.PROFILE_BUTTON)
        );
    }

    /**
     * Método de fábrica para crear una instancia de la tarea LoginWithGoogle.
     * <p>
     * Utiliza el método instrumented de Serenity para inicializar la tarea correctamente.
     * @return Nueva instancia de LoginWithGoogle lista para ser utilizada en un flujo de Screenplay.
     */
   public static LoginWithGoogle login() {
        return Tasks.instrumented(LoginWithGoogle.class);
    }
}
