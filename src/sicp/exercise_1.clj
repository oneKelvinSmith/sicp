(ns sicp.exercise-1
  (:require  [sicp.chapter-1 :refer :all]))

(def a 3)
(def b (+ a 1))

(def formula
  (/
   (+ 5 4 (- 2
             (- 3
                (+ 6
                   (/ 4 5)))))
   (* 3
      (- 6 2)
      (- 2 7))))

(defn sum-of-squares-of-largest-two-of-three [a b c]
  (cond
    (or
     (and (> a b) (> b c))
     (and (> b a) (> a c))) (sum-of-squares a b)
    (or
     (and (> a c) (> c b))
     (and (> c a) (> a b))) (sum-of-squares a c)
    :else (sum-of-squares b c)))

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

(defn p [] (p))

(defn test [x y]
  (if (= x 0)
    0
    y))

(defn new-if [predicate
              then-clause
              else-clause]
  (cond predicate then-clause
        :else else-clause))

(defn sqrt-iter-guess-with-new-if [guess x]
  (new-if (good-enough? guess x)
    guess
    (sqrt-iter-guess-with-new-if (improve guess x) x)))

(defn sqrt-with-new-if [x]
  (sqrt-iter-guess-with-new-if 1.0 x))
