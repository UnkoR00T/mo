package fa;

import ea.NavEntry;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lfa/h;", "", "T", "getKey", "()Ljava/lang/Object;", "key", "", "Lea/m;", "getEntries", "()Ljava/util/List;", "entries", "a", "previousEntries", "Lkotlin/Function0;", "Loq/i0;", "getContent", "()Ler/p;", "content", "", "", "e", "()Ljava/util/Map;", "metadata", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface h<T> {
    List<NavEntry<T>> a();

    default Map<String, Object> e() {
        Map<String, Object> mapE;
        NavEntry navEntry = (NavEntry) pq.v.z0(getEntries());
        return (navEntry == null || (mapE = navEntry.e()) == null) ? v0.i() : mapE;
    }

    er.p<p076m2.r, Integer, i0> getContent();

    List<NavEntry<T>> getEntries();

    Object getKey();
}
