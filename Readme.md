# Ciclos y Clase Paciente en Java

Este repositorio contiene ejemplos de implementación de los ciclos `for`, `while` y `do-while` en Java, así como la definición de la clase `Paciente`.

## Ciclos

### Ciclo `for`

El ciclo `for` en Java se utiliza para iterar sobre un conjunto de valores conocidos o para ejecutar un bloque de código un número específico de veces. Su sintaxis es la siguiente:

```java
for (inicialización; condición; actualización) {
    // Bloque de código a repetir
}
```

### Ciclo `while`

El ciclo `while` en Java se utiliza para ejecutar un bloque de código mientras se cumpla una condición especificada. Su sintaxis es la siguiente:

```java
while (condición) {
    // Bloque de código a repetir
}
```

### Ciclo `do-while`

El ciclo `do-while` en Java es similar al ciclo `while`, pero garantiza que el bloque de código se ejecute al menos una vez antes de verificar la condición. Su sintaxis es la siguiente:

```java
do {
    // Bloque de código a repetir
} while (condición);
```

## Clase Paciente

La clase `Paciente` representa a un paciente con atributos como nombre, edad, género y enfermedad. Proporciona constructores para inicializar un paciente con valores predeterminados o personalizados, así como métodos para acceder y modificar los atributos y mostrar la información del paciente.

### Atributos

- `nombre`: El nombre del paciente.
- `edad`: La edad del paciente.
- `genero`: El género del paciente.
- `enfermedad`: La enfermedad del paciente.

### Constructores

- `Paciente()`: Constructor sin parámetros que inicializa un paciente con valores predeterminados.
- `Paciente(String nombre, int edad, String genero, String enfermedad)`: Constructor con parámetros para inicializar un paciente con valores personalizados.

### Métodos

- Métodos getters y setters para acceder y modificar los atributos del paciente.
- `mostrarInformacion()`: Método para mostrar la información del paciente.

### Ejemplo de uso

```java
// Crear un paciente usando el constructor sin parámetros
Paciente paciente1 = new Paciente();
paciente1.mostrarInformacion();

// Crear un paciente usando el constructor con parámetros
Paciente paciente2 = new Paciente("María López", 45, "Femenino", "Diabetes");
paciente2.mostrarInformacion();
```

## Contribución

Siéntete libre de contribuir a este proyecto mediante la creación de solicitudes de extracción (PR) con mejoras o correcciones.
```

Este contenido Markdown proporciona una estructura clara y fácil de leer para el archivo README. Puedes guardarlo en un archivo con extensión `.md` para que sea reconocido como un archivo Markdown.