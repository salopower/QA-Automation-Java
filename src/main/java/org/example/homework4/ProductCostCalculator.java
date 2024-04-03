package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        // price of the product  
        double unitPrice = 10.0;
        // Quantity  
        int quantity = 35;

        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    private static double calculateTotalCost(double unitPrice, int quantity) {
        if (quantity <= 10 ) {
            return unitPrice * quantity;
        } else if (quantity <= 20) {
            return (unitPrice - (unitPrice * 0.05)) * quantity;
        } else if (quantity <= 30) {
            return (unitPrice - (unitPrice * 0.1)) * quantity;
        } else if (quantity <= 80) {
            double discount = 0.12 + ((quantity - 30) / 10) * 0.004;
            return (unitPrice - (unitPrice * discount)) * quantity;
        } else {
            return (unitPrice - (unitPrice * 0.13)) * quantity;
        }
    }
}