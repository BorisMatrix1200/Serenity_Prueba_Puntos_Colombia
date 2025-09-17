package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;

/**
 * Página de Grupos de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de grupos,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class GroupPage {

    /**
     * Botón para acceder a la sección de tricounts y crear un grupo.
     * Se prioriza resource-id para mayor robustez.
     */
    public static final Target TROCOUNTS_BUTTON = Target.the("Botón para crear grupo")
            .located(By.id("com.tribab.tricount.android:id/TextSecondary"));

    /**
     * Botón para iniciar la creación de un nuevo grupo.
     * Se usa accessibilityId (content-desc) para mayor robustez.
     */
    public static final Target CREATE_GROUP_BUTTON = Target.the("Botón para crear grupo")
        .located(MobileBy.AccessibilityId("Add a tricount"));

    /**
     * Botón para comenzar un nuevo tricount.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target START_NEW_TRICOUNT_BUTTON = Target.the("Botón para crear grupo")
            .located(By.id("com.tribab.tricount.android:id/start_new_tricount_button")); // Cambia por el resource-id real si existe

    /**
     * Campo para ingresar el nombre del grupo.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target GROUP_NAME_FIELD = Target.the("Campo nombre del grupo")
        .located(By.id("com.tribab.tricount.android:id/group_name_field")); // Cambia por el resource-id real si existe

    /**
     * Campo para ingresar los participantes del grupo.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Selector temporal, actualizar cuando sea posible.
     */
    public static final Target PARTICIPANTS_FIELD = Target.the("Campo participantes")
        .located(By.id("com.tribab.tricount.android:id/participants_field")); // Cambia por el resource-id real si existe

    /**
     * Botón para agregar un participante al grupo.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target BUTTON_ADD_APRTICIPANT = Target.the("Agregar participantes")
            .located(By.xpath("//android.widget.Button[@text='Add Participant']")); // Mejorar si es posible

    /**
     * Botón para confirmar la creación del grupo.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target CONFIRM_CREATE_GROUP_BUTTON = Target.the("Botón confirmar creación de grupo")
            .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Save']]")); // Mejorar si es posible

    /**
     * Botón para omitir la invitación de participantes y continuar más tarde.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target BUTTON_INVITE_LATER = Target.the("Boton invitar despues")
            .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Invite Later']]")); // Mejorar si es posible

}
