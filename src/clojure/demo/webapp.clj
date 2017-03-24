(ns demo.webapp
  (:gen-class)
  (:require
   [clj-json.core :as json]
   [compojure.route :as R])
  (:use
   [compojure.handler :only (api)]
   [compojure.core :only (GET defroutes context)]
   [ring.adapter.jetty :only (run-jetty)]
   [ring.middleware.params :only (wrap-params)]))

(defn json-response [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (json/generate-string data)})

(defroutes main-routes
  (GET "/" request 
    (json-response
      {:result 3})))

(def webapp
  (-> main-routes
    api
    wrap-params))

(defn -main [args]
  (def server (run-jetty #'webapp {:port 8082 :join? false})))
