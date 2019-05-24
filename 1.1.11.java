public class Main {
    public static void main(String[] args) {
        boolean[][] list = {{true, false},{false, true},{true,true,true}};
        String result = "";
        for(int i = 0; i<list.length; i++)
            for(int j = 0; j<list[i].length; j++)
                result = result + i + j + (list[i][j] ? "*" : " ");
        System.out.println(result);
    }
}
