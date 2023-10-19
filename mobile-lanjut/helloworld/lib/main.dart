import 'package:flutter/material.dart';

void main() {
  runApp(new MaterialApp(
    home: new HalHello(),
  ));
}

class HalHello extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      body: new Center(
        child: new Container(
          color: Colors.greenAccent,
          width: 200.0,
          height: 150.0,
          child: new Center(
            child: Column(
              children: [
                Text(
                  "Nama: Siti nur asyari",
                  style: TextStyle(
                      fontFamily: "Serif", fontSize: 15.0, color: Colors.white),
                ),
                Text(
                  "Nim: 2201081012",
                  style: TextStyle(
                      fontFamily: "Arial", fontSize: 15.0, color: Colors.black),
                ),
                Text(
                  "Prodi: Teknologi Informasi",
                  style: TextStyle(
                      fontFamily: "Times New Roman",
                      fontSize: 15.0,
                      color: Colors.pink),
                ),
                Text(
                  "Jurusan : Teknik Komputer",
                  style: TextStyle(
                      fontFamily: "Agency",
                      fontSize: 15.0,
                      color: Colors.purple),
                ),
                Text(
                  "Alamat : Jalan Ikhlas Raya No 14.A",
                  style: TextStyle(
                      fontFamily: "Candara",
                      fontSize: 12.0,
                      color: Colors.lightBlue),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
