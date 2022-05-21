package ar.unrn.decorator.modelo;

import java.io.File;

public class NotWriteOverReport implements Report {

	private final Report report;

	public NotWriteOverReport(Report report) {
		this.report = report;
	}

	@Override
	public void export(File file) {
		if (!file.exists()) {
			throw new IllegalArgumentException("File already exist...");
		}
		this.report.export(file);
	}
}