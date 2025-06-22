(ns my-test-proj.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; FACTORIAL

(defn factor [n]
  (if (= n 0) 1
    (* n (factor (dec n))))
  )
(factor 5) ; 20

(defn factor-big [n]
  (if (= n 0) 1
    (*' n (factor-big (dec n))))
  )
(factor-big 5) ; 4894

(defn factor-big-loop [n]
  (loop [x n y n]
    (if (= y 1) x
      (recur (*' x (dec y)) (dec y))
      ))
  )
(factor-big-loop 5) ; no stack-over-flow

;; FIZZBUZZ

(defn fizz-buzz [n]
  (loop [x n]
    (let [y3 (rem x 3) y5 (rem x 5)]
        (if (and (= y3 0) (= y5 0)) (println "FizzBuzz")
          (if (= y3 0) (println "Fizz")
            (if (= y5 0) (println "Buzz")
              (println x)
              ))
          )
      )
    (if (> x 0) (recur (dec x)))
    ))
(fizz-buzz 100)

(defn fizz-buzz-2 [n]
  (loop [x 1]
    (let [y3 (rem x 3) y5 (rem x 5)]
        (if (and (= y3 0) (= y5 0)) (println "FizzBuzz")
          (if (= y3 0) (println "Fizz")
            (if (= y5 0) (println "Buzz")
              (println x)
              ))
          )
      )
    (if (< x n) (recur (inc x)))
    ))
(fizz-buzz-2 100)

(defn fizz-buzz-3 [n]
  (loop [x 1]
    (let [y3 (rem x 3) y5 (rem x 5)]
        (cond
          (and (= y3 0) (= y5 0)) (println "FizzBuzz")
          (= y3 0) (println "Fizz")
          (= y5 0) (println "Buzz")
          :else (println x))
      )
    (if (< x n) (recur (inc x)))
    ))
(fizz-buzz-3 100)
