package br.com.helciuscabral.servicex.repository;

import br.com.helciuscabral.servicex.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
}
