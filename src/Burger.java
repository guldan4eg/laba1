public class Burger extends Food{
    enum Size {SMALL,MEDIUM,LARGE};
    private Size size;

    public Burger(Size size){
        this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }


    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return "Burger{" + "size=" + size + ", calories=" + calculateCalories() + '}';
    }

    @Override
    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    @Override
    public int calculateCalories() {
        return switch (getSize()) {
            case SMALL -> 150;
            case MEDIUM -> 250;
            case LARGE -> 350;
            default -> 0;
        };
    }

}
