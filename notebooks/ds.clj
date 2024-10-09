^{:nextjournal.clerk/visibility {:code :hide}}
(ns ds
  (:require [nextjournal.clerk :as clerk]))

(clerk/example
  (+ 1 2)
  (+ 41 1)
  (-> 42 range shuffle)
  (macroexpand '(example (+ 1 2)))
  (clerk/html [:h1 "👋"])
  (range)
  (def my-var 'should-display-its-value)
  (clerk/image "trees.png"))
