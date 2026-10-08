package y52;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y52.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly52/b;", "", "", "commitmentVariantName", "Ljava/math/BigDecimal;", "commitmentVariantAmount", "", "isVariantChosenByUser", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "c", "Z", "()Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StampDutyCommitmentVariantData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commitmentVariantName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal commitmentVariantAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVariantChosenByUser;

    public StampDutyCommitmentVariantData(String str, BigDecimal bigDecimal, boolean z15) {
        this.commitmentVariantName = str;
        this.commitmentVariantAmount = bigDecimal;
        this.isVariantChosenByUser = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getCommitmentVariantAmount() {
        return this.commitmentVariantAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommitmentVariantName() {
        return this.commitmentVariantName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsVariantChosenByUser() {
        return this.isVariantChosenByUser;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StampDutyCommitmentVariantData)) {
            return false;
        }
        StampDutyCommitmentVariantData stampDutyCommitmentVariantData = (StampDutyCommitmentVariantData) other;
        return t.c(this.commitmentVariantName, stampDutyCommitmentVariantData.commitmentVariantName) && t.c(this.commitmentVariantAmount, stampDutyCommitmentVariantData.commitmentVariantAmount) && this.isVariantChosenByUser == stampDutyCommitmentVariantData.isVariantChosenByUser;
    }

    public int hashCode() {
        return (((this.commitmentVariantName.hashCode() * 31) + this.commitmentVariantAmount.hashCode()) * 31) + Boolean.hashCode(this.isVariantChosenByUser);
    }

    public String toString() {
        return "StampDutyCommitmentVariantData(commitmentVariantName=" + this.commitmentVariantName + ", commitmentVariantAmount=" + this.commitmentVariantAmount + ", isVariantChosenByUser=" + this.isVariantChosenByUser + ')';
    }
}
