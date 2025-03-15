class Gun {
    String colour;
    String material;
    int size;
    double price;
    char grade;
    boolean available;

    
    Gun() {
        System.out.println("Gun Details:");
    }

    
    Gun(String colour) {
        this();
        this.colour = colour;
    }

    
    Gun(String colour, String material) {
        this(colour);
        this.material = material;
    }

    
    Gun(String colour, int size) {
        this(colour);
        this.size = size;
    }

    
    Gun(String colour, int size, String shape) {
        this(colour, size);
        this.material = shape; 
    }

    
    Gun(String colour, int size, String shape, String extra) {
        this(colour, size, shape);
        this.material = shape + " " + extra; 
    }

    
    Gun(double price, boolean available) {
        this();
        this.price = price;
        this.available = available;
    }

   
    Gun(char grade) {
        this();
        this.grade = grade;
    }

    
    Gun(String colour, char grade) {
        this(colour);
        this.grade = grade;
    }

    
    Gun(String colour, String material, int size, double price, char grade, boolean available) {
        this(colour, material);
        this.size = size;
        this.price = price;
        this.grade = grade;
        this.available = available;
    }

    
    void display() {
        System.out.println("Gun Colour: " + this.colour);
    }

    void display1() {
        System.out.println("Gun Colour: " + this.colour);
        System.out.println("Gun Size: " + this.size);
    }

    void display2() {
        System.out.println("Gun Name: " + this.colour);
        System.out.println("Gun Size: " + this.size);
        System.out.println("Gun Shape: " + this.material);
    }

    void display3() {
        System.out.println("Gun Price: " + this.price);
        System.out.println("Gun Available: " + this.available);
    }

    void display4() {
        System.out.println("Gun Grade: " + this.grade);
    }

    void display5() {
        System.out.println("Gun Available: " + this.available);
    }

    void display6() {
        System.out.println("Gun Colour: " + this.colour);
        System.out.println("Gun Material: " + this.material);
        System.out.println("Gun Size: " + this.size);
        System.out.println("Gun Price: " + this.price);
        System.out.println("Gun Grade: " + this.grade);
        System.out.println("Gun Available: " + this.available);
    }
}
