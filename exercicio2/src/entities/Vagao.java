package entities;

public class Vagao extends Transporte {

    @Override
    public double calculaFrete(Carga carga) {
            double frete = (carga.getPeso() * 0.20) + (carga.getValor() * 0.10);
            if (carga.getPeso() < 15000){
                frete += 5000;
            }
        return frete;
    }
}
