package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;

 /**
 * Página de Gastos de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de gastos,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class ExpensePage {

    /**
     * Botón para agregar un nuevo gasto.
     * Se usa accessibilityId (content-desc) para mayor robustez.
     */
    public static final Target ADD_EXPENSE_BUTTON = Target.the("Botón confirmar creación de grupo")
            .located(MobileBy.AccessibilityId("Add Expense"));

    /**
     * Campo para ingresar la descripción del gasto.
     * Se usa accessibilityId (content-desc) para mayor robustez.
     */
    public static final Target DESCRIPTION_FIELD = Target.the("Campo descripción del gasto")
            .located(MobileBy.AccessibilityId("enter expense title"));

    /**
     * Campo para ingresar el monto del gasto.
     * SUGERENCIA: Si el campo tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target AMOUNT_FIELD = Target.the("Campo monto del gasto")
        .located(By.xpath("//*[@class='android.widget.EditText' and ./*[@contentDescription='Amount']]")); // Mejorar si es posible

    /**
     * Botón para confirmar y agregar el gasto.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target ADD_BUTTON = Target.the("Boton Agregar gasto")
        .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Add']]")); // Mejorar si es posible

    /**
     * Etiqueta que muestra el nombre del viaje a Cartagena.
     * SUGERENCIA: Si la etiqueta tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target LBL_VIAJE = Target.the("Label viaje a cartagena")
            .located(By.xpath("//*[@text='Viaje Cartagena']")); // Mejorar si es posible

    /**
     * Etiqueta que muestra el nombre del gasto Hotel.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target LBL_HOTEL = Target.the("Label Hotel")
            .located(By.id("com.tribab.tricount.android:id/hotel_label")); // Cambia por el resource-id real si existe

}
