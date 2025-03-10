/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.keys


import org.jooq.UniqueKey
import org.jooq.generated.tables.User
import org.jooq.generated.tables.records.UserRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val USER_PK: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_pk"), arrayOf(User.USER.ID), true)
