javac Fibonacci/*.java Utility/*.java
jar cfev fibonacci.jar Fibonacci.Main Fibonacci/*.class Utility/*.class
java -jar fibonacci.jar