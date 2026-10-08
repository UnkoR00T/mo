package AUX;

import java.security.MessageDigest;
import oq.y;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MultiBlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.ISO9797Alg3Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p014aUx.x0;
import p028con.c3;
import p028con.d3;
import p028con.j3;
import pq.n;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jc.a f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X9ECParameters f1b;

    public a() {
        v0.l(y.a(j3.SHA256, x0.f5133a), y.a(j3.SHA384, x0.f5134b));
    }

    public static MessageDigest a(d3 d3Var) {
        if (d3Var == d3.f37100b) {
            j3 j3Var = j3.SHA1;
            return MessageDigest.getInstance("SHA-1");
        }
        j3 j3Var2 = j3.SHA1;
        return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, d3 d3Var) {
        byte[] bArrH = n.H(n.H(n.H(new byte[]{6, (byte) bArr.length}, bArr), new byte[]{-122, (byte) bArr2.length}), bArr2);
        byte[] bArrH2 = n.H(new byte[]{127, 73, (byte) bArrH.length}, bArrH);
        KeyParameter keyParameter = new KeyParameter(bArr3);
        Mac iSO9797Alg3Mac = d3Var == d3.f37100b ? new ISO9797Alg3Mac(new DESEngine(), 64, new ISO7816d4Padding()) : new CMac(AESEngine.newInstance(), 64);
        iSO9797Alg3Mac.init(keyParameter);
        iSO9797Alg3Mac.update(bArrH2, 0, bArrH2.length);
        byte[] bArr4 = new byte[iSO9797Alg3Mac.getMacSize()];
        iSO9797Alg3Mac.doFinal(bArr4, 0);
        return bArr4;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, d3 d3Var) {
        byte[] bArr4;
        KeyParameter keyParameter = new KeyParameter(bArr2);
        c3 c3Var = d3.f37100b;
        if (d3Var == c3Var) {
            bArr4 = new byte[8];
        } else {
            byte[] bArr5 = new byte[d3Var.b()];
            MultiBlockCipher multiBlockCipherNewInstance = AESEngine.newInstance();
            multiBlockCipherNewInstance.init(true, new KeyParameter(bArr2));
            multiBlockCipherNewInstance.processBlock(bArr3, 0, bArr5, 0);
            bArr4 = bArr5;
        }
        ParametersWithIV parametersWithIV = new ParametersWithIV(keyParameter, bArr4);
        PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(CBCBlockCipher.newInstance(d3Var == c3Var ? new DESedeEngine() : AESEngine.newInstance()), new ISO7816d4Padding());
        byte[] bArr6 = new byte[paddedBufferedBlockCipher.getOutputSize(bArr.length)];
        paddedBufferedBlockCipher.init(false, parametersWithIV);
        int iProcessBytes = paddedBufferedBlockCipher.processBytes(bArr, 0, bArr.length, bArr6, 0);
        return v.a1(n.c1(bArr6, paddedBufferedBlockCipher.doFinal(bArr6, iProcessBytes) + iProcessBytes));
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, d3 d3Var) {
        byte[] bArr4;
        KeyParameter keyParameter = new KeyParameter(bArr2);
        c3 c3Var = d3.f37100b;
        if (d3Var == c3Var) {
            bArr4 = new byte[8];
        } else {
            byte[] bArr5 = new byte[d3Var.b()];
            MultiBlockCipher multiBlockCipherNewInstance = AESEngine.newInstance();
            multiBlockCipherNewInstance.init(true, new KeyParameter(bArr2));
            multiBlockCipherNewInstance.processBlock(bArr3, 0, bArr5, 0);
            bArr4 = bArr5;
        }
        ParametersWithIV parametersWithIV = new ParametersWithIV(keyParameter, bArr4);
        PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(CBCBlockCipher.newInstance(d3Var == c3Var ? new DESedeEngine() : AESEngine.newInstance()), new ISO7816d4Padding());
        int outputSize = paddedBufferedBlockCipher.getOutputSize(bArr.length);
        if (bArr.length % paddedBufferedBlockCipher.getBlockSize() == 0) {
            outputSize += paddedBufferedBlockCipher.getBlockSize();
        }
        byte[] bArrH = new byte[outputSize];
        paddedBufferedBlockCipher.init(true, parametersWithIV);
        int iProcessBytes = paddedBufferedBlockCipher.processBytes(bArr, 0, bArr.length, bArrH, 0);
        if (iProcessBytes > 0 && outputSize - iProcessBytes <= paddedBufferedBlockCipher.getBlockSize()) {
            bArrH = n.H(bArrH, new byte[paddedBufferedBlockCipher.getBlockSize()]);
        }
        return v.a1(n.c1(bArrH, paddedBufferedBlockCipher.doFinal(bArrH, iProcessBytes) + iProcessBytes));
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, d3 d3Var) {
        byte[] bArrH = (byte[]) bArr.clone();
        c3 c3Var = d3.f37100b;
        Mac iSO9797Alg3Mac = d3Var == c3Var ? new ISO9797Alg3Mac(new DESEngine(), 64, new ISO7816d4Padding()) : new CMac(AESEngine.newInstance(), 64);
        byte[] bArr4 = new byte[iSO9797Alg3Mac.getMacSize()];
        if (bArr.length % d3Var.b() != 0 && d3Var != c3Var) {
            int iB = d3Var.b();
            byte[] bArr5 = new byte[iB - (bArr.length % iB)];
            bArr5[0] = -128;
            bArrH = n.H(bArr, bArr5);
        }
        iSO9797Alg3Mac.init(new KeyParameter(bArr2));
        iSO9797Alg3Mac.update(bArrH, 0, bArrH.length);
        iSO9797Alg3Mac.doFinal(bArr4, 0);
        return bArr4;
    }
}
