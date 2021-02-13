package entities;

public class Caminhao extends Transporte{

    @Override
    public double calculaFrete(Carga carga) {
        double frete = (carga.getPeso() * 0.12) + (carga.getValor() * 0.30);
        if (carga.getValor() > 40000){
            frete -= frete * 0.25;
        }
        return frete;
    }
}
