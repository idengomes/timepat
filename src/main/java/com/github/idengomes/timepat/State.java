package com.github.idengomes.timepat;

public enum State {
	IDLE, // not counting; reset action
	RUNNING, // currently counting
	PAUSED // when counting time stopped
}
