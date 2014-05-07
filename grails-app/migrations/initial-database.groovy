databaseChangeLog = {

	changeSet(author: "deigote (generated)", id: "1399451376013-1") {
		createTable(tableName: "author") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "authorPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "deigote (generated)", id: "1399451376013-2") {
		createTable(tableName: "author_books") {
			column(name: "books", type: "bigint")

			column(name: "books_idx", type: "varchar(255)")

			column(name: "books_elt", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
