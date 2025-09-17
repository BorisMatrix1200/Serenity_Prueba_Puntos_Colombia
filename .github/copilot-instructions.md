# Instrucciones para Selectores Estables y Robustos en PageObjects

Estas instrucciones están diseñadas para asegurar que los selectores utilizados en los PageObjects de automatización móvil (Serenity BDD + Appium) sean estables, robustos y fáciles de mantener.

## 1. Prioriza atributos únicos y estables
- **Siempre** utiliza `resource-id` o `content-desc` cuando estén disponibles.
- Si no existen, solicita al equipo de desarrollo que los agregue para los elementos críticos.

## 2. Evita selectores por texto visible
- No uses selectores basados en `@text` o `contains(@text, ...)` salvo que el texto sea fijo, no esté sujeto a traducción/localización y no cambie frecuentemente.

## 3. No dependas de la estructura del DOM
- Evita selectores que dependan de relaciones de nodos (por ejemplo, `preceding-sibling`, `following-sibling`, rutas XPath largas o jerárquicas), ya que la estructura puede cambiar fácilmente.

## 4. Prefiere selectores cortos y directos
- Usa selectores simples y directos, por ejemplo:
  - Correcto: `By.id("com.ejemplo:id/boton_guardar")`
  - Incorrecto: `By.xpath("//android.widget.Button[@text='Guardar']")`

## 5. Documenta el propósito de cada selector
- Añade comentarios claros sobre la función de cada Target para facilitar el mantenimiento.

## 6. Valida y actualiza los selectores periódicamente
- Revisa y actualiza los selectores tras cada cambio importante en la UI de la aplicación.

## 7. Ejemplo de buenas prácticas
```java
public static final Target BOTON_GUARDAR = Target.the("Botón para guardar cambios")
    .located(By.id("com.ejemplo:id/boton_guardar"));
```

---

**Cumplir con estas instrucciones garantiza mayor estabilidad y menor mantenimiento en las pruebas automatizadas.**

