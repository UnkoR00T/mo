package a5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import c5.t;
import lr.m;
import m3.k;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u00069"}, d2 = {"La5/c;", "Landroid/text/style/LeadingMarginSpan;", "Ln3/y2;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "Lp3/g;", "drawStyle", "Lc5/d;", "density", "textIndentPx", "<init>", "(Ln3/y2;FFFLandroidx/compose/ui/graphics/c;FLp3/g;Lc5/d;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", "p", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "Loq/i0;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "a", "Ln3/y2;", "b", "F", "d", "Landroidx/compose/ui/graphics/c;", "e", "f", "Lp3/g;", "g", "Lc5/d;", "h", "I", "minimumRequiredIndent", "j", "diff", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f3446k = p3.g.f152590a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2 shape;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float bulletWidthPx;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float bulletHeightPx;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.c brush;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p3.g drawStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int minimumRequiredIndent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int diff;

    public c(y2 y2Var, float f15, float f16, float f17, androidx.compose.ui.graphics.c cVar, float f18, p3.g gVar, c5.d dVar, float f19) {
        this.shape = y2Var;
        this.bulletWidthPx = f15;
        this.bulletHeightPx = f16;
        this.brush = cVar;
        this.alpha = f18;
        this.drawStyle = gVar;
        this.density = dVar;
        int iD = hr.a.d(f15 + f17);
        this.minimumRequiredIndent = iD;
        this.diff = hr.a.d(f19) - iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(c cVar, long j15, int i15, Canvas canvas, Paint paint, int i16, float f15) {
        a.d(cVar.shape.a(j15, i15 > 0 ? t.Ltr : t.Rtl, cVar.density), canvas, paint, i16, f15, i15);
        return i0.f148189a;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas c15, final Paint p15, int x15, final int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        if (c15 == null) {
            return;
        }
        final float f15 = (top + bottom) / 2.0f;
        final int iE = m.e(x15 - this.minimumRequiredIndent, 0);
        if (((Spanned) text).getSpanStart(this) != start || p15 == null) {
            return;
        }
        Paint.Style style = p15.getStyle();
        a.f(p15, this.drawStyle);
        float f16 = this.bulletWidthPx;
        final long jD = k.d((((long) Float.floatToRawIntBits(this.bulletHeightPx)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f16) << 32));
        a.e(p15, this.brush, this.alpha, jD, new er.a() { // from class: a5.b
            @Override // er.a
            public final Object a() {
                return c.b(this.f3439a, jD, dir, c15, p15, iE, f15);
            }
        });
        p15.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i15 = this.diff;
        if (i15 >= 0) {
            return 0;
        }
        return Math.abs(i15);
    }
}
