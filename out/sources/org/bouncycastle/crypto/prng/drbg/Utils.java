package org.bouncycastle.crypto.prng.drbg;

import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    static final Hashtable maxSecurityStrengths;

    static {
        Hashtable hashtable = new Hashtable();
        maxSecurityStrengths = hashtable;
        hashtable.put("SHA-1", Integers.valueOf(128));
        hashtable.put("SHA-224", Integers.valueOf(192));
        hashtable.put(XMSSKeyParameters.SHA_256, Integers.valueOf(256));
        hashtable.put("SHA-384", Integers.valueOf(256));
        hashtable.put(XMSSKeyParameters.SHA_512, Integers.valueOf(256));
        hashtable.put("SHA-512/224", Integers.valueOf(192));
        hashtable.put(SPHINCSKeyParameters.SHA512_256, Integers.valueOf(256));
    }

    Utils() {
    }

    static int getMaxSecurityStrength(Digest digest) {
        return ((Integer) maxSecurityStrengths.get(digest.getAlgorithmName())).intValue();
    }

    static byte[] hash_df(Digest digest, byte[] bArr, int i15) {
        int i16 = (i15 + 7) / 8;
        byte[] bArr2 = new byte[i16];
        int digestSize = i16 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i17 = 1;
        int i18 = 0;
        for (int i19 = 0; i19 <= digestSize; i19++) {
            digest.update((byte) i17);
            digest.update((byte) (i15 >> 24));
            digest.update((byte) (i15 >> 16));
            digest.update((byte) (i15 >> 8));
            digest.update((byte) i15);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i25 = i19 * digestSize2;
            int i26 = i16 - i25;
            if (i26 > digestSize2) {
                i26 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i25, i26);
            i17++;
        }
        int i27 = i15 % 8;
        if (i27 != 0) {
            int i28 = 8 - i27;
            int i29 = 0;
            while (i18 != i16) {
                int i35 = bArr2[i18] & GF2Field.MASK;
                bArr2[i18] = (byte) ((i29 << (8 - i28)) | (i35 >>> i28));
                i18++;
                i29 = i35;
            }
        }
        return bArr2;
    }

    static boolean isTooLarge(byte[] bArr, int i15) {
        return bArr != null && bArr.length > i15;
    }

    static int getMaxSecurityStrength(Mac mac) {
        String algorithmName = mac.getAlgorithmName();
        return ((Integer) maxSecurityStrengths.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }
}
