<div align="center">

# 💼 Sistema de Gestión de Empleados

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema de nóminas para PYMEs con diferentes tipos de empleados y cálculos de sueldo específicos**

</div>

---

## 📖 Descripción
Sistema de gestión de nóminas desarrollado en Java que implementa **4 tipos de empleados** con diferentes formas de cálculo de sueldo. Aplica principios de **POO** como herencia, polimorfismo y clases abstractas para modelar una estructura empresarial real.

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

## 🚀 Comenzar

### Prerrequisitos
- Java 17 o superior
- IDE (IntelliJ IDEA recomendado)

### Ejecución
```bash
# Compilar
javac -d bin src/*.java

# Ejecutar
java -cp bin Main
