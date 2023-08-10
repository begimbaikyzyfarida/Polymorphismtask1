public class Phone extends Device {
    private double price;
    public Phone(String name, double price) {
        this.price = price;
    }
    public void takePhoto() {
        System.out.println("IPhone can take photo");
    }
    @Override
    public void sound() {
        System.out.println("AAAAAAAAAAAA");
    }
}
