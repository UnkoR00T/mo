package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.m2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0017"}, d2 = {"Lgm0/m2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "base64Xml", "b", "childFirstName", "c", "d", "childSurname", "e", "xmlId", "childSecondName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("base64Xml")
    private final String base64Xml;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childFirstName")
    private final String childFirstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childSurname")
    private final String childSurname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("xmlId")
    private final String xmlId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childSecondName")
    private final String childSecondName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBase64Xml() {
        return this.base64Xml;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChildFirstName() {
        return this.childFirstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChildSecondName() {
        return this.childSecondName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getChildSurname() {
        return this.childSurname;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getXmlId() {
        return this.xmlId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse)) {
            return false;
        }
        GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse generatedXmlDtoChildBirthRegistrationGenerateXmlResponse = (GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse) other;
        return fr.t.c(this.base64Xml, generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.base64Xml) && fr.t.c(this.childFirstName, generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.childFirstName) && fr.t.c(this.childSurname, generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.childSurname) && fr.t.c(this.xmlId, generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.xmlId) && fr.t.c(this.childSecondName, generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.childSecondName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.base64Xml.hashCode() * 31) + this.childFirstName.hashCode()) * 31) + this.childSurname.hashCode()) * 31) + this.xmlId.hashCode()) * 31;
        String str = this.childSecondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse(base64Xml=" + this.base64Xml + ", childFirstName=" + this.childFirstName + ", childSurname=" + this.childSurname + ", xmlId=" + this.xmlId + ", childSecondName=" + this.childSecondName + ')';
    }
}
