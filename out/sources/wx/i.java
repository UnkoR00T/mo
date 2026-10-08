package wx;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lwx/i;", "Lwx/b;", "", "d", "()F", "Lwx/e;", "e", "()Lwx/e;", "metadata", "Lwx/c;", "a", "()Lwx/c;", "fileContent", "b", "Lwx/i$a;", "Lwx/i$b;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends b {

    /* JADX INFO: renamed from: wx.i$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwx/i$a;", "Lwx/i;", "Lwx/e;", "metadata", "Lwx/c;", "fileContent", "<init>", "(Lwx/e;Lwx/c;)V", "b", "(Lwx/e;Lwx/c;)Lwx/i$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "e", "()Lwx/e;", "Lwx/c;", "()Lwx/c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image implements i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f215739c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerMetadata metadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileContent fileContent;

        public Image(FilePickerMetadata eVar, FileContent fileContent) {
            this.metadata = eVar;
            this.fileContent = fileContent;
        }

        @Override // wx.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public FileContent getFileContent() {
            return this.fileContent;
        }

        public final Image b(FilePickerMetadata metadata, FileContent fileContent) {
            return new Image(metadata, fileContent);
        }

        @Override // wx.i
        public /* bridge */ float d() {
            return super.d();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return t.c(this.metadata, image.metadata) && t.c(this.fileContent, image.fileContent);
        }

        public int hashCode() {
            return (this.metadata.hashCode() * 31) + this.fileContent.hashCode();
        }

        public String toString() {
            return "Image(metadata=" + this.metadata + ", fileContent=" + this.fileContent + ")";
        }

        @Override // wx.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public FilePickerMetadata getMetadata() {
            return this.metadata;
        }
    }

    /* JADX INFO: renamed from: wx.i$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwx/i$b;", "Lwx/i;", "Lwx/e;", "metadata", "Lwx/c;", "fileContent", "<init>", "(Lwx/e;Lwx/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "e", "()Lwx/e;", "b", "Lwx/c;", "()Lwx/c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f215742c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerMetadata metadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileContent fileContent;

        public Regular(FilePickerMetadata eVar, FileContent fileContent) {
            this.metadata = eVar;
            this.fileContent = fileContent;
        }

        @Override // wx.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public FileContent getFileContent() {
            return this.fileContent;
        }

        @Override // wx.i
        public /* bridge */ float d() {
            return super.d();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return t.c(this.metadata, regular.metadata) && t.c(this.fileContent, regular.fileContent);
        }

        public int hashCode() {
            return (this.metadata.hashCode() * 31) + this.fileContent.hashCode();
        }

        public String toString() {
            return "Regular(metadata=" + this.metadata + ", fileContent=" + this.fileContent + ")";
        }

        @Override // wx.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public FilePickerMetadata getMetadata() {
            return this.metadata;
        }
    }

    /* JADX INFO: renamed from: a */
    FileContent getFileContent();

    default float d() {
        return getMetadata().d();
    }

    @Override // wx.b
    /* JADX INFO: renamed from: e */
    FilePickerMetadata getMetadata();
}
