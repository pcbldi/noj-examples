(ns tablecloth-ds.tutorials
  (:require [tablecloth.api :as tc]
            [scicloj.kindly.v4.kind :as kind]))

(defn read-csv []
  (tc/dataset "./resources/pokemon.csv" {:key-fn keyword}))

(kind/table (tc/head (read-csv)))

(kind/pprint (tc/info (read-csv)))
