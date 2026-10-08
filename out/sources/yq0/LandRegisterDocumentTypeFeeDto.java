package yq0;

import java.math.BigDecimal;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lyq0/k;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lyq0/e;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "cumulatedSubtypeFees", "Lyq0/i;", "c", "subtypes", "Lyq0/j;", "Lyq0/j;", "d", "()Lyq0/j;", "type", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LandRegisterDocumentTypeFeeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cumulatedSubtypeFees")
    private final List<LandRegisterDocumentCumulatedSubtypeFeeDto> cumulatedSubtypeFees;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subtypes")
    private final List<LandRegisterDocumentSubtypeFeeDto> subtypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final j type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<LandRegisterDocumentCumulatedSubtypeFeeDto> b() {
        return this.cumulatedSubtypeFees;
    }

    public final List<LandRegisterDocumentSubtypeFeeDto> c() {
        return this.subtypes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandRegisterDocumentTypeFeeDto)) {
            return false;
        }
        LandRegisterDocumentTypeFeeDto landRegisterDocumentTypeFeeDto = (LandRegisterDocumentTypeFeeDto) other;
        return fr.t.c(this.cumulatedSubtypeFees, landRegisterDocumentTypeFeeDto.cumulatedSubtypeFees) && fr.t.c(this.subtypes, landRegisterDocumentTypeFeeDto.subtypes) && this.type == landRegisterDocumentTypeFeeDto.type && fr.t.c(this.amount, landRegisterDocumentTypeFeeDto.amount);
    }

    public int hashCode() {
        int iHashCode = ((((this.cumulatedSubtypeFees.hashCode() * 31) + this.subtypes.hashCode()) * 31) + this.type.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "LandRegisterDocumentTypeFeeDto(cumulatedSubtypeFees=" + this.cumulatedSubtypeFees + ", subtypes=" + this.subtypes + ", type=" + this.type + ", amount=" + this.amount + ')';
    }
}
