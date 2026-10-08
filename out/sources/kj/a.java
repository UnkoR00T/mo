package kj;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import x5.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f111110i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f111111j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f111112k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f111113l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f111114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f111115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f111116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f111120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f111121h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i15, float f15, float f16) {
        float f17;
        boolean z15 = f16 < 0.0f;
        Path path = this.f111120g;
        if (z15) {
            int[] iArr = f111112k;
            iArr[0] = 0;
            iArr[1] = this.f111119f;
            iArr[2] = this.f111118e;
            iArr[3] = this.f111117d;
            f17 = f15;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f17 = f15;
            path.arcTo(rectF, f17, f16);
            path.close();
            float f18 = -i15;
            rectF.inset(f18, f18);
            int[] iArr2 = f111112k;
            iArr2[0] = 0;
            iArr2[1] = this.f111117d;
            iArr2[2] = this.f111118e;
            iArr2[3] = this.f111119f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f19 = 1.0f - (i15 / fWidth);
        float[] fArr = f111113l;
        fArr[1] = f19;
        fArr[2] = ((1.0f - f19) / 2.0f) + f19;
        this.f111115b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f111112k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z15) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f111121h);
        }
        canvas.drawArc(rectF, f17, f16, true, this.f111115b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i15) {
        rectF.bottom += i15;
        rectF.offset(0.0f, -i15);
        int[] iArr = f111110i;
        iArr[0] = this.f111119f;
        iArr[1] = this.f111118e;
        iArr[2] = this.f111117d;
        Paint paint = this.f111116c;
        float f15 = rectF.left;
        paint.setShader(new LinearGradient(f15, rectF.top, f15, rectF.bottom, iArr, f111111j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f111116c);
        canvas.restore();
    }

    public Paint c() {
        return this.f111114a;
    }

    public void d(int i15) {
        this.f111117d = c.k(i15, 68);
        this.f111118e = c.k(i15, 20);
        this.f111119f = c.k(i15, 0);
        this.f111114a.setColor(this.f111117d);
    }

    public a(int i15) {
        this.f111120g = new Path();
        Paint paint = new Paint();
        this.f111121h = paint;
        this.f111114a = new Paint();
        d(i15);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f111115b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f111116c = new Paint(paint2);
    }
}
