(ns sicp.exercise-1-11)

(defn f-recursive [n]
  (if (< n 3)
    n
    (+ (f-recursive (- n 1))
       (* 2 (f-recursive (- n 2)))
       (* 3 (f-recursive (- n 3))))))

(defn f-iter [a b c count]
  (if (< count 3)
    a
    (f-iter (+ a (* 2 b) (* 3 c)) ; (n)
            a                     ; (n - 1)
            b                     ; (n - 2)
            (- count 1))))

(defn f-iterative [n]
  (if (< n 3)
    n
    (f-iter 2 1 0 n)))
