(ns sicp.chapter-1-2)

(defn fact-iter [product counter max-count]
  (if (> counter max-count)
    product
    (fact-iter (* counter product)
               (+ counter 1)
               max-count)))

(defn factorial [n]
  (fact-iter 1 1 n))

(defn fib-iter [a b count]
  (if (= count 0)
    b
    (fib-iter (+ a b) a (- count 1))))

(defn fib [n]
  (fib-iter 1 0 n))

(defn first-denomination [kinds-of-coins]
  (cond (= kinds-of-coins 1) 1
        (= kinds-of-coins 2) 5
        (= kinds-of-coins 3) 10
        (= kinds-of-coins 4) 25
        (= kinds-of-coins 5) 50))

(defn cc [amount kinds-of-coins]
  (cond (= amount 0) 1
        (or (< amount 0)
            (= kinds-of-coins 0))
        0
        :else (+ (cc amount (- kinds-of-coins 1))
                 (cc (- amount (first-denomination kinds-of-coins))
                     kinds-of-coins))))

(defn count-change [amount]
  "Need to come back to this to make it iterative
   http://c2.com/cgi/wiki?SicpIterationExercise"
  (cc amount 5))
