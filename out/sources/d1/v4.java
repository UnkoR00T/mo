package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lx5/h;", "Ld1/x1;", "e", "(Lx5/h;)Ld1/x1;", "insets", "", "name", "Ld1/z3;", "a", "(Lx5/h;Ljava/lang/String;)Ld1/z3;", "Ld1/c4$a;", "Ld1/c4;", "b", "(Ld1/c4$a;Lm2/r;I)Ld1/c4;", "displayCutout", "d", "systemBars", "c", "safeDrawing", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v4 {
    public static final z3 a(x5.h hVar, String str) {
        return new z3(e(hVar), str);
    }

    public static final c4 b(c4.Companion companion, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1324817724, i15, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:148)");
        }
        e eVarE = e4.INSTANCE.d(rVar, 6).getDisplayCutout();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return eVarE;
    }

    public static final c4 c(c4.Companion companion, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-49441252, i15, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
        }
        c4 c4VarJ = e4.INSTANCE.d(rVar, 6).getSafeDrawing();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return c4VarJ;
    }

    public static final c4 d(c4.Companion companion, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-282936756, i15, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:184)");
        }
        e eVarM = e4.INSTANCE.d(rVar, 6).getSystemBars();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return eVarM;
    }

    public static final InsetsValues e(x5.h hVar) {
        return new InsetsValues(hVar.f216813a, hVar.f216814b, hVar.f216815c, hVar.f216816d);
    }
}
