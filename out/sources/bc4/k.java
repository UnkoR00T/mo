package bc4;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbc4/k;", "", "Lbc4/k$a;", "Lbc4/k$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends gz.b {

    /* JADX INFO: renamed from: bc4.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbc4/k$b;", "", "Lwx/i$a;", "imageFile", "<init>", "(Lwx/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Image imageFile;

        public Result(wx.i.Image image) {
            this.imageFile = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wx.i.Image getImageFile() {
            return this.imageFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.imageFile, ((Result) other).imageFile);
        }

        public int hashCode() {
            return this.imageFile.hashCode();
        }

        public String toString() {
            return "Result(imageFile=" + this.imageFile + ")";
        }
    }

    /* JADX INFO: renamed from: bc4.k$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, d2 = {"Lbc4/k$a;", "Lgz/b$a;", "", "fileName", "", "defaultImageMaxSideOverride", "defaultImageQualityOverride", "", "maxPhotoSizeInBytes", "", "isMaxFilesCountExceeded", "", "Lxx/b;", "exifTagGroupsToCopy", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "e", "Z", "h", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageMaxSideOverride;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageQualityOverride;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float maxPhotoSizeInBytes;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMaxFilesCountExceeded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<xx.b> exifTagGroupsToCopy;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(String str, Integer num, Integer num2, Float f15, boolean z15, List<? extends xx.b> list) {
            this.fileName = str;
            this.defaultImageMaxSideOverride = num;
            this.defaultImageQualityOverride = num2;
            this.maxPhotoSizeInBytes = f15;
            this.isMaxFilesCountExceeded = z15;
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
            return t.c(this.fileName, params.fileName) && t.c(this.defaultImageMaxSideOverride, params.defaultImageMaxSideOverride) && t.c(this.defaultImageQualityOverride, params.defaultImageQualityOverride) && t.c(this.maxPhotoSizeInBytes, params.maxPhotoSizeInBytes) && this.isMaxFilesCountExceeded == params.isMaxFilesCountExceeded && t.c(this.exifTagGroupsToCopy, params.exifTagGroupsToCopy);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Float getMaxPhotoSizeInBytes() {
            return this.maxPhotoSizeInBytes;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsMaxFilesCountExceeded() {
            return this.isMaxFilesCountExceeded;
        }

        public int hashCode() {
            int iHashCode = this.fileName.hashCode() * 31;
            Integer num = this.defaultImageMaxSideOverride;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultImageQualityOverride;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f15 = this.maxPhotoSizeInBytes;
            int iHashCode4 = (((iHashCode3 + (f15 == null ? 0 : f15.hashCode())) * 31) + Boolean.hashCode(this.isMaxFilesCountExceeded)) * 31;
            List<xx.b> list = this.exifTagGroupsToCopy;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Params(fileName=" + this.fileName + ", defaultImageMaxSideOverride=" + this.defaultImageMaxSideOverride + ", defaultImageQualityOverride=" + this.defaultImageQualityOverride + ", maxPhotoSizeInBytes=" + this.maxPhotoSizeInBytes + ", isMaxFilesCountExceeded=" + this.isMaxFilesCountExceeded + ", exifTagGroupsToCopy=" + this.exifTagGroupsToCopy + ")";
        }

        public /* synthetic */ Params(String str, Integer num, Integer num2, Float f15, boolean z15, List list, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : num2, f15, (i15 & 16) != 0 ? false : z15, (i15 & 32) != 0 ? null : list);
        }
    }
}
