    private int maxLength(Set<String> dict){
        int len=dict.size();
        int max=0;
        for(String s:dict){
            if(s.length()>max) max=s.length();
        }
        return max;
    }
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here 
        if(s==null||s.length()==0) return true;
        int len=s.length();
        int maxlength=maxLength(dict);
        boolean[] result=new boolean[len+1];
        //Intialize
        result[0]=true;
        //function
        for(int i=1;i<len+1;i++){
            result[i]=false;
            for(int j=1;j<=maxlength&&j<=i;j++){
                if(result[i-j]!=true) continue;
                String temp=s.substring(i-j,i);
                if(dict.contains(temp)) {result[i]=true; break;}
            }
        }
        return result[len];
        
        
    }
