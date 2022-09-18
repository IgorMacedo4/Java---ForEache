/*2)Faça um programa em Java que contenha uma Matriz. Esta matriz
  deverá conter a placa e o modelo de um veículo. Usando o comando 
  for e for-each exiba na tela a lista de veículos. */
public class matriz {
   public static String [][] Matriz_carros = {{"FPN-7433","fORD KA",},{"SAN-6666","HB20"},
   {"POI-2233","BMW"}}; 
   
    public static void exibir_matriz() {
        System.out.println("--Segunda Questão--");
             for(int i=0; i<Matriz_carros.length; i++){
                 for(int j=0; j<Matriz_carros[i].length; j++){
                    System.out.println(Matriz_carros[i][j]);
                     } 
                 }      
    }
    public static void exibir_forEach_Matriz() { 
        System.out.println("--ForEach--");
            for(String[] i: Matriz_carros){
                for(String j:i){
                System.out.println(j);
            }  
        }
    }
}
