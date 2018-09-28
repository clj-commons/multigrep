;
; Copyright © 2014 Peter Monks (pmonks@gmail.com)
;
; All rights reserved. This program and the accompanying materials
; are made available under the terms of the Eclipse Public License v2.0
; which accompanies this distribution, and is available at
; http://www.eclipse.org/legal/epl-v20.html
;
; Contributors:
;    Peter Monks - initial implementation

(defproject org.clojars.pmonks/multigrep "0.4.0-SNAPSHOT"
  :description         "A little Clojure library that provides regex-based file grepping and/or text substitution."
  :url                 "https://github.com/pmonks/multigrep"
  :license             {:spdx-license-identifier "EPL-2.0"
                        :name                    "Eclipse Public License 2.0"
                        :url                     "http://www.eclipse.org/legal/epl-v20.html"}
  :min-lein-version    "2.8.1"
  :repositories        [["sonatype-snapshots" {:url "https://oss.sonatype.org/content/groups/public" :snapshots true}]
                        ["jitpack"            {:url "https://jitpack.io"}]]
  :plugins             [[lein-codox "0.10.4"]]
  :dependencies        [[org.clojure/clojure "1.9.0"]]
  :profiles            {:dev  {:dependencies [[midje         "1.9.2"]]
                               :plugins      [[lein-licenses "0.2.2"]
                                              [lein-midje    "3.2.1"]]}
                        :1.5  {:dependencies [[org.clojure/clojure "1.5.1"]]}
                        :1.6  {:dependencies [[org.clojure/clojure "1.6.0"]]}
                        :1.7  {:dependencies [[org.clojure/clojure "1.7.0"]]}
                        :1.8  {:dependencies [[org.clojure/clojure "1.8.0"]]}
                        :1.9  {:dependencies [[org.clojure/clojure "1.9.0"]]}
                        :1.10 {:dependencies [[org.clojure/clojure "1.10.0-master-SNAPSHOT"]]}}
  :deploy-repositories [["snapshots" {:url      "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password}]
                        ["releases"  {:url      "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password}]]
  :codox               {:source-uri "https://github.com/pmonks/multigrep/blob/master/{filepath}#L{line}"})
