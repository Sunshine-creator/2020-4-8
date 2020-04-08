package cw0408;

import java.util.Arrays;

public class TestTree {
    public static void shfitDown(int [] arry,int size , int index){       //依小堆为例
        int parent =  index;  // 给定的值
        int child =  2 * parent +1;    //根据父节点求出左节点
        while (child < size){
            if(child +1 < size && arry[child+1] < arry[child]){   //在这里求出最小的
                child = child +1 ;
            }
            if (arry[child] > arry[parent]){
                int temp  =  arry[child];
                arry[child] = arry[parent];
                arry[parent] = temp;
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    public static  void  createHeap(int [] array, int size){
        for(int i =(size-1-1)/2;i>=0;i--){
            shfitDown(array,size,0);
        }
    }
    public static void main(String[] args) {
        int array[] = {2,5,1,9,3,8,11,43,36};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
