package bc4;

import fr.t;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lbc4/l;", "", "Lbc4/l$b;", "Lbc4/l$c;", "b", "c", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l extends gz.b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbc4/l$a;", "", "a", "b", "Lbc4/l$a$a;", "Lbc4/l$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: bc4.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbc4/l$a$a;", "Lbc4/l$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0456a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0456a f18210a = new C0456a();

            private C0456a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0456a);
            }

            public int hashCode() {
                return 1733924420;
            }

            public String toString() {
                return "All";
            }
        }

        /* JADX INFO: renamed from: bc4.l$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbc4/l$a$b;", "Lbc4/l$a;", "", "Lwx/d;", "extensions", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Limited implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<wx.d> extensions;

            public Limited(Set<wx.d> set) {
                this.extensions = set;
            }

            public final Set<wx.d> a() {
                return this.extensions;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Limited) && t.c(this.extensions, ((Limited) other).extensions);
            }

            public int hashCode() {
                return this.extensions.hashCode();
            }

            public String toString() {
                return "Limited(extensions=" + this.extensions + ")";
            }
        }
    }

    /* JADX INFO: renamed from: bc4.l$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbc4/l$c;", "", "Lwx/i$a;", "imageFile", "<init>", "(Lwx/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: bc4.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lbc4/l$b;", "Lgz/b$a;", "", "maxPhotoSizeInBytes", "", "Lwx/i$a;", "addedFiles", "Lbc4/l$a;", "allowedExtensions", "<init>", "(Ljava/lang/Float;Ljava/util/List;Lbc4/l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lbc4/l$a;", "()Lbc4/l$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float maxPhotoSizeInBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<wx.i.Image> addedFiles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a allowedExtensions;

        public Params(Float f15, List<wx.i.Image> list, a aVar) {
            this.maxPhotoSizeInBytes = f15;
            this.addedFiles = list;
            this.allowedExtensions = aVar;
        }

        public final List<wx.i.Image> a() {
            return this.addedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getAllowedExtensions() {
            return this.allowedExtensions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Float getMaxPhotoSizeInBytes() {
            return this.maxPhotoSizeInBytes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.maxPhotoSizeInBytes, params.maxPhotoSizeInBytes) && t.c(this.addedFiles, params.addedFiles) && t.c(this.allowedExtensions, params.allowedExtensions);
        }

        public int hashCode() {
            Float f15 = this.maxPhotoSizeInBytes;
            return ((((f15 == null ? 0 : f15.hashCode()) * 31) + this.addedFiles.hashCode()) * 31) + this.allowedExtensions.hashCode();
        }

        public String toString() {
            return "Params(maxPhotoSizeInBytes=" + this.maxPhotoSizeInBytes + ", addedFiles=" + this.addedFiles + ", allowedExtensions=" + this.allowedExtensions + ")";
        }

        public /* synthetic */ Params(Float f15, List list, a aVar, int i15, fr.k kVar) {
            this(f15, (i15 & 2) != 0 ? v.n() : list, (i15 & 4) != 0 ? a.C0456a.f18210a : aVar);
        }
    }
}
