package com.jodev.springcore.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
/* in proxy mode, even if the dependent class is singleton, every time the dependent class is ask for the context and we do a get
 * on the dependency will return a new instance, 	 
*/
public class ClassDependency04{

}
