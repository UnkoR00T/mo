package t42;

import fr.t;
import p071kotlin.Metadata;
import yr0.BEPaymentPart;
import yr0.BEPaymentReminder;

/* JADX INFO: renamed from: t42.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lt42/a;", "", "Lyr0/k;", "paymentPart", "Lyr0/l;", "paymentReminder", "", "isChecked", "<init>", "(Lyr0/k;Lyr0/l;Z)V", "a", "()Lyr0/k;", "b", "()Z", "c", "(Lyr0/k;Lyr0/l;Z)Lt42/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lyr0/k;", "e", "Lyr0/l;", "f", "()Lyr0/l;", "Z", "g", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstallmentWithCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentPart paymentPart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentReminder paymentReminder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    public InstallmentWithCheck(BEPaymentPart bEPaymentPart, BEPaymentReminder bEPaymentReminder, boolean z15) {
        this.paymentPart = bEPaymentPart;
        this.paymentReminder = bEPaymentReminder;
        this.isChecked = z15;
    }

    public static /* synthetic */ InstallmentWithCheck d(InstallmentWithCheck installmentWithCheck, BEPaymentPart bEPaymentPart, BEPaymentReminder bEPaymentReminder, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEPaymentPart = installmentWithCheck.paymentPart;
        }
        if ((i15 & 2) != 0) {
            bEPaymentReminder = installmentWithCheck.paymentReminder;
        }
        if ((i15 & 4) != 0) {
            z15 = installmentWithCheck.isChecked;
        }
        return installmentWithCheck.c(bEPaymentPart, bEPaymentReminder, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEPaymentPart getPaymentPart() {
        return this.paymentPart;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final InstallmentWithCheck c(BEPaymentPart paymentPart, BEPaymentReminder paymentReminder, boolean isChecked) {
        return new InstallmentWithCheck(paymentPart, paymentReminder, isChecked);
    }

    public final BEPaymentPart e() {
        return this.paymentPart;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentWithCheck)) {
            return false;
        }
        InstallmentWithCheck installmentWithCheck = (InstallmentWithCheck) other;
        return t.c(this.paymentPart, installmentWithCheck.paymentPart) && t.c(this.paymentReminder, installmentWithCheck.paymentReminder) && this.isChecked == installmentWithCheck.isChecked;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEPaymentReminder getPaymentReminder() {
        return this.paymentReminder;
    }

    public final boolean g() {
        return this.isChecked;
    }

    public int hashCode() {
        int iHashCode = this.paymentPart.hashCode() * 31;
        BEPaymentReminder bEPaymentReminder = this.paymentReminder;
        return ((iHashCode + (bEPaymentReminder == null ? 0 : bEPaymentReminder.hashCode())) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "InstallmentWithCheck(paymentPart=" + this.paymentPart + ", paymentReminder=" + this.paymentReminder + ", isChecked=" + this.isChecked + ')';
    }
}
