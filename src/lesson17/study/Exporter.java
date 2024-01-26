package lesson17.study;

public class Exporter {
    static void prepareExport() {
        System.out.println("prepareExport");
    }
    public void export() {
        System.out.println("export");
    }

    interface TestInterface {
        void doSmth();
    }

    interface TestInterfaceExtra {
        Exporter doSmth();
    }

    public static void main(String[] args) {
        Exporter exporterObject = new Exporter();

        TestInterface test = Exporter::prepareExport;
        test.doSmth();

    }
}
