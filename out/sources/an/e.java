package an;

import android.graphics.Point;
import android.graphics.Rect;
import fh.e4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class e {
    static Rect a(List list) {
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
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    static List b(e4 e4Var) {
        double dSin = Math.sin(Math.toRadians(e4Var.f63015e));
        double dCos = Math.cos(Math.toRadians(e4Var.f63015e));
        double d15 = e4Var.f63011a;
        double d16 = e4Var.f63013c;
        Point point = new Point((int) (d15 + (d16 * dCos)), (int) (((double) e4Var.f63012b) + (d16 * dSin)));
        double d17 = point.x;
        int i15 = e4Var.f63014d;
        double d18 = ((double) i15) * dSin;
        double d19 = ((double) pointArr[1].y) + (((double) i15) * dCos);
        Point point2 = pointArr[0];
        int i16 = point2.x;
        Point point3 = pointArr[2];
        int i17 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(e4Var.f63011a, e4Var.f63012b), point, new Point((int) (d17 - d18), (int) d19), new Point(i16 + (i17 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
