package Gerenciamento.Pedidos.Controller;

import Gerenciamento.Pedidos.Models.PedidoModel;
import Gerenciamento.Pedidos.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoModel> Listar(){
        return pedidoService.ListarProdutos();
    }

    @GetMapping("/{id}")
    public PedidoModel Buscar(@PathVariable long id){
        return pedidoService.buscarProduto(id);
    }

    @PostMapping
    public PedidoModel Criar (@RequestBody PedidoModel pedidoModel){
        return pedidoService.criarPedido(pedidoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPedido(@PathVariable long id){
        pedidoService.deletarPedido(id);
        return ResponseEntity.noContent().build();
    }
}
