import java.util.Scanner;

public class DiarioDeNotas01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para aluno e 2 para professor");
        String usuario = sc.nextLine();

        switch(usuario){
            case "1":
            System.out.println("Aluno");
            break;

            case "2":
            System.out.println("Professor");
            break;
            default:

    }
}
}