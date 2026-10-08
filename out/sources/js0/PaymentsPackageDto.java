package js0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Ljs0/l0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Ljs0/f0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "parts", "Ljs0/p0;", "b", "reminderPayments", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsPackageDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parts")
    private final List<PaymentPartDto> parts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reminderPayments")
    private final List<ReminderPaymentDto> reminderPayments;

    public final List<PaymentPartDto> a() {
        return this.parts;
    }

    public final List<ReminderPaymentDto> b() {
        return this.reminderPayments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsPackageDto)) {
            return false;
        }
        PaymentsPackageDto paymentsPackageDto = (PaymentsPackageDto) other;
        return fr.t.c(this.parts, paymentsPackageDto.parts) && fr.t.c(this.reminderPayments, paymentsPackageDto.reminderPayments);
    }

    public int hashCode() {
        return (this.parts.hashCode() * 31) + this.reminderPayments.hashCode();
    }

    public String toString() {
        return "PaymentsPackageDto(parts=" + this.parts + ", reminderPayments=" + this.reminderPayments + ')';
    }
}
