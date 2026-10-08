package p012a2;

import androidx.compose.ui.graphics.Color;
import er.a;
import n3.o1;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0085\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "La2/a1;", "g", "(JJJJJJJJJJJJ)La2/a1;", "backgroundColor", "c", "(La2/a1;J)J", "d", "(JLm2/r;I)J", "Lm2/b4;", "a", "Lm2/b4;", "e", "()Lm2/b4;", "LocalColors", "f", "(La2/a1;)J", "primarySurface", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Colors> f1481a = d0.j(new a() { // from class: a2.b1
        @Override // er.a
        public final Object a() {
            return c1.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors b() {
        return h(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
    }

    public static final long c(Colors colors, long j15) {
        if (!Color.m11equalsimpl0(j15, colors.h()) && !Color.m11equalsimpl0(j15, colors.i())) {
            if (!Color.m11equalsimpl0(j15, colors.j()) && !Color.m11equalsimpl0(j15, colors.k())) {
                if (Color.m11equalsimpl0(j15, colors.a())) {
                    return colors.c();
                }
                if (Color.m11equalsimpl0(j15, colors.l())) {
                    return colors.g();
                }
                return Color.m11equalsimpl0(j15, colors.b()) ? colors.d() : Color.INSTANCE.h();
            }
            return colors.f();
        }
        return colors.e();
    }

    public static final long d(long j15, r rVar, int i15) {
        if (t.k()) {
            t.o(441849991, i15, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        rVar.X(-583917585);
        long jC = c(m2.f1788a.a(rVar, 6), j15);
        if (jC == 16) {
            jC = ((Color) rVar.N(m1.a())).m20unboximpl();
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return jC;
    }

    public static final b4<Colors> e() {
        return f1481a;
    }

    public static final long f(Colors colors) {
        return colors.m() ? colors.h() : colors.l();
    }

    public static final Colors g(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36) {
        return new Colors(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, true, null);
    }

    public static /* synthetic */ Colors h(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, int i15, Object obj) {
        long jD = (i15 & 1) != 0 ? o1.d(4284612846L) : j15;
        long jD2 = (i15 & 2) != 0 ? o1.d(4281794739L) : j16;
        long jD3 = (i15 & 4) != 0 ? o1.d(4278442694L) : j17;
        long jD4 = (i15 & 8) != 0 ? o1.d(4278290310L) : j18;
        long jI = (i15 & 16) != 0 ? Color.INSTANCE.i() : j19;
        long jI2 = (i15 & 32) != 0 ? Color.INSTANCE.i() : j25;
        long jD5 = (i15 & 64) != 0 ? o1.d(4289724448L) : j26;
        long jI3 = (i15 & 128) != 0 ? Color.INSTANCE.i() : j27;
        long j37 = jD;
        long jA = (i15 & 256) != 0 ? Color.INSTANCE.a() : j28;
        long jA2 = (i15 & 512) != 0 ? Color.INSTANCE.a() : j29;
        long jA3 = (i15 & 1024) != 0 ? Color.INSTANCE.a() : j35;
        if ((i15 & 2048) != 0) {
            j36 = Color.INSTANCE.i();
        }
        return g(j37, jD2, jD3, jD4, jI, jI2, jD5, jI3, jA, jA2, jA3, j36);
    }
}
