package lp;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public abstract b a();

    final long b() {
        return (((long) c()) & BodyPartID.bodyIdMax) | ((BodyPartID.bodyIdMax & ((long) d())) << 32);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract mo.b f();

    public abstract f g();

    public abstract int h();

    public abstract x i();

    public abstract String j();

    public abstract int k();

    final int l() {
        int iK = k();
        if (iK == 100) {
            return 2;
        }
        if (iK == 200) {
            return 3;
        }
        if (iK == 300) {
            return 4;
        }
        if (iK == 400) {
            return 5;
        }
        if (iK == 500) {
            return 6;
        }
        if (iK == 600) {
            return 7;
        }
        if (iK == 700) {
            return 8;
        }
        if (iK != 800) {
            return iK != 900 ? 0 : 10;
        }
        return 9;
    }

    public String toString() {
        return j() + " (" + g() + ", mac: 0x" + Integer.toHexString(h()) + ", os/2: 0x" + Integer.toHexString(e()) + ", cid: " + a() + ")";
    }
}
