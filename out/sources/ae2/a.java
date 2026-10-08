package ae2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lae2/a;", "Lgz/b;", "Lae2/a$a;", "Lwx/i$a;", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b<Params, wx.i.Image> {

    /* JADX INFO: renamed from: ae2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lae2/a$a;", "Lgz/b$a;", "Lwx/i$a;", "sourceImage", "targetImage", "<init>", "(Lwx/i$a;Lwx/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "b", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f5479c = wx.i.Image.f215739c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Image sourceImage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i.Image targetImage;

        public Params(wx.i.Image image, wx.i.Image image2) {
            this.sourceImage = image;
            this.targetImage = image2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wx.i.Image getSourceImage() {
            return this.sourceImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wx.i.Image getTargetImage() {
            return this.targetImage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.sourceImage, params.sourceImage) && t.c(this.targetImage, params.targetImage);
        }

        public int hashCode() {
            return (this.sourceImage.hashCode() * 31) + this.targetImage.hashCode();
        }

        public String toString() {
            return "Params(sourceImage=" + this.sourceImage + ", targetImage=" + this.targetImage + ')';
        }
    }
}
