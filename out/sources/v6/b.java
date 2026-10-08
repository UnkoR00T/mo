package v6;

import er.l;
import p071kotlin.Metadata;
import u6.d;
import u6.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lv6/b;", "T", "Lu6/e;", "Lkotlin/Function1;", "Lu6/d;", "produceNewData", "<init>", "(Ler/l;)V", "ex", "a", "(Lu6/d;Ltq/e;)Ljava/lang/Object;", "Ler/l;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<d, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super d, ? extends T> lVar) {
        this.produceNewData = lVar;
    }

    @Override // u6.e
    public Object a(d dVar, tq.e<? super T> eVar) {
        return this.produceNewData.b(dVar);
    }
}
