package bu2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bu2.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbu2/d;", "", "", "pesel", "idNumber", "reason", "Lbv2/a;", "selectedRadioButtonId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbv2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Lbv2/a;", "()Lbv2/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationCheckData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final bv2.a selectedRadioButtonId;

    public VerificationCheckData(String str, String str2, String str3, bv2.a aVar) {
        this.pesel = str;
        this.idNumber = str2;
        this.reason = str3;
        this.selectedRadioButtonId = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final bv2.a getSelectedRadioButtonId() {
        return this.selectedRadioButtonId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationCheckData)) {
            return false;
        }
        VerificationCheckData verificationCheckData = (VerificationCheckData) other;
        return t.c(this.pesel, verificationCheckData.pesel) && t.c(this.idNumber, verificationCheckData.idNumber) && t.c(this.reason, verificationCheckData.reason) && this.selectedRadioButtonId == verificationCheckData.selectedRadioButtonId;
    }

    public int hashCode() {
        return (((((this.pesel.hashCode() * 31) + this.idNumber.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.selectedRadioButtonId.hashCode();
    }

    public String toString() {
        return "VerificationCheckData(pesel=" + this.pesel + ", idNumber=" + this.idNumber + ", reason=" + this.reason + ", selectedRadioButtonId=" + this.selectedRadioButtonId + ')';
    }
}
