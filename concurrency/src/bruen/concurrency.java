package bruen;

import java.util.*;


public class concurrency {
    public static void main(String[] args) {

        //initialize array
        int[] bigArray = new int[200000000];
        Random rn = new Random();

        //Populate array with random number between 1 and 10
        for(int i =0; i < 200000000; i++)
        {
            bigArray[i] = rn.nextInt(10) + 1;
        }


        //Running and timing normal sum function
        long sumStart = System.nanoTime();
        int normalSum = sum(bigArray);
        long sumEnd = System.nanoTime();
        long sumNano = (sumEnd - sumStart);

        //Print results
        System.out.println("Normal sum: " + normalSum);
        System.out.println("Time in Nanoseconds: " + sumNano);

        //running and timing threaded sum function
        long threadStart = System.nanoTime();
        int threadSum = threadSum(bigArray);
        long threadEnd = System.nanoTime();
        long threadNano = (threadEnd- threadStart);

        System.out.println("Two threads are used here to calculate the sum concurrently");
        System.out.println("Thread sum: " + threadSum);
        System.out.println("Time in Nanoseconds: " + threadNano);



    }

    //normal sum function
    public static int sum(int[] array){
        int result = 0;
        for(int i = 0;i < array.length; i++){
            result += array[i];
        }
        return result;
    }
    //threaded sum function
    public static int threadSum(int[] array){
        Summer summer1 = new Summer(array,0, array.length /2);
        Summer summer2 = new Summer(array, array.length/2, array.length);

        Thread thread1 = new Thread(summer1);
        Thread thread2 = new Thread(summer2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException ie){}

        int th1 = summer1.getSum();
        int th2 = summer2.getSum();

        return th1 + th2;
    }
}
//class the threaded sum function uses to operate
class Summer implements Runnable {

    int sum = 0;
    int start;
    int end;
    int[] array;

    Summer(int[] array, int start, int end){

        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum(){
        return sum;

    }

    @Override
    public void run() {
        for(int i=start; i < end; i++){
            sum += array[i];
        }
    }
}