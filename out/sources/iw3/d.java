package iw3;

import fr.k;
import fr.t;
import jw3.MaskDefinition;
import p071kotlin.Metadata;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Liw3/d;", "Lgz/b;", "Liw3/d$b;", "", "<init>", "()V", "params", "d", "(Liw3/d$b;Ltq/e;)Ljava/lang/Object;", "a", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<Params, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f97482a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Liw3/d$a;", "", "<init>", "()V", "", "ACCEPTABLE_X_OFFSET_TO_FACE_RATIO", "F", "ACCEPTABLE_TOP_OFFSET_TO_FACE_RATIO", "ACCEPTABLE_BOTTOM_OFFSET_TO_FACE_RATIO", "ACCEPTABLE_NOSE_X_OFFSET_TO_FACE_RATIO", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: iw3.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Liw3/d$b;", "Lgz/b$a;", "Lux/a$a;", "points", "Ljw3/b;", "maskDefinition", "<init>", "(Lux/a$a;Ljw3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lux/a$a;", "b", "()Lux/a$a;", "Ljw3/b;", "()Ljw3/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DetectedFace.CharacteristicPoints points;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        public Params(DetectedFace.CharacteristicPoints characteristicPoints, MaskDefinition maskDefinition) {
            this.points = characteristicPoints;
            this.maskDefinition = maskDefinition;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DetectedFace.CharacteristicPoints getPoints() {
            return this.points;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.points, params.points) && t.c(this.maskDefinition, params.maskDefinition);
        }

        public int hashCode() {
            return (this.points.hashCode() * 31) + this.maskDefinition.hashCode();
        }

        public String toString() {
            return "Params(points=" + this.points + ", maskDefinition=" + this.maskDefinition + ')';
        }
    }

    public Object d(Params params, tq.e<? super Boolean> eVar) {
        float width = params.getMaskDefinition().getFaceRect().getRect().getWidth() * 0.2f;
        float height = params.getMaskDefinition().getFaceRect().getRect().getHeight() * 0.3f;
        float height2 = params.getMaskDefinition().getFaceRect().getRect().getHeight() * 0.1f;
        float width2 = params.getMaskDefinition().getFaceRect().getRect().getWidth() * 0.05f;
        float y15 = params.getPoints().getTopCenter().getY() - params.getMaskDefinition().getFaceRect().getRect().getTop();
        boolean z15 = 0.0f <= y15 && y15 <= height;
        float bottom = params.getMaskDefinition().getFaceRect().getRect().getBottom() - params.getPoints().getBottomCenter().getY();
        boolean z16 = 0.0f <= bottom && bottom <= height2;
        float x15 = params.getPoints().getLeftCenter().getX() - params.getMaskDefinition().getFaceRect().getRect().getLeft();
        boolean z17 = 0.0f <= x15 && x15 <= width;
        float right = params.getMaskDefinition().getFaceRect().getRect().getRight() - params.getPoints().getRightCenter().getX();
        boolean z18 = 0.0f <= right && right <= width;
        boolean zA = params.getMaskDefinition().getLeftEyeRect().a(params.getPoints().getLeftEyeCenter());
        boolean zA2 = params.getMaskDefinition().getRightEyeRect().a(params.getPoints().getRightEyeCenter());
        float f15 = -width2;
        float x16 = params.getPoints().getNoseTop().getX() - params.getMaskDefinition().getVerticalLine().getStart().getX();
        return vq.b.a(f15 <= x16 && x16 <= width2 && zA && zA2 && z15 && z16 && z18 && z17);
    }
}
