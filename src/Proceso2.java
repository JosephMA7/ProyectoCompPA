public class Proceso2 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(4000);
            for(int i = 0; i<=100; i++){
                System.out.println("Hola soy un hilo del proceso2");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
