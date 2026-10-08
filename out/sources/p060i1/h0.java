package p060i1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li1/g0;", "", "a", "(Li1/g0;)I", "mainAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final int a(g0 g0Var) {
        return (int) (g0Var.a() == a2.Vertical ? g0Var.b() & BodyPartID.bodyIdMax : g0Var.b() >> 32);
    }
}
