package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.d5, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lgm0/d5;", "", "", "birthPlaceFirstLine", "birthPlaceSecondLine", "firstNameFirstLine", "firstNameSecondLine", "surnameFirstLine", "surnameSecondLine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBirthPlaceFirstLine", "b", "getBirthPlaceSecondLine", "c", "getFirstNameFirstLine", "d", "getFirstNameSecondLine", "e", "getSurnameFirstLine", "f", "getSurnameSecondLine", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationXmlRequestPassportDocumentVisualizationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthPlaceFirstLine")
    private final String birthPlaceFirstLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthPlaceSecondLine")
    private final String birthPlaceSecondLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstNameFirstLine")
    private final String firstNameFirstLine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstNameSecondLine")
    private final String firstNameSecondLine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surnameFirstLine")
    private final String surnameFirstLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surnameSecondLine")
    private final String surnameSecondLine;

    public PassportChildApplicationXmlRequestPassportDocumentVisualizationData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationXmlRequestPassportDocumentVisualizationData)) {
            return false;
        }
        PassportChildApplicationXmlRequestPassportDocumentVisualizationData passportChildApplicationXmlRequestPassportDocumentVisualizationData = (PassportChildApplicationXmlRequestPassportDocumentVisualizationData) other;
        return fr.t.c(this.birthPlaceFirstLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.birthPlaceFirstLine) && fr.t.c(this.birthPlaceSecondLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.birthPlaceSecondLine) && fr.t.c(this.firstNameFirstLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.firstNameFirstLine) && fr.t.c(this.firstNameSecondLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.firstNameSecondLine) && fr.t.c(this.surnameFirstLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.surnameFirstLine) && fr.t.c(this.surnameSecondLine, passportChildApplicationXmlRequestPassportDocumentVisualizationData.surnameSecondLine);
    }

    public int hashCode() {
        String str = this.birthPlaceFirstLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.birthPlaceSecondLine;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameFirstLine;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameSecondLine;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.surnameFirstLine;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.surnameSecondLine;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "PassportChildApplicationXmlRequestPassportDocumentVisualizationData(birthPlaceFirstLine=" + this.birthPlaceFirstLine + ", birthPlaceSecondLine=" + this.birthPlaceSecondLine + ", firstNameFirstLine=" + this.firstNameFirstLine + ", firstNameSecondLine=" + this.firstNameSecondLine + ", surnameFirstLine=" + this.surnameFirstLine + ", surnameSecondLine=" + this.surnameSecondLine + ')';
    }

    public PassportChildApplicationXmlRequestPassportDocumentVisualizationData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.birthPlaceFirstLine = str;
        this.birthPlaceSecondLine = str2;
        this.firstNameFirstLine = str3;
        this.firstNameSecondLine = str4;
        this.surnameFirstLine = str5;
        this.surnameSecondLine = str6;
    }

    public /* synthetic */ PassportChildApplicationXmlRequestPassportDocumentVisualizationData(String str, String str2, String str3, String str4, String str5, String str6, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6);
    }
}
