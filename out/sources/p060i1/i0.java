package p060i1;

import er.l;
import er.r;
import p056h1.n;
import p056h1.o2;
import p056h1.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Li1/i0;", "Lh1/z;", "Li1/y;", "Lkotlin/Function2;", "Li1/v0;", "", "Loq/i0;", "pageContent", "Lkotlin/Function1;", "", "key", "pageCount", "<init>", "(Ler/r;Ler/l;I)V", "a", "Ler/r;", "getPageContent", "()Ler/r;", "b", "Ler/l;", "getKey", "()Ler/l;", "c", "I", "getPageCount", "()I", "Lh1/n;", "d", "Lh1/n;", "l", "()Lh1/n;", "intervals", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i0 extends z<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r<v0, Integer, p076m2.r, Integer, oq.i0> pageContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<Integer, Object> key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n<y> intervals;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(r<? super v0, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> rVar, l<? super Integer, ? extends Object> lVar, int i15) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i15;
        o2 o2Var = new o2();
        o2Var.b(i15, new y(lVar, rVar));
        this.intervals = o2Var;
    }

    @Override // p056h1.z
    public n<y> l() {
        return this.intervals;
    }
}
