package p027coN;

import ic.q;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends z1 {
    public n2(q qVar, Byte b15) {
        this.f28661a = (byte) 0;
        this.f28662b = (byte) -92;
        this.f28663c = (byte) 2;
        this.f28664d = (byte) 12;
        this.f28667g = b15;
        this.f28665e = Byte.valueOf((byte) (qVar.b().length & GF2Field.MASK));
        byte[] bArrB = qVar.b();
        this.f28666f = Arrays.copyOf(bArrB, bArrB.length);
    }
}
