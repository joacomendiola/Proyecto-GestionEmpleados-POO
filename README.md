<div align="center">

# 💼 Sistema de Gestión de Empleados

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema de nóminas para PYMEs con diferentes tipos de empleados y cálculos de sueldo específicos**

</div>

---

## 📖 Descripción
Sistema de gestión de nóminas desarrollado en Java que implementa **4 tipos de empleados** con diferentes formas de cálculo de sueldo.  
Aplica principios de **POO** como herencia, polimorfismo y clases abstractas para modelar una estructura empresarial real.

**Tipos de empleados implementados:**
- 👔 **Jefe** - Sueldo fijo mensual  
- 💰 **Comisión** - Sueldo base + porcentaje sobre ventas  
- ⏱️ **Por Horas** - Pago por horas normales y extra  
- 🛠️ **Subordinado** - Pago por artículo producido  

---

## ✨ Características

- **Gestión completa** de empleados (altas, listados, cálculos)  
- **4 tipos de empleados** con fórmulas de cálculo específicas  
- **Cálculo automático** de haberes según categoría  
- **Múltiples ordenamientos** (por legajo, apellido/nombre)  
- **Interfaz de consola** clara y organizada  
- **Sistema de nóminas** con totales generales  

---

## 🏗️ Arquitectura POO

### Principios implementados:
- **🔷 Herencia**: Clase base `Empleado` extendida por tipos específicos  
- **🔄 Polimorfismo**: Método `calcularSueldo()` con diferentes implementaciones  
- **📦 Encapsulamiento**: Atributos privados con acceso controlado  
- **⚡ Clases Abstractas**: `Empleado` como clase abstracta base  

---

## 📊 Tipos de Empleados

| Tipo | Descripción | Cálculo de Sueldo |
|------|-------------|-------------------|
| **👔 Jefe** | Personal de dirección | Sueldo fijo mensual |
| **💰 Comisión** | Vendedores con comisiones | Sueldo base + (ventas × %comisión) |
| **⏱️ Por Hora** | Personal contratado por horas | Horas normales × tarifa + horas extra × tarifa extra |
| **🛠️ Subordinado** | Personal de producción | Artículos producidos × pago por artículo |

---

## 🧪 Uso del Sistema

El sistema incluye datos de ejemplo que se cargan automáticamente:

1. **Inicialización** → Carga empleados de prueba  
2. **Cálculo** → Procesa nómina completa  
3. **Reportes** → Muestra resultados ordenados  
4. **Gestión** → Permite administrar empleados  

### Ejemplo de salida
```text
=== NÓMINA DE EMPLEADOS ===
Legajo: 001 | Jefe: María González      | Sueldo: $150,000.00
Legajo: 002 | Comisión: Carlos López    | Sueldo: $89,500.00
Legajo: 003 | Por Hora: Juan Pérez      | Sueldo: $72,000.00
Legajo: 004 | Subordinado: Ana Ramírez  | Sueldo: $48,300.00
----------------------------------------
TOTAL NÓMINA: $359,800.00
```

---

## 📂 Estructura del Código

```text
src/
├── app/
│   └── Main.java
│
├── model/
│   ├── Persona.java
│   ├── Empleado.java
│   ├── EmpleadoJefe.java
│   ├── EmpleadoComision.java
│   ├── EmpleadoPorHora.java
│   └── EmpleadoSubordinado.java
│
└── service/
    └── Pyme.java
```

---

## 💻 Ejemplo de Código

```java
// Crear diferentes tipos de empleados usando las clases de tu proyecto
Empleado jefe = new EmpleadoJefe("Ana", "García", "001", 200000);
Empleado vendedor = new EmpleadoComision("Luis", "Martínez", "002", 50000, 100000, 0.10);
Empleado obrero = new EmpleadoSubordinado("Pedro", "Sosa", "003", 200, 300);
Empleado temporal = new EmpleadoPorHora("Laura", "Fernández", "004", 160, 200, 20);

// Cálculo polimórfico
double sueldoJefe = jefe.calcularSueldo();             // 200000
double sueldoVendedor = vendedor.calcularSueldo();     // 50000 + (100000 * 0.10) = 60000
double sueldoObrero = obrero.calcularSueldo();         // 200 * 300 = 60000
double sueldoTemporal = temporal.calcularSueldo();     // (160 * 200) + (20 * tarifaExtra)
```

## 👨‍💻 Autor
Desarrollado por **Joaquín Mendiola**  
🌐 GitHub: [joacomendiola](https://github.com/joacomendiola)  

