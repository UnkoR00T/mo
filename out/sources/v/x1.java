package v;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface x1 {

    public static abstract class a {
        public static a a(int i15, String str, int i16, int i17, int i18, int i19) {
            return new k(i15, str, i16, i17, i18, i19);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    public static abstract class b implements x1 {
        public static b h(int i15, int i16, List<a> list, List<c> list2) {
            return new l(i15, i16, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    public static abstract class c {
        public static c a(int i15, String str, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
            return new m(i15, str, i16, i17, i18, i19, i25, i26, i27, i28);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public Size k() {
            return new Size(l(), h());
        }

        public abstract int l();
    }

    static int c(int i15) {
        if (i15 == 3) {
            return 2;
        }
        if (i15 != 4) {
            return i15 != 5 ? -1 : 39;
        }
        return 5;
    }

    static String d(int i15) {
        switch (i15) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    static String g(int i15) {
        switch (i15) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    int a();

    List<c> b();

    int e();

    List<a> f();
}
