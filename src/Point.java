public class Point {
    public float x = 0;
    public float y = 0;

    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] team = new float[2];
        team[0] = this.x;
        team[1] = this.y;
        return team;
    }
    @Override
    public String toString(){
        return this.x + " " + this.y +" "+ this.getXY();
    }
}
