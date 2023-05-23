public class Student {
    public int id;
    public String name;
    double physics_mark,chemistry_mark,math_mark;
    Student(){}
    Student(int id,String name, double physics_mark,double chemistry_mark,double math_mark)
    {
        this.id=id;
        this.physics_mark=physics_mark;
        this.name=name;
        this.chemistry_mark=chemistry_mark;
        this.math_mark=math_mark;
    }
    @Override
        public String toString(){
        return id+" "+name+" "+physics_mark+" "+chemistry_mark+" "+math_mark;
        }

}
