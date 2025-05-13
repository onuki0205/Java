class MyRectangle {
    private int i;
    private RectanglePlus result;
    private RectanglePlus[] r = new RectanglePlus[3];
    public MyRectangle(){
        r[0] = new RectanglePlus(10,200);
        r[1] = new RectanglePlus(40,50);
        r[2] = new RectanglePlus(5,10);
    }
    public String findLargest(){
        result = r[0];
        for(i=1;i<3;i++){;
            if(r[i].isLargerThan(result) == 1){
                result = r[i];
            }
        }
        return "The largest object is " + result.getPrimeter();
    }
}

