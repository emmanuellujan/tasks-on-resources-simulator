package Model.LogginSystem;

import java.util.Vector;

import Model.DataModel.Configurator.Configurator;
import Model.DataModel.SimulationTime.SimulationTime;
import Model.IOSystem.FileManager;

public abstract class FileLogginSystem extends LogginSystem {
	protected String outputFileName;
	protected FileManager fileManager;

	public FileLogginSystem(Configurator configurator,
			Vector<SimulationTime> simulationTimes) {
		super(configurator, simulationTimes);
		FileManager fileManager = new FileManager();
		this.setFileManager(fileManager);
	}

	public FileManager getFileManager() {
		return fileManager;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setFileManager(FileManager fileManager) {
		this.fileManager = fileManager;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	protected void writeFile(String s) {
		System.out.println(this.getOutputFileName());
		this.getFileManager().writeFile(this.getOutputFileName(), s);
	}

}
