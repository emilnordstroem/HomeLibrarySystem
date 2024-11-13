package application.model.utilities;

public class Dimension {
    private int height;
    private int length;
    private int depth;
    private int volume;

    public Dimension (int height, int length, int depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;
        this.volume = length * height * depth;
    }

    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getDepth() {
        return depth;
    }
    public int getVolume() {
        return volume;
    }
}
