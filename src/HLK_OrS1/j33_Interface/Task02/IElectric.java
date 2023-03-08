package HLK_OrS1.j33_Interface.Task02;

public interface IElectric extends IVehicle {
    final static int batteryLife = 100;

    String changeBattery();


    default void ebikGabık() {
        System.out.println("default tipi metod yazılabilir...");
    }

    static void autoPilot() {
        System.out.println("otonom sürüş modu...");
    }
}
