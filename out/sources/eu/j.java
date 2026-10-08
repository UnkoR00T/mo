package eu;

import java.util.Iterator;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Leu/j;", "T", "", "<init>", "()V", "value", "Loq/i0;", "a", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "", "iterator", "e", "(Ljava/util/Iterator;Ltq/e;)Ljava/lang/Object;", "Leu/h;", "sequence", "d", "(Leu/h;Ltq/e;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j<T> {
    public abstract Object a(T t15, tq.e<? super i0> eVar);

    public final Object d(h<? extends T> hVar, tq.e<? super i0> eVar) {
        Object objE = e(hVar.iterator(), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public abstract Object e(Iterator<? extends T> it, tq.e<? super i0> eVar);
}
