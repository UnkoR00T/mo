package tq0;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tq0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006$"}, d2 = {"Ltq0/p;", "", "", "Ltq0/e;", "cumulatedSubtypeFees", "Ltq0/g;", "type", "Ltq0/s;", "subtypes", "Ljava/math/BigDecimal;", "amount", "<init>", "(Ljava/util/List;Ltq0/g;Ljava/util/List;Ljava/math/BigDecimal;)V", "", "currentAmountOfSelectedSubTypes", "b", "(I)Ljava/math/BigDecimal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ltq0/g;", "e", "()Ltq0/g;", "d", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LandRegisterDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BELandRegisterDocumentCumulatedSubtypeFee> cumulatedSubtypeFees;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LandRegisterSubDocument> subtypes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    public LandRegisterDocument(List<BELandRegisterDocumentCumulatedSubtypeFee> list, g gVar, List<LandRegisterSubDocument> list2, BigDecimal bigDecimal) {
        this.cumulatedSubtypeFees = list;
        this.type = gVar;
        this.subtypes = list2;
        this.amount = bigDecimal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final BigDecimal b(int currentAmountOfSelectedSubTypes) {
        Object next;
        BigDecimal bigDecimal = this.amount;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        if (currentAmountOfSelectedSubTypes == 0) {
            return new BigDecimal(0);
        }
        if (currentAmountOfSelectedSubTypes == 1) {
            return ((LandRegisterSubDocument) pq.v.l0(this.subtypes)).getAmount();
        }
        Iterator<T> it = this.cumulatedSubtypeFees.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BELandRegisterDocumentCumulatedSubtypeFee) next).getTotal() != currentAmountOfSelectedSubTypes);
        BELandRegisterDocumentCumulatedSubtypeFee bELandRegisterDocumentCumulatedSubtypeFee = (BELandRegisterDocumentCumulatedSubtypeFee) next;
        if (bELandRegisterDocumentCumulatedSubtypeFee != null) {
            return bELandRegisterDocumentCumulatedSubtypeFee.getAmount();
        }
        return null;
    }

    public final List<BELandRegisterDocumentCumulatedSubtypeFee> c() {
        return this.cumulatedSubtypeFees;
    }

    public final List<LandRegisterSubDocument> d() {
        return this.subtypes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandRegisterDocument)) {
            return false;
        }
        LandRegisterDocument landRegisterDocument = (LandRegisterDocument) other;
        return fr.t.c(this.cumulatedSubtypeFees, landRegisterDocument.cumulatedSubtypeFees) && this.type == landRegisterDocument.type && fr.t.c(this.subtypes, landRegisterDocument.subtypes) && fr.t.c(this.amount, landRegisterDocument.amount);
    }

    public int hashCode() {
        int iHashCode = ((((this.cumulatedSubtypeFees.hashCode() * 31) + this.type.hashCode()) * 31) + this.subtypes.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "LandRegisterDocument(cumulatedSubtypeFees=" + this.cumulatedSubtypeFees + ", type=" + this.type + ", subtypes=" + this.subtypes + ", amount=" + this.amount + ")";
    }
}
