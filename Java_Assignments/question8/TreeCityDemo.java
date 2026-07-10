package question7;

import java.util.*;

public class TreeCityDemo {

    static TreeMap<String, List<String>> map = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Find trees of a city");
            System.out.println("2. Delete city entry");
            System.out.println("3. Add new city entry");
            System.out.println("4. Display all (Iterator + foreach)");
            System.out.println("5. Add new tree to existing city");
            System.out.println("6. Find cities by tree name");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    findTrees();
                    break;

                case 2:
                    deleteCity();
                    break;

                case 3:
                    addCity();
                    break;

                case 4:
                    displayAll();
                    break;

                case 5:
                    addTreeToCity();
                    break;

                case 6:
                    findCitiesByTree();
                    break;
            }

        } while (choice != 7);
    }

    
    static void findTrees() {
        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        if (map.containsKey(city)) {
            System.out.println("Trees in " + city + ": " + map.get(city));
        } else {
            System.out.println("City not found!");
        }
    }

    
    static void deleteCity() {
        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        if (map.remove(city) != null) {
            System.out.println("City removed successfully");
        } else {
            System.out.println("City not found");
        }
    }

    
    static void addCity() {
        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        if (map.containsKey(city)) {
            System.out.println("City already exists!");
            return;
        }

        System.out.print("Enter number of trees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> trees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter tree name: ");
            trees.add(sc.nextLine());
        }

        map.put(city, trees);
        System.out.println("City added successfully");
    }

    
    static void displayAll() {

        System.out.println("\n--- Using Iterator ---");
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, List<String>> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n--- Using foreach ---");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


    static void addTreeToCity() {
        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        if (map.containsKey(city)) {
            System.out.print("Enter tree name to add: ");
            String tree = sc.nextLine();

            map.get(city).add(tree);
            System.out.println("Tree added successfully");
        } else {
            System.out.println("City not found!");
        }
    }


    static void findCitiesByTree() {
        System.out.print("Enter tree name: ");
        String tree = sc.nextLine();

        boolean found = false;

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(tree)) {
                System.out.println("Found in city: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tree not found in any city");
        }
    }
}