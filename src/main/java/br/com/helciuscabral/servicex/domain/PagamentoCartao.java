package br.com.helciuscabral.servicex.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonTypeName("pagamentoCartao")
public class PagamentoCartao extends Pagamento{
}
