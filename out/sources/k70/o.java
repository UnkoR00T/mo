package k70;

import b5.LineHeightStyle;
import c5.w;
import p071kotlin.Metadata;
import q4.PlatformTextStyle;
import q4.TextStyle;
import u4.FontWeight;
import u4.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\rR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\rR\u0011\u0010#\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0011\u0010%\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010\rR\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010\rR\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\rR\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\r¨\u0006,"}, d2 = {"Lk70/o;", "", "<init>", "()V", "Lq4/b4;", "b", "Lq4/b4;", "baseTextStyle", "Lu4/l;", "o", "()Lu4/l;", "roboto", "l", "()Lq4/b4;", "headlineLargeRegular", "k", "headlineLargeMedium", "g", "headerPrimary", "n", "headlineRegular", "m", "headlineMedium", "i", "headerSecondary", "q", "titleMedium", "p", "subtitleMedium", "j", "headerTertiary", "bodyLargeRegular", "a", "bodyLargeMedium", "d", "bodyMediumRegular", "c", "bodyMediumMedium", "h", "headerQuaternary", "f", "bodySmallRegular", "e", "bodySmallMedium", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f108893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle baseTextStyle;

    static {
        o oVar = new o();
        f108893a = oVar;
        baseTextStyle = new TextStyle(0L, 0L, null, null, null, oVar.o(), "liga 0", 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.b(), (fr.k) null), 0, 0, null, 15204255, null);
    }

    private o() {
    }

    private final u4.l o() {
        int i15 = z10.a.f232272a;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        return u4.m.a(s.b(i15, companion.a(), 0, 0, 12, null), s.b(z10.a.f232274c, companion.c(), 0, 0, 12, null), s.b(z10.a.f232275d, companion.d(), 0, 0, 12, null), s.b(z10.a.f232273b, companion.b(), 0, 0, 12, null));
    }

    public final TextStyle a() {
        return TextStyle.e(b(), 0L, 0L, FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public final TextStyle b() {
        return TextStyle.e(baseTextStyle, 0L, w.g(16), FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle c() {
        return TextStyle.e(d(), 0L, 0L, FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public final TextStyle d() {
        return TextStyle.e(baseTextStyle, 0L, w.g(14), FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(20), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle e() {
        return TextStyle.e(f(), 0L, 0L, FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public final TextStyle f() {
        return TextStyle.e(baseTextStyle, 0L, w.g(12), FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(16), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle g() {
        return k();
    }

    public final TextStyle h() {
        return c();
    }

    public final TextStyle i() {
        return m();
    }

    public final TextStyle j() {
        return p();
    }

    public final TextStyle k() {
        return TextStyle.e(l(), 0L, 0L, FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public final TextStyle l() {
        return TextStyle.e(baseTextStyle, 0L, w.g(28), FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(36), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle m() {
        return TextStyle.e(n(), 0L, 0L, FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    public final TextStyle n() {
        return TextStyle.e(baseTextStyle, 0L, w.g(24), FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(32), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle p() {
        return TextStyle.e(baseTextStyle, 0L, w.g(18), FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646137, null);
    }

    public final TextStyle q() {
        return TextStyle.e(baseTextStyle, 0L, w.g(20), FontWeight.INSTANCE.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.g(28), null, null, null, 0, 0, null, 16646137, null);
    }
}
