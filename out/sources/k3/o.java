package k3;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lk3/o;", "Lf3/m$c;", "Lg4/q;", "Lkotlin/Function1;", "Lp3/c;", "Loq/i0;", "onDraw", "<init>", "(Ler/l;)V", "y", "(Lp3/c;)V", "r", "Ler/l;", "getOnDraw", "()Ler/l;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o extends f3.m.c implements g4.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p3.c, i0> onDraw;

    public o(er.l<? super p3.c, i0> lVar) {
        this.onDraw = lVar;
    }

    public final void n3(er.l<? super p3.c, i0> lVar) {
        this.onDraw = lVar;
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        this.onDraw.b(cVar);
    }
}
