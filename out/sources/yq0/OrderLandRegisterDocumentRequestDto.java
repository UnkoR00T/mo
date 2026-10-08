package yq0;

import java.math.BigDecimal;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyq0/z;", "", "Ljava/math/BigDecimal;", "amount", "Lyq0/j;", "documentType", "", "entryId", "", "Lyq0/h;", "documentSubtypes", "<init>", "(Ljava/math/BigDecimal;Lyq0/j;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "b", "Lyq0/j;", "getDocumentType", "()Lyq0/j;", "c", "Ljava/lang/String;", "getEntryId", "d", "Ljava/util/List;", "getDocumentSubtypes", "()Ljava/util/List;", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderLandRegisterDocumentRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final j documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("entryId")
    private final String entryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentSubtypes")
    private final List<h> documentSubtypes;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderLandRegisterDocumentRequestDto(BigDecimal bigDecimal, j jVar, String str, List<? extends h> list) {
        this.amount = bigDecimal;
        this.documentType = jVar;
        this.entryId = str;
        this.documentSubtypes = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderLandRegisterDocumentRequestDto)) {
            return false;
        }
        OrderLandRegisterDocumentRequestDto orderLandRegisterDocumentRequestDto = (OrderLandRegisterDocumentRequestDto) other;
        return fr.t.c(this.amount, orderLandRegisterDocumentRequestDto.amount) && this.documentType == orderLandRegisterDocumentRequestDto.documentType && fr.t.c(this.entryId, orderLandRegisterDocumentRequestDto.entryId) && fr.t.c(this.documentSubtypes, orderLandRegisterDocumentRequestDto.documentSubtypes);
    }

    public int hashCode() {
        int iHashCode = ((((this.amount.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.entryId.hashCode()) * 31;
        List<h> list = this.documentSubtypes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "OrderLandRegisterDocumentRequestDto(amount=" + this.amount + ", documentType=" + this.documentType + ", entryId=" + this.entryId + ", documentSubtypes=" + this.documentSubtypes + ')';
    }
}
