package tz;

import android.media.Image;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\t2\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR0\u0010\u001e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006!"}, d2 = {"Ltz/u;", "Ltz/b;", "", "Lsx/a;", "format", "<init>", "(Lsx/a;)V", "", "Lsm/a;", "Loq/i0;", "k", "(Ljava/util/List;)V", "", "m", "(Lsx/a;)I", "Lkotlin/Function1;", "Ldx/i;", "Ldx/b;", "result", "b", "(Ler/l;)V", "Landroidx/camera/core/o;", "image", "c", "(Landroidx/camera/core/o;)V", "a", "Lsx/a;", "getFormat", "()Lsx/a;", "Ler/l;", "onQrCodeScannedResult", "Ljava/lang/String;", "lastScannedQrCode", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sx.a format;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.l<? super dx.i<? extends dx.b, String>, i0> onQrCodeScannedResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String lastScannedQrCode = "";

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192688a;

        static {
            int[] iArr = new int[sx.a.values().length];
            try {
                iArr[sx.a.FORMAT_QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sx.a.FORMAT_AZTEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f192688a = iArr;
        }
    }

    public u(sx.a aVar) {
        this.format = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(u uVar, androidx.camera.core.o oVar, List list) {
        uVar.k(list);
        oVar.close();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(er.l lVar, Object obj) {
        lVar.b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(u uVar, androidx.camera.core.o oVar, Exception exc) {
        er.l<? super dx.i<? extends dx.b, String>, i0> lVar = uVar.onQrCodeScannedResult;
        if (lVar != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("QrCodeAnalyzerException: ");
            String message = exc.getMessage();
            if (message == null) {
                message = exc.getClass().getName();
            }
            sb5.append(message);
            lVar.b(new dx.i.Left(new dx.b.Generic(new Exception(sb5.toString()))));
        }
        oVar.close();
    }

    private final void k(List<? extends sm.a> list) {
        final sm.a aVar;
        String strA;
        if (list == null || (aVar = (sm.a) v.n0(list)) == null) {
            return;
        }
        String strE = aVar.e();
        if (strE == null) {
            strE = aVar.b();
        }
        if (strE != null) {
            i0 i0Var = null;
            if (strE.length() <= 0) {
                byte[] bArrD = aVar.d();
                if (bArrD == null || (strA = fu.r.A(bArrD)) == null) {
                    strA = "QR is empty.";
                }
                er.l<? super dx.i<? extends dx.b, String>, i0> lVar = this.onQrCodeScannedResult;
                if (lVar != null) {
                    lVar.b(new dx.i.Left(new dx.b.Generic(new Exception(strA))));
                    i0Var = i0.f148189a;
                }
            } else if (fr.t.c(strE, this.lastScannedQrCode)) {
                i0Var = i0.f148189a;
            } else {
                this.lastScannedQrCode = strE;
                er.l<? super dx.i<? extends dx.b, String>, i0> lVar2 = this.onQrCodeScannedResult;
                if (lVar2 != null) {
                    lVar2.b(new dx.i.Right(strE));
                    i0Var = i0.f148189a;
                }
            }
            if (i0Var != null) {
                return;
            }
        }
        new er.a() { // from class: tz.t
            @Override // er.a
            public final Object a() {
                return u.l(aVar, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(sm.a aVar, u uVar) {
        String strA;
        byte[] bArrD = aVar.d();
        if (bArrD == null || (strA = fu.r.A(bArrD)) == null) {
            strA = "RawValue and DisplayValue are null";
        }
        er.l<? super dx.i<? extends dx.b, String>, i0> lVar = uVar.onQrCodeScannedResult;
        if (lVar == null) {
            return null;
        }
        lVar.b(new dx.i.Left(new dx.b.Generic(new Exception(strA))));
        return i0.f148189a;
    }

    private final int m(sx.a aVar) {
        int i15 = a.f192688a[aVar.ordinal()];
        if (i15 == 1) {
            return 256;
        }
        if (i15 == 2) {
            return PKIFailureInfo.certConfirmed;
        }
        throw new oq.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tz.b
    public void b(er.l<? super dx.i<? extends dx.b, ? extends String>, i0> result) {
        this.onQrCodeScannedResult = result;
    }

    @Override // androidx.camera.core.g.a
    public void c(final androidx.camera.core.o image) {
        Image imageM0 = image.m0();
        if (imageM0 != null) {
            vh.l<List<sm.a>> lVarX = rm.c.a(new rm.b.a().b(m(this.format), new int[0]).a()).x(vm.a.d(imageM0, image.v3().e()));
            final er.l lVar = new er.l() { // from class: tz.q
                @Override // er.l
                public final Object b(Object obj) {
                    return u.h(this.f192678a, image, (List) obj);
                }
            };
            lVarX.g(new vh.h() { // from class: tz.r
                @Override // vh.h
                public final void a(Object obj) {
                    u.i(lVar, obj);
                }
            }).e(new vh.g() { // from class: tz.s
                @Override // vh.g
                public final void c(Exception exc) {
                    u.j(this.f192681a, image, exc);
                }
            });
        }
    }
}
