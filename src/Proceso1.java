public class Proceso1 extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(4000);
            for(int i = 0; i<=100; i++){
                System.out.println("Hola soy un hilo del proceso1");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
