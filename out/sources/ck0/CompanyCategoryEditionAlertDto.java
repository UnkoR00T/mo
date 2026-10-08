package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lck0/l0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "linkName", "b", "message", "c", "url", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final /* data */ class CompanyCategoryEditionAlertDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("linkName")
    private final String linkName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("url")
    private final String url;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLinkName() {
        return this.linkName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyCategoryEditionAlertDto)) {
            return false;
        }
        CompanyCategoryEditionAlertDto companyCategoryEditionAlertDto = (CompanyCategoryEditionAlertDto) other;
        return fr.t.c(this.linkName, companyCategoryEditionAlertDto.linkName) && fr.t.c(this.message, companyCategoryEditionAlertDto.message) && fr.t.c(this.url, companyCategoryEditionAlertDto.url);
    }

    public int hashCode() {
        return (((this.linkName.hashCode() * 31) + this.message.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "CompanyCategoryEditionAlertDto(linkName=" + this.linkName + ", message=" + this.message + ", url=" + this.url + ')';
    }
}
