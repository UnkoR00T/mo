package um;

import android.graphics.Point;
import android.graphics.Rect;
import ch.sl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements tm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sl f199045a;

    public m(sl slVar) {
        this.f199045a = slVar;
    }

    @Override // tm.a
    public final String a() {
        return this.f199045a.p();
    }

    @Override // tm.a
    public final String b() {
        return this.f199045a.r();
    }

    @Override // tm.a
    public final Rect c() {
        Point[] pointArrY = this.f199045a.y();
        if (pointArrY == null) {
            return null;
        }
        int iMax = PKIFailureInfo.systemUnavail;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrY) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // tm.a
    public final int d() {
        return this.f199045a.m();
    }

    @Override // tm.a
    public final byte[] e() {
        return this.f199045a.u();
    }

    @Override // tm.a
    public final Point[] f() {
        return this.f199045a.y();
    }

    @Override // tm.a
    public final int getFormat() {
        return this.f199045a.h();
    }
}
