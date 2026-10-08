package ts0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lts0/s;", "", "", "pesel", "verificationReason", "seriesAndId", "Ljava/time/LocalDate;", "date", "Lts0/t;", "verifyingInstitution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Lts0/t;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "Lts0/t;", "()Lts0/t;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String verificationReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String seriesAndId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LocalDate date;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final VerifyingInstitution verifyingInstitution;

    public s(String str, String str2, String str3, LocalDate localDate, VerifyingInstitution verifyingInstitution) {
        this.pesel = str;
        this.verificationReason = str2;
        this.seriesAndId = str3;
        this.date = localDate;
        this.verifyingInstitution = verifyingInstitution;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSeriesAndId() {
        return this.seriesAndId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVerificationReason() {
        return this.verificationReason;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VerifyingInstitution getVerifyingInstitution() {
        return this.verifyingInstitution;
    }
}
