package de1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: de1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lde1/a;", "", "", "uri", "fileName", "size", "Lde1/a$a;", "fileType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde1/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Lde1/a$a;", "getFileType", "()Lde1/a$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeTaxExceededAddFileModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC0917a fileType;

    /* JADX INFO: renamed from: de1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lde1/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC0917a {
        PDF,
        IMAGE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f41141d = wq.b.a(b());
    }

    public IncomeTaxExceededAddFileModel(String str, String str2, String str3, EnumC0917a enumC0917a) {
        this.uri = str;
        this.fileName = str2;
        this.size = str3;
        this.fileType = enumC0917a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncomeTaxExceededAddFileModel)) {
            return false;
        }
        IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel = (IncomeTaxExceededAddFileModel) other;
        return t.c(this.uri, incomeTaxExceededAddFileModel.uri) && t.c(this.fileName, incomeTaxExceededAddFileModel.fileName) && t.c(this.size, incomeTaxExceededAddFileModel.size) && this.fileType == incomeTaxExceededAddFileModel.fileType;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.size.hashCode()) * 31) + this.fileType.hashCode();
    }

    public String toString() {
        return "IncomeTaxExceededAddFileModel(uri=" + this.uri + ", fileName=" + this.fileName + ", size=" + this.size + ", fileType=" + this.fileType + ')';
    }
}
