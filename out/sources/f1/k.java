package f1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf1/k;", "Lh1/z$a;", "Lkotlin/Function1;", "", "", "key", "type", "Lkotlin/Function2;", "Lf1/e;", "Loq/i0;", "item", "<init>", "(Ler/l;Ler/l;Ler/r;)V", "a", "Ler/l;", "getKey", "()Ler/l;", "b", "getType", "c", "Ler/r;", "()Ler/r;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements h1.z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, Object> type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.r<e, Integer, p076m2.r, Integer, oq.i0> item;

    /* JADX WARN: Multi-variable type inference failed */
    public k(er.l<? super Integer, ? extends Object> lVar, er.l<? super Integer, ? extends Object> lVar2, er.r<? super e, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final er.r<e, Integer, p076m2.r, Integer, oq.i0> a() {
        return this.item;
    }

    @Override // h1.z.a
    public er.l<Integer, Object> getKey() {
        return this.key;
    }

    @Override // h1.z.a
    public er.l<Integer, Object> getType() {
        return this.type;
    }
}
