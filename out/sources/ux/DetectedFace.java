package ux;

import fr.t;
import fx.Point;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ux.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\n\u0019\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lux/a;", "", "Lux/a$a;", "characteristicPoints", "Lux/a$b;", "classifications", "Lux/a$c;", "rotations", "<init>", "(Lux/a$a;Lux/a$b;Lux/a$c;)V", "a", "(Lux/a$a;Lux/a$b;Lux/a$c;)Lux/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lux/a$a;", "c", "()Lux/a$a;", "b", "Lux/a$b;", "d", "()Lux/a$b;", "Lux/a$c;", "e", "()Lux/a$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetectedFace {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CharacteristicPoints characteristicPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Classifications classifications;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rotations rotations;

    /* JADX INFO: renamed from: ux.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, d2 = {"Lux/a$a;", "", "Lfx/b;", "leftCenter", "topCenter", "rightCenter", "bottomCenter", "leftEyeCenter", "rightEyeCenter", "noseTop", "<init>", "(Lfx/b;Lfx/b;Lfx/b;Lfx/b;Lfx/b;Lfx/b;Lfx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfx/b;", "b", "()Lfx/b;", "g", "c", "e", "d", "f", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharacteristicPoints {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point leftCenter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point topCenter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point rightCenter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point bottomCenter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point leftEyeCenter;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point rightEyeCenter;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point noseTop;

        public CharacteristicPoints(Point point, Point point2, Point point3, Point point4, Point point5, Point point6, Point point7) {
            this.leftCenter = point;
            this.topCenter = point2;
            this.rightCenter = point3;
            this.bottomCenter = point4;
            this.leftEyeCenter = point5;
            this.rightEyeCenter = point6;
            this.noseTop = point7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Point getBottomCenter() {
            return this.bottomCenter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Point getLeftCenter() {
            return this.leftCenter;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Point getLeftEyeCenter() {
            return this.leftEyeCenter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Point getNoseTop() {
            return this.noseTop;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Point getRightCenter() {
            return this.rightCenter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CharacteristicPoints)) {
                return false;
            }
            CharacteristicPoints characteristicPoints = (CharacteristicPoints) other;
            return t.c(this.leftCenter, characteristicPoints.leftCenter) && t.c(this.topCenter, characteristicPoints.topCenter) && t.c(this.rightCenter, characteristicPoints.rightCenter) && t.c(this.bottomCenter, characteristicPoints.bottomCenter) && t.c(this.leftEyeCenter, characteristicPoints.leftEyeCenter) && t.c(this.rightEyeCenter, characteristicPoints.rightEyeCenter) && t.c(this.noseTop, characteristicPoints.noseTop);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Point getRightEyeCenter() {
            return this.rightEyeCenter;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Point getTopCenter() {
            return this.topCenter;
        }

        public int hashCode() {
            return (((((((((((this.leftCenter.hashCode() * 31) + this.topCenter.hashCode()) * 31) + this.rightCenter.hashCode()) * 31) + this.bottomCenter.hashCode()) * 31) + this.leftEyeCenter.hashCode()) * 31) + this.rightEyeCenter.hashCode()) * 31) + this.noseTop.hashCode();
        }

        public String toString() {
            return "CharacteristicPoints(leftCenter=" + this.leftCenter + ", topCenter=" + this.topCenter + ", rightCenter=" + this.rightCenter + ", bottomCenter=" + this.bottomCenter + ", leftEyeCenter=" + this.leftEyeCenter + ", rightEyeCenter=" + this.rightEyeCenter + ", noseTop=" + this.noseTop + ")";
        }
    }

    /* JADX INFO: renamed from: ux.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lux/a$b;", "", "", "smilingProbability", "openLeftEyeProbability", "openRightEyeProbability", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Classifications {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f202077d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float smilingProbability;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float openLeftEyeProbability;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float openRightEyeProbability;

        public Classifications(Float f15, Float f16, Float f17) {
            this.smilingProbability = f15;
            this.openLeftEyeProbability = f16;
            this.openRightEyeProbability = f17;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Float getOpenLeftEyeProbability() {
            return this.openLeftEyeProbability;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Float getOpenRightEyeProbability() {
            return this.openRightEyeProbability;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Float getSmilingProbability() {
            return this.smilingProbability;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Classifications)) {
                return false;
            }
            Classifications classifications = (Classifications) other;
            return t.c(this.smilingProbability, classifications.smilingProbability) && t.c(this.openLeftEyeProbability, classifications.openLeftEyeProbability) && t.c(this.openRightEyeProbability, classifications.openRightEyeProbability);
        }

        public int hashCode() {
            Float f15 = this.smilingProbability;
            int iHashCode = (f15 == null ? 0 : f15.hashCode()) * 31;
            Float f16 = this.openLeftEyeProbability;
            int iHashCode2 = (iHashCode + (f16 == null ? 0 : f16.hashCode())) * 31;
            Float f17 = this.openRightEyeProbability;
            return iHashCode2 + (f17 != null ? f17.hashCode() : 0);
        }

        public String toString() {
            return "Classifications(smilingProbability=" + this.smilingProbability + ", openLeftEyeProbability=" + this.openLeftEyeProbability + ", openRightEyeProbability=" + this.openRightEyeProbability + ")";
        }
    }

    /* JADX INFO: renamed from: ux.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lux/a$c;", "", "", "x", "y", "z", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rotations {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f202081d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float z;

        public Rotations(float f15, float f16, float f17) {
            this.x = f15;
            this.y = f16;
            this.z = f17;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getZ() {
            return this.z;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rotations)) {
                return false;
            }
            Rotations rotations = (Rotations) other;
            return Float.compare(this.x, rotations.x) == 0 && Float.compare(this.y, rotations.y) == 0 && Float.compare(this.z, rotations.z) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
        }

        public String toString() {
            return "Rotations(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
        }
    }

    public DetectedFace(CharacteristicPoints characteristicPoints, Classifications classifications, Rotations rotations) {
        this.characteristicPoints = characteristicPoints;
        this.classifications = classifications;
        this.rotations = rotations;
    }

    public static /* synthetic */ DetectedFace b(DetectedFace detectedFace, CharacteristicPoints characteristicPoints, Classifications classifications, Rotations rotations, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            characteristicPoints = detectedFace.characteristicPoints;
        }
        if ((i15 & 2) != 0) {
            classifications = detectedFace.classifications;
        }
        if ((i15 & 4) != 0) {
            rotations = detectedFace.rotations;
        }
        return detectedFace.a(characteristicPoints, classifications, rotations);
    }

    public final DetectedFace a(CharacteristicPoints characteristicPoints, Classifications classifications, Rotations rotations) {
        return new DetectedFace(characteristicPoints, classifications, rotations);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CharacteristicPoints getCharacteristicPoints() {
        return this.characteristicPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Classifications getClassifications() {
        return this.classifications;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Rotations getRotations() {
        return this.rotations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectedFace)) {
            return false;
        }
        DetectedFace detectedFace = (DetectedFace) other;
        return t.c(this.characteristicPoints, detectedFace.characteristicPoints) && t.c(this.classifications, detectedFace.classifications) && t.c(this.rotations, detectedFace.rotations);
    }

    public int hashCode() {
        return (((this.characteristicPoints.hashCode() * 31) + this.classifications.hashCode()) * 31) + this.rotations.hashCode();
    }

    public String toString() {
        return "DetectedFace(characteristicPoints=" + this.characteristicPoints + ", classifications=" + this.classifications + ", rotations=" + this.rotations + ")";
    }
}
