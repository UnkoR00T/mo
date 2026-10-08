package zd2;

import fr.t;
import o04.FileName;
import p071kotlin.Metadata;
import vy.Axis;
import vy.Coordinates;
import vy.OrientationAngle;

/* JADX INFO: renamed from: zd2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b&\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b#\u00101¨\u00062"}, d2 = {"Lzd2/b;", "", "Lo04/a;", "fileName", "Lvy/b;", "accelerometer", "Lfz/b$d;", "date", "Lzd2/a;", "dimension", "gyroscope", "", "heading", "Lvy/c;", "location", "Lvy/k;", "tiltAngle", "<init>", "(Lo04/a;Lvy/b;Lfz/b$d;Lzd2/a;Lvy/b;Ljava/lang/Integer;Lvy/c;Lvy/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo04/a;", "d", "()Lo04/a;", "b", "Lvy/b;", "()Lvy/b;", "c", "Lfz/b$d;", "()Lfz/b$d;", "e", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Lvy/c;", "g", "()Lvy/c;", "Lvy/k;", "h", "()Lvy/k;", "Lzd2/a;", "()Lzd2/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageAttachments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FileName fileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Axis accelerometer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime date;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Axis gyroscope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer heading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates location;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrientationAngle tiltAngle;

    public ImageAttachments(FileName fileName, Axis axis, fz.b.LocalDateTime localDateTime, a aVar, Axis axis2, Integer num, Coordinates coordinates, OrientationAngle orientationAngle) {
        this.fileName = fileName;
        this.accelerometer = axis;
        this.date = localDateTime;
        this.gyroscope = axis2;
        this.heading = num;
        this.location = coordinates;
        this.tiltAngle = orientationAngle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Axis getAccelerometer() {
        return this.accelerometer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDateTime getDate() {
        return this.date;
    }

    public final a c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FileName getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Axis getGyroscope() {
        return this.gyroscope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageAttachments)) {
            return false;
        }
        ImageAttachments imageAttachments = (ImageAttachments) other;
        return t.c(this.fileName, imageAttachments.fileName) && t.c(this.accelerometer, imageAttachments.accelerometer) && t.c(this.date, imageAttachments.date) && t.c(null, null) && t.c(this.gyroscope, imageAttachments.gyroscope) && t.c(this.heading, imageAttachments.heading) && t.c(this.location, imageAttachments.location) && t.c(this.tiltAngle, imageAttachments.tiltAngle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Coordinates getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final OrientationAngle getTiltAngle() {
        return this.tiltAngle;
    }

    public int hashCode() {
        int iHashCode = this.fileName.hashCode() * 31;
        Axis axis = this.accelerometer;
        int iHashCode2 = (iHashCode + (axis == null ? 0 : axis.hashCode())) * 31;
        fz.b.LocalDateTime localDateTime = this.date;
        int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 961;
        Axis axis2 = this.gyroscope;
        int iHashCode4 = (iHashCode3 + (axis2 == null ? 0 : axis2.hashCode())) * 31;
        Integer num = this.heading;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Coordinates coordinates = this.location;
        int iHashCode6 = (iHashCode5 + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        OrientationAngle orientationAngle = this.tiltAngle;
        return iHashCode6 + (orientationAngle != null ? orientationAngle.hashCode() : 0);
    }

    public String toString() {
        return "ImageAttachments(fileName=" + this.fileName + ", accelerometer=" + this.accelerometer + ", date=" + this.date + ", dimension=" + ((Object) null) + ", gyroscope=" + this.gyroscope + ", heading=" + this.heading + ", location=" + this.location + ", tiltAngle=" + this.tiltAngle + ')';
    }
}
