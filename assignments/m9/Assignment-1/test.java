if(n == 0){
            fibo.add(0);
        }else if (n==1){
            fibo.add(0);
            fibo.add(1);
        }else {
            fibo.add(0);
            fibo.add(1);
            fibo.add(1);
            int n1 = 1;
            int n2 = 1;
            int fibno = 1;
            for(int i = 3;i<=n;i++) {
                fibno = n1 + n2;
                n1 = n2;
                n2 = fibno;
                fibo.add(fibno);
        }

        }return fibo;