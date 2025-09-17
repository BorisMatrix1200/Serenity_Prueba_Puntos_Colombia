package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.example.screenplay.ui.BalancePage;

/**
 * Pregunta personalizada para verificar si el mensaje de resumen de balance es visible y contiene el texto correcto.
 * Utiliza Serenity BDD para obtener el texto del elemento correspondiente en la página de balance.
 */
public class BalanceSummaryMessage implements Question<Boolean> {
    /**
     * Método que responde la pregunta utilizando el actor proporcionado.
     * Verifica si el mensaje mostrado es exactamente "All good!".
     *
     * @param actor El actor que realiza la pregunta.
     * @return true si el mensaje es "All good!", false en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(BalancePage.BALANCE_SUMMARY).answeredBy(actor);
        return "All good!".equals(message);
    }

    /**
     * Método de fábrica para crear una instancia de la pregunta.
     * @return Nueva instancia de BalanceSummaryMessage.
     */
    public static BalanceSummaryMessage isVisibleWithCorrectText() {
        return new BalanceSummaryMessage();
    }
}
