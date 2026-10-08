package ek;

import org.bouncycastle.asn1.cmc.BodyPartID;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static int a(long j15) {
        p.k((j15 >> 32) == 0, "out of range: %s", j15);
        return (int) j15;
    }

    public static int b(int i15, int i16) {
        return (int) (c(i15) % c(i16));
    }

    public static long c(int i15) {
        return ((long) i15) & BodyPartID.bodyIdMax;
    }
}
