package d8;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(m mVar) {
        Map<String, String> mapH = mVar.h();
        if (mapH == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapH, "LicenseDurationRemaining")), Long.valueOf(a(mapH, "PlaybackDurationRemaining")));
    }
}
