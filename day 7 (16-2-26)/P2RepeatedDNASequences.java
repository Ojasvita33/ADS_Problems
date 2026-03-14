//#187 - Repeated DNA Sequences
import java.util.*;
class P2RepeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        int window=10;
        List<String>result=new ArrayList<>();
        if(n<window)return result;
        Map<Character,Integer>map=new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        int base=4;
        int hash=0;
        int power=1;
        for(int i=0;i<window-1;i++){
            power*=base;
        }
        Set<Integer>seen=new HashSet<>();
        Set<String>added=new HashSet<>();
        for(int i=0;i<window;i++){
            hash=hash*base+map.get(s.charAt(i));
        }
        seen.add(hash);
        for(int i=window;i<n;i++){
            hash=hash-map.get(s.charAt(i-window))*power;
            hash=hash*base+map.get(s.charAt(i));
            if(seen.contains(hash)){
                String substring=s.substring(i-window+1,i+1);
                added.add(substring);

            }else{
                seen.add(hash);
            }
        }
        result.addAll(added);
        return result;
        
    }
    public static void main(String[] args) {
        String s;
        if(args.length>=1){
            s=args[0];
        }else{
            s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        }
        List<String>result=findRepeatedDnaSequences(s);
        System.out.println(result);
    }
}