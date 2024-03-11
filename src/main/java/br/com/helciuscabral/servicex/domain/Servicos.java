package br.com.helciuscabral.servicex.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table (name = "SERVICOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Servicos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_SERVICOS")
    private Integer idServicos;
    @Column (name = "NOME_SERVICOS")
    private String nomeServico;
    @Column (name = "VALOR_SERVICOS")
    private Double valor;
    @ManyToOne
    @JoinColumn (name = "idCategoria")
    private Categoria categoria;
    @Column(name = "ORDEM_SERVICO")
    @OneToMany(mappedBy = "servico")
    private List<OrdemServico> ordemServicos;




}