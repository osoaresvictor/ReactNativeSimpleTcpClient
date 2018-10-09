import { NativeModules } from 'react-native';

const { RNSocketTcpClient } = NativeModules;

export default class TcpClient {
	constructor(address, port){
		this.address = address;
		this.port = port;
	}

	sendData(stringData) {
		RNSocketTcpClient.sendData(this.address, this.port, stringData);
	}
};
