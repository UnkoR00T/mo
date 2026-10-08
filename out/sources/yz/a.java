package yz;

import fx.Point;
import fx.Rectangle;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\r*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyz/a;", "Lux/b;", "<init>", "()V", "Lux/a$a;", "", "shouldMirrorPoints", "Lfx/e;", "maskContainer", "faceContainer", "isFillScaleType", "b", "(Lux/a$a;ZLfx/e;Lfx/e;Z)Lux/a$a;", "Lfx/b;", "", "scale", "offset", "Lfx/d;", "pointTransition", "c", "(Lfx/b;FLfx/b;Lfx/d;)Lfx/b;", "Lux/a;", "detectedFace", "a", "(Lux/a;ZLfx/e;Lfx/e;Z)Lux/a;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ux.b {
    private final DetectedFace.CharacteristicPoints b(DetectedFace.CharacteristicPoints characteristicPoints, boolean z15, Rectangle rectangle, Rectangle rectangle2, boolean z16) {
        float fMin;
        float width = rectangle.getWidth() / rectangle2.getWidth();
        float height = rectangle.getHeight() / rectangle2.getHeight();
        if (z16) {
            fMin = Math.max(width, height);
        } else {
            if (z16) {
                throw new p();
            }
            fMin = Math.min(width, height);
        }
        float f15 = 2;
        Point point = new Point((rectangle.getWidth() - (rectangle2.getWidth() * fMin)) / f15, (rectangle.getHeight() - (rectangle2.getHeight() * fMin)) / f15);
        fx.d mirror = z15 ? new fx.d.Mirror(rectangle.getWidth()) : fx.d.b.f68455a;
        Point pointC = c(characteristicPoints.getLeftCenter(), fMin, point, mirror);
        Point pointC2 = c(characteristicPoints.getRightCenter(), fMin, point, mirror);
        Point pointC3 = c(characteristicPoints.getLeftEyeCenter(), fMin, point, mirror);
        Point pointC4 = c(characteristicPoints.getRightEyeCenter(), fMin, point, mirror);
        boolean z17 = mirror instanceof fx.d.Mirror;
        r rVarA = z17 ? y.a(pointC2, pointC) : y.a(pointC, pointC2);
        Point point2 = (Point) rVarA.a();
        Point point3 = (Point) rVarA.b();
        r rVarA2 = z17 ? y.a(pointC4, pointC3) : y.a(pointC3, pointC4);
        return new DetectedFace.CharacteristicPoints(point2, c(characteristicPoints.getTopCenter(), fMin, point, mirror), point3, c(characteristicPoints.getBottomCenter(), fMin, point, mirror), (Point) rVarA2.a(), (Point) rVarA2.b(), c(characteristicPoints.getNoseTop(), fMin, point, mirror));
    }

    private final Point c(Point point, float f15, Point point2, fx.d dVar) {
        float x15 = (point.getX() * f15) + point2.getX();
        if (dVar instanceof fx.d.Mirror) {
            x15 = ((fx.d.Mirror) dVar).getContainerWidth() - x15;
        }
        return new Point(x15, (point.getY() * f15) + point2.getY());
    }

    @Override // ux.b
    public DetectedFace a(DetectedFace detectedFace, boolean shouldMirrorPoints, Rectangle maskContainer, Rectangle faceContainer, boolean isFillScaleType) {
        return DetectedFace.b(detectedFace, b(detectedFace.getCharacteristicPoints(), shouldMirrorPoints, maskContainer, faceContainer, isFillScaleType), null, null, 6, null);
    }
}
