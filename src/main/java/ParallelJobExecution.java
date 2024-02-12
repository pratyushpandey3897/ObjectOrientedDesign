/* There are n jobs that can be executed in parallel on a processor, where the execution time of the th job is executionTime[i]. To speed up execution, the following strategy is used.
In one operation, a job is chosen, the major job, and is executed for × seconds. All other jobs are executed for y seconds where y < x.
A job is complete when it has been executed for at least executionTime[i] seconds, then it exits the pool. Find the minimum number of operations in which the processor can completely execute all the jobs if run optimally.
Example
Consider n = 5, execution Time = [3, 4, 1, 7, 6], x = 4 and y = 2.
The following strategy is optimal using 1-based indexing.
Choose job 4 as the major job and reduce the execution times of job 4 by × = 4 and of other jobs by y = 2. Now executionTime = [1, 2, -1, 3,
4]. Job 3 is complete, so it is removed.
• Choose job 4, executionTime = (-1, 0, -, -1, 2]. So, jobs 1, 2, and 4 are now complete.
• Choose job 5, executionTime = I - -
- -2]. Job 5 is complete.
It takes 3 operations to execute all the jobs so the answer is 3.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ParallelJobExecution {
    public static int minOperations(List<Integer> executionTime, int x, int y) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(executionTime);

        int operations = 0;
        while (!pq.isEmpty()) {
            int majorJob = pq.poll();
            operations++;
            List<Integer> removedJobs = new ArrayList<>();
            for (int job : pq) {
                if (job - y > 0)
                    removedJobs.add(job - y);
            }
            pq.clear();
            pq.addAll(removedJobs);
            majorJob -= x;
            if (majorJob > 0) {
                pq.offer(majorJob);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        List<Integer> executionTime = new ArrayList<>();
        executionTime.add(3);
        executionTime.add(3);
        executionTime.add(6);
        executionTime.add(3);
        executionTime.add(9);
        int x = 4;
        int y = 2;

        int minOps = minOperations(executionTime, x, y);
        System.out.println("Minimum number of operations: " + minOps);
    }
}
