(ns sicp.chapter-1-1)

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

(defn sqrt [x]
  (defn good-enough? [guess]
    (< (abs (- (square guess) x)) 0.001))
  (defn improve [guess]
    (average guess (/ x guess)))
  (defn sqrt-iter [guess]
    (if (good-enough? guess)
      guess
      (sqrt-iter (improve guess))))
  (sqrt-iter 1.0))
