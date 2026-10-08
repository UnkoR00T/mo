package p2;

import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm2/b;", "Lp2/c;", "a", "(Lm2/b;)Lp2/c;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final c a(p076m2.b bVar) {
        c cVar = bVar instanceof c ? (c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        t.c("Inconsistent composition");
        throw new oq.g();
    }
}
