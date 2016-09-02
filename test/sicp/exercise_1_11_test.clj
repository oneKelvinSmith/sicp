(ns sicp.exercise-1-11-test
  (:require [sicp.exercise-1-11 :refer :all]
            [clojure.test :refer :all]))

(deftest exercise-1-11-test
  (testing "recursive procedure"
    (is (= (f-recursive 0) 0))
    (is (= (f-recursive 2) 2))
    (is (= (f-recursive (- 42)) (- 42)))
    (is (= (f-recursive 3) 4))
    (is (= (f-recursive 4) 11))
    (is (= (f-recursive 5) 25))
    (is (= (f-recursive 6) 59)))
  (testing "iterative procedure"
    (is (= (f-iterative 0) 0))
    (is (= (f-iterative 2) 2))
    (is (= (f-iterative (- 42)) (- 42)))
    (is (= (f-iterative 3) 4))
    (is (= (f-iterative 4) 11))
    (is (= (f-iterative 5) 25))
    (is (= (f-iterative 6) 59)))
  )
