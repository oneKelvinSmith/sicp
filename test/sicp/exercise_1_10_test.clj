(ns sicp.exercise-1-10-test
  (:require [sicp.exercise-1-10 :refer :all]
            [clojure.test :refer :all]))

(deftest ackermanns-function-test
  (testing "ackermanns does what it should..."
    (is (= (A 1 10) 1024))
    (is (= (A 2 4) 65536))
    (is (= (A 3 3) 65536))))
