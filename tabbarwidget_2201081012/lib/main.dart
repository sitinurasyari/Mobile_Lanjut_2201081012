import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
            title: Text("aplikasi"),
            bottom: PreferredSize(
              preferredSize: Size.fromHeight(50),
              child: DefaultTabController(
                length: 3,
                child: TabBar(
                  tabs: [
                    Tab(
                      text: "tab1",
                      icon: Icon(Icons.add_a_photo),
                    ),
                    Tab(
                      text: "tab2",
                      icon: Icon(Icons.ac_unit_outlined),
                    ),
                    Tab(
                      text: "tab3",
                    )
                  ],
                ),
              ),
            )),
      ),
    );
  }
}
