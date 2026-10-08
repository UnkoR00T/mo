package d1;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.v, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ld1/v;", "Le4/w0;", "Lf3/c;", "alignment", "", "propagateMinConstraints", "<init>", "(Lf3/c;Z)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf3/c;", "b", "Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BoxMeasurePolicy implements p036e4.w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(f3.c cVar, boolean z15) {
        this.alignment = cVar;
        this.propagateMinConstraints = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(e4.a2.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(p036e4.a2 a2Var, p036e4.v0 v0Var, p036e4.y0 y0Var, int i15, int i16, BoxMeasurePolicy boxMeasurePolicy, e4.a2.a aVar) {
        r.j(aVar, a2Var, v0Var, y0Var.getLayoutDirection(), i15, i16, boxMeasurePolicy.alignment);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(p036e4.a2[] a2VarArr, List list, p036e4.y0 y0Var, fr.n0 n0Var, fr.n0 n0Var2, BoxMeasurePolicy boxMeasurePolicy, e4.a2.a aVar) {
        int length = a2VarArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            r.j(aVar, a2VarArr[i15], (p036e4.v0) list.get(i16), y0Var.getLayoutDirection(), n0Var.f66407a, n0Var2.f66407a, boxMeasurePolicy.alignment);
            i15++;
            i16++;
        }
        return oq.i0.f148189a;
    }

    @Override // p036e4.w0
    public p036e4.x0 e(final p036e4.y0 y0Var, final List<? extends p036e4.v0> list, long j15) {
        int iN;
        int iM;
        p036e4.a2 a2VarO0;
        if (list.isEmpty()) {
            return p036e4.y0.j2(y0Var, c5.b.n(j15), c5.b.m(j15), null, new er.l() { // from class: d1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return BoxMeasurePolicy.g((e4.a2.a) obj);
                }
            }, 4, null);
        }
        long jB = this.propagateMinConstraints ? j15 : c5.b.b(j15 & (-8589934589L));
        if (list.size() == 1) {
            final p036e4.v0 v0Var = list.get(0);
            if (r.h(v0Var)) {
                iN = c5.b.n(j15);
                iM = c5.b.m(j15);
                a2VarO0 = v0Var.o0(c5.b.INSTANCE.c(c5.b.n(j15), c5.b.m(j15)));
            } else {
                a2VarO0 = v0Var.o0(jB);
                iN = Math.max(c5.b.n(j15), a2VarO0.getWidth());
                iM = Math.max(c5.b.m(j15), a2VarO0.getHeight());
            }
            final int i15 = iN;
            final int i16 = iM;
            final p036e4.a2 a2Var = a2VarO0;
            return p036e4.y0.j2(y0Var, i15, i16, null, new er.l() { // from class: d1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return BoxMeasurePolicy.j(a2Var, v0Var, y0Var, i15, i16, this, (e4.a2.a) obj);
                }
            }, 4, null);
        }
        final p036e4.a2[] a2VarArr = new p036e4.a2[list.size()];
        final fr.n0 n0Var = new fr.n0();
        n0Var.f66407a = c5.b.n(j15);
        final fr.n0 n0Var2 = new fr.n0();
        n0Var2.f66407a = c5.b.m(j15);
        List<? extends p036e4.v0> list2 = list;
        int size = list2.size();
        boolean z15 = false;
        for (int i17 = 0; i17 < size; i17++) {
            p036e4.v0 v0Var2 = list.get(i17);
            if (r.h(v0Var2)) {
                z15 = true;
            } else {
                p036e4.a2 a2VarO1 = v0Var2.o0(jB);
                a2VarArr[i17] = a2VarO1;
                n0Var.f66407a = Math.max(n0Var.f66407a, a2VarO1.getWidth());
                n0Var2.f66407a = Math.max(n0Var2.f66407a, a2VarO1.getHeight());
            }
        }
        if (z15) {
            int i18 = n0Var.f66407a;
            int i19 = i18 != Integer.MAX_VALUE ? i18 : 0;
            int i25 = n0Var2.f66407a;
            long jA = c5.c.a(i19, i18, i25 != Integer.MAX_VALUE ? i25 : 0, i25);
            int size2 = list2.size();
            for (int i26 = 0; i26 < size2; i26++) {
                p036e4.v0 v0Var3 = list.get(i26);
                if (r.h(v0Var3)) {
                    a2VarArr[i26] = v0Var3.o0(jA);
                }
            }
        }
        return p036e4.y0.j2(y0Var, n0Var.f66407a, n0Var2.f66407a, null, new er.l() { // from class: d1.u
            @Override // er.l
            public final Object b(Object obj) {
                return BoxMeasurePolicy.k(a2VarArr, list, y0Var, n0Var, n0Var2, this, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return fr.t.c(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
