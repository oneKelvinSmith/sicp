(ns sicp.chapter-1-2-test
  (:require  [clojure.test :refer :all])
  (:require  [sicp.chapter-1-2 :refer :all]))

(deftest factorial-test
  (testing "finding the nth a factorial"
    (is (= (factorial 1) 1))
    (is (= (factorial 2) 2))
    (is (= (factorial 3) 6))
    (is (= (factorial 4) 24))
    (is (= (factorial 5) 120))
    (is (= (factorial 6) 720))))

(deftest fibonacci-test
  (testing "finding the nth a fibonacci numbers"
    (is (= (fib 0) 0))
    (is (= (fib 1) 1))
    (is (= (fib 2) 1))
    (is (= (fib 3) 2))
    (is (= (fib 4) 3))
    (is (= (fib 5) 5))
    (is (= (fib 6) 8))))

(deftest count-change-test
  (testing "the number of ways to make change"
    (is (= (count-change 0) 1))
    (is (= (count-change (- 42)) 0))
    (is (= (count-change 100) 292))))

(deftest cc-test
  (testing "the number of ways to make change"
    (is (= (cc 0 1) 1))
    (is (= (cc (- 42) 42) 0))
    (is (= (cc 42 0) 0))
    (is (= (cc 100 5) 292))))

(deftest first-denomination-test
  (testing "the denomination data"
    (is (= (first-denomination 1) 1))
    (is (= (first-denomination 2) 5))
    (is (= (first-denomination 3) 10))
    (is (= (first-denomination 4) 25))
    (is (= (first-denomination 5) 50))))
