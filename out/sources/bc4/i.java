package bc4;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbc4/i;", "", "Lbc4/i$a;", "Lbc4/i$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends gz.b {

    /* JADX INFO: renamed from: bc4.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lbc4/i$a;", "Lgz/b$a;", "", "maxFilesCount", "", "maxFileSizeInBytes", "", "Lwx/i;", "alreadyAddedFiles", "Lwx/f;", "fileTypes", "<init>", "(IFLjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "F", "c", "()F", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxFilesCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxFileSizeInBytes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<wx.i> alreadyAddedFiles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<wx.f> fileTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(int i15, float f15, List<? extends wx.i> list, List<? extends wx.f> list2) {
            this.maxFilesCount = i15;
            this.maxFileSizeInBytes = f15;
            this.alreadyAddedFiles = list;
            this.fileTypes = list2;
        }

        public final List<wx.i> a() {
            return this.alreadyAddedFiles;
        }

        public final List<wx.f> b() {
            return this.fileTypes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxFileSizeInBytes() {
            return this.maxFileSizeInBytes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxFilesCount() {
            return this.maxFilesCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.maxFilesCount == params.maxFilesCount && Float.compare(this.maxFileSizeInBytes, params.maxFileSizeInBytes) == 0 && t.c(this.alreadyAddedFiles, params.alreadyAddedFiles) && t.c(this.fileTypes, params.fileTypes);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.maxFilesCount) * 31) + Float.hashCode(this.maxFileSizeInBytes)) * 31) + this.alreadyAddedFiles.hashCode()) * 31) + this.fileTypes.hashCode();
        }

        public String toString() {
            return "Params(maxFilesCount=" + this.maxFilesCount + ", maxFileSizeInBytes=" + this.maxFileSizeInBytes + ", alreadyAddedFiles=" + this.alreadyAddedFiles + ", fileTypes=" + this.fileTypes + ")";
        }
    }

    /* JADX INFO: renamed from: bc4.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbc4/i$b;", "", "Lwx/i$b;", "file", "<init>", "(Lwx/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$b;", "()Lwx/i$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Regular file;

        public Result(wx.i.Regular regular) {
            this.file = regular;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wx.i.Regular getFile() {
            return this.file;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.file, ((Result) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "Result(file=" + this.file + ")";
        }
    }
}
