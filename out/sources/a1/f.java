package a1;

import f1.b0;
import f1.y0;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p056h1.b1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p143z0.a2;
import p143z0.d3;
import p143z0.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf1/y0;", "lazyListState", "La1/o;", "snapPosition", "La1/n;", "a", "(Lf1/y0;La1/o;)La1/n;", "Lz0/e1;", "e", "(Lf1/y0;La1/o;Lm2/r;II)Lz0/e1;", "Lc5/d;", "", "velocity", "La1/d;", "c", "(Lc5/d;F)I", "Lf1/b0;", "", "d", "(Lf1/b0;)I", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"a1/f$a", "La1/n;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "Lf1/b0;", "d", "()Lf1/b0;", "layoutInfo", "", "c", "()I", "averageItemSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f1177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f1178b;

        a(y0 y0Var, o oVar) {
            this.f1177a = y0Var;
            this.f1178b = oVar;
        }

        private final int c() {
            b0 b0VarD = d();
            if (b0VarD.j().isEmpty()) {
                return 0;
            }
            int size = b0VarD.j().size();
            List<f1.q> listJ = b0VarD.j();
            int size2 = listJ.size();
            int size3 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                size3 += listJ.get(i15).getSize();
            }
            return size3 / size;
        }

        private final b0 d() {
            return this.f1177a.C();
        }

        @Override // a1.n
        public float a(float velocity) {
            List<f1.q> listJ = d().j();
            o oVar = this.f1178b;
            int size = listJ.size();
            float f15 = Float.NEGATIVE_INFINITY;
            float f16 = Float.POSITIVE_INFINITY;
            for (int i15 = 0; i15 < size; i15++) {
                f1.q qVar = listJ.get(i15);
                b1 b1Var = qVar instanceof b1 ? (b1) qVar : null;
                if (b1Var == null || !b1Var.getNonScrollableItem()) {
                    float fA = p.a(f.d(d()), d().f(), d().getAfterContentPadding(), qVar.getSize(), qVar.getOffset(), qVar.getIndex(), oVar, d().getTotalItemsCount());
                    if (fA <= 0.0f && fA > f15) {
                        f15 = fA;
                    }
                    if (fA >= 0.0f && fA < f16) {
                        f16 = fA;
                    }
                }
            }
            return m.l(f.c(this.f1177a.w(), velocity), f15, f16);
        }

        @Override // a1.n
        public float b(float velocity, float decayOffset) {
            return lr.m.d(Math.abs(decayOffset) - c(), 0.0f) * Math.signum(decayOffset);
        }
    }

    public static final n a(y0 y0Var, o oVar) {
        return new a(y0Var, oVar);
    }

    public static /* synthetic */ n b(y0 y0Var, o oVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            oVar = o.a.f1226a;
        }
        return a(y0Var, oVar);
    }

    public static final int c(c5.d dVar, float f15) {
        if (Math.abs(f15) < dVar.l2(m.o())) {
            return d.INSTANCE.a();
        }
        return f15 > 0.0f ? d.INSTANCE.b() : d.INSTANCE.c();
    }

    public static final int d(b0 b0Var) {
        return (int) (b0Var.getOrientation() == a2.Vertical ? b0Var.b() & BodyPartID.bodyIdMax : b0Var.b() >> 32);
    }

    public static final e1 e(y0 y0Var, o oVar, r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            oVar = o.a.f1226a;
        }
        if (t.k()) {
            t.o(-338621290, i15, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:116)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(y0Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            objE = a(y0Var, oVar);
            rVar.v(objE);
        }
        d3 d3VarP = m.p((n) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return d3VarP;
    }
}
