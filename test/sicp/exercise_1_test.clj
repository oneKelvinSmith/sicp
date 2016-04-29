(ns sicp.exercise-1-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1 :refer :all]))

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

(deftest exercise-1-2-test
  (testing "translationg of formula"
    (is (= formula (- 37/150)))))


(deftest exercise-1-3-test
  (testing "sum of squares of largest two out of three numbers"
    (is (= (sum-of-squares-of-largest-two-of-three 1 2 3) 13))
    (is (= (sum-of-squares-of-largest-two-of-three 4 2 5) 41))))

(deftest exercise-1-4-test
  (testing "a plus abs b behavior"
    (is (= (a-plus-abs-b 2 2) 4))
    (is (= (a-plus-abs-b (- 12) 0) (- 12)))
    (is (= (a-plus-abs-b 0 (- 42)) 42))))

(deftest exercise-1-5-test
  (testing "applicative order: infinite recursion, normal order: 0"
    (is (thrown? StackOverflowError (test 0 (p))))))

(deftest exercise-1-6-test
  (testing "a new if"
    (is (= (new-if (= 2 3) 0 5) 5))
    (is (= (new-if (= 1 1) 0 5) 0)))
  (testing "sqrt-with-new-if will recurse infinitely as cond uses applicative order"
    (is (thrown? StackOverflowError (sqrt-with-new-if 16)))))

(deftest exercise-1-7-test
  (testing "sqrt of small number (0.00042) is out of tolerance (0.001)"
    (is (not (< (- (sqrt (square 0.00042))
                   0.00042)
                0.001))))
  (testing "sqrt of large number overflows because precision is too fine"
    (is (thrown? StackOverflowError (sqrt 42424242424242424242424242424242424))))
  (testing "alternative good enough function"
    (is (< (- (sqrt-improved (square 0.00042))
                   0.00042)
                0.001))
    ))
