package box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws Exception {
        setLength(length);
        setHeight(height);
        setWidth(width);
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume() {
        return this.length * this.height * this.width;
    }

    public void setLength(double length) throws Exception {
        if (length > 0) {
            this.length = length;
        } else {
            throw new Exception("Length cannot be zero or negative.");
        }
    }

    public void setWidth(double width) throws Exception {
        if (width > 0) {
            this.width = width;
        } else {
            throw new Exception("Width cannot be zero or negative.");
        }
    }

    public void setHeight(double height) throws Exception {

        if (height > 0) {
            this.height = height;
        } else {
            throw new Exception("Height cannot be zero or negative.");
        }
    }
}

