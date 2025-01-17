package com.uleoo.ForumHubOracleOne.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;

    private String titulo;

    private String mensagem;

    @Column(name = "data")
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private StatusTopico status;

    private String curso;

    public Topico(DadosNovoTopico dados) {
        this.autor = dados.autor();
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = dados.dataCriacao();
        this.status = dados.status();
        this.curso = dados.curso();
    }

    public Topico(String autor, String titulo, String mensagem, LocalDateTime dataCriacao, StatusTopico status, String curso) {
    }

    public Topico(){}

    public Topico(DadosTopico dto) {
        this.autor = dto.autor();
        this.titulo = dto.titulo();
        this.mensagem = dto.mensagem();
        this.dataCriacao = dto.dataCriacao();
        this.status = (StatusTopico) dto.status();
        this.curso = dto.curso();
    }

    public Long getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }



    public void setAutor(String autorNome) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Topico{" +
                "id=" + id +
                ", autor=" + autor +
                ", titulo='" + titulo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", status=" + status +
                ", curso='" + curso + '\'' +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public void atualizar(DadosAtualizarTopico dados) {

        if(dados.autor()!=null){
            this.autor=dados.autor();
        }

        if(dados.titulo()!=null){
            this.titulo=dados.titulo();
        }

        if(dados.mensagem()!=null){
            this.mensagem=dados.mensagem();
        }

        if(dados.curso()!=null){
            this.curso=dados.curso();
        }
    }
}
