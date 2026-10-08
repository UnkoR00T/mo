package eo0;

import java.io.InputStream;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"Leo0/d0;", "", "Ljava/io/InputStream;", "inputStream", "", "fileName", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/InputStream;", "b", "()Ljava/io/InputStream;", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputStream inputStream;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    public FileDto(InputStream inputStream, String str) {
        this.inputStream = inputStream;
        this.fileName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDto)) {
            return false;
        }
        FileDto fileDto = (FileDto) other;
        return fr.t.c(this.inputStream, fileDto.inputStream) && fr.t.c(this.fileName, fileDto.fileName);
    }

    public int hashCode() {
        return (this.inputStream.hashCode() * 31) + this.fileName.hashCode();
    }

    public String toString() {
        return "FileDto(inputStream=" + this.inputStream + ", fileName=" + this.fileName + ")";
    }
}
