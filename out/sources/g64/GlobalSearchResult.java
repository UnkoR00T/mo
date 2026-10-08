package g64;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: g64.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg64/e;", "", "", "", "serviceTypes", "Lg64/a;", "documentTypes", "menuItems", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlobalSearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> serviceTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<GlobalSearchDocumentResult> documentTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> menuItems;

    public GlobalSearchResult() {
        this(null, null, null, 7, null);
    }

    public final List<GlobalSearchDocumentResult> a() {
        return this.documentTypes;
    }

    public final List<String> b() {
        return this.menuItems;
    }

    public final List<String> c() {
        return this.serviceTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalSearchResult)) {
            return false;
        }
        GlobalSearchResult globalSearchResult = (GlobalSearchResult) other;
        return t.c(this.serviceTypes, globalSearchResult.serviceTypes) && t.c(this.documentTypes, globalSearchResult.documentTypes) && t.c(this.menuItems, globalSearchResult.menuItems);
    }

    public int hashCode() {
        return (((this.serviceTypes.hashCode() * 31) + this.documentTypes.hashCode()) * 31) + this.menuItems.hashCode();
    }

    public String toString() {
        return "GlobalSearchResult(serviceTypes=" + this.serviceTypes + ", documentTypes=" + this.documentTypes + ", menuItems=" + this.menuItems + ")";
    }

    public GlobalSearchResult(List<String> list, List<GlobalSearchDocumentResult> list2, List<String> list3) {
        this.serviceTypes = list;
        this.documentTypes = list2;
        this.menuItems = list3;
    }

    public /* synthetic */ GlobalSearchResult(List list, List list2, List list3, int i15, k kVar) {
        this((i15 & 1) != 0 ? v.n() : list, (i15 & 2) != 0 ? v.n() : list2, (i15 & 4) != 0 ? v.n() : list3);
    }
}
