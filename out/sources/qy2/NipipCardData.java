package qy2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qy2.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lqy2/e;", "", "Lqy2/a;", "document", "Lqy2/g;", "scope", "Lqy2/b;", "status", "<init>", "(Lqy2/a;Lqy2/g;Lqy2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqy2/a;", "()Lqy2/a;", "b", "Lqy2/g;", "()Lqy2/g;", "c", "Lqy2/b;", "()Lqy2/b;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NipipCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NipipCardScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b status;

    public NipipCardData(Document document, NipipCardScope nipipCardScope, b bVar) {
        this.document = document;
        this.scope = nipipCardScope;
        this.status = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final NipipCardScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NipipCardData)) {
            return false;
        }
        NipipCardData nipipCardData = (NipipCardData) other;
        return t.c(this.document, nipipCardData.document) && t.c(this.scope, nipipCardData.scope) && this.status == nipipCardData.status;
    }

    public int hashCode() {
        Document document = this.document;
        return ((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NipipCardData(document=" + this.document + ", scope=" + this.scope + ", status=" + this.status + ')';
    }
}
