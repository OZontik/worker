package zozo.company;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
