package js0;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.b0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0004R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b.\u0010\u0004R\u001a\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0004R\u001a\u00106\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010\u0004R\u001a\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b?\u0010\u0004R\u001a\u0010E\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u001e\u001a\u0004\bK\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u001e\u001a\u0004\b\r\u0010\u0004R\u001c\u0010P\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u000e\u001a\u0004\b!\u0010\u0010R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u001e\u001a\u0004\b0\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010S\u001a\u0004\b<\u0010TR\u001c\u0010Z\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bM\u0010YR\u001c\u0010_\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bO\u0010^R\u001c\u0010c\u001a\u0004\u0018\u00010`8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010a\u001a\u0004\bQ\u0010bR\u001c\u0010h\u001a\u0004\u0018\u00010d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bW\u0010gR\u001c\u0010l\u001a\u0004\u0018\u00010i8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010j\u001a\u0004\b\\\u0010kR\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\u001e\u001a\u0004\be\u0010\u0004¨\u0006o"}, d2 = {"Ljs0/b0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "amount", "", "Ljs0/c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "availableOperations", "", "Ljs0/d;", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "availablePaymentMethods", "Ljava/lang/String;", "f", "currency", "e", "g", "description", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "h", "()Ljava/time/LocalDate;", "dueDate", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "j", "()Ljava/time/OffsetDateTime;", "dueDateTime", "k", "externalId", "i", "m", "id", "Z", "getInstant", "()Z", "instant", "Ljs0/a;", "Ljs0/a;", "n", "()Ljs0/a;", "institutionAddress", "l", "o", "institutionId", "p", "institutionName", "Ljs0/i0;", "Ljs0/i0;", "t", "()Ljs0/i0;", "paymentType", "Ljs0/g0;", "Ljs0/g0;", "w", "()Ljs0/g0;", "status", "y", "title", "q", "additionalInfo", "r", "baseAmount", "s", "dueDateMessage", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasTransactions", "Ljs0/y;", "u", "Ljs0/y;", "()Ljs0/y;", "interest", "Ljs0/d0;", "v", "Ljs0/d0;", "()Ljs0/d0;", "paymentMethod", "Ljs0/e0;", "Ljs0/e0;", "()Ljs0/e0;", "paymentPackageSummary", "Ljs0/m0;", "x", "Ljs0/m0;", "()Ljs0/m0;", "prolongation", "Ljs0/p0;", "Ljs0/p0;", "()Ljs0/p0;", "reminderPayment", "z", "statusDetails", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availableOperations")
    private final List<c> availableOperations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availablePaymentMethods")
    private final Set<d> availablePaymentMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currency")
    private final String currency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dueDate")
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dueDateTime")
    private final OffsetDateTime dueDateTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("instant")
    private final boolean instant;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionAddress")
    private final AddressDto institutionAddress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionName")
    private final String institutionName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentType")
    private final i0 paymentType;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final g0 status;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalInfo")
    private final String additionalInfo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("baseAmount")
    private final BigDecimal baseAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dueDateMessage")
    private final String dueDateMessage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("hasTransactions")
    private final Boolean hasTransactions;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("interest")
    private final InterestDto interest;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentMethod")
    private final d0 paymentMethod;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentPackageSummary")
    private final PaymentPackageSummaryDto paymentPackageSummary;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("prolongation")
    private final ProlongationDto prolongation;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reminderPayment")
    private final ReminderPaymentDto reminderPayment;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusDetails")
    private final String statusDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<c> c() {
        return this.availableOperations;
    }

    public final Set<d> d() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailsDto)) {
            return false;
        }
        PaymentDetailsDto paymentDetailsDto = (PaymentDetailsDto) other;
        return fr.t.c(this.amount, paymentDetailsDto.amount) && fr.t.c(this.availableOperations, paymentDetailsDto.availableOperations) && fr.t.c(this.availablePaymentMethods, paymentDetailsDto.availablePaymentMethods) && fr.t.c(this.currency, paymentDetailsDto.currency) && fr.t.c(this.description, paymentDetailsDto.description) && fr.t.c(this.dueDate, paymentDetailsDto.dueDate) && fr.t.c(this.dueDateTime, paymentDetailsDto.dueDateTime) && fr.t.c(this.externalId, paymentDetailsDto.externalId) && fr.t.c(this.id, paymentDetailsDto.id) && this.instant == paymentDetailsDto.instant && fr.t.c(this.institutionAddress, paymentDetailsDto.institutionAddress) && fr.t.c(this.institutionId, paymentDetailsDto.institutionId) && fr.t.c(this.institutionName, paymentDetailsDto.institutionName) && this.paymentType == paymentDetailsDto.paymentType && this.status == paymentDetailsDto.status && fr.t.c(this.title, paymentDetailsDto.title) && fr.t.c(this.additionalInfo, paymentDetailsDto.additionalInfo) && fr.t.c(this.baseAmount, paymentDetailsDto.baseAmount) && fr.t.c(this.dueDateMessage, paymentDetailsDto.dueDateMessage) && fr.t.c(this.hasTransactions, paymentDetailsDto.hasTransactions) && fr.t.c(this.interest, paymentDetailsDto.interest) && this.paymentMethod == paymentDetailsDto.paymentMethod && fr.t.c(this.paymentPackageSummary, paymentDetailsDto.paymentPackageSummary) && fr.t.c(this.prolongation, paymentDetailsDto.prolongation) && fr.t.c(this.reminderPayment, paymentDetailsDto.reminderPayment) && fr.t.c(this.statusDetails, paymentDetailsDto.statusDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.amount.hashCode() * 31) + this.availableOperations.hashCode()) * 31) + this.availablePaymentMethods.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.dueDateTime.hashCode()) * 31) + this.externalId.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.instant)) * 31) + this.institutionAddress.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.paymentType.hashCode()) * 31) + this.status.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.additionalInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.baseAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.dueDateMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasTransactions;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        InterestDto interestDto = this.interest;
        int iHashCode6 = (iHashCode5 + (interestDto == null ? 0 : interestDto.hashCode())) * 31;
        d0 d0Var = this.paymentMethod;
        int iHashCode7 = (iHashCode6 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        PaymentPackageSummaryDto paymentPackageSummaryDto = this.paymentPackageSummary;
        int iHashCode8 = (iHashCode7 + (paymentPackageSummaryDto == null ? 0 : paymentPackageSummaryDto.hashCode())) * 31;
        ProlongationDto prolongationDto = this.prolongation;
        int iHashCode9 = (iHashCode8 + (prolongationDto == null ? 0 : prolongationDto.hashCode())) * 31;
        ReminderPaymentDto reminderPaymentDto = this.reminderPayment;
        int iHashCode10 = (iHashCode9 + (reminderPaymentDto == null ? 0 : reminderPaymentDto.hashCode())) * 31;
        String str3 = this.statusDetails;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDueDateMessage() {
        return this.dueDateMessage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final OffsetDateTime getDueDateTime() {
        return this.dueDateTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getHasTransactions() {
        return this.hasTransactions;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AddressDto getInstitutionAddress() {
        return this.institutionAddress;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterestDto getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final d0 getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final PaymentPackageSummaryDto getPaymentPackageSummary() {
        return this.paymentPackageSummary;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final i0 getPaymentType() {
        return this.paymentType;
    }

    public String toString() {
        return "PaymentDetailsDto(amount=" + this.amount + ", availableOperations=" + this.availableOperations + ", availablePaymentMethods=" + this.availablePaymentMethods + ", currency=" + this.currency + ", description=" + this.description + ", dueDate=" + this.dueDate + ", dueDateTime=" + this.dueDateTime + ", externalId=" + this.externalId + ", id=" + this.id + ", instant=" + this.instant + ", institutionAddress=" + this.institutionAddress + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", paymentType=" + this.paymentType + ", status=" + this.status + ", title=" + this.title + ", additionalInfo=" + this.additionalInfo + ", baseAmount=" + this.baseAmount + ", dueDateMessage=" + this.dueDateMessage + ", hasTransactions=" + this.hasTransactions + ", interest=" + this.interest + ", paymentMethod=" + this.paymentMethod + ", paymentPackageSummary=" + this.paymentPackageSummary + ", prolongation=" + this.prolongation + ", reminderPayment=" + this.reminderPayment + ", statusDetails=" + this.statusDetails + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final ProlongationDto getProlongation() {
        return this.prolongation;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final ReminderPaymentDto getReminderPayment() {
        return this.reminderPayment;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final g0 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getStatusDetails() {
        return this.statusDetails;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
