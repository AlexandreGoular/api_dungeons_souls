package avalicao.game.controller;

import avalicao.game.dto.AvaliacaoDto;
import avalicao.game.orm.AvaliacaoModel;
import avalicao.game.repository.AvaliacaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@Validated
@CrossOrigin(origins = "*")
public class AvaliacaoController {

    @Autowired
    AvaliacaoRepository avaliacaoRepository;

    @PostMapping("/home")
    public ResponseEntity<AvaliacaoModel> avaliacaoModelResponseEntity(@RequestBody @Valid AvaliacaoDto avaliacaoDto) {
        var avaliacaoModel = new AvaliacaoModel();
        BeanUtils.copyProperties(avaliacaoDto, avaliacaoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoRepository.save(avaliacaoModel));
    }

    @GetMapping("/avaliacoes")
    public ResponseEntity<List<AvaliacaoModel>> getAllAvaliacao() {
        List<AvaliacaoModel> avaliacaoModels = avaliacaoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(avaliacaoModels);
    }
}
