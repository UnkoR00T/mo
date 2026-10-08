package p027coN;

import java.util.Arrays;
import jc.b;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends z1 {
    public s2(b bVar, int i15) {
        this.f28661a = (byte) 0;
        this.f28662b = (byte) 34;
        this.f28663c = (byte) -63;
        this.f28664d = (byte) -92;
        this.f28667g = null;
        byte[] bArr = bVar.f101384a;
        byte[] bArrH = n.H(n.H(n.H(new byte[]{-128, (byte) (bArr.length & GF2Field.MASK)}, Arrays.copyOf(bArr, bArr.length)), new byte[]{-125, 1, (byte) i15}), new byte[]{-124, 1, (byte) bVar.f101387d});
        this.f28665e = Byte.valueOf((byte) (bArrH.length & GF2Field.MASK));
        this.f28666f = bArrH;
    }
}
