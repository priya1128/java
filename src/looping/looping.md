Looping is a fundamental concept in Java programming that allows you to execute a block of code repeatedly. There are mainly three types of loops in Java:

1. **for loop:**
   The for loop is used when you know how many times you want to iterate.

   Syntax:
   ```java
   for (initialization; condition; update) {
       // Code to be executed repeatedly
   }
   ```

   Example:
   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println("Iteration: " + i);
   }
   ```

2. **while loop:**
   The while loop is used when you want to execute a block of code as long as a given condition is true.

   Syntax:
   ```java
   while (condition) {
       // Code to be executed repeatedly
   }
   ```

   Example:
   ```java
   int i = 0;
   while (i < 5) {
       System.out.println("Iteration: " + i);
       i++;
   }
   ```

3. **do-while loop:**
   The do-while loop is similar to the while loop, but the block of code is executed at least once before checking the condition.

   Syntax:
   ```java
   do {
       // Code to be executed repeatedly
   } while (condition);
   ```

   Example:
   ```java
   int i = 0;
   do {
       System.out.println("Iteration: " + i);
       i++;
   } while (i < 5);
   ```

Loop control statements:
- **break:** Used to exit a loop prematurely based on a certain condition.
- **continue:** Skips the rest of the current iteration and continues with the next iteration of the loop.

Example of break and continue:
```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        continue; // Skips iteration when i is 3
    }
    if (i == 6) {
        break; // Exits the loop when i is 6
    }
    System.out.println("Iteration: " + i);
}
```

Remember to properly manage the loop termination condition to avoid infinite loops. Be cautious of potential infinite loops as they can lead to your program becoming unresponsive. Always ensure the loop condition becomes false at some point.

### while vs do while vs for

| Feature             | `while` Loop                                       | `do-while` Loop                             | `for` Loop                                        |
|---------------------|----------------------------------------------------|--------------------------------------------|--------------------------------------------------|
| Execution Condition | The loop's body is executed only if the condition is true. | The loop's body is executed at least once before checking the condition. | The loop's body is executed as long as the condition is true. |
| Condition Checking  | Condition is checked before each iteration.       | Condition is checked after each iteration. | Condition is checked before each iteration.       |
| Initialization      | Requires explicit initialization before the loop starts. | Initialization can be done inside or outside the loop. | Initialization is done within the loop statement.   |
| Update             | Requires explicit update at the end of each iteration. | Update can be done inside or outside the loop. | Update is done at the end of each iteration.       |
| Usage               | When you are uncertain how many times the loop should run or when you want to execute the loop zero or more times. | When you want to execute the loop at least once before checking the condition, or when you need to ensure the loop's body is executed at least once. | When you know the exact number of iterations or when the number of iterations can be determined by a simple increment or decrement pattern. |
