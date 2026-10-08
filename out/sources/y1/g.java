package y1;

import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p079n1.k4;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.c4;
import q4.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010 J\u001d\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&JE\u0010'\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010;R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010;R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010?R.\u0010G\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010C\u001a\u0004\b4\u0010D\"\u0004\bE\u0010FR$\u0010L\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010H\u001a\u0004\b<\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010=\u001a\u0004\b6\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010?\u001a\u0004\b8\u0010R\"\u0004\bS\u0010\u0015R\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010ZR\u0016\u0010\\\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010]\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010;R\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010;R(\u0010d\u001a\u00020_8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b`\u0010?\u0012\u0004\bc\u0010\"\u001a\u0004\ba\u0010R\"\u0004\bb\u0010\u0015R\u0014\u0010f\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010e¨\u0006g"}, d2 = {"Ly1/g;", "", "", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Lq4/b4;Lu4/l$b;IZIILfr/k;)V", "Ly1/b;", "op", "Loq/i0;", "m", "(J)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lc5/t;", "layoutDirection", "r", "(JLc5/t;Lq4/b4;)J", "Lq4/b0;", "o", "(Lc5/t;)Lq4/b0;", "l", "(JLc5/t;)Z", "i", "()V", "h", "width", "f", "(ILc5/t;)I", "q", "(Ljava/lang/String;Lq4/b4;Lu4/l$b;IZII)V", "Lq4/y;", "g", "(JLc5/t;)Lq4/y;", "Lq4/t3;", "p", "(Lq4/b4;)Lq4/t3;", "k", "(Lc5/t;)I", "j", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lq4/b4;", "c", "Lu4/l$b;", "d", "I", "e", "Z", "Ly1/a;", "J", "lastDensity", "Lc5/d;", "value", "Lc5/d;", "()Lc5/d;", "n", "(Lc5/d;)V", "density", "Lq4/y;", "()Lq4/y;", "setParagraph$foundation", "(Lq4/y;)V", "paragraph", "()Z", "setDidOverflow$foundation", "(Z)V", "didOverflow", "Lc5/r;", "()J", "setLayoutSize-ozmzZPI$foundation", "layoutSize", "Ly1/d;", "Ly1/d;", "mMinLinesConstrainer", "Lq4/b0;", "paragraphIntrinsics", "Lc5/t;", "intrinsicsLayoutDirection", "prevConstraints", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "", "s", "getHistoryFlag$foundation", "setHistoryFlag$foundation", "getHistoryFlag$foundation$annotations", "historyFlag", "()Loq/i0;", "observeFontChanges", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private q4.y paragraph;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean didOverflow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long layoutSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private d mMinLinesConstrainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private q4.b0 paragraphIntrinsics;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private c5.t intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long prevConstraints;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long historyFlag;

    public /* synthetic */ g(String str, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17, fr.k kVar) {
        this(str, textStyle, bVar, i15, z15, i16, i17);
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = c5.b.INSTANCE.c(0, 0);
        long j15 = 0;
        this.layoutSize = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
        this.didOverflow = false;
    }

    private final boolean l(long constraints, c5.t layoutDirection) {
        q4.b0 b0Var;
        q4.y yVar = this.paragraph;
        if (yVar == null || (b0Var = this.paragraphIntrinsics) == null || b0Var.a() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (c5.b.f(constraints, this.prevConstraints)) {
            return false;
        }
        return c5.b.l(constraints) != c5.b.l(this.prevConstraints) || c5.b.n(constraints) != c5.b.n(this.prevConstraints) || ((float) c5.b.k(constraints)) < yVar.getHeight() || yVar.r();
    }

    private final void m(long op4) {
        this.historyFlag = op4 | (this.historyFlag << 2);
    }

    private final q4.b0 o(c5.t layoutDirection) {
        q4.b0 b0VarA = this.paragraphIntrinsics;
        if (b0VarA == null || layoutDirection != this.intrinsicsLayoutDirection || b0VarA.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            b0VarA = q4.c0.a(this.text, c4.d(this.style, layoutDirection), pq.v.n(), this.density, this.fontFamilyResolver, pq.v.n());
        }
        this.paragraphIntrinsics = b0VarA;
        return b0VarA;
    }

    private final long r(long constraints, c5.t layoutDirection, TextStyle style) {
        d dVarA = d.INSTANCE.a(this.mMinLinesConstrainer, layoutDirection, style, this.density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = dVarA;
        return dVarA.c(constraints, this.minLines);
    }

    static /* synthetic */ long s(g gVar, long j15, c5.t tVar, TextStyle textStyle, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            textStyle = gVar.style;
        }
        return gVar.r(j15, tVar, textStyle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final i0 d() {
        q4.b0 b0Var = this.paragraphIntrinsics;
        if (b0Var != null) {
            b0Var.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q4.y getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, c5.t layoutDirection) {
        g gVar;
        c5.t tVar;
        int i15 = this.cachedIntrinsicHeightInputWidth;
        int i16 = this.cachedIntrinsicHeight;
        if (width == i15 && i15 != -1) {
            return i16;
        }
        long jA = c5.c.a(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            gVar = this;
            tVar = layoutDirection;
            jA = s(gVar, jA, tVar, null, 4, null);
        } else {
            gVar = this;
            tVar = layoutDirection;
        }
        int iE = lr.m.e(k4.a(g(jA, tVar).getHeight()), c5.b.m(jA));
        gVar.cachedIntrinsicHeightInputWidth = width;
        gVar.cachedIntrinsicHeight = iE;
        return iE;
    }

    public final q4.y g(long constraints, c5.t layoutDirection) {
        q4.b0 b0VarO = o(layoutDirection);
        return d0.c(b0VarO, c.a(constraints, this.softWrap, this.overflow, b0VarO.d()), c.b(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    public final boolean h(long constraints, c5.t layoutDirection) {
        g gVar;
        c5.t tVar;
        m(b.INSTANCE.a());
        boolean z15 = true;
        if (this.minLines > 1) {
            gVar = this;
            tVar = layoutDirection;
            constraints = s(gVar, constraints, tVar, null, 4, null);
        } else {
            gVar = this;
            tVar = layoutDirection;
        }
        boolean z16 = false;
        if (l(constraints, tVar)) {
            q4.y yVarG = g(constraints, tVar);
            gVar.prevConstraints = constraints;
            long jD = c5.c.d(constraints, c5.r.c((((long) k4.a(yVarG.l())) << 32) | (((long) k4.a(yVarG.getHeight())) & BodyPartID.bodyIdMax)));
            gVar.layoutSize = jD;
            if (!b5.v.g(gVar.overflow, b5.v.INSTANCE.e()) && (((int) (jD >> 32)) < yVarG.l() || ((int) (jD & BodyPartID.bodyIdMax)) < yVarG.getHeight())) {
                z16 = true;
            }
            gVar.didOverflow = z16;
            gVar.paragraph = yVarG;
            return true;
        }
        if (!c5.b.f(constraints, gVar.prevConstraints)) {
            q4.y yVar = gVar.paragraph;
            long jD2 = c5.c.d(constraints, c5.r.c((((long) k4.a(Math.min(yVar.d(), yVar.l()))) << 32) | (((long) k4.a(yVar.getHeight())) & BodyPartID.bodyIdMax)));
            gVar.layoutSize = jD2;
            if (b5.v.g(gVar.overflow, b5.v.INSTANCE.e()) || (((int) (jD2 >> 32)) >= yVar.l() && ((int) (BodyPartID.bodyIdMax & jD2)) >= yVar.getHeight())) {
                z15 = false;
            }
            gVar.didOverflow = z15;
            gVar.prevConstraints = constraints;
        }
        return false;
    }

    public final int j(c5.t layoutDirection) {
        return k4.a(o(layoutDirection).d());
    }

    public final int k(c5.t layoutDirection) {
        return k4.a(o(layoutDirection).f());
    }

    public final void n(c5.d dVar) {
        c5.d dVar2 = this.density;
        long jD = dVar != null ? a.d(dVar) : a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            m(b.INSTANCE.b());
            i();
        }
    }

    public final TextLayoutResult p(TextStyle style) {
        c5.d dVar;
        c5.t tVar = this.intrinsicsLayoutDirection;
        if (tVar == null || (dVar = this.density) == null) {
            return null;
        }
        q4.e eVar = new q4.e(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jB = c5.b.b(this.prevConstraints & (-8589934589L));
        return new TextLayoutResult(new TextLayoutInput(eVar, style, pq.v.n(), this.maxLines, this.softWrap, this.overflow, dVar, tVar, this.fontFamilyResolver, jB, (fr.k) null), new q4.q(new q4.t(eVar, style, pq.v.n(), dVar, this.fontFamilyResolver), jB, this.maxLines, this.overflow, null), this.layoutSize, null);
    }

    public final void q(String text, TextStyle style, u4.l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        m(b.INSTANCE.c());
        i();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("ParagraphLayoutCache(paragraph=");
        sb5.append(this.paragraph != null ? "<paragraph>" : "null");
        sb5.append(", lastDensity=");
        sb5.append((Object) a.h(this.lastDensity));
        sb5.append(", history=");
        sb5.append(this.historyFlag);
        sb5.append(", constraints=$)");
        return sb5.toString();
    }

    private g(String str, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i15;
        this.softWrap = z15;
        this.maxLines = i16;
        this.minLines = i17;
        this.lastDensity = a.INSTANCE.a();
        long j15 = 0;
        this.layoutSize = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
        this.prevConstraints = c5.b.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
