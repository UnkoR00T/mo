package er0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: er0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ler0/b;", "", "", "Ler0/c;", "documentStatuses", "Ler0/f;", "certificateStatuses", "", "updateVehicleCardsRequired", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEDocumentAndCertificateStatuses {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEDocumentStatus> documentStatuses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEExtUserCertificateStatus> certificateStatuses;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateVehicleCardsRequired;

    public BEDocumentAndCertificateStatuses(List<BEDocumentStatus> list, List<BEExtUserCertificateStatus> list2, boolean z15) {
        this.documentStatuses = list;
        this.certificateStatuses = list2;
        this.updateVehicleCardsRequired = z15;
    }

    public final List<BEExtUserCertificateStatus> a() {
        return this.certificateStatuses;
    }

    public final List<BEDocumentStatus> b() {
        return this.documentStatuses;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUpdateVehicleCardsRequired() {
        return this.updateVehicleCardsRequired;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEDocumentAndCertificateStatuses)) {
            return false;
        }
        BEDocumentAndCertificateStatuses bEDocumentAndCertificateStatuses = (BEDocumentAndCertificateStatuses) other;
        return t.c(this.documentStatuses, bEDocumentAndCertificateStatuses.documentStatuses) && t.c(this.certificateStatuses, bEDocumentAndCertificateStatuses.certificateStatuses) && this.updateVehicleCardsRequired == bEDocumentAndCertificateStatuses.updateVehicleCardsRequired;
    }

    public int hashCode() {
        return (((this.documentStatuses.hashCode() * 31) + this.certificateStatuses.hashCode()) * 31) + Boolean.hashCode(this.updateVehicleCardsRequired);
    }

    public String toString() {
        return "BEDocumentAndCertificateStatuses(documentStatuses=" + this.documentStatuses + ", certificateStatuses=" + this.certificateStatuses + ", updateVehicleCardsRequired=" + this.updateVehicleCardsRequired + ")";
    }
}
