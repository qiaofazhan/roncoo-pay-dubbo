/*
 *
 * 陈德元：



 *
 */
package org.mengyun.tcctransaction.serializer;

/**
 * Created by  on 7/22/16.
 */
public interface ObjectSerializer<T> {

    /**
     * Serialize the given object to binary data.
     *
     * @param t object to serialize
     * @return the equivalent binary data
     */
    byte[] serialize(T t);

    /**
     * Deserialize an object from the given binary data.
     *
     * @param bytes object binary representation
     * @return the equivalent object instance
     */
    T deserialize(byte[] bytes);
}
