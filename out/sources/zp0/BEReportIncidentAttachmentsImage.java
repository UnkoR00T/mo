package zp0;

import p071kotlin.Metadata;
import vy.Axis;
import vy.Coordinates;
import vy.OrientationAngle;

/* JADX INFO: renamed from: zp0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b!\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104¨\u00065"}, d2 = {"Lzp0/j;", "", "Lry/a;", "fileEncryptionIV", "", "fileName", "Lvy/b;", "accelerometer", "Lfz/b$d;", "date", "Lzp0/k;", "dimension", "gyroscope", "", "heading", "Lvy/c;", "location", "Lvy/k;", "tiltAngle", "<init>", "(Liy/b0;Ljava/lang/String;Lvy/b;Lfz/b$d;Lzp0/k;Lvy/b;Ljava/lang/Integer;Lvy/c;Lvy/k;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "d", "()Liy/b0;", "b", "Ljava/lang/String;", "e", "c", "Lvy/b;", "()Lvy/b;", "Lfz/b$d;", "()Lfz/b$d;", "Lzp0/k;", "()Lzp0/k;", "f", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", "Lvy/c;", "()Lvy/c;", "i", "Lvy/k;", "()Lvy/k;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportIncidentAttachmentsImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionIV;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Axis accelerometer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime date;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final k dimension;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Axis gyroscope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer heading;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates location;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrientationAngle tiltAngle;

    public /* synthetic */ BEReportIncidentAttachmentsImage(iy.b0 b0Var, String str, Axis axis, fz.b.LocalDateTime localDateTime, k kVar, Axis axis2, Integer num, Coordinates coordinates, OrientationAngle orientationAngle, fr.k kVar2) {
        this(b0Var, str, axis, localDateTime, kVar, axis2, num, coordinates, orientationAngle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Axis getAccelerometer() {
        return this.accelerometer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getDimension() {
        return this.dimension;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getFileEncryptionIV() {
        return this.fileEncryptionIV;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportIncidentAttachmentsImage)) {
            return false;
        }
        BEReportIncidentAttachmentsImage bEReportIncidentAttachmentsImage = (BEReportIncidentAttachmentsImage) other;
        return ry.a.d(this.fileEncryptionIV, bEReportIncidentAttachmentsImage.fileEncryptionIV) && fr.t.c(this.fileName, bEReportIncidentAttachmentsImage.fileName) && fr.t.c(this.accelerometer, bEReportIncidentAttachmentsImage.accelerometer) && fr.t.c(this.date, bEReportIncidentAttachmentsImage.date) && fr.t.c(this.dimension, bEReportIncidentAttachmentsImage.dimension) && fr.t.c(this.gyroscope, bEReportIncidentAttachmentsImage.gyroscope) && fr.t.c(this.heading, bEReportIncidentAttachmentsImage.heading) && fr.t.c(this.location, bEReportIncidentAttachmentsImage.location) && fr.t.c(this.tiltAngle, bEReportIncidentAttachmentsImage.tiltAngle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Axis getGyroscope() {
        return this.gyroscope;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Coordinates getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iE = ((ry.a.e(this.fileEncryptionIV) * 31) + this.fileName.hashCode()) * 31;
        Axis axis = this.accelerometer;
        int iHashCode = (iE + (axis == null ? 0 : axis.hashCode())) * 31;
        fz.b.LocalDateTime localDateTime = this.date;
        int iHashCode2 = (((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31) + 0) * 31;
        Axis axis2 = this.gyroscope;
        int iHashCode3 = (iHashCode2 + (axis2 == null ? 0 : axis2.hashCode())) * 31;
        Integer num = this.heading;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Coordinates coordinates = this.location;
        int iHashCode5 = (iHashCode4 + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        OrientationAngle orientationAngle = this.tiltAngle;
        return iHashCode5 + (orientationAngle != null ? orientationAngle.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final OrientationAngle getTiltAngle() {
        return this.tiltAngle;
    }

    public String toString() {
        return "BEReportIncidentAttachmentsImage(fileEncryptionIV=" + ry.a.f(this.fileEncryptionIV) + ", fileName=" + this.fileName + ", accelerometer=" + this.accelerometer + ", date=" + this.date + ", dimension=" + this.dimension + ", gyroscope=" + this.gyroscope + ", heading=" + this.heading + ", location=" + this.location + ", tiltAngle=" + this.tiltAngle + ")";
    }

    private BEReportIncidentAttachmentsImage(iy.b0 b0Var, String str, Axis axis, fz.b.LocalDateTime localDateTime, k kVar, Axis axis2, Integer num, Coordinates coordinates, OrientationAngle orientationAngle) {
        this.fileEncryptionIV = b0Var;
        this.fileName = str;
        this.accelerometer = axis;
        this.date = localDateTime;
        this.dimension = kVar;
        this.gyroscope = axis2;
        this.heading = num;
        this.location = coordinates;
        this.tiltAngle = orientationAngle;
    }
}
