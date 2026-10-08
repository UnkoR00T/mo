package p079n1;

import b5.v;
import c5.b;
import c5.c;
import c5.d;
import c5.r;
import fr.k;
import java.util.List;
import lr.m;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import q4.Placeholder;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.c4;
import q4.e;
import q4.q;
import q4.t;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001%Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b9\u0010=R$\u0010D\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010 R\u0014\u0010J\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010AR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u00100¨\u0006L"}, d2 = {"Ln1/j4;", "", "Lq4/e;", "text", "Lq4/b4;", "style", "", "maxLines", "minLines", "", "softWrap", "Lb5/v;", "overflow", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "<init>", "(Lq4/e;Lq4/b4;IIZILc5/d;Lu4/l$b;Ljava/util/List;Lfr/k;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lc5/t;", "layoutDirection", "Lq4/q;", "n", "(JLc5/t;)Lq4/q;", "Loq/i0;", "m", "(Lc5/t;)V", "Lq4/t3;", "prevResult", "l", "(JLc5/t;Lq4/t3;)Lq4/t3;", "a", "Lq4/e;", "k", "()Lq4/e;", "b", "Lq4/b4;", "j", "()Lq4/b4;", "c", "I", "d", "()I", "e", "Z", "i", "()Z", "f", "g", "Lc5/d;", "()Lc5/d;", "h", "Lu4/l$b;", "()Lu4/l$b;", "Ljava/util/List;", "()Ljava/util/List;", "Lq4/t;", "Lq4/t;", "getParagraphIntrinsics$foundation", "()Lq4/t;", "setParagraphIntrinsics$foundation", "(Lq4/t;)V", "paragraphIntrinsics", "Lc5/t;", "getIntrinsicsLayoutDirection$foundation", "()Lc5/t;", "setIntrinsicsLayoutDirection$foundation", "intrinsicsLayoutDirection", "nonNullIntrinsics", "maxIntrinsicWidth", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private t paragraphIntrinsics;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private c5.t intrinsicsLayoutDirection;

    public /* synthetic */ j4(e eVar, TextStyle textStyle, int i15, int i16, boolean z15, int i17, d dVar, l.b bVar, List list, k kVar) {
        this(eVar, textStyle, i15, i16, z15, i17, dVar, bVar, list);
    }

    private final t f() {
        t tVar = this.paragraphIntrinsics;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final q n(long constraints, c5.t layoutDirection) {
        m(layoutDirection);
        int iN = b.n(constraints);
        int iL = ((this.softWrap || v.g(this.overflow, v.INSTANCE.b())) && b.h(constraints)) ? b.l(constraints) : Integer.MAX_VALUE;
        int i15 = (this.softWrap || !v.g(this.overflow, v.INSTANCE.b())) ? this.maxLines : 1;
        if (iN != iL) {
            iL = m.n(c(), iN, iL);
        }
        return new q(f(), b.INSTANCE.b(0, iL, 0, b.k(constraints)), i15, this.overflow, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final int c() {
        return k4.a(f().d());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<e.Range<Placeholder>> h() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getText() {
        return this.text;
    }

    public final TextLayoutResult l(long constraints, c5.t layoutDirection, TextLayoutResult prevResult) {
        if (prevResult != null && j6.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().g(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (k) null), c.d(constraints, r.c((((long) k4.a(prevResult.getMultiParagraph().getHeight())) & BodyPartID.bodyIdMax) | (((long) k4.a(prevResult.getMultiParagraph().getWidth())) << 32))));
        }
        q qVarN = n(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (k) null), qVarN, c.d(constraints, r.c((((long) k4.a(qVarN.getHeight())) & BodyPartID.bodyIdMax) | (((long) k4.a(qVarN.getWidth())) << 32))), null);
    }

    public final void m(c5.t layoutDirection) {
        t tVar = this.paragraphIntrinsics;
        if (tVar == null || layoutDirection != this.intrinsicsLayoutDirection || tVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            tVar = new t(this.text, c4.d(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = tVar;
    }

    private j4(e eVar, TextStyle textStyle, int i15, int i16, boolean z15, int i17, d dVar, l.b bVar, List<e.Range<Placeholder>> list) {
        this.text = eVar;
        this.style = textStyle;
        this.maxLines = i15;
        this.minLines = i16;
        this.softWrap = z15;
        this.overflow = i17;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.placeholders = list;
        if (!(i15 > 0)) {
            c1.e.a("no maxLines");
        }
        if (!(i16 > 0)) {
            c1.e.a("no minLines");
        }
        if (i16 <= i15) {
            return;
        }
        c1.e.a("minLines greater than maxLines");
    }

    public /* synthetic */ j4(e eVar, TextStyle textStyle, int i15, int i16, boolean z15, int i17, d dVar, l.b bVar, List list, int i18, k kVar) {
        this(eVar, textStyle, (i18 & 4) != 0 ? Integer.MAX_VALUE : i15, (i18 & 8) != 0 ? 1 : i16, (i18 & 16) != 0 ? true : z15, (i18 & 32) != 0 ? v.INSTANCE.a() : i17, dVar, bVar, (i18 & 256) != 0 ? pq.v.n() : list, null);
    }
}
