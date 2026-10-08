package p076m2;

import er.a;
import fr.t;
import lu.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lm2/k5;", "", "<init>", "()V", "T", "Llu/z;", "Loq/i0;", "channel", "Lkotlin/Function0;", "block", "c", "(Llu/z;Ler/a;)Ljava/lang/Object;", "b", "(Llu/z;)V", "a", "Lm2/l5;", "Lm2/l5;", "managerImpl", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l5 managerImpl = new h5();

    public final void a() {
        l5 l5Var = this.managerImpl;
        if (!(l5Var != null)) {
            w3.b("Called dispose on a manager that has been disposed of");
        }
        l5Var.c();
        this.managerImpl = null;
    }

    public final void b(z<? super i0> channel) {
        l5 l5Var = this.managerImpl;
        if (l5Var != null) {
            l5Var.f(channel);
        }
    }

    public final <T> T c(z<? super i0> channel, a<? extends T> block) {
        h5 h5Var;
        z<i0> zVarK;
        if (!(this.managerImpl != null)) {
            w3.b("Called runAndWatch on a manager that has been disposed of");
        }
        l5 l5Var = this.managerImpl;
        if ((l5Var instanceof h5) && (zVarK = (h5Var = (h5) l5Var).k()) != null && !t.c(zVarK, channel)) {
            this.managerImpl = h5Var.l();
        }
        return (T) this.managerImpl.g(channel, block);
    }
}
