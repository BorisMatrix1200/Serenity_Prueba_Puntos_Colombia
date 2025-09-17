package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.example.screenplay.ui.GroupPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * Tarea personalizada para crear un grupo en la aplicación Tricount.
 * <p>
 * Esta clase implementa el patrón Screenplay de Serenity BDD para automatizar la creación de un grupo,
 * incluyendo el ingreso del nombre del grupo y la adición de participantes.
 */
public class CreateGroup implements Task {
    /**
     * Nombre del grupo a crear.
     */
    private final String groupName;
    /**
     * Participantes a agregar al grupo, separados por "y" o ",".
     */
    private final String participants;

    /**
     * Constructor de la tarea CreateGroup.
     * @param groupName Nombre del grupo.
     * @param participants Participantes a agregar al grupo.
     */
    public CreateGroup(String groupName, String participants) {
        this.groupName = groupName;
        this.participants = participants;
    }

    /**
     * Método de fábrica para crear una instancia de la tarea con los datos proporcionados.
     * @param groupName Nombre del grupo.
     * @param participants Participantes a agregar al grupo.
     * @return Nueva instancia de CreateGroup lista para ser utilizada en un flujo de Screenplay.
     */
    public static CreateGroup withData(String groupName, String participants) {
        return Tasks.instrumented(CreateGroup.class, groupName, participants);
    }

    /**
     * Ejecuta la tarea de crear un grupo y agregar los participantes especificados.
     * @param actor El actor que realiza la tarea.
     * @param <T> Tipo del actor.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GroupPage.TROCOUNTS_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(GroupPage.TROCOUNTS_BUTTON),
                WaitUntil.the(GroupPage.CREATE_GROUP_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(GroupPage.CREATE_GROUP_BUTTON),
                WaitUntil.the(GroupPage.START_NEW_TRICOUNT_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(GroupPage.START_NEW_TRICOUNT_BUTTON),
                WaitUntil.the(GroupPage.GROUP_NAME_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(groupName).into(GroupPage.GROUP_NAME_FIELD)
        );
        // Agregar participantes separados por "y" o ","
        for (String participant : participants.split("y|,")) {
            String trimmed = participant.trim();
            if (!trimmed.isEmpty()) {
                actor.attemptsTo(
                        WaitUntil.the(GroupPage.PARTICIPANTS_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                        Enter.theValue(trimmed).into(GroupPage.PARTICIPANTS_FIELD),
                        WaitUntil.the(GroupPage.BUTTON_ADD_APRTICIPANT, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(GroupPage.BUTTON_ADD_APRTICIPANT)
                );
            }
        }
        actor.attemptsTo(
                WaitUntil.the(GroupPage.CONFIRM_CREATE_GROUP_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(GroupPage.CONFIRM_CREATE_GROUP_BUTTON),
                WaitUntil.the(GroupPage.BUTTON_INVITE_LATER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(GroupPage.BUTTON_INVITE_LATER)
        );
    }
}
