public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Phone phone = new Phone("IPhone", 199.98);
        System.out.println("IPhone");
        device.sound();
        phone.sound();
        phone.takePhoto();
    }
}
