package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Ljo0/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "body", "Ljo0/c;", "b", "Ljo0/c;", "c", "()Ljo0/c;", "type", "title", "Ljo0/d;", "d", "Ljo0/d;", "()Ljo0/d;", "url", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DictionaryAdditionalInformationDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("body")
    private final String body;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final c type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("url")
    private final AdditionalInformationUrlDtoDto url;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AdditionalInformationUrlDtoDto getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DictionaryAdditionalInformationDtoDto)) {
            return false;
        }
        DictionaryAdditionalInformationDtoDto dictionaryAdditionalInformationDtoDto = (DictionaryAdditionalInformationDtoDto) other;
        return fr.t.c(this.body, dictionaryAdditionalInformationDtoDto.body) && this.type == dictionaryAdditionalInformationDtoDto.type && fr.t.c(this.title, dictionaryAdditionalInformationDtoDto.title) && fr.t.c(this.url, dictionaryAdditionalInformationDtoDto.url);
    }

    public int hashCode() {
        int iHashCode = ((this.body.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdditionalInformationUrlDtoDto additionalInformationUrlDtoDto = this.url;
        return iHashCode2 + (additionalInformationUrlDtoDto != null ? additionalInformationUrlDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "DictionaryAdditionalInformationDtoDto(body=" + this.body + ", type=" + this.type + ", title=" + this.title + ", url=" + this.url + ')';
    }
}
