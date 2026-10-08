package r2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr2/r;", "", "Le3/d;", "a", "(Lr2/r;)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    public static final List<ComposeStackTraceFrame> a(r rVar) {
        return (rVar.getIsClosed() || rVar.s()) ? pq.v.n() : p.f(rVar.getTable().getAddressSpace(), rVar.getParent(), Integer.valueOf(rVar.m()), new c(rVar));
    }
}
