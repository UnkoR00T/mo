package o8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface s0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f143191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f143192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143194d;

        public a(int i15, byte[] bArr, int i16, int i17) {
            this.f143191a = i15;
            this.f143192b = bArr;
            this.f143193c = i16;
            this.f143194d = i17;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f143191a == aVar.f143191a && this.f143193c == aVar.f143193c && this.f143194d == aVar.f143194d && Arrays.equals(this.f143192b, aVar.f143192b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f143191a * 31) + Arrays.hashCode(this.f143192b)) * 31) + this.f143193c) * 31) + this.f143194d;
        }
    }

    default void a(w7.c0 c0Var, int i15) {
        b(c0Var, i15, 0);
    }

    void b(w7.c0 c0Var, int i15, int i16);

    void c(long j15, int i15, int i16, int i17, a aVar);

    default void d(long j15) {
    }

    void e(t7.p pVar);

    default int f(t7.h hVar, int i15, boolean z15) {
        return g(hVar, i15, z15, 0);
    }

    int g(t7.h hVar, int i15, boolean z15, int i16);
}
