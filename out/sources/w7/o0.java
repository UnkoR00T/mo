package w7;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f210724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f210725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f210726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final String f210727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f210728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f210729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f210730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f210731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f210732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f210733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f210734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static HashMap<String, String> f210735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f210736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f210737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f210738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f210739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f210740q;

    static {
        int i15 = Build.VERSION.SDK_INT;
        f210724a = i15;
        String str = Build.DEVICE;
        f210725b = str;
        String str2 = Build.MANUFACTURER;
        f210726c = str2;
        String str3 = Build.MODEL;
        f210727d = str3;
        f210728e = str + ", " + str3 + ", " + str2 + ", " + i15;
        f210729f = new byte[0];
        f210730g = new long[0];
        f210731h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        f210732i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f210733j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f210734k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f210736m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f210737n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f210738o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f210739p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f210740q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, BERTags.FLAGS, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, GF2Field.MASK, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, CertificateBody.profileType, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Handler A(Handler.Callback callback) {
        return y((Looper) zj.p.q(Looper.myLooper()), callback);
    }

    public static boolean A0(int i15) {
        return i15 == 10 || i15 == 13;
    }

    public static Handler B() {
        return C(null);
    }

    public static boolean B0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    public static Handler C(Handler.Callback callback) {
        return y(T(), callback);
    }

    public static boolean C0() {
        String strF = zj.c.f(Build.DEVICE);
        return strF.contains("emulator") || strF.contains("emu64a") || strF.contains("emu64x") || strF.contains("generic");
    }

    private static HashMap<String, String> D() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f210736m.length);
        int i15 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f210736m;
            if (i15 >= strArr.length) {
                return map;
            }
            map.put(strArr[i15], strArr[i15 + 1]);
            i15 += 2;
        }
    }

    public static boolean D0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long E(long j15, int i15) {
        return W0(j15, i15, 1000000L, RoundingMode.UP);
    }

    public static boolean E0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String F(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int F0(int[] iArr, int i15) {
        for (int i16 = 0; i16 < iArr.length; i16++) {
            if (iArr[i16] == i15) {
                return i16;
            }
        }
        return -1;
    }

    public static String G(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static boolean G0(c0 c0Var, c0 c0Var2, Inflater inflater) {
        return c0Var.a() > 0 && c0Var.q() == 120 && t0(c0Var, c0Var2, inflater);
    }

    public static String H(byte[] bArr, int i15, int i16) {
        return new String(bArr, i15, i16, StandardCharsets.UTF_8);
    }

    private static String H0(String str) {
        int i15 = 0;
        while (true) {
            String[] strArr = f210737n;
            if (i15 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i15])) {
                return strArr[i15 + 1] + str.substring(strArr[i15].length());
            }
            i15 += 2;
        }
    }

    public static int I(Context context) {
        int iGenerateAudioSessionId = u7.j.c(context).generateAudioSessionId();
        if (iGenerateAudioSessionId != -1) {
            return iGenerateAudioSessionId;
        }
        return 0;
    }

    public static <T> void I0(List<T> list, int i15, int i16, int i17) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i18 = (i16 - i15) - 1; i18 >= 0; i18--) {
            arrayDeque.addFirst(list.remove(i15 + i18));
        }
        list.addAll(Math.min(i17, list.size()), arrayDeque);
    }

    public static int J(int i15) {
        switch (i15) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case BERTags.DATE /* 31 */:
                return 34;
        }
    }

    public static long J0(long j15) {
        return (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? j15 : j15 * 1000;
    }

    public static AudioFormat K(int i15, int i16, int i17) {
        return new AudioFormat.Builder().setSampleRate(i15).setChannelMask(i16).setEncoding(i17).build();
    }

    public static ExecutorService K0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: w7.m0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return o0.b(str, runnable);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    public static int L(int i15) {
        if (i15 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i15 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i15 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i15) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i15) {
                    case 12:
                        return 743676;
                    case 13:
                        return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static ScheduledExecutorService L0(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: w7.n0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return o0.a(str, runnable);
            }
        });
    }

    public static String M(int i15) {
        if (i15 == 0) {
            return "undefined";
        }
        if (i15 == 1) {
            return "original";
        }
        if (i15 == 2) {
            return "depth-linear";
        }
        if (i15 == 3) {
            return "depth-inverse";
        }
        if (i15 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static String M0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strF = zj.c.f(str);
        String str2 = a1(strF, "-")[0];
        if (f210735l == null) {
            f210735l = D();
        }
        String str3 = f210735l.get(str2);
        if (str3 != null) {
            strF = str3 + strF.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? H0(strF) : strF;
    }

    public static t7.a0.b N(t7.a0 a0Var, t7.a0.b bVar) {
        boolean zC = a0Var.c();
        boolean zA = a0Var.A();
        boolean zW = a0Var.w();
        boolean zN = a0Var.n();
        boolean zH = a0Var.H();
        boolean zP = a0Var.p();
        boolean zQ = a0Var.r().q();
        boolean z15 = false;
        t7.a0.b.a aVarD = new t7.a0.b.a().b(bVar).d(4, !zC).d(5, zA && !zC).d(6, zW && !zC).d(7, !zQ && (zW || !zH || zA) && !zC).d(8, zN && !zC).d(9, !zQ && (zN || (zH && zP)) && !zC).d(10, !zC).d(11, zA && !zC);
        if (zA && !zC) {
            z15 = true;
        }
        return aVarD.d(12, z15).e();
    }

    public static <T> T[] N0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static int O(ByteBuffer byteBuffer, int i15) {
        int i16 = byteBuffer.getInt(i15);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i16 : Integer.reverseBytes(i16);
    }

    public static <T> T[] O0(T[] tArr, int i15) {
        zj.p.d(i15 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i15);
    }

    public static int P(int i15) {
        if (i15 != 2) {
            if (i15 == 3) {
                return 1;
            }
            if (i15 != 4) {
                if (i15 != 21) {
                    if (i15 != 22) {
                        if (i15 != 268435456) {
                            if (i15 != 1342177280) {
                                if (i15 != 1610612736) {
                                    if (i15 == 1879048192) {
                                        return 8;
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static <T> T[] P0(T[] tArr, int i15, int i16) {
        zj.p.d(i15 >= 0);
        zj.p.d(i16 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i15, i16);
    }

    public static String Q(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return zj.c.g(networkCountryIso);
            }
        }
        return zj.c.g(Locale.getDefault().getCountry());
    }

    public static <T> void Q0(List<T> list, T[] tArr) {
        zj.p.w(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static Point R(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) zj.p.q((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return S(context, display);
    }

    public static boolean R0(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Point S(Context context, Display display) {
        if (display.getDisplayId() == 0 && D0(context)) {
            String strN0 = Build.VERSION.SDK_INT < 28 ? n0("sys.display-size") : n0("vendor.display-size");
            if (!TextUtils.isEmpty(strN0)) {
                try {
                    String[] strArrZ0 = Z0(strN0.trim(), "x");
                    if (strArrZ0.length == 2) {
                        int i15 = Integer.parseInt(strArrZ0[0]);
                        int i16 = Integer.parseInt(strArrZ0[1]);
                        if (i15 > 0 && i16 > 0) {
                            return new Point(i15, i16);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                t.c("Util", "Invalid display size: " + strN0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        U(display, point);
        return point;
    }

    public static void S0(ByteBuffer byteBuffer, int i15) {
        zj.p.l(((-16777216) & i15) == 0 || (i15 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i15));
        zj.p.d(byteBuffer.remaining() >= 3);
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (byteOrderOrder == byteOrder ? (i15 & 16711680) >> 16 : i15 & GF2Field.MASK)).put((byte) ((65280 & i15) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i15 & GF2Field.MASK : (i15 & 16711680) >> 16));
    }

    public static Looper T() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static long T0(long j15, int i15) {
        return W0(j15, 1000000L, i15, RoundingMode.DOWN);
    }

    private static void U(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long U0(long j15, long j16, long j17) {
        return W0(j15, j16, j17, RoundingMode.DOWN);
    }

    public static int V(int i15) {
        if (i15 == 2 || i15 == 4) {
            return 6005;
        }
        if (i15 == 10) {
            return 6004;
        }
        if (i15 == 7) {
            return 6005;
        }
        if (i15 == 8) {
            return 6003;
        }
        switch (i15) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i15) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static void V0(long[] jArr, long j15, long j16) {
        Y0(jArr, j15, j16, RoundingMode.DOWN);
    }

    public static int W(String str) {
        String[] strArrZ0;
        int length;
        int i15 = 0;
        if (str == null || (length = (strArrZ0 = Z0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrZ0[length - 1];
        boolean z15 = length >= 3 && "neg".equals(strArrZ0[length - 2]);
        try {
            i15 = Integer.parseInt((String) zj.p.q(str2));
            if (z15) {
                return -i15;
            }
        } catch (NumberFormatException unused) {
        }
        return i15;
    }

    public static long W0(long j15, long j16, long j17, RoundingMode roundingMode) {
        if (j15 == 0 || j16 == 0) {
            return 0L;
        }
        if (j17 >= j16 && j17 % j16 == 0) {
            return ck.d.b(j15, ck.d.b(j17, j16, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j17 < j16 && j16 % j17 == 0) {
            return ck.d.e(j15, ck.d.b(j16, j17, RoundingMode.UNNECESSARY));
        }
        if (j17 < j15 || j17 % j15 != 0) {
            return (j17 >= j15 || j15 % j17 != 0) ? X0(j15, j16, j17, roundingMode) : ck.d.e(j16, ck.d.b(j15, j17, RoundingMode.UNNECESSARY));
        }
        return ck.d.b(j16, ck.d.b(j17, j15, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static String X(int i15) {
        if (i15 == 0) {
            return "NO";
        }
        if (i15 == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i15 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i15 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i15 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static long X0(long j15, long j16, long j17, RoundingMode roundingMode) {
        long jE = ck.d.e(j15, j16);
        if (jE != Long.MAX_VALUE && jE != Long.MIN_VALUE) {
            return ck.d.b(jE, j17, roundingMode);
        }
        long jC = ck.d.c(Math.abs(j16), Math.abs(j17));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = ck.d.b(j16, jC, roundingMode2);
        long jB2 = ck.d.b(j17, jC, roundingMode2);
        long jC2 = ck.d.c(Math.abs(j15), Math.abs(jB2));
        long jB3 = ck.d.b(j15, jC2, roundingMode2);
        long jB4 = ck.d.b(jB2, jC2, roundingMode2);
        long jE2 = ck.d.e(jB3, jB);
        if (jE2 != Long.MAX_VALUE && jE2 != Long.MIN_VALUE) {
            return ck.d.b(jE2, jB4, roundingMode);
        }
        double d15 = jB3 * (jB / jB4);
        if (d15 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d15 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return ck.a.f(d15, roundingMode);
    }

    public static int Y(ByteBuffer byteBuffer, int i15) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte b15 = byteBuffer.get(byteOrderOrder == byteOrder ? i15 : i15 + 2);
        byte b16 = byteBuffer.get(i15 + 1);
        if (byteBuffer.order() == byteOrder) {
            i15 += 2;
        }
        return (((byteBuffer.get(i15) << 8) & 65280) | (((b15 << 24) & (-16777216)) | ((b16 << 16) & 16711680))) >> 8;
    }

    public static void Y0(long[] jArr, long j15, long j16, RoundingMode roundingMode) {
        if (j15 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i15 = 0;
        if (j16 >= j15 && j16 % j15 == 0) {
            long jB = ck.d.b(j16, j15, RoundingMode.UNNECESSARY);
            while (i15 < jArr.length) {
                jArr[i15] = ck.d.b(jArr[i15], jB, roundingMode);
                i15++;
            }
            return;
        }
        if (j16 < j15 && j15 % j16 == 0) {
            long jB2 = ck.d.b(j15, j16, RoundingMode.UNNECESSARY);
            while (i15 < jArr.length) {
                jArr[i15] = ck.d.e(jArr[i15], jB2);
                i15++;
            }
            return;
        }
        for (int i16 = 0; i16 < jArr.length; i16++) {
            long j17 = jArr[i16];
            if (j17 != 0) {
                if (j16 >= j17 && j16 % j17 == 0) {
                    jArr[i16] = ck.d.b(j15, ck.d.b(j16, j17, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j16 >= j17 || j17 % j16 != 0) {
                    jArr[i16] = X0(j17, j15, j16, roundingMode);
                } else {
                    jArr[i16] = ck.d.e(j15, ck.d.b(j17, j16, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static String Z(Locale locale) {
        return locale.toLanguageTag();
    }

    public static String[] Z0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int a0(Context context) {
        return z0(context) ? 1 : 5;
    }

    public static String[] a1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static /* synthetic */ Thread b(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static long b0(long j15, float f15) {
        return f15 == 1.0f ? j15 : Math.round(j15 * ((double) f15));
    }

    public static long b1(long j15, long j16, long j17) {
        long jF = ck.d.f(j15, j16);
        return ((jF != Long.MIN_VALUE || j15 - j16 == Long.MIN_VALUE) && (jF != Long.MAX_VALUE || j15 - j16 == Long.MAX_VALUE)) ? jF : j17;
    }

    public static long c(long j15, long j16, long j17) {
        long jD = ck.d.d(j15, j16);
        return ((jD != Long.MIN_VALUE || j15 + j16 == Long.MIN_VALUE) && (jD != Long.MAX_VALUE || j15 + j16 == Long.MAX_VALUE)) ? jD : j17;
    }

    public static long c0(long j15) {
        return j15 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j15;
    }

    public static String c1(int i15) {
        return new String(ek.g.o(i15), StandardCharsets.US_ASCII);
    }

    public static int d(long[] jArr, long j15, boolean z15, boolean z16) {
        int i15;
        int i16;
        int iBinarySearch = Arrays.binarySearch(jArr, j15);
        if (iBinarySearch < 0) {
            i16 = ~iBinarySearch;
        } else {
            while (true) {
                i15 = iBinarySearch + 1;
                if (i15 >= jArr.length || jArr[i15] != j15) {
                    break;
                }
                iBinarySearch = i15;
            }
            i16 = z15 ? iBinarySearch : i15;
        }
        return z16 ? Math.min(jArr.length - 1, i16) : i16;
    }

    public static int d0(int i15) {
        return e0(i15, ByteOrder.LITTLE_ENDIAN);
    }

    public static String d1(byte[] bArr) {
        return bk.a.a().j().f(bArr);
    }

    public static int e(u uVar, long j15, boolean z15, boolean z16) {
        int i15;
        int iD = uVar.d() - 1;
        int i16 = 0;
        while (i16 <= iD) {
            int i17 = (i16 + iD) >>> 1;
            if (uVar.c(i17) < j15) {
                i16 = i17 + 1;
            } else {
                iD = i17 - 1;
            }
        }
        if (z15 && (i15 = iD + 1) < uVar.d() && uVar.c(i15) == j15) {
            return i15;
        }
        if (z16 && iD == -1) {
            return 0;
        }
        return iD;
    }

    public static int e0(int i15, ByteOrder byteOrder) {
        if (i15 == 8) {
            return 3;
        }
        if (i15 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i15 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i15 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long e1(int i15, int i16) {
        return f1(i16) | (f1(i15) << 32);
    }

    public static int f(int[] iArr, int i15, boolean z15, boolean z16) {
        int i16;
        int i17;
        int iBinarySearch = Arrays.binarySearch(iArr, i15);
        if (iBinarySearch < 0) {
            i17 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i16 = iBinarySearch - 1;
                if (i16 < 0 || iArr[i16] != i15) {
                    break;
                }
                iBinarySearch = i16;
            }
            i17 = z15 ? iBinarySearch : i16;
        }
        return z16 ? Math.max(0, i17) : i17;
    }

    public static t7.p f0(int i15, int i16, int i17) {
        return new t7.p.b().A0("audio/raw").U(i16).B0(i17).t0(i15).Q();
    }

    public static long f1(int i15) {
        return ((long) i15) & BodyPartID.bodyIdMax;
    }

    public static int g(long[] jArr, long j15, boolean z15, boolean z16) {
        int i15;
        int i16;
        int iBinarySearch = Arrays.binarySearch(jArr, j15);
        if (iBinarySearch < 0) {
            i16 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i15 = iBinarySearch - 1;
                if (i15 < 0 || jArr[i15] != j15) {
                    break;
                }
                iBinarySearch = i15;
            }
            i16 = z15 ? iBinarySearch : i15;
        }
        return z16 ? Math.max(0, i16) : i16;
    }

    public static int g0(int i15, int i16) {
        return P(i15) * i16;
    }

    public static long g1(long j15) {
        return (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? j15 : j15 / 1000;
    }

    public static <T> T h(T t15) {
        return t15;
    }

    public static long h0(long j15, float f15) {
        return f15 == 1.0f ? j15 : Math.round(j15 / ((double) f15));
    }

    public static <T> T[] i(T[] tArr) {
        return tArr;
    }

    public static List<String> i0(int i15) {
        ArrayList arrayList = new ArrayList();
        if ((i15 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i15 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i15 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i15 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i15 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i15 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i15 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i15 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i15 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i15 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i15 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i15 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i15 & PKIFailureInfo.certConfirmed) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i15 & PKIFailureInfo.certRevoked) != 0) {
            arrayList.add("easy-read");
        }
        if ((i15 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i15 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static int j(int i15, int i16) {
        return ((i15 + i16) - 1) / i16;
    }

    public static List<String> j0(int i15) {
        ArrayList arrayList = new ArrayList();
        if ((i15 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i15 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i15 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static long k(long j15, long j16) {
        return ((j15 + j16) - 1) / j16;
    }

    public static String[] k0() {
        String[] strArrL0 = l0();
        for (int i15 = 0; i15 < strArrL0.length; i15++) {
            strArrL0[i15] = M0(strArrL0[i15]);
        }
        return strArrL0;
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String[] l0() {
        return m0(Resources.getSystem().getConfiguration());
    }

    public static double m(double d15, double d16, double d17) {
        return Math.max(d16, Math.min(d15, d17));
    }

    private static String[] m0(Configuration configuration) {
        return Z0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static float n(float f15, float f16, float f17) {
        return Math.max(f16, Math.min(f15, f17));
    }

    private static String n0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e15) {
            t.d("Util", "Failed to read system property " + str, e15);
            return null;
        }
    }

    public static int o(int i15, int i16, int i17) {
        return Math.max(i16, Math.min(i15, i17));
    }

    public static String o0(int i15) {
        switch (i15) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i15 < 10000) {
                    return "?";
                }
                return "custom (" + i15 + ")";
        }
    }

    public static long p(long j15, long j16, long j17) {
        return Math.max(j16, Math.min(j15, j17));
    }

    public static byte[] p0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static <T> boolean q(SparseArray<T> sparseArray, int i15) {
        return sparseArray.indexOfKey(i15) >= 0;
    }

    public static int q0(Uri uri) {
        int iR0;
        String scheme = uri.getScheme();
        if (scheme != null && (zj.c.a("rtsp", scheme) || zj.c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iR0 = r0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iR0;
        }
        Matcher matcher = f210734k.matcher((CharSequence) zj.p.q(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean r(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int r0(String str) {
        String strF = zj.c.f(str);
        strF.getClass();
        switch (strF) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static <T> boolean s(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i15 = 0; i15 < size; i15++) {
            if (!Objects.equals(sparseArray.valueAt(i15), sparseArray2.get(sparseArray.keyAt(i15)))) {
                return false;
            }
        }
        return true;
    }

    public static int s0(Uri uri, String str) {
        if (str == null) {
            return q0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static <T> int t(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i15)) * 31) + Objects.hashCode(sparseArray.valueAt(i15));
        }
        return iKeyAt;
    }

    public static boolean t0(c0 c0Var, c0 c0Var2, Inflater inflater) {
        if (c0Var.a() == 0) {
            return false;
        }
        if (c0Var2.b() < c0Var.a()) {
            c0Var2.d(c0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c0Var.f(), c0Var.g(), c0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(c0Var2.f(), iInflate, c0Var2.b() - iInflate);
                if (inflater.finished()) {
                    c0Var2.e0(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == c0Var2.b()) {
                        c0Var2.d(c0Var2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th4) {
                inflater.reset();
                throw th4;
            }
        }
    }

    public static int u(byte[] bArr, int i15, int i16, int i17) {
        while (i15 < i16) {
            int iB = ek.j.b(bArr[i15]);
            i17 = v(iB & 15, v(iB >> 4, i17));
            i15++;
        }
        return i17;
    }

    public static String u0(int i15) {
        return Integer.toString(i15, 36);
    }

    private static int v(int i15, int i16) {
        return (f210739p[(i15 ^ ((i16 >> 12) & GF2Field.MASK)) & GF2Field.MASK] ^ ((i16 << 4) & 65535)) & 65535;
    }

    public static boolean v0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int w(byte[] bArr, int i15, int i16, int i17) {
        while (i15 < i16) {
            i17 = f210738o[((i17 >>> 24) ^ (bArr[i15] & GF2Field.MASK)) & GF2Field.MASK] ^ (i17 << 8);
            i15++;
        }
        return i17;
    }

    public static boolean w0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static int x(byte[] bArr, int i15, int i16, int i17) {
        while (i15 < i16) {
            i17 = f210740q[i17 ^ (bArr[i15] & GF2Field.MASK)];
            i15++;
        }
        return i17;
    }

    public static boolean x0(int i15) {
        return i15 == 21 || i15 == 1342177280 || i15 == 22 || i15 == 1610612736 || i15 == 4 || i15 == 1879048192;
    }

    public static Handler y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean y0(int i15) {
        return i15 == 3 || i15 == 2 || i15 == 268435456 || i15 == 21 || i15 == 1342177280 || i15 == 22 || i15 == 1610612736 || i15 == 4 || i15 == 1879048192;
    }

    public static Handler z() {
        return A(null);
    }

    public static boolean z0(Context context) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i15 == 30) {
            String str = Build.MODEL;
            if (zj.c.a(str, "moto g(20)") || zj.c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i15 == 34 && zj.c.a(Build.MODEL, "sm-x200");
    }
}
