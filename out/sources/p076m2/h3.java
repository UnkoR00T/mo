package p076m2;

import er.l;
import oq.i0;
import p071kotlin.Metadata;
import y2.b;
import y2.c;
import y2.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm2/h3;", "", "Lkotlin/Function0;", "Loq/i0;", "onNewAwaiters", "<init>", "(Ler/a;)V", "action", "Lm2/g;", "g", "(Ler/a;)Lm2/g;", "d", "()V", "Ly2/b;", "a", "Ly2/c;", "isFrameOngoing", "Ly2/e;", "Lm2/h3$a;", "b", "Ly2/e;", "frameEndQueue", "c", "Ler/a;", "", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c isFrameOngoing = b.b(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e<a> frameEndQueue = new e<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onNewAwaiters;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm2/h3$a;", "Ly2/e$a;", "Lkotlin/Function0;", "Loq/i0;", "onNextFrameEnd", "<init>", "(Ler/a;)V", "a", "()V", "c", "", "exception", "b", "(Ljava/lang/Throwable;)V", "Ler/a;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private er.a<i0> onNextFrameEnd;

        public a(er.a<i0> aVar) {
            this.onNextFrameEnd = aVar;
        }

        @Override // y2.e.a
        public void a() {
            this.onNextFrameEnd = null;
        }

        @Override // y2.e.a
        public void b(Throwable exception) throws Throwable {
            throw exception;
        }

        public final void c() {
            er.a<i0> aVar = this.onNextFrameEnd;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public h3(final er.a<i0> aVar) {
        this.onNewAwaiters = new er.a() { // from class: m2.g3
            @Override // er.a
            public final Object a() {
                return h3.f(this.f122937a, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(a aVar) {
        aVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(h3 h3Var, er.a aVar) {
        if (!b.c(h3Var.isFrameOngoing)) {
            aVar.a();
        }
        return i0.f148189a;
    }

    public final boolean c() {
        return this.frameEndQueue.f();
    }

    public final void d() {
        b.e(this.isFrameOngoing, false);
        this.frameEndQueue.e(new l() { // from class: m2.f3
            @Override // er.l
            public final Object b(Object obj) {
                return h3.e((h3.a) obj);
            }
        });
    }

    public final g g(er.a<i0> action) {
        return this.frameEndQueue.b(new a(action), this.onNewAwaiters);
    }
}
