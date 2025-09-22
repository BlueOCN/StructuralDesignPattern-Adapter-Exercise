# Structural Design Pattern: Adapter Exercise

 Let's have a look at our first challenge. This challenge is to refactor an app that checks the temperature in a city and prints out a warning if the temperature is too hot or too cold. So this app has a class called weather warnings... Which has one method called post warning. It checks if the temperature in a city is too low or too high, and if it is, then it prints out a warning message to the console. If not, it prints out a message saying that the temperature is okay. 
 
 It also has an interface called city. This interface defines five methods. And there are two implementations of city called North American city and Asian city. These are very similar, but the North American city class uses Fahrenheit for temperature, and Asian city uses Celsius. 
 
 Finally, the app has a main class with a main method in it. This method checks the temperature in different cities, and prints a message to the console to say that they have a weather warning, if needed.
 
 If I run this, I can see in the console that it prints out messages with either a warning or the temperature is okay. Currently, it says that the temperature in Bangkok is okay. But this one should give a warning. This is because it's checking the temperature in Fahrenheit instead of Celsius. 50 degrees Celsius is actually really hot, it's about 122 in Fahrenheit. So it should give us a weather warning. 
 
 You will need to write an adapter class, which can be used to check the weather for cities in Asia that use Celsius. I'm estimating that this will take you about 30 minutes to do, so go ahead and give it a try.
