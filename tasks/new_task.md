# Economic Analysis using Java Loops and Functions

Computers are invaluable in economic analysis due to their ability to handle repetitive tasks and complex calculations efficiently. By leveraging Java's looping constructs and function overloading, we can simulate various economic scenarios, such as calculating compound interest or analyzing cash flow over different periods. This task will guide you through creating a simple economic application using Java, and as an added bonus, you'll get hands-on experience using JShell, Java's interactive REPL tool.

### 📝 Preparation

- Review the [Java Basics on Boolean Expressions](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html).
- Explore Java's [Looping Constructs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html).
- Familiarize yourself with [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) to test Java code snippets interactively.
- Understand the concept of [Function Overloading](https://en.wikipedia.org/wiki/Function_overloading) in Java.

### ✅ Learning Goals

This task will cover:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java program
* Function overloading

### 🚨 Troubleshooting Guide

If you encounter any errors:

1. Check related resources and examples for similar issues.
2. Use search engines to look for common solutions.
3. Discuss your problem with peers without sharing your code directly.
4. Consult a teaching assistant (TA) or instructor.

### 🏛 Assignment

We'll simulate an economic scenario: calculating compound interest over different periods using Java loops and functions.

### 📈 Compound Interest Calculator

#### Exercise 1: Boolean Expressions and Operators

Create a new Java class called `EconomySimulation.java`. Implement a method to check if investment growth surpasses a threshold:

```java
public boolean isGrowthAboveThreshold(double principal, double rate, int years, double threshold)
```

This method should calculate the future value using the formula \(FV = P \times (1 + r)^t\), and return `true` if it exceeds the `threshold`; otherwise, return `false`.

*Use JShell to test your logic interactively:*

```bash
jshell EconomySimulation.java
/somewhere> EconomySimulation es = new EconomySimulation();
/somewhere> es.isGrowthAboveThreshold(1000, 0.05, 10, 1500);
```

#### Exercise 2: While Loops

Add a method that uses a `while` loop to calculate how long it will take for an investment to double:

```java
public int yearsToDoubleInvestment(double principal, double rate)
```

The loop should increment a `year` counter until the investment grows to at least double the `principal`.

#### Exercise 3: For Loops and Summation

Implement a method using a `for` loop to calculate the total value of an investment over a series of years:

```java
public double totalInvestmentOverYears(double principal, double rate, int years)
```

This method should return the sum of the investment's value at the end of each year over `years` years.

#### Exercise 4: Function Overloading

Demonstrate function overloading by implementing two versions of an interest method:

1. Method 1: Calculate interest using a default rate:

    ```java
    public double calculateInterest(double principal)
    ```

2. Method 2: Accept an additional parameter for rate:

    ```java
    public double calculateInterest(double principal, double rate)
    ```

The first method should use a default rate (e.g., 0.05), while the second allows the user to specify the rate.

### 🎛️ Enhanced User Experience

Enhance your `EconomySimulation` class with a `toString` method that provides a user-friendly representation of the object, detailing the last used investment parameters.

### 📈 Advanced Exercise: Periodic Cash Flow Analysis

Create an overloaded method set for performing cash flow analysis:

```java
public double analyzeCashFlow(double[] cashFlows, double rate)
public double analyzeCashFlow(double[] cashFlows, double rate, boolean isAnnuity)
```

- The first method should sum up the cash flows over a specified discount rate.
- The overloaded method should consider whether the cash flows represent an annuity, adjusting accordingly for present value computations.

### 🚀 Testing with JShell

Once you've implemented the exercises, use JShell to test each method interactively. This ensures correctness before integrating the methods into larger systems.

By the end of this task, you'll have strengthened your understanding of loops, boolean expressions, function overloading, and Java testing environments, all within the context of a meaningful economic simulation. Enjoy the challenge of coding economic insights!