/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated


import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.generated.tables.User
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC: Public = Public()
    }

    /**
     * The table <code>public.user</code>.
     */
    val USER: User get() = User.USER

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        User.USER
    )
}
