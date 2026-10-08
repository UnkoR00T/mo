package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.q4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgm0/q4;", "", "Lgm0/p4;", "discountType", "Lgm0/r4;", "paymentType", "<init>", "(Lgm0/p4;Lgm0/r4;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/p4;", "getDiscountType", "()Lgm0/p4;", "b", "Lgm0/r4;", "getPaymentType", "()Lgm0/r4;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationPaymentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("discountType")
    private final p4 discountType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentType")
    private final r4 paymentType;

    public PassportChildApplicationPaymentDto(p4 p4Var, r4 r4Var) {
        this.discountType = p4Var;
        this.paymentType = r4Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationPaymentDto)) {
            return false;
        }
        PassportChildApplicationPaymentDto passportChildApplicationPaymentDto = (PassportChildApplicationPaymentDto) other;
        return this.discountType == passportChildApplicationPaymentDto.discountType && this.paymentType == passportChildApplicationPaymentDto.paymentType;
    }

    public int hashCode() {
        int iHashCode = this.discountType.hashCode() * 31;
        r4 r4Var = this.paymentType;
        return iHashCode + (r4Var == null ? 0 : r4Var.hashCode());
    }

    public String toString() {
        return "PassportChildApplicationPaymentDto(discountType=" + this.discountType + ", paymentType=" + this.paymentType + ')';
    }
}
