package jp;

import io.sentry.android.core.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f104293l = {115, 65, 108, 84};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f104295b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f104297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SecureRandom f104298e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f104300g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private bp.i f104303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private bp.i f104304k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected short f104294a = 40;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f104296c = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<bp.b> f104299f = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f104301h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f104302i = null;

    private byte[] a(long j15, long j16) {
        byte[] bArr = this.f104295b;
        int length = bArr.length;
        int i15 = length + 5;
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length] = (byte) (j15 & 255);
        bArr2[length + 1] = (byte) ((j15 >> 8) & 255);
        bArr2[length + 2] = (byte) ((j15 >> 16) & 255);
        bArr2[length + 3] = (byte) (j16 & 255);
        bArr2[length + 4] = (byte) ((j16 >> 8) & 255);
        MessageDigest messageDigestA = d.a();
        messageDigestA.update(bArr2);
        if (this.f104300g) {
            messageDigestA.update(f104293l);
        }
        byte[] bArrDigest = messageDigestA.digest();
        int iMin = Math.min(i15, 16);
        byte[] bArr3 = new byte[iMin];
        System.arraycopy(bArrDigest, 0, bArr3, 0, iMin);
        return bArr3;
    }

    private Cipher c(byte[] bArr, byte[] bArr2, boolean z15) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(z15 ? 2 : 1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return cipher;
    }

    private void e(bp.a aVar, long j15, long j16) throws IOException {
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            d(aVar.g4(i15), j15, j16);
        }
    }

    private void f(bp.d dVar, long j15, long j16) {
        long j17;
        long j18;
        if (dVar.C4(bp.i.f20724e1) != null) {
            return;
        }
        bp.b bVarP4 = dVar.p4(bp.i.f20732e9);
        boolean z15 = bp.i.U7.equals(bVarP4) || bp.i.I2.equals(bVarP4) || ((dVar.p4(bp.i.N1) instanceof bp.p) && (dVar.p4(bp.i.P0) instanceof bp.a));
        for (Map.Entry<bp.i, bp.b> entry : dVar.entrySet()) {
            if (!z15 || !bp.i.N1.equals(entry.getKey())) {
                bp.b value = entry.getValue();
                if ((value instanceof bp.p) || (value instanceof bp.a) || (value instanceof bp.d)) {
                    j17 = j15;
                    j18 = j16;
                    d(value, j17, j18);
                } else {
                    j17 = j15;
                    j18 = j16;
                }
                j15 = j17;
                j16 = j18;
            }
        }
    }

    private void h(bp.p pVar, long j15, long j16) {
        if (bp.i.f20847q4.equals(this.f104304k)) {
            return;
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(pVar.i3());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            i(j15, j16, byteArrayInputStream, byteArrayOutputStream, true);
            pVar.g4(byteArrayOutputStream.toByteArray());
        } catch (IOException e15) {
            c2.e("PdfBox-Android", "Failed to decrypt COSString of length " + pVar.i3().length + " in object " + j15 + ": " + e15.getMessage());
        }
    }

    private void i(long j15, long j16, InputStream inputStream, OutputStream outputStream, boolean z15) throws IOException {
        if (this.f104300g && this.f104295b.length == 32) {
            j(inputStream, outputStream, z15);
        } else {
            byte[] bArrA = a(j15, j16);
            if (this.f104300g) {
                k(bArrA, inputStream, outputStream, z15);
            } else {
                l(bArrA, inputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    private void j(InputStream inputStream, OutputStream outputStream, boolean z15) throws IOException {
        byte[] bArr = new byte[16];
        if (w(z15, bArr, inputStream, outputStream)) {
            try {
                CipherInputStream cipherInputStream = new CipherInputStream(inputStream, c(this.f104295b, bArr, z15));
                try {
                    try {
                        dp.a.c(cipherInputStream, outputStream);
                        cipherInputStream.close();
                    } catch (IOException e15) {
                        if (!(e15.getCause() instanceof GeneralSecurityException)) {
                            throw e15;
                        }
                        cipherInputStream.close();
                    }
                } catch (Throwable th4) {
                    cipherInputStream.close();
                    throw th4;
                }
            } catch (GeneralSecurityException e16) {
                throw new IOException(e16);
            }
        }
    }

    private void k(byte[] bArr, InputStream inputStream, OutputStream outputStream, boolean z15) throws IOException {
        byte[] bArr2 = new byte[16];
        if (!w(z15, bArr2, inputStream, outputStream)) {
            return;
        }
        try {
            Cipher cipherC = c(bArr, bArr2, z15);
            byte[] bArr3 = new byte[256];
            while (true) {
                int i15 = inputStream.read(bArr3);
                if (i15 == -1) {
                    outputStream.write(cipherC.doFinal());
                    return;
                } else {
                    byte[] bArrUpdate = cipherC.update(bArr3, 0, i15);
                    if (bArrUpdate != null) {
                        outputStream.write(bArrUpdate);
                    }
                }
            }
        } catch (GeneralSecurityException e15) {
            throw new IOException(e15);
        }
    }

    private SecureRandom t() {
        SecureRandom secureRandom = this.f104298e;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    private boolean w(boolean z15, byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        if (!z15) {
            t().nextBytes(bArr);
            outputStream.write(bArr);
            return true;
        }
        int iD = (int) dp.a.d(inputStream, bArr);
        if (iD == 0) {
            return false;
        }
        if (iD == bArr.length) {
            return true;
        }
        throw new IOException("AES initialization vector not fully read: only " + iD + " bytes read instead of " + bArr.length);
    }

    public void A(a aVar) {
        this.f104302i = aVar;
    }

    protected void B(boolean z15) {
        this.f104297d = z15;
    }

    public void C(byte[] bArr) {
        this.f104295b = bArr;
    }

    public void D(int i15) {
        this.f104294a = (short) i15;
    }

    protected void E(g gVar) {
        this.f104301h = gVar;
    }

    protected void F(bp.i iVar) {
        this.f104303j = iVar;
    }

    protected void G(bp.i iVar) {
        this.f104304k = iVar;
    }

    protected int b() {
        short s15 = this.f104294a;
        if (s15 == 40) {
            return 1;
        }
        if (s15 == 128 && this.f104301h.b()) {
            return 4;
        }
        return this.f104294a == 256 ? 5 : 2;
    }

    public void d(bp.b bVar, long j15, long j16) throws IOException {
        if (bVar instanceof bp.p) {
            if (this.f104299f.contains(bVar)) {
                return;
            }
            this.f104299f.add(bVar);
            h((bp.p) bVar, j15, j16);
            return;
        }
        if (bVar instanceof bp.o) {
            if (this.f104299f.contains(bVar)) {
                return;
            }
            this.f104299f.add(bVar);
            g((bp.o) bVar, j15, j16);
            return;
        }
        if (bVar instanceof bp.d) {
            f((bp.d) bVar, j15, j16);
        } else if (bVar instanceof bp.a) {
            e((bp.a) bVar, j15, j16);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(bp.o r11, long r12, long r14) throws java.io.IOException {
        /*
            r10 = this;
            bp.i r0 = bp.i.f20847q4
            bp.i r1 = r10.f104303j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto L26
        Lb:
            bp.i r0 = bp.i.f20732e9
            bp.i r0 = r11.l4(r0)
            boolean r1 = r10.f104297d
            if (r1 != 0) goto L1e
            bp.i r1 = bp.i.D5
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e
            goto L26
        L1e:
            bp.i r1 = bp.i.O9
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L27
        L26:
            return
        L27:
            bp.i r1 = bp.i.D5
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "PdfBox-Android"
            if (r0 == 0) goto L58
            java.io.InputStream r0 = r11.p5()
            r2 = 10
            byte[] r2 = new byte[r2]
            dp.a.d(r0, r2)
            r0.close()
            java.lang.String r0 = "<?xpacket "
            java.nio.charset.Charset r3 = xp.a.f220415d
            byte[] r0 = r0.getBytes(r3)
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L58
            java.lang.String r11 = "Metadata is not encrypted, but was expected to be"
            io.sentry.android.core.c2.g(r1, r11)
            java.lang.String r11 = "Read PDF specification about EncryptMetadata (default value: true)"
            io.sentry.android.core.c2.g(r1, r11)
            return
        L58:
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r2.f(r3, r4, r6)
            java.io.InputStream r11 = r3.p5()
            byte[] r11 = dp.a.e(r11)
            r12 = r3
            r3 = r4
            r5 = r6
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r11)
            java.io.OutputStream r8 = r12.q5()
            r9 = 1
            r2 = r10
            r2.i(r3, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7f
            r8.close()
            return
        L7c:
            r0 = move-exception
            r11 = r0
            goto Lae
        L7f:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r12.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r13 = r11.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r13.getSimpleName()     // Catch: java.lang.Throwable -> L7c
            r12.append(r13)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = " thrown when decrypting object "
            r12.append(r13)     // Catch: java.lang.Throwable -> L7c
            r12.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = " "
            r12.append(r13)     // Catch: java.lang.Throwable -> L7c
            r12.append(r5)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = " obj"
            r12.append(r13)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L7c
            io.sentry.android.core.c2.e(r1, r12)     // Catch: java.lang.Throwable -> L7c
            throw r11     // Catch: java.lang.Throwable -> L7c
        Lae:
            r8.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.n.g(bp.o, long, long):void");
    }

    protected void l(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f104296c.b(bArr);
        this.f104296c.e(inputStream, outputStream);
    }

    protected void m(byte[] bArr, byte[] bArr2, OutputStream outputStream) throws IOException {
        this.f104296c.b(bArr);
        this.f104296c.g(bArr2, outputStream);
    }

    public void n(bp.o oVar, long j15, int i15) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dp.a.e(oVar.p5()));
        OutputStream outputStreamQ5 = oVar.q5();
        try {
            i(j15, i15, byteArrayInputStream, outputStreamQ5, false);
        } finally {
            outputStreamQ5.close();
        }
    }

    public void o(bp.p pVar, long j15, int i15) throws IOException {
        InputStream byteArrayInputStream = new ByteArrayInputStream(pVar.i3());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i(j15, i15, byteArrayInputStream, byteArrayOutputStream, false);
        pVar.g4(byteArrayOutputStream.toByteArray());
    }

    public a p() {
        return this.f104302i;
    }

    public byte[] q() {
        return this.f104295b;
    }

    public int r() {
        return this.f104294a;
    }

    protected g s() {
        return this.f104301h;
    }

    public boolean u() {
        return this.f104301h != null;
    }

    public boolean v() {
        return this.f104297d;
    }

    public abstract void x(gp.c cVar);

    public abstract void y(f fVar, bp.a aVar, b bVar);

    public void z(boolean z15) {
        this.f104300g = z15;
    }
}
