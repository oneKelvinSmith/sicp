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
    (is (= (factorial 6) 720))
    ))
