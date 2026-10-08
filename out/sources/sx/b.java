package sx;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lsx/b;", "", "Lsx/d;", "a", "()Lsx/d;", "lensSide", "", "b", "()F", "zoom", "Lsx/b$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    /* JADX INFO: renamed from: a */
    d getLensSide();

    /* JADX INFO: renamed from: b */
    float getZoom();

    /* JADX INFO: renamed from: sx.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsx/b$a;", "Lsx/b;", "Lgz/b$a;", "Lsx/d;", "lensSide", "", "zoom", "Lsx/e;", "scannerType", "<init>", "(Lsx/d;FLsx/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsx/d;", "()Lsx/d;", "b", "F", "()F", "c", "Lsx/e;", "()Lsx/e;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Analyzer implements b, gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d lensSide;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float zoom;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final e scannerType;

        public Analyzer(d dVar, float f15, e eVar) {
            this.lensSide = dVar;
            this.zoom = f15;
            this.scannerType = eVar;
        }

        @Override // sx.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public d getLensSide() {
            return this.lensSide;
        }

        @Override // sx.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public float getZoom() {
            return this.zoom;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getScannerType() {
            return this.scannerType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analyzer)) {
                return false;
            }
            Analyzer analyzer = (Analyzer) other;
            return this.lensSide == analyzer.lensSide && Float.compare(this.zoom, analyzer.zoom) == 0 && t.c(this.scannerType, analyzer.scannerType);
        }

        public int hashCode() {
            return (((this.lensSide.hashCode() * 31) + Float.hashCode(this.zoom)) * 31) + this.scannerType.hashCode();
        }

        public String toString() {
            return "Analyzer(lensSide=" + this.lensSide + ", zoom=" + this.zoom + ", scannerType=" + this.scannerType + ")";
        }

        public /* synthetic */ Analyzer(d dVar, float f15, e eVar, int i15, k kVar) {
            this(dVar, (i15 & 2) != 0 ? 1.0f : f15, eVar);
        }
    }
}
