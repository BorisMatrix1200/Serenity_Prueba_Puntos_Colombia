package com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Pregunta personalizada para verificar si un grupo con un nombre específico es visible en la lista.
 * Utiliza Serenity BDD para localizar el elemento por su nombre y comprobar su visibilidad.
 */
public class GroupIsVisible implements Question<Boolean> {
    /**
     * Nombre del grupo a buscar en la lista.
     */
    private final String groupName;

    /**
     * Constructor de la pregunta.
     * @param groupName Nombre del grupo a verificar visibilidad.
     */
    public GroupIsVisible(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Método de fábrica para crear una instancia de la pregunta con el nombre del grupo.
     * @param groupName Nombre del grupo a verificar.
     * @return Nueva instancia de GroupIsVisible.
     */
    public static GroupIsVisible withName(String groupName) {
        return new GroupIsVisible(groupName);
    }

    /**
     * Responde la pregunta verificando si el grupo es visible para el actor.
     * @param actor El actor que realiza la pregunta.
     * @return true si el grupo es visible, false en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        Target groupTarget = Target.the("Grupo en la lista").located(By.xpath("//*[contains(@text, '" + groupName + "')]"));
        return groupTarget.resolveFor(actor).isVisible();
    }
}
