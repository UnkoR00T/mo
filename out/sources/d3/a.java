package d3;

import er.l;
import fr.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ld3/a;", "", "Lkotlin/Function1;", "Loq/i0;", "readObserver", "writeObserver", "<init>", "(Ler/l;Ler/l;)V", "a", "Ler/l;", "()Ler/l;", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Object, i0> readObserver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<Object, i0> writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final l<Object, i0> a() {
        return this.readObserver;
    }

    public final l<Object, i0> b() {
        return this.writeObserver;
    }

    public a(l<Object, i0> lVar, l<Object, i0> lVar2) {
        this.readObserver = lVar;
        this.writeObserver = lVar2;
    }

    public /* synthetic */ a(l lVar, l lVar2, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : lVar, (i15 & 2) != 0 ? null : lVar2);
    }
}
