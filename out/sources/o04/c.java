package o04;

import fr.t;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lo04/c;", "", "Lwx/g;", "a", "()Lwx/g;", "originalMetadata", "b", "c", "Lo04/c$b;", "Lo04/c$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f140251a;

    /* JADX INFO: renamed from: o04.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo04/c$a;", "", "<init>", "()V", "Lwx/c;", "thumbnailFileContent", "Lwx/g;", "originalMetadata", "Lo04/c;", "a", "(Lwx/c;Lwx/g;)Lo04/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f140251a = new Companion();

        private Companion() {
        }

        public final c a(FileContent thumbnailFileContent, g originalMetadata) {
            return thumbnailFileContent == null ? new Empty(originalMetadata) : new Content(thumbnailFileContent, originalMetadata);
        }
    }

    /* JADX INFO: renamed from: o04.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo04/c$b;", "Lo04/c;", "Lwx/c;", "fileContent", "Lwx/g;", "originalMetadata", "<init>", "(Lwx/c;Lwx/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwx/c;", "()Lwx/c;", "c", "Lwx/g;", "a", "()Lwx/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileContent fileContent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final g originalMetadata;

        public Content(FileContent fileContent, g gVar) {
            this.fileContent = fileContent;
            this.originalMetadata = gVar;
        }

        @Override // o04.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public g getOriginalMetadata() {
            return this.originalMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FileContent getFileContent() {
            return this.fileContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return t.c(this.fileContent, content.fileContent) && t.c(this.originalMetadata, content.originalMetadata);
        }

        public int hashCode() {
            return (this.fileContent.hashCode() * 31) + this.originalMetadata.hashCode();
        }

        public String toString() {
            return "Content(fileContent=" + this.fileContent + ", originalMetadata=" + this.originalMetadata + ")";
        }
    }

    /* JADX INFO: renamed from: o04.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo04/c$c;", "Lo04/c;", "Lwx/g;", "originalMetadata", "<init>", "(Lwx/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwx/g;", "a", "()Lwx/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g originalMetadata;

        public Empty(g gVar) {
            this.originalMetadata = gVar;
        }

        @Override // o04.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public g getOriginalMetadata() {
            return this.originalMetadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && t.c(this.originalMetadata, ((Empty) other).originalMetadata);
        }

        public int hashCode() {
            return this.originalMetadata.hashCode();
        }

        public String toString() {
            return "Empty(originalMetadata=" + this.originalMetadata + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    g getOriginalMetadata();
}
