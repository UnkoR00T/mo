package t3;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lt3/l;", "", "<init>", "()V", "Loq/i0;", "c", "Lp3/f;", "a", "(Lp3/f;)V", "Lkotlin/Function1;", "Ler/l;", "b", "()Ler/l;", "d", "(Ler/l;)V", "invalidateListener", "Lt3/c;", "Lt3/g;", "Lt3/m;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private er.l<? super l, i0> invalidateListener;

    public /* synthetic */ l(fr.k kVar) {
        this();
    }

    public abstract void a(p3.f fVar);

    public er.l<l, i0> b() {
        return this.invalidateListener;
    }

    public final void c() {
        er.l<l, i0> lVarB = b();
        if (lVarB != null) {
            lVarB.b(this);
        }
    }

    public void d(er.l<? super l, i0> lVar) {
        this.invalidateListener = lVar;
    }

    private l() {
    }
}
