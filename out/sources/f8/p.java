package f8;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f60022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f60023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f60024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f60026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f60027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f60029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f60030l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f60033o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60031m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60032n = -1;

    p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26) {
        this.f60019a = (String) zj.p.q(str);
        this.f60020b = str2;
        this.f60021c = str3;
        this.f60022d = codecCapabilities;
        this.f60026h = z15;
        this.f60027i = z16;
        this.f60028j = z17;
        this.f60023e = z18;
        this.f60024f = z19;
        this.f60025g = z25;
        this.f60029k = z26;
        this.f60030l = t7.w.k(str2);
    }

    private static boolean A(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean C(String str, int i15) {
        if (!"video/hevc".equals(str) || 2 != i15) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static p E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        return new p(str, str2, str3, codecCapabilities, z15, z16, z17, (z18 || codecCapabilities == null || !j(codecCapabilities)) ? false : true, codecCapabilities != null && v(codecCapabilities), z19 || (codecCapabilities != null && u(codecCapabilities)), o(codecCapabilities));
    }

    private static int a(String str, String str2, int i15) {
        int i16;
        if (i15 > 1 || i15 > 0 || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2)) {
            return i15;
        }
        if ("audio/ac3".equals(str2)) {
            i16 = 6;
        } else {
            i16 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        w7.t.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i15 + " to " + i16 + "]");
        return i16;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i15, int i16) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(o0.j(i15, widthAlignment) * widthAlignment, o0.j(i16, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i15, int i16, double d15) {
        Point pointB = b(videoCapabilities, i15, i16);
        int i17 = pointB.x;
        int i18 = pointB.y;
        if (d15 == -1.0d || d15 < 1.0d) {
            return videoCapabilities.isSizeSupported(i17, i18);
        }
        double dFloor = Math.floor(d15);
        if (!videoCapabilities.areSizeAndRateSupported(i17, i18, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i17, i18);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float f(int i15, int i16) {
        float f15 = 1024.0f;
        if (w(i15, i16, 1024.0f)) {
            return 1024.0f;
        }
        float f16 = 0.0f;
        while (true) {
            float f17 = f15 - f16;
            if (Math.abs(f17) <= 5.0f) {
                return f16;
            }
            float f18 = (f17 / 2.0f) + f16;
            if (w(i15, i16, f18)) {
                f16 = f18;
            } else {
                f15 = f18;
            }
        }
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(Context context, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i15 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
        return o0.v0(context) ? new MediaCodecInfo.CodecProfileLevel[]{d0.f(1026, i15)} : new MediaCodecInfo.CodecProfileLevel[]{d0.f(257, i15), d0.f(513, i15), d0.f(514, i15), d0.f(1026, i15), d0.f(1028, i15)};
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(Context context, t7.p pVar, boolean z15) {
        Pair<Integer, Integer> pairT = w7.i.t(pVar);
        String str = pVar.f188381p;
        if (str != null && str.equals("video/mv-hevc")) {
            String strL = t7.w.l(this.f60021c);
            if (strL.equals("video/mv-hevc")) {
                return true;
            }
            if (strL.equals("video/hevc")) {
                pairT = d0.q(pVar);
            }
        }
        if (pairT == null) {
            return true;
        }
        int iIntValue = ((Integer) pairT.first).intValue();
        int iIntValue2 = ((Integer) pairT.second).intValue();
        if ("video/dolby-vision".equals(pVar.f188381p)) {
            String str2 = this.f60020b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f60030l && !this.f60020b.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = i();
        if (this.f60020b.equals("audio/ac4") && codecProfileLevelArrI.length == 0) {
            codecProfileLevelArrI = g(context, this.f60022d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrI) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z15) && !C(this.f60020b, iIntValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + pVar.f188376k + ", " + this.f60021c);
        return false;
    }

    private boolean n(t7.p pVar) {
        return (Objects.equals(pVar.f188381p, "audio/flac") && pVar.J == 22 && Build.VERSION.SDK_INT < 34 && this.f60019a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean o(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !B();
    }

    private boolean s(t7.p pVar) {
        return this.f60020b.equals(pVar.f188381p) || this.f60020b.equals(d0.g(pVar));
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        w7.t.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f60019a + ", " + this.f60020b + "] [" + o0.f210728e + "]");
    }

    private void y(String str) {
        w7.t.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f60019a + ", " + this.f60020b + "] [" + o0.f210728e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i15, int i16) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60022d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i15, i16);
    }

    public a8.f e(t7.p pVar, t7.p pVar2) {
        t7.p pVar3;
        t7.p pVar4;
        int i15;
        int i16 = !Objects.equals(pVar.f188381p, pVar2.f188381p) ? 8 : 0;
        if (this.f60030l) {
            if (pVar.B != pVar2.B) {
                i16 |= 1024;
            }
            boolean z15 = (pVar.f188388w == pVar2.f188388w && pVar.f188389x == pVar2.f188389x) ? false : true;
            if (!this.f60023e && z15) {
                i16 |= 512;
            }
            if ((!t7.g.h(pVar.F) || !t7.g.h(pVar2.F)) && !Objects.equals(pVar.F, pVar2.F)) {
                i16 |= 2048;
            }
            if (A(this.f60019a) && !pVar.f(pVar2)) {
                i16 |= 2;
            }
            int i17 = pVar.f188390y;
            if (i17 != -1 && (i15 = pVar.f188391z) != -1 && i17 == pVar2.f188390y && i15 == pVar2.f188391z && z15) {
                i16 |= 2;
            }
            if (i16 == 0 && Objects.equals(pVar2.f188381p, "video/dolby-vision")) {
                Pair<Integer, Integer> pairT = w7.i.t(pVar);
                Pair<Integer, Integer> pairT2 = w7.i.t(pVar2);
                if (pairT == null || pairT2 == null || !((Integer) pairT.first).equals(pairT2.first)) {
                    i16 |= 2;
                }
            }
            if (i16 == 0) {
                return new a8.f(this.f60019a, pVar, pVar2, pVar.f(pVar2) ? 3 : 2, 0);
            }
            pVar3 = pVar;
            pVar4 = pVar2;
        } else {
            pVar3 = pVar;
            pVar4 = pVar2;
            if (pVar3.H != pVar4.H) {
                i16 |= PKIFailureInfo.certConfirmed;
            }
            if (pVar3.I != pVar4.I) {
                i16 |= PKIFailureInfo.certRevoked;
            }
            if (pVar3.J != pVar4.J) {
                i16 |= 16384;
            }
            if (i16 == 0 && (this.f60020b.equals("audio/mp4a-latm") || this.f60020b.equals("audio/ac4"))) {
                Pair<Integer, Integer> pairT3 = w7.i.t(pVar3);
                Pair<Integer, Integer> pairT4 = w7.i.t(pVar4);
                if (pairT3 != null && pairT4 != null) {
                    int iIntValue = ((Integer) pairT3.first).intValue();
                    int iIntValue2 = ((Integer) pairT4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new a8.f(this.f60019a, pVar3, pVar4, 3, 0);
                    }
                    if (this.f60020b.equals("audio/ac4") && pairT3.equals(pairT4)) {
                        return new a8.f(this.f60019a, pVar3, pVar4, 3, 0);
                    }
                }
            }
            if (i16 == 0 && (this.f60020b.equals("audio/eac3-joc") || this.f60020b.equals("audio/eac3"))) {
                return new a8.f(this.f60019a, pVar3, pVar4, 3, 0);
            }
            if (!pVar3.f(pVar4)) {
                i16 |= 32;
            }
            if (z(this.f60020b)) {
                i16 |= 2;
            }
            if (i16 == 0) {
                return new a8.f(this.f60019a, pVar3, pVar4, 1, 0);
            }
        }
        return new a8.f(this.f60019a, pVar3, pVar4, 0, i16);
    }

    public float h(int i15, int i16) {
        if (!this.f60030l) {
            return -3.4028235E38f;
        }
        float f15 = this.f60033o;
        if (f15 != -3.4028235E38f && this.f60031m == i15 && this.f60032n == i16) {
            return f15;
        }
        float f16 = f(i15, i16);
        this.f60033o = f16;
        this.f60031m = i15;
        this.f60032n = i16;
        return f16;
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60022d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i15) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60022d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (a(this.f60019a, this.f60020b, audioCapabilities.getMaxInputChannelCount()) >= i15) {
            return true;
        }
        y("channelCount.support, " + i15);
        return false;
    }

    public boolean l(int i15) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60022d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i15)) {
            return true;
        }
        y("sampleRate.support, " + i15);
        return false;
    }

    public boolean p(Context context, t7.p pVar) {
        return s(pVar) && m(context, pVar, false) && n(pVar);
    }

    public boolean q(Context context, t7.p pVar) {
        int i15;
        int i16;
        if (!s(pVar) || !m(context, pVar, true) || !n(pVar)) {
            return false;
        }
        if (!this.f60030l) {
            int i17 = pVar.I;
            return (i17 == -1 || l(i17)) && ((i15 = pVar.H) == -1 || k(i15));
        }
        int i18 = pVar.f188388w;
        if (i18 <= 0 || (i16 = pVar.f188389x) <= 0) {
            return true;
        }
        return w(i18, i16, pVar.A);
    }

    public boolean r() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f60020b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : i()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t(t7.p pVar) {
        if (this.f60030l) {
            return this.f60023e;
        }
        Pair<Integer, Integer> pairT = w7.i.t(pVar);
        return pairT != null && ((Integer) pairT.first).intValue() == 42;
    }

    public String toString() {
        return this.f60019a;
    }

    public boolean w(int i15, int i16, double d15) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60022d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = t.c(videoCapabilities, i15, i16, d15);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                y("sizeAndRate.cover, " + i15 + "x" + i16 + "@" + d15);
                return false;
            }
        }
        if (!d(videoCapabilities, i15, i16, d15)) {
            if (i15 >= i16 || !D(this.f60019a) || !d(videoCapabilities, i16, i15, d15)) {
                y("sizeAndRate.support, " + i15 + "x" + i16 + "@" + d15);
                return false;
            }
            x("sizeAndRate.rotated, " + i15 + "x" + i16 + "@" + d15);
        }
        return true;
    }
}
