package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

 /**
 * Página de Gastos de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de gastos,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class ExpensePage {

    /**
     * Botón para agregar un nuevo gasto.
     */
    public static final Target ADD_EXPENSE_BUTTON = Target.the("Botón confirmar creación de grupo")
            .located(By.xpath("//*[@content-desc='Add Expense']"));

    /**
     * Campo para ingresar la descripción del gasto.
     */
    public static final Target DESCRIPTION_FIELD = Target.the("Campo descripción del gasto")
            .located(By.xpath("//*[@content-desc='enter expense title']"));

    /**
     * Campo para ingresar el monto del gasto.
     */
    public static final Target AMOUNT_FIELD = Target.the("Campo monto del gasto")
        .located(By.xpath("//*[@class='android.widget.EditText' and ./*[@contentDescription='Amount']]"));

    /**
     * Botón para confirmar y agregar el gasto.
     */
    public static final Target ADD_BUTTON = Target.the("Boton Agregar gasto")
        .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Add']]"));

    /**
     * Etiqueta que muestra el nombre del viaje a Cartagena.
     */
    public static final Target LBL_VIAJE = Target.the("Label viaje a cartagena")
            .located(By.xpath("//*[@text='Viaje Cartagena']"));

    /**
     * Etiqueta que muestra el nombre del gasto Hotel.
     */
    public static final Target LBL_HOTEL = Target.the("Label Hotel")
            .located(By.xpath("//*[@id='TextPrimary']"));

}
