package tq;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oq.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ltq/k;", "T", "Ltq/e;", "Lvq/e;", "delegate", "", "initialResult", "<init>", "(Ltq/e;Ljava/lang/Object;)V", "(Ltq/e;)V", "Loq/t;", "result", "Loq/i0;", "i", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Ltq/e;", "Ljava/lang/Object;", "Ltq/i;", "c", "()Ltq/i;", "context", "e", "()Lvq/e;", "callerFrame", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements e<T>, vq.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f191409b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<k<?>, Object> f191410c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e<T> delegate;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltq/k$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(e<? super T> eVar, Object obj) {
        this.delegate = eVar;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        uq.a aVar = uq.a.UNDECIDED;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f191410c, this, aVar, uq.b.e())) {
                return uq.b.e();
            }
            obj = this.result;
        }
        if (obj == uq.a.RESUMED) {
            return uq.b.e();
        }
        if (obj instanceof t.Failure) {
            throw ((t.Failure) obj).exception;
        }
        return obj;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c */
    public i getContext() {
        return this.delegate.getContext();
    }

    @Override // vq.e
    public vq.e e() {
        e<T> eVar = this.delegate;
        if (eVar instanceof vq.e) {
            return (vq.e) eVar;
        }
        return null;
    }

    @Override // tq.e
    public void i(Object result) {
        while (true) {
            Object obj = this.result;
            uq.a aVar = uq.a.UNDECIDED;
            if (obj == aVar) {
                if (androidx.concurrent.futures.b.a(f191410c, this, aVar, result)) {
                    return;
                }
            } else {
                if (obj != uq.b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f191410c, this, uq.b.e(), uq.a.RESUMED)) {
                    this.delegate.i(result);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    public k(e<? super T> eVar) {
        this(eVar, uq.a.UNDECIDED);
    }
}
