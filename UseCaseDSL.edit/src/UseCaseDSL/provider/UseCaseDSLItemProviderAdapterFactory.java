/**
 */
package UseCaseDSL.provider;

import UseCaseDSL.util.UseCaseDSLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseDSLItemProviderAdapterFactory extends
		UseCaseDSLAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.AlternativeFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeFlowItemProvider alternativeFlowItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.AlternativeFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeFlowAdapter() {
		if (alternativeFlowItemProvider == null) {
			alternativeFlowItemProvider = new AlternativeFlowItemProvider(this);
		}

		return alternativeFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.AlternativeFlowAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeFlowAlternativeItemProvider alternativeFlowAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.AlternativeFlowAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeFlowAlternativeAdapter() {
		if (alternativeFlowAlternativeItemProvider == null) {
			alternativeFlowAlternativeItemProvider = new AlternativeFlowAlternativeItemProvider(
					this);
		}

		return alternativeFlowAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.BasicFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicFlowItemProvider basicFlowItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.BasicFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicFlowAdapter() {
		if (basicFlowItemProvider == null) {
			basicFlowItemProvider = new BasicFlowItemProvider(this);
		}

		return basicFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.ExceptionFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionFlowItemProvider exceptionFlowItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.ExceptionFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionFlowAdapter() {
		if (exceptionFlowItemProvider == null) {
			exceptionFlowItemProvider = new ExceptionFlowItemProvider(this);
		}

		return exceptionFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.LocalAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAlternativeItemProvider localAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.LocalAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalAlternativeAdapter() {
		if (localAlternativeItemProvider == null) {
			localAlternativeItemProvider = new LocalAlternativeItemProvider(
					this);
		}

		return localAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.NormalStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStepItemProvider normalStepItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.NormalStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalStepAdapter() {
		if (normalStepItemProvider == null) {
			normalStepItemProvider = new NormalStepItemProvider(this);
		}

		return normalStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.PackageDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDeclarationItemProvider packageDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.PackageDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageDeclarationAdapter() {
		if (packageDeclarationItemProvider == null) {
			packageDeclarationItemProvider = new PackageDeclarationItemProvider(
					this);
		}

		return packageDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.ParallelFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelFlowItemProvider parallelFlowItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.ParallelFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelFlowAdapter() {
		if (parallelFlowItemProvider == null) {
			parallelFlowItemProvider = new ParallelFlowItemProvider(this);
		}

		return parallelFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.ParallelStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStepItemProvider parallelStepItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.ParallelStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelStepAdapter() {
		if (parallelStepItemProvider == null) {
			parallelStepItemProvider = new ParallelStepItemProvider(this);
		}

		return parallelStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.UseCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseItemProvider useCaseItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCaseAdapter() {
		if (useCaseItemProvider == null) {
			useCaseItemProvider = new UseCaseItemProvider(this);
		}

		return useCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link UseCaseDSL.UseCasesModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasesModelItemProvider useCasesModelItemProvider;

	/**
	 * This creates an adapter for a {@link UseCaseDSL.UseCasesModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCasesModelAdapter() {
		if (useCasesModelItemProvider == null) {
			useCasesModelItemProvider = new UseCasesModelItemProvider(this);
		}

		return useCasesModelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (actorItemProvider != null)
			actorItemProvider.dispose();
		if (alternativeFlowItemProvider != null)
			alternativeFlowItemProvider.dispose();
		if (alternativeFlowAlternativeItemProvider != null)
			alternativeFlowAlternativeItemProvider.dispose();
		if (basicFlowItemProvider != null)
			basicFlowItemProvider.dispose();
		if (conditionItemProvider != null)
			conditionItemProvider.dispose();
		if (exceptionFlowItemProvider != null)
			exceptionFlowItemProvider.dispose();
		if (localAlternativeItemProvider != null)
			localAlternativeItemProvider.dispose();
		if (normalStepItemProvider != null)
			normalStepItemProvider.dispose();
		if (packageDeclarationItemProvider != null)
			packageDeclarationItemProvider.dispose();
		if (parallelFlowItemProvider != null)
			parallelFlowItemProvider.dispose();
		if (parallelStepItemProvider != null)
			parallelStepItemProvider.dispose();
		if (useCaseItemProvider != null)
			useCaseItemProvider.dispose();
		if (useCasesModelItemProvider != null)
			useCasesModelItemProvider.dispose();
	}

}