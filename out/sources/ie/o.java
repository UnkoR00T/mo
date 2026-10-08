package ie;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zd.g<zd.b> f91921f = zd.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", zd.b.f234348c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zd.g<zd.i> f91922g = zd.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final zd.g<n> f91923h = n.f91916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zd.g<Boolean> f91924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zd.g<Boolean> f91925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set<String> f91926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f91927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f91928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f91929n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.d f91930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f91931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce.b f91932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f91933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f91934e = t.b();

    class a implements b {
        a() {
        }

        @Override // ie.o.b
        public void a() {
        }

        @Override // ie.o.b
        public void b(ce.d dVar, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(ce.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f91924i = zd.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f91925j = zd.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f91926k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f91927l = new a();
        f91928m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f91929n = ve.l.f(0);
    }

    public o(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, ce.d dVar, ce.b bVar) {
        this.f91933d = list;
        this.f91931b = (DisplayMetrics) ve.k.d(displayMetrics);
        this.f91930a = (ce.d) ve.k.d(dVar);
        this.f91932c = (ce.b) ve.k.d(bVar);
    }

    private static int a(double d15) {
        int iL = l(d15);
        int iX = x(((double) iL) * d15);
        return x((d15 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(u uVar, zd.b bVar, boolean z15, boolean z16, BitmapFactory.Options options, int i15, int i16) {
        boolean zHasAlpha;
        if (this.f91934e.g(i15, i16, options, z15, z16)) {
            return;
        }
        if (bVar == zd.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = uVar.d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(bVar);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, u uVar, b bVar, ce.d dVar, n nVar, int i15, int i16, int i17, int i18, int i19, BitmapFactory.Options options) {
        int i25;
        int i26;
        int iFloor;
        int iFloor2;
        if (i16 <= 0 || i17 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (r(i15)) {
            i26 = i16;
            i25 = i17;
        } else {
            i25 = i16;
            i26 = i17;
        }
        float fB = nVar.b(i25, i26, i18, i19);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + nVar + ", source: [" + i16 + "x" + i17 + "], target: [" + i18 + "x" + i19 + "]");
        }
        n.g gVarA = nVar.a(i25, i26, i18, i19);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f15 = i25;
        float f16 = i26;
        int iX = i25 / x(fB * f15);
        int iX2 = i26 / x(fB * f16);
        n.g gVar = n.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f15 / fMin);
            iFloor2 = (int) Math.ceil(f16 / fMin);
            int i27 = iMax / 8;
            if (i27 > 0) {
                iFloor /= i27;
                iFloor2 /= i27;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f17 = iMax;
            iFloor = (int) Math.floor(f15 / f17);
            iFloor2 = (int) Math.floor(f16 / f17);
        } else if (imageType.isWebp()) {
            float f18 = iMax;
            iFloor = Math.round(f15 / f18);
            iFloor2 = Math.round(f16 / f18);
        } else if (i25 % iMax == 0 && i26 % iMax == 0) {
            iFloor = i25 / iMax;
            iFloor2 = i26 / iMax;
        } else {
            int[] iArrM = m(uVar, options, bVar, dVar);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = nVar.b(iFloor, iFloor2, i18, i19);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
    }

    private be.v<Bitmap> e(u uVar, int i15, int i16, zd.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f91932c.c(PKIFailureInfo.notAuthorized, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        zd.b bVar2 = (zd.b) hVar.c(f91921f);
        zd.i iVar = (zd.i) hVar.c(f91922g);
        n nVar = (n) hVar.c(n.f91916h);
        boolean zBooleanValue = ((Boolean) hVar.c(f91924i)).booleanValue();
        zd.g<Boolean> gVar = f91925j;
        try {
            return f.e(h(uVar, optionsK, nVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i15, i16, zBooleanValue, bVar), this.f91930a);
        } finally {
            v(optionsK);
            this.f91932c.put(bArr);
        }
    }

    private Bitmap h(u uVar, BitmapFactory.Options options, n nVar, zd.b bVar, zd.i iVar, boolean z15, int i15, int i16, boolean z16, b bVar2) {
        ColorSpace colorSpace;
        long jB = ve.g.b();
        int[] iArrM = m(uVar, options, bVar2, this.f91930a);
        int i17 = iArrM[0];
        int i18 = iArrM[1];
        String str = options.outMimeType;
        boolean z17 = (i17 == -1 || i18 == -1) ? false : z15;
        int iC = uVar.c();
        int iJ = b0.j(iC);
        boolean zM = b0.m(iC);
        int i19 = i15;
        if (i19 == Integer.MIN_VALUE) {
            i19 = r(iJ) ? i18 : i17;
        }
        if (i16 == -2147483648) {
            i16 = r(iJ) ? i17 : i18;
        }
        ImageHeaderParser.ImageType imageTypeD = uVar.d();
        c(imageTypeD, uVar, bVar2, this.f91930a, nVar, iJ, i17, i18, i19, i16, options);
        int i25 = i19;
        int iRound = i16;
        b(uVar, bVar, z17, zM, options, i25, iRound);
        int i26 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i17 < 0 || i18 < 0 || !z16) {
                float f15 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f16 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i17 / f16);
                int iCeil2 = (int) Math.ceil(i18 / f16);
                int iRound2 = Math.round(iCeil * f15);
                iRound = Math.round(iCeil2 * f15);
                i25 = iRound2;
            }
            if (i25 > 0 && iRound > 0) {
                y(options, this.f91930a, i25, iRound);
            }
        }
        if (iVar != null) {
            if (i26 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == zd.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(uVar, options, bVar2, this.f91930a);
        bVar2.b(this.f91930a, bitmapI);
        if (Log.isLoggable("Downsampler", 2)) {
            t(i17, i18, str, options, bitmapI, i15, i16, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f91931b.densityDpi);
        Bitmap bitmapN = b0.n(this.f91930a, bitmapI, iC);
        if (!bitmapI.equals(bitmapN)) {
            this.f91930a.c(bitmapI);
        }
        return bitmapN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(ie.u r4, android.graphics.BitmapFactory.Options r5, ie.o.b r6, ce.d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.a()
            r4.b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = ie.b0.i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L39
        L1b:
            java.util.concurrent.locks.Lock r5 = ie.b0.i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L39
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L38
            r7.c(r1)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L39
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L39
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L39
            goto L1b
        L37:
            throw r0     // Catch: java.lang.Throwable -> L39
        L38:
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = ie.b0.i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.o.i(ie.u, android.graphics.BitmapFactory$Options, ie.o$b, ce.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f91929n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    private static int l(double d15) {
        if (d15 > 1.0d) {
            d15 = 1.0d / d15;
        }
        return (int) Math.round(d15 * 2.147483647E9d);
    }

    private static int[] m(u uVar, BitmapFactory.Options options, b bVar, ce.d dVar) {
        options.inJustDecodeBounds = true;
        i(uVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i15) {
        return i15 == 90 || i15 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i15;
        int i16 = options.inTargetDensity;
        return i16 > 0 && (i15 = options.inDensity) > 0 && i16 != i15;
    }

    private static void t(int i15, int i16, String str, BitmapFactory.Options options, Bitmap bitmap, int i17, int i18, long j15) {
        j(bitmap);
        n(options);
        int i19 = options.inSampleSize;
        Thread.currentThread().getName();
        ve.g.a(j15);
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i15, int i16, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i15 + ", outHeight: " + i16 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f91929n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d15) {
        return (int) (d15 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, ce.d dVar, int i15, int i16) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = dVar.e(i15, i16, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public be.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i15, int i16, zd.h hVar) {
        return e(new u.c(parcelFileDescriptor, this.f91933d, this.f91932c), i15, i16, hVar, f91927l);
    }

    public be.v<Bitmap> f(InputStream inputStream, int i15, int i16, zd.h hVar, b bVar) {
        return e(new u.b(inputStream, this.f91933d, this.f91932c), i15, i16, hVar, bVar);
    }

    public be.v<Bitmap> g(ByteBuffer byteBuffer, int i15, int i16, zd.h hVar) {
        return e(new u.a(byteBuffer, this.f91933d, this.f91932c), i15, i16, hVar, f91927l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
