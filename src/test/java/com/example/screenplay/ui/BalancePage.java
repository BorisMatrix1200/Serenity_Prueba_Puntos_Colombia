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
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target VIEW_BALANCES_BUTTON = Target.the("Botón para ver saldos")
        .located(By.id("com.tribab.tricount.android:id/view_balances_button")); // Cambia por el resource-id real si existe

    /**
     * Botón para liquidar una deuda.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target SETTLE_DEBT_BUTTON = Target.the("Botón para liquidar deuda")
        .located(By.id("com.tribab.tricount.android:id/settle_debt_button")); // Cambia por el resource-id real si existe

    /**
     * Botón para pagar la deuda.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target PAYER_FIELD = Target.the("Boton para pagar la deuda")
        .located(By.id("com.tribab.tricount.android:id/payer_field")); // Cambia por el resource-id real si existe

    /**
     * Botón para marcar la deuda como pagada.
     * Ya usa resource-id, es robusto.
     */
    public static final Target MARK_AS_PAID_BUTTON = Target.the("Boton marcar como pagado")
        .located(By.id("com.tribab.tricount.android:id/btPrimary"));

    /**
     * Botón para regresar a la pantalla anterior.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target GO_BACK_BUTTON = Target.the("Botón ir atras")
            .located(By.id("com.tribab.tricount.android:id/go_back_button")); // Cambia por el resource-id real si existe

    /**
     * Mensaje que indica que el pago fue exitoso (campo receptor).
     * SUGERENCIA: Si el campo tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target RECEIVER_FIELD = Target.the("Mensaje de pago exitoso")
            .located(By.xpath("//android.widget.TextView[@text='The tricount is settled']")); // Mejorar si es posible
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
    /**
     * Mensaje de resumen de saldos indicando que todo está bien.
        .located(By.id("com.tribab.tricount.android:id/balance_summary")); // Cambia por el resource-id real si existe
     */
    public static final Target BALANCE_SUMMARY = Target.the("Resumen de saldos all good")
        .located(By.xpath("//android.widget.TextView[@text='All good!']")); // Mejorar si es posible
}
