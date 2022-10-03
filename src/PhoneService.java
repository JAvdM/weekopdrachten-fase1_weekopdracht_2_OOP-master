import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PhoneService {

    Phone p30 = new Phone(1, "Huawei", "P30", "697.0", new String[]{"6.47\" FHD+ (2340x1080) OLED", "Kirin 980 Octa-Core (2x Cortex-A76 2.6GHz + 2x Cortex-A76 1.92GHz + 4x Cortex-A55 1.8GHz)", "8GB RAM - 128GB ROM", "40+20+8+TOF/32MP Camera", "Dual SIM - 4200mAh accu", "Android 9.0 + EMUI 9.1"});
    Phone a52 = new Phone(2, "Samsung", "Galaxy A52", "399.0", new String[]{"64 megapixel camera met 4k videokwaliteit", "6.5\" AMOLED scherm", "128GB opslaggeheugen (Uitbreidbaar met Micro-sd)", "Water- en stofbestendig (IP67)"});
    Phone iP11 = new Phone(3, "Apple", "iPhone 11", "619.0", new String[]{"Met de dubbele camera schiet je in elke situatie een perfecte foto of video.", "De krachtige A13-chipset zorgt voor razendsnelle prestaties.", "Met Face ID hoeft u enkel en alleen naar uw toestel te kijken om te ontgrendelen.", "Het toestel heeft een lange accuduur dankzij een energiezuinige processor."});
    Phone p4a = new Phone(4, "Google", "Pixel 4a", "411.0", new String[]{"12.2 megapixel camera", "4k videokwaliteit", "5.81\" OLED scherm", "128GB opslaggeheugen", "3140 mAh accucapaciteit"});
    Phone rn10 = new Phone(5, "Xiaomi", "Redmi Note 10 Pro", "298.0", new String[]{"108 megapixel camera,4k videokwaliteit", "6.67\" AMOLED scherm", "128GB opslaggeheugen (Uitbreidbaar met Micro-sd)", "Water- en stofbestendig (IP53)"});

    ArrayList<Phone> phone = new ArrayList<>(Arrays.asList(p30, a52, iP11, p4a, rn10));

    public void printModels() {
        for (Phone p : phone) {
            System.out.println(p.getId() + " - " + p.getBrand() + " " + p.getModel());
        }
        System.out.println("6 - Programma afsluiten\n");
    }

    public void selectModel(int id) {

        if (id == 1) {
            p30.getDescription();
        } else if (id == 2) {
            a52.getDescription();
        } else if (id == 3) {
            iP11.getDescription();
        } else if (id == 4) {
            p4a.getDescription();
        } else if (id == 5) {
            rn10.getDescription();
        } else {
            errorMessage();
        }
    }

    public void errorMessage() {
        System.out.println();
        System.out.println("Verkeerde input. Probeer opnieuw a.u.b.\n");
    }

    public void returnToList() throws IOException {
        System.out.println();
        System.out.println("Voer een willekeurige toets in om terug naar het selectiemenu te gaan\n");
        System.in.read();
    }
}
