package bc4;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import zb4.FileSizeLimit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lbc4/a;", "Lgz/a;", "Lbc4/a$a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.a<Params, dx.i<? extends dx.b, ? extends i0>> {

    /* JADX INFO: renamed from: bc4.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbc4/a$a;", "Lgz/b$a;", "Lzb4/a;", "uploadedFilesSizeLimit", "", "currentFileSize", "<init>", "(Lzb4/a;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzb4/a;", "b", "()Lzb4/a;", "F", "()F", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileSizeLimit uploadedFilesSizeLimit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float currentFileSize;

        public Params(FileSizeLimit fileSizeLimit, float f15) {
            this.uploadedFilesSizeLimit = fileSizeLimit;
            this.currentFileSize = f15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getCurrentFileSize() {
            return this.currentFileSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FileSizeLimit getUploadedFilesSizeLimit() {
            return this.uploadedFilesSizeLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.uploadedFilesSizeLimit, params.uploadedFilesSizeLimit) && Float.compare(this.currentFileSize, params.currentFileSize) == 0;
        }

        public int hashCode() {
            return (this.uploadedFilesSizeLimit.hashCode() * 31) + Float.hashCode(this.currentFileSize);
        }

        public String toString() {
            return "Params(uploadedFilesSizeLimit=" + this.uploadedFilesSizeLimit + ", currentFileSize=" + this.currentFileSize + ")";
        }
    }
}
