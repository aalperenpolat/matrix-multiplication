# matrix-multiplication

# EEM480 - Algorithms and Complexity Assignment 1

This is the first assignment for the EEM480 Algorithms and Complexity course at Eskisehir Technical University.

## Project Description

In this assignment, we have implemented a Java class named `cMatrix` that provides various operations related to matrices. The class allows you to create matrices, fill them with random values, print matrices, mark prime numbers with an asterisk (*), and perform matrix multiplication.
The output in the project was a graph of the durations in milliseconds for the multiplications of randomly generated matrices of 10 different dimensions, such as 10x10, 100x100, and 1000x1000.

## Usage

To use the `cMatrix` class in your Java project, follow these steps:

  1. Clone or download this repository to your local machine.

  2. Include the `cMatrix.java` file in your project.

  3. Create an instance of the `cMatrix` class as follows:

     ```java
     cMatrix matrix = new cMatrix();


## Assign Random Values to the matrix

        ```java
              matrix.AssignRandom();

## Print the matrix to the console
        ```java
              matrix.printMatrix();

## Print the matrix with prime numbers marked
    ```java
    matrix.printMatrixWithPrime();

##Multiply two matrices
    
    ```java
    cMatrix matrix1 = new cMatrix(3, 4); // Example: Create a 3x4 matrix
    cMatrix matrix2 = new cMatrix(4, 2); // Example: Create a 4x2 matrix

  // Fill matrices with values (if needed)
  
     ```java
    cMatrix resultMatrix = matrix1.multiplyMatrices(matrix2);

  // Print the result matrix
    
     ```java
    resultMatrix.printMatrix();



Contributing
If you would like to contribute to this project, please follow these guidelines:

- Fork the repository.
- Create a new branch for your changes.
- Make your changes and commit them.
- Create a pull request explaining your changes.

  Contact Information
If you have any questions or need further assistance, feel free to contact me at alperenahmetpolat@gmail.com
