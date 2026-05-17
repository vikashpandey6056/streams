import java.util.*;
import java.util.stream.*;
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str="dvdf";

        String StrOvrLen[][]=new String[str.length()][2];
        for(int i=0;i<str.length();i++){
            StrOvrLen[i][1]="true";
        }
        int i[]={1};

        str.chars()
                .forEach(s->{char ch = (char) s;
                    IntStream.iterate(0,itr->itr<i[0],itr->itr+1)
                            .forEach( num->{
                                if(StrOvrLen[num][0]==null){
                                    StrOvrLen[num][0]=ch+"";
                                }
                                else if(StrOvrLen[num][1].equals("true")&&!StrOvrLen[num][0].contains(ch+"")){
                                    String indexStr=StrOvrLen[num][0]+ch;
                                    StrOvrLen[num][0]=indexStr;
                                }else{
                                    StrOvrLen[num][1]="false";
                                }
                            });
                    i[0]++ ;});

        String lNrSs = Arrays.stream(StrOvrLen)
                .filter(Objects::nonNull)
                .sorted((a,b)->b[0].length()-a[0].length())
                .map(e->e[0])
                .findFirst()
                .orElse("");

        System.out.println(lNrSs);





    }
}
