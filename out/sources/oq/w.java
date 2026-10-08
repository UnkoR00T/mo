package oq;

import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Loq/w;", "T", "Loq/k;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Ler/a;Ljava/lang/Object;)V", "", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ler/a;", "b", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class w<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private er.a<? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public w(er.a<? extends T> aVar, Object obj) {
        this.initializer = aVar;
        this._value = f0.f148177a;
        this.lock = obj == null ? this : obj;
    }

    @Override // oq.k
    public boolean c() {
        return this._value != f0.f148177a;
    }

    @Override // oq.k
    public T getValue() {
        T tA;
        T t15 = (T) this._value;
        f0 f0Var = f0.f148177a;
        if (t15 != f0Var) {
            return t15;
        }
        synchronized (this.lock) {
            tA = (T) this._value;
            if (tA == f0Var) {
                tA = this.initializer.a();
                this._value = tA;
                this.initializer = null;
            }
        }
        return tA;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ w(er.a aVar, Object obj, int i15, fr.k kVar) {
        this(aVar, (i15 & 2) != 0 ? null : obj);
    }
}
