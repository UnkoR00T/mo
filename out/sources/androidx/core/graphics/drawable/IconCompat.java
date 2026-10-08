package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.sentry.android.core.c2;
import io.sentry.instrumentation.file.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f11832k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f11834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f11835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f11836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f11839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f11840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11842j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e15) {
                c2.f("IconCompat", "Unable to get icon resource", e15);
                return 0;
            } catch (NoSuchMethodException e16) {
                c2.f("IconCompat", "Unable to get icon resource", e16);
                return 0;
            } catch (InvocationTargetException e17) {
                c2.f("IconCompat", "Unable to get icon resource", e17);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e15) {
                c2.f("IconCompat", "Unable to get icon package", e15);
                return null;
            } catch (NoSuchMethodException e16) {
                c2.f("IconCompat", "Unable to get icon package", e16);
                return null;
            } catch (InvocationTargetException e17) {
                c2.f("IconCompat", "Unable to get icon package", e17);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e15) {
                c2.f("IconCompat", "Unable to get icon type " + obj, e15);
                return -1;
            } catch (NoSuchMethodException e16) {
                c2.f("IconCompat", "Unable to get icon type " + obj, e16);
                return -1;
            } catch (InvocationTargetException e17) {
                c2.f("IconCompat", "Unable to get icon type " + obj, e17);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e15) {
                c2.f("IconCompat", "Unable to get icon uri", e15);
                return null;
            } catch (NoSuchMethodException e16) {
                c2.f("IconCompat", "Unable to get icon uri", e16);
                return null;
            } catch (InvocationTargetException e17) {
                c2.f("IconCompat", "Unable to get icon uri", e17);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f11833a) {
                case -1:
                    return (Icon) iconCompat.f11834b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f11834b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f11837e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f11834b, iconCompat.f11837e, iconCompat.f11838f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f11834b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f11834b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f11839g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f11840h;
            if (mode != IconCompat.f11832k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f11833a = -1;
        this.f11835c = null;
        this.f11836d = null;
        this.f11837e = 0;
        this.f11838f = 0;
        this.f11839g = null;
        this.f11840h = f11832k;
        this.f11841i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z15) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f15 = iMin;
        float f16 = 0.5f * f15;
        float f17 = 0.9166667f * f16;
        if (z15) {
            float f18 = 0.010416667f * f15;
            paint.setColor(0);
            paint.setShadowLayer(f18, 0.0f, f15 * 0.020833334f, 1023410176);
            canvas.drawCircle(f16, f16, f17, paint);
            paint.setShadowLayer(f18, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f16, f16, f17, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f16, f16, f17, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        i6.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f11834b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Context context, int i15) {
        i6.c.c(context);
        return d(context.getResources(), context.getPackageName(), i15);
    }

    public static IconCompat d(Resources resources, String str, int i15) {
        i6.c.c(str);
        if (i15 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f11837e = i15;
        if (resources != null) {
            try {
                iconCompat.f11834b = resources.getResourceName(i15);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f11834b = str;
        }
        iconCompat.f11842j = str;
        return iconCompat;
    }

    private static String p(int i15) {
        switch (i15) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i15 = this.f11833a;
        if (i15 == -1) {
            Object obj = this.f11834b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i15 == 1) {
            return (Bitmap) this.f11834b;
        }
        if (i15 == 5) {
            return a((Bitmap) this.f11834b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i15 = this.f11833a;
        if (i15 == -1) {
            return a.a(this.f11834b);
        }
        if (i15 == 2) {
            return this.f11837e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i15 = this.f11833a;
        if (i15 == -1) {
            return a.b(this.f11834b);
        }
        if (i15 == 2) {
            String str = this.f11842j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f11834b).split(":", -1)[0] : this.f11842j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i15 = this.f11833a;
        return i15 == -1 ? a.c(this.f11834b) : i15;
    }

    public Uri i() {
        int i15 = this.f11833a;
        if (i15 == -1) {
            return a.d(this.f11834b);
        }
        if (i15 == 4 || i15 == 6) {
            return Uri.parse((String) this.f11834b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e15) {
                c2.h("IconCompat", "Unable to load image from URI: " + uriI, e15);
                return null;
            }
        }
        try {
            File file = new File((String) this.f11834b);
            return h.b.a(new FileInputStream(file), file);
        } catch (FileNotFoundException e16) {
            c2.h("IconCompat", "Unable to load image from path: " + uriI, e16);
            return null;
        }
    }

    public void k() {
        this.f11840h = PorterDuff.Mode.valueOf(this.f11841i);
        switch (this.f11833a) {
            case -1:
                Parcelable parcelable = this.f11836d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f11834b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f11836d;
                if (parcelable2 != null) {
                    this.f11834b = parcelable2;
                    return;
                }
                byte[] bArr = this.f11835c;
                this.f11834b = bArr;
                this.f11833a = 3;
                this.f11837e = 0;
                this.f11838f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f11835c, Charset.forName("UTF-16"));
                this.f11834b = str;
                if (this.f11833a == 2 && this.f11842j == null) {
                    this.f11842j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f11834b = this.f11835c;
                return;
        }
    }

    public void l(boolean z15) {
        this.f11841i = this.f11840h.name();
        switch (this.f11833a) {
            case -1:
                if (z15) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f11836d = (Parcelable) this.f11834b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z15) {
                    this.f11836d = (Parcelable) this.f11834b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f11834b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f11835c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f11835c = ((String) this.f11834b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f11835c = (byte[]) this.f11834b;
                return;
            case 4:
            case 6:
                this.f11835c = this.f11834b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f11833a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f11834b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f11834b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f11834b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f11834b);
                break;
        }
        bundle.putInt("type", this.f11833a);
        bundle.putInt("int1", this.f11837e);
        bundle.putInt("int2", this.f11838f);
        bundle.putString("string1", this.f11842j);
        ColorStateList colorStateList = this.f11839g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f11840h;
        if (mode != f11832k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f11833a == -1) {
            return String.valueOf(this.f11834b);
        }
        StringBuilder sb5 = new StringBuilder("Icon(typ=");
        sb5.append(p(this.f11833a));
        switch (this.f11833a) {
            case 1:
            case 5:
                sb5.append(" size=");
                sb5.append(((Bitmap) this.f11834b).getWidth());
                sb5.append("x");
                sb5.append(((Bitmap) this.f11834b).getHeight());
                break;
            case 2:
                sb5.append(" pkg=");
                sb5.append(this.f11842j);
                sb5.append(" id=");
                sb5.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb5.append(" len=");
                sb5.append(this.f11837e);
                if (this.f11838f != 0) {
                    sb5.append(" off=");
                    sb5.append(this.f11838f);
                }
                break;
            case 4:
            case 6:
                sb5.append(" uri=");
                sb5.append(this.f11834b);
                break;
        }
        if (this.f11839g != null) {
            sb5.append(" tint=");
            sb5.append(this.f11839g);
        }
        if (this.f11840h != f11832k) {
            sb5.append(" mode=");
            sb5.append(this.f11840h);
        }
        sb5.append(")");
        return sb5.toString();
    }

    IconCompat(int i15) {
        this.f11835c = null;
        this.f11836d = null;
        this.f11837e = 0;
        this.f11838f = 0;
        this.f11839g = null;
        this.f11840h = f11832k;
        this.f11841i = null;
        this.f11833a = i15;
    }
}
