/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module5homework;

import java.util.ArrayList;

/**
 *
 * @author Bruen
 */
public class Module5homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> recursiveN = new ArrayList<Integer>();
        ArrayList<Long> recursiveRuntime = new ArrayList<Long>();
        ArrayList<Integer> iterativeN = new ArrayList<Integer>();
        ArrayList<Long> iterativeRuntime = new ArrayList<Long>();
        ArrayList<Integer> recData = new ArrayList<Integer>();
        ArrayList<Integer> iterData = new ArrayList<Integer>();
        ArrayList<Long> recStart = new ArrayList<Long>();
        ArrayList<Long> recEnd = new ArrayList<Long>();
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        for(int i=1;i<=20;i++)
        {
            startTime = System.nanoTime();
            recData.add(recFib(i));
            endTime = System.nanoTime();
            recursiveN.add(i);
            recursiveRuntime.add(endTime - startTime);
        }

        System.out.println("recData: "+ recData);
        System.out.println("recursiveN: "+ recursiveN);
        System.out.println("recursiveRuntime: "+ recursiveRuntime);


        for(int i=1;i<=20;i++)
        {
            startTime = System.nanoTime();
            iterData.add(iterFib(i));
            endTime = System.nanoTime();
            iterativeN.add(i);
            iterativeRuntime.add(endTime - startTime);
        }
        System.out.println("iterData: "+ iterData);
        System.out.println("iterativeN: "+ iterativeN);
        System.out.println("iterativeRuntime: "+ iterativeRuntime);

    }


    static int recFib(int n)
    {
        if (n <= 1)
        {
            return n;
        } else
            {
            return recFib(n - 1) + recFib(n - 2);

             }
    }

    static int iterFib(int n)
    {
        int beforePrevious, previous = 0, currentNum = 1;

        for(int i = 1; i< n;i++)
        {
            beforePrevious=previous;

            previous = currentNum;

            currentNum = beforePrevious + previous;
        }

        return currentNum;

    }
    }
    

