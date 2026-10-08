package m33;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: m33.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lm33/c;", "", "", "institutionName", "Lhz/b;", "institutionNameValidation", "reportNumber", "reportNumberValidation", "Lfz/b$c;", "reportDate", "<init>", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Lfz/b$c;)V", "a", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Lfz/b$c;)Lm33/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lhz/b;", "d", "()Lhz/b;", "f", "g", "e", "Lfz/b$c;", "()Lfz/b$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Form {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123570f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b institutionNameValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reportNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b reportNumberValidation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate reportDate;

    static {
        int i15 = fz.b.LocalDate.f68860b;
        int i16 = hz.b.f86845b;
        f123570f = i15 | i16 | i16;
    }

    public Form() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Form b(Form form, String str, hz.b bVar, String str2, hz.b bVar2, fz.b.LocalDate localDate, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = form.institutionName;
        }
        if ((i15 & 2) != 0) {
            bVar = form.institutionNameValidation;
        }
        if ((i15 & 4) != 0) {
            str2 = form.reportNumber;
        }
        if ((i15 & 8) != 0) {
            bVar2 = form.reportNumberValidation;
        }
        if ((i15 & 16) != 0) {
            localDate = form.reportDate;
        }
        fz.b.LocalDate localDate2 = localDate;
        String str3 = str2;
        return form.a(str, bVar, str3, bVar2, localDate2);
    }

    public final Form a(String institutionName, hz.b institutionNameValidation, String reportNumber, hz.b reportNumberValidation, fz.b.LocalDate reportDate) {
        return new Form(institutionName, institutionNameValidation, reportNumber, reportNumberValidation, reportDate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getInstitutionNameValidation() {
        return this.institutionNameValidation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.LocalDate getReportDate() {
        return this.reportDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return fr.t.c(this.institutionName, form.institutionName) && fr.t.c(this.institutionNameValidation, form.institutionNameValidation) && fr.t.c(this.reportNumber, form.reportNumber) && fr.t.c(this.reportNumberValidation, form.reportNumberValidation) && fr.t.c(this.reportDate, form.reportDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReportNumber() {
        return this.reportNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.b getReportNumberValidation() {
        return this.reportNumberValidation;
    }

    public int hashCode() {
        int iHashCode = ((((((this.institutionName.hashCode() * 31) + this.institutionNameValidation.hashCode()) * 31) + this.reportNumber.hashCode()) * 31) + this.reportNumberValidation.hashCode()) * 31;
        fz.b.LocalDate localDate = this.reportDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "Form(institutionName=" + this.institutionName + ", institutionNameValidation=" + this.institutionNameValidation + ", reportNumber=" + this.reportNumber + ", reportNumberValidation=" + this.reportNumberValidation + ", reportDate=" + this.reportDate + ')';
    }

    public Form(String str, hz.b bVar, String str2, hz.b bVar2, fz.b.LocalDate localDate) {
        this.institutionName = str;
        this.institutionNameValidation = bVar;
        this.reportNumber = str2;
        this.reportNumberValidation = bVar2;
        this.reportDate = localDate;
    }

    public /* synthetic */ Form(String str, hz.b bVar, String str2, hz.b bVar2, fz.b.LocalDate localDate, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 16) != 0 ? null : localDate);
    }
}
