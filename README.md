# Group Exercise: Generics

Learn how to use the _simple-table_ API by looking into the Unit Tests at the following test classes:

* TableInstantiationTest
* CellAccessTest
* CellMutationTest

After studying the test cases, think of how to apply Generics in the API.

Switch the Git branch of the project to _apply-generics_, and go back to the test classes.

The Unit Tests should have already been updated with the usage of the API with Generics.

You will notice that the test cases are now expecting **Table** and **Cell** classes to be Generic Types.

Without changing anything but the **Table** and **Cell** classes, you should be able to run the Unit Tests successfully.

### Note:

When instantiating an array of Generic Types, the following syntax is not possible:

```java
Cell<T>[][] cells = new Cell<T>[2][2]; // won't compile 
```

You need to omit the Type Parameter on the instantiation side:

```java
Cell<T>[][] cells = new Cell[2][2]; // will compile but with a warning
```

