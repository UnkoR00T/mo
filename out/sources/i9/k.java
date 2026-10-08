package i9;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class k {
    public static String a(List<z> list) {
        Iterator<z> it = list.iterator();
        boolean z15 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f90519a.f90490g.f188381p;
            if (t7.w.k(str2)) {
                return "video/mp4";
            }
            if (t7.w.h(str2)) {
                z15 = true;
            } else if (t7.w.i(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z15) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static String b(t7.p pVar) {
        String str = pVar.f188381p;
        if (t7.w.k(str)) {
            return "video/mp4";
        }
        if (t7.w.h(str)) {
            return "audio/mp4";
        }
        if (!t7.w.i(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, "image/heic")) {
            return "image/heif";
        }
        return Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4";
    }
}
