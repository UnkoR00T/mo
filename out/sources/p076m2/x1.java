package p076m2;

import er.a;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lm2/x1;", "T", "Lm2/o6;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Ler/a;)V", "Lm2/v3;", "map", "a", "(Lm2/v3;)Ljava/lang/Object;", "Loq/k;", "b", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x1<T> implements o6<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k current;

    public x1(a<? extends T> aVar) {
        this.current = l.a(aVar);
    }

    private final T b() {
        return (T) this.current.getValue();
    }

    @Override // p076m2.o6
    public T a(v3 map) {
        return b();
    }
}
