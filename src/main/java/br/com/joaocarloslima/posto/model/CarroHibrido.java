package br.com.joaocarloslima.posto.model;

public class CarroHibrido extends Veiculo implements Abastecivel, Recarregavel {
    private double capacidadeTanque; // em litros
    private double tanque;
    private double capacidadeBateria; // em kWh
    private double bateria;

    public CarroHibrido(Long id, String nome, double capacidadeTanque, double tanque, double capacidadeBateria, double bateria) {
        super(id, nome, 4);
        this.capacidadeTanque = capacidadeTanque;
        this.tanque = tanque;
        this.capacidadeBateria = capacidadeBateria;
        this.bateria = bateria;
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
    public double carregarBateria(){
        double quantidade = Math.max(0, capacidadeBateria - bateria);

        bateria += quantidade;

        return quantidade;
    }

    @Override
    public int getPercentualBateria(){
        if (capacidadeBateria <= 0){
            return 0;
        }

        return (int) Math.round((bateria / capacidadeBateria) * 100);
    }

    @Override
    public String getIcone() {
        return "🚕";
    }
}
