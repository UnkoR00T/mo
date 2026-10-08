package ou;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lou/b0;", ip.a.f96137b, "", "id", "Lkotlin/Function2;", "createNewSegment", "Lou/c0;", "c", "(Lou/b0;JLer/p;)Ljava/lang/Object;", "Lou/c;", "N", "b", "(Lou/c;)Lou/c;", "Liu/c;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Liu/c;ILer/l;)Z", "Lou/e0;", "a", "Lou/e0;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f150024a = new e0("CLOSED");

    public static final <N extends c<N>> N b(N n15) {
        while (true) {
            Object objG = n15.g();
            if (objG == f150024a) {
                return n15;
            }
            c cVar = (c) objG;
            if (cVar != null) {
                n15 = (N) cVar;
            } else if (n15.m()) {
                return n15;
            }
        }
    }

    public static final <S extends b0<S>> Object c(S s15, long j15, er.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s15.id >= j15 && !s15.k()) {
                return c0.a(s15);
            }
            Object objG = s15.g();
            if (objG == f150024a) {
                return c0.a(f150024a);
            }
            S sB = (S) ((c) objG);
            if (sB == null) {
                sB = pVar.B(Long.valueOf(s15.id + 1), s15);
                if (s15.o(sB)) {
                    if (s15.k()) {
                        s15.n();
                    }
                }
            }
            s15 = (Object) sB;
        }
    }
}
