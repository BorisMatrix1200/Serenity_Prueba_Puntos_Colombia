package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Página de Balance de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de balances,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class BalancePage {
    /**
     * Botón para ver los saldos del grupo.
     */
    public static final Target VIEW_BALANCES_BUTTON = Target.the("Botón para ver saldos")
        .located(By.xpath("//*[@text='Balances']/parent::*/android.widget.Button"));

    /**
     * Botón para liquidar una deuda.
     */
    public static final Target SETTLE_DEBT_BUTTON = Target.the("Botón para liquidar deuda")
        .located(By.xpath("//android.view.View[./*[@id='TextPrimary'] y ./*[@id='TextSecondary']]"));

    /**
     * Botón para pagar la deuda.
     */
    public static final Target PAYER_FIELD = Target.the("Boton para pagar la deuda")
        .located(By.xpath("//*[@text='Mark as Paid']/parent::*/android.widget.Button"));

    /**
     * Botón para marcar la deuda como pagada.
     */
    public static final Target MARK_AS_PAID_BUTTON = Target.the("Boton marcar como pagado")
        .located(By.xpath("//*[@resource-id='com.tribab.tricount.android:id/btPrimary']"));

    /**
     * Botón para regresar a la pantalla anterior.
     */
    public static final Target GO_BACK_BUTTON = Target.the("Botón ir atras")
            .located(By.xpath("//*[@content-desc='go back']"));

    /**
     * Mensaje que indica que el pago fue exitoso (campo receptor).
     */
    public static final Target RECEIVER_FIELD = Target.the("Mensaje de pago exitoso")
            .located(By.xpath("//android.widget.TextView[@text='The tricount is settled']"));

    /**
     * Mensaje de resumen de saldos indicando que todo está bien.
     */
    public static final Target BALANCE_SUMMARY = Target.the("Resumen de saldos all good")
        .located(By.xpath("//android.widget.TextView[@text='All good!']"));
}
