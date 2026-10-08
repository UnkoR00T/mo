package k3;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lk3/g;", "Lf3/m$c;", "Lg4/q;", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "onDraw", "<init>", "(Ler/l;)V", "Lp3/c;", "y", "(Lp3/c;)V", "r", "Ler/l;", "getOnDraw", "()Ler/l;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends f3.m.c implements g4.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p3.f, i0> onDraw;

    public g(er.l<? super p3.f, i0> lVar) {
        this.onDraw = lVar;
    }

    public final void n3(er.l<? super p3.f, i0> lVar) {
        this.onDraw = lVar;
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        this.onDraw.b(cVar);
        cVar.H2();
    }
}
