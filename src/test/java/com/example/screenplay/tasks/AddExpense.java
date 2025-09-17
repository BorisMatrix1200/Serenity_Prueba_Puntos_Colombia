package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.example.screenplay.ui.ExpensePage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddExpense implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(ExpensePage.ADD_EXPENSE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(ExpensePage.ADD_EXPENSE_BUTTON),
            WaitUntil.the(ExpensePage.DESCRIPTION_FIELD, isVisible()).forNoMoreThan(20).seconds(),
            Enter.theValue("Hotel").into(ExpensePage.DESCRIPTION_FIELD),
            WaitUntil.the(ExpensePage.AMOUNT_FIELD, isVisible()).forNoMoreThan(20).seconds(),
            Enter.theValue("100").into(ExpensePage.AMOUNT_FIELD),
            WaitUntil.the(ExpensePage.ADD_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(ExpensePage.ADD_BUTTON)
        );
    }

    /**
     * Método de fábrica para crear una instancia de la tarea AddExpense.
     * <p>
     * Utiliza el método instrumented de Serenity para inicializar la tarea correctamente.
     * @return Nueva instancia de AddExpense lista para ser utilizada en un flujo de Screenplay.
     */
    public static AddExpense addExpense() {
        return Tasks.instrumented(AddExpense.class);
    }
}
