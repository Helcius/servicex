package br.com.helciuscabral.servicex.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICO")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;
    @Column(name = "NOME_SERVICO")
    private String nomeServico;
    @Column(name = "VALOR_SERVICO")
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    @JsonIgnore
    @ManyToMany(mappedBy = "servicos")
    private List<OrdemServico> ordemServicos;



}
