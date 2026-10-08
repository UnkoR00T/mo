package c8;

import android.media.AudioDeviceInfo;
import b8.e2;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public interface a {
        void a(long j15);

        void b();

        void c();

        void d();

        void e();
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24247b;

        public b(int i15, boolean z15) {
            super("AudioOutput write failed: " + i15);
            this.f24247b = z15;
            this.f24246a = i15;
        }
    }

    void b();

    t7.z d();

    void g();

    void h();

    void i(t7.z zVar);

    default void j(e2 e2Var) {
    }

    void k(int i15, int i16);

    void l(float f15);

    long m();

    default boolean n(k.g gVar, k.c cVar, k.g gVar2) {
        return gVar2.equals(gVar);
    }

    boolean o();

    int p();

    void q(int i15);

    void r();

    boolean s(ByteBuffer byteBuffer, int i15, long j15);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void stop();

    void t(a aVar);

    void u(float f15);

    boolean v();

    long w();

    int x();
}
