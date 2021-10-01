package comprob1.solid.lsp;

public class Square {
    private int side;
    Square(int side) {
        this.setSide(side);
    }
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public int getArea() {
      return side*side;
    }
}