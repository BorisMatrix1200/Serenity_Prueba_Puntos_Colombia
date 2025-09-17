package com.example.screenplay.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Interacción personalizada para esperar hasta que un elemento web sea visible.
 * Utiliza Serenity BDD para realizar la espera sobre el elemento especificado.
 */
public class WaitUntilElementIsVisible implements Interaction {
    /**
     * Elemento objetivo sobre el cual se realizará la espera.
     */
    private final Target target;
    /**
     * Tiempo máximo de espera en segundos.
     */
    private final int timeoutSeconds;

    /**
     * Constructor de la interacción.
     * @param target Elemento objetivo a esperar.
     * @param timeoutSeconds Tiempo máximo de espera en segundos.
     */
    public WaitUntilElementIsVisible(Target target, int timeoutSeconds) {
        this.target = target;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Crea una instancia de la interacción con un tiempo de espera personalizado.
     * @param target Elemento objetivo a esperar.
     * @param timeoutSeconds Tiempo máximo de espera en segundos.
     * @return Instancia de WaitUntilElementIsVisible.
     */
    public static WaitUntilElementIsVisible forTarget(Target target, int timeoutSeconds) {
        return new WaitUntilElementIsVisible(target, timeoutSeconds);
    }

    /**
     * Crea una instancia de la interacción con un tiempo de espera por defecto (20 segundos).
     * @param target Elemento objetivo a esperar.
     * @return Instancia de WaitUntilElementIsVisible.
     */
    public static WaitUntilElementIsVisible forTarget(Target target) {
        return new WaitUntilElementIsVisible(target, 20);
    }

    /**
     * Ejecuta la interacción, haciendo que el actor espere hasta que el elemento sea visible.
     * @param actor Actor que realiza la acción.
     * @param <T> Tipo del actor.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(target, isVisible()).forNoMoreThan(timeoutSeconds).seconds()
        );
    }
}
