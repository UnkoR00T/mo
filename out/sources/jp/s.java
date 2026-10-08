package jp;

import io.sentry.android.core.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Class<?> f104313m = r.class;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f104314n = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, -128, 47, 12, -87, -2, 100, 83, 105, 122};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f104315o = {XMSSKeyParameters.SHA_256, "SHA-384", XMSSKeyParameters.SHA_512};

    public s() {
    }

    private byte[] I(byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, boolean z15, int i16, int i17) {
        byte[] bArrE0 = e0(bArr);
        MessageDigest messageDigestA = d.a();
        messageDigestA.update(bArrE0);
        messageDigestA.update(bArr2);
        messageDigestA.update((byte) i15);
        messageDigestA.update((byte) (i15 >>> 8));
        messageDigestA.update((byte) (i15 >>> 16));
        messageDigestA.update((byte) (i15 >>> 24));
        messageDigestA.update(bArr3);
        if (i17 == 4 && !z15) {
            messageDigestA.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] bArrDigest = messageDigestA.digest();
        if (i17 == 3 || i17 == 4) {
            for (int i18 = 0; i18 < 50; i18++) {
                messageDigestA.update(bArrDigest, 0, i16);
                bArrDigest = messageDigestA.digest();
            }
        }
        byte[] bArr4 = new byte[i16];
        System.arraycopy(bArrDigest, 0, bArr4, 0, i16);
        return bArr4;
    }

    private byte[] J(byte[] bArr, boolean z15, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15) throws IOException {
        byte[] bArrP;
        if (z15) {
            if (bArr4 == null) {
                throw new IOException("/Encrypt/OE entry is missing");
            }
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArr2, 40, bArr6, 0, 8);
            bArrP = i15 == 5 ? P(bArr, bArr6, bArr3) : K(bArr, bArr6, bArr3);
        } else {
            if (bArr5 == null) {
                throw new IOException("/Encrypt/UE entry is missing");
            }
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr3, 40, bArr7, 0, 8);
            bArrP = i15 == 5 ? P(bArr, bArr7, null) : K(bArr, bArr7, null);
            bArr4 = bArr5;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(bArrP, "AES"), new IvParameterSpec(new byte[16]));
            return cipher.doFinal(bArr4);
        } catch (GeneralSecurityException e15) {
            Z();
            throw new IOException(e15);
        }
    }

    private byte[] K(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else {
            if (bArr3.length < 48) {
                throw new IOException("Bad U length");
            }
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        }
        byte[] bArrD0 = d0(bArr);
        return L(S(bArrD0, bArr2, bArr3), bArrD0, bArr3);
    }

    private static byte[] L(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        try {
            byte[] bArrDigest = d.c().digest(bArr);
            byte[] bArr4 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= 64 && (bArr4[bArr4.length - 1] & 255) <= i15 - 32) {
                    break;
                }
                byte[] bArr5 = (bArr3 == null || bArr3.length < 48) ? new byte[(bArr2.length + bArrDigest.length) * 64] : new byte[(bArr2.length + bArrDigest.length + 48) * 64];
                int length = 0;
                for (int i16 = 0; i16 < 64; i16++) {
                    System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
                    int length2 = length + bArr2.length;
                    System.arraycopy(bArrDigest, 0, bArr5, length2, bArrDigest.length);
                    length = length2 + bArrDigest.length;
                    if (bArr3 != null && bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr5, length, 48);
                        length += 48;
                    }
                }
                byte[] bArr6 = new byte[16];
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr6, 0, 16);
                System.arraycopy(bArrDigest, 16, bArr7, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr6, "AES"), new IvParameterSpec(bArr7));
                byte[] bArrDoFinal = cipher.doFinal(bArr5);
                byte[] bArr8 = new byte[16];
                System.arraycopy(bArrDoFinal, 0, bArr8, 0, 16);
                i15++;
                bArr4 = bArrDoFinal;
                bArrDigest = MessageDigest.getInstance(f104315o[new BigInteger(1, bArr8).mod(new BigInteger("3")).intValue()]).digest(bArrDoFinal);
            }
            if (bArrDigest.length <= 32) {
                return bArrDigest;
            }
            byte[] bArr9 = new byte[32];
            System.arraycopy(bArrDigest, 0, bArr9, 0, 32);
            return bArr9;
        } catch (GeneralSecurityException e15) {
            Z();
            throw new IOException(e15);
        }
    }

    private byte[] N(byte[] bArr, int i15, int i16) {
        MessageDigest messageDigestA = d.a();
        byte[] bArrDigest = messageDigestA.digest(e0(bArr));
        if (i15 == 3 || i15 == 4) {
            for (int i17 = 0; i17 < 50; i17++) {
                messageDigestA.update(bArrDigest, 0, i16);
                bArrDigest = messageDigestA.digest();
            }
        }
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArrDigest, 0, bArr2, 0, i16);
        return bArr2;
    }

    private int O(int i15) {
        a aVarD = ((r) s()).d();
        if (i15 < 2 && !aVarD.h()) {
            return 2;
        }
        if (i15 == 5) {
            return 6;
        }
        if (i15 == 4) {
            return 4;
        }
        return (i15 == 2 || i15 == 3 || aVarD.h()) ? 3 : 4;
    }

    private static byte[] P(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest messageDigestC = d.c();
        messageDigestC.update(bArr);
        messageDigestC.update(bArr2);
        return bArr3 == null ? messageDigestC.digest() : messageDigestC.digest(bArr3);
    }

    private static byte[] R(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static byte[] S(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    private byte[] T(bp.a aVar) {
        return (aVar == null || aVar.size() < 1) ? new byte[0] : ((bp.p) aVar.k4(0)).i3();
    }

    private boolean X(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, byte[] bArr4, int i16, int i17, boolean z15) throws IOException {
        byte[] bArrQ = Q(bArr, bArr3, i15, bArr4, i16, i17, z15);
        return i16 == 2 ? Arrays.equals(bArr2, bArrQ) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(bArrQ, 16));
    }

    private boolean Y(byte[] bArr, byte[] bArr2, int i15) {
        byte[] bArrD0 = d0(bArr);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 8);
        return Arrays.equals(i15 == 5 ? P(bArrD0, bArr4, null) : K(bArrD0, bArr4, null), bArr3);
    }

    private static void Z() {
        try {
            if (Cipher.getMaxAllowedKeyLength("AES") != Integer.MAX_VALUE) {
                c2.g("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private void a0(f fVar, bp.i iVar) {
        e eVar = new e();
        eVar.e(iVar);
        eVar.f(r());
        fVar.D(eVar);
        bp.i iVar2 = bp.i.f20791k8;
        fVar.E(iVar2);
        fVar.F(iVar2);
        z(true);
    }

    private void b0(String str, String str2, f fVar, int i15, gp.c cVar, int i16, int i17) throws IOException {
        bp.a aVarN3 = cVar.H().N3();
        if (aVarN3 == null || aVarN3.size() < 2) {
            MessageDigest messageDigestA = d.a();
            messageDigestA.update(BigInteger.valueOf(System.currentTimeMillis()).toByteArray());
            Charset charset = xp.a.f220415d;
            messageDigestA.update(str.getBytes(charset));
            messageDigestA.update(str2.getBytes(charset));
            messageDigestA.update(cVar.H().toString().getBytes(charset));
            bp.p pVar = new bp.p(messageDigestA.digest(toString().getBytes(charset)));
            aVarN3 = new bp.a();
            aVarN3.A3(pVar);
            aVarN3.A3(pVar);
            cVar.H().q4(aVarN3);
        }
        bp.p pVar2 = (bp.p) aVarN3.k4(0);
        Charset charset2 = xp.a.f220415d;
        byte[] bArrM = M(str.getBytes(charset2), str2.getBytes(charset2), i16, i17);
        byte[] bArrQ = Q(str2.getBytes(charset2), bArrM, i15, pVar2.i3(), i16, i17, true);
        C(H(str2.getBytes(charset2), bArrM, null, null, null, i15, pVar2.i3(), i16, i17, true, false));
        fVar.y(bArrM);
        fVar.I(bArrQ);
        if (i16 == 4) {
            a0(fVar, bp.i.f20853r);
        }
    }

    private void c0(String str, String str2, f fVar, int i15) throws IOException {
        try {
            SecureRandom secureRandom = new SecureRandom();
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            C(new byte[32]);
            secureRandom.nextBytes(q());
            Charset charset = xp.a.f220417f;
            byte[] bArrD0 = d0(str2.getBytes(charset));
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[8];
            secureRandom.nextBytes(bArr);
            secureRandom.nextBytes(bArr2);
            byte[] bArrS = S(L(R(bArrD0, bArr), bArrD0, null), bArr, bArr2);
            cipher.init(1, new SecretKeySpec(L(R(bArrD0, bArr2), bArrD0, null), "AES"), new IvParameterSpec(new byte[16]));
            byte[] bArrDoFinal = cipher.doFinal(q());
            byte[] bArrD1 = d0(str.getBytes(charset));
            byte[] bArr3 = new byte[8];
            byte[] bArr4 = new byte[8];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr4);
            byte[] bArrS2 = S(L(S(bArrD1, bArr3, bArrS), bArrD1, bArrS), bArr3, bArr4);
            cipher.init(1, new SecretKeySpec(L(S(bArrD1, bArr4, bArrS), bArrD1, bArrS), "AES"), new IvParameterSpec(new byte[16]));
            byte[] bArrDoFinal2 = cipher.doFinal(q());
            fVar.I(bArrS);
            fVar.H(bArrDoFinal);
            fVar.y(bArrS2);
            fVar.x(bArrDoFinal2);
            a0(fVar, bp.i.f20864s);
            byte[] bArr5 = new byte[16];
            bArr5[0] = (byte) i15;
            bArr5[1] = (byte) (i15 >>> 8);
            bArr5[2] = (byte) (i15 >>> 16);
            bArr5[3] = (byte) (i15 >>> 24);
            bArr5[4] = -1;
            bArr5[5] = -1;
            bArr5[6] = -1;
            bArr5[7] = -1;
            bArr5[8] = 84;
            bArr5[9] = 97;
            bArr5[10] = 100;
            bArr5[11] = 98;
            for (int i16 = 12; i16 <= 15; i16++) {
                bArr5[i16] = (byte) secureRandom.nextInt();
            }
            cipher.init(1, new SecretKeySpec(q(), "AES"), new IvParameterSpec(new byte[16]));
            fVar.A(cipher.doFinal(bArr5));
        } catch (GeneralSecurityException e15) {
            Z();
            throw new IOException(e15);
        }
    }

    private static byte[] d0(byte[] bArr) {
        if (bArr.length <= 127) {
            return bArr;
        }
        byte[] bArr2 = new byte[CertificateBody.profileType];
        System.arraycopy(bArr, 0, bArr2, 0, CertificateBody.profileType);
        return bArr2;
    }

    private byte[] e0(byte[] bArr) {
        byte[] bArr2 = f104314n;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        int iMin = Math.min(bArr.length, length);
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        System.arraycopy(bArr2, 0, bArr3, iMin, bArr2.length - iMin);
        return bArr3;
    }

    private void f0(f fVar, int i15, boolean z15) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(q(), "AES"));
            byte[] bArrDoFinal = cipher.doFinal(fVar.i());
            if (bArrDoFinal[9] != 97 || bArrDoFinal[10] != 100 || bArrDoFinal[11] != 98) {
                c2.g("PdfBox-Android", "Verification of permissions failed (constant)");
            }
            int i16 = (bArrDoFinal[0] & 255) | ((bArrDoFinal[1] & 255) << 8) | ((bArrDoFinal[2] & 255) << 16) | ((bArrDoFinal[3] & 255) << 24);
            if (i16 != i15) {
                c2.g("PdfBox-Android", "Verification of permissions failed (" + String.format("%08X", Integer.valueOf(i16)) + " != " + String.format("%08X", Integer.valueOf(i15)) + ")");
            }
            if ((!z15 || bArrDoFinal[8] == 84) && (z15 || bArrDoFinal[8] == 70)) {
                return;
            }
            c2.g("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
        } catch (GeneralSecurityException e15) {
            Z();
            throw new IOException(e15);
        }
    }

    public byte[] H(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15, byte[] bArr6, int i16, int i17, boolean z15, boolean z16) {
        int i18 = i16;
        if (i18 == 6) {
            i18 = i16;
        } else if (i18 != 5) {
            return I(bArr, bArr2, i15, bArr6, z15, i17, i18);
        }
        return J(bArr, z16, bArr2, bArr3, bArr4, bArr5, i18);
    }

    public byte[] M(byte[] bArr, byte[] bArr2, int i15, int i16) throws IOException {
        if (i15 == 2 && i16 != 5) {
            throw new IOException("Expected length=5 actual=" + i16);
        }
        byte[] bArrN = N(bArr, i15, i16);
        byte[] bArrE0 = e0(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l(bArrN, new ByteArrayInputStream(bArrE0), byteArrayOutputStream);
        if (i15 == 3 || i15 == 4) {
            int length = bArrN.length;
            byte[] bArr3 = new byte[length];
            for (int i17 = 1; i17 < 20; i17++) {
                System.arraycopy(bArrN, 0, bArr3, 0, bArrN.length);
                for (int i18 = 0; i18 < length; i18++) {
                    bArr3[i18] = (byte) (bArr3[i18] ^ ((byte) i17));
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                l(bArr3, byteArrayInputStream, byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] Q(byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, int i16, int i17, boolean z15) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrH = H(bArr, bArr2, null, null, null, i15, bArr3, i16, i17, z15, true);
        if (i16 == 2) {
            m(bArrH, f104314n, byteArrayOutputStream);
        } else if (i16 == 3 || i16 == 4) {
            MessageDigest messageDigestA = d.a();
            messageDigestA.update(f104314n);
            messageDigestA.update(bArr3);
            byteArrayOutputStream.write(messageDigestA.digest());
            int length = bArrH.length;
            byte[] bArr4 = new byte[length];
            for (int i18 = 0; i18 < 20; i18++) {
                System.arraycopy(bArrH, 0, bArr4, 0, length);
                for (int i19 = 0; i19 < length; i19++) {
                    bArr4[i19] = (byte) (bArr4[i19] ^ i18);
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                l(bArr4, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr5 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr5, 0, 16);
            System.arraycopy(f104314n, 0, bArr5, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr5);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] U(byte[] bArr, byte[] bArr2, int i15, int i16) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrN = N(bArr, i15, i16);
        if (i15 == 2) {
            m(bArrN, bArr2, byteArrayOutputStream);
        } else if (i15 == 3 || i15 == 4) {
            int length = bArrN.length;
            byte[] bArr3 = new byte[length];
            byte[] byteArray = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, byteArray, 0, bArr2.length);
            for (int i17 = 19; i17 >= 0; i17--) {
                System.arraycopy(bArrN, 0, bArr3, 0, bArrN.length);
                for (int i18 = 0; i18 < length; i18++) {
                    bArr3[i18] = (byte) (bArr3[i18] ^ ((byte) i17));
                }
                byteArrayOutputStream.reset();
                m(bArr3, byteArray, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean V(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, byte[] bArr4, int i16, int i17, boolean z15) throws IOException {
        if (i16 != 6 && i16 != 5) {
            return W(U(bArr, bArr3, i16, i17), bArr2, bArr3, i15, bArr4, i16, i17, z15);
        }
        byte[] bArrD0 = d0(bArr);
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[8];
        if (bArr3.length < 40) {
            throw new IOException("Owner password is too short");
        }
        System.arraycopy(bArr3, 0, bArr5, 0, 32);
        System.arraycopy(bArr3, 32, bArr6, 0, 8);
        return Arrays.equals(i16 == 5 ? P(bArrD0, bArr6, bArr2) : K(bArrD0, bArr6, bArr2), bArr5);
    }

    public boolean W(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, byte[] bArr4, int i16, int i17, boolean z15) throws IOException {
        if (i16 == 2 || i16 == 3 || i16 == 4) {
            return X(bArr, bArr2, bArr3, i15, bArr4, i16, i17, z15);
        }
        if (i16 == 5 || i16 == 6) {
            return Y(bArr, bArr2, i16);
        }
        throw new IOException("Unknown Encryption Revision " + i16);
    }

    @Override // jp.n
    public void x(gp.c cVar) throws IOException {
        gp.c cVar2;
        f fVarK = cVar.K();
        if (fVarK == null) {
            fVarK = new f();
        }
        f fVar = fVarK;
        int iB = b();
        int iO = O(iB);
        fVar.v("Standard");
        fVar.J(iB);
        if (iB != 4 && iB != 5) {
            fVar.s();
        }
        fVar.C(iO);
        fVar.w(r());
        r rVar = (r) s();
        String strC = rVar.c();
        String strE = rVar.e();
        if (strC == null) {
            strC = "";
        }
        String str = strE != null ? strE : "";
        String str2 = strC.isEmpty() ? str : strC;
        int iF = rVar.d().f();
        fVar.z(iF);
        int iR = r() / 8;
        if (iO == 6) {
            c0(m.m(str2), m.m(str), fVar, iF);
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            b0(str2, str, fVar, iF, cVar2, iO, iR);
        }
        cVar2.d1(fVar);
        cVar2.H().r4(fVar.D1());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[PHI: r2
      0x00e0: PHI (r2v24 int) = (r2v7 int), (r2v8 int), (r2v13 int), (r2v7 int) binds: [B:19:0x0056, B:29:0x00a8, B:34:0x00c3, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // jp.n
    public void y(f fVar, bp.a aVar, b bVar) throws IOException {
        e eVarL;
        int i15;
        byte[] bArrO;
        byte[] bArrF;
        int i16;
        int i17;
        boolean z15;
        if (!(bVar instanceof q)) {
            throw new IOException("Decryption material is not compatible with the document");
        }
        if (fVar.q() >= 4) {
            F(fVar.m());
            G(fVar.n());
        }
        B(fVar.r());
        String strA = ((q) bVar).a();
        if (strA == null) {
            strA = "";
        }
        int iH = fVar.h();
        int iJ = fVar.j();
        int iE = fVar.q() == 1 ? 5 : fVar.e() / 8;
        if ((fVar.q() == 4 || fVar.q() == 5) && (eVarL = fVar.l()) != null) {
            bp.i iVarB = eVarL.b();
            if (bp.i.f20853r.equals(iVarB)) {
                z(true);
                if (!fVar.D1().J3(bp.i.f20699b5) || (iE = fVar.e() / 8) >= 16) {
                    iE = 16;
                } else {
                    c2.g("PdfBox-Android", "Using " + iE + " bytes key length instead of 16 in AESV2 encryption?!");
                }
            }
            if (bp.i.f20864s.equals(iVarB)) {
                z(true);
                if (!fVar.D1().J3(bp.i.f20699b5) || (iE = fVar.e() / 8) >= 32) {
                    i15 = 32;
                } else {
                    c2.g("PdfBox-Android", "Using " + iE + " bytes key length instead of 32 in AESV3 encryption?!");
                    i15 = iE;
                }
            } else {
                i15 = iE;
            }
        } else {
            i15 = iE;
        }
        byte[] bArrT = T(aVar);
        boolean zR = fVar.r();
        byte[] bArrP = fVar.p();
        byte[] bArrG = fVar.g();
        Charset charset = xp.a.f220415d;
        if (iJ == 6 || iJ == 5) {
            charset = xp.a.f220417f;
            bArrO = fVar.o();
            bArrF = fVar.f();
        } else {
            bArrF = null;
            bArrO = null;
        }
        if (iJ == 6) {
            strA = m.l(strA);
        }
        String str = strA;
        if (V(str.getBytes(charset), bArrP, bArrG, iH, bArrT, iJ, i15, zR)) {
            A(a.e());
            byte[] bArrH = H((iJ == 6 || iJ == 5) ? str.getBytes(charset) : U(str.getBytes(charset), bArrG, iJ, i15), bArrG, bArrP, bArrF, bArrO, iH, bArrT, iJ, i15, zR, true);
            i16 = iH;
            i17 = iJ;
            z15 = zR;
            C(bArrH);
        } else {
            if (!W(str.getBytes(charset), bArrP, bArrG, iH, bArrT, iJ, i15, zR)) {
                throw new c("Cannot decrypt PDF, the password is incorrect");
            }
            a aVar2 = new a(iH);
            aVar2.s();
            A(aVar2);
            C(H(str.getBytes(charset), bArrG, bArrP, bArrF, bArrO, iH, bArrT, iJ, i15, zR, false));
        }
        if (i17 == 6 || i17 == 5) {
            i16 = iH;
            i17 = iJ;
            z15 = zR;
            f0(fVar, i16, z15);
        }
    }

    public s(r rVar) {
        E(rVar);
        D(rVar.a());
    }
}
