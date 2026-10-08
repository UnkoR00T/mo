package y1;

import p071kotlin.Metadata;
import q4.TextStyle;
import q4.c4;
import q4.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"¨\u0006&"}, d2 = {"Ly1/d;", "", "Lc5/t;", "layoutDirection", "Lq4/b4;", "inputTextStyle", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "<init>", "(Lc5/t;Lq4/b4;Lc5/d;Lu4/l$b;)V", "Lc5/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "Lc5/t;", "g", "()Lc5/t;", "b", "Lq4/b4;", "f", "()Lq4/b4;", "Lc5/d;", "d", "()Lc5/d;", "Lu4/l$b;", "e", "()Lu4/l$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f223053i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static d f223054j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c5.t layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle inputTextStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle resolvedStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float lineHeightCache = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float oneLineHeightCache = Float.NaN;

    /* JADX INFO: renamed from: y1.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly1/d$a;", "", "<init>", "()V", "Ly1/d;", "minMaxUtil", "Lc5/t;", "layoutDirection", "Lq4/b4;", "paramStyle", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "a", "(Ly1/d;Lc5/t;Lq4/b4;Lc5/d;Lu4/l$b;)Ly1/d;", "last", "Ly1/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final d a(d minMaxUtil, c5.t layoutDirection, TextStyle paramStyle, c5.d density, u4.l.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && fr.t.c(c4.d(paramStyle, layoutDirection), minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            d dVar = d.f223054j;
            if (dVar != null && layoutDirection == dVar.getLayoutDirection() && fr.t.c(c4.d(paramStyle, layoutDirection), dVar.getInputTextStyle()) && density.getDensity() == dVar.getDensity().getDensity() && fontFamilyResolver == dVar.getFontFamilyResolver()) {
                return dVar;
            }
            d dVar2 = new d(layoutDirection, c4.d(paramStyle, layoutDirection), c5.f.a(density.getDensity(), density.getFontScale()), fontFamilyResolver);
            d.f223054j = dVar2;
            return dVar2;
        }

        private Companion() {
        }
    }

    public d(c5.t tVar, TextStyle textStyle, c5.d dVar, u4.l.b bVar) {
        this.layoutDirection = tVar;
        this.inputTextStyle = textStyle;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = c4.d(textStyle, tVar);
    }

    public final long c(long inConstraints, int minLines) {
        float f15 = this.oneLineHeightCache;
        float f16 = this.lineHeightCache;
        if (Float.isNaN(f15) || Float.isNaN(f16)) {
            String str = e.f223062a;
            TextStyle textStyle = this.resolvedStyle;
            long jB = c5.c.b(0, 0, 0, 0, 15, null);
            c5.d dVar = this.density;
            u4.l.b bVar = this.fontFamilyResolver;
            b5.v.Companion companion = b5.v.INSTANCE;
            float height = d0.a(str, textStyle, jB, dVar, bVar, (64 & 32) != 0 ? pq.v.n() : null, (64 & 64) != 0 ? pq.v.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? b5.v.INSTANCE.a() : companion.a()).getHeight();
            float height2 = d0.a(e.f223063b, this.resolvedStyle, c5.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? pq.v.n() : null, (64 & 64) != 0 ? pq.v.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? b5.v.INSTANCE.a() : companion.a()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f16 = height2;
            f15 = height;
        }
        return c5.c.a(c5.b.n(inConstraints), c5.b.l(inConstraints), minLines != 1 ? lr.m.j(lr.m.e(Math.round(f15 + (f16 * (minLines - 1))), 0), c5.b.k(inConstraints)) : c5.b.m(inConstraints), c5.b.k(inConstraints));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u4.l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c5.t getLayoutDirection() {
        return this.layoutDirection;
    }
}
