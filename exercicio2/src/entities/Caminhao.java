package entities;

public class Caminhao extends Transporte{

    @Override
    public double calculaFrete(Carga carga) {
        double frete = (carga.getPeso() * 0.12) + (carga.getValor() * 0.30);
        return frete;
    }
}
