<h1 align = "center">Array</h1>

## Introduction
An array is a <i>data structure</i> that stores a sequence of values <i>of the same type</i>.

## Programming Basics
### Declaration and Initialization
Making an array in Java involves three distinct step:
- Declare the array

    ```Java
    double[] a;
    ```

- Create the array

    ```Java
    a = new double[n];
    ```

- Initialize the array elements

    ```Java
    for (int i = 0; i < n; i++) {
        a[i] = 0.0;
    }
    ```

We can also take advantage of Java's <i>default array initialization</i> to declare, create, and initialize an array in a single statement.
```Java
double[] a = new double[an];
```
The `for` loop is not needed in this case as Java will automatically initialize primitive data types to `0` for numeric types or `false` for boolean type, and it will automatically initialize Strings to `null`.

## Memory Representation