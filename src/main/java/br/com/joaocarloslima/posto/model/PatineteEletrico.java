package br.com.joaocarloslima.posto.model;

public class PatineteEletrico extends Veiculo implements Recarregavel {
    private double capacidadeBateria; // em kWh
    private double bateria;

    public PatineteEletrico(Long id, String nome, double capacidadeBateria, double bateria) {
        super(id, nome, 2);
        this.capacidadeBateria = capacidadeBateria;
        this.bateria = bateria;
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
        return "🛴";
    }
}
