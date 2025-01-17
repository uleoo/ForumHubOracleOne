package com.uleoo.ForumHubOracleOne.domain.topico;

public record DadosAtualizarTopico(
        String autor,
        String titulo,
        String mensagem,
        String curso) {
    public DadosAtualizarTopico(Topico topico){
        this(topico.getAutor(), topico.getTitulo(), topico.getMensagem(), topico.getCurso());
    }
}