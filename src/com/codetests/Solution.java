package com.codetests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        int sockCounter = 1;

        Arrays.sort(ar);

        for(int i = 0; i < n - 1; i++){
            if(ar[i] == ar[i+1]){
                sockCounter++;
            }
            else{
                result = result + (sockCounter/2);
                sockCounter = 1;
            }
        }
        result = result + (sockCounter/2);

        return result;
    }

    public static void main(String[] args) throws IOException {
        int n = 20;

        int[] ar = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};

        int sockPairs = sockMerchant(n, ar);
        System.out.println(sockPairs);
    }
}

