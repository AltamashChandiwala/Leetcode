class Solution {
            public boolean checkIfPangram(String sentence) {
            char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int count = 0;
            boolean value = false;
            for(int i=0 ; i<ch.length; i++){
                for(int j=0; j<sentence.length();j++){
                    if(ch[i] == sentence.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            return count == ch.length;
        }
}