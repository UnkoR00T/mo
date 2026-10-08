package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ld1/i$n;", "verticalArrangement", "Lf3/c$b;", "horizontalAlignment", "Le4/w0;", "a", "(Ld1/i$n;Lf3/c$b;Lm2/r;I)Le4/w0;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lc5/b;", "b", "(ZIIII)J", "Le4/w0;", "getDefaultColumnMeasurePolicy", "()Le4/w0;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p036e4.w0 f39076a = new ColumnMeasurePolicy(i.f39152a.k(), f3.c.INSTANCE.k());

    public static final p036e4.w0 a(i.n nVar, f3.c.b bVar, p076m2.r rVar, int i15) {
        p036e4.w0 w0Var;
        if (p076m2.t.k()) {
            p076m2.t.o(1089876336, i15, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (fr.t.c(nVar, i.f39152a.k()) && fr.t.c(bVar, f3.c.INSTANCE.k())) {
            rVar.X(-1446604504);
            rVar.R();
            w0Var = f39076a;
        } else {
            rVar.X(-1446550657);
            boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.W(nVar)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.W(bVar)) || (i15 & 48) == 32);
            Object objE = rVar.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new ColumnMeasurePolicy(nVar, bVar);
                rVar.v(objE);
            }
            w0Var = (ColumnMeasurePolicy) objE;
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w0Var;
    }

    public static final long b(boolean z15, int i15, int i16, int i17, int i18) {
        return !z15 ? c5.c.a(i16, i18, i15, i17) : c5.b.INSTANCE.a(i16, i18, i15, i17);
    }
}
