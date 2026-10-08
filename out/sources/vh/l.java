package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<TResult> {
    public l<TResult> a(Executor executor, e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public l<TResult> b(Executor executor, f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public l<TResult> c(f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract l<TResult> d(Executor executor, g gVar);

    public abstract l<TResult> e(g gVar);

    public abstract l<TResult> f(Executor executor, h<? super TResult> hVar);

    public abstract l<TResult> g(h<? super TResult> hVar);

    public <TContinuationResult> l<TContinuationResult> h(Executor executor, c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> i(c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> j(Executor executor, c<TResult, l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> k(c<TResult, l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception l();

    public abstract TResult m();

    public abstract <X extends Throwable> TResult n(Class<X> cls);

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public <TContinuationResult> l<TContinuationResult> r(Executor executor, k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> s(k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
