package p012a2;

import androidx.compose.ui.graphics.Color;
import c5.h;
import er.a;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Lc5/h;", "elevation", "f", "(JFLm2/r;I)J", "Lm2/b4;", "La2/y1;", "a", "Lm2/b4;", "h", "()Lm2/b4;", "LocalElevationOverlay", "b", "g", "LocalAbsoluteElevation", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<y1> f1430a = d0.j(new a() { // from class: a2.z1
        @Override // er.a
        public final Object a() {
            return b2.d();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<h> f1431b = d0.h(null, new a() { // from class: a2.a2
        @Override // er.a
        public final Object a() {
            return b2.c();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final h c() {
        return h.j(h.n(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y1 d() {
        return p1.f1861a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j15, float f15, r rVar, int i15) {
        if (t.k()) {
            t.o(1613340891, i15, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(c1.d(j15, rVar, i15 & 14), ((((float) Math.log(f15 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (t.k()) {
            t.n();
        }
        return jM9copywmQWz5c$default;
    }

    public static final b4<h> g() {
        return f1431b;
    }

    public static final b4<y1> h() {
        return f1430a;
    }
}
