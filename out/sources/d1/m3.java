package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ld1/i$e;", "horizontalArrangement", "Lf3/c$c;", "verticalAlignment", "Le4/w0;", "b", "(Ld1/i$e;Lf3/c$c;Lm2/r;I)Le4/w0;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lc5/b;", "a", "(ZIIII)J", "Le4/w0;", "getDefaultRowMeasurePolicy", "()Le4/w0;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p036e4.w0 f39219a = new RowMeasurePolicy(i.f39152a.j(), f3.c.INSTANCE.l());

    public static final long a(boolean z15, int i15, int i16, int i17, int i18) {
        return !z15 ? c5.c.a(i15, i17, i16, i18) : c5.b.INSTANCE.b(i15, i17, i16, i18);
    }

    public static final p036e4.w0 b(i.e eVar, f3.c.InterfaceC1317c interfaceC1317c, p076m2.r rVar, int i15) {
        p036e4.w0 w0Var;
        if (p076m2.t.k()) {
            p076m2.t.o(-837807694, i15, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:118)");
        }
        if (fr.t.c(eVar, i.f39152a.j()) && fr.t.c(interfaceC1317c, f3.c.INSTANCE.l())) {
            rVar.X(-1073830487);
            rVar.R();
            w0Var = f39219a;
        } else {
            rVar.X(-1073779616);
            boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.W(eVar)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.W(interfaceC1317c)) || (i15 & 48) == 32);
            Object objE = rVar.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new RowMeasurePolicy(eVar, interfaceC1317c);
                rVar.v(objE);
            }
            w0Var = (RowMeasurePolicy) objE;
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w0Var;
    }
}
