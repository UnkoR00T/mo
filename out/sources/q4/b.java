package q4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;J)\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u0002062\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010;J\u0017\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010O\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010LJ\u0017\u0010P\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010LJ\u0017\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010LJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bY\u0010SJ\u001f\u0010[\u001a\u00020(2\u0006\u00109\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0014H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010_JE\u0010k\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010b\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJM\u0010p\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020(2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bx\u0010u\u001a\u0004\by\u0010wR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bz\u0010O\u001a\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010}R%\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u0085\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b^\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0016\u0010\u008f\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bz\u0010\u008b\u0001R\u0016\u0010\u0090\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u008b\u0001R\u0017\u0010\u0092\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0017\u0010\u0094\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u0098\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010wR \u0010\u009d\u0001\u001a\u00030\u0099\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009c\u0001\u0010\u0084\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lq4/b;", "Lq4/y;", "Ly4/e;", "paragraphIntrinsics", "", "maxLines", "Lb5/v;", "overflow", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Ly4/e;IIJLfr/k;)V", "Lr4/j0;", "", "La5/g;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lr4/j0;)[La5/g;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "N", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Ln3/h1;", "canvas", "Loq/i0;", "O", "(Ln3/h1;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "", "charSequence", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lr4/j0;", "", "vertical", "s", "(F)I", "Lm3/e;", "position", "k", "(J)I", "Lm3/g;", "rect", "Lq4/m3;", "granularity", "Lq4/q3;", "inclusionStrategy", "Lq4/z3;", "q", "(Lm3/g;ILq4/q3;)J", "offset", "C", "(I)Lm3/g;", "range", "", "array", "arrayStart", "x", "(J[FI)V", "start", "end", "Ln3/m2;", "t", "(II)Ln3/m2;", "h", "i", "(I)J", "lineIndex", "v", "(I)F", "o", "a", "J", "e", "p", "b", "(I)I", "visibleEnd", "n", "(IZ)I", "m", "(I)Z", "z", "usePrimaryDirection", "u", "(IZ)F", "Lb5/i;", "g", "(I)Lb5/i;", "B", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/w2;", "shadow", "Lb5/k;", "textDecoration", "Lp3/g;", "drawStyle", "Ln3/a1;", "blendMode", "w", "(Ln3/h1;JLn3/w2;Lb5/k;Lp3/g;I)V", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "A", "(Ln3/h1;Landroidx/compose/ui/graphics/c;FLn3/w2;Lb5/k;Lp3/g;I)V", "Ly4/e;", "getParagraphIntrinsics", "()Ly4/e;", "I", "getMaxLines", "()I", "c", "getOverflow-gIe3tQ8", "d", "getConstraints-msEJaDk", "()J", "Lr4/j0;", "layout", "f", "Ljava/lang/CharSequence;", "getCharSequence$ui_text", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text$annotations", "()V", "", "Ljava/util/List;", ip.a.f96138c, "()Ljava/util/List;", "placeholderRects", "l", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "j", "firstBaseline", "y", "lastBaseline", "r", "()Z", "didExceedMaxLines", "lineCount", "Ly4/i;", "M", "()Ly4/i;", "getTextPaint$ui_text$annotations", "textPaint", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y4.e paragraphIntrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r4.j0 layout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<m3.g> placeholderRects;

    public /* synthetic */ b(y4.e eVar, int i15, int i16, long j15, fr.k kVar) {
        this(eVar, i15, i16, j15);
    }

    private final r4.j0 H(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        return new r4.j0(charSequence, l(), M(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, y4.c.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    static /* synthetic */ r4.j0 I(b bVar, int i15, int i16, TextUtils.TruncateAt truncateAt, int i17, int i18, int i19, int i25, int i26, CharSequence charSequence, int i27, Object obj) {
        return bVar.H(i15, i16, truncateAt, i17, i18, i19, i25, i26, (i27 & 256) != 0 ? bVar.charSequence : charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(q3 q3Var, RectF rectF, RectF rectF2) {
        return q3Var.a(n3.s2.f(rectF), n3.s2.f(rectF2));
    }

    private final a5.g[] L(r4.j0 j0Var) {
        if ((j0Var.G() instanceof Spanned) && N((Spanned) j0Var.G(), a5.g.class)) {
            return (a5.g[]) ((Spanned) j0Var.G()).getSpans(0, j0Var.G().length(), a5.g.class);
        }
        return null;
    }

    private final boolean N(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void O(n3.h1 canvas) {
        Canvas canvasD = n3.f0.d(canvas);
        if (r()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, l(), getHeight());
        }
        this.layout.M(canvasD);
        if (r()) {
            canvasD.restore();
        }
    }

    @Override // q4.y
    public void A(n3.h1 canvas, androidx.compose.ui.graphics.c brush, float alpha, Shadow shadow, b5.k textDecoration, p3.g drawStyle, int blendMode) {
        int backingBlendMode = M().getBackingBlendMode();
        y4.i iVarM = M();
        float fL = l();
        iVarM.f(brush, m3.k.d((((long) Float.floatToRawIntBits(getHeight())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL) << 32)), alpha);
        iVarM.j(shadow);
        iVarM.k(textDecoration);
        iVarM.i(drawStyle);
        iVarM.e(blendMode);
        O(canvas);
        M().e(backingBlendMode);
    }

    @Override // q4.y
    public b5.i B(int offset) {
        return this.layout.L(offset) ? b5.i.Rtl : b5.i.Ltr;
    }

    @Override // q4.y
    public m3.g C(int offset) {
        boolean z15 = false;
        if (offset >= 0 && offset < this.charSequence.length()) {
            z15 = true;
        }
        if (!z15) {
            w4.a.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF rectFC = this.layout.c(offset);
        return new m3.g(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
    }

    @Override // q4.y
    public List<m3.g> D() {
        return this.placeholderRects;
    }

    public float J(int lineIndex) {
        return this.layout.k(lineIndex);
    }

    public final y4.i M() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // q4.y
    public float a(int lineIndex) {
        return this.layout.w(lineIndex);
    }

    @Override // q4.y
    public int b(int lineIndex) {
        return this.layout.v(lineIndex);
    }

    @Override // q4.y
    public int c() {
        return this.layout.getLineCount();
    }

    @Override // q4.y
    public float d() {
        return this.paragraphIntrinsics.d();
    }

    @Override // q4.y
    public float e(int lineIndex) {
        return this.layout.l(lineIndex);
    }

    @Override // q4.y
    public float f() {
        return this.paragraphIntrinsics.f();
    }

    @Override // q4.y
    public b5.i g(int offset) {
        return this.layout.z(this.layout.q(offset)) == 1 ? b5.i.Ltr : b5.i.Rtl;
    }

    @Override // q4.y
    public float getHeight() {
        return this.layout.f();
    }

    @Override // q4.y
    public m3.g h(int offset) {
        if (!(offset >= 0 && offset <= this.charSequence.length())) {
            w4.a.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float fB = r4.j0.B(this.layout, offset, false, 2, null);
        int iQ = this.layout.q(offset);
        return new m3.g(fB, this.layout.w(iQ), fB, this.layout.l(iQ));
    }

    @Override // q4.y
    public long i(int offset) {
        s4.h hVarI = this.layout.I();
        return a4.b(s4.g.b(hVarI, offset), s4.g.a(hVarI, offset));
    }

    @Override // q4.y
    public float j() {
        return J(0);
    }

    @Override // q4.y
    public int k(long position) {
        return this.layout.y(this.layout.r((int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & position))), Float.intBitsToFloat((int) (position >> 32)));
    }

    @Override // q4.y
    public float l() {
        return c5.b.l(this.constraints);
    }

    @Override // q4.y
    public boolean m(int lineIndex) {
        return this.layout.K(lineIndex);
    }

    @Override // q4.y
    public int n(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.x(lineIndex) : this.layout.p(lineIndex);
    }

    @Override // q4.y
    public float o(int lineIndex) {
        return this.layout.u(lineIndex);
    }

    @Override // q4.y
    public float p(int lineIndex) {
        return this.layout.s(lineIndex);
    }

    @Override // q4.y
    public long q(m3.g rect, int granularity, final q3 inclusionStrategy) {
        int[] iArrC = this.layout.C(n3.s2.c(rect), c.r(granularity), new er.p() { // from class: q4.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Boolean.valueOf(b.K(inclusionStrategy, (RectF) obj, (RectF) obj2));
            }
        });
        return iArrC == null ? z3.INSTANCE.a() : a4.b(iArrC[0], iArrC[1]);
    }

    @Override // q4.y
    public boolean r() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // q4.y
    public int s(float vertical) {
        return this.layout.r((int) vertical);
    }

    @Override // q4.y
    public n3.m2 t(int start, int end) {
        if (!(start >= 0 && start <= end && end <= this.charSequence.length())) {
            w4.a.a("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        Path path = new Path();
        this.layout.F(start, end, path);
        return n3.u0.c(path);
    }

    @Override // q4.y
    public float u(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? r4.j0.B(this.layout, offset, false, 2, null) : r4.j0.E(this.layout, offset, false, 2, null);
    }

    @Override // q4.y
    public float v(int lineIndex) {
        return this.layout.t(lineIndex);
    }

    @Override // q4.y
    public void w(n3.h1 canvas, long color, Shadow shadow, b5.k textDecoration, p3.g drawStyle, int blendMode) {
        int backingBlendMode = M().getBackingBlendMode();
        y4.i iVarM = M();
        iVarM.h(color);
        iVarM.j(shadow);
        iVarM.k(textDecoration);
        iVarM.i(drawStyle);
        iVarM.e(blendMode);
        O(canvas);
        M().e(backingBlendMode);
    }

    @Override // q4.y
    public void x(long range, float[] array, int arrayStart) {
        this.layout.a(z3.l(range), z3.k(range), array, arrayStart);
    }

    @Override // q4.y
    public float y() {
        return J(c() - 1);
    }

    @Override // q4.y
    public int z(int offset) {
        return this.layout.q(offset);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x0303  */
    /* JADX WARN: Code duplicated, block: B:111:0x0308  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c7 A[LOOP:0: B:58:0x01c5->B:59:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x020b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0221  */
    /* JADX WARN: Code duplicated, block: B:68:0x0223  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0246  */
    /* JADX WARN: Code duplicated, block: B:78:0x0248  */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01f4, please report this as an issue */
    private b(y4.e eVar, int i15, int i16, long j15) {
        TextUtils.TruncateAt truncateAt;
        r4.j0 j0VarI;
        int i17;
        b bVar;
        int i18;
        a5.g[] gVarArrL;
        CharSequence charSequence;
        Spanned spanned;
        ArrayList arrayList;
        int i19;
        List<m3.g> listN;
        int spanEnd;
        int iQ;
        boolean z15;
        boolean z16;
        boolean z17;
        m3.g gVar;
        float fD;
        int iD;
        float fA;
        int iD2;
        r4.j0 j0Var;
        float fK;
        int iB;
        float fW;
        float fB;
        float fK2;
        int i25;
        this.paragraphIntrinsics = eVar;
        this.maxLines = i15;
        this.overflow = i16;
        this.constraints = j15;
        if (!(c5.b.m(j15) == 0 && c5.b.n(j15) == 0)) {
            w4.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (!(i15 >= 1)) {
            w4.a.a("maxLines should be greater than 0");
        }
        TextStyle style = eVar.getStyle();
        b5.v.Companion companion = b5.v.INSTANCE;
        CharSequence charSequenceJ = c.l(style, b5.v.g(i16, companion.b())) ? c.j(eVar.getCharSequence()) : eVar.getCharSequence();
        this.charSequence = charSequenceJ;
        int iM = c.m(style.B());
        boolean zK = b5.j.k(style.B(), b5.j.INSTANCE.c());
        int iO = c.o(style.x().getHyphens());
        int iN = c.n(b5.f.g(style.t()));
        int iP = c.p(b5.f.h(style.t()));
        int iQ2 = c.q(b5.f.i(style.t()));
        if (b5.v.g(i16, companion.b())) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            if (!b5.v.g(i16, companion.c())) {
                if (b5.v.g(i16, companion.d())) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                TextUtils.TruncateAt truncateAt2 = truncateAt;
                CharSequence charSequence2 = charSequenceJ;
                j0VarI = I(this, iM, zK, truncateAt2, i15, iO, iN, iP, iQ2, null, 256, null);
                if (Build.VERSION.SDK_INT < 35 || M().getLetterSpacing() == 0.0f || (!(b5.v.g(i16, companion.d()) || b5.v.g(i16, companion.c())) || j0VarI.n(0) <= 0)) {
                    i17 = i15;
                } else {
                    int iO2 = j0VarI.o(0);
                    i17 = i15;
                    j0VarI = H(iM, zK, truncateAt2, i17, iO, iN, iP, iQ2, TextUtils.concat(charSequence2.subSequence(0, iO2), "…", charSequence2.subSequence(j0VarI.n(0) + iO2, charSequence2.length())));
                }
                if (b5.v.g(i16, companion.b()) || j0VarI.f() <= c5.b.k(j15) || i17 <= 1) {
                    bVar = this;
                    i18 = 2;
                    bVar.layout = j0VarI;
                } else {
                    int iK = c.k(j0VarI, c5.b.k(j15));
                    if (iK < 0 || iK == i17) {
                        bVar = this;
                        i18 = 2;
                    } else {
                        i18 = 2;
                        bVar = this;
                        j0VarI = I(bVar, iM, zK, truncateAt2, lr.m.e(iK, 1), iO, iN, iP, iQ2, null, 256, null);
                    }
                    bVar.layout = j0VarI;
                }
                bVar.M().f(style.i(), m3.k.d((((long) Float.floatToRawIntBits(bVar.getHeight())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(bVar.l())) << 32)), style.f());
                gVarArrL = bVar.L(bVar.layout);
                if (gVarArrL != null) {
                    for (a5.g gVar2 : gVarArrL) {
                        gVar2.c(m3.k.d((((long) Float.floatToRawIntBits(bVar.getHeight())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(bVar.l())) << 32)));
                    }
                }
                charSequence = bVar.charSequence;
                if (charSequence instanceof Spanned) {
                    spanned = (Spanned) charSequence;
                    Object[] spans = spanned.getSpans(0, charSequence.length(), t4.j.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        t4.j jVar = (t4.j) obj;
                        int spanStart = spanned.getSpanStart(jVar);
                        spanEnd = spanned.getSpanEnd(jVar);
                        iQ = bVar.layout.q(spanStart);
                        if (iQ >= bVar.maxLines) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (bVar.layout.n(iQ) > 0 || spanEnd <= bVar.layout.v(iQ) + bVar.layout.o(iQ)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (spanEnd > bVar.layout.p(iQ)) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z16 && !z17 && !z15) {
                            boolean z18 = bVar.layout.z(iQ) == 1;
                            boolean zL = bVar.layout.L(spanStart);
                            if (!z18 || zL) {
                                if (z18 && zL) {
                                    fA = bVar.layout.D(spanStart, false);
                                    iD2 = jVar.d();
                                } else if (zL) {
                                    fA = bVar.layout.A(spanStart, false);
                                    iD2 = jVar.d();
                                } else {
                                    fD = bVar.layout.D(spanStart, false);
                                    iD = jVar.d();
                                }
                                fD = fA - iD2;
                                j0Var = bVar.layout;
                                switch (jVar.getVerticalAlign()) {
                                    case 0:
                                        fK = j0Var.k(iQ);
                                        iB = jVar.b();
                                        fW = fK - iB;
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 1:
                                        fW = j0Var.w(iQ);
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 2:
                                        fK = j0Var.l(iQ);
                                        iB = jVar.b();
                                        fW = fK - iB;
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 3:
                                        fW = ((j0Var.w(iQ) + j0Var.l(iQ)) - jVar.b()) / i18;
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 4:
                                        fB = jVar.a().ascent;
                                        fK2 = j0Var.k(iQ);
                                        fW = fB + fK2;
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 5:
                                        fW = (jVar.a().descent + j0Var.k(iQ)) - jVar.b();
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                                        fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / i18;
                                        fK2 = j0Var.k(iQ);
                                        fW = fB + fK2;
                                        gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                        break;
                                    default:
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                }
                            } else {
                                fD = bVar.layout.A(spanStart, false);
                                iD = jVar.d();
                            }
                            fA = iD + fD;
                            j0Var = bVar.layout;
                            switch (jVar.getVerticalAlign()) {
                                case 0:
                                    fK = j0Var.k(iQ);
                                    iB = jVar.b();
                                    fW = fK - iB;
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 1:
                                    fW = j0Var.w(iQ);
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 2:
                                    fK = j0Var.l(iQ);
                                    iB = jVar.b();
                                    fW = fK - iB;
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 3:
                                    fW = ((j0Var.w(iQ) + j0Var.l(iQ)) - jVar.b()) / i18;
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 4:
                                    fB = jVar.a().ascent;
                                    fK2 = j0Var.k(iQ);
                                    fW = fB + fK2;
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 5:
                                    fW = (jVar.a().descent + j0Var.k(iQ)) - jVar.b();
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetricsIntA2 = jVar.a();
                                    fB = ((fontMetricsIntA2.ascent + fontMetricsIntA2.descent) - jVar.b()) / i18;
                                    fK2 = j0Var.k(iQ);
                                    fW = fB + fK2;
                                    gVar = new m3.g(fD, fW, fA, jVar.b() + fW);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        }
                        arrayList.add(gVar);
                    }
                    listN = arrayList;
                } else {
                    listN = pq.v.n();
                }
                bVar.placeholderRects = listN;
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        TextUtils.TruncateAt truncateAt3 = truncateAt;
        CharSequence charSequence3 = charSequenceJ;
        j0VarI = I(this, iM, zK, truncateAt3, i15, iO, iN, iP, iQ2, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) {
            i17 = i15;
        } else {
            i17 = i15;
        }
        if (b5.v.g(i16, companion.b())) {
            bVar = this;
            i18 = 2;
            bVar.layout = j0VarI;
        } else {
            bVar = this;
            i18 = 2;
            bVar.layout = j0VarI;
        }
        bVar.M().f(style.i(), m3.k.d((((long) Float.floatToRawIntBits(bVar.getHeight())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(bVar.l())) << 32)), style.f());
        gVarArrL = bVar.L(bVar.layout);
        if (gVarArrL != null) {
            while (i25 < r2) {
                gVar2.c(m3.k.d((((long) Float.floatToRawIntBits(bVar.getHeight())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(bVar.l())) << 32)));
            }
        }
        charSequence = bVar.charSequence;
        if (charSequence instanceof Spanned) {
            listN = pq.v.n();
        } else {
            spanned = (Spanned) charSequence;
            Object[] spans2 = spanned.getSpans(0, charSequence.length(), t4.j.class);
            arrayList = new ArrayList(spans2.length);
            while (i19 < r4) {
                t4.j jVar2 = (t4.j) obj;
                int spanStart2 = spanned.getSpanStart(jVar2);
                spanEnd = spanned.getSpanEnd(jVar2);
                iQ = bVar.layout.q(spanStart2);
                if (iQ >= bVar.maxLines) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (bVar.layout.n(iQ) > 0) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (spanEnd > bVar.layout.p(iQ)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                gVar = z16 ? null : null;
                arrayList.add(gVar);
            }
            listN = arrayList;
        }
        bVar.placeholderRects = listN;
    }
}
