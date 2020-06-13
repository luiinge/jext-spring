/**
 * @author Luis Iñesta Gelabert - linesta@iti.es | luiinge@gmail.com
 */
package jext.spring;


import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jext.ExtensionLoader;



public class SpringExtensionLoader implements ExtensionLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringExtensionLoader.class);


    @SuppressWarnings("unchecked")
    @Override
    public <T> Iterable<T> load(Class<T> type, ClassLoader loader) {
        if (ApplicationContextProvider.hasContext()) {
            LOGGER.trace("Getting beans of type {}...", type);
            Collection<T> beans = ApplicationContextProvider.applicationContext()
                .getBeansOfType(type).values();
            if (LOGGER.isTraceEnabled()) {
                LOGGER.trace(
                    "{} beans found [{}]",
                    beans.size(),
                    beans.stream()
                        .map(Object::getClass)
                        .map(Class::getCanonicalName)
                        .collect(Collectors.joining(", "))
                );
            }
            return beans;
        } else {
            LOGGER.warn(
                "Trying to load extension but ApplicationContextProvider has not been set yet!"
            );
            return Collections.emptyList();
        }
    }
}
