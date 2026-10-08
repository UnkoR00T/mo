package t4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import c5.w;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001#BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ;\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b'\u0010,R$\u00101\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00168\u0006@BX\u0086.¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b#\u00100R$\u00103\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b(\u0010,R$\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b%\u0010,R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lt4/j;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "widthAsSpInPx", "heightAsSpInPx", "verticalAlign", "<init>", "(FIFIFFI)V", "Lc5/d;", "density", "(FIFILc5/d;I)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "Loq/i0;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", "F", "b", "I", "c", "d", "e", "f", "g", "()I", "value", "h", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "j", "widthPx", "k", "heightPx", "", "l", "Z", "isLaidOut", "m", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f187617n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int widthUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int heightUnit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float widthAsSpInPx;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float heightAsSpInPx;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int verticalAlign;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int widthPx;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int heightPx;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isLaidOut;

    private j(float f15, int i15, float f16, int i16, float f17, float f18, int i17) {
        this.width = f15;
        this.widthUnit = i15;
        this.height = f16;
        this.heightUnit = i16;
        this.widthAsSpInPx = f17;
        this.heightAsSpInPx = f18;
        this.verticalAlign = i17;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        return null;
    }

    public final int b() {
        if (!this.isLaidOut) {
            w4.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int d() {
        if (!this.isLaidOut) {
            w4.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x15, int top, int y15, int bottom, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm4) {
        float f15;
        float f16;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            w4.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i15 = this.widthUnit;
        if (i15 == 0) {
            f15 = this.widthAsSpInPx;
        } else {
            if (i15 != 1) {
                w4.a.b("Unsupported unit.");
                throw new oq.g();
            }
            f15 = this.width * textSize;
        }
        this.widthPx = k.a(f15);
        int i16 = this.heightUnit;
        if (i16 == 0) {
            f16 = this.heightAsSpInPx;
        } else {
            if (i16 != 1) {
                w4.a.b("Unsupported unit.");
                throw new oq.g();
            }
            f16 = this.height * textSize;
        }
        this.heightPx = k.a(f16);
        if (fm4 != null) {
            fm4.ascent = a().ascent;
            fm4.descent = a().descent;
            fm4.leading = a().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm4.ascent > (-b())) {
                        fm4.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fm4.ascent + b() > fm4.descent) {
                        fm4.descent = fm4.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fm4.ascent > fm4.descent - b()) {
                        fm4.ascent = fm4.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fm4.descent - fm4.ascent < b()) {
                        int iB = fm4.ascent - ((b() - (fm4.descent - fm4.ascent)) / 2);
                        fm4.ascent = iB;
                        fm4.descent = iB + b();
                    }
                    break;
                default:
                    w4.a.a("Unknown verticalAlign.");
                    break;
            }
            fm4.top = Math.min(a().top, fm4.ascent);
            fm4.bottom = Math.max(a().bottom, fm4.descent);
        }
        return d();
    }

    public j(float f15, int i15, float f16, int i16, c5.d dVar, int i17) {
        this(f15, i15, f16, i16, i15 == 0 ? dVar.e1(w.f(f15)) : 0.0f, i16 == 0 ? dVar.e1(w.f(f16)) : 0.0f, i17);
    }
}
