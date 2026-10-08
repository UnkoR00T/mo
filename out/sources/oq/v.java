package oq;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Loq/v;", "T", "Loq/k;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Ler/a;)V", "", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ler/a;", "", "b", "Ljava/lang/Object;", "_value", "getFinal$annotations", "()V", "final", "getValue", "()Ljava/lang/Object;", "value", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class v<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<v<?>, Object> f148205e = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile er.a<? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object final;

    public v(er.a<? extends T> aVar) {
        this.initializer = aVar;
        f0 f0Var = f0.f148177a;
        this._value = f0Var;
        this.final = f0Var;
    }

    @Override // oq.k
    public boolean c() {
        return this._value != f0.f148177a;
    }

    @Override // oq.k
    public T getValue() {
        T t15 = (T) this._value;
        f0 f0Var = f0.f148177a;
        if (t15 != f0Var) {
            return t15;
        }
        er.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tA = aVar.a();
            if (androidx.concurrent.futures.b.a(f148205e, this, f0Var, tA)) {
                this.initializer = null;
                return tA;
            }
        }
        return (T) this._value;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
