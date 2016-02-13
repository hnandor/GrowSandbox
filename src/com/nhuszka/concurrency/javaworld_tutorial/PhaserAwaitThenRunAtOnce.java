package com.nhuszka.concurrency.javaworld_tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

// http://www.javaworld.com/article/2078809/java-concurrency/java-concurrency-java-101-the-next-generation-java-concurrency-without-the-pain-part-1.html?page=4
public class PhaserAwaitThenRunAtOnce {

	public static void main(String[] args) {
		List<Runnable> tasks = new ArrayList<>();
		tasks.add(new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s running at %d%n",
						Thread.currentThread().getName(),
						System.currentTimeMillis());
			}
		});
		tasks.add(new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s running at %d%n",
						Thread.currentThread().getName(),
						System.currentTimeMillis());
			}
		});
		runTasks(tasks);
	}

	static void runTasks(List<Runnable> tasks) {
		final Phaser phaser = new Phaser(1); // "1" to register self
		// create and start threads
		for (final Runnable task : tasks) {
			phaser.register();
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(50 + (int) (Math.random() * 300));
					} catch (InterruptedException ie) {
						System.out.println("interrupted thread");
					}
					phaser.arriveAndAwaitAdvance(); // await all creation
					task.run();
				}
			}.start();
		}

		// allow threads to start and deregister self
		phaser.arriveAndDeregister();
	}
}