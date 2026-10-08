package y;

import android.os.Build;
import android.util.Pair;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.e1;
import v.b0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f222464c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j[] f222465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j[] f222466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j[] f222467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final j[] f222468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j[] f222469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final j[][] f222470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashSet<String> f222471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f222472k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Map<String, g>> f222473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteOrder f222474b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f222475a;

        static {
            int[] iArr = new int[b0.values().length];
            f222475a = iArr;
            try {
                iArr[b0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f222475a[b0.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f222475a[b0.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f222476c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f222477d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f222478e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final List<HashMap<String, j>> f222479f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Map<String, g>> f222480a = Collections.list(new C5951b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteOrder f222481b;

        class a implements Enumeration<HashMap<String, j>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f222482a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, j> nextElement() {
                HashMap<String, j> map = new HashMap<>();
                for (j jVar : h.f222470i[this.f222482a]) {
                    map.put(jVar.f222498b, jVar);
                }
                this.f222482a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f222482a < h.f222470i.length;
            }
        }

        /* JADX INFO: renamed from: y.h$b$b, reason: collision with other inner class name */
        class C5951b implements Enumeration<Map<String, g>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f222483a = 0;

            C5951b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, g> nextElement() {
                this.f222483a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f222483a < h.f222470i.length;
            }
        }

        class c implements Enumeration<Map<String, g>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Enumeration<Map<String, g>> f222485a;

            c() {
                this.f222485a = Collections.enumeration(b.this.f222480a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, g> nextElement() {
                return new HashMap(this.f222485a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f222485a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f222481b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i15 = 1; i15 < strArrSplit.length; i15++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i15]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j15 = Long.parseLong(str);
                        if (j15 < 0 || j15 > 65535) {
                            return j15 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j16 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j17 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j16 >= 0 && j17 >= 0) {
                        if (j16 <= 2147483647L && j17 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        private void d(String str, String str2, List<Map<String, g>> list) {
            Iterator<Map<String, g>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        private void e(String str, String str2, List<Map<String, g>> list) {
            int i15;
            int i16;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f222477d.matcher(strReplaceAll).find();
                boolean zFind2 = f222478e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    e1.o("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i17 = 2;
            int i18 = 1;
            if (strReplaceAll != null && h.f222471j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f222476c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        e1.o("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) i6.i.g(matcher.group(1))) + "/1," + Integer.parseInt((String) i6.i.g(matcher.group(2))) + "/1," + Integer.parseInt((String) i6.i.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new m(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e15) {
                        e1.p("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e15);
                        return;
                    }
                }
            }
            int i19 = 0;
            while (i19 < h.f222470i.length) {
                j jVar = f222479f.get(i19).get(str4);
                if (jVar == null) {
                    i15 = i18;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairB = b(strReplaceAll);
                        int i25 = -1;
                        if (jVar.f222499c == ((Integer) pairB.first).intValue() || jVar.f222499c == ((Integer) pairB.second).intValue()) {
                            i16 = jVar.f222499c;
                        } else {
                            int i26 = jVar.f222500d;
                            if (i26 == -1 || !(i26 == ((Integer) pairB.first).intValue() || jVar.f222500d == ((Integer) pairB.second).intValue())) {
                                i16 = jVar.f222499c;
                                if (i16 == i18 || i16 == 7 || i16 == i17) {
                                }
                            } else {
                                i16 = jVar.f222500d;
                            }
                        }
                        String str5 = "/";
                        switch (i16) {
                            case 1:
                                i15 = i18;
                                list.get(i19).put(str4, g.a(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i15 = i18;
                                list.get(i19).put(str4, g.e(strReplaceAll));
                                continue;
                            case 3:
                                i15 = i18;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i27 = 0; i27 < strArrSplit.length; i27++) {
                                    iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                }
                                list.get(i19).put(str4, g.i(iArr, bVar.f222481b));
                                continue;
                            case 4:
                                i15 = i18;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i28 = 0; i28 < strArrSplit2.length; i28++) {
                                    jArr[i28] = Long.parseLong(strArrSplit2[i28]);
                                }
                                list.get(i19).put(str4, g.g(jArr, bVar.f222481b));
                                continue;
                            case 5:
                                i15 = i18;
                                int i29 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                m[] mVarArr = new m[strArrSplit3.length];
                                int i35 = 0;
                                while (i35 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i35].split("/", i29);
                                    mVarArr[i35] = new m((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i15]));
                                    i35++;
                                    i29 = -1;
                                }
                                bVar = this;
                                list.get(i19).put(str4, g.h(mVarArr, bVar.f222481b));
                                continue;
                            case 9:
                                i15 = i18;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i36 = 0; i36 < strArrSplit5.length; i36++) {
                                    iArr2[i36] = Integer.parseInt(strArrSplit5[i36]);
                                }
                                list.get(i19).put(str4, g.c(iArr2, bVar.f222481b));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                m[] mVarArr2 = new m[strArrSplit6.length];
                                int i37 = 0;
                                while (i37 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i37].split(str5, i25);
                                    int i38 = i18;
                                    mVarArr2[i37] = new m((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i38]));
                                    i37++;
                                    i18 = i38;
                                    str5 = str5;
                                    i25 = -1;
                                }
                                i15 = i18;
                                list.get(i19).put(str4, g.d(mVarArr2, bVar.f222481b));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i39 = 0; i39 < strArrSplit8.length; i39++) {
                                    dArr[i39] = Double.parseDouble(strArrSplit8[i39]);
                                }
                                list.get(i19).put(str4, g.b(dArr, bVar.f222481b));
                                break;
                        }
                    } else {
                        list.get(i19).remove(str4);
                    }
                    i15 = i18;
                }
                i19++;
                i18 = i15;
                i17 = 2;
            }
        }

        public h a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", h.f222472k, list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f222481b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f222480a);
            return this;
        }

        public b f(long j15) {
            return c("ExposureTime", String.valueOf(j15 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(b0 b0Var) {
            int i15;
            if (b0Var == b0.UNKNOWN) {
                return this;
            }
            int i16 = a.f222475a[b0Var.ordinal()];
            if (i16 == 1) {
                i15 = 0;
            } else if (i16 == 2) {
                i15 = 32;
            } else {
                if (i16 != 3) {
                    e1.o("ExifData", "Unknown flash state: " + b0Var);
                    return this;
                }
                i15 = 1;
            }
            if ((i15 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i15));
        }

        public b h(float f15) {
            return c("FocalLength", new m((long) (f15 * 1000.0f), 1000L).toString());
        }

        public b i(int i15) {
            return c("ImageLength", String.valueOf(i15));
        }

        public b j(int i15) {
            return c("ImageWidth", String.valueOf(i15));
        }

        public b k(int i15) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i15)));
        }

        public b l(float f15) {
            return c("FNumber", String.valueOf(f15));
        }

        public b m(int i15) {
            int i16;
            if (i15 == 0) {
                i16 = 1;
            } else if (i15 == 90) {
                i16 = 6;
            } else if (i15 == 180) {
                i16 = 3;
            } else if (i15 != 270) {
                e1.o("ExifData", "Unexpected orientation value: " + i15 + ". Must be one of 0, 90, 180, 270.");
                i16 = 0;
            } else {
                i16 = 8;
            }
            return c("Orientation", String.valueOf(i16));
        }

        public b n(c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f222465d = jVarArr;
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j("DateTimeOriginal", 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j("FlashpixVersion", 40960, 7), new j("ColorSpace", 40961, 3), new j("PixelXDimension", 40962, 3, 4), new j("PixelYDimension", 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j("ExposureMode", 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        f222466e = jVarArr2;
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f222467f = jVarArr3;
        f222468g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j("InteroperabilityIndex", 1, 2)};
        f222469h = jVarArr4;
        f222470i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f222471j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f222472k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    h(ByteOrder byteOrder, List<Map<String, g>> list) {
        i6.i.j(list.size() == f222470i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f222474b = byteOrder;
        this.f222473a = list;
    }

    public static b b() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static h c(androidx.camera.core.o oVar, int i15) {
        b bVarB = b();
        if (oVar.v3() != null) {
            oVar.v3().a(bVarB);
        }
        bVarB.m(i15);
        return bVarB.j(oVar.l()).i(oVar.getHeight()).a();
    }

    Map<String, g> d(int i15) {
        i6.i.c(i15, 0, f222470i.length, "Invalid IFD index: " + i15 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f222473a.get(i15);
    }

    public ByteOrder e() {
        return this.f222474b;
    }
}
