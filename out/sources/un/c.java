package un;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private static byte[] a(Cipher cipher) throws sn.h {
        GCMParameterSpec gCMParameterSpecB = b(cipher);
        byte[] iv4 = gCMParameterSpecB.getIV();
        e(iv4, gCMParameterSpecB.getTLen());
        return iv4;
    }

    private static GCMParameterSpec b(Cipher cipher) throws sn.h {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters == null) {
            throw new sn.h("AES GCM ciphers are expected to make use of algorithm parameters");
        }
        try {
            return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
        } catch (InvalidParameterSpecException e15) {
            throw new sn.h(e15.getMessage(), e15);
        }
    }

    public static g c(SecretKey secretKey, io.f<byte[]> fVar, byte[] bArr, byte[] bArr2, Provider provider) throws sn.h {
        SecretKey secretKeyA = io.l.a(secretKey);
        byte[] bArrA = fVar.a();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA, new GCMParameterSpec(128, bArrA));
            cipher.updateAAD(bArr2);
            try {
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                int length = bArrDoFinal.length - io.e.a(128);
                byte[] bArrE = io.e.e(bArrDoFinal, 0, length);
                byte[] bArrE2 = io.e.e(bArrDoFinal, length, io.e.a(128));
                fVar.b(a(cipher));
                return new g(bArrE, bArrE2);
            } catch (BadPaddingException | IllegalBlockSizeException e15) {
                throw new sn.h("Couldn't encrypt with AES/GCM/NoPadding: " + e15.getMessage(), e15);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e16) {
            throw new sn.h("Couldn't create AES/GCM/NoPadding cipher: " + e16.getMessage(), e16);
        }
    }

    public static byte[] d(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static void e(byte[] bArr, int i15) throws sn.h {
        if (io.e.d(bArr) != 96) {
            throw new sn.h(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(io.e.d(bArr))));
        }
        if (i15 != 128) {
            throw new sn.h(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i15)));
        }
    }
}
