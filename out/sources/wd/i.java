package wd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import vd.p;
import vd.v;

/* JADX INFO: loaded from: classes3.dex */
public class i extends vd.n<Bitmap> {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Object f212209z = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f212210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p.b<Bitmap> f212211t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Bitmap.Config f212212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f212213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f212214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageView.ScaleType f212215y;

    public i(String str, p.b<Bitmap> bVar, int i15, int i16, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar) {
        super(0, str, aVar);
        this.f212210s = new Object();
        X(new vd.e(1000, 2, 2.0f));
        this.f212211t = bVar;
        this.f212212v = config;
        this.f212213w = i15;
        this.f212214x = i16;
        this.f212215y = scaleType;
    }

    private p<Bitmap> f0(vd.k kVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = kVar.f206177b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f212213w == 0 && this.f212214x == 0) {
            options.inPreferredConfig = this.f212212v;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i15 = options.outWidth;
            int i16 = options.outHeight;
            int iH0 = h0(this.f212213w, this.f212214x, i15, i16, this.f212215y);
            int iH1 = h0(this.f212214x, this.f212213w, i16, i15, this.f212215y);
            options.inJustDecodeBounds = false;
            options.inSampleSize = g0(i15, i16, iH0, iH1);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iH0 || bitmapDecodeByteArray.getHeight() > iH1)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iH0, iH1, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? p.a(new vd.m(kVar)) : p.c(bitmapDecodeByteArray, e.e(kVar));
    }

    static int g0(int i15, int i16, int i17, int i18) {
        double dMin = Math.min(((double) i15) / ((double) i17), ((double) i16) / ((double) i18));
        float f15 = 1.0f;
        while (true) {
            float f16 = 2.0f * f15;
            if (f16 > dMin) {
                return (int) f15;
            }
            f15 = f16;
        }
    }

    private static int h0(int i15, int i16, int i17, int i18, ImageView.ScaleType scaleType) {
        if (i15 != 0 || i16 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i15 == 0) {
                    return (int) (((double) i17) * (((double) i16) / ((double) i18)));
                }
                if (i16 == 0) {
                    return i15;
                }
                double d15 = ((double) i18) / ((double) i17);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d16 = i16;
                    return ((double) i15) * d15 < d16 ? (int) (d16 / d15) : i15;
                }
                double d17 = i16;
                return ((double) i15) * d15 > d17 ? (int) (d17 / d15) : i15;
            }
            if (i15 != 0) {
                return i15;
            }
        }
        return i17;
    }

    @Override // vd.n
    public vd.n.c D() {
        return vd.n.c.LOW;
    }

    @Override // vd.n
    protected p<Bitmap> R(vd.k kVar) {
        p<Bitmap> pVarF0;
        synchronized (f212209z) {
            try {
                try {
                    pVarF0 = f0(kVar);
                } catch (OutOfMemoryError e15) {
                    v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f206177b.length), I());
                    return p.a(new vd.m(e15));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return pVarF0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vd.n
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        p.b<Bitmap> bVar;
        synchronized (this.f212210s) {
            bVar = this.f212211t;
        }
        if (bVar != null) {
            bVar.a(bitmap);
        }
    }

    @Override // vd.n
    public void g() {
        super.g();
        synchronized (this.f212210s) {
            this.f212211t = null;
        }
    }
}
