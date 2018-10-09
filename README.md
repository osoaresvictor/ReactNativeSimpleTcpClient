
# react-native-socket-tcp-client

A simple tcp cliente sender.

## Getting started

`$ npm install react-native-socket-tcp-client --save`

### Mostly automatic installation

`$ react-native link react-native-socket-tcp-client`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.soaresvictor.RNSocketTcpClientPackage;` to the imports at the top of the file
  - Add `new RNSocketTcpClientPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-socket-tcp-client'
  	project(':react-native-socket-tcp-client').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-socket-tcp-client/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-socket-tcp-client')
  	```
## Usage
```javascript
import RNSocketTcpClient from 'react-native-socket-tcp-client';
