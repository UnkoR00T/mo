package li2;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final SecureRandom f118348a;

        static {
            SecureRandom secureRandom = new SecureRandom();
            f118348a = secureRandom;
            secureRandom.nextInt();
        }
    }

    public static SecureRandom a() {
        return a.f118348a;
    }
}
