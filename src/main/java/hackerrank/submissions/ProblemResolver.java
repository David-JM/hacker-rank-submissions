package hackerrank.submissions;

public interface ProblemResolver<IN, OUT> {

    OUT solve(IN input);
}
