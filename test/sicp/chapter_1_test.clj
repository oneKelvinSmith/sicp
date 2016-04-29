(ns sicp.chapter-1-test
  (:require  [clojure.test :refer :all]
             [sicp.chapter-1 :refer :all]))

(deftest square-test
  (testing "square of a number"
    (is (= (square 21) 441))
    (is (= (square (+ 2 5)) 49))
    (is (= (square (square 3)) 81))))

(deftest sum-of-squares-test
  (testing "sum of two squares"
    (is (= (sum-of-squares 3 4) 25))
    (is (= (sum-of-squares 5 7) 74))))

(deftest f-test
  (testing "evaluate complex function"
    (is (= (f 5) 136))))

(deftest abs-test
  (testing "absolute value of a number"
    (is (= (abs 1) 1))
    (is (= (abs 0) 0))
    (is (= (abs -1) 1))))

(deftest >=-test
  (testing "an number is greater than or equal to another"
    (not (>= 1 2))
    (is (>= 3 2))))

(deftest sqrt-test
  (testing "the square root of a number"
    (is (= (sqrt 9) 3.00009155413138))
    (is (= (sqrt (+ 100 37)) 11.704699917758145))
    (is (= (sqrt (+ (sqrt 2) (sqrt 3))) 1.7739279023207892))
    (is (= (square (sqrt 1000)) 1000.000369924366))
    ))
