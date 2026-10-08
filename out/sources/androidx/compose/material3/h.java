package androidx.compose.material3;

import e2.RippleAlpha;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/h;", "", "<init>", "()V", "Le2/b;", "b", "Le2/b;", "getRippleAlpha", "()Le2/b;", "getRippleAlpha$annotations", "RippleAlpha", "Landroidx/compose/material3/k;", "c", "Landroidx/compose/material3/k;", "()Landroidx/compose/material3/k;", "OpacityFocusRippleThemeConfiguration", "d", "a", "InsetFocusRingRippleThemeConfiguration", "e", "ThemeConfiguration", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9838a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final RippleAlpha RippleAlpha = new RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final k OpacityFocusRippleThemeConfiguration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final k InsetFocusRingRippleThemeConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final k ThemeConfiguration;

    static {
        k kVar = new k(new k.a.b());
        OpacityFocusRippleThemeConfiguration = kVar;
        InsetFocusRingRippleThemeConfiguration = new k(new k.a.C0211a(c5.h.n(0), c5.h.n(2), c5.h.n(1), c5.h.n(3), null));
        ThemeConfiguration = kVar;
    }

    private h() {
    }

    public final k a() {
        return InsetFocusRingRippleThemeConfiguration;
    }

    public final k b() {
        return OpacityFocusRippleThemeConfiguration;
    }

    public final k c() {
        return ThemeConfiguration;
    }
}
