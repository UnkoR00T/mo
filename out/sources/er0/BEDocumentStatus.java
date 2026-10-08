package er0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: er0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ler0/c;", "", "", "id", "Ler0/h;", "status", "", "updateRequired", "<init>", "(Ljava/lang/String;Ler0/h;Z)V", "a", "(Ljava/lang/String;Ler0/h;Z)Ler0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ler0/h;", "d", "()Ler0/h;", "Z", "e", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEDocumentStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateRequired;

    public BEDocumentStatus(String str, h hVar, boolean z15) {
        this.id = str;
        this.status = hVar;
        this.updateRequired = z15;
    }

    public static /* synthetic */ BEDocumentStatus b(BEDocumentStatus bEDocumentStatus, String str, h hVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = bEDocumentStatus.id;
        }
        if ((i15 & 2) != 0) {
            hVar = bEDocumentStatus.status;
        }
        if ((i15 & 4) != 0) {
            z15 = bEDocumentStatus.updateRequired;
        }
        return bEDocumentStatus.a(str, hVar, z15);
    }

    public final BEDocumentStatus a(String id5, h status, boolean updateRequired) {
        return new BEDocumentStatus(id5, status, updateRequired);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUpdateRequired() {
        return this.updateRequired;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEDocumentStatus)) {
            return false;
        }
        BEDocumentStatus bEDocumentStatus = (BEDocumentStatus) other;
        return t.c(this.id, bEDocumentStatus.id) && this.status == bEDocumentStatus.status && this.updateRequired == bEDocumentStatus.updateRequired;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.updateRequired);
    }

    public String toString() {
        return "BEDocumentStatus(id=" + this.id + ", status=" + this.status + ", updateRequired=" + this.updateRequired + ")";
    }
}
