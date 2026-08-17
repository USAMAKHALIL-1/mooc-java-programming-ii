public class CustomTacoBox implements TacoBox {
    int tacos;

   public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos--;
        } else {
            System.out.println("dont have any taco");
        }
    }

    public int tacosRemaining() {
        return this.tacos;
    }

}
