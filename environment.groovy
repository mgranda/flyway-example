environments {

    common {
        flywayProperties {
            locations= "filesystem:src/main/resources/db/structure,filesystem:src/main/resources/db/data"
        }
    }

    dev {
        flywayProperties {
            driver="org.h2.Driver"
            url="jdbc:h2:file:./target/devdb"
            user="sa"
            password=""
            schemas="security"
        }
    }

    qa {
        flywayProperties {
            driver="org.h2.Driver"
            url="jdbc:h2:file:./target/qadb"
            user="user_qa"
            password=""
            schemas="security"
        }
    }

    pro {
        flywayProperties {
            driver="org.h2.Driver"
            url="jdbc:h2:file:./target/prodb"
            user="user_pro"
            password=""
            schemas="security"
        }
    }    
}