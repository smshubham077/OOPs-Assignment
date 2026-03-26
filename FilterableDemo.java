interface Filterable {
    void apply_filter(String filterType);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    private String imageName;
    private boolean filterApplied;
    
    public ImageProcessor(String imageName) {
        this.imageName = imageName;
        this.filterApplied = false;
    }
    
    @Override
    public void apply_filter(String filterType) {
        filterApplied = true;
        System.out.println("Applying '" + filterType + "' filter to image: " + imageName);
        System.out.println("✓ Filter applied successfully!");
    }
    
    @Override
    public void reset_filter() {
        filterApplied = false;
        System.out.println("Resetting image: " + imageName + " to original state");
        System.out.println("✓ Filter removed!");
    }
}

class DataAnalyzer implements Filterable {
    private String datasetName;
    private String currentFilter;
    
    public DataAnalyzer(String datasetName) {
        this.datasetName = datasetName;
        this.currentFilter = "No filter";
    }
    
    @Override
    public void apply_filter(String filterType) {
        currentFilter = filterType;
        System.out.println("Analyzing dataset: " + datasetName);
        System.out.println("Applying '" + filterType + "' filter to data");
        System.out.println("✓ Data filtered successfully!");
    }
    
    @Override
    public void reset_filter() {
        currentFilter = "No filter";
        System.out.println("Resetting dataset: " + datasetName);
        System.out.println("✓ All filters removed from data!");
    }
}

public class FilterableDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Filterable Interface Demo ===\n");
        
        System.out.println("--- Image Processing ---");
        Filterable imageProcessor = new ImageProcessor("sunset.jpg");
        imageProcessor.apply_filter("Sepia");
        System.out.println();
        imageProcessor.reset_filter();
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        System.out.println("--- Data Analysis ---");
        Filterable dataAnalyzer = new DataAnalyzer("SalesData2024");
        dataAnalyzer.apply_filter("ByRegion");
        System.out.println();
        dataAnalyzer.reset_filter();
        
        System.out.println("\n" + "=".repeat(40));
        
        System.out.println("\n--- Processing Multiple Objects ---");
        Filterable[] filterables = {
            new ImageProcessor("photo.png"),
            new DataAnalyzer("CustomerData")
        };
        
        for (Filterable filterable : filterables) {
            filterable.apply_filter("Standard");
            System.out.println();
        }
        
        System.out.println("=== Demo Complete ===");
    }
}
