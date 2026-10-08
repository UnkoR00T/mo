package cn;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class g {
    static Rect a(List list, Matrix matrix) {
        Iterator it = list.iterator();
        int iMax = PKIFailureInfo.systemUnavail;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        RectF rectF = new RectF(iMin, iMin2, iMax, iMax2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    static sq b(com.google.android.gms.internal.mlkit_vision_text_bundled_common.l lVar) {
        if (lVar.K()) {
            return lVar.F().G();
        }
        return lVar.E() ? lVar.H().E() : lVar.G();
    }

    static List c(sq sqVar) {
        double dSin = Math.sin(Math.toRadians(sqVar.E()));
        double dCos = Math.cos(Math.toRadians(sqVar.E()));
        Point point = new Point((int) (((double) sqVar.G()) + (((double) sqVar.I()) * dCos)), (int) (((double) sqVar.H()) + (((double) sqVar.I()) * dSin)));
        double d15 = point.x;
        double dF = ((double) sqVar.F()) * dSin;
        double dF2 = ((double) pointArr[1].y) + (((double) sqVar.F()) * dCos);
        Point point2 = pointArr[0];
        int i15 = point2.x;
        Point point3 = pointArr[2];
        int i16 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(sqVar.G(), sqVar.H()), point, new Point((int) (d15 - dF), (int) dF2), new Point(i15 + (i16 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
