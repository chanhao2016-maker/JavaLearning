
public class Main35{
    public static void main(String[]args){

        // 2D array = an array where each element is an array
        //            useful for storing a matrix of data

        String [] fruits = {"apple", "orange", "banana"};
        String [] vegetables = {"cucumber", "tomato", "onions"};
        String [] meats = {"chicken", "pork", "fish" , "beef"};

        String[][] groceries = {{"apple", "orange", "banana"},
                               {"cucumber", "tomato", "onions"},
                               {"chicken", "pork", "fish" , "beef"}};

        groceries[0][0] = "pineapple";
        groceries[1][0] = "potato";
        groceries[2][0] = "abracadabra";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }

            System.out.println();
        }

        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}