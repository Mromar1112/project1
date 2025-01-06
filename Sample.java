import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:unittest/counter.dart';


void main()
{
  group("add,sub,mul,div", (){
    test("test addition",(){
      double r=Calculator.add(2.5,2.5);
      expect(r,5.0);
    });
    test("test subtraction",(){
      double r=Calculator.sub(2.5,2.5);
      expect(r,0);
    });
    test("test multiplication",(){
      double r=Calculator.mul(2,2);
      expect(r,4.0);
    });
    test("test division",(){
      double r=Calculator.div(5.0,2.5);
      expect(r,2.0);
    });
  });
  // test("test addition",(){
  //   double r=Calculator.add(2.5,2.5);
  //   expect(r,4.0);
  // });

}


class Calculator
{
  static double add(double a,double b)
  {
    return a+b;
  }
  static double sub(double a,double b)
  {
    return a-b;
  }
  static double div(double a,double b)
  {
    return a/b;
  }
  static double mul(double a,double b)
  {
    return a*b;
  }
}


import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(primarySwatch: Colors.green),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Widget Example')),
      body: const Center(child: Text('Welcome to your first widget page')),
    );
  }
}
