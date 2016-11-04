package io.github.amarcinkowski.hackerrank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.amarcinkowski.hackerrank.exception.NotImplementedException;

public class Solution implements Command {

	private final static Logger logger = LoggerFactory.getLogger(Solution.class);

	public final static String BASE_PACKAGE = Solution.class.getPackage().getName();
	private final String name;

	public Solution(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Solution() {
		throw new NotImplementedException();
	}

	protected static void log(Object log) {
		if (System.getenv("LOGNAME").equals("amarcinkowski")) {
			logger.debug(log.toString());
		}
	}

	public void execute() {
		throw new NotImplementedException();
	}

	@Override
	public String toString() {
		return name;
	}

}