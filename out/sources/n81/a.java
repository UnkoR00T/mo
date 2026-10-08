package n81;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ln81/a;", "", "Ln81/a$a;", "data", "Loq/i0;", "k2", "(Ln81/a$a;)V", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: n81.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln81/a$a;", "", "", "identityPhotoEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaceDetectionData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean identityPhotoEnabled;

        public FaceDetectionData(boolean z15) {
            this.identityPhotoEnabled = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIdentityPhotoEnabled() {
            return this.identityPhotoEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FaceDetectionData) && this.identityPhotoEnabled == ((FaceDetectionData) other).identityPhotoEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.identityPhotoEnabled);
        }

        public String toString() {
            return "FaceDetectionData(identityPhotoEnabled=" + this.identityPhotoEnabled + ')';
        }
    }

    void k2(FaceDetectionData data);
}
