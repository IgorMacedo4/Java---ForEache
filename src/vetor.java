/* 1) Faça um programa em Java que contenha um vetor contendo
 os meses do ano. Usando o comando for e o for-each exiba
 na tela a lista de meses. */
public class vetor {
    public static String [] meses = {"Janeiro","Fevereiro","Março","Abrio","Maio","Junho",
    "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

    public static void exibir_for() {
        System.out.println("--Primeira Questão--");
           for(int i=0; i<meses.length; i++){
            System.out.println((i+1)+"° mês :" + meses[i]);
         }
    }
    public static void exibir_forEach(){
        System.out.println("--ForEach--");
         for(String i: meses){
            System.out.println("mês :" +i);
           }
    }
    
}
