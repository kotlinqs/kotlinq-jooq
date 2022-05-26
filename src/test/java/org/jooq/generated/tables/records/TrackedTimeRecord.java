/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.generated.tables.TrackedTime;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrackedTimeRecord extends UpdatableRecordImpl<TrackedTimeRecord> implements Record4<Integer, Integer, LocalDate, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TRACKED_TIME.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>TRACKED_TIME.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TRACKED_TIME.USER_ID</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>TRACKED_TIME.USER_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>TRACKED_TIME.DATE</code>.
     */
    public void setDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>TRACKED_TIME.DATE</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>TRACKED_TIME.MINUTES</code>.
     */
    public void setMinutes(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>TRACKED_TIME.MINUTES</code>.
     */
    public Integer getMinutes() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, LocalDate, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, LocalDate, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TrackedTime.TRACKED_TIME.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TrackedTime.TRACKED_TIME.USER_ID;
    }

    @Override
    public Field<LocalDate> field3() {
        return TrackedTime.TRACKED_TIME.DATE;
    }

    @Override
    public Field<Integer> field4() {
        return TrackedTime.TRACKED_TIME.MINUTES;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public LocalDate component3() {
        return getDate();
    }

    @Override
    public Integer component4() {
        return getMinutes();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public LocalDate value3() {
        return getDate();
    }

    @Override
    public Integer value4() {
        return getMinutes();
    }

    @Override
    public TrackedTimeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TrackedTimeRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public TrackedTimeRecord value3(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public TrackedTimeRecord value4(Integer value) {
        setMinutes(value);
        return this;
    }

    @Override
    public TrackedTimeRecord values(Integer value1, Integer value2, LocalDate value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrackedTimeRecord
     */
    public TrackedTimeRecord() {
        super(TrackedTime.TRACKED_TIME);
    }

    /**
     * Create a detached, initialised TrackedTimeRecord
     */
    public TrackedTimeRecord(Integer id, Integer userId, LocalDate date, Integer minutes) {
        super(TrackedTime.TRACKED_TIME);

        setId(id);
        setUserId(userId);
        setDate(date);
        setMinutes(minutes);
    }
}