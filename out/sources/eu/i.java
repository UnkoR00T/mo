package eu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-¨\u0006/"}, d2 = {"Leu/i;", "T", "Leu/j;", "", "Ltq/e;", "Loq/i0;", "<init>", "()V", "g", "()Ljava/lang/Object;", "", "f", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "value", "a", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "iterator", "e", "(Ljava/util/Iterator;Ltq/e;)Ljava/lang/Object;", "Loq/t;", "result", "i", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "c", "Ljava/util/Iterator;", "nextIterator", "d", "Ltq/e;", "getNextStep", "()Ltq/e;", "k", "(Ltq/e;)V", "nextStep", "Ltq/i;", "()Ltq/i;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class i<T> extends j<T> implements Iterator<T>, tq.e<i0>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private T nextValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Iterator<? extends T> nextIterator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private tq.e<? super i0> nextStep;

    private final Throwable f() {
        int i15 = this.state;
        if (i15 == 4) {
            return new NoSuchElementException();
        }
        if (i15 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    private final T g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // eu.j
    public Object a(T t15, tq.e<? super i0> eVar) {
        this.nextValue = t15;
        this.state = 3;
        this.nextStep = eVar;
        Object objE = uq.b.e();
        if (objE == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c */
    public tq.i getContext() {
        return tq.j.f191408a;
    }

    @Override // eu.j
    public Object e(Iterator<? extends T> it, tq.e<? super i0> eVar) {
        if (!it.hasNext()) {
            return i0.f148189a;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = eVar;
        Object objE = uq.b.e();
        if (objE == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i15 = this.state;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2 || i15 == 3) {
                        return true;
                    }
                    if (i15 == 4) {
                        return false;
                    }
                    throw f();
                }
                if (this.nextIterator.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            tq.e<? super i0> eVar = this.nextStep;
            this.nextStep = null;
            eVar.i(oq.t.b(i0.f148189a));
        }
    }

    @Override // tq.e
    public void i(Object result) throws Throwable {
        oq.u.b(result);
        this.state = 4;
    }

    public final void k(tq.e<? super i0> eVar) {
        this.nextStep = eVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i15 = this.state;
        if (i15 == 0 || i15 == 1) {
            return g();
        }
        if (i15 == 2) {
            this.state = 1;
            return this.nextIterator.next();
        }
        if (i15 != 3) {
            throw f();
        }
        this.state = 0;
        T t15 = this.nextValue;
        this.nextValue = null;
        return t15;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
