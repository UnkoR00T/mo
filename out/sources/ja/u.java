package ja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001f"}, d2 = {"Lja/u;", "T", "", "Lkotlin/Function1;", "Loq/i0;", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(Ler/l;Ler/a;)V", "callback", "b", "(Ljava/lang/Object;)V", "c", "a", "()Z", "Ler/l;", "Ler/a;", "Lla/b;", "Lla/b;", "lock", "", "d", "Ljava/util/List;", "callbacks", "value", "e", "Z", "getInvalid$paging_common", "invalid", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<T, oq.i0> callbackInvoker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> invalidGetter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final la.b lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<T> callbacks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean invalid;

    /* JADX WARN: Multi-variable type inference failed */
    public u(er.l<? super T, oq.i0> lVar, er.a<Boolean> aVar) {
        this.callbackInvoker = lVar;
        this.invalidGetter = aVar;
        this.lock = new la.b();
        this.callbacks = new ArrayList();
    }

    public final boolean a() {
        if (this.invalid) {
            return false;
        }
        synchronized (this.lock) {
            if (this.invalid) {
                return false;
            }
            this.invalid = true;
            List listF1 = pq.v.f1(this.callbacks);
            this.callbacks.clear();
            er.l<T, oq.i0> lVar = this.callbackInvoker;
            Iterator<T> it = listF1.iterator();
            while (it.hasNext()) {
                lVar.b(it.next());
            }
            return true;
        }
    }

    public final void b(T callback) {
        er.a<Boolean> aVar = this.invalidGetter;
        boolean z15 = true;
        if (aVar != null && aVar.a().booleanValue()) {
            a();
        }
        if (this.invalid) {
            this.callbackInvoker.b(callback);
            return;
        }
        synchronized (this.lock) {
            if (!this.invalid) {
                this.callbacks.add(callback);
                z15 = false;
            }
        }
        if (z15) {
            this.callbackInvoker.b(callback);
        }
    }

    public final void c(T callback) {
        synchronized (this.lock) {
            this.callbacks.remove(callback);
        }
    }

    public /* synthetic */ u(er.l lVar, er.a aVar, int i15, fr.k kVar) {
        this(lVar, (i15 & 2) != 0 ? null : aVar);
    }
}
