package lc;

import fr.t;
import p071kotlin.Metadata;
import zc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Llc/b;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "a", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f117740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f117738b = new C2859b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f117739c = new a();

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"lc/b$a", "Llc/b;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "", "toString", "()Ljava/lang/String;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b {
        a() {
        }

        @Override // lc.b
        public int b(Object self) {
            if (self != null) {
                return self.hashCode();
            }
            return 0;
        }

        @Override // lc.b
        public boolean c(Object self, Object other) {
            return t.c(self, other);
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    }

    /* JADX INFO: renamed from: lc.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"lc/b$b", "Llc/b;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "", "toString", "()Ljava/lang/String;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2859b implements b {
        C2859b() {
        }

        @Override // lc.b
        public int b(Object self) {
            if (!(self instanceof ImageRequest)) {
                if (self != null) {
                    return self.hashCode();
                }
                return 0;
            }
            ImageRequest imageRequest = (ImageRequest) self;
            int iHashCode = ((imageRequest.getContext().hashCode() * 31) + imageRequest.getData().hashCode()) * 31;
            String memoryCacheKey = imageRequest.getMemoryCacheKey();
            int iHashCode2 = (((iHashCode + (memoryCacheKey != null ? memoryCacheKey.hashCode() : 0)) * 31) + imageRequest.r().hashCode()) * 31;
            String diskCacheKey = imageRequest.getDiskCacheKey();
            return ((((((iHashCode2 + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31) + imageRequest.getSizeResolver().hashCode()) * 31) + imageRequest.getScale().hashCode()) * 31) + imageRequest.getPrecision().hashCode();
        }

        @Override // lc.b
        public boolean c(Object self, Object other) {
            if (this == other) {
                return true;
            }
            if (!(self instanceof ImageRequest) || !(other instanceof ImageRequest)) {
                return t.c(self, other);
            }
            ImageRequest imageRequest = (ImageRequest) self;
            ImageRequest imageRequest2 = (ImageRequest) other;
            return t.c(imageRequest.getContext(), imageRequest2.getContext()) && t.c(imageRequest.getData(), imageRequest2.getData()) && t.c(imageRequest.getMemoryCacheKey(), imageRequest2.getMemoryCacheKey()) && t.c(imageRequest.r(), imageRequest2.r()) && t.c(imageRequest.getDiskCacheKey(), imageRequest2.getDiskCacheKey()) && t.c(imageRequest.getSizeResolver(), imageRequest2.getSizeResolver()) && imageRequest.getScale() == imageRequest2.getScale() && imageRequest.getPrecision() == imageRequest2.getPrecision();
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    /* JADX INFO: renamed from: lc.b$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Llc/b$c;", "", "<init>", "()V", "Llc/b;", "Default", "Llc/b;", "AllProperties", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f117740a = new Companion();

        private Companion() {
        }
    }

    int b(Object self);

    boolean c(Object self, Object other);
}
