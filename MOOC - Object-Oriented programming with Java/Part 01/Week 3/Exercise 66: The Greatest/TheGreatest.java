import java.util.ArrayList;
//import java.util.Collections;

public class TheGreatest 
{
    public static int greatest(ArrayList<Integer> list) 
    {
        // write code here
        //Collections.sort(list);
        int great = list.get(0);
        for(int i : list)
        {
            if(great < i)
                great = i;
        }
        
        return great;
        //return list.get(list.size() - 1);
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
