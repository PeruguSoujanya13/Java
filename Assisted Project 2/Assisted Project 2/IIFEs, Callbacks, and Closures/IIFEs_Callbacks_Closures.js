//IIFE and Closure
const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Sagar: "+empId()); 
  console.log("Jyoti: "+empId()); 
  console.log("Shreya: "+empId());
   

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(firstName);
  }
  
  var greeting = function(ln){
    console.log('Welcome ' + ln);
  };
  
  fullName("Sagar", "Khuba", greeting);
  console.log("\n");
  fullName("Jyoti", "R", greeting);
  console.log("\n");
  fullName("Shreya", "K", greeting);
