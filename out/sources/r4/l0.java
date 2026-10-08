package r4;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"&\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\"\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Lr4/m0;", "a", "(II)J", "Lr4/j0;", "l", "(Lr4/j0;)J", "", "Lt4/h;", "h", "([Lt4/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "g", "(Lr4/j0;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lt4/h;)Landroid/graphics/Paint$FontMetricsInt;", "i", "(Lr4/j0;)[Lt4/h;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "Ljava/lang/ThreadLocal;", "Lr4/i0;", "Ljava/lang/ThreadLocal;", "j", "()Ljava/lang/ThreadLocal;", "getSharedTextAndroidCanvas$annotations", "()V", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<i0> f171528a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f171529b = a(0, 0);

    public static final long a(int i15, int i16) {
        return m0.a((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(j0 j0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, t4.h[] hVarArr) {
        int iM = j0Var.m() - 1;
        if (j0Var.i().getLineStart(iM) != j0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        t4.h hVar = (t4.h) pq.n.n0(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.getTrimLastLineBottom()) ? hVar.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = e0.f171474a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? p.f171538a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? p.f171538a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & PKIFailureInfo.certConfirmed) != 0 ? 0 : 0, (2072512 & PKIFailureInfo.certRevoked) != 0 ? false : j0Var.h(), (2072512 & 16384) != 0 ? true : j0Var.e(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & PKIFailureInfo.badCertTemplate) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(t4.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (t4.h hVar : hVarArr) {
            if (hVar.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.getFirstAscentDiff()));
            }
            if (hVar.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f171529b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t4.h[] i(j0 j0Var) {
        if (!(j0Var.G() instanceof Spanned)) {
            return null;
        }
        if (x.a((Spanned) j0Var.G(), t4.h.class) || j0Var.G().length() <= 0) {
            return (t4.h[]) ((Spanned) j0Var.G()).getSpans(0, j0Var.G().length(), t4.h.class);
        }
        return null;
    }

    public static final ThreadLocal<i0> j() {
        return f171528a;
    }

    public static final TextDirectionHeuristic k(int i15) {
        if (i15 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i15 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i15 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i15 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i15 != 4) {
            return i15 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(j0 j0Var) {
        if (j0Var.h() || j0Var.J()) {
            return f171529b;
        }
        TextPaint paint = j0Var.i().getPaint();
        CharSequence text = j0Var.i().getText();
        Rect rectC = w.c(paint, text, j0Var.i().getLineStart(0), j0Var.i().getLineEnd(0));
        int lineAscent = j0Var.i().getLineAscent(0);
        int i15 = rectC.top;
        int topPadding = i15 < lineAscent ? lineAscent - i15 : j0Var.i().getTopPadding();
        if (j0Var.m() != 1) {
            int iM = j0Var.m() - 1;
            rectC = w.c(paint, text, j0Var.i().getLineStart(iM), j0Var.i().getLineEnd(iM));
        }
        int lineDescent = j0Var.i().getLineDescent(j0Var.m() - 1);
        int i16 = rectC.bottom;
        int bottomPadding = i16 > lineDescent ? i16 - lineDescent : j0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f171529b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i15) {
        return layout.getEllipsisCount(i15) > 0;
    }
}
