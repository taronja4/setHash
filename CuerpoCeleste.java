import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste{ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE}
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        satelites=new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return new HashSet<CuerpoCeleste>(satelites);
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public boolean addSatelite(CuerpoCeleste celeste){
        if (satelites.contains(celeste)){
            return false;
        } else {
            satelites.add(celeste);
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Double.compare(that.periodoOrbital, periodoOrbital) == 0 && nombre.equals(that.nombre) && Objects.equals(satelites, that.satelites) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, periodoOrbital, satelites, tipoCuerpo);
    }

    @Override
    public String toString() {
        return nombre+": " + tipoCuerpo +", " + periodoOrbital;
    }
}
class Planeta extends CuerpoCeleste{

    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }


}
class PlanetaEnano extends CuerpoCeleste{
    public PlanetaEnano(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA_ENANO);
    }
}
class Luna extends CuerpoCeleste{
    public Luna(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.LUNA);
    }
}

