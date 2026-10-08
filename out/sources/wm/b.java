package wm;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static int a(int i15) {
        if (i15 == 0) {
            return 0;
        }
        if (i15 == 90) {
            return 1;
        }
        if (i15 == 180) {
            return 2;
        }
        if (i15 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i15);
    }

    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i15 = 0; i15 < pointArr.length; i15++) {
            Point point = pointArr[i15];
            int i16 = i15 + i15;
            fArr[i16] = point.x;
            fArr[i16 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i17 = 0; i17 < pointArr.length; i17++) {
            int i18 = i17 + i17;
            pointArr[i17].set((int) fArr[i18], (int) fArr[i18 + 1]);
        }
    }

    public static void c(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void d(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i15 = 0; i15 < list.size(); i15++) {
            int i16 = i15 + i15;
            fArr[i16] = list.get(i15).x;
            fArr[i16 + 1] = list.get(i15).y;
        }
        matrix.mapPoints(fArr);
        for (int i17 = 0; i17 < list.size(); i17++) {
            int i18 = i17 + i17;
            list.get(i17).set(fArr[i18], fArr[i18 + 1]);
        }
    }

    public static void e(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
