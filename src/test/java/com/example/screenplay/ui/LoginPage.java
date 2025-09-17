package com.example.screenplay.ui;

import io.appium.java_client.MobileBy;
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
     * Se utiliza MobileBy.AccessibilityId para mayor robustez, siguiendo las buenas prácticas.
     * Si existe resource-id, se recomienda usarlo en vez de content-desc.
     */
    public static final Target PROFILE_BUTTON = Target.the("Botón de perfil")
            .located(MobileBy.AccessibilityId("Profile")); // Cambia "Profile" por el content-desc real si es necesario

    /**
     * Botón para iniciar sesión con Google.
     * Se recomienda usar resource-id o content-desc único. Si no existe, solicitar al equipo de desarrollo.
     * Mientras tanto, se deja el selector actual pero se debe actualizar cuando sea posible.
     */
    public static final Target GOOGLE_LOGIN_BUTTON = Target.the("Botón de login con Google")
        .located(By.id("com.tribab.tricount.android:id/google_login_button")); // Cambia por el resource-id real si existe

    /**
     * Botón para agregar otra cuenta de Google.
     * Ya usa resource-id, es robusto.
     */
    public static final Target GOOGLE_ADD_ANOTHER_ACCOUNT_BUTTON = Target.the("Botón de agregar otra cuenta de Google")
            .located(By.id("com.google.android.gms:id/add_account_chip_title"));

    /**
     * Campo para ingresar el correo de Google.
     * Ya usa resource-id, es robusto.
     */
    public static final Target GOOGLE_EMAIL_FIELD = Target.the("Campo de correo de Google")
        .located(By.id("identifierId"));

    /**
     * Botón para continuar (Next) en el flujo de Google.
     * SUGERENCIA: Si el botón tiene resource-id, usarlo aquí para mayor robustez.
     */
    public static final Target GOOGLE_CONTINUE_BUTTON = Target.the("Botón Next en Google")
        .located(By.xpath("//android.widget.Button[@text='Next']")); // Mejorar si es posible

    /**
     * Botón para regresar en Android.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target ANDROID_BACK_BUTTON = Target.the("Botón atras de android")
            .located(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@id='back']]")); // Mejorar si es posible

    /**
     * Botón para seleccionar la cuenta de Google correcta.
     * SUGERENCIA: Si el botón tiene resource-id o content-desc, usarlo aquí para mayor robustez.
     */
    public static final Target GOOGLE_EMAILCORRECT_BUTTON = Target.the("Cuenta de Google correcta")
            .located(By.xpath("//*[contains(@text,'Boris Andres')]")); // Mejorar si es posible

}
