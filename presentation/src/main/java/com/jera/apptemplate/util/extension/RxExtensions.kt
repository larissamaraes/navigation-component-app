package com.jera.apptemplate.util.extension

import com.jera.apptemplate.domain.util.provider.SchedulerProvider
import com.jera.apptemplate.util.viewmodel.Placeholder
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.subjects.PublishSubject

fun <T> Single<T>.defaultSched(schedulerProvider: SchedulerProvider): Single<T> {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}

fun <T> Single<T>.defaultConsumers(onSubscribeCallback: () -> (Unit), doAfterTerminatecallback: () -> (Unit)): Single<T> {
    return this.doOnSubscribe { onSubscribeCallback.invoke() }.doAfterTerminate({ doAfterTerminatecallback.invoke() })
}

fun <T> Single<T>.defaultPlaceholders(placeholderPlacerAction: (Placeholder) -> (Unit)): Single<T> {
    return this.defaultConsumers({ placeholderPlacerAction(Placeholder.Loading()) }, { placeholderPlacerAction(Placeholder.HideAll) })
}

fun <T> Observable<T>.defaultConsumers(onSubscribeCallback: () -> (Unit), doAfterTerminatecallback: () -> (Unit)): Observable<T> {
    return this.doOnSubscribe { onSubscribeCallback.invoke() }.doAfterTerminate({ doAfterTerminatecallback.invoke() })
}

fun <T> Observable<T>.defaultSched(schedulerProvider: SchedulerProvider): Observable<T> {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}

fun <T> Observable<T>.defaultPlaceholders(placeholderPlacerAction: (Placeholder) -> (Unit)): Observable<T> {
    return this.defaultConsumers({ placeholderPlacerAction(Placeholder.Loading()) }, { placeholderPlacerAction(Placeholder.HideAll) })
}

fun <T> PublishSubject<T>.defaultSched(schedulerProvider: SchedulerProvider): Observable<T> {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}

fun Completable.defaultSched(schedulerProvider: SchedulerProvider): Completable {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}

fun Completable.defaultPlaceholders(placeholderPlacerAction: (Placeholder) -> (Unit)): Completable {
    return this.defaultConsumers({ placeholderPlacerAction(Placeholder.Loading()) }, { placeholderPlacerAction(Placeholder.HideAll) })
}

fun Completable.defaultConsumers(onSubscribeCallback: () -> (Unit), doAfterTerminatecallback: () -> (Unit)): Completable {
    return this.doOnSubscribe { onSubscribeCallback.invoke() }.doAfterTerminate({ doAfterTerminatecallback.invoke() })
}