package un;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    public enum a {
        DIRECT,
        KW
    }

    public static SecretKey a(sn.n nVar, SecretKey secretKey, k kVar) throws sn.h {
        String strA;
        int iD = d(nVar.v(), nVar.B());
        a aVarC = c(nVar.v());
        if (aVarC == a.DIRECT) {
            strA = nVar.B().a();
        } else {
            if (aVarC != a.KW) {
                throw new sn.h("Unsupported JWE ECDH algorithm mode: " + aVarC);
            }
            strA = nVar.v().a();
        }
        return kVar.d(secretKey, iD, k.f(strA.getBytes(StandardCharsets.US_ASCII)), k.e(nVar.t()), k.e(nVar.u()), k.g(iD), k.h());
    }

    public static SecretKey b(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws sn.h {
        try {
            KeyAgreement keyAgreement = provider != null ? KeyAgreement.getInstance("ECDH", provider) : KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e15) {
                throw new sn.h("Invalid key for ECDH key agreement: " + e15.getMessage(), e15);
            }
        } catch (NoSuchAlgorithmException e16) {
            throw new sn.h("Couldn't get an ECDH key agreement instance: " + e16.getMessage(), e16);
        }
    }

    public static a c(sn.k kVar) throws sn.h {
        if (kVar.equals(sn.k.f182466n)) {
            return a.DIRECT;
        }
        if (kVar.equals(sn.k.f182467p) || kVar.equals(sn.k.f182468q) || kVar.equals(sn.k.f182469r)) {
            return a.KW;
        }
        throw new sn.h(f.d(kVar, o.f199298h));
    }

    public static int d(sn.k kVar, sn.f fVar) throws sn.h {
        if (kVar.equals(sn.k.f182466n)) {
            int iC = fVar.c();
            if (iC != 0) {
                return iC;
            }
            throw new sn.h("Unsupported JWE encryption method " + fVar);
        }
        if (kVar.equals(sn.k.f182467p)) {
            return 128;
        }
        if (kVar.equals(sn.k.f182468q)) {
            return 192;
        }
        if (kVar.equals(sn.k.f182469r)) {
            return 256;
        }
        throw new sn.h(f.d(kVar, o.f199298h));
    }
}
