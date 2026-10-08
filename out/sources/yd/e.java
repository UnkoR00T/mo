package yd;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f226452u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f226453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f226454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC6070a f226455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f226456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f226457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f226458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f226459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f226460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f226461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f226462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f226463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f226464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f226465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f226466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f226467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f226468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f226469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f226470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f226471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f226472t;

    public e(a.InterfaceC6070a interfaceC6070a, c cVar, ByteBuffer byteBuffer, int i15) {
        this(interfaceC6070a);
        q(cVar, byteBuffer, i15);
    }

    private int i(int i15, int i16, int i17) {
        int i18 = 0;
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        for (int i28 = i15; i28 < this.f226468p + i15; i28++) {
            byte[] bArr = this.f226461i;
            if (i28 >= bArr.length || i28 >= i16) {
                break;
            }
            int i29 = this.f226453a[bArr[i28] & 255];
            if (i29 != 0) {
                i18 += (i29 >> 24) & GF2Field.MASK;
                i19 += (i29 >> 16) & GF2Field.MASK;
                i25 += (i29 >> 8) & GF2Field.MASK;
                i26 += i29 & GF2Field.MASK;
                i27++;
            }
        }
        int i35 = i15 + i17;
        for (int i36 = i35; i36 < this.f226468p + i35; i36++) {
            byte[] bArr2 = this.f226461i;
            if (i36 >= bArr2.length || i36 >= i16) {
                break;
            }
            int i37 = this.f226453a[bArr2[i36] & 255];
            if (i37 != 0) {
                i18 += (i37 >> 24) & GF2Field.MASK;
                i19 += (i37 >> 16) & GF2Field.MASK;
                i25 += (i37 >> 8) & GF2Field.MASK;
                i26 += i37 & GF2Field.MASK;
                i27++;
            }
        }
        if (i27 == 0) {
            return 0;
        }
        return ((i18 / i27) << 24) | ((i19 / i27) << 16) | ((i25 / i27) << 8) | (i26 / i27);
    }

    private void j(b bVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f226462j;
        int i19 = bVar.f226427d;
        int i25 = this.f226468p;
        int i26 = i19 / i25;
        int i27 = bVar.f226425b / i25;
        int i28 = bVar.f226426c / i25;
        int i29 = bVar.f226424a / i25;
        boolean z15 = this.f226463k == 0;
        int i35 = this.f226470r;
        int i36 = this.f226469q;
        byte[] bArr = this.f226461i;
        int[] iArr2 = this.f226453a;
        Boolean bool = this.f226471s;
        int i37 = 8;
        int i38 = 0;
        int i39 = 0;
        int i45 = 1;
        while (i39 < i26) {
            int[] iArr3 = iArr;
            if (bVar.f226428e) {
                if (i38 >= i26) {
                    int i46 = i45 + 1;
                    i15 = i26;
                    if (i46 == 2) {
                        i45 = i46;
                        i38 = 4;
                    } else if (i46 == 3) {
                        i45 = i46;
                        i37 = 4;
                        i38 = 2;
                    } else if (i46 != 4) {
                        i45 = i46;
                    } else {
                        i45 = i46;
                        i38 = 1;
                        i37 = 2;
                    }
                } else {
                    i15 = i26;
                }
                i16 = i38 + i37;
            } else {
                i15 = i26;
                i16 = i38;
                i38 = i39;
            }
            int i47 = i38 + i27;
            boolean z16 = i25 == 1;
            if (i47 < i36) {
                int i48 = i47 * i35;
                int i49 = i48 + i29;
                int i55 = i49 + i28;
                int i56 = i48 + i35;
                if (i56 < i55) {
                    i55 = i56;
                }
                i17 = i16;
                int i57 = i39 * i25 * bVar.f226426c;
                if (z16) {
                    int i58 = i49;
                    while (i58 < i55) {
                        int i59 = i58;
                        int i65 = iArr2[bArr[i57] & 255];
                        if (i65 != 0) {
                            iArr3[i59] = i65;
                        } else if (z15 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i57 += i25;
                        i58 = i59 + 1;
                    }
                } else {
                    int i66 = ((i55 - i49) * i25) + i57;
                    i18 = i25;
                    int i67 = i49;
                    while (i67 < i55) {
                        int i68 = i55;
                        int i69 = i(i57, i66, bVar.f226426c);
                        if (i69 != 0) {
                            iArr3[i67] = i69;
                        } else if (z15 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i57 += i18;
                        i67++;
                        i55 = i68;
                    }
                }
                i39++;
                i25 = i18;
                iArr = iArr3;
                i26 = i15;
                i38 = i17;
            } else {
                i17 = i16;
            }
            i18 = i25;
            i39++;
            i25 = i18;
            iArr = iArr3;
            i26 = i15;
            i38 = i17;
        }
        if (this.f226471s == null) {
            this.f226471s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f226462j;
        int i15 = bVar2.f226427d;
        int i16 = bVar2.f226425b;
        int i17 = bVar2.f226426c;
        int i18 = bVar2.f226424a;
        boolean z15 = this.f226463k == 0;
        int i19 = this.f226470r;
        byte[] bArr = this.f226461i;
        int[] iArr2 = this.f226453a;
        int i25 = 0;
        byte b15 = -1;
        while (i25 < i15) {
            int i26 = (i25 + i16) * i19;
            int i27 = i26 + i18;
            int i28 = i27 + i17;
            int i29 = i26 + i19;
            if (i29 < i28) {
                i28 = i29;
            }
            int i35 = bVar2.f226426c * i25;
            int i36 = i27;
            while (i36 < i28) {
                byte b16 = bArr[i35];
                int[] iArr3 = iArr;
                int i37 = b16 & 255;
                if (i37 != b15) {
                    int i38 = iArr2[i37];
                    if (i38 != 0) {
                        iArr3[i36] = i38;
                    } else {
                        b15 = b16;
                    }
                }
                i35++;
                i36++;
                iArr = iArr3;
            }
            i25++;
            bVar2 = bVar;
        }
        Boolean bool = this.f226471s;
        this.f226471s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f226471s == null && z15 && b15 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i15;
        int i16;
        short s15;
        e eVar = this;
        if (bVar != null) {
            eVar.f226456d.position(bVar.f226433j);
        }
        if (bVar == null) {
            c cVar = eVar.f226464l;
            i15 = cVar.f226440f;
            i16 = cVar.f226441g;
        } else {
            i15 = bVar.f226426c;
            i16 = bVar.f226427d;
        }
        int i17 = i15 * i16;
        byte[] bArr = eVar.f226461i;
        if (bArr == null || bArr.length < i17) {
            eVar.f226461i = eVar.f226455c.b(i17);
        }
        byte[] bArr2 = eVar.f226461i;
        if (eVar.f226458f == null) {
            eVar.f226458f = new short[PKIFailureInfo.certConfirmed];
        }
        short[] sArr = eVar.f226458f;
        if (eVar.f226459g == null) {
            eVar.f226459g = new byte[PKIFailureInfo.certConfirmed];
        }
        byte[] bArr3 = eVar.f226459g;
        if (eVar.f226460h == null) {
            eVar.f226460h = new byte[4097];
        }
        byte[] bArr4 = eVar.f226460h;
        int iP = eVar.p();
        int i18 = 1 << iP;
        int i19 = i18 + 1;
        int i25 = i18 + 2;
        int i26 = iP + 1;
        int i27 = (1 << i26) - 1;
        byte b15 = 0;
        for (int i28 = 0; i28 < i18; i28++) {
            sArr[i28] = 0;
            bArr3[i28] = (byte) i28;
        }
        byte[] bArr5 = eVar.f226457e;
        int i29 = i26;
        int i35 = i25;
        int i36 = i27;
        int i37 = 0;
        int iO = 0;
        int i38 = 0;
        int i39 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = -1;
        while (i37 < i17) {
            if (iO == 0) {
                iO = eVar.o();
                if (iO <= 0) {
                    eVar.f226467o = 3;
                    break;
                }
                i38 = b15;
            }
            i45 += (bArr5[i38] & 255) << i39;
            i38++;
            iO--;
            int i55 = i39 + 8;
            i35 = i35;
            int i56 = i49;
            int i57 = i29;
            short[] sArr2 = sArr;
            int i58 = i48;
            while (true) {
                bArr3 = bArr3;
                if (i55 < i57) {
                    i48 = i58;
                    break;
                }
                int i59 = i45 & i36;
                i45 >>= i57;
                i55 -= i57;
                if (i59 == i18) {
                    i57 = i26;
                    i35 = i25;
                    i36 = i27;
                    i56 = -1;
                } else {
                    if (i59 == i19) {
                        i48 = i58;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i56 == -1) {
                        bArr2[i46] = bArr3[i59];
                        i46++;
                        i37++;
                        i56 = i59;
                        i58 = i56;
                        bArr4 = bArr6;
                    } else {
                        if (i59 >= i35) {
                            bArr6[i47] = (byte) i58;
                            i47++;
                            s15 = i56;
                        } else {
                            s15 = i59;
                        }
                        while (s15 >= i18) {
                            bArr6[i47] = bArr3[s15];
                            i47++;
                            s15 = sArr2[s15];
                        }
                        int i65 = bArr3[s15] & 255;
                        byte b16 = (byte) i65;
                        bArr2[i46] = b16;
                        while (true) {
                            i46++;
                            i37++;
                            if (i47 <= 0) {
                                break;
                            }
                            i47--;
                            bArr2[i46] = bArr6[i47];
                        }
                        if (i35 < 4096) {
                            sArr2[i35] = (short) i56;
                            bArr3[i35] = b16;
                            i35++;
                            if ((i35 & i36) == 0 && i35 < 4096) {
                                i57++;
                                i36 += i35;
                            }
                        }
                        i56 = i59;
                        bArr4 = bArr6;
                        i58 = i65;
                    }
                }
            }
            i39 = i55;
            sArr = sArr2;
            bArr3 = bArr3;
            b15 = 0;
            i49 = i56;
            i29 = i57;
            eVar = this;
        }
        Arrays.fill(bArr2, i46, i17, b15);
    }

    private Bitmap n() {
        Boolean bool = this.f226471s;
        Bitmap bitmapC = this.f226455c.c(this.f226470r, this.f226469q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f226472t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f226456d;
        byteBuffer.get(this.f226457e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    private int p() {
        return this.f226456d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i15;
        int i16;
        Bitmap bitmap;
        int[] iArr = this.f226462j;
        int i17 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f226465m;
            if (bitmap2 != null) {
                this.f226455c.a(bitmap2);
            }
            this.f226465m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f226430g == 3 && this.f226465m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i16 = bVar2.f226430g) > 0) {
            if (i16 == 2) {
                if (!bVar.f226429f) {
                    c cVar = this.f226464l;
                    int i18 = cVar.f226446l;
                    if (bVar.f226434k == null || cVar.f226444j != bVar.f226431h) {
                        i17 = i18;
                    }
                }
                int i19 = bVar2.f226427d;
                int i25 = this.f226468p;
                int i26 = i19 / i25;
                int i27 = bVar2.f226425b / i25;
                int i28 = bVar2.f226426c / i25;
                int i29 = bVar2.f226424a / i25;
                int i35 = this.f226470r;
                int i36 = (i27 * i35) + i29;
                int i37 = (i26 * i35) + i36;
                while (i36 < i37) {
                    int i38 = i36 + i28;
                    for (int i39 = i36; i39 < i38; i39++) {
                        iArr[i39] = i17;
                    }
                    i36 += this.f226470r;
                }
            } else if (i16 == 3 && (bitmap = this.f226465m) != null) {
                int i45 = this.f226470r;
                bitmap.getPixels(iArr, 0, i45, 0, 0, i45, this.f226469q);
            }
        }
        l(bVar);
        if (bVar.f226428e || this.f226468p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f226466n && ((i15 = bVar.f226430g) == 0 || i15 == 1)) {
            if (this.f226465m == null) {
                this.f226465m = n();
            }
            Bitmap bitmap3 = this.f226465m;
            int i46 = this.f226470r;
            bitmap3.setPixels(iArr, 0, i46, 0, 0, i46, this.f226469q);
        }
        Bitmap bitmapN = n();
        int i47 = this.f226470r;
        bitmapN.setPixels(iArr, 0, i47, 0, 0, i47, this.f226469q);
        return bitmapN;
    }

    @Override // yd.a
    public void a() {
        this.f226463k = (this.f226463k + 1) % this.f226464l.f226437c;
    }

    @Override // yd.a
    public synchronized Bitmap b() {
        try {
            if (this.f226464l.f226437c <= 0 || this.f226463k < 0) {
                if (Log.isLoggable(f226452u, 3)) {
                    int i15 = this.f226464l.f226437c;
                }
                this.f226467o = 1;
            }
            int i16 = this.f226467o;
            if (i16 != 1 && i16 != 2) {
                this.f226467o = 0;
                if (this.f226457e == null) {
                    this.f226457e = this.f226455c.b(GF2Field.MASK);
                }
                b bVar = this.f226464l.f226439e.get(this.f226463k);
                int i17 = this.f226463k - 1;
                b bVar2 = i17 >= 0 ? this.f226464l.f226439e.get(i17) : null;
                int[] iArr = bVar.f226434k;
                if (iArr == null) {
                    iArr = this.f226464l.f226435a;
                }
                this.f226453a = iArr;
                if (iArr == null) {
                    this.f226467o = 1;
                    return null;
                }
                if (bVar.f226429f) {
                    System.arraycopy(iArr, 0, this.f226454b, 0, iArr.length);
                    int[] iArr2 = this.f226454b;
                    this.f226453a = iArr2;
                    iArr2[bVar.f226431h] = 0;
                    if (bVar.f226430g == 2 && this.f226463k == 0) {
                        this.f226471s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            return null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // yd.a
    public int c() {
        return this.f226464l.f226437c;
    }

    @Override // yd.a
    public void clear() {
        this.f226464l = null;
        byte[] bArr = this.f226461i;
        if (bArr != null) {
            this.f226455c.e(bArr);
        }
        int[] iArr = this.f226462j;
        if (iArr != null) {
            this.f226455c.f(iArr);
        }
        Bitmap bitmap = this.f226465m;
        if (bitmap != null) {
            this.f226455c.a(bitmap);
        }
        this.f226465m = null;
        this.f226456d = null;
        this.f226471s = null;
        byte[] bArr2 = this.f226457e;
        if (bArr2 != null) {
            this.f226455c.e(bArr2);
        }
    }

    @Override // yd.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f226472t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // yd.a
    public int e() {
        int i15;
        if (this.f226464l.f226437c <= 0 || (i15 = this.f226463k) < 0) {
            return 0;
        }
        return m(i15);
    }

    @Override // yd.a
    public void f() {
        this.f226463k = -1;
    }

    @Override // yd.a
    public int g() {
        return this.f226463k;
    }

    @Override // yd.a
    public ByteBuffer getData() {
        return this.f226456d;
    }

    @Override // yd.a
    public int h() {
        return this.f226456d.limit() + this.f226461i.length + (this.f226462j.length * 4);
    }

    public int m(int i15) {
        if (i15 < 0) {
            return -1;
        }
        c cVar = this.f226464l;
        if (i15 < cVar.f226437c) {
            return cVar.f226439e.get(i15).f226432i;
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i15) {
        try {
            if (i15 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i15);
            }
            int iHighestOneBit = Integer.highestOneBit(i15);
            this.f226467o = 0;
            this.f226464l = cVar;
            this.f226463k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f226456d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f226456d.order(ByteOrder.LITTLE_ENDIAN);
            this.f226466n = false;
            Iterator<b> it = cVar.f226439e.iterator();
            while (it.hasNext()) {
                if (it.next().f226430g == 3) {
                    this.f226466n = true;
                    break;
                }
            }
            this.f226468p = iHighestOneBit;
            int i16 = cVar.f226440f;
            this.f226470r = i16 / iHighestOneBit;
            int i17 = cVar.f226441g;
            this.f226469q = i17 / iHighestOneBit;
            this.f226461i = this.f226455c.b(i16 * i17);
            this.f226462j = this.f226455c.d(this.f226470r * this.f226469q);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public e(a.InterfaceC6070a interfaceC6070a) {
        this.f226454b = new int[256];
        this.f226472t = Bitmap.Config.ARGB_8888;
        this.f226455c = interfaceC6070a;
        this.f226464l = new c();
    }
}
