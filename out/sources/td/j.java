package td;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import od.o;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PointF f189603a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f15, float f16, float f17) {
        return Math.max(f16, Math.min(f17, f15));
    }

    public static int c(int i15, int i16, int i17) {
        return Math.max(i16, Math.min(i17, i15));
    }

    public static boolean d(float f15, float f16, float f17) {
        return f15 >= f16 && f15 <= f17;
    }

    private static int e(int i15, int i16) {
        int i17 = i15 / i16;
        return (((i15 ^ i16) >= 0) || i15 % i16 == 0) ? i17 : i17 - 1;
    }

    static int f(float f15, float f16) {
        return g((int) f15, (int) f16);
    }

    private static int g(int i15, int i16) {
        return i15 - (i16 * e(i15, i16));
    }

    public static void h(o oVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFB = oVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f189603a.set(pointFB.x, pointFB.y);
        int i15 = 0;
        while (i15 < oVar.a().size()) {
            md.a aVar = oVar.a().get(i15);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointF = f189603a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i15++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static float i(float f15, float f16, float f17) {
        return f15 + (f17 * (f16 - f15));
    }

    public static int j(int i15, int i16, float f15) {
        return (int) (i15 + (f15 * (i16 - i15)));
    }

    public static void k(md.e eVar, int i15, List<md.e> list, md.e eVar2, hd.k kVar) {
        if (eVar.c(kVar.getName(), i15)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
