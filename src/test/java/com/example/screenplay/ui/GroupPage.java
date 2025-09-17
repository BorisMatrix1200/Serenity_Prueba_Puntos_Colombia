package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Página de Grupos de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de grupos,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class GroupPage {

    /**
     * Botón para acceder a la sección de tricounts y crear un grupo.
     */
    public static final Target TROCOUNTS_BUTTON = Target.the("Botón para crear grupo")
            .located(By.xpath("//*[@resource-id='com.tribab.tricount.android:id/TextSecondary' and @text='tricounts']"));

    /**
     * Botón para iniciar la creación de un nuevo grupo.
     */
    public static final Target CREATE_GROUP_BUTTON = Target.the("Botón para crear grupo")
        .located(By.xpath("//*[@content-desc='Add a tricount']"));

    /**
     * Botón para comenzar un nuevo tricount.
     */
    public static final Target START_NEW_TRICOUNT_BUTTON = Target.the("Botón para crear grupo")
            .located(By.xpath("//*[@class='android.view.View' and ./*[@text='Start a new tricount']]"));


    /**
     * Campo para ingresar el nombre del grupo.
     */
    public static final Target GROUP_NAME_FIELD = Target.the("Campo nombre del grupo")
        .located(By.xpath("//*[@class='android.widget.EditText' and ./*[@contentDescription='enter tricount title']]"));

    /**
     * Campo para ingresar los participantes del grupo.
     */
    public static final Target PARTICIPANTS_FIELD = Target.the("Campo participantes")
        .located(By.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Add Participant']]"));

    /**
     * Botón para agregar un participante al grupo.
     */
    public static final Target BUTTON_ADD_APRTICIPANT = Target.the("Agregar participantes")
            .located(By.xpath("//android.widget.Button[@text='Add Participant']"));

    /**
     * Botón para confirmar la creación del grupo.
     */
    public static final Target CONFIRM_CREATE_GROUP_BUTTON = Target.the("Botón confirmar creación de grupo")
            .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Save']]"));

    /**
     * Botón para omitir la invitación de participantes y continuar más tarde.
     */
    public static final Target BUTTON_INVITE_LATER = Target.the("Boton invitar despues")
            .located(By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Invite Later']]"));

}
