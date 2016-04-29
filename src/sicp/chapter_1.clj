(ns sicp.chapter-1)

(defn square [n] (* n n))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(defn f [a]
  (sum-of-squares (+ a 1) (* a 2)))

(defn abs [n]
  (if (neg? n)
    (- n)
    n))

(defn >= [x y]
  (not (< x y)))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter-guess [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter-guess (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter-guess 1.0 x))
