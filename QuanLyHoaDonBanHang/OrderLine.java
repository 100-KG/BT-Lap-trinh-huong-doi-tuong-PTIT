package QuanLyHoaDonBanHang;

import java.util.Currency;
public class OrderLine {
    private Currency value;

    public OrderLine(Currency value){
        this.value = value;
    }
    public Currency getValue() {
        return value;
    }
}