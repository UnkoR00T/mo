package iw3;

import fr.k;
import fr.t;
import p071kotlin.Metadata;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Liw3/a;", "Lgz/b;", "Liw3/a$b;", "", "<init>", "()V", "", "other", "e", "(Ljava/lang/Float;F)Z", "params", "d", "(Liw3/a$b;Ltq/e;)Ljava/lang/Object;", "a", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2287a f97473a = new C2287a(null);

    /* JADX INFO: renamed from: iw3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liw3/a$a;", "", "<init>", "()V", "", "OPEN_EYE_MIN_PROBABILITY", "F", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C2287a {
        public /* synthetic */ C2287a(k kVar) {
            this();
        }

        private C2287a() {
        }
    }

    /* JADX INFO: renamed from: iw3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Liw3/a$b;", "Lgz/b$a;", "Lux/a$b;", "detectedFaceClassifications", "<init>", "(Lux/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lux/a$b;", "()Lux/a$b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f97474b = DetectedFace.Classifications.f202077d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DetectedFace.Classifications detectedFaceClassifications;

        public Params(DetectedFace.Classifications classifications) {
            this.detectedFaceClassifications = classifications;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DetectedFace.Classifications getDetectedFaceClassifications() {
            return this.detectedFaceClassifications;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.detectedFaceClassifications, ((Params) other).detectedFaceClassifications);
        }

        public int hashCode() {
            return this.detectedFaceClassifications.hashCode();
        }

        public String toString() {
            return "Params(detectedFaceClassifications=" + this.detectedFaceClassifications + ')';
        }
    }

    private final boolean e(Float f15, float f16) {
        return f15 != null && f15.floatValue() >= f16;
    }

    public Object d(Params params, tq.e<? super Boolean> eVar) {
        DetectedFace.Classifications detectedFaceClassifications = params.getDetectedFaceClassifications();
        return vq.b.a(e(detectedFaceClassifications.getOpenLeftEyeProbability(), 0.9f) && e(detectedFaceClassifications.getOpenRightEyeProbability(), 0.9f));
    }
}
