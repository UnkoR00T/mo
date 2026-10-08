package p012a2;

import androidx.compose.ui.graphics.Color;
import n3.o1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"La2/j1;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", "a", "(FFLm2/r;I)F", "c", "(Lm2/r;I)F", "high", "d", "medium", "b", "disabled", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f1722a = new j1();

    private j1() {
    }

    private final float a(float f15, float f16, r rVar, int i15) {
        if (t.k()) {
            t.o(-1528360391, i15, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long jM20unboximpl = ((Color) rVar.N(m1.a())).m20unboximpl();
        if (!m2.f1788a.a(rVar, 6).m() ? o1.i(jM20unboximpl) >= 0.5d : o1.i(jM20unboximpl) <= 0.5d) {
            f15 = f16;
        }
        if (t.k()) {
            t.n();
        }
        return f15;
    }

    public final float b(r rVar, int i15) {
        if (t.k()) {
            t.o(621183615, i15, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float fA = a(0.38f, 0.38f, rVar, ((i15 << 6) & 896) | 54);
        if (t.k()) {
            t.n();
        }
        return fA;
    }

    public final float c(r rVar, int i15) {
        if (t.k()) {
            t.o(629162431, i15, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float fA = a(1.0f, 0.87f, rVar, ((i15 << 6) & 896) | 54);
        if (t.k()) {
            t.n();
        }
        return fA;
    }

    public final float d(r rVar, int i15) {
        if (t.k()) {
            t.o(1999054879, i15, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float fA = a(0.74f, 0.6f, rVar, ((i15 << 6) & 896) | 54);
        if (t.k()) {
            t.n();
        }
        return fA;
    }
}
