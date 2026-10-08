package g1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001Bg\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg1/j;", "Lh1/z$a;", "Lkotlin/Function1;", "", "", "key", "Lkotlin/Function2;", "Lg1/x;", "Lg1/c;", "span", "type", "Lg1/v;", "Loq/i0;", "item", "<init>", "(Ler/l;Ler/p;Ler/l;Ler/r;)V", "a", "Ler/l;", "getKey", "()Ler/l;", "b", "Ler/p;", "()Ler/p;", "c", "getType", "d", "Ler/r;", "()Ler/r;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements h1.z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.p<x, Integer, c> span;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, Object> type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.r<v, Integer, p076m2.r, Integer, oq.i0> item;

    /* JADX WARN: Multi-variable type inference failed */
    public j(er.l<? super Integer, ? extends Object> lVar, er.p<? super x, ? super Integer, c> pVar, er.l<? super Integer, ? extends Object> lVar2, er.r<? super v, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final er.r<v, Integer, p076m2.r, Integer, oq.i0> a() {
        return this.item;
    }

    public final er.p<x, Integer, c> b() {
        return this.span;
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
