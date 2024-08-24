package avalicao.game.repository;

import avalicao.game.orm.AvaliacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoModel, Long> {
}
