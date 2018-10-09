
# react-native-socket-tcp-client

## Getting started

`$ npm install react-native-socket-tcp-client --save`

### Mostly automatic installation

`$ react-native link react-native-socket-tcp-client`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-socket-tcp-client` and add `RNSocketTcpClient.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSocketTcpClient.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSocketTcpClient.sln` in `node_modules/react-native-socket-tcp-client/windows/RNSocketTcpClient.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Socket.Tcp.Client.RNSocketTcpClient;` to the usings at the top of the file
  - Add `new RNSocketTcpClientPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSocketTcpClient from 'react-native-socket-tcp-client';

// TODO: What to do with the module?
RNSocketTcpClient;
```
  