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








import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Form Demo',
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Form Demo'),
        ),
        body: const MyCustomForm(),
      ),
    );
  }
}

class MyCustomForm extends StatefulWidget {
  const MyCustomForm({super.key});

  @override
  State<MyCustomForm> createState() => _MyCustomFormState();
}

class _MyCustomFormState extends State<MyCustomForm> {
  final formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    return Form(
      key: formKey,
      child: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          children: [
            TextFormField(
              decoration: const InputDecoration(labelText: 'Enter text'),
              validator: (value) =>
                  value == null || value.isEmpty ? 'Please enter text' : null,
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                if (formKey.currentState!.validate()) {
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(content: Text('Processing...')),
                  );
                }
              },
              child: const Text('Submit'),
            ),
          ],
        ),
      ),
    );
  }
}
