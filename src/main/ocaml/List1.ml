let rec multiply x =
  if x=[] then 0.
  else if (List.length x)=1 then List.hd x 
  else List.hd x *. multiply (List.tl x);;

  let myList = [1.;8.5;2.15];;
  print_float (multiply myList);;
  
  print_string "\n";;

let rec factorial x=
  if x<0 then raise(Failure "Ujemny argument")
  else if x=0 then 1
  else x*factorial(x-1);;


  print_string "\n";;
  print_int (factorial 3);;
  
  print_string "\n";;
  print_int (factorial 4);;
  
  print_string "\n";;
  print_int (factorial 6);;

  print_string "\n";;

let rec checkPositive x=
  if x=[] then true
  else if ((List.hd x)<0) then false
  else checkPositive (List.tl x);;
  
  print_string "\n";;
  let myList2= [1;2;3];;
  print_string (string_of_bool (checkPositive myList2));;
  print_string "\n";;

  
let rec stringBuilder x y z= 
  if x=[] then ""
  else if (List.length x)==1 then (List.hd x) ^ z
  else (List.hd x) ^ y ^ stringBuilder (List.tl x) y z;;

  print_string "\n";;
  let myList3=["Ala";"ma";"kota"];;
  print_string(stringBuilder myList3 " " "!");;
