package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.example.screenplay.ui.LoginPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * Tarea personalizada para realizar un intento de inicio de sesión incorrecto con una cuenta de Google.
 * <p>
 * Esta clase implementa el patrón Screenplay de Serenity BDD para automatizar el flujo de login con una cuenta de Google inválida,
 * incluyendo la navegación por los botones y el ingreso del correo electrónico.
 */
public class LoginIncorrectWithGoogle implements Task {

    /**
     * Correo de la cuenta de Google a utilizar en el intento de login.
     */
    private final String googleAccount;

    /**
     * Constructor de la tarea LoginIncorrectWithGoogle.
     * @param googleAccount Correo de la cuenta de Google a utilizar.
     */
    public LoginIncorrectWithGoogle(String googleAccount) {
        this.googleAccount = googleAccount;
    }

    /**
     * Método de fábrica para crear una instancia de la tarea con el correo proporcionado.
     * @param googleAccount Correo de la cuenta de Google a utilizar.
     * @return Nueva instancia de LoginIncorrectWithGoogle lista para ser utilizada en un flujo de Screenplay.
     */
    public static LoginIncorrectWithGoogle withAccount(String googleAccount) {
        return Tasks.instrumented(LoginIncorrectWithGoogle.class, googleAccount);
    }

    /**
     * Ejecuta la tarea de intentar iniciar sesión con una cuenta de Google inválida.
     * Navega por los botones de la pantalla de login, ingresa el correo y simula el flujo de error.
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
            WaitUntil.the(LoginPage.GOOGLE_ADD_ANOTHER_ACCOUNT_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.GOOGLE_ADD_ANOTHER_ACCOUNT_BUTTON),
            WaitUntil.the(LoginPage.GOOGLE_EMAIL_FIELD, isVisible()).forNoMoreThan(20).seconds(),
            Enter.theValue(googleAccount).into(LoginPage.GOOGLE_EMAIL_FIELD),
            WaitUntil.the(LoginPage.GOOGLE_CONTINUE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.GOOGLE_CONTINUE_BUTTON),
            WaitUntil.the(LoginPage.ANDROID_BACK_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(LoginPage.ANDROID_BACK_BUTTON)
        );
    }
}
