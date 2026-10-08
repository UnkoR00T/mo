package p076m2;

import er.l;
import java.util.ArrayList;
import java.util.List;
import ju.n;
import ju.p;
import oq.i0;
import oq.t;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import vq.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm2/u1;", "", "<init>", "()V", "Loq/i0;", "d", "f", "c", "(Ltq/e;)Ljava/lang/Object;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "a", "Ljava/lang/Object;", "lock", "", "Ltq/e;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<e<i0>> awaiters = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<e<i0>> spareList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean _isOpen = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<i0> f123188b;

        /* JADX WARN: Multi-variable type inference failed */
        a(n<? super i0> nVar) {
            this.f123188b = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            Object obj = u1.this.lock;
            u1 u1Var = u1.this;
            n<i0> nVar = this.f123188b;
            synchronized (obj) {
                u1Var.awaiters.remove(nVar);
                i0 i0Var = i0.f148189a;
            }
        }
    }

    public final Object c(e<? super i0> eVar) {
        if (e()) {
            return i0.f148189a;
        }
        p pVar = new p(b.c(eVar), 1);
        pVar.D();
        synchronized (this.lock) {
            this.awaiters.add(pVar);
        }
        pVar.E(new a(pVar));
        Object objX = pVar.x();
        if (objX == b.e()) {
            g.c(eVar);
        }
        return objX == b.e() ? objX : i0.f148189a;
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            i0 i0Var = i0.f148189a;
        }
    }

    public final boolean e() {
        boolean z15;
        synchronized (this.lock) {
            z15 = this._isOpen;
        }
        return z15;
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                if (e()) {
                    return;
                }
                List<e<i0>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    e<i0> eVar = list.get(i15);
                    t.Companion companion = t.INSTANCE;
                    eVar.i(t.b(i0.f148189a));
                }
                list.clear();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
