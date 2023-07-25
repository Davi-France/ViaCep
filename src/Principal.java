import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        String busca = "";
        Scanner leitura = new Scanner(System.in);
        ArrayList listaCep = new ArrayList<>();


        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Para sair do programa digite 'sair'");
            System.out.println("Digite um cep para ser pesquisado");
            String cep = leitura.nextLine();

            if (cep.equalsIgnoreCase("sair")){
                break;
            }

            if(cep.length() != 8){
                System.out.println("Digite um valor de até 8 digitos");
            }

            try{
            BuscarCep novoCep = new BuscarCep();
            Endereco novoEndereco = novoCep.BuscaEndereco(cep);
            listaCep.add(novoEndereco);
            GeradorArquivo file = new GeradorArquivo();
            file.Gerar(listaCep);
                System.out.println("Cep incluido.");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println(listaCep);
    }


}
