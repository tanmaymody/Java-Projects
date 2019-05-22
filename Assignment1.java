package assignment.pkg1;

import java.util.ArrayList;
import java.util.Scanner;


public class Assignment1 
{
    public static void main(String[] args) 
    {
        ArrayList<Guess> guesses= new ArrayList<>();
        System.out.println("We have chosen a rule that some sequences of three numbers obey and some don't");
        System.out.println("We will start by telling you that [3 9 27] follow the rule");
        Scanner guess=new Scanner(System.in);
        Guess a= new Guess(3,9,27,true);
        guesses.add(a);
        
        
        
        boolean done = false;
        while(!done)
        {   
            System.out.println("Guess the rule or try an input with three numbers");
            String input=guess.nextLine();
            if (input.equalsIgnoreCase("Answer"))
                {
                    System.out.println("What do you think the rule is?");
                    String answer=guess.nextLine();
                    System.out.println("It always goes in increasing order");
                    System.exit(0);
                }
            else if (input.equalsIgnoreCase("previous"))
                {
                    System.out.println(guesses);
                }
            else
                {
                    try
                    {
                        String numbers[]=input.split(" ");
                        int integers[] = new int[numbers.length];

                        for(int i=0; i<numbers.length; i++)
                            {
                                integers[i]= Integer.parseInt(numbers[i]);
                            }
                        boolean rw;

                        if(numbers.length>3)
                        {
                          System.err.println("Input incorrect");                            
                          rw=false;
                        }
                        else if(integers[0] < integers[1] && integers[1] < integers[2])
                            {
                                System.out.println("Yes it follows the rule \n");
                                rw=true;
                            }
                        else
                            {
                                System.out.println("No it doesn't follow the rule \n");
                                rw=false;
                            }
                        Guess g = new Guess(integers[0], integers[1], integers[2], rw);
                        guesses.add(g);
                    }catch(Exception e)
                    {
                        System.err.println("Input incorrect \n");
                    }
                }
        }
    }
}
  