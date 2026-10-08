package zr0;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zr0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001e"}, d2 = {"Lzr0/b;", "", "", "name", "surname", "pesel", "Ljava/math/BigDecimal;", "amount", "comitmentTypeCode", "institutionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECreateStampDutyRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comitmentTypeCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    public BECreateStampDutyRequest(String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5) {
        this.name = str;
        this.surname = str2;
        this.pesel = str3;
        this.amount = bigDecimal;
        this.comitmentTypeCode = str4;
        this.institutionId = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getComitmentTypeCode() {
        return this.comitmentTypeCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECreateStampDutyRequest)) {
            return false;
        }
        BECreateStampDutyRequest bECreateStampDutyRequest = (BECreateStampDutyRequest) other;
        return t.c(this.name, bECreateStampDutyRequest.name) && t.c(this.surname, bECreateStampDutyRequest.surname) && t.c(this.pesel, bECreateStampDutyRequest.pesel) && t.c(this.amount, bECreateStampDutyRequest.amount) && t.c(this.comitmentTypeCode, bECreateStampDutyRequest.comitmentTypeCode) && t.c(this.institutionId, bECreateStampDutyRequest.institutionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.comitmentTypeCode.hashCode()) * 31) + this.institutionId.hashCode();
    }

    public String toString() {
        return "BECreateStampDutyRequest(name=" + this.name + ", surname=" + this.surname + ", pesel=" + this.pesel + ", amount=" + this.amount + ", comitmentTypeCode=" + this.comitmentTypeCode + ", institutionId=" + this.institutionId + ")";
    }
}
