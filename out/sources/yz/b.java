package yz;

import android.graphics.PointF;
import dx.i;
import dx.j;
import fx.Point;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxm/a;", "Ldx/i;", "Ldx/b;", "Lux/a;", "b", "(Lxm/a;)Ldx/i;", "Lux/a$a;", "a", "Landroid/graphics/PointF;", "Lfx/b;", "c", "(Landroid/graphics/PointF;)Lfx/b;", "media_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final i<dx.b, DetectedFace.CharacteristicPoints> a(xm.a aVar) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    List<xm.b> listA = aVar.a();
                    for (Object obj : listA) {
                        if (((xm.b) obj).a() == 1) {
                            List<PointF> listB = ((xm.b) obj).b();
                            for (Object obj2 : listA) {
                                if (((xm.b) obj2).a() == 12) {
                                    List<PointF> listB2 = ((xm.b) obj2).b();
                                    List<xm.f> listB3 = aVar.b();
                                    Point pointC = c(listB.get(28));
                                    Point pointA = fx.c.a(y.a(Float.valueOf(listB.get(0).x), Float.valueOf(aVar.c().top)));
                                    Point pointC2 = c(listB.get(8));
                                    Point pointC3 = c(listB.get(18));
                                    for (Object obj3 : listB3) {
                                        if (((xm.f) obj3).a() == 4) {
                                            Point pointC4 = c(((xm.f) obj3).b());
                                            for (Object obj4 : listB3) {
                                                if (((xm.f) obj4).a() == 10) {
                                                    return new i.Right(new DetectedFace.CharacteristicPoints(pointC, pointA, pointC2, pointC3, pointC4, c(((xm.f) obj4).b()), c(listB2.get(0))));
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, DetectedFace> b(xm.a aVar) {
        i iVarA = a(aVar);
        if (iVarA instanceof i.Left) {
            return iVarA;
        }
        if (iVarA instanceof i.Right) {
            return new i.Right(new DetectedFace((DetectedFace.CharacteristicPoints) ((i.Right) iVarA).b(), new DetectedFace.Classifications(aVar.k(), aVar.i(), aVar.j()), new DetectedFace.Rotations(aVar.e(), aVar.f(), aVar.g())));
        }
        throw new p();
    }

    private static final Point c(PointF pointF) {
        return new Point(pointF.x, pointF.y);
    }
}
