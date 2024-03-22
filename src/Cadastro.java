import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {
    public Map<String, Cliente> clientes;

    public Cadastro() {
        clientes = new HashMap<>();

        adicionarClientesPredefinidos();
    }

    private void adicionarClientesPredefinidos() {
        clientes.put("15228860010", new Cliente("Tiziu", "15228860010"));
        clientes.put("03647764043", new Cliente("Marcelo Revende", "03647764043"));
        clientes.put("01800377061", new Cliente("Tatá", "01800377061"));
        clientes.put("04096170089", new Cliente("Teté", "04096170089"));
        clientes.put("59893463017", new Cliente("Del. Acerola", "59893463017"));
        clientes.put("84236119064", new Cliente("Sol. Januário", "84236119064"));
        clientes.put("20832752096", new Cliente("Mão Negra", "20832752096"));
        clientes.put("85287202091", new Cliente("Coxinha", "85287202091"));
        clientes.put("62888165074", new Cliente("Doquinha", "62888165074"));
        clientes.put("87887188083", new Cliente("Cornelho", "87887188083"));
        clientes.put("29887941034", new Cliente("Gilda", "29887941034"));
        clientes.put("22259554091", new Cliente("Chicão", "22259554091"));
        clientes.put("13259828060", new Cliente("Otasilho", "13259828060"));
        clientes.put("41300448008", new Cliente("Elenilson jr", "41300448008"));
        clientes.put("99269377059", new Cliente("Chico Pezão", "99269377059"));
        clientes.put("43465228073", new Cliente("Pai Babozinha", "43465228073"));
    }

    public void cadastrarCliente() {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O NOME DO CLIENTE:");
        cliente.setNome(scanner.nextLine());
        System.out.println("DIGITE O CPF DO CLIENTE:");
        cliente.setCPF(scanner.nextLine());
        clientes.put(cliente.getCPF(), cliente);
        System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
    }

    public void mostrarClientes() {
        System.out.println("CLIENTES CADASTRADOS:");
        for (Map.Entry<String, Cliente> clienteEntry : clientes.entrySet()) {
            Cliente cliente = clienteEntry.getValue();
            System.out.println("NOME: " + cliente.getNome() + ", CPF: " + cliente.getCPF());
        }
    }

    public void mostrarPorCPF(String cpf) {
        if (clientes.containsKey(cpf)) {
            Cliente cliente = clientes.get(cpf);
            System.out.println("CLIENTE LOCALIZADO:\nNOME: " + cliente.getNome() + ", CPF: " + cliente.getCPF());
        } else {
            System.out.println("CLIENTE NÃO LOCALIZADO");
        }
    }

    public void cadastrarCliente(HashMap<String, Cliente> clientes2, Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarCliente'");
    }

    public void mostrarClientes(HashMap<String, Cliente> clientes2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarClientes'");
    }

    public void mostrarPorCPF(HashMap<String, Cliente> clientes2, String cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarPorCPF'");
    }
}