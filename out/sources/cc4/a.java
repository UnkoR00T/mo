package cc4;

import fr.k;
import fr.t;
import gz.b;
import java.util.List;
import p071kotlin.Metadata;
import wx.FileContent;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcc4/a;", "", "Lcc4/a$a;", "Lcc4/a$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends b {

    /* JADX INFO: renamed from: cc4.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcc4/a$b;", "", "Lwx/c;", "fileContent", "", "sizeInBytes", "", "extension", "uri", "<init>", "(Lwx/c;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/c;", "b", "()Lwx/c;", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "Ljava/lang/String;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileContent fileContent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float sizeInBytes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String extension;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uri;

        public Result(FileContent fileContent, Float f15, String str, String str2) {
            this.fileContent = fileContent;
            this.sizeInBytes = f15;
            this.extension = str;
            this.uri = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FileContent getFileContent() {
            return this.fileContent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Float getSizeInBytes() {
            return this.sizeInBytes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.fileContent, result.fileContent) && t.c(this.sizeInBytes, result.sizeInBytes) && t.c(this.extension, result.extension) && t.c(this.uri, result.uri);
        }

        public int hashCode() {
            int iHashCode = this.fileContent.hashCode() * 31;
            Float f15 = this.sizeInBytes;
            return ((((iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31) + this.extension.hashCode()) * 31) + this.uri.hashCode();
        }

        public String toString() {
            return "Result(fileContent=" + this.fileContent + ", sizeInBytes=" + this.sizeInBytes + ", extension=" + this.extension + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: cc4.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcc4/a$a;", "Lgz/b$a;", "", "fileName", "", "defaultImageMaxSideOverride", "defaultImageQualityOverride", "", "Lxx/b;", "exifTagGroupsToCopy", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageMaxSideOverride;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageQualityOverride;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<xx.b> exifTagGroupsToCopy;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(String str, Integer num, Integer num2, List<? extends xx.b> list) {
            this.fileName = str;
            this.defaultImageMaxSideOverride = num;
            this.defaultImageQualityOverride = num2;
            this.exifTagGroupsToCopy = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getDefaultImageMaxSideOverride() {
            return this.defaultImageMaxSideOverride;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getDefaultImageQualityOverride() {
            return this.defaultImageQualityOverride;
        }

        public final List<xx.b> c() {
            return this.exifTagGroupsToCopy;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fileName, params.fileName) && t.c(this.defaultImageMaxSideOverride, params.defaultImageMaxSideOverride) && t.c(this.defaultImageQualityOverride, params.defaultImageQualityOverride) && t.c(this.exifTagGroupsToCopy, params.exifTagGroupsToCopy);
        }

        public int hashCode() {
            int iHashCode = this.fileName.hashCode() * 31;
            Integer num = this.defaultImageMaxSideOverride;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultImageQualityOverride;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<xx.b> list = this.exifTagGroupsToCopy;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Params(fileName=" + this.fileName + ", defaultImageMaxSideOverride=" + this.defaultImageMaxSideOverride + ", defaultImageQualityOverride=" + this.defaultImageQualityOverride + ", exifTagGroupsToCopy=" + this.exifTagGroupsToCopy + ")";
        }

        public /* synthetic */ Params(String str, Integer num, Integer num2, List list, int i15, k kVar) {
            this(str, num, num2, (i15 & 8) != 0 ? null : list);
        }
    }
}
