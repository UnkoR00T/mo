package jp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
final class d {
    static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e15) {
            throw new RuntimeException(e15);
        }
    }

    static MessageDigest b() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e15) {
            throw new RuntimeException(e15);
        }
    }

    static MessageDigest c() {
        try {
            return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        } catch (NoSuchAlgorithmException e15) {
            throw new RuntimeException(e15);
        }
    }
}
