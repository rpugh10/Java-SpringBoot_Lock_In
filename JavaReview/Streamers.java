package JavaReview;

import java.util.Arrays;
import java.util.List;

public class Streamers {
    public static void main(String[] args) {
        // Example of using streams in Java
        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using stream to filter and print names starting with 'A'
        // names.stream()
        //      .filter(name -> name.startsWith("A"))
        //      .forEach(System.out::println);

        //Printing out names
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .forEach(name -> System.out.println(name));

        //Printing out names that start with A
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .filter(name -> name.startsWith("A")) .filter() removes elements
        //     .forEach(name -> System.out.println(name)); 

        //Converting to uppercase
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream() 
        //      .map(name -> name.toUpperCase()) .map() TRANSFORMS AN ELEMENT INTO SOMETHING ELSE
        //      .forEach(name -> System.out.println(name));
    
        //Printing out the length of each name
        //List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .map(name -> name.length()) //Turning Strings into Integers
        //     .forEach(name -> System.out.println(name));

        //Printing only even numbers
        //List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // nums.stream()
        //     .filter(even -> even % 2 == 0)
        //     .forEach(even -> System.out.println(even));

        //Squaring every number
        // List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // nums.stream()
        //     .map(square -> square * square)
        //     .forEach(square -> System.out.println(square));

        //List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // System.out.println(nums.stream().reduce(0, (sum, n) -> sum + n));
        //.reduce(initialValue, (accumulator, current) -> ...) combines all the elements of a stream into a single result (reduce is like a loop that goes through all the elements of a stream and combines them into a single result)

        //Finding the max value in a stream
         //List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
            // System.out.println(nums.stream().reduce(0, (max, current) -> Math.max(max, current)));

        
        // Collecting the even numbers into a new list
            // List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
            // List<Integer> evenNums = nums.stream()
            //     .filter(even -> even % 2 == 0)
            //     .toList(); // Collects the filtered elements into a new list
            // System.out.println(evenNums);
            
            //Removing Duplicates
            // List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5,5,5);
            // List<Integer> dup = nums.stream()
            //     .distinct() //removes duplicates from a stream
            //     .toList();
            // System.out.println(dup);

            //Sorting a stream
            // List<String> name = Arrays.asList("Char", "Bob", "Alice");
            // name.stream()
            //     .sorted() //returns a new stream with the elements in order
            //     .forEach(n -> System.out.println(n));

            //Printing elements in descending order
            // List<Integer> nums = Arrays.asList(4, 2, 1, 5, 6, 3, 10);
            // List<Integer> sorted = nums.stream()   
            //     .sorted(Comparator.reverseOrder()) //Comparator is an object that tells java how to compare two objects
            //     .toList();
            // System.out.println(sorted);

            
            
            List<Employee> employees = Arrays.asList(
                new Employee("Alice",25,50000),
                new Employee("Bob",32,70000),
                new Employee("Charlie",40,90000),
                new Employee("David",28,65000)
            );

            
            //Printing their names
            // employees.stream()
            //     .map(e -> e.getName()) //Want to transform an employee Object into a String
            //     .forEach(e -> System.out.println(e));

            employees.stream() 
                .filter(e -> e.getSalary() > 0)
                .forEach(e -> System.out.println(e.getSalary()));
                                    

    }
}
