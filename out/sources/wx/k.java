package wx;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwx/k;", "Lwx/b;", "Lwx/l;", "e", "()Lwx/l;", "metadata", "a", "b", "Lwx/k$a;", "Lwx/k$b;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends b {

    /* JADX INFO: renamed from: wx.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwx/k$a;", "Lwx/k;", "Lwx/l;", "metadata", "<init>", "(Lwx/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/l;", "e", "()Lwx/l;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoredMetadata metadata;

        public Image(StoredMetadata lVar) {
            this.metadata = lVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Image) && t.c(this.metadata, ((Image) other).metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return "Image(metadata=" + this.metadata + ")";
        }

        @Override // wx.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public StoredMetadata getMetadata() {
            return this.metadata;
        }
    }

    /* JADX INFO: renamed from: wx.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwx/k$b;", "Lwx/k;", "Lwx/l;", "metadata", "<init>", "(Lwx/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/l;", "e", "()Lwx/l;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoredMetadata metadata;

        public Regular(StoredMetadata lVar) {
            this.metadata = lVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Regular) && t.c(this.metadata, ((Regular) other).metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return "Regular(metadata=" + this.metadata + ")";
        }

        @Override // wx.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public StoredMetadata getMetadata() {
            return this.metadata;
        }
    }

    @Override // wx.b
    /* JADX INFO: renamed from: e */
    StoredMetadata getMetadata();
}
