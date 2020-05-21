environments {

    common {
        flywayProperties {
            locations= "filesystem:src/main/resources/db/structure,filesystem:src/main/resources/db/data"
            table = "SCHEMA_HISTORY"
        }
    }

    dev {
        flywayProperties {
            driver="org.h2.Driver"
            url="jdbc:h2:file:./target/devdb"
            user="sa"
            password=""
            schemas="DB_DEV_SCHEMA_VERSION,SCHEMATEST"
        }
    }

    qa {
        flywayProperties {
            driver="org.h2.Driver"
            url="jdbc:h2:file:./target/qadb"
            user="user_qa"
            password=""
            schemas="DB_QA_SCHEMA_VERSION,SCHEMATEST"
        }
    }

    pro {
        flywayProperties {
            driver="com.ibm.db2.jcc.DB2Driver"
            url="jdbc:db2://localhost:50000/test"
            user="db2inst1"
            password="db2inst1"
            schemas="DB_PRO_SCHEMA_VERSION,SCHEMATEST"
        }
    }    
}