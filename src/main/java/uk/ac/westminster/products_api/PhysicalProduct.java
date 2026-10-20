package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a type of Product.
// A ShoppingCart is not a Product because it contains products.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // Empty constructor
    public PhysicalProduct() {
        super();
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super();
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getter for weight
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}
