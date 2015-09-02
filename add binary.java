public String addBinary(String a, String b) {
        // Write your code here
        //保证a是较长的那个string
        if (a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int bi = b.length() - 1;
        int ai = a.length() - 1;
        String result = "";
        int carries = 0;
        //在两个string都有数值时，将他们的每一位相加并加上carrie得到sum，sum/2 为进位，sum%2 为这一位的值
        while(bi >= 0){
            int sum = (int)(a.charAt(ai) - '0') + (int)(b.charAt(bi) - '0' )+ carries;
            result = String.valueOf(sum%2) + result;
            carries = sum/2;
            bi--;
            ai--;
        }
        while(ai >= 0){
            int sum = (int)(a.charAt(ai) - '0') + carries;
            result = String.valueOf(sum%2) + result;
            carries = sum/2;
            ai--;
        }
        //如果最后还有进位，则将1加入result的起始位置
        if (carries == 1)
            result = "1" + result;
        return result;
    }
}
          result = "1" + result;
        }
        return result;
    }
