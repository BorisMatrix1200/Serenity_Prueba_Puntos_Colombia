package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.example.screenplay.ui.ExpensePage;

/**
 * Pregunta personalizada para verificar si la etiqueta de gastos de hotel es visible y contiene el texto correcto.
 * Utiliza Serenity BDD para obtener el texto del elemento correspondiente en la página de gastos.
 */
public class ListExpensesLabel implements Question<Boolean> {
    /**
     * Responde la pregunta verificando si la etiqueta visible es exactamente "Hotel".
     *
     * @param actor El actor que realiza la pregunta.
     * @return true si la etiqueta es "Hotel", false en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        String labelText = Text.of(ExpensePage.LBL_HOTEL).answeredBy(actor);
        return "Hotel".equals(labelText);
    }

    /**
     * Método de fábrica para crear una instancia de la pregunta.
     * @return Nueva instancia de ListExpensesLabel.
     */
    public static ListExpensesLabel isVisibleWithCorrectText() {
        return new ListExpensesLabel();
    }
}
