public class Boeing extends Plane {

    public Boeing(int i, String delta) {
        super();
    }

    @Override
    public boolean willTurnOn() {
        System.out.println("The plane turns on.");
        return true;
    }

    @Override
    public boolean willFly() {
        System.out.println("The plane will fly.");
        return true;
    }

    @Override
    public boolean willDrive() {
        System.out.println("The plane will drive.");
        return false;
    }

}

