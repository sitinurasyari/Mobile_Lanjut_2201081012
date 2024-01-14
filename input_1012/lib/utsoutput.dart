import 'package:flutter/material.dart';

class ResultPage extends StatelessWidget {
  final String kode_barang;
  final String nama_barang;
  final String harga;
  final String diskon;

  ResultPage({
    required this.kode_barang,
    required this.nama_barang,
    required this.harga,
    required this.diskon,
  });

  @override
  Widget build(BuildContext context) {
    double Diskon = 0.0;

    int hargaInt = int.tryParse(harga) ?? 0; // Konversi harga menjadi integer

    if (hargaInt > 10000) {
      Diskon = 0.02; // Diskon 2%
    }

    double jumlahDiskon = hargaInt * Diskon;
    double hargaSetelahDiskon = hargaInt - jumlahDiskon;

    return Scaffold(
      appBar: AppBar(
        title: Text("Hasil Data"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            buildResultRow("Kode Barang:", kode_barang),
            buildResultRow("Nama Barang:", nama_barang),
            buildResultRow("Harga :", harga),
            buildResultRow("Harga Setelah Diskon :", hargaSetelahDiskon.toString()),

          ],
        ),
      ),
    );
  }

  Widget buildResultRow(String label, String value) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 8.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Text(label),
          Text(value),
        ],
      ),
    );
  }
}
