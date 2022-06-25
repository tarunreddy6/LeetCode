// Happy Coding:)

public boolean isIsomorphic(String s, String t) {
                
        char [] s1 = sString.toCharArray();
        char [] t1 = tString.toCharArray();
        int [] smap = new int [144];
        int [] tmap = new int [144];
        for (int i = 0; i < s1.length; i++) {
            if (smap[s1[i]] == 0 && tmap[t[i]] == 0) {
                smap[s1[i]] = t1[i];
                tmap[t1[i]] = s1[i];
            } else if (smap[s1[i]] != t1[i]) return false;
        }
        return true;              
    }
