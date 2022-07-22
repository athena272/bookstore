package br.com.casadocodigo.bookstore.teste;

import br.com.casadocodigo.bookstore.CouponManager;

public class ConsultaDeDescontos {
    public static void main(String[] args) {
        CouponManager cupons = new CouponManager();
        Double desconto = cupons.validaCupom("cab11");

        if(desconto != null){
            System.out.println("Cupom válido");
            System.out.println("Valor " + desconto);
        }
        else {
            System.out.println("Cupom não existe");
        }
    }
}
