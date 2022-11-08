package Assign_3;
import java.io.*;

public class DrugHeap {

    static BufferedReader daReader = null;
    public static Drug [] mH = new Drug[1932]; //Stand for min-Heap and stores the min heap in an array representation
    public static BufferedWriter daWriter;

    public static String[] []data = new String[1932][6]; //1932

    DrugHeap() throws IOException{
        daReader=null;
        readData();
    }








    private static void readData() throws IOException {

        int num=0;
        int collumn=0;

        daReader = new BufferedReader(new FileReader("dockedApproved.tab"));

        String temp = null;
        String[] temp2 =new String[6];
        daReader.readLine();
        do{
            temp = daReader.readLine();

            if (temp!=null){
                temp2=temp.split("\t");
                for(int i=0;i<6;i++){
                    data[num][i] = temp2[i];
                }
                num++;
            }

        }while(temp!=null);



        /*
         for (int i=0;i< data.length;i++){
             for (int j=0; j<6;j++){
                 System.out.print(data[i][j]+"\t");
             }
             System.out.println();

         }

         */




    }
}
