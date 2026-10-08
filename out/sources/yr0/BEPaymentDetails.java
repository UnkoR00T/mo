package yr0;

import fr.t;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;
import wr0.BEPaymentAddress;

/* JADX INFO: renamed from: yr0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020&2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010.R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\bG\u0010.R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bH\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bM\u0010.R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bN\u0010.R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bS\u0010.R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\b@\u00108R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bI\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bN\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bU\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b[\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\bd\u0010.R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\bb\u00109\u001a\u0004\b>\u0010;R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bQ\u0010e\u001a\u0004\bO\u0010fR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bd\u0010g\u001a\u0004\b`\u0010hR\u0019\u0010*\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bS\u0010<\u001a\u0004\b5\u0010.¨\u0006i"}, d2 = {"Lyr0/e;", "", "Ljava/math/BigDecimal;", "amount", "", "Lyr0/c;", "availableOperations", "", "currency", "description", "Ljava/time/LocalDate;", "dueDate", "Ljava/time/OffsetDateTime;", "dueDateTime", "externalId", "id", "Lwr0/a;", "institutionAddress", "institutionId", "institutionName", "Lyr0/m;", "status", "title", "baseAmount", "dueDateMessage", "Lyr0/b;", "interest", "Lyr0/f;", "paymentDetailsPaymentMethod", "Lyr0/j;", "paymentPackageSummary", "Lyr0/q;", "prolongation", "Lyr0/l;", "reminder", "statusDetails", "Lyr0/a;", "availablePaymentMethods", "", "hasTransactions", "Lyr0/n;", "paymentType", "additionalInfo", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lwr0/a;Ljava/lang/String;Ljava/lang/String;Lyr0/m;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lyr0/b;Lyr0/f;Lyr0/j;Lyr0/q;Lyr0/l;Ljava/lang/String;Ljava/util/List;ZLyr0/n;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "f", "d", "g", "e", "Ljava/time/LocalDate;", "h", "()Ljava/time/LocalDate;", "Ljava/time/OffsetDateTime;", "j", "()Ljava/time/OffsetDateTime;", "k", "m", "i", "Lwr0/a;", "n", "()Lwr0/a;", "o", "p", "l", "Lyr0/m;", "w", "()Lyr0/m;", "y", "Lyr0/b;", "q", "()Lyr0/b;", "Lyr0/f;", "r", "()Lyr0/f;", "Lyr0/j;", "s", "()Lyr0/j;", "Lyr0/q;", "u", "()Lyr0/q;", "t", "Lyr0/l;", "v", "()Lyr0/l;", "x", "Z", "()Z", "Lyr0/n;", "()Lyr0/n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPaymentDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c> availableOperations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dueDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentAddress institutionAddress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final m status;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal baseAmount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dueDateMessage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEInterest interest;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final f paymentDetailsPaymentMethod;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentPackageSummary paymentPackageSummary;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEProlongation prolongation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentReminder reminder;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDetails;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> availablePaymentMethods;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasTransactions;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final n paymentType;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BEPaymentDetails(BigDecimal bigDecimal, List<? extends c> list, String str, String str2, LocalDate localDate, OffsetDateTime offsetDateTime, String str3, String str4, BEPaymentAddress bEPaymentAddress, String str5, String str6, m mVar, String str7, BigDecimal bigDecimal2, String str8, BEInterest bEInterest, f fVar, BEPaymentPackageSummary bEPaymentPackageSummary, BEProlongation bEProlongation, BEPaymentReminder bEPaymentReminder, String str9, List<? extends a> list2, boolean z15, n nVar, String str10) {
        this.amount = bigDecimal;
        this.availableOperations = list;
        this.currency = str;
        this.description = str2;
        this.dueDate = localDate;
        this.dueDateTime = offsetDateTime;
        this.externalId = str3;
        this.id = str4;
        this.institutionAddress = bEPaymentAddress;
        this.institutionId = str5;
        this.institutionName = str6;
        this.status = mVar;
        this.title = str7;
        this.baseAmount = bigDecimal2;
        this.dueDateMessage = str8;
        this.interest = bEInterest;
        this.paymentDetailsPaymentMethod = fVar;
        this.paymentPackageSummary = bEPaymentPackageSummary;
        this.prolongation = bEProlongation;
        this.reminder = bEPaymentReminder;
        this.statusDetails = str9;
        this.availablePaymentMethods = list2;
        this.hasTransactions = z15;
        this.paymentType = nVar;
        this.additionalInfo = str10;
    }

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

    public final List<a> d() {
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
        if (!(other instanceof BEPaymentDetails)) {
            return false;
        }
        BEPaymentDetails bEPaymentDetails = (BEPaymentDetails) other;
        return t.c(this.amount, bEPaymentDetails.amount) && t.c(this.availableOperations, bEPaymentDetails.availableOperations) && t.c(this.currency, bEPaymentDetails.currency) && t.c(this.description, bEPaymentDetails.description) && t.c(this.dueDate, bEPaymentDetails.dueDate) && t.c(this.dueDateTime, bEPaymentDetails.dueDateTime) && t.c(this.externalId, bEPaymentDetails.externalId) && t.c(this.id, bEPaymentDetails.id) && t.c(this.institutionAddress, bEPaymentDetails.institutionAddress) && t.c(this.institutionId, bEPaymentDetails.institutionId) && t.c(this.institutionName, bEPaymentDetails.institutionName) && this.status == bEPaymentDetails.status && t.c(this.title, bEPaymentDetails.title) && t.c(this.baseAmount, bEPaymentDetails.baseAmount) && t.c(this.dueDateMessage, bEPaymentDetails.dueDateMessage) && t.c(this.interest, bEPaymentDetails.interest) && this.paymentDetailsPaymentMethod == bEPaymentDetails.paymentDetailsPaymentMethod && t.c(this.paymentPackageSummary, bEPaymentDetails.paymentPackageSummary) && t.c(this.prolongation, bEPaymentDetails.prolongation) && t.c(this.reminder, bEPaymentDetails.reminder) && t.c(this.statusDetails, bEPaymentDetails.statusDetails) && t.c(this.availablePaymentMethods, bEPaymentDetails.availablePaymentMethods) && this.hasTransactions == bEPaymentDetails.hasTransactions && this.paymentType == bEPaymentDetails.paymentType && t.c(this.additionalInfo, bEPaymentDetails.additionalInfo);
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
        int iHashCode = ((((((((((((((this.amount.hashCode() * 31) + this.availableOperations.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.dueDateTime.hashCode()) * 31) + this.externalId.hashCode()) * 31) + this.id.hashCode()) * 31;
        BEPaymentAddress bEPaymentAddress = this.institutionAddress;
        int iHashCode2 = (((((((((iHashCode + (bEPaymentAddress == null ? 0 : bEPaymentAddress.hashCode())) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.status.hashCode()) * 31) + this.title.hashCode()) * 31;
        BigDecimal bigDecimal = this.baseAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.dueDateMessage;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BEInterest bEInterest = this.interest;
        int iHashCode5 = (iHashCode4 + (bEInterest == null ? 0 : bEInterest.hashCode())) * 31;
        f fVar = this.paymentDetailsPaymentMethod;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        BEPaymentPackageSummary bEPaymentPackageSummary = this.paymentPackageSummary;
        int iHashCode7 = (iHashCode6 + (bEPaymentPackageSummary == null ? 0 : bEPaymentPackageSummary.hashCode())) * 31;
        BEProlongation bEProlongation = this.prolongation;
        int iHashCode8 = (iHashCode7 + (bEProlongation == null ? 0 : bEProlongation.hashCode())) * 31;
        BEPaymentReminder bEPaymentReminder = this.reminder;
        int iHashCode9 = (iHashCode8 + (bEPaymentReminder == null ? 0 : bEPaymentReminder.hashCode())) * 31;
        String str2 = this.statusDetails;
        int iHashCode10 = (((((((iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.availablePaymentMethods.hashCode()) * 31) + Boolean.hashCode(this.hasTransactions)) * 31) + this.paymentType.hashCode()) * 31;
        String str3 = this.additionalInfo;
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
    public final boolean getHasTransactions() {
        return this.hasTransactions;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final BEPaymentAddress getInstitutionAddress() {
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
    public final BEInterest getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final f getPaymentDetailsPaymentMethod() {
        return this.paymentDetailsPaymentMethod;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final BEPaymentPackageSummary getPaymentPackageSummary() {
        return this.paymentPackageSummary;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final n getPaymentType() {
        return this.paymentType;
    }

    public String toString() {
        return "BEPaymentDetails(amount=" + this.amount + ", availableOperations=" + this.availableOperations + ", currency=" + this.currency + ", description=" + this.description + ", dueDate=" + this.dueDate + ", dueDateTime=" + this.dueDateTime + ", externalId=" + this.externalId + ", id=" + this.id + ", institutionAddress=" + this.institutionAddress + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", status=" + this.status + ", title=" + this.title + ", baseAmount=" + this.baseAmount + ", dueDateMessage=" + this.dueDateMessage + ", interest=" + this.interest + ", paymentDetailsPaymentMethod=" + this.paymentDetailsPaymentMethod + ", paymentPackageSummary=" + this.paymentPackageSummary + ", prolongation=" + this.prolongation + ", reminder=" + this.reminder + ", statusDetails=" + this.statusDetails + ", availablePaymentMethods=" + this.availablePaymentMethods + ", hasTransactions=" + this.hasTransactions + ", paymentType=" + this.paymentType + ", additionalInfo=" + this.additionalInfo + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final BEProlongation getProlongation() {
        return this.prolongation;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final BEPaymentReminder getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final m getStatus() {
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
