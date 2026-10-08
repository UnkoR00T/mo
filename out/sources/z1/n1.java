package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Le4/b0;", "Lm3/g;", "b", "(Le4/b0;)Lm3/g;", "Lm3/e;", "offset", "", "a", "(Lm3/g;J)Z", "Lm3/g;", "invertedInfiniteRect", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m3.g f232143a = new m3.g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(m3.g gVar, long j15) {
        float left = gVar.getLeft();
        float right = gVar.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top = gVar.getTop();
        float bottom = gVar.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        return top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    public static final m3.g b(p036e4.b0 b0Var) {
        m3.g gVarD = p036e4.c0.d(b0Var, false, 1, null);
        return m3.h.a(b0Var.K(gVarD.n()), b0Var.K(gVarD.f()));
    }
}
