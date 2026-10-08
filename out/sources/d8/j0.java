package d8;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface j0 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f40290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h8.x f40291b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final byte[] f40292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private h8.x f40293b;

            public a(byte[] bArr) {
                this.f40292a = bArr;
            }

            public b c() {
                return new b(this);
            }

            public a d(h8.x xVar) {
                this.f40293b = xVar;
                return this;
            }
        }

        private b(a aVar) {
            this.f40290a = aVar.f40292a;
            this.f40291b = aVar.f40293b;
        }
    }

    b a(UUID uuid, a0.a aVar);

    b b(UUID uuid, a0.d dVar);
}
