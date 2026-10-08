package a;

import e.f2;
import h.g1;
import ju.w0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/h;", "Lh/g1$a;", "Lg/f;", "bundle", "Loq/i0;", "m", "(Lg/f;)V", "I", "()Lg/f;", "E", "()V", "u", "Le/f2;", "requestControl", "", "cancelPreviousTask", "Lju/w0;", "Ljava/lang/Void;", "N", "(Le/f2;Z)Lju/w0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h extends g1.a {
    static /* synthetic */ w0 y(h hVar, f2 f2Var, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAsync");
        }
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return hVar.N(f2Var, z15);
    }

    void E();

    g.f I();

    w0<Void> N(f2 requestControl, boolean cancelPreviousTask);

    void m(g.f bundle);

    void u();
}
