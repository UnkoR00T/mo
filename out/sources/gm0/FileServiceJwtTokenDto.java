package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.d2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lgm0/d2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "()J", "validityInSeconds", "b", "Ljava/lang/String;", "value", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileServiceJwtTokenDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("validityInSeconds")
    private final long validityInSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("value")
    private final String value;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getValidityInSeconds() {
        return this.validityInSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileServiceJwtTokenDto)) {
            return false;
        }
        FileServiceJwtTokenDto fileServiceJwtTokenDto = (FileServiceJwtTokenDto) other;
        return this.validityInSeconds == fileServiceJwtTokenDto.validityInSeconds && fr.t.c(this.value, fileServiceJwtTokenDto.value);
    }

    public int hashCode() {
        return (Long.hashCode(this.validityInSeconds) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "FileServiceJwtTokenDto(validityInSeconds=" + this.validityInSeconds + ", value=" + this.value + ')';
    }
}
