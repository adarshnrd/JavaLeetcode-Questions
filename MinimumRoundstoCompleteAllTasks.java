package com.company;
import java.util.Arrays;

public class MinimumRoundstoCompleteAllTasks {
public static void main(String args[]){
int tasks[] ={66,66,63,61,63,63,64,66,66,65,66,65,61,67,68,66,62,67,61,64,66,60,69,66,65,68,63,60,67,62,68,60,66,64,60,60,60,62,66,64,63,65,60,69,63,68,68,69,68,61};
    System.out.println(minimumRounds(tasks));

}
    public static int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int ans =0;
        int index =0;
        for(int i=0;i<tasks.length;i++){
            int ab =count(tasks,tasks[i],index);
            index+=ab;
            if(ab<2){
                return -1;
            }
            i+=(ab-1);
            int b =ab;
            if(ab==2){
                ans+=1;
            }
            else if(ab%3==0){
                while (true){
                    if(ab==0||ab==1){
                        break;
                    }
                    ab/=3;
                    ans+=ab;
                    ab%=3;
                }
            }
            else{
                while (true){//7
                    ab/=3;
                    int added =ab;
                    ans+=ab;
                    ab =b;
                    ab%=3;
                    if(ab==1||ab==2){
                        ans--;
                        ans+=2;
                        break;
                    }
                }
            }
        }
        if(ans==0){
            return -1;
        }
        return ans;
    }
    public static int count(int []tasks,int val,int j){
        int count =0;
        for(int i =j;i<tasks.length;i++){
            if(tasks[i]==val){
                count++;
            }
        }
        return count;
    }
}
/*int b =ab;
            i+=(ab-1);
            ab %=3;
            if(ab!=b){
                ans++;
            }
            int a =ab;
            ab%=2;

             if (ab!=a){
                if(ab==0){
                    ans++;
                }
            }*/