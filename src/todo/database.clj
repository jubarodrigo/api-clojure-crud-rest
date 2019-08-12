(ns todo.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {
     :classname "com.mysql.jdbc.Driver"
     :subprotocol "mysql"
     :user "root"
     :password "root"
     :subname "//localhost:13306/todo"
     }))

; set up korma
(korma/defdb db db-connection-info)