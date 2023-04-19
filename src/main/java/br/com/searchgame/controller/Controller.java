package br.com.searchgame.controller;

import br.com.searchgame.jogo.dados.AttGame;
import br.com.searchgame.jogo.dados.InsertGame;
import br.com.searchgame.jogo.dados.ListGame;
import br.com.searchgame.jogo.model.Game;
import br.com.searchgame.repository.GameRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogo")
public class Controller {

    @Autowired
    private GameRepository repo;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid InsertGame dados){
        repo.save(new Game(dados));
    }

    @PutMapping("/{id}")
    @Transactional
    public void put(@PathVariable Long id, @RequestBody @Valid AttGame dados) {
        var jogo = new Game();
        jogo = repo.getReferenceById(id);
        jogo.atualizarJogo(dados);
    }

    @GetMapping
    public Page<ListGame> findAll(@PageableDefault(size = 5, sort = {"titulo"})Pageable pageable) {
        return repo.findAllByVisivelTrue(pageable).map(ListGame::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        var jogo = new Game();
        jogo = repo.getReferenceById(id);
        jogo.apagarJogo();
    }

}
