package v;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    public static final class a implements c0 {
        public static c0 b() {
            return new a();
        }

        @Override // v.c0
        public b0 c() {
            return b0.UNKNOWN;
        }

        @Override // v.c0
        public t3 d() {
            return t3.b();
        }

        @Override // v.c0
        public z f() {
            return z.UNKNOWN;
        }

        @Override // v.c0
        public CaptureResult g() {
            return null;
        }

        @Override // v.c0
        public long getTimestamp() {
            return -1L;
        }

        @Override // v.c0
        public v i() {
            return v.UNKNOWN;
        }

        @Override // v.c0
        public y j() {
            return y.UNKNOWN;
        }

        @Override // v.c0
        public a0 k() {
            return a0.UNKNOWN;
        }

        @Override // v.c0
        public x l() {
            return x.UNKNOWN;
        }

        @Override // v.c0
        public w n() {
            return w.UNKNOWN;
        }
    }

    default void a(y.h.b bVar) {
        bVar.g(c());
    }

    b0 c();

    t3 d();

    z f();

    default CaptureResult g() {
        return null;
    }

    long getTimestamp();

    v i();

    y j();

    a0 k();

    x l();

    w n();
}
