void main() {
  String firstName = "Rishita";
  // Properties
  print(firstName.length);
  print(firstName.isEmpty);
  print(firstName.isNotEmpty);
  print(firstName.codeUnits);
  print(firstName.runtimeType);
  print(firstName is String);
  // Methods
  print(firstName.toUpperCase());
  print("      Rishita     ".trim());
  print(firstName.codeUnitsAt(0)); //Ascii of First Char
  print("Contains ${firstName.contains("mi")}");
  print(firstName.startsWith("Ri"));
  print(firstName.endsWith("ta"));
  String address = "2A/7, Adarsh Colony, Nehrugram, Dehradun";
  List<String> list = address.split(",");
  print(list);
  print("IndexOf ${firstName.IndexOf("e")}");
  String lastName = "Rawat";
  print(firstName + lastName);
  String t = 'Hello' 'How' 'Are' 'You';
  print(t);
  print(t[0]);
}