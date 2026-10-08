package ws1;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ws1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lws1/d;", "", "Lws1/a;", "document", "Lws1/e;", "scope", "<init>", "(Lws1/a;Lws1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lws1/a;", "()Lws1/a;", "b", "Lws1/e;", "()Lws1/e;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeCardData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214806c = b0.f97726c | fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RefugeeCardScope scope;

    public RefugeeCardData(Document document, RefugeeCardScope refugeeCardScope) {
        this.document = document;
        this.scope = refugeeCardScope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RefugeeCardScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeCardData)) {
            return false;
        }
        RefugeeCardData refugeeCardData = (RefugeeCardData) other;
        return t.c(this.document, refugeeCardData.document) && t.c(this.scope, refugeeCardData.scope);
    }

    public int hashCode() {
        Document document = this.document;
        return ((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "RefugeeCardData(document=" + this.document + ", scope=" + this.scope + ')';
    }
}
