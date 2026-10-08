package j62;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j62.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lj62/e;", "", "Lj62/b;", "document", "Lj62/g;", "scope", "Lj62/c;", "documentStatus", "<init>", "(Lj62/b;Lj62/g;Lj62/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj62/b;", "getDocument", "()Lj62/b;", "b", "Lj62/g;", "()Lj62/g;", "c", "Lj62/c;", "()Lj62/c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FamilyCardData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99810d = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FamilyCardScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c documentStatus;

    public FamilyCardData(Document document, FamilyCardScope familyCardScope, c cVar) {
        this.document = document;
        this.scope = familyCardScope;
        this.documentStatus = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FamilyCardScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyCardData)) {
            return false;
        }
        FamilyCardData familyCardData = (FamilyCardData) other;
        return t.c(this.document, familyCardData.document) && t.c(this.scope, familyCardData.scope) && this.documentStatus == familyCardData.documentStatus;
    }

    public int hashCode() {
        Document document = this.document;
        return ((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.documentStatus.hashCode();
    }

    public String toString() {
        return "FamilyCardData(document=" + this.document + ", scope=" + this.scope + ", documentStatus=" + this.documentStatus + ')';
    }
}
