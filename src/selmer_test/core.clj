(ns selmer-test.core
  (:require
   [selmer.parser :as selmer]))

(defn -main []
  (println (selmer/render-file "html/foo.html" {})))
