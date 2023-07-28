## Multithreading
Multithreading in Java allows for concurrent execution of multiple threads within a single program. Threads are independent sequences of instructions that can be scheduled and executed concurrently, sharing the same memory space. Multithreading is useful for tasks that can be parallelized or for achieving responsiveness in user interfaces.

To create and manage threads in Java, you have several options:

Extending the Thread class: You can create a subclass of the Thread class and override its run() method. This method contains the code that will be executed in the thread. Here's an example

```
class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
    }
}

// Creating and starting a new thread
MyThread thread = new MyThread();
thread.start();

```

Implementing the Runnable interface: Another way to create a thread is by implementing the Runnable interface and passing an instance of it to a Thread object. The run() method should be implemented in the Runnable class. Here's an example:

```
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
    }
}

// Creating and starting a new thread
Thread thread = new Thread(new MyRunnable());
thread.start();
```

## Life cycle of a Thread 

The life cycle of a thread in Java refers to the different states a thread can be in during its execution. The Java Thread class provides methods and mechanisms to manage and transition between these states. Here are the different states in the life cycle of a thread:

* New: When a thread is created but not yet started, it is in the "new" state. At this point, the thread has been instantiated but has not yet begun executing.

* Runnable: Once a thread is started using the start() method, it transitions to the "runnable" state. In this state, the thread is eligible to be scheduled for execution by the thread scheduler. However, it doesn't necessarily mean that the thread is currently running or executing.

* Running: When a thread is chosen by the thread scheduler to execute, it enters the "running" state. In this state, the actual execution of the thread's code takes place. It continues to run until it either completes its task or voluntarily yields the CPU.

* Blocked/Waiting: A running thread can enter a "blocked" or "waiting" state under certain conditions. This can occur when the thread is waiting for a resource, such as I/O operations or synchronization locks, and it cannot proceed until the resource becomes available.

* Blocked: A thread is blocked when it is waiting to acquire a lock on an object that is currently held by another thread. Once the lock becomes available, the thread transitions back to the "runnable" state.

* Waiting: A thread can enter a "waiting" state when it calls methods like wait(), join(), or park(), which cause the thread to pause and wait for a specific condition or for another thread to notify it. It remains in the "waiting" state until it receives a notification or until a specified timeout elapses.

* Timed Waiting: Similar to the "waiting" state, a thread can enter a "timed waiting" state when it calls methods like sleep() or wait() with a specified timeout. The thread will wait for the specified time period before resuming execution or until it receives a notification.

* Terminated: A thread completes its execution and enters the "terminated" state when its run() method finishes or when an unhandled exception occurs within the thread. Once terminated, a thread cannot be started again.

## Join a Thread

The join() method in Java allows the current thread to pause its execution and wait until another specified thread completes its execution. When the join() method is called, the current thread enters a waiting state and remains in that state until the joined thread finishes. If the joined thread is interrupted while waiting, it throws an InterruptedException.

## Priority of a Thread

threads can be assigned priority levels that indicate their relative importance and influence the thread scheduling algorithm. The thread priority is represented by an integer value ranging from 1 (lowest) to 10 (highest). By default, all threads have a priority of 5.

The Thread class in Java provides methods to get and set the priority of a thread:

* getPriority(): Returns the priority of the thread.
* setPriority(int priority): Sets the priority of the thread. The priority argument should be within the valid range of 1 to 10.

## Deadlock

A deadlock in Java occurs when two or more threads are blocked forever, each waiting for a resource that another thread holds. This situation results in a deadlock, where none of the threads can proceed, leading to a program's halt. Deadlocks can happen due to improper synchronization or resource allocation strategies.

### Preventing deadlocks requires careful consideration and proper synchronization strategies. Some techniques to avoid deadlocks include:

* Avoiding circular resource dependencies: Ensure that threads acquire resources in a consistent and predefined order to avoid circular dependencies.
* Using timeouts: Implement timeouts when acquiring resources to prevent indefinite waiting.
* Using resource allocation hierarchies: Assign unique identifiers to resources and ensure that threads acquire resources in a specific order based on their identifiers.
* Using resource pooling and management: Implement resource pooling techniques to efficiently manage and allocate shared resources.