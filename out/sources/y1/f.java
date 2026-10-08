package y1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p079n1.h4;
import p079n1.k4;
import q4.Placeholder;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.c4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001?Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b%\u0010$J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u0002022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\n*\u0004\u0018\u0001022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020 H\u0002¢\u0006\u0004\b>\u0010=R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010DR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010DR$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010KR.\u0010S\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010M8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\b?\u0010P\"\u0004\bQ\u0010RR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010T\"\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010[R\u0016\u0010]\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010DR\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010DR\u001c\u0010a\u001a\b\u0018\u00010_R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010`R(\u0010g\u001a\u00020b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010K\u0012\u0004\bf\u0010=\u001a\u0004\bc\u0010d\"\u0004\be\u0010,R\u0011\u0010i\u001a\u0002028F¢\u0006\u0006\u001a\u0004\bC\u0010hR\u0013\u0010j\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\bA\u0010h¨\u0006k"}, d2 = {"Ly1/f;", "", "Lq4/e;", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Ln1/h4;", "autoSize", "<init>", "(Lq4/e;Lq4/b4;Lu4/l$b;IZIILjava/util/List;Ln1/h4;Lfr/k;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lc5/t;", "layoutDirection", "f", "(JLc5/t;)Z", "width", "d", "(ILc5/t;)I", "Loq/i0;", "q", "(Lq4/e;Lq4/b4;Lu4/l$b;IZIILjava/util/List;Ln1/h4;)V", "i", "(Lc5/t;)I", "j", "", "toString", "()Ljava/lang/String;", "Ly1/b;", "op", "l", "(J)V", "r", "(JLc5/t;)J", "finalConstraints", "Lq4/q;", "multiParagraph", "Lq4/t3;", "p", "(Lc5/t;JLq4/q;)Lq4/t3;", "Lq4/t;", "n", "(Lc5/t;)Lq4/t;", "e", "(JLc5/t;)Lq4/q;", "k", "(Lq4/t3;JLc5/t;)Z", "g", "()V", "h", "a", "Lq4/e;", "b", "Lu4/l$b;", "c", "I", "Z", "Ljava/util/List;", "Ly1/d;", "Ly1/d;", "mMinLinesConstrainer", "Ly1/a;", "J", "lastDensity", "Lc5/d;", "value", "Lc5/d;", "()Lc5/d;", "m", "(Lc5/d;)V", "density", "Lq4/b4;", "o", "(Lq4/b4;)V", "Lq4/t;", "paragraphIntrinsics", "Lc5/t;", "intrinsicsLayoutDirection", "Lq4/t3;", "layoutCache", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "Ly1/f$a;", "Ly1/f$a;", "_textAutoSizeLayoutScope", "", "getHistoryFlag$foundation", "()J", "setHistoryFlag$foundation", "getHistoryFlag$foundation$annotations", "historyFlag", "()Lq4/t3;", "textLayoutResult", "layoutOrNull", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q4.e text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<q4.e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d mMinLinesConstrainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private q4.t paragraphIntrinsics;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private c5.t intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private a _textAutoSizeLayoutScope;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long historyFlag;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly1/f$a;", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements c5.d {
    }

    public /* synthetic */ f(q4.e eVar, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17, List list, h4 h4Var, fr.k kVar) {
        this(eVar, textStyle, bVar, i15, z15, i16, i17, list, h4Var);
    }

    private final q4.q e(long constraints, c5.t layoutDirection) {
        q4.t tVarN = n(layoutDirection);
        return new q4.q(tVarN, c.a(constraints, this.softWrap, this.overflow, tVarN.d()), c.b(this.softWrap, this.overflow, this.maxLines), this.overflow, null);
    }

    private final void g() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void h() {
        l(b.INSTANCE.d());
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean k(TextLayoutResult textLayoutResult, long j15, c5.t tVar) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().a() || tVar != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (c5.b.f(j15, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return c5.b.l(j15) != c5.b.l(textLayoutResult.getLayoutInput().getConstraints()) || c5.b.n(j15) != c5.b.n(textLayoutResult.getLayoutInput().getConstraints()) || ((float) c5.b.k(j15)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final void l(long op4) {
        this.historyFlag = op4 | (this.historyFlag << 2);
    }

    private final q4.t n(c5.t layoutDirection) {
        q4.t tVar = this.paragraphIntrinsics;
        if (tVar == null || layoutDirection != this.intrinsicsLayoutDirection || tVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            q4.e eVar = this.text;
            TextStyle textStyleD = c4.d(this.style, layoutDirection);
            c5.d dVar = this.density;
            u4.l.b bVar = this.fontFamilyResolver;
            List<q4.e.Range<Placeholder>> listN = this.placeholders;
            if (listN == null) {
                listN = pq.v.n();
            }
            tVar = new q4.t(eVar, textStyleD, listN, dVar, bVar);
        }
        this.paragraphIntrinsics = tVar;
        return tVar;
    }

    private final void o(TextStyle textStyle) {
        boolean zI = textStyle.I(this.style);
        this.style = textStyle;
        if (zI) {
            return;
        }
        h();
    }

    private final TextLayoutResult p(c5.t layoutDirection, long finalConstraints, q4.q multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().d(), multiParagraph.getWidth());
        q4.e eVar = this.text;
        TextStyle textStyle = this.style;
        List<q4.e.Range<Placeholder>> listN = this.placeholders;
        if (listN == null) {
            listN = pq.v.n();
        }
        return new TextLayoutResult(new TextLayoutInput(eVar, textStyle, listN, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, finalConstraints, (fr.k) null), multiParagraph, c5.c.d(finalConstraints, c5.r.c((((long) k4.a(fMin)) << 32) | (((long) k4.a(multiParagraph.getHeight())) & BodyPartID.bodyIdMax))), null);
    }

    private final long r(long constraints, c5.t layoutDirection) {
        d dVarA = d.INSTANCE.a(this.mMinLinesConstrainer, layoutDirection, this.style, this.density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = dVarA;
        return dVarA.c(constraints, this.minLines);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final TextLayoutResult c() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + this);
    }

    public final int d(int width, c5.t layoutDirection) {
        int i15 = this.cachedIntrinsicHeightInputWidth;
        int i16 = this.cachedIntrinsicHeight;
        if (width == i15 && i15 != -1) {
            return i16;
        }
        long jA = c5.c.a(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jA = r(jA, layoutDirection);
        }
        int iE = lr.m.e(k4.a(e(jA, layoutDirection).getHeight()), c5.b.m(jA));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iE;
        return iE;
    }

    public final boolean f(long constraints, c5.t layoutDirection) {
        l(b.INSTANCE.a());
        if (this.minLines > 1) {
            constraints = r(constraints, layoutDirection);
        }
        if (k(this.layoutCache, constraints, layoutDirection)) {
            this.layoutCache = p(layoutDirection, constraints, e(constraints, layoutDirection));
            return true;
        }
        if (c5.b.f(constraints, this.layoutCache.getLayoutInput().getConstraints())) {
            return false;
        }
        this.layoutCache = p(layoutDirection, constraints, this.layoutCache.getMultiParagraph());
        return true;
    }

    public final int i(c5.t layoutDirection) {
        return k4.a(n(layoutDirection).d());
    }

    public final int j(c5.t layoutDirection) {
        return k4.a(n(layoutDirection).f());
    }

    public final void m(c5.d dVar) {
        c5.d dVar2 = this.density;
        long jD = dVar != null ? y1.a.d(dVar) : y1.a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !y1.a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            l(b.INSTANCE.b());
            g();
        }
    }

    public final void q(q4.e text, TextStyle style, u4.l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<q4.e.Range<Placeholder>> placeholders, h4 autoSize) {
        this.text = text;
        o(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        l(b.INSTANCE.c());
        g();
    }

    public String toString() {
        TextLayoutInput layoutInput;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("MultiParagraphLayoutCache(textLayoutResult=");
        Object objA = "null";
        sb5.append(this.layoutCache != null ? "<TextLayoutResult>" : "null");
        sb5.append(", lastDensity=");
        sb5.append((Object) y1.a.h(this.lastDensity));
        sb5.append(", history=");
        sb5.append(this.historyFlag);
        sb5.append(", constraints=");
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            objA = c5.b.a(layoutInput.getConstraints());
        }
        sb5.append(objA);
        sb5.append(')');
        return sb5.toString();
    }

    private f(q4.e eVar, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17, List<q4.e.Range<Placeholder>> list, h4 h4Var) {
        this.text = eVar;
        this.fontFamilyResolver = bVar;
        this.overflow = i15;
        this.softWrap = z15;
        this.maxLines = i16;
        this.minLines = i17;
        this.placeholders = list;
        this.lastDensity = y1.a.INSTANCE.a();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
