package by3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: by3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lby3/b;", "", "", "sourcePaymentId", "", "paymentsIds", "amountWithCurrency", "title", "", "paymentPackageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlikRequiredData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourcePaymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentsIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amountWithCurrency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long paymentPackageId;

    public BlikRequiredData(String str, List<String> list, String str2, String str3, Long l15) {
        this.sourcePaymentId = str;
        this.paymentsIds = list;
        this.amountWithCurrency = str2;
        this.title = str3;
        this.paymentPackageId = l15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmountWithCurrency() {
        return this.amountWithCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getPaymentPackageId() {
        return this.paymentPackageId;
    }

    public final List<String> c() {
        return this.paymentsIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourcePaymentId() {
        return this.sourcePaymentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlikRequiredData)) {
            return false;
        }
        BlikRequiredData blikRequiredData = (BlikRequiredData) other;
        return t.c(this.sourcePaymentId, blikRequiredData.sourcePaymentId) && t.c(this.paymentsIds, blikRequiredData.paymentsIds) && t.c(this.amountWithCurrency, blikRequiredData.amountWithCurrency) && t.c(this.title, blikRequiredData.title) && t.c(this.paymentPackageId, blikRequiredData.paymentPackageId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.sourcePaymentId.hashCode() * 31) + this.paymentsIds.hashCode()) * 31) + this.amountWithCurrency.hashCode()) * 31) + this.title.hashCode()) * 31;
        Long l15 = this.paymentPackageId;
        return iHashCode + (l15 == null ? 0 : l15.hashCode());
    }

    public String toString() {
        return "BlikRequiredData(sourcePaymentId=" + this.sourcePaymentId + ", paymentsIds=" + this.paymentsIds + ", amountWithCurrency=" + this.amountWithCurrency + ", title=" + this.title + ", paymentPackageId=" + this.paymentPackageId + ')';
    }
}
