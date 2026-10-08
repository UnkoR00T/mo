package do1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: do1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldo1/c;", "", "Ldo1/e;", "document", "Ldo1/d;", "scope", "Ldo1/f;", "status", "<init>", "(Ldo1/e;Ldo1/d;Ldo1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldo1/e;", "()Ldo1/e;", "b", "Ldo1/d;", "()Ldo1/d;", "c", "Ldo1/f;", "()Ldo1/f;", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeputyCardData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43560d = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeputyCardScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f status;

    public DeputyCardData(Document document, DeputyCardScope deputyCardScope, f fVar) {
        this.document = document;
        this.scope = deputyCardScope;
        this.status = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DeputyCardScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeputyCardData)) {
            return false;
        }
        DeputyCardData deputyCardData = (DeputyCardData) other;
        return t.c(this.document, deputyCardData.document) && t.c(this.scope, deputyCardData.scope) && this.status == deputyCardData.status;
    }

    public int hashCode() {
        Document document = this.document;
        return ((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "DeputyCardData(document=" + this.document + ", scope=" + this.scope + ", status=" + this.status + ')';
    }
}
