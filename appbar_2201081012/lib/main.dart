import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          leading: Container(
            color: Colors.amber,
          ),
          leadingWidth: 50,
          //title: Text("MY APPBAR"),
          title: Container(
            //width: 35,
            height: 35,
            color: Colors.pink,
          ),
          //titleSpacing: 0,
          centerTitle: true,
          actions: [
            Container(
              width: 50,
              color: Colors.purple,
            ),
            Container(
              width: 50,
              color: Colors.black,
            ),
          ],
          bottom: PreferredSize(
            preferredSize: Size.fromHeight(100),
            child: Container(
              width: 50,
              height: 50,
              color: Colors.black,
            ),
          ),
          flexibleSpace: Container(
            //width: 50,
            height: 50,
            color: Colors.brown,
          ),
        ),
      ),
    );
  }
}
