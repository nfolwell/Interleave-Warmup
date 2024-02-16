import java.util.*;
public class InterleaveWarmup
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList<String>();
        System.out.print("Enter words for your first list (\"quit\" to end): ");
        String input = "";
        input = s.nextLine();
                l1.add(input);
        while (!input.equals("quit"))
        {
                System.out.print("Next word (\"quit\" to end): ");
                input = s.nextLine();
                if (!input.equals("quit")) {
                  l1.add(input);
                }
        }
        System.out.println("l1 = "+l1);
        ArrayList<String> l2 = new ArrayList<String>();
        System.out.print("Enter words for your second list (\"quit\" to end): ");
        input = s.nextLine();
        l2.add(input);
        while (!input.equals("quit"))
        {
                System.out.print("Next word (\"quit\" to end): ");
                input = s.nextLine();
                if (!input.equals("quit")) {
                  l2.add(input);
                }
        }
        System.out.println("l2 = "+l2);
        interleave(l1,l2);
        System.out.println("After itnerleave(l1,l2): "+l1);
        
    }
    public static void interleave(ArrayList<String> a1, ArrayList<String> a2)
    {
        for (int i = 0; i < Math.min(a1.size(),a2.size()); i++)
        {
            a1.add(2*i + 1, a2.get(i));
        }
    }
}
