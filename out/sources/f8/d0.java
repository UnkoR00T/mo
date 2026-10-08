package f8;

import ak.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<b, List<p>> f59952a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f59953b = -1;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f59955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f59956c;

        public b(String str, boolean z15, boolean z16) {
            this.f59954a = str;
            this.f59955b = z15;
            this.f59956c = z16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f59954a, bVar.f59954a) && this.f59955b == bVar.f59955b && this.f59956c == bVar.f59956c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f59954a.hashCode() + 31) * 31) + (this.f59955b ? 1231 : 1237)) * 31) + (this.f59956c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th4) {
            super("Failed to query underlying media codecs", th4);
        }
    }

    private interface d {
        MediaCodecInfo a(int i15);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f59958b;

        public e(boolean z15, boolean z16, boolean z17) {
            this.f59957a = (z15 || z16 || z17) ? 1 : 0;
        }

        private void f() {
            if (this.f59958b == null) {
                this.f59958b = new MediaCodecList(this.f59957a).getCodecInfos();
            }
        }

        @Override // f8.d0.d
        public MediaCodecInfo a(int i15) {
            f();
            return this.f59958b[i15];
        }

        @Override // f8.d0.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // f8.d0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // f8.d0.d
        public int d() {
            f();
            return this.f59958b.length;
        }

        @Override // f8.d0.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t15);
    }

    private static <T> void A(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: f8.a0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d0.a(fVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(p pVar) {
        return (pVar.f60027i ? 2 : 0) + (!pVar.f60028j ? 1 : 0);
    }

    public static /* synthetic */ int c(Context context, t7.p pVar, p pVar2) {
        return pVar2.p(context, pVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(p pVar) {
        String str = pVar.f60019a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    private static void e(String str, List<p> list) {
        if ("audio/raw".equals(str)) {
            A(list, new f() { // from class: f8.c0
                @Override // f8.d0.f
                public final int a(Object obj) {
                    return d0.d((p) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f60019a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel f(int i15, int i16) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i15;
        codecProfileLevel.level = i16;
        return codecProfileLevel;
    }

    public static String g(t7.p pVar) {
        Pair<Integer, Integer> pairT;
        if ("audio/eac3-joc".equals(pVar.f188381p)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(pVar.f188381p) && (pairT = w7.i.t(pVar)) != null) {
            int iIntValue = ((Integer) pairT.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                t7.g gVar = pVar.F;
                if (gVar != null && gVar.f188192c == 6 && gVar.f188191b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(pVar.f188381p)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<p> h(y yVar, t7.p pVar, boolean z15, boolean z16) {
        String strG = g(pVar);
        return strG == null ? n0.C() : yVar.b(strG, z15, z16);
    }

    private static String i(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static p j(String str, boolean z15, boolean z16) {
        List<p> listK = k(str, z15, z16);
        if (listK.isEmpty()) {
            return null;
        }
        return listK.get(0);
    }

    public static synchronized List<p> k(String str, boolean z15, boolean z16) {
        try {
            b bVar = new b(str, z15, z16);
            HashMap<b, List<p>> map = f59952a;
            List<p> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<p> arrayListL = l(bVar, new e(z15, z16, str.equals("video/mv-hevc")));
            if (z15) {
                arrayListL.isEmpty();
            }
            e(str, arrayListL);
            n0 n0VarV = n0.v(arrayListL);
            map.put(bVar, n0VarV);
            return n0VarV;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    private static ArrayList<p> l(b bVar, d dVar) throws c {
        String strI;
        String str;
        int i15;
        d dVar2 = dVar;
        try {
            ArrayList<p> arrayList = new ArrayList<>();
            String str2 = bVar.f59954a;
            int iD = dVar2.d();
            boolean zE = dVar2.e();
            int i16 = 0;
            while (i16 < iD) {
                MediaCodecInfo mediaCodecInfoA = dVar2.a(i16);
                if (r(mediaCodecInfoA)) {
                    i15 = i16;
                } else {
                    int i17 = i16;
                    String name = mediaCodecInfoA.getName();
                    if (t(mediaCodecInfoA, name, zE, str2) && (strI = i(mediaCodecInfoA, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strI);
                            boolean zB = dVar2.b("tunneled-playback", strI, capabilitiesForType);
                            boolean zC = dVar2.c("tunneled-playback", strI, capabilitiesForType);
                            boolean z15 = bVar.f59956c;
                            if ((z15 || !zC) && (!z15 || zB)) {
                                boolean zB2 = dVar2.b("secure-playback", strI, capabilitiesForType);
                                boolean zC2 = dVar2.c("secure-playback", strI, capabilitiesForType);
                                boolean z16 = bVar.f59955b;
                                if ((z16 || !zC2) && (!z16 || zB2)) {
                                    try {
                                        boolean zU = u(mediaCodecInfoA, str2);
                                        boolean zW = w(mediaCodecInfoA, str2);
                                        boolean zY = y(mediaCodecInfoA);
                                        try {
                                            if (zE) {
                                                if (bVar.f59955b != zB2) {
                                                }
                                                str = strI;
                                                i15 = i17;
                                                arrayList.add(p.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                            }
                                            arrayList.add(p.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                        } catch (Exception e15) {
                                            e = e15;
                                            w7.t.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (zE || bVar.f59955b) {
                                            str = strI;
                                            i15 = i17;
                                            if (!zE && zB2) {
                                                try {
                                                    try {
                                                        arrayList.add(p.E(name + ".secure", str2, str, capabilitiesForType, zU, zW, zY, false, true));
                                                        return arrayList;
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        name = name;
                                                        w7.t.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                }
                                            }
                                        }
                                        str = strI;
                                        i15 = i17;
                                    } catch (Exception e18) {
                                        e = e18;
                                        str = strI;
                                    }
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                i15 = i17;
                            }
                        } catch (Exception e19) {
                            e = e19;
                            str = strI;
                        }
                    } else {
                        i15 = i17;
                    }
                }
                i16 = i15 + 1;
                dVar2 = dVar;
            }
            return arrayList;
        } catch (Exception e25) {
            throw new c(e25);
        }
    }

    public static List<p> m(y yVar, t7.p pVar, boolean z15, boolean z16) {
        List<p> listB = yVar.b(pVar.f188381p, z15, z16);
        return n0.s().j(listB).j(h(yVar, pVar, z15, z16)).k();
    }

    public static List<p> n(final Context context, List<p> list, final t7.p pVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: f8.b0
            @Override // f8.d0.f
            public final int a(Object obj) {
                return d0.c(context, pVar, (p) obj);
            }
        });
        return arrayList;
    }

    public static List<p> o(List<p> list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: f8.z
            @Override // f8.d0.f
            public final int a(Object obj) {
                return d0.b((p) obj);
            }
        });
        return n0.v(arrayList);
    }

    public static p p() {
        return j("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> q(t7.p pVar) {
        String strH = x7.g.h(pVar.f188384s);
        if (strH == null) {
            return null;
        }
        return w7.i.w(strH, o0.Z0(strH.trim(), "\\."), pVar.F);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z15, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z15 || !str.endsWith(".secure");
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return x(mediaCodecInfo);
        }
        if (t7.w.h(str)) {
            return true;
        }
        String strF = zj.c.f(mediaCodecInfo.getName());
        if (strF.startsWith("arc.")) {
            return false;
        }
        return strF.startsWith("omx.google.") || strF.startsWith("omx.ffmpeg.") || (strF.startsWith("omx.sec.") && strF.contains(".sw.")) || strF.equals("omx.qcom.video.decoder.hevcswvdec") || strF.startsWith("c2.android.") || strF.startsWith("c2.google.") || !(strF.startsWith("omx.") || strF.startsWith("c2."));
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z(mediaCodecInfo);
        }
        String strF = zj.c.f(mediaCodecInfo.getName());
        return (strF.startsWith("omx.google.") || strF.startsWith("c2.android.") || strF.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
