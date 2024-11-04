import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o número de linhas: ");
        int l = sc.nextInt();
        System.out.println("Digite o número de colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];


        for (int i=0;i<l;i++){
            for (int j=0;j<c;j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<l;i++){
            for (int j=0;j<c;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Digite o número a ser buscado: ");
        int x = sc.nextInt();

        for (int i=0;i<l;i++){
            for (int j=0; j<c;j++){
                if (matriz[i][j] == x){
                    System.out.println("Position " + i + ", " + j + ":");
                    if(j > 0){
                        System.out.println("left " + matriz[i][j-1]);
                    }
                    if (j < c - 1){
                        System.out.println("Right " + matriz[i][j+1]);
                    }
                    if(i < c - 1){
                        System.out.println("Down " + matriz[i+1][j]);
                    }
                    if (i > 0){
                        System.out.println("Up " + matriz[i-1][j]);
                    }
                }
            }
        }

        System.out.println("Diagonal");
       for (int i=0;i<l;i++){
           System.out.printf(matriz[i][i] + " ");
       }
        System.out.println();

        sc.close();
    }
}
