(defproject pedestal-file-upload "0.1.0-SNAPSHOT"
  :description "Sample File Upload Pedestal "
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.pedestal/pedestal.service "0.5.1"]
                 [io.pedestal/pedestal.jetty "0.5.1"]
                 [ch.qos.logback/logback-classic "1.1.7" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.21"]
                 [org.slf4j/jcl-over-slf4j "1.7.21"]
                 [org.slf4j/log4j-over-slf4j "1.7.21"]]
  :min-lein-version "2.0.0"
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "sample.file-upload.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.5.1"]]}}
  :main sample.file-upload.server)
