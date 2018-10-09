import { NativeModules } from 'react-native';

const { RNSocketTcpClient } = NativeModules;

export default class TcpClient {
	sendData(address, port, stringData) {
		RNSocketTcpClient.sendData(address, port, stringData);
	}
};
