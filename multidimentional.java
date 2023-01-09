public class multidimentional {
    public static void main(String[] args) {
        int [][]marks = new int[3][4];
        marks[0][0] = 5;
        marks[0][1] = 6;
        marks[0][2] = 7;
        marks[0][3] = 1;
        marks[1][0] = 10;
        marks[1][1] = 5;
        marks[1][2] = 9;
        marks[1][3] = 10;
        marks[2][0] = 11;
        marks[2][1]=12;
        marks[2][2]=13;
        marks[2][3]=15;
        for(int i =0;i<marks.length; i++){
            for(int j=0;j<marks[i].length; j++ ){
                System.out.print(marks[i][j]);
                System.out.println(" ");
            }
            System.out.println("");


        }
        float [] category = {13.0f,8.5f,78.7f,89.5f};
        float sum = 0;
        for(float ele:category){
            sum += ele;

        }
        System.out.println(sum);
//        System.out.print(marks[0][0]);
    }
}
