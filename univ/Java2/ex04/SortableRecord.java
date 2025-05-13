public class SortableRecord extends Record implements Comparable<SortableRecord>{

    public SortableRecord(String id,int m,int j,int e){
        super(id,m,j,e);
    }

    public int compareTo(SortableRecord s){
        if(s.score_total > super.score_total) return 1;
        else if(s.score_total < super.score_total) return -1;

        if(s.score_math > super.score_math) return 1;
        else if(s.score_math < super.score_math) return -1;
        
        if(s.score_Japanese > super.score_Japanese) return 1;
        else if(s.score_Japanese < super.score_Japanese) return -1;
        
        if(s.score_English > super.score_English) return 1;
        else if(s.score_English < super.score_English) return -1;
        
        else return 0;


    }

}
