package um;

import android.graphics.Point;
import android.graphics.Rect;
import ch.zh;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements tm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zh f199054a;

    public o(zh zhVar) {
        this.f199054a = zhVar;
    }

    @Override // tm.a
    public final String a() {
        return this.f199054a.f26749c;
    }

    @Override // tm.a
    public final String b() {
        return this.f199054a.f26748b;
    }

    @Override // tm.a
    public final Rect c() {
        zh zhVar = this.f199054a;
        if (zhVar.f26751e == null) {
            return null;
        }
        int i15 = 0;
        int iMax = PKIFailureInfo.systemUnavail;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zhVar.f26751e;
            if (i15 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i15];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i15++;
        }
    }

    @Override // tm.a
    public final int d() {
        return this.f199054a.f26750d;
    }

    @Override // tm.a
    public final byte[] e() {
        return this.f199054a.f26761q;
    }

    @Override // tm.a
    public final Point[] f() {
        return this.f199054a.f26751e;
    }

    @Override // tm.a
    public final int getFormat() {
        return this.f199054a.f26747a;
    }
}
