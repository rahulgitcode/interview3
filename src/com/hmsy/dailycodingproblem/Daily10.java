package com.hmsy.dailycodingproblem;
/*
 * 
Daily Coding Problem: Problem #10 [Medium]

This problem was asked by Apple.

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Daily10 {
	private static ScheduledExecutorService executor;
	
	public static void main(String[] args) {
		
		executor = Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture<?> future = solution(()-> System.out.println("Hello World"), 5000);
		executor.shutdown();
		executor = null;
	}

	private static ScheduledFuture<?> solution(Runnable command, int delay_ms) {
		return executor.schedule(command, delay_ms, TimeUnit.MILLISECONDS);
	}

}
