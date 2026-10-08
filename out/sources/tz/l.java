package tz;

import android.media.Image;
import fx.Rectangle;
import java.util.List;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltz/l;", "Ltz/b;", "Lvx/a;", "<init>", "()V", "Lkotlin/Function1;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "result", "b", "(Ler/l;)V", "Landroidx/camera/core/o;", "imageProxy", "c", "(Landroidx/camera/core/o;)V", "a", "Ler/l;", "onScannedResult", "Lxm/d;", "Loq/k;", "l", "()Lxm/d;", "faceDetector", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements b<vx.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private er.l<? super dx.i<? extends dx.b, ? extends vx.a>, i0> onScannedResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k faceDetector = oq.l.a(new er.a() { // from class: tz.k
        @Override // er.a
        public final Object a() {
            return l.k();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, androidx.camera.core.o oVar, vm.a aVar, List list) {
        Object success;
        if (list.isEmpty()) {
            success = vx.a.InterfaceC5477a.e.f208559a;
        } else if (list.size() > 1) {
            success = vx.a.InterfaceC5477a.d.f208558a;
        } else {
            dx.i<dx.b, DetectedFace> iVarB = yz.b.b((xm.a) v.l0(list));
            if (iVarB instanceof dx.i.Left) {
                success = vx.a.InterfaceC5477a.c.f208557a;
            } else {
                if (!(iVarB instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                DetectedFace detectedFace = (DetectedFace) ((dx.i.Right) iVarB).b();
                oq.r rVarA = v.q(90, 270).contains(Integer.valueOf(aVar.l())) ? y.a(Float.valueOf(aVar.m()), Float.valueOf(aVar.i())) : y.a(Float.valueOf(aVar.i()), Float.valueOf(aVar.m()));
                success = new vx.a.Success(detectedFace, new Rectangle(((Number) rVarA.b()).floatValue(), ((Number) rVarA.a()).floatValue()));
            }
        }
        er.l<? super dx.i<? extends dx.b, ? extends vx.a>, i0> lVar2 = lVar.onScannedResult;
        if (lVar2 != null) {
            lVar2.b(new dx.i.Right(success));
        }
        oVar.close();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(er.l lVar, Object obj) {
        lVar.b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l lVar, Exception exc) {
        er.l<? super dx.i<? extends dx.b, ? extends vx.a>, i0> lVar2 = lVar.onScannedResult;
        if (lVar2 != null) {
            lVar2.b(new dx.i.Right(exc instanceof lm.a ? a00.a.a((lm.a) exc) : vx.a.InterfaceC5477a.b.C5480b.f208556a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xm.d k() {
        return xm.c.b(new xm.e.a().f(1).b(2).d(2).c(2).e(0.15f).a());
    }

    private final xm.d l() {
        return (xm.d) this.faceDetector.getValue();
    }

    @Override // tz.b
    public void b(er.l<? super dx.i<? extends dx.b, ? extends vx.a>, i0> result) {
        this.onScannedResult = result;
    }

    @Override // androidx.camera.core.g.a
    public void c(final androidx.camera.core.o imageProxy) {
        Image imageM0 = imageProxy.m0();
        if (imageM0 != null) {
            final vm.a aVarD = vm.a.d(imageM0, imageProxy.v3().e());
            vh.l<List<xm.a>> lVarX = l().x(aVarD);
            final er.l lVar = new er.l() { // from class: tz.h
                @Override // er.l
                public final Object b(Object obj) {
                    return l.h(this.f192665a, imageProxy, aVarD, (List) obj);
                }
            };
            lVarX.g(new vh.h() { // from class: tz.i
                @Override // vh.h
                public final void a(Object obj) {
                    l.i(lVar, obj);
                }
            }).e(new vh.g() { // from class: tz.j
                @Override // vh.g
                public final void c(Exception exc) {
                    l.j(this.f192669a, exc);
                }
            });
        }
    }
}
