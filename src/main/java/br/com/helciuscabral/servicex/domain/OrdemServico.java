package br.com.helciuscabral.servicex.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "ORDEMSERVICO")

public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDEM_SERVICO")
    private Long idOrdemServico;
    @Column(name = "VALOR")
    private Double valorOrdemServico;
    @Column(name = "DATA_SOLICITACAO")
    private Date dataSolicitacao;
}
