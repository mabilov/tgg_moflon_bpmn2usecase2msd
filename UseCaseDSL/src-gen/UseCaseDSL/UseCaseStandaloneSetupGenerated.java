/*
 * generated by Xtext
 */
package UseCaseDSL;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.ISetupExtension;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.List;
import java.util.Arrays;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class UseCaseStandaloneSetupGenerated implements ISetup, ISetupExtension {

	/**
	 * @since 2.9
	 */
	@Override
	public List<String> getFileExtensions() {
		return Arrays.asList("usecase");
	}

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new UseCaseDSL.UseCaseRuntimeModule());
	}
	
	public void register(Injector injector) {

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("usecase", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("usecase", serviceProvider);
		


	}
}
