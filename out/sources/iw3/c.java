package iw3;

import fr.k;
import fr.t;
import p071kotlin.Metadata;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Liw3/c;", "Lgz/b;", "Liw3/c$b;", "", "<init>", "()V", "params", "d", "(Liw3/c$b;Ltq/e;)Ljava/lang/Object;", "a", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<Params, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f97479a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liw3/c$a;", "", "<init>", "()V", "", "MAX_DEVIATION", "F", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: iw3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Liw3/c$b;", "Lgz/b$a;", "Lux/a$c;", "detectedFaceRotations", "<init>", "(Lux/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lux/a$c;", "()Lux/a$c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f97480b = DetectedFace.Rotations.f202081d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DetectedFace.Rotations detectedFaceRotations;

        public Params(DetectedFace.Rotations rotations) {
            this.detectedFaceRotations = rotations;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DetectedFace.Rotations getDetectedFaceRotations() {
            return this.detectedFaceRotations;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.detectedFaceRotations, ((Params) other).detectedFaceRotations);
        }

        public int hashCode() {
            return this.detectedFaceRotations.hashCode();
        }

        public String toString() {
            return "Params(detectedFaceRotations=" + this.detectedFaceRotations + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    public Object d(Params params, tq.e<? super Boolean> eVar) {
        boolean z15;
        DetectedFace.Rotations detectedFaceRotations = params.getDetectedFaceRotations();
        float y15 = detectedFaceRotations.getY();
        if (-8.0f > y15 || y15 > 8.0f) {
            z15 = false;
        } else {
            float x15 = detectedFaceRotations.getX();
            if (-8.0f > x15 || x15 > 8.0f) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return vq.b.a(z15);
    }
}
