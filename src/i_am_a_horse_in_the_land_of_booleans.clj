(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn 
  boolean
  "Returns x as boolean"
  [x]
  (if x 
    true 
    false))

(defn 
  abs 
  "Returns the absolute value of x"
  [x]
  (if (< x 0) 
    (- x) 
    x))

(defn 
  divides? 
  "Checks if n mod divisor == 0"
  [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn 
  fizzbuzz 
  "If n mod 3 Fizz, if n mod 5 Buzz, if n mod 15 Gotcha"
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn 
  teen? 
  "Checks if age is between 13 and 19"
  [age]
  (<= 13 age 19))

(defn 
  not-teen? 
  [age]
  (cond
    (teen? age) false
    :else       true))

(defn 
  generic-doublificate 
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)   (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else       true))

(defn 
  leap-year? 
  [year]
  (cond
    (not (divides? 4 year))   false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    :else                     true))

; '_______'
