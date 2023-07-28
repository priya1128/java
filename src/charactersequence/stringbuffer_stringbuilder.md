### StringBuffer
StringBuffer is a mutable sequence of characters, similar to the String class, but with the key difference that StringBuffer can be modified after it is created. It is designed for efficient string manipulation, especially when you need to perform multiple modifications on the same string. 

1. `append(String str)`: Appends the specified string to the end of the `StringBuffer`.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.append(" World!");
System.out.println(stringBuffer); // Output: "Hello World!"
```

2. `insert(int offset, String str)`: Inserts the specified string at the given offset.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.insert(5, " World");
System.out.println(stringBuffer); // Output: "Hello World"
```

3. `delete(int start, int end)`: Removes characters from the `start` index (inclusive) to the `end` index (exclusive).

```java
StringBuffer stringBuffer = new StringBuffer("Hello World");
stringBuffer.delete(5, 11);
System.out.println(stringBuffer); // Output: "Hello"
```

4. `deleteCharAt(int index)`: Removes the character at the specified index.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.deleteCharAt(4);
System.out.println(stringBuffer); // Output: "Hell"
```

5. `replace(int start, int end, String str)`: Replaces characters from the `start` index (inclusive) to the `end` index (exclusive) with the specified string.

```java
StringBuffer stringBuffer = new StringBuffer("Hello World");
stringBuffer.replace(0, 5, "Hi");
System.out.println(stringBuffer); // Output: "Hi World"
```

6. `reverse()`: Reverses the characters in the `StringBuffer`.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.reverse();
System.out.println(stringBuffer); // Output: "olleH"
```

7. `capacity()`: Returns the current capacity of the `StringBuffer`.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
int capacity = stringBuffer.capacity();
System.out.println(capacity); // Output: Some integer value based on the implementation
```

8. `length()`: Returns the number of characters in the `StringBuffer`.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
int length = stringBuffer.length();
System.out.println(length); // Output: 5
```

9. `setCharAt(int index, char ch)`: Sets the character at the specified index to the given character.

```java
StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.setCharAt(1, 'a');
System.out.println(stringBuffer); // Output: "Hallo"
```

10. `substring(int start)`: Returns a new `String` that contains a subsequence of characters from the `StringBuffer`, starting from the specified index.

```java
StringBuffer stringBuffer = new StringBuffer("Hello World");
String subString = stringBuffer.substring(6);
System.out.println(subString); // Output: "World"
```

11. `substring(int start, int end)`: Returns a new `String` that contains a subsequence of characters from the `StringBuffer`, starting from the `start` index (inclusive) and ending at the `end` index (exclusive).

```java
StringBuffer stringBuffer = new StringBuffer("Hello World");
String subString = stringBuffer.substring(0, 5);
System.out.println(subString); // Output: "Hello"
```


### StringBuilder

StringBuilder is another class in Java that is used to create and manipulate mutable strings. Like StringBuffer, it provides methods to modify strings efficiently without creating new objects. However, unlike StringBuffer, StringBuilder is not synchronized, making it more efficient for single-threaded environments. It is recommended to use StringBuilder in scenarios where you don't need thread safety.

### Differences between `String`, `StringBuilder`, and `StringBuffer` in Java:

|                 | String          | StringBuilder          | StringBuffer           |
|-----------------|-----------------|------------------------|------------------------|
| Mutability      | Immutable       | Mutable                | Mutable                |
| Thread Safety   | N/A             | Not Thread-Safe        | Thread-Safe            |
| Performance     | Fast (Read)     | Fast (Read & Append)   | Slower than StringBuilder but faster than String (Read & Append) |
| Memory Overhead | High            | Low                    | High                   |
| Synchronization | N/A             | Not Synchronized       | Synchronized           |
| Use Cases       | - Storing constant values<br>- Thread Safety required (e.g., shared among multiple threads) | - Dynamic string building<br>- No need for thread safety | - Dynamic string building in multi-threaded environments<br>- Thread safety required |
| Examples        | ```String str = "Hello";``` | ```StringBuilder sb = new StringBuilder("Hello");``` | ```StringBuffer sb = new StringBuffer("Hello");``` |


