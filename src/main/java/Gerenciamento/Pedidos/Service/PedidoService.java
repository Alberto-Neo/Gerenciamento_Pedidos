package Gerenciamento.Pedidos.Service;

import Gerenciamento.Pedidos.Models.PedidoModel;
import Gerenciamento.Pedidos.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoModel> ListarProdutos(){
        return pedidoRepository.findAll();
    }

    public PedidoModel buscarProduto(long id){
        return pedidoRepository.findById(id).get();
    }

    public PedidoModel criarPedido(PedidoModel pedidoModel){
        return pedidoRepository.save(pedidoModel);
    }

    public void deletarPedido(long id){
        pedidoRepository.deleteById(id);
    }


}
