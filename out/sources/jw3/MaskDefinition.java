package jw3;

import cw3.IdentityPhotoData;
import fr.k;
import fr.t;
import fx.Line;
import fx.Point;
import fx.Rectangle;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jw3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0017\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010$R\u0017\u0010)\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b'\u0010\u0016R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b+\u0010\u0016¨\u0006-"}, d2 = {"Ljw3/b;", "", "Lfx/e;", "container", "Lcw3/a$a;", "maskType", "<init>", "(Lfx/e;Lcw3/a$a;)V", "a", "(Lfx/e;Lcw3/a$a;)Ljw3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfx/e;", "d", "()Lfx/e;", "b", "Lcw3/a$a;", "g", "()Lcw3/a$a;", "Ljw3/b$b;", "c", "Ljw3/b$b;", "e", "()Ljw3/b$b;", "faceRect", "Lfx/a;", "Lfx/a;", "i", "()Lfx/a;", "topEyeLine", "bottomEyeLine", "f", "j", "verticalLine", "leftEyeRect", "h", "rightEyeRect", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaskDefinition {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f106435i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106436j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rectangle container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityPhotoData.AbstractC0815a maskType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FaceRect faceRect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Line topEyeLine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Line bottomEyeLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Line verticalLine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rectangle leftEyeRect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Rectangle rightEyeRect;

    /* JADX INFO: renamed from: jw3.b$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljw3/b$a;", "", "<init>", "()V", "", "MASK_WIDTH_TO_CONTAINER_RATIO", "F", "MASK_HEIGHT_TO_CONTAINER_RATIO", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: jw3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljw3/b$b;", "", "Lfx/e;", "rect", "Lfx/b;", "radius", "<init>", "(Lfx/e;Lfx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfx/e;", "b", "()Lfx/e;", "Lfx/b;", "()Lfx/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaceRect {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f106445c = Point.f68451c | Rectangle.f68456g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Rectangle rect;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Point radius;

        public FaceRect(Rectangle rectangle, Point point) {
            this.rect = rectangle;
            this.radius = point;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Point getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Rectangle getRect() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceRect)) {
                return false;
            }
            FaceRect faceRect = (FaceRect) other;
            return t.c(this.rect, faceRect.rect) && t.c(this.radius, faceRect.radius);
        }

        public int hashCode() {
            return (this.rect.hashCode() * 31) + this.radius.hashCode();
        }

        public String toString() {
            return "FaceRect(rect=" + this.rect + ", radius=" + this.radius + ')';
        }
    }

    public MaskDefinition(Rectangle rectangle, IdentityPhotoData.AbstractC0815a abstractC0815a) {
        Point start;
        Point start2;
        Point start3;
        Point start4;
        this.container = rectangle;
        this.maskType = abstractC0815a;
        float width = rectangle.getWidth() * 0.75f;
        float height = rectangle.getHeight() * 0.8f;
        float f15 = 2;
        float width2 = (rectangle.getWidth() - width) / f15;
        float height2 = (rectangle.getHeight() - height) / f15;
        float f16 = width2 + width;
        float f17 = height + height2;
        float f18 = width / f15;
        FaceRect faceRect = new FaceRect(new Rectangle(width2, height2, f16, f17), fx.c.a(y.a(Float.valueOf(f18), Float.valueOf(f18))));
        this.faceRect = faceRect;
        IdentityPhotoData.AbstractC0815a.c cVarA = abstractC0815a.a();
        IdentityPhotoData.AbstractC0815a.c.Visible visible = cVarA instanceof IdentityPhotoData.AbstractC0815a.c.Visible ? (IdentityPhotoData.AbstractC0815a.c.Visible) cVarA : null;
        Line line = visible != null ? new Line(fx.c.a(y.a(Float.valueOf(width2), Float.valueOf(rectangle.getHeight() * visible.getTopEyeLineYPositionRatio()))), fx.c.a(y.a(Float.valueOf(f16), Float.valueOf(rectangle.getHeight() * visible.getTopEyeLineYPositionRatio())))) : null;
        this.topEyeLine = line;
        IdentityPhotoData.AbstractC0815a.c cVarA2 = abstractC0815a.a();
        IdentityPhotoData.AbstractC0815a.c.Visible visible2 = cVarA2 instanceof IdentityPhotoData.AbstractC0815a.c.Visible ? (IdentityPhotoData.AbstractC0815a.c.Visible) cVarA2 : null;
        Line line2 = visible2 != null ? new Line(fx.c.a(y.a(Float.valueOf(width2), Float.valueOf(rectangle.getHeight() * visible2.getBottomEyeLineYPositionRatio()))), fx.c.a(y.a(Float.valueOf(f16), Float.valueOf(rectangle.getHeight() * visible2.getBottomEyeLineYPositionRatio())))) : null;
        this.bottomEyeLine = line2;
        Line line3 = new Line(fx.c.a(y.a(Float.valueOf(rectangle.getWidth() / 2.0f), Float.valueOf(height2))), fx.c.a(y.a(Float.valueOf(rectangle.getWidth() / 2.0f), Float.valueOf(f17))));
        this.verticalLine = line3;
        this.leftEyeRect = new Rectangle(faceRect.getRect().getLeft(), (line == null || (start4 = line.getStart()) == null) ? faceRect.getRect().getTop() : start4.getY(), line3.getStart().getX(), (line2 == null || (start3 = line2.getStart()) == null) ? faceRect.getRect().getBottom() : start3.getY());
        this.rightEyeRect = new Rectangle(line3.getStart().getX(), (line == null || (start2 = line.getStart()) == null) ? faceRect.getRect().getTop() : start2.getY(), faceRect.getRect().getRight(), (line2 == null || (start = line2.getStart()) == null) ? faceRect.getRect().getBottom() : start.getY());
    }

    public static /* synthetic */ MaskDefinition b(MaskDefinition maskDefinition, Rectangle rectangle, IdentityPhotoData.AbstractC0815a abstractC0815a, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            rectangle = maskDefinition.container;
        }
        if ((i15 & 2) != 0) {
            abstractC0815a = maskDefinition.maskType;
        }
        return maskDefinition.a(rectangle, abstractC0815a);
    }

    public final MaskDefinition a(Rectangle container, IdentityPhotoData.AbstractC0815a maskType) {
        return new MaskDefinition(container, maskType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Line getBottomEyeLine() {
        return this.bottomEyeLine;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Rectangle getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FaceRect getFaceRect() {
        return this.faceRect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaskDefinition)) {
            return false;
        }
        MaskDefinition maskDefinition = (MaskDefinition) other;
        return t.c(this.container, maskDefinition.container) && t.c(this.maskType, maskDefinition.maskType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Rectangle getLeftEyeRect() {
        return this.leftEyeRect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final IdentityPhotoData.AbstractC0815a getMaskType() {
        return this.maskType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Rectangle getRightEyeRect() {
        return this.rightEyeRect;
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + this.maskType.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Line getTopEyeLine() {
        return this.topEyeLine;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Line getVerticalLine() {
        return this.verticalLine;
    }

    public String toString() {
        return "MaskDefinition(container=" + this.container + ", maskType=" + this.maskType + ')';
    }
}
