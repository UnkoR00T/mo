package io;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static byte[] a(int i15) {
        return new byte[]{(byte) (i15 >>> 24), (byte) ((i15 >>> 16) & GF2Field.MASK), (byte) ((i15 >>> 8) & GF2Field.MASK), (byte) (i15 & GF2Field.MASK)};
    }
}
