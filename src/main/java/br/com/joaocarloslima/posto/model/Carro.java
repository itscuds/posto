package br.com.joaocarloslima.posto.model;

public class Carro extends Veiculo implements Abastecivel{
    private double capacidadeTanque; // em litros
    private double tanque;

    public Carro(Long id, String nome, double capacidadeTanque, double tanque) {
        super(id, nome, 4);
        this.capacidadeTanque = capacidadeTanque;
        this.tanque = tanque;
    }


   @Override
    public double encherTanque(){
        double quantidade = Math.max(0, capacidadeTanque - tanque);

        tanque += quantidade;

        return quantidade;
    }

    @Override
    public int getPercentualTanque(){
        if (capacidadeTanque <= 0){
            return 0;
        }

        return (int) Math.round((tanque / capacidadeTanque) * 100);
    }

    @Override
    public String getIcone() {
        return "🚗";
    }

}
