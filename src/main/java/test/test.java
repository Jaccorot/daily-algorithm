package test;

import java.time.LocalDate;
import java.util.Date;

public class test {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0;;) {
//                if (j == 0) {
//                    break;
//                }
//            }
//            System.out.println("iiiiiiiii" + String.valueOf(i));
//        }


//        int loop = 1;
//        while (loop-- > 0) {
//            System.out.println("loop :" + loop);
//        }
        Date deadline = new Date();
        System.out.println(deadline);
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(1999,2,11);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        LocalDate thousandDaysLater = localDate.plusDays(1000);
        System.out.println(thousandDaysLater);
    }
}
