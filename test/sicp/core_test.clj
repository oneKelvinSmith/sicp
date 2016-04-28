(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest main-test
  (testing "main prints out Hello, World!"
    (is (= (-main) (println "Hello, World!")))))

(deftest square-test
  (testing "squaring a number"
    (is (= (square 21) 441))
    (is (= (square (+ 2 5)) 49))
    (is (= (square (square 3)) 81))))

(deftest sum-of-squares-test
  (testing "summing two squares"
    (is (= (sum-of-squares 3 4) 25))
    (is (= (sum-of-squares 5 7) 74))))

(deftest f-test
  (testing "complex function"
    (is (= (f 5) 136))))
