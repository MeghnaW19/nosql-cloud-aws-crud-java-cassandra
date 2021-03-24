package com.stackroute.hotelapp.dao;


import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.*;
import com.stackroute.hotelapp.model.Hotel;

import java.util.Optional;

/**
 * *TODO**
 * This interface provides the query methods for CRUD operations on hotel entity
 * Apply appropriate annotation to this interface for defining it as a DAO
 */
@Dao
public interface HotelDao {

    /* **TODO**
     * This method should define the select query for getting a hotel by hotelId
     * Apply annotation to make this method a select query method
     */
    @Select
    Optional<Hotel> findById(String state, String city, int hotelId);

    /* **TODO**
     * This method should define the select query for getting all hotels for given
     * state and city
     * Apply annotation to make this method a select query method
     */
    @Select
    PagingIterable<Hotel> findByStateAndCity(String state, String city);

    /* **TODO**
     * This method should define the insert query for saving a hotel entity
     * Apply annotation to make this method a insert query method. Also apply the
     * annotation to define consistency level as 'LOCAL_QUORUM'
     */
    @Insert
    @StatementAttributes(consistencyLevel = "LOCAL_QUORUM")
    void save(Hotel hotel);

    /* **TODO**
     * This method should define the delete query for deleting a hotel entity
     * Apply annotation to make this method a delete query method. Also apply the
     * annotation to define consistency level as 'LOCAL_QUORUM'
     */
    @Delete
    @StatementAttributes(consistencyLevel = "LOCAL_QUORUM")
    void deleteHotel(Hotel hotel);

    /* **TODO**
     * This method should define the delete query for deleting all hotels for given
     * state and city
     * Apply annotation to make this method a delete query method. Also apply the
     * annotation to define consistency level as 'LOCAL_QUORUM'
     */
    @Delete(entityClass = Hotel.class)
    @StatementAttributes(consistencyLevel = "LOCAL_QUORUM")
    void deleteByStateAndCity(String state, String city);

    /* **TODO**
     * This method should define the update query for updating hotel entity
     * Apply annotation to make this method a update query method only if the entity exists.
     * Also apply the annotation to define consistency level as 'LOCAL_QUORUM'
     */
    @Update(ifExists = true)
    @StatementAttributes(consistencyLevel = "LOCAL_QUORUM")
    void update(Hotel hotel);
}