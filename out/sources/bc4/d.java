package bc4;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lbc4/d;", "Lgz/a;", "Lbc4/d$a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.a<Params, dx.i<? extends dx.b, ? extends i0>> {

    /* JADX INFO: renamed from: bc4.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lbc4/d$a;", "Lgz/b$a;", "", "bitmapHeight", "bitmapWidth", "minPhotoResolutionLongSide", "minPhotoResolutionShortSide", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int bitmapHeight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int bitmapWidth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionLongSide;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionShortSide;

        public Params(int i15, int i16, int i17, int i18) {
            this.bitmapHeight = i15;
            this.bitmapWidth = i16;
            this.minPhotoResolutionLongSide = i17;
            this.minPhotoResolutionShortSide = i18;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBitmapHeight() {
            return this.bitmapHeight;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBitmapWidth() {
            return this.bitmapWidth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinPhotoResolutionLongSide() {
            return this.minPhotoResolutionLongSide;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMinPhotoResolutionShortSide() {
            return this.minPhotoResolutionShortSide;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.bitmapHeight == params.bitmapHeight && this.bitmapWidth == params.bitmapWidth && this.minPhotoResolutionLongSide == params.minPhotoResolutionLongSide && this.minPhotoResolutionShortSide == params.minPhotoResolutionShortSide;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.bitmapHeight) * 31) + Integer.hashCode(this.bitmapWidth)) * 31) + Integer.hashCode(this.minPhotoResolutionLongSide)) * 31) + Integer.hashCode(this.minPhotoResolutionShortSide);
        }

        public String toString() {
            return "Params(bitmapHeight=" + this.bitmapHeight + ", bitmapWidth=" + this.bitmapWidth + ", minPhotoResolutionLongSide=" + this.minPhotoResolutionLongSide + ", minPhotoResolutionShortSide=" + this.minPhotoResolutionShortSide + ")";
        }
    }
}
