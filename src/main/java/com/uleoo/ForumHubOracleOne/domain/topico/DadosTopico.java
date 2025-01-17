package com.uleoo.ForumHubOracleOne.domain.topico;

import java.time.LocalDateTime;

public record DadosTopico(String autor, String titulo, String mensagem, String curso, Enum<StatusTopico> status,
                             LocalDateTime dataCriacao) {
    public DadosTopico(Topico topico) {
        this(topico.getAutor(), topico.getTitulo(), topico.getMensagem(), topico.getCurso(), topico.getStatus(), topico.getDataCriacao());
    }
}