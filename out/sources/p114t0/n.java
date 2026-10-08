package p114t0;

import c5.r;
import er.p;
import f3.c;
import f3.m;
import k3.f;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u0.g4;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lf3/m;", "Lu0/j0;", "Lc5/r;", "animationSpec", "Lkotlin/Function2;", "Loq/i0;", "finishedListener", "a", "(Lf3/m;Lu0/j0;Ler/p;)Lf3/m;", "J", "c", "()J", "InvalidSize", "", "d", "(J)Z", "isValid", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f186401a;

    static {
        long j15 = PKIFailureInfo.systemUnavail;
        f186401a = r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    public static final m a(m mVar, j0<r> j0Var, p<? super r, ? super r, i0> pVar) {
        return f.b(mVar).u(new w0(j0Var, c.INSTANCE.o(), pVar));
    }

    public static /* synthetic */ m b(m mVar, j0 j0Var, p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, r.b(g4.d(r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            pVar = null;
        }
        return a(mVar, j0Var, pVar);
    }

    public static final long c() {
        return f186401a;
    }

    public static final boolean d(long j15) {
        return !r.e(j15, f186401a);
    }
}
