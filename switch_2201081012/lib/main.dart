import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MySwitch(),
    );
  }
}

class MySwitch extends StatefulWidget {
  @override
  State<MySwitch> createState() => _MySwitchState();
}

class _MySwitchState extends State<MySwitch> {
  Color darkAppBar = Color.fromARGB(255, 45, 45, 48);
  Color lighAppBar = Colors.blue;

  bool switchStatus = false;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Switch"),
        centerTitle: true,
        backgroundColor: (switchStatus == false) ? lighAppBar : darkAppBar,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Container(
              width: 400,
              height: 200,
              child: Image.asset((switchStatus == false)
                  ? "images/LOGO.png"
                  : "images/images.png"),
            ),
            Switch(
              activeColor: darkAppBar,
              inactiveThumbColor: lighAppBar,
              activeThumbImage: AssetImage("images/darksky.jpg"),
              inactiveThumbImage: AssetImage("images/lighsky.jpg"),
              trackOutlineColor: MaterialStatePropertyAll(Colors.blue),
              value: switchStatus,
              onChanged: (value) {
                setState(
                  () {
                    switchStatus = !switchStatus;
                  },
                );
              },
            ),
            Text((switchStatus == false) ? "Light" : "Dark")
          ],
        ),
      ),
    );
  }
}