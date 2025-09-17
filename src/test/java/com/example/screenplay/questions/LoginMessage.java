package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Pregunta personalizada para obtener el mensaje de error mostrado al ingresar un correo inválido en Google.
 * Utiliza Serenity BDD para localizar el mensaje de error en la pantalla de login de Google.
 */
public class LoginMessage implements Question<String> {
    /**
     * Localizador del mensaje de error de cuenta Google inválida.
     */
    private static final Target GOOGLE_INVALID_EMAIL_MESSAGE = Target.the("mensaje de error de cuenta Google")
        .located(By.xpath("//*[contains(@text, 'Couldn’t find your Google Account') or contains(@text, 'No se pudo encontrar tu cuenta de Google') or contains(@text, 'Cuenta de Google inválida')]"));

    /**
     * Devuelve el texto del mensaje de error de cuenta Google inválida.
     *
     * @param actor El actor que realiza la consulta.
     * @return El texto del mensaje de error mostrado.
     */
    @Override
    public String answeredBy(Actor actor) {
        return GOOGLE_INVALID_EMAIL_MESSAGE.resolveFor(actor).getText();
    }

    /**
     * Método de fábrica para obtener la pregunta del mensaje de error.
     * @return Instancia de la pregunta LoginMessage.
     */
    public static Question<String> text() {
        return new LoginMessage();
    }
}
