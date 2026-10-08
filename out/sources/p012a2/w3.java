package p012a2;

import androidx.compose.ui.graphics.Color;
import n3.o1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"La2/w3;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "a", "(Lm2/r;I)J", "backgroundColor", "b", "primaryActionColor", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3 f1983a = new w3();

    private w3() {
    }

    public final long a(r rVar, int i15) {
        if (t.k()) {
            t.o(1630911716, i15, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:201)");
        }
        m2 m2Var = m2.f1788a;
        long jG = o1.g(Color.m9copywmQWz5c$default(m2Var.a(rVar, 6).g(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), m2Var.a(rVar, 6).l());
        if (t.k()) {
            t.n();
        }
        return jG;
    }

    public final long b(r rVar, int i15) {
        long jI;
        if (t.k()) {
            t.o(-810329402, i15, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        Colors colorsA = m2.f1788a.a(rVar, 6);
        if (colorsA.m()) {
            jI = o1.g(Color.m9copywmQWz5c$default(colorsA.l(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colorsA.h());
        } else {
            jI = colorsA.i();
        }
        if (t.k()) {
            t.n();
        }
        return jI;
    }
}
