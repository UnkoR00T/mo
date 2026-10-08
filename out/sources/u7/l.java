package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f195962a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f195963e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f195964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f195965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f195966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f195967d;

        public a(t7.p pVar) {
            this(pVar.I, pVar.H, pVar.J);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f195964a == aVar.f195964a && this.f195965b == aVar.f195965b && this.f195966c == aVar.f195966c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f195964a), Integer.valueOf(this.f195965b), Integer.valueOf(this.f195966c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f195964a + ", channelCount=" + this.f195965b + ", encoding=" + this.f195966c + ']';
        }

        public a(int i15, int i16, int i17) {
            this.f195964a = i15;
            this.f195965b = i16;
            this.f195966c = i17;
            this.f195967d = o0.y0(i17) ? o0.g0(i17, i16) : -1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f195968b = new b(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f195969a;

        public b(long j15) {
            zj.p.d(j15 >= 0);
            this.f195969a = j15;
        }
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f195970a;

        public c(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public c(String str, a aVar) {
            super(str + " " + aVar);
            this.f195970a = aVar;
        }
    }

    ByteBuffer a();

    default void b(b bVar) {
        flush();
    }

    void c(ByteBuffer byteBuffer);

    void d();

    boolean e();

    default long f(long j15) {
        return j15;
    }

    @Deprecated
    default void flush() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    a g(a aVar);

    boolean h();

    void reset();
}
