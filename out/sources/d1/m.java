package d1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Ld1/m;", "Lg4/z;", "Lf3/m$c;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Lc5/b;", "Lc5/r;", "o3", "(J)J", "enforceConstraints", "t3", "(JZ)J", "s3", "v3", "u3", "Le4/y0;", "Le4/v0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "k", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "O", "r", "F", "getAspectRatio", "()F", "q3", "(F)V", "s", "Z", "getMatchHeightConstraintsFirst", "()Z", "r3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float aspectRatio;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean matchHeightConstraintsFirst;

    public m(float f15, boolean z15) {
        this.aspectRatio = f15;
        this.matchHeightConstraintsFirst = z15;
    }

    private final long o3(long j15) {
        if (this.matchHeightConstraintsFirst) {
            long jS3 = s3(j15, true);
            c5.r.Companion companion = c5.r.INSTANCE;
            if (!c5.r.e(jS3, companion.a())) {
                return jS3;
            }
            long jT3 = t3(j15, true);
            if (!c5.r.e(jT3, companion.a())) {
                return jT3;
            }
            long jU3 = u3(j15, true);
            if (!c5.r.e(jU3, companion.a())) {
                return jU3;
            }
            long jV3 = v3(j15, true);
            if (!c5.r.e(jV3, companion.a())) {
                return jV3;
            }
            long jS4 = s3(j15, false);
            if (!c5.r.e(jS4, companion.a())) {
                return jS4;
            }
            long jT4 = t3(j15, false);
            if (!c5.r.e(jT4, companion.a())) {
                return jT4;
            }
            long jU4 = u3(j15, false);
            if (!c5.r.e(jU4, companion.a())) {
                return jU4;
            }
            long jV4 = v3(j15, false);
            if (!c5.r.e(jV4, companion.a())) {
                return jV4;
            }
        } else {
            long jT5 = t3(j15, true);
            c5.r.Companion companion2 = c5.r.INSTANCE;
            if (!c5.r.e(jT5, companion2.a())) {
                return jT5;
            }
            long jS5 = s3(j15, true);
            if (!c5.r.e(jS5, companion2.a())) {
                return jS5;
            }
            long jV5 = v3(j15, true);
            if (!c5.r.e(jV5, companion2.a())) {
                return jV5;
            }
            long jU5 = u3(j15, true);
            if (!c5.r.e(jU5, companion2.a())) {
                return jU5;
            }
            long jT6 = t3(j15, false);
            if (!c5.r.e(jT6, companion2.a())) {
                return jT6;
            }
            long jS6 = s3(j15, false);
            if (!c5.r.e(jS6, companion2.a())) {
                return jS6;
            }
            long jV6 = v3(j15, false);
            if (!c5.r.e(jV6, companion2.a())) {
                return jV6;
            }
            long jU6 = u3(j15, false);
            if (!c5.r.e(jU6, companion2.a())) {
                return jU6;
            }
        }
        return c5.r.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p3(p036e4.a2 a2Var, e4.a2.a aVar) {
        e4.a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    private final long s3(long j15, boolean z15) {
        int iRound;
        int iK = c5.b.k(j15);
        return (iK == Integer.MAX_VALUE || (iRound = Math.round(((float) iK) * this.aspectRatio)) <= 0 || (z15 && !k.c(j15, iRound, iK))) ? c5.r.INSTANCE.a() : c5.r.c((((long) iRound) << 32) | (((long) iK) & BodyPartID.bodyIdMax));
    }

    private final long t3(long j15, boolean z15) {
        int iRound;
        int iL = c5.b.l(j15);
        return (iL == Integer.MAX_VALUE || (iRound = Math.round(((float) iL) / this.aspectRatio)) <= 0 || (z15 && !k.c(j15, iL, iRound))) ? c5.r.INSTANCE.a() : c5.r.c((((long) iL) << 32) | (((long) iRound) & BodyPartID.bodyIdMax));
    }

    private final long u3(long j15, boolean z15) {
        int iM = c5.b.m(j15);
        int iRound = Math.round(iM * this.aspectRatio);
        return (iRound <= 0 || (z15 && !k.c(j15, iRound, iM))) ? c5.r.INSTANCE.a() : c5.r.c((((long) iRound) << 32) | (((long) iM) & BodyPartID.bodyIdMax));
    }

    private final long v3(long j15, boolean z15) {
        int iN = c5.b.n(j15);
        int iRound = Math.round(iN / this.aspectRatio);
        return (iRound <= 0 || (z15 && !k.c(j15, iN, iRound))) ? c5.r.INSTANCE.a() : c5.r.c((((long) iN) << 32) | (((long) iRound) & BodyPartID.bodyIdMax));
    }

    @Override // g4.z
    public int H(p036e4.w wVar, p036e4.v vVar, int i15) {
        return i15 != Integer.MAX_VALUE ? Math.round(i15 / this.aspectRatio) : vVar.U(i15);
    }

    @Override // g4.z
    public int K(p036e4.w wVar, p036e4.v vVar, int i15) {
        return i15 != Integer.MAX_VALUE ? Math.round(i15 * this.aspectRatio) : vVar.e0(i15);
    }

    @Override // g4.z
    public int O(p036e4.w wVar, p036e4.v vVar, int i15) {
        return i15 != Integer.MAX_VALUE ? Math.round(i15 / this.aspectRatio) : vVar.n(i15);
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        long jO3 = o3(j15);
        if (!c5.r.e(jO3, c5.r.INSTANCE.a())) {
            j15 = c5.b.INSTANCE.c((int) (jO3 >> 32), (int) (jO3 & BodyPartID.bodyIdMax));
        }
        final p036e4.a2 a2VarO0 = v0Var.o0(j15);
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: d1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.p3(a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    @Override // g4.z
    public int k(p036e4.w wVar, p036e4.v vVar, int i15) {
        return i15 != Integer.MAX_VALUE ? Math.round(i15 * this.aspectRatio) : vVar.m0(i15);
    }

    public final void q3(float f15) {
        this.aspectRatio = f15;
    }

    public final void r3(boolean z15) {
        this.matchHeightConstraintsFirst = z15;
    }
}
