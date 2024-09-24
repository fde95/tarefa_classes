/**
 * @author felipe.espinoza
 * @version 1.0
 */
public class ClassePrincipal {

    public static void main(String[] args){
        Cliente cliente = new Cliente();

        cliente.setId(0);
        cliente.setNome("Felipe Espinoza");
        cliente.setEndereco("Rua Teste 1800");
        cliente.setTelefone("(11) 98765-4321");
        cliente.setVendedor("Antonio da Silva");
        cliente.setCodigoVendedor(10);

        //System.out.println("Código do cliente: " + cliente.getId());
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
        System.out.println("Telefone do cliente:" + " " + cliente.getTelefone());
        System.out.println("Vendedor:" + " " + cliente.getVendedor());
        //System.out.println("Código do vendedor: " + cliente.getCodigoVendedor());
    }
}
