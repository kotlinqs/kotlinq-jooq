/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.tables.Employee;
import org.jooq.generated.tables.TrackedTime;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>EMPLOYEE</code>.
     */
    public final Employee EMPLOYEE = Employee.EMPLOYEE;

    /**
     * The table <code>TRACKED_TIME</code>.
     */
    public final TrackedTime TRACKED_TIME = TrackedTime.TRACKED_TIME;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Employee.EMPLOYEE,
            TrackedTime.TRACKED_TIME
        );
    }
}
