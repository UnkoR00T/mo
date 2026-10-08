package p027coN;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends z1 {
    public k2(int i15, int i16, Byte b15) {
        this.f28661a = (byte) 0;
        this.f28662b = (byte) -80;
        this.f28663c = (byte) 0;
        this.f28664d = (byte) 0;
        this.f28665e = null;
        if (b15 != null) {
            this.f28663c = (byte) (b15.byteValue() | (-128));
            this.f28664d = (byte) 0;
        } else {
            this.f28663c = (byte) ((65280 & i16) >> 8);
            this.f28664d = (byte) (i16 & GF2Field.MASK);
        }
        this.f28667g = Byte.valueOf((byte) i15);
    }
}
