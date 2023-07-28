**1. Queue:**
- A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle, where the element that is inserted first will be the first one to be removed.
- It has two primary operations: enqueue (adding an element to the back of the queue) and dequeue (removing the front element from the queue).
- Common operations on a queue are:
    - `enqueue(item)`: Add an item to the rear (end) of the queue.
    - `dequeue()`: Remove and return the front (first) item from the queue.
    - `front()`: Return the front item without removing it.
    - `isEmpty()`: Check if the queue is empty.
    - `size()`: Return the number of elements in the queue.

**1.1. Priority Queue:**
- A priority queue is an extension of a regular queue where each element is associated with a priority.
- The element with the highest priority gets dequeued first.
- Priority queues are typically implemented using heaps, such as binary heaps or Fibonacci heaps, to efficiently maintain the highest priority element at the front.
- Common operations on a priority queue are similar to a regular queue, but the dequeue operation removes the element with the highest priority rather than the front element.

**1.2. Deque (Double-ended Queue):**
- A deque is a generalized version of a queue and allows insertion and deletion at both ends.
- It can work as a queue (FIFO) or a stack (LIFO) depending on how elements are added and removed.
- Common operations on a deque are:
    - `append(item)`: Add an item to the rear (end) of the deque.
    - `appendleft(item)`: Add an item to the front of the deque.
    - `pop()`: Remove and return the last item from the deque.
    - `popleft()`: Remove and return the first item from the deque.
    - `peek()`: Return the last item without removing it.
    - `peekleft()`: Return the first item without removing it.
    - `isEmpty()`: Check if the deque is empty.
    - `size()`: Return the number of elements in the deque.

**1.2.1. ArrayDeque:**
- ArrayDeque is a specific implementation of a deque that stores its elements in a resizable array.
- It allows dynamic resizing, which means it can grow and shrink as needed.
- ArrayDeque provides constant-time complexity (O(1)) for common operations like `append`, `appendleft`, `peek`, and `peekleft`.
- Additionally, ArrayDeque offers a more efficient memory allocation and management compared to linked-list-based deques.


### Difference Between Priority Queue and Array Deque

Below is a comparison table between Priority Queue and ArrayDeque:

| Aspect                  | Priority Queue                            | ArrayDeque                                 |
|-------------------------|-------------------------------------------|--------------------------------------------|
| Data Structure Type     | Queue with priority-based ordering       | Double-ended queue with dynamic resizing   |
| Order of Elements       | Elements are dequeued based on priority  | Elements are dequeued in their insertion order (FIFO) |
| Underlying Implementation | Typically implemented using heaps        | Implemented using a resizable array       |

### Priority Queue's order of elements
Elements with higher priority are dequeued before elements with lower priority. The priority can be based on natural ordering (defined by the elements' implementation of the Comparable interface) or a custom comparison logic provided by a Comparator.

**1. Natural Ordering (Comparable):**

If the elements in the Priority Queue implement the Comparable interface, the queue will automatically use the elements' natural ordering to determine their priority. The Comparable interface requires the implementation of the compareTo() method, which defines the comparison logic.

The ordering of elements is achieved using a heap data structure, specifically a binary heap, in the default implementation of PriorityQueue. A binary heap is a binary tree-based data structure in which the parent node's value is either greater or smaller (depending on whether it's a min-heap or max-heap) than or equal to its child nodes' values. In a min-heap, the parent has a lower value (higher priority) than its children, and in a max-heap, the parent has a higher value (higher priority) than its children.

The PriorityQueue uses the heap property to maintain the sorting order. When you insert an element, it is placed in its appropriate position based on its priority, and when you remove elements using methods like poll() or remove(), the highest priority element is always removed first.

It's important to note that the PriorityQueue only guarantees that the highest priority element is at the front of the queue. The ordering of the remaining elements might not follow a particular pattern, as long as the heap property is maintained.

**2. Custom Comparator:**
If the elements do not implement the Comparable interface or you want to define a different priority for them, you can provide a custom comparator when creating the PriorityQueue. The comparator defines the comparison logic between elements.