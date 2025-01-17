package com.uleoo.ForumHubOracleOne.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DadosNovoTopico(

        @NotBlank
        String autor,

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        LocalDateTime dataCriacao,

        StatusTopico status,

        @NotBlank
        String curso) {
}