package AtividadesPoo;

import java.util.HashMap;

public class AtividadePOO {

    public static void main(String[] args) {

        Coordenada parisCoordenada = new Coordenada();
        parisCoordenada.setLongitude((float) 2.64822);
        parisCoordenada.setLatitude((float) 5.65522);

        Coordenada russasCoordenada = new Coordenada();
        russasCoordenada.setLongitude((float) 4.10022);
        russasCoordenada.setLatitude((float) 2.33322);

        Local parisLocal = new Local();
        parisLocal.setNome("Torre Eiffel");
        parisLocal.setCidade("Paris");
        parisLocal.setPais("Frace");
        parisLocal.setCoordenada(parisCoordenada);

        Local russasLocal = new Local();
        russasLocal.setNome("Lagoa da Caicara");
        russasLocal.setCidade("Russas");
        russasLocal.setPais("Brasil");
        russasLocal.setCoordenada(russasCoordenada);

        LocaisTuristicos parisLTuristico = new LocaisTuristicos();
        parisLTuristico.setPais("France");
        parisLTuristico.setLocalTuristico(parisLocal);

        LocaisTuristicos russasLTuristico = new LocaisTuristicos();
        russasLTuristico.setPais("Brasil");
        russasLTuristico.setLocalTuristico(russasLocal);

        System.out.println(parisLTuristico.getPais());
        System.out.println(parisLTuristico.localTuristico.get(parisCoordenada).getNome());
        System.out.println(parisLTuristico.localTuristico.get(parisCoordenada).getCidade());
        System.out.println(russasLTuristico.getPais());
        System.out.println(russasLTuristico.localTuristico.get(russasCoordenada).getNome());
        System.out.println(russasLTuristico.localTuristico.get(russasCoordenada).getCidade());

    }
}

class Coordenada{

    private float latitude;
    private float longitude;

    public float getLatitude() {
        return latitude;
    }
    public float getLongitude() {
        return longitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}

class Local{

    private String nome;
    private String cidade;
    private String pais;
    private Coordenada coordenada;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Coordenada getCoordenada() {
        return coordenada;
    }
    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
}

class LocaisTuristicos{

    private String pais;
    HashMap<Coordenada, Local> localTuristico = new HashMap<>();

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Local getLocalTuristico(Coordenada coordenada) {
        return localTuristico.get(coordenada);
    }
    public void setLocalTuristico(Local local) {

        localTuristico.put(local.getCoordenada(), local);

    }
}