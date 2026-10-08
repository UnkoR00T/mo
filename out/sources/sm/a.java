package sm;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;
import jg.s;
import wm.b;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tm.a f182367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f182368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point[] f182369c;

    public a(tm.a aVar, Matrix matrix) {
        this.f182367a = (tm.a) s.l(aVar);
        Rect rectC = aVar.c();
        if (rectC != null && matrix != null) {
            b.e(rectC, matrix);
        }
        this.f182368b = rectC;
        Point[] pointArrF = aVar.f();
        if (pointArrF != null && matrix != null) {
            b.b(pointArrF, matrix);
        }
        this.f182369c = pointArrF;
    }

    public Point[] a() {
        return this.f182369c;
    }

    public String b() {
        return this.f182367a.a();
    }

    public int c() {
        int format = this.f182367a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public byte[] d() {
        byte[] bArrE = this.f182367a.e();
        if (bArrE != null) {
            return Arrays.copyOf(bArrE, bArrE.length);
        }
        return null;
    }

    public String e() {
        return this.f182367a.b();
    }

    public int f() {
        return this.f182367a.d();
    }
}
