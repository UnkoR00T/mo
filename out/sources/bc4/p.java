package bc4;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lbc4/p;", "", "Lbc4/p$a;", "Lwx/i$a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends gz.b {

    /* JADX INFO: renamed from: bc4.p$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lbc4/p$a;", "Lgz/b$a;", "Lwx/i$a;", "image", "", "defaultImageMaxSideOverride", "defaultImageQualityOverride", "Lxw/a;", "maxSize", "<init>", "(Lwx/i$a;Ljava/lang/Integer;Ljava/lang/Integer;Lxw/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "c", "()Lwx/i$a;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Lxw/a;", "()Lxw/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Image image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageMaxSideOverride;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer defaultImageQualityOverride;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final xw.a maxSize;

        public /* synthetic */ Params(wx.i.Image image, Integer num, Integer num2, xw.a aVar, fr.k kVar) {
            this(image, num, num2, aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getDefaultImageMaxSideOverride() {
            return this.defaultImageMaxSideOverride;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getDefaultImageQualityOverride() {
            return this.defaultImageQualityOverride;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final wx.i.Image getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final xw.a getMaxSize() {
            return this.maxSize;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.image, params.image) && t.c(this.defaultImageMaxSideOverride, params.defaultImageMaxSideOverride) && t.c(this.defaultImageQualityOverride, params.defaultImageQualityOverride) && t.c(this.maxSize, params.maxSize);
        }

        public int hashCode() {
            int iHashCode = this.image.hashCode() * 31;
            Integer num = this.defaultImageMaxSideOverride;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultImageQualityOverride;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            xw.a aVar = this.maxSize;
            return iHashCode3 + (aVar != null ? xw.a.e(aVar.getValue()) : 0);
        }

        public String toString() {
            return "Params(image=" + this.image + ", defaultImageMaxSideOverride=" + this.defaultImageMaxSideOverride + ", defaultImageQualityOverride=" + this.defaultImageQualityOverride + ", maxSize=" + this.maxSize + ")";
        }

        private Params(wx.i.Image image, Integer num, Integer num2, xw.a aVar) {
            this.image = image;
            this.defaultImageMaxSideOverride = num;
            this.defaultImageQualityOverride = num2;
            this.maxSize = aVar;
        }
    }
}
