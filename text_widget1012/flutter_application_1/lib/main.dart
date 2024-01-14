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
          title: Text("My Apps") ,
          ),
          body: Center(
            child: Text("Halo nama saya siti", 
            maxLines: 2, 
            overflow: TextOverflow.ellipsis,
            textAlign: TextAlign.right,
            style: TextStyle(backgroundColor: Colors.blueGrey,
            color: Colors.yellow,
            fontSize: 30,
            fontWeight: FontWeight.bold,
            letterSpacing: 10,
            decoration: TextDecoration.underline,
            decorationStyle: TextDecorationStyle.dotted,
            ),
          ),
         ),
       ),
     );
  }
}
      