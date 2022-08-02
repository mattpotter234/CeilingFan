public class CeilingFan {

    protected boolean isReversed;
    protected int speed;

    public CeilingFan() {
        this.isReversed = false;
        this.speed = 0;
    }
    
    public void setSpeed(int s){
        this.speed = s;
    }
    public int getSpeed(){
        return speed;
    }
    public void setIsReversed(boolean r){
        this.isReversed = r;
    }
    public boolean getIsReversed(){
        return isReversed;
    }
    
    // PullCord1
    public void changeSpeed(){
        // 3 speed settings
        if(getSpeed()<3) setSpeed(getSpeed()+1);
        // off    
        else setSpeed(0);
    }
    // PullCord2
    public void changeDirection(){
        setIsReversed(!getIsReversed());
    }
    
    @Override
    public String toString(){
        if(isReversed)
            return "Speed: "+getSpeed()+", Reversed: true";
        else 
            return "Speed: "+getSpeed()+", Reversed: false";
    }

}
