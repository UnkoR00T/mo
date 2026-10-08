package h;

import android.graphics.ColorSpace;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Lh/k;", "", "", "colorSpaceName", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/graphics/ColorSpace$Named;", "d", "(Ljava/lang/String;)Landroid/graphics/ColorSpace$Named;", "e", "", "c", "(Ljava/lang/String;)I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f78939b = a("UNKNOWN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f78940c = a("SRGB");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f78941d = a("LINEAR_SRGB");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f78942e = a("EXTENDED_SRGB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f78943f = a("LINEAR_EXTENDED_SRGB");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f78944g = a("BT709");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f78945h = a("BT2020");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f78946i = a("DCI_P3");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f78947j = a("DISPLAY_P3");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f78948k = a("NTSC_1953");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f78949l = a("SMPTE_C");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f78950m = a("ADOBE_RGB");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f78951n = a("PRO_PHOTO_RGB");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f78952o = a("ACES");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f78953p = a("ACESCG");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f78954q = a("CIE_XYZ");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f78955r = a("CIE_LAB");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f78956s = a("BT2020_HLG");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f78957t = a("BT2020_PQ");

    private static String a(String str) {
        return str;
    }

    public static final boolean b(String str, String str2) {
        return fr.t.c(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static final ColorSpace.Named d(String str) {
        if (b(str, f78939b)) {
            return null;
        }
        if (b(str, f78940c)) {
            return ColorSpace.Named.SRGB;
        }
        if (b(str, f78941d)) {
            return ColorSpace.Named.LINEAR_SRGB;
        }
        if (b(str, f78942e)) {
            return ColorSpace.Named.EXTENDED_SRGB;
        }
        if (b(str, f78943f)) {
            return ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        }
        if (b(str, f78944g)) {
            return ColorSpace.Named.BT709;
        }
        if (b(str, f78945h)) {
            return ColorSpace.Named.BT2020;
        }
        if (b(str, f78946i)) {
            return ColorSpace.Named.DCI_P3;
        }
        if (b(str, f78947j)) {
            return ColorSpace.Named.DISPLAY_P3;
        }
        if (b(str, f78948k)) {
            return ColorSpace.Named.NTSC_1953;
        }
        if (b(str, f78949l)) {
            return ColorSpace.Named.SMPTE_C;
        }
        if (b(str, f78950m)) {
            return ColorSpace.Named.ADOBE_RGB;
        }
        if (b(str, f78951n)) {
            return ColorSpace.Named.PRO_PHOTO_RGB;
        }
        if (b(str, f78952o)) {
            return ColorSpace.Named.ACES;
        }
        if (b(str, f78953p)) {
            return ColorSpace.Named.ACESCG;
        }
        if (b(str, f78954q)) {
            return ColorSpace.Named.CIE_XYZ;
        }
        if (b(str, f78955r)) {
            return ColorSpace.Named.CIE_LAB;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (b(str, f78956s)) {
            return ColorSpace.Named.BT2020_HLG;
        }
        if (b(str, f78957t)) {
            return ColorSpace.Named.BT2020_PQ;
        }
        return null;
    }

    public static String e(String str) {
        return "CameraColorSpace(colorSpaceName=" + str + ')';
    }
}
