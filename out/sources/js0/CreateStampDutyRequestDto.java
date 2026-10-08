package js0;

import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\rR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Ljs0/r;", "", "Ljava/math/BigDecimal;", "amount", "", "commitmentTypeCode", "institutionId", "name", "pesel", "surname", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "b", "Ljava/lang/String;", "getCommitmentTypeCode", "c", "getInstitutionId", "d", "getName", "e", "getPesel", "f", "getSurname", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateStampDutyRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commitmentTypeCode")
    private final String commitmentTypeCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    public CreateStampDutyRequestDto(BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5) {
        this.amount = bigDecimal;
        this.commitmentTypeCode = str;
        this.institutionId = str2;
        this.name = str3;
        this.pesel = str4;
        this.surname = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateStampDutyRequestDto)) {
            return false;
        }
        CreateStampDutyRequestDto createStampDutyRequestDto = (CreateStampDutyRequestDto) other;
        return fr.t.c(this.amount, createStampDutyRequestDto.amount) && fr.t.c(this.commitmentTypeCode, createStampDutyRequestDto.commitmentTypeCode) && fr.t.c(this.institutionId, createStampDutyRequestDto.institutionId) && fr.t.c(this.name, createStampDutyRequestDto.name) && fr.t.c(this.pesel, createStampDutyRequestDto.pesel) && fr.t.c(this.surname, createStampDutyRequestDto.surname);
    }

    public int hashCode() {
        return (((((((((this.amount.hashCode() * 31) + this.commitmentTypeCode.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.surname.hashCode();
    }

    public String toString() {
        return "CreateStampDutyRequestDto(amount=" + this.amount + ", commitmentTypeCode=" + this.commitmentTypeCode + ", institutionId=" + this.institutionId + ", name=" + this.name + ", pesel=" + this.pesel + ", surname=" + this.surname + ')';
    }
}
