import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.blueGrey[50],
        appBar: AppBar(
          title: Text('Siti Project'),
          backgroundColor: Colors.blueGrey,
        ),
        body: Center(
          child: Image(
            image: NetworkImage(
                'https://flutter.github.io/assets-for-api-docs/assets/widgets/owl.jpg'),
          ),
        ),
      ),
    );
  }
}
