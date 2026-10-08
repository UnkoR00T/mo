package u0;

import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"4\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0014*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0012\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019\"\u0015\u0010\u0012\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001c\"\u0015\u0010\u0012\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010\u0012\u001a\u00020\"*\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010\u0012\u001a\u00020\u0000*\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lm3/g;", "a", "Lm3/g;", "RectVisibilityThreshold", "", "Lu0/y2;", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "VisibilityThresholdMap", "Lc5/n$a;", "Lc5/n;", "c", "(Lc5/n$a;)J", "VisibilityThreshold", "Lm3/e$a;", "Lm3/e;", "e", "(Lm3/e$a;)J", "Lkotlin/Int$Companion;", "", "(Lfr/s;)I", "Lc5/h$a;", "Lc5/h;", "(Lc5/h$a;)F", "Lm3/k$a;", "Lm3/k;", "f", "(Lm3/k$a;)J", "Lc5/r$a;", "Lc5/r;", "d", "(Lc5/r$a;)J", "Lm3/g$a;", "g", "(Lm3/g$a;)Lm3/g;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m3.g f193642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<y2<?, ?>, Float> f193643b;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        f193642a = new m3.g(1.0f, 1.0f, 1.0f, 1.0f);
        oq.r rVarA = oq.y.a(s3.Q(fr.s.f66413a), fValueOf);
        oq.r rVarA2 = oq.y.a(s3.O(c5.r.INSTANCE), fValueOf);
        oq.r rVarA3 = oq.y.a(s3.N(c5.n.INSTANCE), fValueOf);
        oq.r rVarA4 = oq.y.a(s3.P(fr.m.f66405a), Float.valueOf(0.01f));
        oq.r rVarA5 = oq.y.a(s3.S(m3.g.INSTANCE), fValueOf);
        oq.r rVarA6 = oq.y.a(s3.T(m3.k.INSTANCE), fValueOf);
        oq.r rVarA7 = oq.y.a(s3.R(m3.e.INSTANCE), fValueOf);
        y2<c5.h, p> y2VarL = s3.L(c5.h.INSTANCE);
        Float fValueOf2 = Float.valueOf(0.4f);
        f193643b = pq.v0.l(rVarA, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, rVarA7, oq.y.a(y2VarL, fValueOf2), oq.y.a(s3.M(c5.j.INSTANCE), fValueOf2));
    }

    public static final float a(c5.h.Companion companion) {
        return c5.h.n(0.4f);
    }

    public static final int b(fr.s sVar) {
        return 1;
    }

    public static final long c(c5.n.Companion companion) {
        long j15 = 1;
        return c5.n.d((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    public static final long d(c5.r.Companion companion) {
        long j15 = 1;
        return c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    public static final long e(m3.e.Companion companion) {
        return m3.e.e((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
    }

    public static final long f(m3.k.Companion companion) {
        return m3.k.d((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
    }

    public static final m3.g g(m3.g.Companion companion) {
        return f193642a;
    }

    public static final Map<y2<?, ?>, Float> h() {
        return f193643b;
    }
}
