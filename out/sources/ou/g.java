package ou;

import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltq/i;", "context", "", "exception", "Loq/i0;", "a", "(Ltq/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final void a(tq.i iVar, Throwable th4) {
        Iterator<ju.m0> it = f.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().i1(iVar, th4);
            } catch (Throwable th5) {
                f.b(ju.n0.b(th4, th5));
            }
        }
        try {
            oq.c.a(th4, new h(iVar));
        } catch (Throwable unused) {
        }
        f.b(th4);
    }
}
