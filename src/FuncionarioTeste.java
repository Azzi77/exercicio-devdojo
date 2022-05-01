public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();  // chamando o objeto funcionario

        funcionario.nome = "Sanji";
        funcionario.idade =23;
        funcionario.salarios = new double[] {1200, 987.32, 2000}; // como são 3 salario preciso informar os valores

       funcionario.imprime();  // chama o metodo imprime criado na classe funcionario
       funcionario.imprimeMediaSalario(); // para imprimir a media salarial


    }


}
