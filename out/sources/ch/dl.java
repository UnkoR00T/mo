package ch;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dl {
    public static dl f(Iterable iterable, int i15, int i16, float f15) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i15;
        int iMin2 = i16;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f16 = i15;
        float f17 = i16;
        return new bl((iMin + 0.0f) / f16, (iMin2 + 0.0f) / f17, (iMax + 0.0f) / f16, (iMax2 + 0.0f) / f17, 0.0f);
    }

    abstract float a();

    abstract float b();

    abstract float c();

    abstract float d();

    abstract float e();
}
