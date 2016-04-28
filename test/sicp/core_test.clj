(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest main-test
  (testing "main prints out Hello, World!"
    (is (= (-main) (println "Hello, World!")))))

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
