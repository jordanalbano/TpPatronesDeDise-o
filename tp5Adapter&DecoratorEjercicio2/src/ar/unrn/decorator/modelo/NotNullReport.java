package ar.unrn.decorator.modelo;

import java.io.File;

public class NotNullReport implements Report {
	private final Report report;

	public NotNullReport(Report report) {
		this.report = report;
	}

	@Override
	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File is NULL; can't export.");
		}
		this.report.export(file);
	}
}