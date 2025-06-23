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
