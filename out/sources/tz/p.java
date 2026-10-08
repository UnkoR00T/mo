package tz;

import android.media.Image;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R<\u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Ltz/p;", "Ltz/b;", "", "<init>", "()V", "Lkotlin/Function1;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "result", "b", "(Ler/l;)V", "Landroidx/camera/core/o;", "image", "c", "(Landroidx/camera/core/o;)V", "a", "Ljava/lang/String;", "lastScannedOcrText", "Ler/l;", "getOnOcrScannedResult", "()Ler/l;", "setOnOcrScannedResult", "onOcrScannedResult", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String lastScannedOcrText = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.l<? super dx.i<? extends dx.b, String>, i0> onOcrScannedResult;

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(androidx.camera.core.o oVar, p pVar, zm.a aVar) {
        String strA;
        if (aVar != null && (strA = aVar.a()) != null && !fr.t.c(strA, pVar.lastScannedOcrText)) {
            pVar.lastScannedOcrText = strA;
            er.l<? super dx.i<? extends dx.b, String>, i0> lVar = pVar.onOcrScannedResult;
            if (lVar != null) {
                lVar.b(new dx.i.Right(strA));
            }
        }
        oVar.close();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(er.l lVar, Object obj) {
        lVar.b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.camera.core.o oVar, Exception exc) {
        oVar.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tz.b
    public void b(er.l<? super dx.i<? extends dx.b, ? extends String>, i0> result) {
        this.onOcrScannedResult = result;
    }

    @Override // androidx.camera.core.g.a
    public void c(final androidx.camera.core.o image) {
        Image imageM0 = image.m0();
        if (imageM0 != null) {
            vh.l<zm.a> lVarX = zm.b.a(new bn.a.C0531a().a()).x(vm.a.d(imageM0, image.v3().e()));
            final er.l lVar = new er.l() { // from class: tz.m
                @Override // er.l
                public final Object b(Object obj) {
                    return p.g(image, this, (zm.a) obj);
                }
            };
            lVarX.g(new vh.h() { // from class: tz.n
                @Override // vh.h
                public final void a(Object obj) {
                    p.h(lVar, obj);
                }
            }).e(new vh.g() { // from class: tz.o
                @Override // vh.g
                public final void c(Exception exc) {
                    p.i(image, exc);
                }
            });
        }
    }
}
