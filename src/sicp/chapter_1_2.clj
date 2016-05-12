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
