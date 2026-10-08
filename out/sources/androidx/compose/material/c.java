package androidx.compose.material;

import androidx.compose.material.c;
import androidx.compose.ui.graphics.Color;
import c5.h;
import e2.RippleAlpha;
import fr.k;
import p012a2.RippleConfiguration;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001d"}, d2 = {"", "bounded", "Lc5/h;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "Lw0/r1;", "g", "(ZFJ)Lw0/r1;", "Lm2/b4;", "La2/p3;", "a", "Lm2/b4;", "f", "()Lm2/b4;", "LocalRippleConfiguration", "Landroidx/compose/material/d;", "b", "Landroidx/compose/material/d;", "DefaultBoundedRipple", "c", "DefaultUnboundedRipple", "Le2/b;", "d", "Le2/b;", "LightThemeHighContrastRippleAlpha", "e", "LightThemeLowContrastRippleAlpha", "DarkThemeRippleAlpha", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<RippleConfiguration> f9753a = d0.h(null, new er.a() { // from class: a2.r3
        @Override // er.a
        public final Object a() {
            return c.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f9754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f9755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final RippleAlpha f9756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RippleAlpha f9757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final RippleAlpha f9758f;

    static {
        h.Companion companion = h.INSTANCE;
        float fC = companion.c();
        Color.Companion companion2 = Color.INSTANCE;
        f9754b = new d(true, fC, companion2.h(), (k) null);
        f9755c = new d(false, companion.c(), companion2.h(), (k) null);
        f9756d = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        f9757e = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        f9758f = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration b() {
        return new RippleConfiguration(0L, null, 3, null);
    }

    public static final b4<RippleConfiguration> f() {
        return f9753a;
    }

    public static final r1 g(boolean z15, float f15, long j15) {
        if (h.p(f15, h.INSTANCE.c()) && Color.m11equalsimpl0(j15, Color.INSTANCE.h())) {
            return z15 ? f9754b : f9755c;
        }
        return new d(z15, f15, j15, (k) null);
    }

    public static /* synthetic */ r1 h(boolean z15, float f15, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            f15 = h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            j15 = Color.INSTANCE.h();
        }
        return g(z15, f15, j15);
    }
}
