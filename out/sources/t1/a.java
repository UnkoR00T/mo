package t1;

import g4.q1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lt1/a;", "Lf3/m$c;", "Lg4/q1;", "Lkotlin/Function1;", "Lp1/a;", "Loq/i0;", "builder", "<init>", "(Ler/l;)V", "r", "Ler/l;", "n3", "()Ler/l;", "setBuilder", "", "T", "()Ljava/lang/Object;", "traverseKey", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f3.m.c implements q1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p1.a, i0> builder;

    public a(er.l<? super p1.a, i0> lVar) {
        this.builder = lVar;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T */
    public Object getTraverseKey() {
        return f.f186829a;
    }

    public final er.l<p1.a, i0> n3() {
        return this.builder;
    }
}
