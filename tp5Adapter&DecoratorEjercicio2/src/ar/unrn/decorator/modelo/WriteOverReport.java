package ar.unrn.decorator.modelo;

import java.io.File;

public class WriteOverReport implements Report {

	private Report report;

	public WriteOverReport(Report report) {
		this.report = report;
	}

	@Override
	public void export(File file) {
		if (file.exists()) {
			report.export(file);
		}
	}
}