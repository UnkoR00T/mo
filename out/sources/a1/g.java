package a1;

import c5.t;
import java.util.List;
import oq.r;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p060i1.b1;
import p060i1.g0;
import p060i1.h0;
import p060i1.i1;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li1/i1;", "pagerState", "Li1/b1;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "La1/n;", "a", "(Li1/i1;Li1/b1;Ler/q;)La1/n;", "velocity", "", "e", "(Li1/i1;F)Z", "d", "(Li1/i1;)F", "Lc5/t;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "c", "(Li1/i1;Lc5/t;FFFF)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"a1/g$a", "La1/n;", "La1/o;", "snapPosition", "", "velocity", "Loq/r;", "e", "(La1/o;F)Loq/r;", "", "d", "(F)Z", "a", "(F)F", "decayOffset", "b", "(FF)F", "Li1/g0;", "c", "()Li1/g0;", "layoutInfo", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f1179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.q<Float, Float, Float, Float> f1180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1 f1181c;

        /* JADX WARN: Multi-variable type inference failed */
        a(i1 i1Var, er.q<? super Float, ? super Float, ? super Float, Float> qVar, b1 b1Var) {
            this.f1179a = i1Var;
            this.f1180b = qVar;
            this.f1181c = b1Var;
        }

        private final r<Float, Float> e(o snapPosition, float velocity) {
            float f15;
            List<p060i1.o> listJ = c().j();
            i1 i1Var = this.f1179a;
            int size = listJ.size();
            int i15 = 0;
            float f16 = Float.NEGATIVE_INFINITY;
            float f17 = Float.POSITIVE_INFINITY;
            while (true) {
                f15 = 0.0f;
                if (i15 >= size) {
                    break;
                }
                p060i1.o oVar = listJ.get(i15);
                float fA = p.a(h0.a(c()), c().f(), c().getAfterContentPadding(), c().getPageSize(), oVar.getOffset(), oVar.getIndex(), snapPosition, i1Var.N());
                if (fA <= 0.0f && fA > f16) {
                    f16 = fA;
                }
                if (fA >= 0.0f && fA < f17) {
                    f17 = fA;
                }
                i15++;
            }
            if (f16 == Float.NEGATIVE_INFINITY) {
                f16 = f17;
            }
            if (f17 == Float.POSITIVE_INFINITY) {
                f17 = f16;
            }
            if (!this.f1179a.e()) {
                if (g.e(this.f1179a, velocity)) {
                    f16 = 0.0f;
                    f17 = 0.0f;
                } else {
                    f17 = 0.0f;
                }
            }
            if (this.f1179a.d()) {
                f15 = f16;
            } else if (!g.e(this.f1179a, velocity)) {
                f17 = 0.0f;
            }
            return y.a(Float.valueOf(f15), Float.valueOf(f17));
        }

        @Override // a1.n
        public float a(float velocity) {
            r<Float, Float> rVarE = e(this.f1179a.I().getSnapPosition(), velocity);
            float fFloatValue = rVarE.a().floatValue();
            float fFloatValue2 = rVarE.b().floatValue();
            float fFloatValue3 = this.f1180b.w(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                c1.e.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (d(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        @Override // a1.n
        public float b(float velocity, float decayOffset) {
            int iO = this.f1179a.O() + this.f1179a.Q();
            if (iO == 0) {
                return 0.0f;
            }
            int firstVisiblePage = velocity < 0.0f ? this.f1179a.getFirstVisiblePage() + 1 : this.f1179a.getFirstVisiblePage();
            int iE = lr.m.e(Math.abs((lr.m.n(this.f1181c.a(firstVisiblePage, lr.m.n(((int) (decayOffset / iO)) + firstVisiblePage, 0, this.f1179a.N()), velocity, this.f1179a.O(), this.f1179a.Q()), 0, this.f1179a.N()) - firstVisiblePage) * iO) - iO, 0);
            return iE == 0 ? iE : iE * Math.signum(velocity);
        }

        public final g0 c() {
            return this.f1179a.I();
        }

        public final boolean d(float f15) {
            return (f15 == Float.POSITIVE_INFINITY || f15 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final n a(i1 i1Var, b1 b1Var, er.q<? super Float, ? super Float, ? super Float, Float> qVar) {
        return new a(i1Var, qVar, b1Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    public static final float c(i1 i1Var, t tVar, float f15, float f16, float f17, float f18) {
        boolean zE = e(i1Var, f16);
        if (i1Var.I().getOrientation() != a2.Vertical && tVar != t.Ltr) {
            zE = !zE;
        }
        int pageSize = i1Var.I().getPageSize();
        float fD = pageSize == 0 ? 0.0f : d(i1Var) / pageSize;
        float f19 = fD - ((int) fD);
        int iC = f.c(i1Var.getDensity(), f16);
        d.Companion companion = d.INSTANCE;
        if (!d.e(iC, companion.a())) {
            if (!d.e(iC, companion.b())) {
                if (d.e(iC, companion.c())) {
                    return f17;
                }
                return 0.0f;
            }
            return f18;
        }
        if (Math.abs(f19) <= f15 ? Math.abs(fD) < Math.abs(i1Var.T()) ? Math.abs(f17) >= Math.abs(f18) : !zE : zE) {
            return f18;
        }
        return f17;
    }

    private static final float d(i1 i1Var) {
        return i1Var.I().getOrientation() == a2.Horizontal ? Float.intBitsToFloat((int) (i1Var.a0() >> 32)) : Float.intBitsToFloat((int) (i1Var.a0() & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(i1 i1Var, float f15) {
        boolean reverseLayout = i1Var.I().getReverseLayout();
        boolean z15 = (i1Var.c0() ? -f15 : d(i1Var)) > 0.0f;
        return (z15 && reverseLayout) || !(z15 || reverseLayout);
    }
}
