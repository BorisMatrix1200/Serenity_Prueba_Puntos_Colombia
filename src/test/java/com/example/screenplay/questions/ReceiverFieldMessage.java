package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.example.screenplay.ui.BalancePage;

/**
 * Pregunta personalizada para verificar si el mensaje del campo receptor es visible y contiene el texto correcto.
 * Utiliza Serenity BDD para obtener el texto del elemento correspondiente en la página de balance.
 */
public class ReceiverFieldMessage implements Question<Boolean> {
    /**
     * Responde la pregunta verificando si el mensaje visible es exactamente "The tricount is settled".
     *
     * @param actor El actor que realiza la pregunta.
     * @return true si el mensaje es "The tricount is settled", false en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(BalancePage.RECEIVER_FIELD).answeredBy(actor);
        return "The tricount is settled".equals(message);
    }

    /**
     * Método de fábrica para crear una instancia de la pregunta.
     * @return Nueva instancia de ReceiverFieldMessage.
     */
    public static ReceiverFieldMessage isVisibleWithCorrectText() {
        return new ReceiverFieldMessage();
    }
}
