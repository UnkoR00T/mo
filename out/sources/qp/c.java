package qp;

import android.graphics.Bitmap;
import android.graphics.Color;
import bp.h;
import bp.i;
import cp.l;
import cp.m;
import io.sentry.android.core.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import op.e;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f167823a = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f167824a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f167824a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f167824a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gp.c f167825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f167826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f167827c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f167828d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f167829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f167830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f167831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f167832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f167833i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final byte[] f167834j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f167835k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final Bitmap.Config f167836l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final boolean f167837m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final byte[] f167838n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final byte[] f167839o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final byte[] f167840p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final byte[] f167841q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final byte[] f167842r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final byte[] f167843s;

        b(gp.c cVar, Bitmap bitmap) {
            this.f167825a = cVar;
            this.f167826b = bitmap;
            int height = bitmap.getHeight();
            this.f167829e = height;
            int width = bitmap.getWidth();
            this.f167830f = width;
            this.f167836l = bitmap.getConfig();
            boolean zHasAlpha = bitmap.hasAlpha();
            this.f167837m = zHasAlpha;
            this.f167838n = zHasAlpha ? new byte[height * width] : null;
            int i15 = (width * 3) + 1;
            byte[] bArr = new byte[i15];
            this.f167831g = bArr;
            byte[] bArr2 = new byte[i15];
            this.f167832h = bArr2;
            byte[] bArr3 = new byte[i15];
            this.f167833i = bArr3;
            byte[] bArr4 = new byte[i15];
            this.f167834j = bArr4;
            byte[] bArr5 = new byte[i15];
            this.f167835k = bArr5;
            bArr[0] = 0;
            bArr2[0] = 1;
            bArr3[0] = 2;
            bArr4[0] = 3;
            bArr5[0] = 4;
            this.f167839o = new byte[3];
            this.f167840p = new byte[3];
            this.f167841q = new byte[3];
            this.f167842r = new byte[3];
            this.f167843s = new byte[3];
        }

        private byte[] a() {
            byte[] bArr = this.f167831g;
            long jD = d(bArr);
            long jD2 = d(this.f167832h);
            long jD3 = d(this.f167833i);
            long jD4 = d(this.f167834j);
            long jD5 = d(this.f167835k);
            if (jD > jD2) {
                bArr = this.f167832h;
                jD = jD2;
            }
            if (jD > jD3) {
                bArr = this.f167833i;
            } else {
                jD3 = jD;
            }
            if (jD3 > jD4) {
                bArr = this.f167834j;
            } else {
                jD4 = jD3;
            }
            return jD4 > jD5 ? this.f167835k : bArr;
        }

        private void b(int[] iArr, int i15, byte[] bArr, byte[] bArr2, int i16) {
            int i17 = iArr[i15];
            byte bBlue = (byte) Color.blue(i17);
            byte bGreen = (byte) Color.green(i17);
            byte bRed = (byte) Color.red(i17);
            int i18 = a.f167824a[this.f167836l.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    return;
                }
                bArr[0] = bRed;
                bArr[1] = bGreen;
                bArr[2] = bBlue;
                return;
            }
            bArr[0] = bRed;
            bArr[1] = bGreen;
            bArr[2] = bBlue;
            if (bArr2 != null) {
                bArr2[i16] = (byte) Color.alpha(i17);
            }
        }

        private static long d(byte[] bArr) {
            long jAbs = 0;
            for (byte b15 : bArr) {
                jAbs += (long) Math.abs((int) b15);
            }
            return jAbs;
        }

        private static byte e(int i15, int i16, int i17) {
            return (byte) (i15 - ((i17 + i16) / 2));
        }

        private static byte f(int i15, int i16, int i17, int i18) {
            int i19 = (i16 + i17) - i18;
            int iAbs = Math.abs(i19 - i16);
            int iAbs2 = Math.abs(i19 - i17);
            int iAbs3 = Math.abs(i19 - i18);
            if (iAbs > iAbs2 || iAbs > iAbs3) {
                i16 = iAbs2 <= iAbs3 ? i17 : i18;
            }
            return (byte) (i15 - i16);
        }

        private static byte g(int i15, int i16) {
            return (byte) ((i15 & GF2Field.MASK) - (i16 & GF2Field.MASK));
        }

        private static byte h(int i15, int i16) {
            return g(i15, i16);
        }

        private d i(ByteArrayOutputStream byteArrayOutputStream, int i15) {
            int height = this.f167826b.getHeight();
            int width = this.f167826b.getWidth();
            d dVar = new d(this.f167825a, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), i.E3, width, height, i15, e.f148062c);
            bp.d dVar2 = new bp.d();
            dVar2.Y4(i.C0, h.g4(i15));
            dVar2.Y4(i.W6, h.g4(15L));
            dVar2.Y4(i.J1, h.g4(width));
            dVar2.Y4(i.H1, h.g4(3L));
            dVar.D1().Y4(i.f20715d2, dVar2);
            if (this.f167837m) {
                dVar.D1().Z4(i.Z7, c.e(this.f167825a, this.f167838n, this.f167826b.getWidth(), this.f167826b.getHeight(), this.f167827c * 8, op.d.f148060c));
            }
            return dVar;
        }

        d c() throws IOException {
            int i15 = a.f167824a[this.f167836l.ordinal()];
            int i16 = 1;
            if (i15 != 1 && i15 != 2) {
                return null;
            }
            int i17 = this.f167830f;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.f167829e * this.f167830f) * this.f167828d) / 2);
            Deflater deflater = new Deflater(l.e());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            byte b15 = 0;
            int[] iArr = new int[i17];
            int[] iArr2 = new int[i17];
            int i18 = 0;
            int i19 = 0;
            while (i18 < this.f167829e) {
                Bitmap bitmap = this.f167826b;
                int i25 = this.f167830f;
                int i26 = i18;
                bitmap.getPixels(iArr2, 0, i25, 0, i26, i25, 1);
                Arrays.fill(this.f167839o, b15);
                Arrays.fill(this.f167840p, b15);
                int i27 = i19;
                int i28 = i16;
                int i29 = b15;
                while (i29 < i17) {
                    b(iArr2, i29, this.f167842r, this.f167838n, i27);
                    int[] iArr3 = iArr2;
                    int i35 = i27;
                    int[] iArr4 = iArr;
                    b(iArr4, i29, this.f167841q, null, 0);
                    int length = this.f167842r.length;
                    int i36 = b15;
                    while (i36 < length) {
                        int i37 = this.f167842r[i36] & 255;
                        int i38 = this.f167839o[i36] & 255;
                        int i39 = this.f167841q[i36] & 255;
                        int i45 = this.f167840p[i36] & 255;
                        this.f167831g[i28] = (byte) i37;
                        this.f167832h[i28] = g(i37, i38);
                        this.f167833i[i28] = h(i37, i39);
                        this.f167834j[i28] = e(i37, i38, i39);
                        this.f167835k[i28] = f(i37, i38, i39, i45);
                        i28++;
                        i36++;
                        iArr4 = iArr4;
                    }
                    System.arraycopy(this.f167842r, 0, this.f167839o, 0, this.f167828d);
                    System.arraycopy(this.f167841q, 0, this.f167840p, 0, this.f167828d);
                    i29++;
                    b15 = 0;
                    iArr = iArr4;
                    i27 = this.f167827c + i35;
                    iArr2 = iArr3;
                }
                int[] iArr5 = iArr2;
                int[] iArr6 = iArr;
                byte[] bArrA = a();
                deflaterOutputStream.write(bArrA, b15, bArrA.length);
                i18 = i26 + 1;
                iArr = iArr5;
                i19 = i27;
                iArr2 = iArr6;
                i16 = 1;
            }
            deflaterOutputStream.close();
            deflater.end();
            return i(byteArrayOutputStream, this.f167827c * 8);
        }
    }

    private static d a(Bitmap bitmap, gp.c cVar) throws IOException {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        int i15 = width * 8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i15 / 8) + (i15 % 8 != 0 ? 1 : 0)) * height);
        xo.d dVar = new xo.d(byteArrayOutputStream);
        for (int i16 = 0; i16 < height; i16++) {
            bitmap.getPixels(iArr, 0, width, 0, i16, width, 1);
            for (int i17 = 0; i17 < width; i17++) {
                dVar.m(iArr[i17] & GF2Field.MASK, 8);
            }
            int iC = dVar.c();
            if (iC != 0) {
                dVar.m(0L, 8 - iC);
            }
        }
        dVar.flush();
        dVar.close();
        return e(cVar, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, op.d.f148060c);
    }

    public static d b(gp.c cVar, Bitmap bitmap) throws IOException {
        d dVarC;
        if (d(bitmap)) {
            return a(bitmap, cVar);
        }
        if (!f167823a || (dVarC = new b(cVar, bitmap).c()) == null) {
            return c(bitmap, cVar);
        }
        if (dVarC.h() == e.f148062c && dVarC.g() < 16 && bitmap.getWidth() * bitmap.getHeight() <= 2500) {
            d dVarC2 = c(bitmap, cVar);
            if (dVarC2.D1().u5() < dVarC.D1().u5()) {
                c2.e("PdfBox-Android", "Return classic");
                dVarC.D1().close();
                return dVarC2;
            }
            c2.e("PdfBox-Android", "Return predictor");
            dVarC2.D1().close();
        }
        return dVarC;
    }

    private static d c(Bitmap bitmap, gp.c cVar) {
        byte[] bArr;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        e eVar = e.f148062c;
        byte[] bArr2 = new byte[width * height * 3];
        if (bitmap.hasAlpha()) {
            int i15 = width * 8;
            bArr = new byte[((i15 / 8) + (i15 % 8 != 0 ? 1 : 0)) * height];
        } else {
            bArr = new byte[0];
        }
        byte[] bArr3 = bArr;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < height; i18++) {
            bitmap.getPixels(iArr, 0, width, 0, i18, width, 1);
            for (int i19 = 0; i19 < width; i19++) {
                int i25 = iArr[i19];
                bArr2[i16] = (byte) ((i25 >> 16) & GF2Field.MASK);
                int i26 = i16 + 2;
                bArr2[i16 + 1] = (byte) ((i25 >> 8) & GF2Field.MASK);
                i16 += 3;
                bArr2[i26] = (byte) (i25 & GF2Field.MASK);
                if (bitmap.hasAlpha()) {
                    bArr3[i17] = (byte) ((i25 >> 24) & GF2Field.MASK);
                    i17++;
                }
            }
        }
        d dVarE = e(cVar, bArr2, bitmap.getWidth(), bitmap.getHeight(), 8, eVar);
        if (bitmap.hasAlpha()) {
            dVarE.D1().Z4(i.Z7, e(cVar, bArr3, bitmap.getWidth(), bitmap.getHeight(), 8, op.d.f148060c));
        }
        return dVarE;
    }

    private static boolean d(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8;
    }

    static d e(gp.c cVar, byte[] bArr, int i15, int i16, int i17, op.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length / 2);
        m mVar = m.f37223b;
        i iVar = i.E3;
        mVar.a(iVar).d(new ByteArrayInputStream(bArr), byteArrayOutputStream, new bp.d(), 0);
        return new d(cVar, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), iVar, i15, i16, i17, bVar);
    }
}
