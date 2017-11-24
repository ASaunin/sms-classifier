package com.asaunin.cache;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class ExtendedCache<K, V, E> extends Cache<K, V> {

    public final Function<E, K> entityToKeyMapper;
    public final Function<E, V> entityToValueMapper;

//    public Optional<V> put(E entity) {
//        final K key = entityToKeyMapper.apply(entity);
//        final V value = entityToValueMapper.apply(entity);
//        return put(key, value);
//    }

}