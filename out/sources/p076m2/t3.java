package p076m2;

import androidx.camera.view.i;
import er.p;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import oq.g;
import oq.i0;
import p071kotlin.Metadata;
import r0.h1;
import r0.i1;
import y2.a0;
import y2.b0;
import y2.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\fH\u0000¢\u0006\u0004\b \u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109R&\u0010>\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b/\u0010KR\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b+\u0010PR\u0014\u0010R\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u0010S\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u00102¨\u0006T"}, d2 = {"Lm2/t3;", "Lm2/s3;", "Lm2/x;", "composition", "Lm2/v;", "context", "Lm2/q1;", "composer", "", "Lm2/u4;", "abandonSet", "Lkotlin/Function0;", "Loq/i0;", "content", "", "reusable", "Lm2/c;", "applier", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "<init>", "(Lm2/x;Lm2/v;Lm2/q1;Ljava/util/Set;Ler/p;ZLm2/c;Ljava/lang/Object;)V", "g", "()V", "c", "Lm2/e5;", "shouldPause", "b", "(Lm2/e5;)Z", "apply", "cancel", "h", "a", "Lm2/x;", "getComposition", "()Lm2/x;", "Lm2/v;", "getContext", "()Lm2/v;", "Lm2/q1;", "getComposer", "()Lm2/q1;", "d", "Ler/p;", "getContent", "()Ler/p;", "e", "Z", "getReusable", "()Z", "f", "Lm2/c;", "getApplier", "()Lm2/c;", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lm2/u3;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "state", "", "i", "J", "owningThread", "Lr0/h1;", "Lm2/f4;", "j", "Lr0/h1;", "invalidScopes", "Ly2/u;", "k", "Ly2/u;", "()Ly2/u;", "rememberManager", "Lm2/s4;", "l", "Lm2/s4;", "()Lm2/s4;", "pausableApplier", "isRecomposing", "isComplete", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x composition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1 composer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> content;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reusable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c<?> applier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<u3> state = new AtomicReference<>(u3.InitialPending);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long owningThread = a0.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private h1<f4> invalidScopes = i1.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final u rememberManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final s4<Object> pausableApplier;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123178a;

        static {
            int[] iArr = new int[u3.values().length];
            try {
                iArr[u3.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u3.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u3.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u3.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u3.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u3.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u3.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f123178a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t3(x xVar, v vVar, q1 q1Var, Set<u4> set, p<? super r, ? super Integer, i0> pVar, boolean z15, c<?> cVar, Object obj) {
        this.composition = xVar;
        this.context = vVar;
        this.composer = q1Var;
        this.content = pVar;
        this.reusable = z15;
        this.applier = cVar;
        this.lock = obj;
        u uVar = new u();
        uVar.r(set, q1Var.g0());
        this.rememberManager = uVar;
        this.pausableApplier = new s4<>(cVar.a());
    }

    private final void c() {
        b0 b0Var = b0.f223360a;
        Object objA = b0Var.a("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    this.pausableApplier.m(this.applier, this.rememberManager);
                    this.rememberManager.m();
                    this.rememberManager.n();
                    this.rememberManager.j();
                    this.composition.Z(null);
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    this.rememberManager.j();
                    this.composition.Z(null);
                    throw th4;
                }
            }
            b0Var.b(objA);
        } catch (Throwable th5) {
            b0.f223360a.b(objA);
            throw th5;
        }
    }

    private final void g() {
        u3 u3Var = u3.RecomposePending;
        u3 u3Var2 = u3.ApplyPending;
        if (i.a(this.state, u3Var, u3Var2)) {
            return;
        }
        w3.b("Unexpected state change from: " + u3Var + " to: " + u3Var2 + '.');
    }

    @Override // p076m2.s3
    public boolean a() {
        return this.state.get().compareTo(u3.ApplyPending) >= 0;
    }

    @Override // p076m2.s3
    public void apply() throws Exception {
        try {
            switch (a.f123178a[this.state.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    c();
                    u3 u3Var = u3.ApplyPending;
                    u3 u3Var2 = u3.Applied;
                    if (i.a(this.state, u3Var, u3Var2)) {
                        return;
                    }
                    w3.b("Unexpected state change from: " + u3Var + " to: " + u3Var2 + '.');
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new oq.p();
            }
        } catch (Exception e15) {
            this.state.set(u3.Invalid);
            throw e15;
        }
    }

    @Override // p076m2.s3
    public boolean b(e5 shouldPause) throws Exception {
        try {
            switch (a.f123178a[this.state.get().ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.n0();
                    }
                    try {
                        this.invalidScopes = this.context.b(this.composition, shouldPause, this.content);
                        if (this.reusable) {
                            this.composer.c0();
                        }
                        u3 u3Var = u3.InitialPending;
                        u3 u3Var2 = u3.RecomposePending;
                        if (!i.a(this.state, u3Var, u3Var2)) {
                            w3.b("Unexpected state change from: " + u3Var + " to: " + u3Var2 + '.');
                        }
                        if (this.invalidScopes.e()) {
                            g();
                        }
                        return a();
                    } catch (Throwable th4) {
                        if (this.reusable) {
                            this.composer.c0();
                        }
                        throw th4;
                    }
                case 2:
                    u3 u3Var3 = u3.RecomposePending;
                    u3 u3Var4 = u3.Recomposing;
                    if (!i.a(this.state, u3Var3, u3Var4)) {
                        w3.b("Unexpected state change from: " + u3Var3 + " to: " + u3Var4 + '.');
                    }
                    long j15 = this.owningThread;
                    try {
                        this.owningThread = a0.a();
                        this.invalidScopes = this.context.r(this.composition, shouldPause, this.invalidScopes);
                        this.owningThread = j15;
                        if (!i.a(this.state, u3Var4, u3Var3)) {
                            w3.b("Unexpected state change from: " + u3Var4 + " to: " + u3Var3 + '.');
                        }
                        if (this.invalidScopes.e()) {
                            g();
                        }
                        return a();
                    } catch (Throwable th5) {
                        this.owningThread = j15;
                        u3 u3Var5 = u3.Recomposing;
                        u3 u3Var6 = u3.RecomposePending;
                        if (!i.a(this.state, u3Var5, u3Var6)) {
                            w3.b("Unexpected state change from: " + u3Var5 + " to: " + u3Var6 + '.');
                        }
                        throw th5;
                    }
                case 3:
                    t.c("Recursive call to resume()");
                    throw new g();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new oq.p();
            }
        } catch (Exception e15) {
            this.state.set(u3.Invalid);
            throw e15;
        }
    }

    @Override // p076m2.s3
    public void cancel() {
        this.state.set(u3.Cancelled);
        h1<v4> h1VarO = this.rememberManager.o();
        this.rememberManager.j();
        this.composition.Z(h1VarO);
    }

    public final s4<Object> d() {
        return this.pausableApplier;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getRememberManager() {
        return this.rememberManager;
    }

    public final boolean f() {
        return this.state.get() == u3.Recomposing && this.owningThread == a0.a();
    }

    public final void h() {
        i.a(this.state, u3.ApplyPending, u3.RecomposePending);
    }
}
