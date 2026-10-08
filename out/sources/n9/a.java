package n9;

import ak.n0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import l9.s;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.b0;
import w7.c0;
import w7.l;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f133604h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f133605i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f133606j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f133607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f133608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f133609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f133610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3311a f133611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f133612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f133613g;

    /* JADX INFO: renamed from: n9.a$a, reason: collision with other inner class name */
    private static final class C3311a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f133615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f133616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f133617d;

        public C3311a(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f133614a = i15;
            this.f133615b = iArr;
            this.f133616c = iArr2;
            this.f133617d = iArr3;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f133619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f133620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f133621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f133622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f133623f;

        public b(int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f133618a = i15;
            this.f133619b = i16;
            this.f133620c = i17;
            this.f133621d = i18;
            this.f133622e = i19;
            this.f133623f = i25;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f133625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f133626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f133627d;

        public c(int i15, boolean z15, byte[] bArr, byte[] bArr2) {
            this.f133624a = i15;
            this.f133625b = z15;
            this.f133626c = bArr;
            this.f133627d = bArr2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f133629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f133630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f133631d;

        public d(int i15, int i16, int i17, SparseArray<e> sparseArray) {
            this.f133628a = i15;
            this.f133629b = i16;
            this.f133630c = i17;
            this.f133631d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f133633b;

        public e(int i15, int i16) {
            this.f133632a = i15;
            this.f133633b = i16;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f133635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f133636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f133637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f133638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f133639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f133640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f133641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f133642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f133643j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f133644k;

        public f(int i15, boolean z15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, SparseArray<g> sparseArray) {
            this.f133634a = i15;
            this.f133635b = z15;
            this.f133636c = i16;
            this.f133637d = i17;
            this.f133638e = i18;
            this.f133639f = i19;
            this.f133640g = i25;
            this.f133641h = i26;
            this.f133642i = i27;
            this.f133643j = i28;
            this.f133644k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f133644k;
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                this.f133644k.put(sparseArray.keyAt(i15), sparseArray.valueAt(i15));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f133646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f133647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f133648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f133649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f133650f;

        public g(int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f133645a = i15;
            this.f133646b = i16;
            this.f133647c = i17;
            this.f133648d = i18;
            this.f133649e = i19;
            this.f133650f = i25;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f133651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f133652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f133653c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C3311a> f133654d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f133655e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C3311a> f133656f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f133657g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f133658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f133659i;

        public h(int i15, int i16) {
            this.f133651a = i15;
            this.f133652b = i16;
        }

        public void a() {
            this.f133653c.clear();
            this.f133654d.clear();
            this.f133655e.clear();
            this.f133656f.clear();
            this.f133657g.clear();
            this.f133658h = null;
            this.f133659i = null;
        }
    }

    public a(List<byte[]> list) {
        c0 c0Var = new c0(list.get(0));
        int iY = c0Var.Y();
        int iY2 = c0Var.Y();
        Paint paint = new Paint();
        this.f133607a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f133608b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f133609c = new Canvas();
        this.f133610d = new b(719, 575, 0, 719, 0, 575);
        this.f133611e = new C3311a(0, e(), f(), g());
        this.f133612f = new h(iY, iY2);
    }

    private static byte[] d(int i15, int i16, b0 b0Var) {
        byte[] bArr = new byte[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            bArr[i17] = (byte) b0Var.h(i16);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                iArr[i15] = h(GF2Field.MASK, (i15 & 1) != 0 ? 255 : 0, (i15 & 2) != 0 ? 255 : 0, (i15 & 4) != 0 ? 255 : 0);
            } else {
                int i16 = i15 & 1;
                int i17 = CertificateBody.profileType;
                int i18 = i16 != 0 ? 127 : 0;
                int i19 = (i15 & 2) != 0 ? 127 : 0;
                if ((i15 & 4) == 0) {
                    i17 = 0;
                }
                iArr[i15] = h(GF2Field.MASK, i18, i19, i17);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = GF2Field.MASK;
            if (i15 < 8) {
                int i17 = (i15 & 1) != 0 ? 255 : 0;
                int i18 = (i15 & 2) != 0 ? 255 : 0;
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = h(63, i17, i18, i16);
            } else {
                int i19 = i15 & 136;
                if (i19 == 0) {
                    iArr[i15] = h(GF2Field.MASK, ((i15 & 1) != 0 ? 85 : 0) + ((i15 & 16) != 0 ? 170 : 0), ((i15 & 2) != 0 ? 85 : 0) + ((i15 & 32) != 0 ? 170 : 0), ((i15 & 4) == 0 ? 0 : 85) + ((i15 & 64) == 0 ? 0 : 170));
                } else if (i19 == 8) {
                    iArr[i15] = h(CertificateBody.profileType, ((i15 & 1) != 0 ? 85 : 0) + ((i15 & 16) != 0 ? 170 : 0), ((i15 & 2) != 0 ? 85 : 0) + ((i15 & 32) != 0 ? 170 : 0), ((i15 & 4) == 0 ? 0 : 85) + ((i15 & 64) == 0 ? 0 : 170));
                } else if (i19 == 128) {
                    iArr[i15] = h(GF2Field.MASK, ((i15 & 1) != 0 ? 43 : 0) + CertificateBody.profileType + ((i15 & 16) != 0 ? 85 : 0), ((i15 & 2) != 0 ? 43 : 0) + CertificateBody.profileType + ((i15 & 32) != 0 ? 85 : 0), ((i15 & 4) == 0 ? 0 : 43) + CertificateBody.profileType + ((i15 & 64) == 0 ? 0 : 85));
                } else if (i19 == 136) {
                    iArr[i15] = h(GF2Field.MASK, ((i15 & 1) != 0 ? 43 : 0) + ((i15 & 16) != 0 ? 85 : 0), ((i15 & 2) != 0 ? 43 : 0) + ((i15 & 32) != 0 ? 85 : 0), ((i15 & 4) == 0 ? 0 : 43) + ((i15 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i15, int i16, int i17, int i18) {
        return (i15 << 24) | (i16 << 16) | (i17 << 8) | i18;
    }

    private static int i(b0 b0Var, int[] iArr, byte[] bArr, int i15, int i16, Paint paint, Canvas canvas) {
        int i17;
        int iH;
        int iH2;
        boolean z15 = false;
        while (true) {
            int iH3 = b0Var.h(2);
            if (iH3 != 0) {
                z15 = z15;
                i17 = 1;
            } else {
                if (b0Var.g()) {
                    iH = b0Var.h(3) + 3;
                    iH2 = b0Var.h(2);
                } else {
                    if (b0Var.g()) {
                        i17 = 1;
                    } else {
                        int iH4 = b0Var.h(2);
                        if (iH4 == 0) {
                            z15 = true;
                        } else if (iH4 == 1) {
                            i17 = 2;
                        } else if (iH4 == 2) {
                            iH = b0Var.h(4) + 12;
                            iH2 = b0Var.h(2);
                        } else if (iH4 != 3) {
                            z15 = z15;
                        } else {
                            iH = b0Var.h(8) + 29;
                            iH2 = b0Var.h(2);
                        }
                        iH3 = 0;
                        i17 = 0;
                    }
                    iH3 = 0;
                }
                z15 = z15;
                i17 = iH;
                iH3 = iH2;
            }
            if (i17 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i15, i16, i15 + i17, 1 + i16, paint);
            }
            i15 += i17;
            if (z15) {
                return i15;
            }
            z15 = z15;
        }
    }

    private static int j(b0 b0Var, int[] iArr, byte[] bArr, int i15, int i16, Paint paint, Canvas canvas) {
        int i17;
        int iH;
        int iH2;
        boolean z15 = false;
        while (true) {
            int iH3 = b0Var.h(4);
            if (iH3 != 0) {
                z15 = z15;
                i17 = 1;
            } else if (b0Var.g()) {
                if (b0Var.g()) {
                    int iH4 = b0Var.h(2);
                    if (iH4 == 0) {
                        i17 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i17 = 2;
                        z15 = z15;
                    } else if (iH4 == 2) {
                        iH = b0Var.h(4) + 9;
                        iH2 = b0Var.h(4);
                    } else if (iH4 != 3) {
                        z15 = z15;
                        iH3 = 0;
                        i17 = 0;
                    } else {
                        iH = b0Var.h(8) + 25;
                        iH2 = b0Var.h(4);
                    }
                } else {
                    iH = b0Var.h(2) + 4;
                    iH2 = b0Var.h(4);
                }
                z15 = z15;
                i17 = iH;
                iH3 = iH2;
            } else {
                int iH5 = b0Var.h(3);
                if (iH5 != 0) {
                    i17 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z15 = true;
                    iH3 = 0;
                    i17 = 0;
                }
            }
            if (i17 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i15, i16, i15 + i17, 1 + i16, paint);
            }
            i15 += i17;
            if (z15) {
                return i15;
            }
            z15 = z15;
        }
    }

    private static int k(b0 b0Var, int[] iArr, byte[] bArr, int i15, int i16, Paint paint, Canvas canvas) {
        boolean z15;
        int iH;
        boolean z16 = false;
        while (true) {
            int iH2 = b0Var.h(8);
            if (iH2 != 0) {
                z15 = z16;
                iH = 1;
            } else if (b0Var.g()) {
                z15 = z16;
                iH = b0Var.h(7);
                iH2 = b0Var.h(8);
            } else {
                int iH3 = b0Var.h(7);
                if (iH3 != 0) {
                    z15 = z16;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z15 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i15, i16, i15 + iH, 1 + i16, paint);
            }
            i15 += iH;
            if (z15) {
                return i15;
            }
            z16 = z15;
        }
    }

    private static void l(byte[] bArr, int[] iArr, int i15, int i16, int i17, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        b0 b0Var = new b0(bArr);
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        int i18 = i16;
        int i19 = i17;
        byte[] bArrD3 = null;
        while (b0Var.b() != 0) {
            int iH = b0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i15 != 3) {
                            if (i15 == 2) {
                                bArr3 = bArrD2 == null ? f133604h : bArrD2;
                            } else {
                                bArr2 = null;
                            }
                            i18 = i(b0Var, iArr2, bArr2, i18, i19, paint2, canvas2);
                            b0Var.c();
                        } else {
                            bArr3 = bArrD3 == null ? f133605i : bArrD3;
                        }
                        bArr2 = bArr3;
                        i18 = i(b0Var, iArr2, bArr2, i18, i19, paint2, canvas2);
                        b0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        i18 = j(b0Var, iArr2, i15 == 3 ? bArrD == null ? f133606j : bArrD : null, i18, i19, paint2, canvas2);
                        b0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i18 = k(b0Var, iArr2, null, i18, i19, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrD2 = d(4, 4, b0Var);
                                break;
                            case 33:
                                bArrD3 = d(4, 8, b0Var);
                                break;
                            case 34:
                                bArrD = d(16, 8, b0Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i19 += 2;
                i18 = i16;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void m(c cVar, C3311a c3311a, int i15, int i16, int i17, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i15 == 3) {
            iArr = c3311a.f133617d;
        } else {
            iArr = i15 == 2 ? c3311a.f133616c : c3311a.f133615b;
        }
        int[] iArr2 = iArr;
        l(cVar.f133626c, iArr2, i15, i16, i17, paint, canvas);
        l(cVar.f133627d, iArr2, i15, i16, i17 + 1, paint, canvas);
    }

    private l9.e n(b0 b0Var) {
        int i15;
        while (b0Var.b() >= 48 && b0Var.h(8) == 15) {
            t(b0Var, this.f133612f);
        }
        h hVar = this.f133612f;
        d dVar = hVar.f133659i;
        if (dVar == null) {
            return new l9.e(n0.C(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f133658h;
        if (bVar == null) {
            bVar = this.f133610d;
        }
        Bitmap bitmap = this.f133613g;
        if (bitmap == null || bVar.f133618a + 1 != bitmap.getWidth() || bVar.f133619b + 1 != this.f133613g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f133618a + 1, bVar.f133619b + 1, Bitmap.Config.ARGB_8888);
            this.f133613g = bitmapCreateBitmap;
            this.f133609c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f133631d;
        int i16 = 0;
        while (i16 < sparseArray.size()) {
            this.f133609c.save();
            e eVarValueAt = sparseArray.valueAt(i16);
            f fVar = this.f133612f.f133653c.get(sparseArray.keyAt(i16));
            int i17 = eVarValueAt.f133632a + bVar.f133620c;
            int i18 = eVarValueAt.f133633b + bVar.f133622e;
            this.f133609c.clipRect(i17, i18, Math.min(fVar.f133636c + i17, bVar.f133621d), Math.min(fVar.f133637d + i18, bVar.f133623f));
            C3311a c3311a = this.f133612f.f133654d.get(fVar.f133640g);
            if (c3311a == null && (c3311a = this.f133612f.f133656f.get(fVar.f133640g)) == null) {
                c3311a = this.f133611e;
            }
            C3311a c3311a2 = c3311a;
            SparseArray<g> sparseArray2 = fVar.f133644k;
            int i19 = 0;
            while (i19 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i19);
                g gVarValueAt = sparseArray2.valueAt(i19);
                c cVar = this.f133612f.f133655e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f133612f.f133657g.get(iKeyAt);
                }
                if (cVar != null) {
                    m(cVar, c3311a2, fVar.f133639f, gVarValueAt.f133647c + i17, gVarValueAt.f133648d + i18, cVar.f133625b ? null : this.f133607a, this.f133609c);
                }
                i19++;
                sparseArray = sparseArray;
            }
            SparseArray<e> sparseArray3 = sparseArray;
            if (fVar.f133635b) {
                int i25 = fVar.f133639f;
                if (i25 == 3) {
                    i15 = c3311a2.f133617d[fVar.f133641h];
                } else {
                    i15 = i25 == 2 ? c3311a2.f133616c[fVar.f133642i] : c3311a2.f133615b[fVar.f133643j];
                }
                this.f133608b.setColor(i15);
                this.f133609c.drawRect(i17, i18, fVar.f133636c + i17, fVar.f133637d + i18, this.f133608b);
            }
            arrayList.add(new v7.a.b().f(Bitmap.createBitmap(this.f133613g, i17, i18, fVar.f133636c, fVar.f133637d)).k(i17 / bVar.f133618a).l(0).h(i18 / bVar.f133619b, 0).i(0).n(fVar.f133636c / bVar.f133618a).g(fVar.f133637d / bVar.f133619b).a());
            this.f133609c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f133609c.restore();
            i16++;
            sparseArray = sparseArray3;
        }
        return new l9.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C3311a o(b0 b0Var, int i15) {
        int[] iArr;
        int iH;
        int i16;
        int iH2;
        int iH3;
        int iH4;
        int i17 = 8;
        int iH5 = b0Var.h(8);
        b0Var.r(8);
        int i18 = 2;
        int i19 = i15 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i19 > 0) {
            int iH6 = b0Var.h(i17);
            int iH7 = b0Var.h(i17);
            if ((iH7 & 128) != 0) {
                iArr = iArrE;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrF : iArrG;
            }
            if ((iH7 & 1) != 0) {
                iH3 = b0Var.h(i17);
                iH4 = b0Var.h(i17);
                iH = b0Var.h(i17);
                iH2 = b0Var.h(i17);
                i16 = i19 - 6;
            } else {
                int iH8 = b0Var.h(6) << i18;
                int iH9 = b0Var.h(4) << 4;
                iH = b0Var.h(4) << 4;
                i16 = i19 - 4;
                iH2 = b0Var.h(i18) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d15 = iH3;
            double d16 = iH4 - 128;
            double d17 = iH - 128;
            iArr[iH6] = h((byte) (255 - (iH2 & GF2Field.MASK)), o0.o((int) (d15 + (1.402d * d16)), 0, GF2Field.MASK), o0.o((int) ((d15 - (0.34414d * d17)) - (d16 * 0.71414d)), 0, GF2Field.MASK), o0.o((int) (d15 + (d17 * 1.772d)), 0, GF2Field.MASK));
            i19 = i16;
            iH5 = iH5;
            i17 = 8;
            i18 = 2;
        }
        return new C3311a(iH5, iArrE, iArrF, iArrG);
    }

    private static b p(b0 b0Var) {
        int i15;
        int i16;
        int i17;
        int iH;
        b0Var.r(4);
        boolean zG = b0Var.g();
        b0Var.r(3);
        int iH2 = b0Var.h(16);
        int iH3 = b0Var.h(16);
        if (zG) {
            int iH4 = b0Var.h(16);
            int iH5 = b0Var.h(16);
            int iH6 = b0Var.h(16);
            iH = b0Var.h(16);
            i17 = iH5;
            i16 = iH6;
            i15 = iH4;
        } else {
            i15 = 0;
            i16 = 0;
            i17 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i15, i17, i16, iH);
    }

    private static c q(b0 b0Var) {
        byte[] bArr;
        int iH = b0Var.h(16);
        b0Var.r(4);
        int iH2 = b0Var.h(2);
        boolean zG = b0Var.g();
        b0Var.r(1);
        byte[] bArr2 = o0.f210729f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = b0Var.h(16);
                int iH4 = b0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    b0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    b0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        b0Var.r(b0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(b0 b0Var, int i15) {
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(4);
        int iH3 = b0Var.h(2);
        b0Var.r(2);
        int i16 = i15 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int iH4 = b0Var.h(8);
            b0Var.r(8);
            i16 -= 6;
            sparseArray.put(iH4, new e(b0Var.h(16), b0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(b0 b0Var, int i15) {
        int i16;
        int iH;
        int iH2;
        char c15;
        int iH3 = b0Var.h(8);
        int i17 = 4;
        b0Var.r(4);
        boolean zG = b0Var.g();
        b0Var.r(3);
        int i18 = 16;
        int iH4 = b0Var.h(16);
        int iH5 = b0Var.h(16);
        int iH6 = b0Var.h(3);
        int iH7 = b0Var.h(3);
        int i19 = 2;
        b0Var.r(2);
        int iH8 = b0Var.h(8);
        int iH9 = b0Var.h(8);
        int iH10 = b0Var.h(4);
        int iH11 = b0Var.h(2);
        b0Var.r(2);
        int i25 = i15 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i25 > 0) {
            int iH12 = b0Var.h(i18);
            int iH13 = b0Var.h(i19);
            int iH14 = b0Var.h(i19);
            int iH15 = b0Var.h(12);
            b0Var.r(i17);
            int iH16 = b0Var.h(12);
            int i26 = i25 - 6;
            if (iH13 != 1) {
                i16 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i25 = i26;
                    c15 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i18 = 16;
                i19 = i16;
                i17 = 4;
            } else {
                i16 = 2;
            }
            c15 = '\b';
            i25 -= 8;
            iH2 = b0Var.h(8);
            iH = b0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i18 = 16;
            i19 = i16;
            i17 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(b0 b0Var, h hVar) {
        f fVar;
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(16);
        int iH3 = b0Var.h(16);
        int iD = b0Var.d() + iH3;
        if (iH3 * 8 > b0Var.b()) {
            t.h("DvbParser", "Data field length exceeds limit");
            b0Var.r(b0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f133651a) {
                    d dVar = hVar.f133659i;
                    d dVarR = r(b0Var, iH3);
                    if (dVarR.f133630c != 0) {
                        hVar.f133659i = dVarR;
                        hVar.f133653c.clear();
                        hVar.f133654d.clear();
                        hVar.f133655e.clear();
                    } else if (dVar != null && dVar.f133629b != dVarR.f133629b) {
                        hVar.f133659i = dVarR;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f133659i;
                if (iH2 == hVar.f133651a && dVar2 != null) {
                    f fVarS = s(b0Var, iH3);
                    if (dVar2.f133630c == 0 && (fVar = hVar.f133653c.get(fVarS.f133634a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f133653c.put(fVarS.f133634a, fVarS);
                }
                break;
            case 18:
                if (iH2 == hVar.f133651a) {
                    C3311a c3311aO = o(b0Var, iH3);
                    hVar.f133654d.put(c3311aO.f133614a, c3311aO);
                } else if (iH2 == hVar.f133652b) {
                    C3311a c3311aO2 = o(b0Var, iH3);
                    hVar.f133656f.put(c3311aO2.f133614a, c3311aO2);
                }
                break;
            case 19:
                if (iH2 == hVar.f133651a) {
                    c cVarQ = q(b0Var);
                    hVar.f133655e.put(cVarQ.f133624a, cVarQ);
                } else if (iH2 == hVar.f133652b) {
                    c cVarQ2 = q(b0Var);
                    hVar.f133657g.put(cVarQ2.f133624a, cVarQ2);
                }
                break;
            case 20:
                if (iH2 == hVar.f133651a) {
                    hVar.f133658h = p(b0Var);
                }
                break;
        }
        b0Var.s(iD - b0Var.d());
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<l9.e> lVar) {
        b0 b0Var = new b0(bArr, i16 + i15);
        b0Var.p(i15);
        lVar.accept(n(b0Var));
    }

    @Override // l9.s
    public int c() {
        return 2;
    }

    @Override // l9.s
    public void reset() {
        this.f133612f.a();
    }
}
