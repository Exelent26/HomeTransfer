package lvl12.ClassesAndStatics;

public class HeartOfCar {
    Engine enigine = new Engine();
    public class Engine{
        private boolean isRunning;
        private  void start(){
            this.isRunning = true;

        }
        private  void stop(){
            this.isRunning = false;

        }
    }
}
