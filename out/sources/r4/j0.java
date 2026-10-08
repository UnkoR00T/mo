package r4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b5.LineHeightStyle;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u0010*J\u001d\u00104\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u000f¢\u0006\u0004\b:\u00109J\u0015\u0010;\u001a\u00020\b2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b;\u0010*J\u0015\u0010<\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b<\u0010.J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b=\u0010*J%\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DJ9\u0010J\u001a\u0004\u0018\u00010\u00182\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\b2\u0018\u0010I\u001a\u0014\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u000f0H¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020B2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ-\u0010S\u001a\u00020B2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010M\u001a\u00020L2\u0006\u0010R\u001a\u00020\b¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020E2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020B2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010`R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bU\u0010a\u001a\u0004\bb\u0010\\R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bc\u0010a\u001a\u0004\bd\u0010\\R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010i\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bh\u0010a\u001a\u0004\bc\u0010\\R\u0018\u0010l\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010kR \u0010s\u001a\u00020m8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bb\u0010n\u0012\u0004\bq\u0010r\u001a\u0004\bo\u0010pR\u0017\u0010w\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bo\u0010t\u001a\u0004\bu\u0010vR \u0010{\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bx\u0010t\u0012\u0004\bz\u0010r\u001a\u0004\by\u0010vR \u0010~\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b'\u0010t\u0012\u0004\b}\u0010r\u001a\u0004\b|\u0010vR\u0014\u0010\u007f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010CR\u0015\u0010\u0080\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010CR\u0015\u0010\u0081\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010aR\u0019\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010tR \u0010\u0089\u0001\u001a\f\u0012\u0005\u0012\u00030\u0087\u0001\u0018\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0088\u0001R\u0016\u0010F\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u008b\u0001R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bx\u0010\u008f\u0001R\u0013\u0010\u0092\u0001\u001a\u00020j8F¢\u0006\u0007\u001a\u0005\bt\u0010\u0091\u0001R\u0014\u0010\u0095\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0012\u0010\u0096\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010v¨\u0006\u0097\u0001"}, d2 = {"Lr4/j0;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Lr4/s;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILr4/s;)V", "line", "g", "(I)F", "lineIndex", "t", "u", "w", "l", "k", "s", "v", "(I)I", "p", "x", "K", "(I)Z", "o", "n", "vertical", "r", "horizontal", "y", "(IF)I", "offset", "upstream", "A", "(IZ)F", ip.a.f96138c, "q", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "z", "start", "end", "Landroid/graphics/Path;", "dest", "Loq/i0;", "F", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "C", "(Landroid/graphics/RectF;ILer/p;)[I", "", "array", "b", "(I[F)V", "startOffset", "endOffset", "arrayStart", "a", "(II[FI)V", "c", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "M", "(Landroid/graphics/Canvas;)V", "J", "()Z", "Landroid/text/TextPaint;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "Z", "h", "d", "e", "Lr4/s;", "getLayoutIntrinsics", "()Lr4/s;", "f", "didExceedMaxLines", "Ls4/h;", "Ls4/h;", "backingWordIterator", "Landroid/text/Layout;", "Landroid/text/Layout;", "i", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "m", "()I", "lineCount", "j", "getTopPadding$ui_text", "getTopPadding$ui_text$annotations", "topPadding", "getBottomPadding$ui_text", "getBottomPadding$ui_text$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Lt4/h;", "[Lt4/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Lr4/r;", "Lr4/r;", "backingLayoutHelper", "()Lr4/r;", "layoutHelper", "()Ls4/h;", "wordIterator", "G", "()Ljava/lang/CharSequence;", "text", "height", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s layoutIntrinsics;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private s4.h backingWordIterator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final t4.h[] lineHeightSpans;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private r backingLayoutHelper;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    public j0(CharSequence charSequence, float f15, TextPaint textPaint, int i15, TextUtils.TruncateAt truncateAt, int i16, float f16, float f17, boolean z15, boolean z16, int i17, int i18, int i19, int i25, int i26, int i27, int[] iArr, int[] iArr2, s sVar) {
        boolean z17;
        int i28;
        boolean z18;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutA;
        boolean z19;
        int iC;
        ?? r15;
        ?? B;
        long jA;
        t4.h hVar;
        t4.h hVar2;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z15;
        this.fallbackLineSpacing = z16;
        this.layoutIntrinsics = sVar;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = l0.k(i16);
        Layout.Alignment alignmentA = h0.f171501a.a(i15);
        boolean z25 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, t4.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsC = sVar.c();
            double d15 = f15;
            int iCeil = (int) Math.ceil(d15);
            if (metricsC == null || sVar.g() > f15 || z25) {
                z17 = true;
                this.isBoringLayout = false;
                i28 = i17;
                z18 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                textPaint2 = textPaint;
                layoutA = e0.f171474a.a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i28, truncateAt, (int) Math.ceil(d15), f16, f17, i27, z15, z16, i18, i19, i25, i26, iArr, iArr2);
            } else {
                z17 = true;
                this.isBoringLayout = true;
                layoutA = g.f171478a.a(charSequence, textPaint, iCeil, metricsC, alignmentA, z15, z16, truncateAt, iCeil);
                textPaint2 = textPaint;
                i28 = i17;
                textDirectionHeuristic = textDirectionHeuristicK;
                z18 = false;
            }
            this.layout = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i28);
            this.lineCount = iMin;
            int i29 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i28 && (layoutA.getEllipsisCount(i29) > 0 || layoutA.getLineEnd(i29) != charSequence.length())) ? z17 : z18;
            t4.h[] hVarArrI = l0.i(this);
            this.lineHeightSpans = hVarArrI;
            if (hVarArrI == null || (hVar2 = (t4.h) pq.n.p0(hVarArrI)) == null) {
                z19 = z18;
            } else {
                z19 = (hVar2.getTrimFirstLineTop() && LineHeightStyle.c.g(hVar2.getMode(), LineHeightStyle.c.INSTANCE.c())) ? z17 : z18;
            }
            boolean z26 = (hVarArrI == null || (hVar = (t4.h) pq.n.p0(hVarArrI)) == null || !hVar.getTrimLastLineBottom() || !LineHeightStyle.c.g(hVar.getMode(), LineHeightStyle.c.INSTANCE.c())) ? z18 : z17;
            if (z19 && z26) {
                jA = l0.f171529b;
            } else {
                long jL = l0.l(this);
                if (z19) {
                    r15 = z18;
                } else {
                    iC = m0.c(jL);
                }
                if (z26) {
                    r15 = iC;
                    B = z18;
                } else {
                    r15 = iC;
                    B = m0.b(jL);
                }
                jA = l0.a(r15, B);
            }
            long jH = hVarArrI != null ? l0.h(hVarArrI) : l0.f171529b;
            this.topPadding = Math.max(m0.c(jA), m0.c(jH));
            this.bottomPadding = Math.max(m0.b(jA), m0.b(jH));
            Paint.FontMetricsInt fontMetricsIntG = l0.g(this, textPaint2, textDirectionHeuristic, hVarArrI);
            this.lastLineExtra = fontMetricsIntG != null ? fontMetricsIntG.bottom - ((int) s(i29)) : z18;
            this.lastLineFontMetrics = fontMetricsIntG;
            this.leftPadding = t4.d.b(layoutA, i29, null, 2, null);
            this.rightPadding = t4.d.d(layoutA, i29, null, 2, null);
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public static /* synthetic */ float B(j0 j0Var, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return j0Var.A(i15, z15);
    }

    public static /* synthetic */ float E(j0 j0Var, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return j0Var.D(i15, z15);
    }

    private final float g(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final r j() {
        r rVar = this.backingLayoutHelper;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.layout);
        this.backingLayoutHelper = rVar2;
        return rVar2;
    }

    public final float A(int offset, boolean upstream) {
        return j().c(offset, true, upstream) + g(q(offset));
    }

    public final int[] C(RectF rect, int granularity, er.p<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? d.f171472a.c(this, rect, granularity, inclusionStrategy) : k0.d(this, this.layout, j(), rect, granularity, inclusionStrategy);
    }

    public final float D(int offset, boolean upstream) {
        return j().c(offset, false, upstream) + g(q(offset));
    }

    public final void F(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final CharSequence G() {
        return this.layout.getText();
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final s4.h I() {
        s4.h hVar = this.backingWordIterator;
        if (hVar != null) {
            return hVar;
        }
        s4.h hVar2 = new s4.h(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = hVar2;
        return hVar2;
    }

    public final boolean J() {
        return this.isBoringLayout ? g.f171478a.b((BoringLayout) this.layout) : e0.f171474a.c((StaticLayout) this.layout, this.fallbackLineSpacing);
    }

    public final boolean K(int lineIndex) {
        return l0.m(this.layout, lineIndex);
    }

    public final boolean L(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void M(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i15 = this.topPadding;
            if (i15 != 0) {
                canvas.translate(0.0f, i15);
            }
            ThreadLocal<i0> threadLocalJ = l0.j();
            i0 i0Var = threadLocalJ.get();
            if (i0Var == null) {
                i0Var = new i0();
                threadLocalJ.set(i0Var);
            }
            i0 i0Var2 = i0Var;
            i0Var2.b(canvas);
            try {
                this.layout.draw(i0Var2);
                i0Var2.b(null);
                int i16 = this.topPadding;
                if (i16 != 0) {
                    canvas.translate(0.0f, (-1) * i16);
                }
            } catch (Throwable th4) {
                i0Var2.b(null);
                throw th4;
            }
        }
    }

    public final void a(int startOffset, int endOffset, float[] array, int arrayStart) {
        float fD;
        float fE;
        int length = G().length();
        if (!(startOffset >= 0)) {
            w4.a.a("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            w4.a.a("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            w4.a.a("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            w4.a.a("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            w4.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iQ = q(startOffset);
        int iQ2 = q(endOffset - 1);
        o oVar = new o(this);
        if (iQ > iQ2) {
            return;
        }
        int i15 = iQ;
        int i16 = arrayStart;
        while (true) {
            int iV = v(i15);
            int iP = p(i15);
            int iMin = Math.min(endOffset, iP);
            float fW = w(i15);
            float fL = l(i15);
            boolean z15 = z(i15) == 1;
            for (int iMax = Math.max(startOffset, iV); iMax < iMin; iMax++) {
                boolean zL = L(iMax);
                if (z15 && !zL) {
                    fD = oVar.b(iMax);
                    fE = oVar.c(iMax + 1);
                } else if (z15 && zL) {
                    fE = oVar.d(iMax);
                    fD = oVar.e(iMax + 1);
                } else if (z15 || !zL) {
                    fD = oVar.d(iMax);
                    fE = oVar.e(iMax + 1);
                } else {
                    fE = oVar.b(iMax);
                    fD = oVar.c(iMax + 1);
                }
                array[i16] = fD;
                array[i16 + 1] = fW;
                array[i16 + 2] = fE;
                array[i16 + 3] = fL;
                i16 += 4;
            }
            if (i15 == iQ2) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void b(int lineIndex, float[] array) {
        float fD;
        float fE;
        int iV = v(lineIndex);
        int iP = p(lineIndex);
        int i15 = 0;
        if (!(array.length >= (iP - iV) * 2)) {
            w4.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        o oVar = new o(this);
        boolean z15 = z(lineIndex) == 1;
        while (iV < iP) {
            boolean zL = L(iV);
            if (z15 && !zL) {
                fD = oVar.b(iV);
                fE = oVar.c(iV + 1);
            } else if (z15 && zL) {
                fE = oVar.d(iV);
                fD = oVar.e(iV + 1);
            } else if (zL) {
                fE = oVar.b(iV);
                fD = oVar.c(iV + 1);
            } else {
                fD = oVar.d(iV);
                fE = oVar.e(iV + 1);
            }
            array[i15] = fD;
            array[i15 + 1] = fE;
            i15 += 2;
            iV++;
        }
    }

    public final RectF c(int offset) {
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(offset);
        float fW = w(iQ);
        float fL = l(iQ);
        boolean z15 = z(iQ) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z15 || zIsRtlCharAt) {
            if (z15 && zIsRtlCharAt) {
                fA = D(offset, false);
                fA2 = D(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(offset, false);
                fA2 = A(offset + 1, true);
            } else {
                fD = D(offset, false);
                fD2 = D(offset + 1, true);
            }
            float f15 = fA;
            fD = fA2;
            fD2 = f15;
        } else {
            fD = A(offset, false);
            fD2 = A(offset + 1, true);
        }
        return new RectF(fD, fW, fD2, fL);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int f() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final float k(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : w(line) - this.lastLineFontMetrics.ascent);
    }

    public final float l(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int n(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int o(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int p(int lineIndex) {
        return (l0.m(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final int q(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int r(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float s(int lineIndex) {
        return l(lineIndex) - w(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float u(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int v(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float w(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int x(int lineIndex) {
        return (l0.m(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex) : j().e(lineIndex);
    }

    public final int y(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * g(line)));
    }

    public final int z(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public /* synthetic */ j0(CharSequence charSequence, float f15, TextPaint textPaint, int i15, TextUtils.TruncateAt truncateAt, int i16, float f16, float f17, boolean z15, boolean z16, int i17, int i18, int i19, int i25, int i26, int i27, int[] iArr, int[] iArr2, s sVar, int i28, fr.k kVar) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        s sVar2;
        int i29 = (i28 & 8) != 0 ? 0 : i15;
        TextUtils.TruncateAt truncateAt2 = (i28 & 16) != 0 ? null : truncateAt;
        int i35 = (i28 & 32) != 0 ? 2 : i16;
        float f18 = (i28 & 64) != 0 ? 1.0f : f16;
        float f19 = (i28 & 128) != 0 ? 0.0f : f17;
        boolean z17 = (i28 & 256) != 0 ? false : z15;
        boolean z18 = (i28 & 512) != 0 ? true : z16;
        int i36 = (i28 & 1024) != 0 ? Integer.MAX_VALUE : i17;
        int i37 = (i28 & 2048) != 0 ? 0 : i18;
        int i38 = (i28 & PKIFailureInfo.certConfirmed) != 0 ? 0 : i19;
        int i39 = (i28 & PKIFailureInfo.certRevoked) != 0 ? 0 : i25;
        int i45 = (i28 & 16384) != 0 ? 0 : i26;
        int i46 = (32768 & i28) != 0 ? 0 : i27;
        int[] iArr3 = (65536 & i28) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i28) != 0 ? null : iArr2;
        if ((i28 & PKIFailureInfo.transactionIdInUse) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            sVar2 = new s(charSequence2, textPaint2, i35);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            sVar2 = sVar;
        }
        this(charSequence2, f15, textPaint2, i29, truncateAt2, i35, f18, f19, z17, z18, i36, i37, i38, i39, i45, i46, iArr3, iArr4, sVar2);
    }
}
