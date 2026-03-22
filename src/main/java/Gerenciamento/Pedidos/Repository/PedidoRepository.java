package Gerenciamento.Pedidos.Repository;

import Gerenciamento.Pedidos.Models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {

}
