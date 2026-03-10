package com.immobiliare.immobiliare.entitities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "immobili")
public class Immobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String titolo;

    @Column(columnDefinition = "TEXT")
    private String descrizione;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoImmobile tipo;

    private String indirizzo;
    private String citta;

    @Column(length = 2)
    private String provincia;

    @Column(length = 10)
    private String cap;

    private Integer superficie;
    private Integer camere;
    private Integer bagni;

    @Column(precision = 12)
    private Double prezzo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatoImmobile stato;

    @Column(name = "data_inserimento")
    private LocalDate dataInserimento;

    // Costruttori
    public Immobile() {}

    public Immobile(String titolo, String descrizione, TipoImmobile tipo, String indirizzo,
                    String citta, String provincia, String cap, Integer superficie,
                    Integer camere, Integer bagni, Double prezzo, StatoImmobile stato) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.provincia = provincia;
        this.cap = cap;
        this.superficie = superficie;
        this.camere = camere;
        this.bagni = bagni;
        this.prezzo = prezzo;
        this.stato = stato;
        this.dataInserimento = LocalDate.now();
    }

    // Getter e Setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public TipoImmobile getTipo() { return tipo; }
    public void setTipo(TipoImmobile tipo) { this.tipo = tipo; }

    public String getIndirizzo() { return indirizzo; }
    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

    public String getCitta() { return citta; }
    public void setCitta(String citta) { this.citta = citta; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getCap() { return cap; }
    public void setCap(String cap) { this.cap = cap; }

    public Integer getSuperficie() { return superficie; }
    public void setSuperficie(Integer superficie) { this.superficie = superficie; }

    public Integer getCamere() { return camere; }
    public void setCamere(Integer camere) { this.camere = camere; }

    public Integer getBagni() { return bagni; }
    public void setBagni(Integer bagni) { this.bagni = bagni; }

    public Double getPrezzo() { return prezzo; }
    public void setPrezzo(Double prezzo) { this.prezzo = prezzo; }

    public StatoImmobile getStato() { return stato; }
    public void setStato(StatoImmobile stato) { this.stato = stato; }

    public LocalDate getDataInserimento() { return dataInserimento; }
    public void setDataInserimento(LocalDate dataInserimento) { this.dataInserimento = dataInserimento; }

    @Override
    public String toString() {
        return "Immobile{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", tipo=" + tipo +
                ", citta='" + citta + '\'' +
                ", prezzo=" + prezzo +
                ", stato=" + stato +
                '}';
    }
}