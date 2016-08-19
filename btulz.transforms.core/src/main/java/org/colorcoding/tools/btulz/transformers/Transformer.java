package org.colorcoding.tools.btulz.transformers;

import java.util.ArrayList;

public abstract class Transformer implements ITransformer {

	private boolean keeepResults;

	public boolean isKeepResults() {
		return this.keeepResults;
	}

	public void setKeepResults(boolean value) {
		this.keeepResults = value;
	}

	private boolean interruptOnError;

	public boolean isInterruptOnError() {
		return this.interruptOnError;
	}

	public void setInterruptOnError(boolean value) {
		this.interruptOnError = value;
	}

	private ArrayList<Exception> errors;

	/**
	 * 获取运行时错误
	 * 
	 * @return
	 */
	public Exception[] getErrors() {
		return errors.toArray(new Exception[] {});
	}

	/**
	 * 记录错误
	 * 
	 * @param error
	 */
	protected void logError(Exception error) {
		if (error == null) {
			return;
		}
		if (this.isInterruptOnError()) {
			throw new RuntimeException(error);
		}
		if (this.errors == null) {
			this.errors = new ArrayList<Exception>();
		}
		this.errors.add(error);
	}

}