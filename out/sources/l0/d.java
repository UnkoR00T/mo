package l0;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f113942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f113943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f113944c;

        public a(int i15, int i16, long j15) {
            this.f113942a = i15;
            this.f113943b = i16;
            this.f113944c = j15;
        }

        public int a() {
            return this.f113942a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
