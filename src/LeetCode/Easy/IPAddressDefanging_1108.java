package LeetCode.Easy;
import java.util.*;

public class IPAddressDefanging_1108 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter IP Address");
        String ip = hv.nextLine();
        System.out.println(defangIPaddr(ip));
        hv.close();
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
