interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the image.");
    }

    public void reset_filter() {
        System.out.println("Resetting image to original state.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the dataset.");
    }

    public void reset_filter() {
        System.out.println("Resetting data to original state.");
    }
}

// Main class
public class TestFilter {
    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        // Using ImageProcessor
        img.apply_filter("Blur");
        img.reset_filter();

        // Using DataAnalyzer
        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}