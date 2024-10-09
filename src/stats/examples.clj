(ns stats.examples
  (:require [scicloj.hanamicloth.v1.api :as haclo]
            [tablecloth.api :as tc]))


(def iris-data-set (tc/dataset "./resources/iris.csv" {:key-fn keyword}))
(def breast-cancer-data-set (tc/dataset "./resources/breast_cancer.csv" {:key-fn keyword}))

(haclo/layer-histogram iris-data-set {:=x               :sepal-width
                                      :=y               :sepal-length
                                      :=color           :species
                                      :=histogram-nbins 30})

;Generate bar chart
(haclo/plot
  breast-cancer-data-set
  haclo/bar-chart
  {:=x               :radius_mean
   :=y               :texture_mean
   :=color           :diagnosis
   :=histogram-nbins 30})


;Generate Box plot
(haclo/plot
  breast-cancer-data-set
  haclo/boxplot-chart
  {:=x               :radius_mean
   :=y               :texture_mean
   :=color           :diagnosis
   :=histogram-nbins 30})