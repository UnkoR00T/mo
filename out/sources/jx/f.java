package jx;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isoCode", "Ljx/e;", "a", "(Ljava/lang/String;)Ljx/e;", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final e a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3241) {
                if (iHashCode != 3580) {
                    if (iHashCode == 3734 && str.equals("uk")) {
                        return e.UKRAINIAN;
                    }
                } else if (str.equals("pl")) {
                    return e.POLISH;
                }
            } else if (str.equals("en")) {
                return e.ENGLISH;
            }
        }
        return e.UNKNOWN;
    }
}
