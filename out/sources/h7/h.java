package h7;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b%\b\u0002\u0018\u00002\u00020\u0001B7\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJf\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0015\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001c\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"R!\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R!\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b&\u0010%R!\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R!\u0010\u001b\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R!\u00100\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u00104\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103R\u0017\u00107\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010:\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010=\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0017\u0010?\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b.\u00103R,\u0010C\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b@\u0010#\u001a\u0004\b'\u0010%\"\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Lh7/h;", "", "Lr0/g;", "Landroidx/graphics/shapes/Point;", "p0", "p1", "p2", "Lh7/a;", "rounding", "<init>", "(JJJLh7/a;Lfr/k;)V", "", "allowedCut", "a", "(F)F", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "Lh7/b;", "b", "(FFJJJJJF)Lh7/b;", "d0", "d1", "g", "(JJJJ)Lr0/g;", "allowedCut0", "allowedCut1", "", "d", "(FF)Ljava/util/List;", "J", "getP0-1ufDz9w", "()J", "getP1-1ufDz9w", "c", "getP2-1ufDz9w", "Lh7/a;", "getRounding", "()Lh7/a;", "e", "getD1-1ufDz9w", "f", "getD2-1ufDz9w", "d2", "F", "getCornerRadius", "()F", "cornerRadius", "h", "getSmoothing", "smoothing", "i", "getCosAngle", "cosAngle", "j", "getSinAngle", "sinAngle", "k", "expectedRoundCut", "l", "setCenter-DnnuFBc", "(J)V", "center", "expectedCut", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long p1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long p2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a rounding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long d1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long d2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float smoothing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float cosAngle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float sinAngle;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float expectedRoundCut;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long center;

    public /* synthetic */ h(long j15, long j16, long j17, a aVar, fr.k kVar) {
        this(j15, j16, j17, aVar);
    }

    private final float a(float allowedCut) {
        if (allowedCut > e()) {
            return this.smoothing;
        }
        float f15 = this.expectedRoundCut;
        if (allowedCut > f15) {
            return (this.smoothing * (allowedCut - f15)) / (e() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    private final b b(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long jE = f.e(f.j(sideStart, corner));
        long jK = f.k(corner, f.l(f.l(jE, actualRoundCut), 1 + actualSmoothingValues));
        long packedValue = circleSegmentIntersection;
        long jI = f.i(packedValue, f.b(f.k(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long jK2 = f.k(circleCenter, f.l(l.b(f.g(jI) - f.g(circleCenter), f.h(jI) - f.h(circleCenter)), actualR));
        r0.g gVarG = g(sideStart, jE, jK2, l.h(f.j(jK2, circleCenter)));
        if (gVarG != null) {
            packedValue = gVarG.getPackedValue();
        }
        return new b(jK, f.b(f.k(jK, f.l(packedValue, 2.0f)), 3.0f), packedValue, jK2, null);
    }

    private final r0.g g(long p15, long d15, long p16, long d16) {
        long jH = l.h(d16);
        float fD = f.d(d15, jH);
        if (Math.abs(fD) < 1.0E-4f) {
            return null;
        }
        float fD2 = f.d(f.j(p16, p15), jH);
        if (Math.abs(fD) < Math.abs(fD2) * 1.0E-4f) {
            return null;
        }
        return r0.g.a(f.k(p15, f.l(d15, fD2 / fD)));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCenter() {
        return this.center;
    }

    public final List<b> d(float allowedCut0, float allowedCut1) {
        float fMin = Math.min(allowedCut0, allowedCut1);
        float f15 = this.expectedRoundCut;
        if (f15 < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j15 = this.p1;
            this.center = j15;
            return v.e(b.INSTANCE.b(f.g(j15), f.h(this.p1), f.g(this.p1), f.h(this.p1)));
        }
        float fMin2 = Math.min(fMin, f15);
        float fA = a(allowedCut0);
        float fA2 = a(allowedCut1);
        float f16 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = f.k(this.p1, f.l(f.e(f.b(f.k(this.d1, this.d2), 2.0f)), (float) Math.sqrt(l.i(f16) + l.i(fMin2))));
        long jK = f.k(this.p1, f.l(this.d1, fMin2));
        long jK2 = f.k(this.p1, f.l(this.d2, fMin2));
        b bVarB = b(fMin2, fA, this.p1, this.p0, jK, jK2, this.center, f16);
        b bVarL = b(fMin2, fA2, this.p1, this.p2, jK2, jK, this.center, f16).l();
        return v.q(bVarB, b.INSTANCE.a(f.g(this.center), f.h(this.center), bVarB.d(), bVarB.e(), bVarL.b(), bVarL.c()), bVarL);
    }

    public final float e() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    private h(long j15, long j16, long j17, a aVar) {
        this.p0 = j15;
        this.p1 = j16;
        this.p2 = j17;
        this.rounding = aVar;
        long jE = f.e(f.j(j15, j16));
        this.d1 = jE;
        long jE2 = f.e(f.j(j17, j16));
        this.d2 = jE2;
        float radius = aVar != null ? aVar.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = aVar != null ? aVar.getSmoothing() : 0.0f;
        float fD = f.d(jE, jE2);
        this.cosAngle = fD;
        float f15 = 1;
        float fSqrt = (float) Math.sqrt(f15 - l.i(fD));
        this.sinAngle = fSqrt;
        this.expectedRoundCut = ((double) fSqrt) > 0.001d ? (radius * (fD + f15)) / fSqrt : 0.0f;
        this.center = r0.g.b(0.0f, 0.0f);
    }
}
