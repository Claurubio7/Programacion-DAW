import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;

    public Tren(){
        locomotora=null;
        vagones=null;
        maquinista=null;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }
    public Maquinista getMaquinista() {
        return maquinista;
    }
    public Vagon[] getVagones() {
        return vagones;
    }
    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }
    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }
    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
    @Override
    public String toString() {
        if(locomotora!=null && vagones!=null && maquinista!=null)
            return "Tren [locomotora=" + locomotora + ", vagones=" + Arrays.toString(vagones) + ", maquinista=" + maquinista+ "]";
        else
            return "No hay datos guardados";
    }

    
    
}