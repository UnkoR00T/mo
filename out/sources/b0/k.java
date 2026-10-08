package b0;

import o.e1;
import o.t0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lb0/k;", "Lo/t0$j;", "screenFlash", "<init>", "(Lo/t0$j;)V", "Loq/i0;", "e", "()V", "d", "", "expirationTimeMillis", "Lo/t0$k;", "screenFlashListener", "a", "(JLo/t0$k;)V", "clear", "h", "()Lo/t0$j;", "f", "Lo/t0$j;", "", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "Lo/t0$k;", "pendingListener", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements t0.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0.j screenFlash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClearScreenFlashPending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t0.k pendingListener;

    /* JADX INFO: renamed from: b0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb0/k$a;", "", "<init>", "()V", "Lo/t0$j;", "screenFlash", "Lb0/k;", "a", "(Lo/t0$j;)Lb0/k;", "", "TAG", "Ljava/lang/String;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final k a(t0.j screenFlash) {
            return new k(screenFlash, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ k(t0.j jVar, fr.k kVar) {
        this(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k kVar) {
        synchronized (kVar.lock) {
            try {
                if (kVar.pendingListener == null) {
                    e1.o("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                kVar.e();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void d() {
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    t0.j jVar = this.screenFlash;
                    if (jVar != null) {
                        jVar.clear();
                    } else {
                        e1.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    e1.o("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void e() {
        synchronized (this.lock) {
            try {
                t0.k kVar = this.pendingListener;
                if (kVar != null) {
                    kVar.a();
                }
                this.pendingListener = null;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static final k g(t0.j jVar) {
        return INSTANCE.a(jVar);
    }

    @Override // o.t0.j
    public void a(long expirationTimeMillis, t0.k screenFlashListener) {
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            i0 i0Var = i0.f148189a;
        }
        t0.j jVar = this.screenFlash;
        if (jVar != null) {
            jVar.a(expirationTimeMillis, new t0.k() { // from class: b0.j
                @Override // o.t0.k
                public final void a() {
                    k.c(this.f15590a);
                }
            });
        } else {
            e1.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // o.t0.j
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final t0.j getScreenFlash() {
        return this.screenFlash;
    }

    private k(t0.j jVar) {
        this.screenFlash = jVar;
        this.lock = new Object();
    }
}
