/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import org.jooq.Record;
import org.jooq.*;
import org.jooq.generated.DefaultSchema;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.EmployeeRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>EMPLOYEE</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>EMPLOYEE.ID</code>.
     */
    public final TableField<EmployeeRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>EMPLOYEE.USERNAME</code>.
     */
    public final TableField<EmployeeRecord, String> USERNAME = createField(DSL.name("USERNAME"), SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>EMPLOYEE.AGE</code>.
     */
    public final TableField<EmployeeRecord, Short> AGE = createField(DSL.name("AGE"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>EMPLOYEE.ENABLED</code>.
     */
    public final TableField<EmployeeRecord, Boolean> ENABLED = createField(DSL.name("ENABLED"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private Employee(Name alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>EMPLOYEE</code> table reference
     */
    public Employee(String alias) {
        this(DSL.name(alias), EMPLOYEE);
    }

    /**
     * Create an aliased <code>EMPLOYEE</code> table reference
     */
    public Employee(Name alias) {
        this(alias, EMPLOYEE);
    }

    /**
     * Create a <code>EMPLOYEE</code> table reference
     */
    public Employee() {
        this(DSL.name("EMPLOYEE"), null);
    }

    public <O extends Record> Employee(Table<O> child, ForeignKey<O, EmployeeRecord> key) {
        super(child, key, EMPLOYEE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    @Override
    public Employee as(String alias) {
        return new Employee(DSL.name(alias), this);
    }

    @Override
    public Employee as(Name alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(String name) {
        return new Employee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Name name) {
        return new Employee(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Short, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
