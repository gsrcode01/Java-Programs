
# Transport Delivery System

## Project Overview
This project simulates a **transport delivery system** using different types of vehicles, including bicycles, e-bikes, and drones. Each vehicle type can deliver items to specified locations. Drones have additional restrictions based on security rules and implement a payment mechanism to calculate delivery costs.

Key features:
- Vehicle hierarchy with inheritance (`Vehicle`, `Bicycle`, `EBike`, `Drone`).
- Interface implementation for cost calculation (`Payable`).
- Security rules to restrict drone deliveries to certain locations.
- Polymorphic behavior for different delivery methods.

## Installation Instructions
1. **Prerequisites:**
   - Java JDK 8 or higher installed.
   - A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).
   
2. **Clone or download the project files** to your local machine.

3. **Compile the code:**
   Open a terminal in the project directory and run:
   ```bash
   javac transport/*.java
   ```

4. **Run the main class (if you create one)**:
   ```bash
   java transport.Main
   ```
   *(Replace `Main` with the name of your class containing the `main` method.)*

## Usage Guidelines
1. **Creating Vehicles:**
   ```java
   Bicycle bike = new Bicycle("B001");
   EBike eBike = new EBike("EB001", 80); // 80% battery
   Drone drone = new Drone("D001");
   ```

2. **Delivering Items:**
   ```java
   bike.deliver("Book", "Library");
   eBike.deliver("Parcel", "Home");
   drone.deliver("Document", "Office");
   ```

3. **Calculating Delivery Costs (for Payable vehicles like Drone):**
   ```java
   double cost = drone.cost(5.0); // 5 km distance
   System.out.println("Delivery cost: " + cost);
   ```

4. **Security Restrictions:**
   - Drones cannot fly to restricted areas like `"ExamCell"`.
   - The system automatically checks for restrictions before delivery.

## Technical Details
- **Programming Language:** Java
- **Project Structure:**
  ```
  transport/
  ├── Vehicle.java       // Abstract base class
  ├── Bicycle.java       // Bicycle implementation
  ├── EBike.java         // Electric bike implementation
  ├── Drone.java         // Drone implementation
  ├── Payable.java       // Interface for cost calculation
  └── SecurityRules.java // Security restrictions
  ```
- **Key Concepts Used:**
  - Object-Oriented Programming (OOP) principles: inheritance, abstraction, and polymorphism.
  - Interfaces for defining payable functionality.
  - Encapsulation and access modifiers.
  - Security checks using `SecurityRules`.

## Notes
- You can extend the system by adding new vehicle types or modifying delivery rules.
- Ensure that any new vehicle implementing `Payable` provides the `cost()` method.
