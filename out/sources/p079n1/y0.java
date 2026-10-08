package p079n1;

import er.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class y0 implements p<r, Integer, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i4 f130551a;

    public y0(i4 i4Var) {
        this.f130551a = i4Var;
    }

    @Override // er.p
    public /* bridge */ /* synthetic */ String B(r rVar, Integer num) {
        return c(rVar, num.intValue());
    }

    public final String c(r rVar, int i15) {
        rVar.X(-35972707);
        if (t.k()) {
            t.o(-35972707, i15, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (CommonContextMenuArea.kt:190)");
        }
        String strK = this.f130551a.k(rVar, 0);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return strK;
    }
}
