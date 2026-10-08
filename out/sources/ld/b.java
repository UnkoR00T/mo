package ld;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import fd.c;
import fd.d0;
import java.io.IOException;
import java.util.Map;
import td.e;
import td.m;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f117824d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f117825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f117826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, d0> f117827c;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, d0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f117826b = str;
        } else {
            this.f117826b = str + '/';
        }
        this.f117827c = map;
        d(cVar);
        if (callback instanceof View) {
            this.f117825a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f117825a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f117824d) {
            this.f117827c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        d0 d0Var = this.f117827c.get(str);
        if (d0Var == null) {
            return null;
        }
        Bitmap bitmapB = d0Var.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f117825a;
        if (context == null) {
            return null;
        }
        String strC = d0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, m.l(bitmapDecodeByteArray, d0Var.f(), d0Var.d()));
                    }
                    e.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e15) {
                    e.d("Unable to decode image `" + str + "`.", e15);
                    return null;
                }
            } catch (IllegalArgumentException e16) {
                e.d("data URL did not have correct base64 format.", e16);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f117826b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f117826b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, m.l(bitmapDecodeStream, d0Var.f(), d0Var.d()));
                }
                e.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e17) {
                e.d("Unable to decode image `" + str + "`.", e17);
                return null;
            }
        } catch (IOException e18) {
            e.d("Unable to open asset.", e18);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f117825a == null;
        }
        if (this.f117825a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f117825a;
    }

    public void d(c cVar) {
    }
}
