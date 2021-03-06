(ns sicp.exercise-1-1-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-1 :refer :all]))

(deftest exercise-1-1-test
  (testing "some outputs"
    (is (= 10 10))
    (is (= (+ 5 3 4) 12))
    (is (= (- 9 1) 8))
    (is (= (/ 6 2) 3))
    (is (=
         (+ (* 2 4) (- 4 6))
         6))
    (is (=
         (+ a b (* a b))
         19))
    (is (= (if (and (> b a) (< b (* a b)))
             b
             a)
           4))
    (is (= (cond (= a 4) 6
                 (= b 4) (+ 6 7 a)
                 :else 25)
           16))
    (is (= (+ 2 (if (> b a) b a))
           6))
    (is (= (* (cond (> a b) a
                    (< a b) b
                    :else -1)
              (+ a 1))
           16))
    ))
