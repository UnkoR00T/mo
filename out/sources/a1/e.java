package a1;

import g1.d0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lg1/m;", "Lz0/a2;", "orientation", "", "c", "(Lg1/m;Lz0/a2;)I", "b", "Lg1/d0;", "a", "(Lg1/d0;)I", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final int a(d0 d0Var) {
        return (int) (d0Var.a() == a2.Vertical ? d0Var.b() & BodyPartID.bodyIdMax : d0Var.b() >> 32);
    }

    public static final int b(g1.m mVar, a2 a2Var) {
        return a2Var == a2.Vertical ? c5.n.j(mVar.o()) : c5.n.i(mVar.o());
    }

    public static final int c(g1.m mVar, a2 a2Var) {
        return (int) (a2Var == a2.Vertical ? mVar.b() & BodyPartID.bodyIdMax : mVar.b() >> 32);
    }
}
