package p076m2;

import p071kotlin.Metadata;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lm2/a4;", "T", "Lm2/z3;", "Lm2/a3;", "state", "Ltq/i;", "coroutineContext", "<init>", "(Lm2/a3;Ltq/i;)V", "b", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a4<T> implements z3<T>, a3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a3<T> f122788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i coroutineContext;

    public a4(a3<T> a3Var, i iVar) {
        this.f122788a = a3Var;
        this.coroutineContext = iVar;
    }

    @Override // ju.p0
    public i getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // p076m2.a3, p076m2.f6
    public T getValue() {
        return this.f122788a.getValue();
    }

    @Override // p076m2.a3
    public void setValue(T t15) {
        this.f122788a.setValue(t15);
    }
}
