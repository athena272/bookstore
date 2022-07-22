package br.com.casadocodigo.bookstore;

import java.util.HashMap;
import java.util.Map;

public class CouponManager {

    private Map<String, Double> coupon;

    public CouponManager() {

        this.coupon = new HashMap<>();

        coupon.put("CUP74", 10.0);
        coupon.put("CUP158", 15.00);
        coupon.put("CUP14", 5.99);
        coupon.put("CUP52", 20.00);
        coupon.put("cab11", 10.0);

        // ...
    }

    public Double validaCupom(String coupon) {
        return this.coupon.get(coupon);

    }
}