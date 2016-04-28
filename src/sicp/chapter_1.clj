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
