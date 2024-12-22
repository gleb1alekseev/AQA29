package lesson8;

import lesson8.domain.AndroidPhone;
import lesson8.domain.ApplePhone;
import lesson8.domain.Phone;
import lesson8.domain.WindowsPhone;
import lesson8.service.PhoneRepairCheckService;


public class MainApp {

    public static void main(String[] args) {

        PhoneRepairCheckService repairService = new PhoneRepairCheckService();

        Phone applePhone = new ApplePhone();
        Phone androidPhone = new AndroidPhone();
        Phone windowsPhone = new WindowsPhone();

        repairService.check(applePhone);
        repairService.check(androidPhone);
        repairService.check(windowsPhone);

        Phone anonymousPhone = new Phone() {
            @Override
            public String firmware() {
                return "Версия anonymousPhone: 8";
            }
        };

        repairService.check(anonymousPhone);
    }
}