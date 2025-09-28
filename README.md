<div align="center">

# 💼 Sistema de Gestión de Empleados

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema de nóminas para PYMEs desarrollado en Java aplicando POO**

</div>

---

## 📖 Descripción
Trabajo práctico de la materia **Programación Orientada a Objetos**.  
Sistema que modela una PYME con distintos tipos de empleados, aplicando **herencia, polimorfismo y clases abstractas** en Java.

---

## ✨ Características

- **Gestión completa** de empleados (altas, listados, cálculos)
- **4 tipos de empleados** con diferentes formas de cálculo
- **Cálculo automático** de haberes según categoría
- **Múltiples ordenamientos** (por legajo, apellido/nombre)
- **Interfaz de consola** clara y organizada

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
