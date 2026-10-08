package p060i1;

import er.l;
import er.r;
import oq.i0;
import p056h1.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Li1/y;", "Lh1/z$a;", "Lkotlin/Function1;", "", "", "key", "Lkotlin/Function2;", "Li1/v0;", "Loq/i0;", "item", "<init>", "(Ler/l;Ler/r;)V", "a", "Ler/l;", "getKey", "()Ler/l;", "b", "Ler/r;", "()Ler/r;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r<v0, Integer, p076m2.r, Integer, i0> item;

    /* JADX WARN: Multi-variable type inference failed */
    public y(l<? super Integer, ? extends Object> lVar, r<? super v0, ? super Integer, ? super p076m2.r, ? super Integer, i0> rVar) {
        this.key = lVar;
        this.item = rVar;
    }

    public final r<v0, Integer, p076m2.r, Integer, i0> a() {
        return this.item;
    }

    @Override // h1.z.a
    public l<Integer, Object> getKey() {
        return this.key;
    }
}
