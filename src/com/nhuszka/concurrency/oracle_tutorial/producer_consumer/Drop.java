package com.nhuszka.concurrency.oracle_tutorial.producer_consumer;

public class Drop {
	// Message sent from producer to consumer
	private String message;
	// True: if consumer should wait for producer to send message
	// False: if producer should wait for consumer to retrieve message
	private boolean empty = true;

	public synchronized String take() {
		// Wait until message is available.
		while (empty) {
			try {
				System.out.println("TAKE wait");
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Toggle status.
		empty = true;
		// Notify producer that status has changed.
		notifyAll();
		return message;
	}

	public synchronized void put(String message) {
		// Wait until message has been retrieved.
		while (!empty) {
			try {
				System.out.println("PUT wait");
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Toggle status.
		empty = false;
		// Store message.
		this.message = message;
		// Notify consumer that status has changed.
		notifyAll();
	}
}
