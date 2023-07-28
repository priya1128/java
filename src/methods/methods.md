Sure! Here are some notes on methods in Java:

1. **Method Definition**:
    - In Java, a method is a block of code that performs a specific task or action. It is defined inside a class and can be called from other parts of the program.

2. **Syntax**:
   ```java
   [access_modifier] [static] [return_type] [method_name](parameter_list) {
       // Method body
       // Code to perform the task
       // Optional return statement (if return_type is not void)
   }
   ```

3. **Access Modifiers**:
    - `public`: The method is accessible from any other class.
    - `private`: The method is only accessible within the same class.
    - `protected`: The method is accessible within the same class and its subclasses (also known as derived classes).
    - Default (no modifier): The method is accessible within the same package.

4. **Static Keyword**:
    - If the `static` keyword is used, the method belongs to the class rather than an instance of the class. Static methods can be called using the class name, e.g., `ClassName.methodName()`, without creating an object of the class.

5. **Return Type**:
    - The `return_type` specifies the type of value that the method returns after performing its task. If the method does not return any value, the return type should be `void`.

6. **Method Name**:
    - The `method_name` is an identifier that is used to call the method from other parts of the program. It should follow Java naming conventions.

7. **Parameter List**:
    - The `parameter_list` is a list of input parameters (if any) that the method can accept. Parameters are separated by commas. If there are no parameters, the list is left empty.

8. **Method Body**:
    - The method body contains the actual code that performs the task. It is enclosed within curly braces `{}`.

9. **Returning Values**:
    - If the method has a return type other than `void`, it must use the `return` keyword followed by the value to be returned.

10. **Calling a Method**:
- To call a method, you need to create an object of the class (if the method is not static) and use the dot notation to call the method on the object.

Example of a simple method in Java:
```java
public class Example {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Example obj = new Example();
        int result = obj.addNumbers(5, 10);
        System.out.println("Sum: " + result);
    }
}
```

### Types of methods
In Java, methods can be classified into several types based on their functionality and usage. Here are the most common types of methods in Java:

1. **Instance Methods**:
   - Instance methods are associated with an instance of a class and operate on the instance's state. They can access instance variables and other instance methods directly.
   - These methods are not marked as `static`.

2. **Static Methods**:
   - Static methods are associated with the class itself rather than any specific instance. They can only access static variables and other static methods directly.
   - These methods are marked with the `static` keyword.

3. **Getter Methods**:
   - Getter methods, also known as accessor methods, are used to retrieve the values of private instance variables of a class.
   - They typically have a naming convention like `getVariableName()` and do not modify the state of the object.

4. **Setter Methods**:
   - Setter methods, also known as mutator methods, are used to set the values of private instance variables of a class.
   - They typically have a naming convention like `setVariableName(type variableName)` and modify the state of the object.

5. **Constructor Methods**:
   - Constructors are special methods used to create and initialize objects of a class. They have the same name as the class and do not have a return type.
   - They are automatically called when an object is created using the `new` keyword.

6. **Method Overloading**:
   - Method overloading allows multiple methods with the same name but different parameter lists in the same class.
   - The methods must have different parameter types or a different number of parameters.

7. **Method Overriding**:
   - Method overriding is a concept in object-oriented programming where a subclass provides a specific implementation for a method that is already defined in its superclass.
   - The method signature (name and parameter list) in the subclass must match the method in the superclass.

8. **Recursion**:
   - Recursion is a technique where a method calls itself to solve a problem. It is particularly useful for solving problems that can be broken down into smaller sub-problems.
   - Recursive methods have a base case to stop the recursive calls.

9. **Varargs Methods**:
   - Varargs (variable-length argument) methods allow methods to accept a variable number of arguments of the same type.
   - They use an ellipsis `...` after the parameter type in the method signature.

10. **Abstract Methods**:
   - Abstract methods are declared without a body in an abstract class or an interface.
   - Subclasses of an abstract class must provide concrete implementations of all abstract methods, while classes implementing an interface must implement all its methods.

### Recursion 

Recursion in Java refers to a technique where a method calls itself to solve a problem by breaking it down into smaller sub-problems. Recursive functions have two essential components: a base case that defines the simplest version of the problem (to stop the recursion), and a recursive call that breaks down the larger problem into smaller ones until it reaches the base case.

Here's an example of a factorial program using recursion in Java:

**Factorial Program using Recursion**:
```java
public class FactorialExample {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: Factorial of 0 and 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive call to calculate factorial
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```

**Explanation**:
1. The `factorial` method takes an integer `n` as an argument and returns the factorial of `n`.
2. In the `factorial` method, there is a base case that checks if `n` is 0 or 1. If `n` is 0 or 1, the method returns 1 since the factorial of 0 and 1 is 1.
3. If `n` is not 0 or 1, the method proceeds with the recursive call. It calls itself with the argument `(n - 1)` and multiplies the result by `n`. This step continues recursively until it reaches the base case.
4. The recursive calls break down the larger problem of finding the factorial of `n` into smaller sub-problems until it reaches the base case, where the recursion stops.
5. The final result is obtained by multiplying all the integers from `n` down to 1, effectively calculating the factorial of the given number.

**Output**:
```
Factorial of 5 is: 120
```
