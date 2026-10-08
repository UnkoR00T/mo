package t7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f188643a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f188644b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f188645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f188646b;
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f188647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f188648b;

        public b(int i15, int i16) {
            this.f188647a = i15;
            this.f188648b = i16;
        }

        public int a() {
            int i15 = this.f188648b;
            if (i15 == 2) {
                return 10;
            }
            if (i15 == 5) {
                return 11;
            }
            if (i15 == 29) {
                return 12;
            }
            if (i15 == 42) {
                return 16;
            }
            if (i15 != 22) {
                return i15 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarD;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarD = d(str2)) == null || (iA = bVarD.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b bVarD;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarD = d(str2)) == null) {
                    return 0;
                }
                return bVarD.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(int i15) {
        if (i15 == 32) {
            return "video/mp4v-es";
        }
        if (i15 == 33) {
            return "video/avc";
        }
        if (i15 == 35) {
            return "video/hevc";
        }
        if (i15 == 64) {
            return "audio/mp4a-latm";
        }
        if (i15 == 163) {
            return "video/wvc1";
        }
        if (i15 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i15 == 221) {
            return "audio/vorbis";
        }
        if (i15 == 165) {
            return "audio/ac3";
        }
        if (i15 == 166) {
            return "audio/eac3";
        }
        switch (i15) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i15) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b d(String str) {
        Matcher matcher = f188644b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) zj.p.q(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String e(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return g(str);
    }

    private static int g(String str) {
        int size = f188643a.size();
        for (int i15 = 0; i15 < size; i15++) {
            a aVar = f188643a.get(i15);
            if (str.equals(aVar.f188645a)) {
                return aVar.f188646b;
            }
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(e(str));
    }

    public static boolean i(String str) {
        return "image".equals(e(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean j(String str) {
        return "text".equals(e(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(e(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String strF = zj.c.f(str);
        strF.getClass();
        switch (strF) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strF;
        }
    }
}
