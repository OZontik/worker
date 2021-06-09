package zozo.company;


public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callback1;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callback1) {
        this.callback = callback;
        this.callback1 = callback1;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if(i == 33){
                callback1.onError("Task " + i + " is error");
            }else callback.onDone("Task " + i + " is done");
        }
    }

}
