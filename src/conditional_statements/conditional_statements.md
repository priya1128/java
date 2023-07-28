Conditional statements are used to make decisions in your code based on certain conditions. These statements allow you to execute different blocks of code depending on whether a particular condition is true or false. The most commonly used conditional statements in Java are `if`, `else if`, `nested if` and `switch`. Here's an overview of each:

1. `if` statement:
   The `if` statement is used to execute a block of code if a given condition is true. The general syntax is:

```java
if (condition) {
    // Code block to be executed if the condition is true
}
```

Example:

```java
int age = 25;
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

2. `if-else` statement:
   The `if-else` statement allows you to provide an alternative block of code to execute when the condition is false. The general syntax is:

```java
if (condition) {
    // Code block to be executed if the condition is true
} else {
    // Code block to be executed if the condition is false
}
```

Example:

```java
int age = 15;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

3. `else if` statement:
   The `else if` statement allows you to check multiple conditions sequentially. It is used when you have more than two possible outcomes. The general syntax is:

```java
if (condition1) {
    // Code block to be executed if condition1 is true
} else if (condition2) {
    // Code block to be executed if condition2 is true
} else {
    // Code block to be executed if none of the above conditions are true
}
```

Example:

```java
int score = 80;
if (score >= 90) {
    System.out.println("Excellent!");
} else if (score >= 70) {
    System.out.println("Good job!");
} else {
    System.out.println("Keep practicing.");
}
```

4. Nested if statements:
   You can also nest conditional statements inside each other to create more complex decision-making logic. The indentation is essential for readability.

Example:

```java
int num = 10;
if (num > 0) {
    if (num % 2 == 0) {
        System.out.println("Positive and even.");
    } else {
        System.out.println("Positive and odd.");
    }
} else if (num < 0) {
    System.out.println("Negative.");
} else {
    System.out.println("Zero.");
}
```

3. Switch
   `switch` statement is another way to make decisions based on the value of an expression. It allows you to execute different blocks of code depending on the value of a variable or an expression. The `switch` statement provides a more concise and organized way to handle multiple cases when compared to long chains of `if-else` statements.

Here's the basic syntax of the `switch` statement:

```java
switch (expression) {
    case value1:
        // Code block to be executed if expression matches value1
        break;
    case value2:
        // Code block to be executed if expression matches value2
        break;
    // Add more cases as needed
    default:
        // Code block to be executed if none of the cases match the expression
        break;
}
```

Note: The `break` statement is essential in each case block. It helps terminate the `switch` statement once a match is found, preventing the code from falling through to other case blocks.

Example:

```java
int dayOfWeek = 3;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    case 3:
        dayName = "Tuesday";
        break;
    case 4:
        dayName = "Wednesday";
        break;
    case 5:
        dayName = "Thursday";
        break;
    case 6:
        dayName = "Friday";
        break;
    case 7:
        dayName = "Saturday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println("Today is " + dayName);
```

In this example, the `switch` statement evaluates the value of the `dayOfWeek` variable and assigns the corresponding day name to the `dayName` variable. If `dayOfWeek` is 3, the output will be "Today is Tuesday."

Remember the following points when using `switch`:

1. The expression inside the `switch` statement must evaluate to a type that Java supports for `switch`. Valid types are `byte`, `short`, `int`, `char`, `String`, and their respective wrapper classes (`Byte`, `Short`, `Integer`, `Character`).

2. Each `case` value must be unique and must match the type of the expression.

3. The `default` case is optional and will be executed if none of the other cases match the expression.

4. The `break` statement is crucial in each case to prevent fall-through execution. If you omit a `break` statement, the code will continue executing the next case regardless of whether the expression matches the case.

5. Since Java 12, you can also use `switch` expressions, which allow you to use `switch` statements as expressions rather than statements, making the code more concise. However, the basic usage remains similar to the traditional `switch` statement.

As of Java 12, switch expressions were introduced as a preview feature, and they became standard in Java 14 with JEP 361. Switch expressions provide a more concise and expressive way to use switch statements as expressions instead of just statements. They allow you to assign a value directly to a variable based on different cases, making the code cleaner and reducing redundancy.

Here's the basic syntax of switch expressions:

```java
result = switch (expression) {
    case value1 -> expression1;
    case value2 -> expression2;
    // Add more cases as needed
    default -> expressionDefault;
};
```

Let's break down the parts:

- `expression`: This is the value you want to evaluate.
- `result`: This is the variable to which the value will be assigned.
- `case value`: The cases list different values for which you want to evaluate expressions.
- `->`: This is the arrow symbol used to separate each case from its corresponding expression.
- `expression1`, `expression2`, etc.: These are the expressions that will be assigned to `result` if the corresponding case matches the `expression`.
- `expressionDefault`: This is the expression that will be assigned to `result` if none of the cases match the `expression`.

Example:

```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1 -> "Sunday";
    case 2 -> "Monday";
    case 3 -> "Tuesday";
    case 4 -> "Wednesday";
    case 5 -> "Thursday";
    case 6 -> "Friday";
    case 7 -> "Saturday";
    default -> "Invalid day";
};

System.out.println("Today is " + dayName);
```

In this example, the switch expression evaluates the value of the `dayOfWeek` variable and assigns the corresponding day name to the `dayName` variable. If `dayOfWeek` is 3, the output will be "Today is Tuesday."

Switch expressions provide a concise alternative to switch statements when you need to use the result of a matched case directly in your code. They are particularly useful when you want to initialize or modify a variable based on different cases. Keep in mind that when using switch expressions, every case must produce a value that matches the type of the `result` variable. Also, you don't need to include `break` statements in switch expressions since each case returns a value directly.