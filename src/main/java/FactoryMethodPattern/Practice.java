//package FactoryMethodPattern;
//
//import FactoryMethodPattern.Factorys.BalancedAnimalFactory;
//import FactoryMethodPattern.Factorys.RandomAnimalFactory;
//import FactoryMethodPattern.Interfaces.Animal;
//import FactoryMethodPattern.Interfaces.AnimalFactory;
//
//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//        // Initial factory
//        AnimalFactory factory = new BalancedAnimalFactory();
//        Scanner sc = new Scanner(System.in);
//        boolean run = true;
//
//        System.out.println("--- Factory Method Pattern Test ---");
//        System.out.println("Current Factory: BalancedAnimalFactory");
//
//        while (run) {
//            System.out.print("\nOptions: [G]enerate Animal, [S]witch Factory, [E]xit: ");
//            String input = sc.next();
//
//            if (input.isEmpty())
//                continue;
//            char choice = input.charAt(0);
//
//            if (choice == 'G' || choice == 'g') {
//                Animal animal = factory.createAnimal();
//                if (animal != null) {
//                    // Using getSimpleName() ensures readable output without overriding toString()
//                    // in subclasses yet
//                    System.out.println("Generated: " + animal.getClass().getSimpleName());
//                } else {
//                    System.out.println("Generated: null");
//                }
//            } else if (choice == 'S' || choice == 's') {
//                System.out.println("Choose Factory: [1] Balanced, [2] Random");
//                char type = sc.next().charAt(0);
//                if (type == '1') {
//                    factory = new BalancedAnimalFactory();
//                    System.out.println("Switched to: BalancedAnimalFactory");
//                } else if (type == '2') {
//                    factory = new RandomAnimalFactory();
//                    System.out.println("Switched to: RandomAnimalFactory");
//                } else {
//                    System.out.println("Invalid factory choice.");
//                }
//            } else if (choice == 'E' || choice == 'e') {
//                System.out.println("Exiting test...");
//                run = false;
//            } else {
//                System.out.println("Invalid choice. Please try again.");
//            }
//        }
//        sc.close();
//    }
//}
