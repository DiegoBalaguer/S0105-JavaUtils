# S01.05 - Java Utils

---

## 📋 Description

This project contains a collection of Java utility exercises organized by levels. All exercises must be executed from the **command line**, not only from the IDE.

Each exercise includes a `readme.txt` file with the necessary commands to **compile** Java source files (`.java`) into bytecode (`.class`) and to **run** the programs.

---

# 🎯 Objectives

- Understand how **Java annotations** work.
- Work with Java file system APIs, serialization, configuration files, and encryption.
- Learn to compile and execute Java programs from the terminal.
- Improve understanding of recursive file operations and file I/O.
- Gain experience with Java Properties files and optional external libraries.
- Apply encryption techniques to secure file data.

---

## 🔹 Level 1

### 📘 Exercise 1 - Alphabetical Directory Listing

Create a Java class that receives a directory path as a parameter and prints the directory contents in **alphabetical order**.

---

### 📘 Exercise 2 - Recursive Directory Tree Listing

Enhance the previous class to list an entire **directory tree recursively**, showing all levels, in **alphabetical order**. Display:
- Whether each item is a **directory (D)** or **file (F)**
- Its **last modified date**

---

### 📘 Exercise 3 - Save Output to TXT File

Modify the previous exercise so that the result is not shown in the console but instead **saved to a `.txt` file**.

---

### 📘 Exercise 4 - Read and Display TXT File

Add functionality to **read any `.txt` file** and **display its contents in the console**.

---

### 📘 Exercise 5 - Object Serialization

Implement functionality to **serialize a Java object** into a `.ser` file, and then **deserialize** it from the file.

---

## 🔹 Level 2

### 📘 Exercise 1 - Configuration File

Take Exercise 3 from Level 1 and **parameterize** all methods using a configuration file.

You may use a **Java Properties file** or the **Apache Commons Configuration** library.

The following values must be configured:

- The **directory to read**
- The **name and path** of the resulting `.txt` file

---

## 🔹 Level 3

### 📘 Exercise 1 - Encrypt and Decrypt Output Files

Create a utility that **encrypts** and **decrypts** the output files from previous exercises using the **AES algorithm**, in either:

- **ECB mode**
- **CBC mode**

Use **PKCS5Padding** as the padding method.

You can use either:
- `javax.crypto` (standard Java API)
- `org.apache.commons.crypto` (Apache library)

---

# 🛠️ Technologies Used

- Java 21
- File I/O
- Serialization
- Java Annotations
- AES Encryption (javax.crypto / Apache Commons Crypto)
- Java Properties

---

## ⚙️ Installation & Execution

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java and Maven/Gradle support
- Git

---

# 🛠️ Installation

1. Ensure **JDK 21** or higher is installed.
2. Clone this repository:
   ```sh
   git clone <👉 https://github.com/DiegoBalaguer/S0105-JavaUtils.git>
   ```
3. Open the project in your preferred IDE.
4. Run the test classes using the IDE or command line.

---

# ▶️ Execution

1. To run programs from the command line, (from the root of the project):
   ```sh
   S0105-JavaUtils-runner.bat
   ```

2. To run in your IDE:
   - Navigate to the main classes
   - Right-click and select **Run**

---

# 🌐 Deployment

This project is intended for local development and testing purposes. No deployment is necessary.

---

## 📦 Repository

You can find the source code on GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0105-JavaUtils.git

---

## ✅ Author Notes

These exercises will help you understand and practice working with Java Collections.
Fork it, test it, and extend it as much as you want!

Happy coding! 🚀
