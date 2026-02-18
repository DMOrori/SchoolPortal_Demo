# SchoolPortal - Integrated Student Management System

SchoolPortal is a professional Android application designed to streamline school administrative tasks. It features a branded splash screen, secure user authentication, and specialized modules for the Dean's Office and Finance Department.

---

## 🚀 Features

* **Splash Screen:** High-end branded entry point with auto-transition.
* **Authentication Hub:** * **Login:** Secure entrance to the portal.
    * **Registration:** Account creation with real-time password matching validation.
* **Department Modules:**
    * **Dean's Office:** Interface for student reporting and ID tracking.
    * **Finance Department:** Numeric-validated payment processing for school fees.
* **Dashboard:** Material Design hub for seamless navigation.
* **Session Management:** "Clear-Task" logout logic to ensure user security.

---

## 🛠️ Step-by-Step Setup Guide

Follow these steps to get the project running on your local machine.

### 1. Prerequisites
* Install **Android Studio** (Ladybug or newer recommended).
* **Java Development Kit (JDK)** (version 17 or higher).
* An Android Device or Emulator running **API 24 (Android 7.0)** or higher.

### 2. Opening the Project
1.  **Download/Clone** this repository to your computer.
2.  Launch **Android Studio**.
3.  Click **File > Open** and navigate to the `SchoolPortal` folder.
4.  Wait for the **Gradle Sync** to finish. (Check the "Build" tab at the bottom; it should show a green checkmark).

### 3. Setting Up the App Icon
To ensure the app has a real icon on the phone:
1.  Right-click the `app` folder -> **New > Image Asset**.
2.  Select your logo image.
3.  Click **Finish**.

### 4. Running the App
1.  Connect your physical Android phone via USB (with **USB Debugging** enabled) or start an **Emulator** via the Device Manager.
2.  In the top toolbar, select your device from the dropdown menu.
3.  Click the **Green Play Button (Run 'app')** or press `Shift + F10`.
4.  The app will compile, install, and launch the **Splash Screen** automatically.

---

## 📂 Project Architecture



* **`SplashActivity`**: The initial branding sequence.
* **`LoginActivity`**: Validates user credentials.
* **`RegisterActivity`**: Handles new user sign-ups and password verification.
* **`MainActivity`**: The central dashboard using Intent-based routing.
* **`DeanActivity` & `FinanceActivity`**: Department-specific logic and UI.
* **`AndroidManifest.xml`**: Defines activity hierarchy and the entry point (Launcher).

---

## 🎨 UI/UX Design
The app utilizes a professional color palette defined in `colors.xml`:
* **Primary Blue (`#1A5276`)**: Used for branding and headers.
* **Accent Green (`#1D8348`)**: Used for financial success actions.
* **Error Red (`#C0392B`)**: Used for logout and validation alerts.

---

## 📄 License
This project is developed for educational purposes as part of a School Portal development assignment.