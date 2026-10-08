package ae3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lae3/b;", "Lgz/b;", "Lae3/b$a;", "Lwx/i$a;", "Lxx/a;", "exifDataManager", "<init>", "(Lxx/a;)V", "params", "d", "(Lae3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lxx/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, wx.i.Image> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    /* JADX INFO: renamed from: ae3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lae3/b$a;", "Lgz/b$a;", "Lwx/i$a;", "sourceImage", "targetImage", "<init>", "(Lwx/i$a;Lwx/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f5648c = wx.i.Image.f215739c;

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
            return fr.t.c(this.sourceImage, params.sourceImage) && fr.t.c(this.targetImage, params.targetImage);
        }

        public int hashCode() {
            return (this.sourceImage.hashCode() * 31) + this.targetImage.hashCode();
        }

        public String toString() {
            return "Params(sourceImage=" + this.sourceImage + ", targetImage=" + this.targetImage + ')';
        }
    }

    /* JADX INFO: renamed from: ae3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0119b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f5654g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f5656j;

        C0119b(tq.e<? super C0119b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5654g = obj;
            this.f5656j |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(xx.a aVar) {
        this.exifDataManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r11 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(ae3.b.Params r10, tq.e<? super wx.i.Image> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.b.d(ae3.b$a, tq.e):java.lang.Object");
    }
}
