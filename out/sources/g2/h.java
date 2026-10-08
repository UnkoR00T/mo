package g2;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.n3;
import c5.s;
import nb.WindowSizeClass;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"", "supportLargeAndXLargeWidth", "Lg2/g;", "a", "(ZLm2/r;II)Lg2/g;", "Lc5/k;", "b", "(Lm2/r;I)J", "Lc5/r;", "c", "adaptive"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final WindowAdaptiveInfo a(boolean z15, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            z15 = false;
        }
        if (t.k()) {
            t.o(-1272950086, i15, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (WindowAdaptiveInfo.kt:39)");
        }
        long jB = b(rVar, 0);
        WindowAdaptiveInfo windowAdaptiveInfo = new WindowAdaptiveInfo(z15 ? i.d(WindowSizeClass.INSTANCE, jB, null, null, 6, null) : i.b(WindowSizeClass.INSTANCE, jB, null, null, 6, null), a.b(rVar, 0));
        if (t.k()) {
            t.n();
        }
        return windowAdaptiveInfo;
    }

    public static final long b(r rVar, int i15) {
        if (t.k()) {
            t.o(-830991774, i15, -1, "androidx.compose.material3.adaptive.currentWindowDpSize (WindowAdaptiveInfo.kt:60)");
        }
        rVar.X(280825064);
        long jA0 = ((c5.d) rVar.N(g1.f())).a0(s.e(c(rVar, 0)));
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return jA0;
    }

    public static final long c(r rVar, int i15) {
        if (t.k()) {
            t.o(-854401115, i15, -1, "androidx.compose.material3.adaptive.currentWindowSize (WindowAdaptiveInfo.kt:68)");
        }
        long jA = ((n3) rVar.N(g1.v())).a();
        if (t.k()) {
            t.n();
        }
        return jA;
    }
}
