package d8;

import b8.e2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f40185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40187c;

        public a(byte[] bArr, String str, int i15) {
            this.f40185a = bArr;
            this.f40186b = str;
            this.f40187c = i15;
        }

        public byte[] a() {
            return this.f40185a;
        }

        public String b() {
            return this.f40186b;
        }
    }

    public interface b {
        void a(a0 a0Var, byte[] bArr, int i15, int i16, byte[] bArr2);
    }

    public interface c {
        a0 a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f40188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40189b;

        public d(byte[] bArr, String str) {
            this.f40188a = bArr;
            this.f40189b = str;
        }

        public byte[] a() {
            return this.f40188a;
        }

        public String b() {
            return this.f40189b;
        }
    }

    Map<String, String> a(byte[] bArr);

    void b();

    d c();

    byte[] d();

    void e(byte[] bArr, byte[] bArr2);

    void f(byte[] bArr);

    int g();

    default void h(byte[] bArr, e2 e2Var) {
    }

    z7.b i(byte[] bArr);

    void j(b bVar);

    boolean k(byte[] bArr, String str);

    void l(byte[] bArr);

    byte[] m(byte[] bArr, byte[] bArr2);

    a n(byte[] bArr, List<t7.l.b> list, int i15, HashMap<String, String> map);
}
