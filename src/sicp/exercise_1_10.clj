(ns sicp.exercise-1-10)

(defn A [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                 (A x (- y 1)))))

(defn f [n] (A 0 n))
;; (f 1) -> (A 0 1)
;; (f 1) -> (* 2 1)
;; (f 1) -> 2
;;       ...
;; (f n) -> (A 0 n)
;;       ...
;;       -> (* 2 y)

(defn g [n] (A 1 n))
;; (g 1) -> (A 1 1)
;;       -> 2
;;       ...
;; (g n) -> (A 1 n)
;;       -> (A (- 1 1) (A 1 (- n 1)))
;;       -> (A 0 (A (- 1 1) (A 1 (- n 2))))
;;       -> (A 0 (A 0 (A (- 1 1) (A 1 (- n 3)))))
;;       -> (A 0 (A 0 (A 0 (A (- 1 1) (A 1 (- n 4))))))
;;       -> (A 0 (A 0 (A 0 (A 0 (A (- 1 1) (A 1 (- n 5)))))))
;;       ...
;;       -> (* 2 (g (- n 1)))
;;       ...
;;       -> (expt 2 n)

(defn h [n] (A 2 n))
;; (h 1) -> (A 2 1)
;;       -> 2
;;       ...
;; (h n) -> (A 2 n)
;;       -> (A (- 2 1) (A 2 (- n 1)))
;;       -> (A 1 (h (- n 1)))
;;       -> (g (h (- n 1)))
;;       ...
;;       -> (expt 2 (h (- n 1)))
;;       -> (expt 2 (expt 2 (expt 2 ...))) or 2 ^ 2 ^ 2 ^ 2 ...
;;       -> tetration
