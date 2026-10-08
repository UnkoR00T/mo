package tq;

import er.l;
import p071kotlin.Metadata;
import tq.i.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltq/b;", "Ltq/i$b;", "B", "E", "Ltq/i$c;", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Ltq/i$c;Ler/l;)V", "element", "b", "(Ltq/i$b;)Ltq/i$b;", "key", "", "a", "(Ltq/i$c;)Z", "Ler/l;", "Ltq/i$c;", "topmostKey", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<B extends i.b, E extends B> implements i.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<i.b, E> safeCast;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i.c<?> topmostKey;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [tq.i$c<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [er.l<? super tq.i$b, ? extends E extends B>, er.l<tq.i$b, E extends B>] */
    public b(i.c<B> cVar, l<? super i.b, ? extends E> lVar) {
        this.safeCast = lVar;
        this.topmostKey = cVar instanceof b ? (i.c<B>) ((b) cVar).topmostKey : cVar;
    }

    public final boolean a(i.c<?> key) {
        return key == this || this.topmostKey == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ltq/i$b;)TE; */
    public final i.b b(i.b element) {
        return (i.b) this.safeCast.b(element);
    }
}
