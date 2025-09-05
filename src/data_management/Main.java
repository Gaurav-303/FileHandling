package data_management;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.readPolicies("src/data_management/policies.txt");
        manager.writeSummary("src/data_management/summary.txt");
        System.out.println("Processing complete. Check summary.txt for results.");
    }
}

