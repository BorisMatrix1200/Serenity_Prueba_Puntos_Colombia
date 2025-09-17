package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.example.screenplay.ui.ExpensePage;

/**
 * Pregunta personalizada para verificar si la etiqueta "Viaje Cartagena" es visible y contiene el texto correcto.
 * Utiliza Serenity BDD para obtener el texto del elemento correspondiente en la página de gastos.
 */
public class ViajeCartagenaLabel implements Question<Boolean> {
    /**
     * Responde la pregunta verificando si la etiqueta visible es exactamente "Viaje Cartagena".
     *
     * @param actor El actor que realiza la pregunta.
     * @return true si la etiqueta es "Viaje Cartagena", false en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        String labelText = Text.of(ExpensePage.LBL_VIAJE).answeredBy(actor);
        return "Viaje Cartagena".equals(labelText);
    }

    /**
     * Método de fábrica para crear una instancia de la pregunta.
     * @return Nueva instancia de ViajeCartagenaLabel.
     */
    public static ViajeCartagenaLabel isVisibleWithCorrectText() {
        return new ViajeCartagenaLabel();
    }
}
