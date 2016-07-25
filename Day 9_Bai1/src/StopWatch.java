/**
 * Created by ThangNguyen on 7/21/2016.
 */
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return  startTime = System.currentTimeMillis();
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long duration() {
        long duration = getEndTime() - getStartTime();
        return duration;
    }
}
