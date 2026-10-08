package org.bouncycastle.util;

import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
public class Fingerprint {
    private static char[] encodingTable = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] fingerprint;

    public Fingerprint(byte[] bArr) {
        this(bArr, 160);
    }

    public static byte[] calculateFingerprint(byte[] bArr) {
        return calculateFingerprint(bArr, 160);
    }

    @Deprecated
    public static byte[] calculateFingerprintSHA512_160(byte[] bArr) {
        SHA512tDigest sHA512tDigest = new SHA512tDigest(160);
        sHA512tDigest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[sHA512tDigest.getDigestSize()];
        sHA512tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Fingerprint) {
            return Arrays.areEqual(((Fingerprint) obj).fingerprint, this.fingerprint);
        }
        return false;
    }

    public byte[] getFingerprint() {
        return Arrays.clone(this.fingerprint);
    }

    public int hashCode() {
        return Arrays.hashCode(this.fingerprint);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 != this.fingerprint.length; i15++) {
            if (i15 > 0) {
                sb5.append(":");
            }
            sb5.append(encodingTable[(this.fingerprint[i15] >>> 4) & 15]);
            sb5.append(encodingTable[this.fingerprint[i15] & 15]);
        }
        return sb5.toString();
    }

    public Fingerprint(byte[] bArr, int i15) {
        this.fingerprint = calculateFingerprint(bArr, i15);
    }

    public static byte[] calculateFingerprint(byte[] bArr, int i15) {
        if (i15 % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i16 = i15 / 8;
        byte[] bArr2 = new byte[i16];
        sHAKEDigest.doFinal(bArr2, 0, i16);
        return bArr2;
    }

    @Deprecated
    public Fingerprint(byte[] bArr, boolean z15) {
        if (z15) {
            this.fingerprint = calculateFingerprintSHA512_160(bArr);
        } else {
            this.fingerprint = calculateFingerprint(bArr);
        }
    }
}
