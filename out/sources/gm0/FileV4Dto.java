package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.f2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lgm0/f2;", "", "", "fileData", "Lgm0/e2;", "fileType", "format", "name", "<init>", "(Ljava/lang/String;Lgm0/e2;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileData", "b", "Lgm0/e2;", "getFileType", "()Lgm0/e2;", "c", "getFormat", "d", "getName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileV4Dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileData")
    private final String fileData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileType")
    private final e2 fileType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("format")
    private final String format;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    public FileV4Dto(String str, e2 e2Var, String str2, String str3) {
        this.fileData = str;
        this.fileType = e2Var;
        this.format = str2;
        this.name = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileV4Dto)) {
            return false;
        }
        FileV4Dto fileV4Dto = (FileV4Dto) other;
        return fr.t.c(this.fileData, fileV4Dto.fileData) && this.fileType == fileV4Dto.fileType && fr.t.c(this.format, fileV4Dto.format) && fr.t.c(this.name, fileV4Dto.name);
    }

    public int hashCode() {
        return (((((this.fileData.hashCode() * 31) + this.fileType.hashCode()) * 31) + this.format.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "FileV4Dto(fileData=" + this.fileData + ", fileType=" + this.fileType + ", format=" + this.format + ", name=" + this.name + ')';
    }
}
