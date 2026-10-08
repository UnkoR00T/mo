package bc4;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lbc4/j;", "", "Lbc4/j$a;", "", "Lwx/i$a;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends gz.b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lbc4/j$b;", "", "Lxw/a;", "a", "()F", "maxSize", "b", "Lbc4/j$b$a;", "Lbc4/j$b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: bc4.j$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbc4/j$b$a;", "Lbc4/j$b;", "Lxw/a;", "maxSize", "<init>", "(FLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PerFile implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final float maxSize;

            public /* synthetic */ PerFile(float f15, fr.k kVar) {
                this(f15);
            }

            @Override // bc4.j.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public float getMaxSize() {
                return this.maxSize;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerFile) && xw.a.d(this.maxSize, ((PerFile) other).maxSize);
            }

            public int hashCode() {
                return xw.a.e(this.maxSize);
            }

            public String toString() {
                return "PerFile(maxSize=" + xw.a.f(this.maxSize) + ")";
            }

            private PerFile(float f15) {
                this.maxSize = f15;
            }
        }

        /* JADX INFO: renamed from: bc4.j$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbc4/j$b$b;", "Lbc4/j$b;", "Lxw/a;", "maxSize", "<init>", "(FLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Total implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final float maxSize;

            public /* synthetic */ Total(float f15, fr.k kVar) {
                this(f15);
            }

            @Override // bc4.j.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public float getMaxSize() {
                return this.maxSize;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Total) && xw.a.d(this.maxSize, ((Total) other).maxSize);
            }

            public int hashCode() {
                return xw.a.e(this.maxSize);
            }

            public String toString() {
                return "Total(maxSize=" + xw.a.f(this.maxSize) + ")";
            }

            private Total(float f15) {
                this.maxSize = f15;
            }
        }

        /* JADX INFO: renamed from: a */
        float getMaxSize();
    }

    /* JADX INFO: renamed from: bc4.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b\u001e\u0010\u0012¨\u0006%"}, d2 = {"Lbc4/j$a;", "Lgz/b$a;", "", "maxRemainingPhotosCount", "", "Lwx/i;", "addedFiles", "Lbc4/j$b;", "sizePolicy", "Lbc4/l$a;", "allowedExtensions", "maxPhotosCount", "<init>", "(ILjava/util/List;Lbc4/j$b;Lbc4/l$a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lbc4/j$b;", "f", "()Lbc4/j$b;", "Lbc4/l$a;", "()Lbc4/l$a;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxRemainingPhotosCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<wx.i> addedFiles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b sizePolicy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.a allowedExtensions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxPhotosCount;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(int i15, List<? extends wx.i> list, b bVar, l.a aVar, int i16) {
            this.maxRemainingPhotosCount = i15;
            this.addedFiles = list;
            this.sizePolicy = bVar;
            this.allowedExtensions = aVar;
            this.maxPhotosCount = i16;
        }

        public final List<wx.i> a() {
            return this.addedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final l.a getAllowedExtensions() {
            return this.allowedExtensions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMaxPhotosCount() {
            return this.maxPhotosCount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxRemainingPhotosCount() {
            return this.maxRemainingPhotosCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.maxRemainingPhotosCount == params.maxRemainingPhotosCount && t.c(this.addedFiles, params.addedFiles) && t.c(this.sizePolicy, params.sizePolicy) && t.c(this.allowedExtensions, params.allowedExtensions) && this.maxPhotosCount == params.maxPhotosCount;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b getSizePolicy() {
            return this.sizePolicy;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.maxRemainingPhotosCount) * 31) + this.addedFiles.hashCode()) * 31) + this.sizePolicy.hashCode()) * 31) + this.allowedExtensions.hashCode()) * 31) + Integer.hashCode(this.maxPhotosCount);
        }

        public String toString() {
            return "Params(maxRemainingPhotosCount=" + this.maxRemainingPhotosCount + ", addedFiles=" + this.addedFiles + ", sizePolicy=" + this.sizePolicy + ", allowedExtensions=" + this.allowedExtensions + ", maxPhotosCount=" + this.maxPhotosCount + ")";
        }

        public /* synthetic */ Params(int i15, List list, b bVar, l.a aVar, int i16, int i17, fr.k kVar) {
            this(i15, (i17 & 2) != 0 ? v.n() : list, bVar, (i17 & 8) != 0 ? l.a.C0456a.f18210a : aVar, (i17 & 16) != 0 ? 0 : i16);
        }
    }
}
