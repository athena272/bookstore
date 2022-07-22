package br.com.casadocodigo.bookstore.test;

import br.com.casadocodigo.bookstore.CouponManager;

public class DiscountInquiry {
    public static void main(String[] args) {
        CouponManager coupons = new CouponManager();
        Double discount = coupons.validaCupom("cab11");

        if(discount != null){
            System.out.println("Cupom válido");
            System.out.println("Valor " + discount);
        }
        else {
            System.out.println("Cupom não existe");
        }
    }
}
