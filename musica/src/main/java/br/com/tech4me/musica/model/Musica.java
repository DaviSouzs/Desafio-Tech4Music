package br.com.tech4me.musica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.musica.shared.MusicaDto;

@Document ("musicas")
public class Musica {
    @Id
    private String id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private String anoLancamento;
    private String compositor;

    public Musica(){
        
    }

    public Musica(MusicaDto dto){
        setId(dto.id());
        setTitulo(dto.titulo());
        setArtista(dto.artista());
        setAlbum(dto.album());
        setGenero(dto.genero());
        setAnoLancamento(dto.anoLancamento());
        setCompositor(dto.compositor());
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
