
package br.com.saks.biblioteca.config;

import java.time.Duration;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class CacheConfiguration {
    private static final String environment = "localhost";
    private static final String API_PREFIX = "auth";
    private static final String SEPARATOR = ":";
    @Bean
    public CacheManager redisCacheManager(LettuceConnectionFactory lettuceConnectionFactory) {
            RedisCacheConfiguration cache60MinutosConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                  .disableCachingNullValues()
                  .entryTtl(Duration.ofMinutes(60))
                  .computePrefixWith(cacheName -> API_PREFIX.concat(SEPARATOR).concat(environment).concat(SEPARATOR)
                        .concat(cacheName).concat(SEPARATOR))
                  .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()));
            cache60MinutosConfiguration.usePrefix();
            
            RedisCacheConfiguration cache1MinutoConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                  .disableCachingNullValues()
                  .entryTtl(Duration.ofMinutes(1))
                  .computePrefixWith(cacheName -> API_PREFIX.concat(SEPARATOR).concat(environment).concat(SEPARATOR)
                        .concat(cacheName).concat(SEPARATOR))
                  .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()));
            cache1MinutoConfiguration.usePrefix();

            return RedisCacheManager.RedisCacheManagerBuilder.fromConnectionFactory(lettuceConnectionFactory)
                    .cacheDefaults(cache60MinutosConfiguration)
                    .withCacheConfiguration("listarTodos", cache1MinutoConfiguration)
                    .build();
    }
}