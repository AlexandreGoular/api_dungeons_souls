package avalicao.game.orm;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "avaliacao_game")
@Data
public class AvaliacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String emailPessoa;

    @Column(nullable = false)
    private String avaliacao;

    // Construtores, getters e setters podem ser gerados pelo Lombok
}
