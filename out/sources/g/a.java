package g;

import PRN.a0;
import a.h;
import com.google.common.util.concurrent.q;
import e.f2;
import e.u0;
import e.u2;
import e.z1;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R(\u0010(\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Lg/a;", "Le/z1;", "La/h;", "compat", "Le/u2;", "threads", "Le/u0;", "requestListener", "<init>", "(La/h;Le/u2;Le/u0;)V", "", "tag", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "f", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/q;", "Loq/i0;", "reset", "()V", "Lg/f;", "bundle", "a", "(Lg/f;)Lcom/google/common/util/concurrent/q;", "d", "()Lg/f;", "c", "()Lcom/google/common/util/concurrent/q;", "La/h;", "b", "Le/u2;", "Le/u0;", "getRequestListener$camera_camera2", "()Le/u0;", "Le/f2;", "Le/f2;", "_useCaseCameraRequestControl", "value", "e", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h compat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0 requestListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f2 _useCaseCameraRequestControl;

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg/a$a;", "", "<init>", "()V", "La/h;", "compat", "Le/u2;", "threads", "Le/u0;", "requestListener", "Lg/a;", "a", "(La/h;Le/u2;Le/u0;)Lg/a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(h compat, u2 threads, u0 requestListener) {
            return new a(compat, threads, requestListener, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(h hVar, u2 u2Var, u0 u0Var, k kVar) {
        this(hVar, u2Var, u0Var);
    }

    private final q<Void> f(String tag) {
        return a0.f.i(a0.g(h.y(this.compat, get_useCaseCameraRequestControl(), false, 2, null), tag));
    }

    public final q<Void> a(f bundle) {
        this.compat.m(bundle);
        return f("addCaptureRequestOptions");
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._useCaseCameraRequestControl = f2Var;
        if (f2Var != null) {
            this.requestListener.G(this.compat);
            this.requestListener.o(this.compat, this.threads.getSequentialExecutor());
            this.compat.N(f2Var, false);
        }
    }

    public final q<Void> c() {
        this.compat.E();
        return f("clearCaptureRequestOptions");
    }

    public final f d() {
        return this.compat.I();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public f2 get_useCaseCameraRequestControl() {
        return this._useCaseCameraRequestControl;
    }

    @Override // e.z1
    public void reset() {
        this.compat.u();
        this.requestListener.G(this.compat);
    }

    private a(h hVar, u2 u2Var, u0 u0Var) {
        this.compat = hVar;
        this.threads = u2Var;
        this.requestListener = u0Var;
    }
}
