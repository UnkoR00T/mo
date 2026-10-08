package hx0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hx0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lhx0/d;", "", "", "Lhx0/c;", "regular", "Lhx0/b;", "certified", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/util/List;Ljava/util/List;)Lhx0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableDocuments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableDocumentCardData> regular;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableCertifiedDocumentCardData> certified;

    public AvailableDocuments(List<AvailableDocumentCardData> list, List<AvailableCertifiedDocumentCardData> list2) {
        this.regular = list;
        this.certified = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableDocuments b(AvailableDocuments availableDocuments, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = availableDocuments.regular;
        }
        if ((i15 & 2) != 0) {
            list2 = availableDocuments.certified;
        }
        return availableDocuments.a(list, list2);
    }

    public final AvailableDocuments a(List<AvailableDocumentCardData> regular, List<AvailableCertifiedDocumentCardData> certified) {
        return new AvailableDocuments(regular, certified);
    }

    public final List<AvailableCertifiedDocumentCardData> c() {
        return this.certified;
    }

    public final List<AvailableDocumentCardData> d() {
        return this.regular;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableDocuments)) {
            return false;
        }
        AvailableDocuments availableDocuments = (AvailableDocuments) other;
        return t.c(this.regular, availableDocuments.regular) && t.c(this.certified, availableDocuments.certified);
    }

    public int hashCode() {
        return (this.regular.hashCode() * 31) + this.certified.hashCode();
    }

    public String toString() {
        return "AvailableDocuments(regular=" + this.regular + ", certified=" + this.certified + ')';
    }
}
