    public int fibonacci(int n) {
        // write your code here
        if (n == 1) return 0;
        if (n == 2) return 1;
        int [] f = new int [n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++){
            f[i] = f[i - 2] + f[i - 1];
        }
        return f[n-1];
    }
