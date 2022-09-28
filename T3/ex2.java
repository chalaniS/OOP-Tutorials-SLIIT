class Feet {
    private int feet;
    private int inches;

    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2) {
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;
    }

    // Display a Length e.g 5’6”
    public void print() {

        System.out.println(feet + "' " + inches + "'");

    }
}

class Ex2 {
    static public void main(String args[]) {
        Feet f1 = new Feet(10, 2);
        Feet f2 = new Feet(20, 4);

        f1.add(f1, f2);

        f1.print();

    }

}