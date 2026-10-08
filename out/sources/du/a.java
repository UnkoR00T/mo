package du;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<er.a<?>, Object> f44536a = new ConcurrentHashMap<>();

    public static final Void a(String str) {
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
