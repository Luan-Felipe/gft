package application;

import entities.Caminhao;
import entities.Carga;
import entities.Vagao;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class SimulacaoCustoFrete {
    public static void main(String[] args) {
        Carga c1 = new Carga(30000, 20000);
        Carga c2 = new Carga(20000,10000);
        Vagao vagao = new Vagao();
        Caminhao caminhao = new Caminhao();

        System.out.println("Carga 1");
        System.out.println("Frete Vagão: $" + String.format("%.2f", vagao.calculaFrete(c1)));
        System.out.println("Frete Caminhão: $" + String.format("%.2f", caminhao.calculaFrete(c1)));
        System.out.println();

        System.out.println("Carga 2");
        System.out.println("Frete Vagão: $" + String.format("%.2f", vagao.calculaFrete(c2)));
        System.out.println("Frete Caminhão: $" + String.format("%.2f", caminhao.calculaFrete(c2)));

        List<Carga> cargas = new ArrayList<>();

        Carga c3 = new Carga(27500, 18550);
        Carga c4 = new Carga(35410, 8100);
        Carga c5 = new Carga(3650, 25700);
        Carga c6 = new Carga(5799, 9541);
        Carga c7 = new Carga(45000, 25740);
        Carga c8 = new Carga(90570, 5000);
        Carga c9 = new Carga(41000, 8900);

        cargas.add(c3);
        cargas.add(c4);
        cargas.add(c5);
        cargas.add(c6);
        cargas.add(c7);
        cargas.add(c8);
        cargas.add(c9);

        for (int contador = 0; contador < cargas.size(); contador++) {
            System.out.println("Para a carga " + contador);
            if (vagao.calculaFrete(cargas.get(contador)) < caminhao.calculaFrete(cargas.get(contador))){
                System.out.print("a melhor opção de frete é o vagão, pelo preço de: $" + String.format("%.2f", vagao.calculaFrete(cargas.get(contador))) + "\n");
            }else{
                System.out.print("a melhor opção de frete é o caminhão, pelo preço de $" + String.format("%.2f", caminhao.calculaFrete(cargas.get(contador))) + "\n");
            }
        }


    }
}
