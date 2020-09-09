package my_spring;

public class BenchMarkCleanerImpl extends CleanerImpl {

    @Override
    public void clean() {
        long startTime = System.nanoTime();
        super.clean();
        long endTime   = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
