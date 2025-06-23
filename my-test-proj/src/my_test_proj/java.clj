(ns hello-clojure.exmp
  (:require [clojure.core])
  (:import (java.util Date Calendar List))
  (:import (java.time LocalDateTime))
  )

(System/currentTimeMillis)
(Date. (System/currentTimeMillis))
(LocalDateTime/now)
(. LocalDateTime now)
(List/of)

(doto (Calendar/getInstance)
  (.set Calendar/YEAR 1987)
  (.set Calendar/MONTH 0)
  (.set Calendar/DAY_OF_MONTH 31)
  )
