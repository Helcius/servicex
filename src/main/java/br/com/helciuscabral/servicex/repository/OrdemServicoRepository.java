package br.com.helciuscabral.servicex.repository;

import br.com.helciuscabral.servicex.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {
}
