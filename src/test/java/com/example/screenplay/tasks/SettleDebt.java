package com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.example.screenplay.ui.BalancePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * Tarea personalizada para liquidar una deuda en la aplicación Tricount.
 * <p>
 * Esta clase implementa el patrón Screenplay de Serenity BDD para automatizar el flujo de liquidación de una deuda,
 * incluyendo la navegación por los botones y campos necesarios en la pantalla de balances.
 */
public class SettleDebt implements Task {

    /**
     * Ejecuta la tarea de liquidar una deuda.
     * Navega por los botones y campos requeridos para marcar la deuda como pagada y regresar a la pantalla anterior.
     * @param actor El actor que realiza la tarea.
     * @param <T> Tipo del actor.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(BalancePage.SETTLE_DEBT_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(BalancePage.SETTLE_DEBT_BUTTON),
            WaitUntil.the(BalancePage.PAYER_FIELD, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(BalancePage.PAYER_FIELD),
            WaitUntil.the(BalancePage.MARK_AS_PAID_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(BalancePage.MARK_AS_PAID_BUTTON),
            WaitUntil.the(BalancePage.GO_BACK_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(BalancePage.GO_BACK_BUTTON)
        );
    }

    /**
     * Método de fábrica para crear una instancia de la tarea SettleDebt.
     * <p>
     * Utiliza el método instrumented de Serenity para inicializar la tarea correctamente.
     * @return Nueva instancia de SettleDebt lista para ser utilizada en un flujo de Screenplay.
     */
    public static SettleDebt settleDebt() {
        return Tasks.instrumented(SettleDebt.class);
    }
}
