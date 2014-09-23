package cn.com.axiom.system.service;

public class ServerConfig {

	private String ermrAddr;

	private String sessionHistoryBackup;

	private boolean dataWarehouseSendFlag;

	private String dataWarehouseUrl;

	public String getSessionHistoryBackup() {
		return sessionHistoryBackup;
	}

	public void setSessionHistoryBackup(String sessionHistoryBackup) {
		this.sessionHistoryBackup = sessionHistoryBackup;
	}

	public String getErmrAddr() {
		return ermrAddr;
	}

	public void setErmrAddr(String ermrAddr) {
		this.ermrAddr = ermrAddr;
	}

	public boolean isDataWarehouseSendFlag() {
		return dataWarehouseSendFlag;
	}

	public void setDataWarehouseSendFlag(boolean dataWarehouseSendFlag) {
		this.dataWarehouseSendFlag = dataWarehouseSendFlag;
	}

	public String getDataWarehouseUrl() {
		return dataWarehouseUrl;
	}

	public void setDataWarehouseUrl(String dataWarehouseUrl) {
		this.dataWarehouseUrl = dataWarehouseUrl;
	}
}
