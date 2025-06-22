(ns hello-clojure.exmp
  (:require
   [clojure.core]))

(def l '(3 2 1))
(def v [1 2 3])

(type l)
(type v)

(first l)
(last l)
(nth l 0)

(first v)
(last v)
(nth v 2)
(v 2)

(cons 99 v)
(conj v 88)

;; MAPS

(def m {:a 1 :b 2})
(def m2 {:somekey {:a 1 :b 2}})

(assoc {:a 1} :b 2)
(assoc-in {:a 1} [:a] 2)
(assoc-in m2 [:somekey :a] "Whaat")
(update-in m2 [:somekey :a] inc)

(get m :b)
(:b m)

;; SET

(def s #{1 2 3})
(conj s 77)
(disj s 2)
