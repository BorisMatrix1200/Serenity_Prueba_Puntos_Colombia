package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.example.screenplay.ui.BalancePage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ViewBalances implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(BalancePage.VIEW_BALANCES_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(BalancePage.VIEW_BALANCES_BUTTON)
        );
    }

    /**
     * Método de fábrica para crear una instancia de la tarea ViewBalances.
     * <p>
     * Utiliza el método instrumented de Serenity para inicializar la tarea correctamente.
     * @return Nueva instancia de ViewBalances lista para ser utilizada en un flujo de Screenplay.
     */
    public static ViewBalances viewBalances() {
        return Tasks.instrumented(ViewBalances.class);
    }
}
