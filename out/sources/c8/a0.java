package c8;

import android.media.AudioDeviceInfo;
import b8.e2;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f24100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f24101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f24102f;

        public a(int i15, int i16, int i17, boolean z15, boolean z16, int i18) {
            this.f24097a = i15;
            this.f24098b = i16;
            this.f24099c = i17;
            this.f24100d = z15;
            this.f24101e = z16;
            this.f24102f = i18;
        }
    }

    public interface d {
        default void a(long j15) {
        }

        default void b() {
        }

        default void c(int i15) {
        }

        void d(boolean z15);

        default void e(Exception exc) {
        }

        default void f(a aVar) {
        }

        default void g(a aVar) {
        }

        default void h() {
        }

        void i(int i15, long j15, long j16);

        default void j() {
        }

        void k();

        default void l() {
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f24108b;

        public e(long j15, long j16) {
            super("Unexpected audio track timestamp discontinuity: expected " + j16 + ", got " + j15);
            this.f24107a = j15;
            this.f24108b = j16;
        }
    }

    public static final class f extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t7.p f24111c;

        public f(int i15, t7.p pVar, boolean z15) {
            super("AudioTrack write failed: " + i15);
            this.f24110b = z15;
            this.f24109a = i15;
            this.f24111c = pVar;
        }
    }

    long A(boolean z15);

    default void B(long j15) {
    }

    void C();

    void D();

    default c8.b E() {
        return null;
    }

    void F(boolean z15);

    boolean a(t7.p pVar);

    default void b() {
    }

    default void c(w7.h hVar) {
    }

    t7.z d();

    boolean e();

    boolean f();

    void flush();

    void g();

    void h();

    void i(t7.z zVar);

    default void j(e2 e2Var) {
    }

    default void k(int i15, int i16) {
    }

    void l(float f15);

    int m(t7.p pVar);

    void n(int i15);

    long o();

    default void p(int i15) {
    }

    void q();

    void r(t7.p pVar, int i15, int[] iArr);

    void reset();

    default void s(int i15) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    default i t(t7.p pVar) {
        return i.f24237d;
    }

    void u(d dVar);

    boolean v(ByteBuffer byteBuffer, long j15, int i15);

    default void w(k kVar) {
        throw new UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
    }

    void x(t7.b bVar);

    void y();

    void z(t7.c cVar);

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.p f24103a;

        public b(Throwable th4, t7.p pVar) {
            super(th4);
            this.f24103a = pVar;
        }

        public b(String str, t7.p pVar) {
            super(str);
            this.f24103a = pVar;
        }
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t7.p f24106c;

        public c(String str, int i15, t7.p pVar, boolean z15, Throwable th4) {
            super(str, th4);
            this.f24104a = i15;
            this.f24105b = z15;
            this.f24106c = pVar;
        }

        public c(int i15, int i16, int i17, int i18, int i19, t7.p pVar, boolean z15, Exception exc) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("AudioTrack init failed ");
            sb5.append(i15);
            sb5.append(" ");
            sb5.append("Config(");
            sb5.append(i16);
            sb5.append(", ");
            sb5.append(i17);
            sb5.append(", ");
            sb5.append(i18);
            sb5.append(", ");
            sb5.append(i19);
            sb5.append(")");
            sb5.append(" ");
            sb5.append(pVar);
            sb5.append(z15 ? " (recoverable)" : "");
            this(sb5.toString(), i15, pVar, z15, exc);
        }
    }
}
