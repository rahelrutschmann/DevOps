/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Project.SparkJava;

import spark.Spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
public static void main(String[] args) {
    Spark.get("/users/0/welcome", (req, res) -> {
        return "Hallo Rahel, Pascal & Radu";
    });
    
    System.out.println("Das ist ein Test");
}
}