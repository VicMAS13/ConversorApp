\*\*# 💱 ConversorApp\*\*



\*\*ConversorApp\*\* es una aplicación de consola desarrollada en Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real a través de la API \[ExchangeRate-API](https://www.exchangerate-api.com/).



---



\## 🧰 Tecnologías utilizadas



\- \*\*Java 17\*\*

\- \*\*Gson 2.13.2\*\* (biblioteca de Google para manejo de JSON)

\- \*\*ExchangeRate-API\*\* (API externa para tasas de cambio)



---



\## 📁 Estructura del proyecto

ConversorApp/

├── .idea/                    # Configuración de IntelliJ IDEA

├── lib/

│   └── gson-2.13.2.jar       # Biblioteca Gson

├── src/

│   └── com/

│       └── conversor/

│           ├── ConversorApp.java   # Clase principal

│           ├── Menu.java           # Interfaz de usuario en consola

│           └── ApiClient.java      # Conexión con la API

├── .gitignore

└── README.md                   # Este archivo





---



\## 🚀 Cómo ejecutar el proyecto



\### Requisitos previos



\- Tener instalado \*\*Java 17 o superior\*\*

\- Tener \*\*IntelliJ IDEA\*\* o cualquier IDE compatible con Java

\- (Opcional) \*\*Git\*\* para clonar el repositorio




---

## 🚀 Cómo ejecutar el proyecto

### Requisitos
- Java 17 o superior
- IntelliJ IDEA (o cualquier IDE con soporte Java)
- Git (opcional)

### Pasos

1. Clona o descarga el proyecto:
   ```bash
   git clone https://github.com/vicMAs13/ConversorApp.git
   cd ConversorApp

2. Abre el proyecto en IntelliJ IDEA

3. Añade Gson al classpath:
   Click derecho en lib/gson-2.13.2.jar → Add as Library... → OK

4. Ejecuta:
   Ve a ConversorApp.java → Click derecho → Run 'ConversorApp.main()'
   O desde terminal (Bash):
   javac -cp lib/gson-2.13.2.jar -d out src/com/conversor/*.java
   java -cp lib/gson-2.13.2.jar;out com.conversor.ConversorApp

\*\*🧪 Funcionalidades\*\*
 	
	Conversión disponible entre:
	1. Dólar → Peso argentino
	2. Peso argentino → Dólar
	3. Dólar → Real brasileño
	4. Real brasileño → Dólar
	5. Dólar → Peso colombiano
	6. Peso colombiano → Dólar

----------------------------------------------------------------------

🔐 API Key
Incluida en ApiClient.java para uso educativo.

----------------------------------------------------------------------

🧑‍💻 Autor
Proyecto educativo – Alura Latam - Victor Alviar

----------------------------------------------------------------------
