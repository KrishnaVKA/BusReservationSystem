# 🚌 Bus Reservation System (Java)

A simple **console-based Bus Reservation System** developed in Java.
This project demonstrates core concepts of **Object-Oriented Programming (OOP)** such as classes, objects, encapsulation, and basic data handling using collections.

---

## 📌 Features

* View available buses
* Book tickets for a selected bus
* Check seat availability based on date
* Prevent overbooking
* Simple and interactive console interface

---

## 🛠️ Technologies Used

* Java (JDK 8 or above)
* Core Java concepts (OOP)
* Collections (`ArrayList`)
* Date handling (`SimpleDateFormat`)

---

## 📂 Project Structure

```
BusProject/
└── busResv/
    ├── Bus.java
    ├── Booking.java
    └── BusDemo.java
```

---

## 🚀 How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/KrishnaVKA/BusReservationSystem.git
cd BusReservationSystem
```

---

### 2️⃣ Compile the program

```bash
javac busResv/*.java
```

---

### 3️⃣ Run the application

```bash
java busResv.BusDemo
```

---

## 🧠 How It Works

* `Bus` class stores bus details such as number, AC type, and capacity.
* `Booking` class handles user input and checks seat availability.
* `BusDemo` class contains the main method and controls the program flow.

The system ensures that bookings are only confirmed if seats are available for the selected bus and date.

---

## 📸 Sample Output

```
Bus No: 1 Ac: true Total Capacity: 2
Bus No: 2 Ac: false Total Capacity: 50
Bus No: 3 Ac: true Total Capacity: 48

Enter 1 to book and 2 to exit
```

---

## ⚠️ Notes

* Date format must be entered as: `dd-MM-yyyy`
* This is a basic console application (no GUI)
* Data is not stored permanently (no database used)

---

## 🔮 Future Improvements

* Add seat selection
* Implement ticket cancellation
* Store data using a database
* Build a graphical user interface (GUI)
* Add user authentication system

---

## 👨‍💻 Author

**KrishnaVKA**

