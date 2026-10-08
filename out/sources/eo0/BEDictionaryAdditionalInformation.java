package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Leo0/h;", "", "", "body", "Leo0/f;", "type", "title", "Leo0/g;", "url", "<init>", "(Ljava/lang/String;Leo0/f;Ljava/lang/String;Leo0/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Leo0/f;", "c", "()Leo0/f;", "d", "Leo0/g;", "()Leo0/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEDictionaryAdditionalInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEAdditionalInformationUrl url;

    public BEDictionaryAdditionalInformation(String str, f fVar, String str2, BEAdditionalInformationUrl bEAdditionalInformationUrl) {
        this.body = str;
        this.type = fVar;
        this.title = str2;
        this.url = bEAdditionalInformationUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEAdditionalInformationUrl getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEDictionaryAdditionalInformation)) {
            return false;
        }
        BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation = (BEDictionaryAdditionalInformation) other;
        return fr.t.c(this.body, bEDictionaryAdditionalInformation.body) && this.type == bEDictionaryAdditionalInformation.type && fr.t.c(this.title, bEDictionaryAdditionalInformation.title) && fr.t.c(this.url, bEDictionaryAdditionalInformation.url);
    }

    public int hashCode() {
        int iHashCode = ((this.body.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BEAdditionalInformationUrl bEAdditionalInformationUrl = this.url;
        return iHashCode2 + (bEAdditionalInformationUrl != null ? bEAdditionalInformationUrl.hashCode() : 0);
    }

    public String toString() {
        return "BEDictionaryAdditionalInformation(body=" + this.body + ", type=" + this.type + ", title=" + this.title + ", url=" + this.url + ")";
    }
}
