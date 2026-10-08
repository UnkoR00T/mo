package h;

import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import io.sentry.android.core.c2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/q;", "", "", "value", "p", "(I)I", "", "t", "(I)Z", "", "u", "(I)Ljava/lang/String;", "s", "other", "q", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f79012c = p(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f79013d = p(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f79014e = p(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f79015f = p(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f79016g = p(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f79017h = p(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f79018i = p(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f79019j = p(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f79020k = p(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f79021l = p(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f79022m = p(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f79023n = p(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f79024o = p(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f79025p = p(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: h.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010%\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0017\u00101\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018¨\u00063"}, d2 = {"Lh/q$a;", "", "<init>", "()V", "", "throwable", "", "r", "(Ljava/lang/Throwable;)Z", "Lh/q;", "c", "(Ljava/lang/Throwable;)I", "Landroid/hardware/camera2/CameraAccessException;", "exception", "b", "(Landroid/hardware/camera2/CameraAccessException;)I", "", "stateCallbackError", "a", "(I)I", "s", "ERROR_UNDETERMINED", "I", "p", "()I", "ERROR_CAMERA_IN_USE", "g", "ERROR_CAMERA_LIMIT_EXCEEDED", "h", "ERROR_CAMERA_DISABLED", "e", "ERROR_CAMERA_DEVICE", "d", "ERROR_CAMERA_SERVICE", "k", "ERROR_CAMERA_DISCONNECTED", "f", "ERROR_ILLEGAL_ARGUMENT_EXCEPTION", "n", "ERROR_SECURITY_EXCEPTION", "o", "ERROR_GRAPH_CONFIG", "m", "ERROR_DO_NOT_DISTURB_ENABLED", "l", "ERROR_UNKNOWN_EXCEPTION", "q", "ERROR_CAMERA_OPENER", "i", "ERROR_CAMERA_OPEN_TIMEOUT", "j", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final boolean r(Throwable throwable) {
            if (!(throwable instanceof RuntimeException)) {
                return false;
            }
            StackTraceElement[] stackTrace = ((RuntimeException) throwable).getStackTrace();
            return fr.t.c(!(stackTrace.length == 0) ? stackTrace[0].getMethodName() : null, "_enableShutterSound");
        }

        public final int a(int stateCallbackError) {
            if (stateCallbackError == 1) {
                return g();
            }
            if (stateCallbackError == 2) {
                return h();
            }
            if (stateCallbackError == 3) {
                return e();
            }
            if (stateCallbackError == 4) {
                return d();
            }
            if (stateCallbackError == 5) {
                return k();
            }
            throw new IllegalArgumentException("Unexpected StateCallback error code: " + stateCallbackError);
        }

        public final int b(CameraAccessException exception) {
            int reason = exception.getReason();
            if (reason == 1) {
                return e();
            }
            if (reason == 2) {
                return f();
            }
            if (reason == 3) {
                return p();
            }
            if (reason == 4) {
                return g();
            }
            if (reason == 5) {
                return h();
            }
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Unexpected CameraAccessException: " + exception);
            }
            return q();
        }

        public final int c(Throwable throwable) {
            if (throwable instanceof CameraAccessException) {
                return b((CameraAccessException) throwable);
            }
            if (throwable instanceof IllegalArgumentException) {
                return n();
            }
            if (throwable instanceof SecurityException) {
                return o();
            }
            if (s(throwable)) {
                return l();
            }
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Unexpected throwable: " + throwable);
            }
            return q();
        }

        public final int d() {
            return q.f79016g;
        }

        public final int e() {
            return q.f79015f;
        }

        public final int f() {
            return q.f79018i;
        }

        public final int g() {
            return q.f79013d;
        }

        public final int h() {
            return q.f79014e;
        }

        public final int i() {
            return q.f79024o;
        }

        public final int j() {
            return q.f79025p;
        }

        public final int k() {
            return q.f79017h;
        }

        public final int l() {
            return q.f79022m;
        }

        public final int m() {
            return q.f79021l;
        }

        public final int n() {
            return q.f79019j;
        }

        public final int o() {
            return q.f79020k;
        }

        public final int p() {
            return q.f79012c;
        }

        public final int q() {
            return q.f79023n;
        }

        public final boolean s(Throwable throwable) {
            return Build.VERSION.SDK_INT == 28 && r(throwable);
        }

        private Companion() {
        }
    }

    private /* synthetic */ q(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ q o(int i15) {
        return new q(i15);
    }

    private static int p(int i15) {
        return i15;
    }

    public static boolean q(int i15, Object obj) {
        return (obj instanceof q) && i15 == ((q) obj).getValue();
    }

    public static final boolean r(int i15, int i16) {
        return i15 == i16;
    }

    public static int s(int i15) {
        return Integer.hashCode(i15);
    }

    public static final boolean t(int i15) {
        return r(i15, f79018i) || r(i15, f79013d) || r(i15, f79014e);
    }

    public static String u(int i15) {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CameraError(");
        if (r(i15, f79012c)) {
            str = "ERROR_UNDETERMINED";
        } else if (r(i15, f79013d)) {
            str = "ERROR_CAMERA_IN_USE";
        } else if (r(i15, f79014e)) {
            str = "ERROR_CAMERA_LIMIT_EXCEEDED";
        } else if (r(i15, f79015f)) {
            str = "ERROR_CAMERA_DISABLED";
        } else if (r(i15, f79016g)) {
            str = "ERROR_CAMERA_DEVICE";
        } else if (r(i15, f79017h)) {
            str = "ERROR_CAMERA_SERVICE";
        } else if (r(i15, f79018i)) {
            str = "ERROR_CAMERA_DISCONNECTED";
        } else if (r(i15, f79019j)) {
            str = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION";
        } else if (r(i15, f79020k)) {
            str = "ERROR_SECURITY_EXCEPTION";
        } else if (r(i15, f79021l)) {
            str = "ERROR_GRAPH_CONFIG";
        } else if (r(i15, f79022m)) {
            str = "ERROR_DO_NOT_DISTURB_ENABLED";
        } else if (r(i15, f79023n)) {
            str = "ERROR_UNKNOWN_EXCEPTION";
        } else if (r(i15, f79024o)) {
            str = "ERROR_CAMERA_OPENER";
        } else {
            str = r(i15, f79025p) ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN";
        }
        sb5.append(str);
        sb5.append(')');
        return sb5.toString();
    }

    public boolean equals(Object obj) {
        return q(this.value, obj);
    }

    public int hashCode() {
        return s(this.value);
    }

    public String toString() {
        return u(this.value);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
