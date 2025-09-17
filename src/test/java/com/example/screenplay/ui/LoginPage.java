package com.example.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Página de Login de la aplicación Tricount.
 * <p>
 * Esta clase contiene los localizadores (Target) de los elementos de la pantalla de login,
 * utilizados para la automatización de pruebas con Serenity BDD y Screenplay.
 */
public class LoginPage {

    /**
     * Botón para acceder al perfil del usuario.
     */
    public static final Target PROFILE_BUTTON = Target.the("Botón de perfil")
            .located(By.xpath("//*[@contentDescription='Profile']"));

    /**
     * Botón para iniciar sesión con Google.
     */
    public static final Target GOOGLE_LOGIN_BUTTON = Target.the("Botón de login con Google")
        .located(By.xpath("(//*[@class='android.widget.ScrollView']/*[@class='android.widget.Button'])[1]"));

    /**
     * Botón para agregar otra cuenta de Google.
     */
    public static final Target GOOGLE_ADD_ANOTHER_ACCOUNT_BUTTON = Target.the("Botón de agregar otra cuenta de Google")
            .located(By.xpath("//*[@resource-id='com.google.android.gms:id/add_account_chip_title']"));

    /**
     * Campo para ingresar el correo de Google.
     */
    public static final Target GOOGLE_EMAIL_FIELD = Target.the("Campo de correo de Google")
        .located(By.xpath("//*[@resource-id='identifierId']"));

    /**
     * Botón para continuar (Next) en el flujo de Google.
     */
    public static final Target GOOGLE_CONTINUE_BUTTON = Target.the("Botón Next en Google")
        .located(By.xpath("//android.widget.Button[@text='Next']"));

    /**
     * Botón para regresar en Android.
     */
    public static final Target ANDROID_BACK_BUTTON = Target.the("Botón atras de android")
            .located(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@id='back']]"));

    /**
     * Botón para seleccionar la cuenta de Google correcta.
     */
    public static final Target GOOGLE_EMAILCORRECT_BUTTON = Target.the("Cuenta de Google correcta")
            .located(By.xpath("//*[contains(@text,'Boris Andres')]"));

}
