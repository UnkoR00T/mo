package p076m2;

import er.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm2/t0;", "T", "Lm2/b4;", "Lm2/w5;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lm2/w5;Ler/a;)V", "value", "Lm2/c4;", "c", "(Ljava/lang/Object;)Lm2/c4;", "b", "Lm2/w5;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0<T> extends b4<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w5<T> policy;

    public t0(w5<T> w5Var, a<? extends T> aVar) {
        super(aVar);
        this.policy = w5Var;
    }

    @Override // p076m2.b4
    public c4<T> c(T value) {
        return new c4<>(this, value, value == null, this.policy, null, null, true);
    }
}
