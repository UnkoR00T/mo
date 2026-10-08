package v;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class i extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f202608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f202609b;

    i(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f202608a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f202609b = handler;
    }

    @Override // v.i1
    public Executor b() {
        return this.f202608a;
    }

    @Override // v.i1
    public Handler c() {
        return this.f202609b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (this.f202608a.equals(i1Var.b()) && this.f202609b.equals(i1Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f202608a.hashCode() ^ 1000003) * 1000003) ^ this.f202609b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f202608a + ", schedulerHandler=" + this.f202609b + "}";
    }
}
