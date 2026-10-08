package wx;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wx.e, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lwx/e;", "Lwx/g;", "", "name", "extension", "", "sizeInBytes", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)Lwx/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getName", "c", "f", "d", "F", "e", "()F", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilePickerMetadata implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f215692f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extension;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float sizeInBytes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uri;

    public FilePickerMetadata(String str, String str2, float f15, String str3) {
        this.name = str;
        this.extension = str2;
        this.sizeInBytes = f15;
        this.uri = str3;
    }

    public static /* synthetic */ FilePickerMetadata b(FilePickerMetadata filePickerMetadata, String str, String str2, float f15, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = filePickerMetadata.name;
        }
        if ((i15 & 2) != 0) {
            str2 = filePickerMetadata.extension;
        }
        if ((i15 & 4) != 0) {
            f15 = filePickerMetadata.sizeInBytes;
        }
        if ((i15 & 8) != 0) {
            str3 = filePickerMetadata.uri;
        }
        return filePickerMetadata.a(str, str2, f15, str3);
    }

    public final FilePickerMetadata a(String name, String extension, float sizeInBytes, String uri) {
        return new FilePickerMetadata(name, extension, sizeInBytes, uri);
    }

    @Override // wx.g
    public /* bridge */ String c() {
        return super.c();
    }

    @Override // wx.g
    public /* bridge */ float d() {
        return super.d();
    }

    @Override // wx.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public float getSizeInBytes() {
        return this.sizeInBytes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePickerMetadata)) {
            return false;
        }
        FilePickerMetadata filePickerMetadata = (FilePickerMetadata) other;
        return t.c(this.name, filePickerMetadata.name) && t.c(this.extension, filePickerMetadata.extension) && Float.compare(this.sizeInBytes, filePickerMetadata.sizeInBytes) == 0 && t.c(this.uri, filePickerMetadata.uri);
    }

    @Override // wx.g
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getExtension() {
        return this.extension;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Override // wx.g
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.extension.hashCode()) * 31) + Float.hashCode(this.sizeInBytes)) * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "FilePickerMetadata(name=" + this.name + ", extension=" + this.extension + ", sizeInBytes=" + this.sizeInBytes + ", uri=" + this.uri + ")";
    }
}
