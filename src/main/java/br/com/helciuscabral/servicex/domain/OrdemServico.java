package br.com.helciuscabral.servicex.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDEMSERVICO")

public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OS")
    private Integer idOrdemServico;

    @Column(name = "DATA_SOLICITACAO")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataSolicitacao;

    @Column(name = "VALOR_OS")
    private Double valorOrdemServico;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ordemsevico")
    private Pagamento pagamento;

    @ManyToMany
    @JoinTable(name = "SERVICO_OS",
    joinColumns = @JoinColumn(name = "ID_OS"),
    inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;

}
