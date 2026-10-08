package wz;

import android.graphics.Bitmap;
import dx.i;
import dx.j;
import er.p;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.concurrent.CancellationException;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import vq.k;
import xw.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwz/c;", "Lwz/a;", "Lxw/d;", "dispatcherProvider", "<init>", "(Lxw/d;)V", "Lwz/b$a;", "code", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "b", "(Lwz/b$a;Ltq/e;)Ljava/lang/Object;", "Lwz/b$b;", "c", "(Lwz/b$b;Ltq/e;)Ljava/lang/Object;", "Lwz/b;", "codeType", "a", "(Lwz/b;Ltq/e;)Ljava/lang/Object;", "Lxw/d;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements wz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d dispatcherProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wz.b.BarCode f216002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wz.b.BarCode barCode, e<? super a> eVar) {
            super(2, eVar);
            this.f216002f = barCode;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f216001e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            wz.b.BarCode barCode = this.f216002f;
            j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        hn.b bVarB = new en.e().b(barCode.getContentToEncode(), en.a.CODE_128, barCode.getWidth(), 1);
                        int iJ = bVarB.j();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iJ, barCode.getHeight(), Bitmap.Config.ARGB_8888);
                        for (int i15 = 0; i15 < iJ; i15++) {
                            int[] iArr = new int[barCode.getHeight()];
                            Arrays.fill(iArr, bVarB.g(i15, 0) ? -16777216 : -1);
                            bitmapCreateBitmap.setPixels(iArr, 0, 1, i15, 0, 1, barCode.getHeight());
                        }
                        return new i.Right(bitmapCreateBitmap);
                    } catch (Exception e15) {
                        f fVar = f.f163100a;
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
                                throw new oq.p();
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<? extends dx.b, Bitmap>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f216002f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, e<? super i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wz.b.QrCode f216004f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wz.b.QrCode qrCode, e<? super b> eVar) {
            super(2, eVar);
            this.f216004f = qrCode;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f216003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            wz.b.QrCode qrCode = this.f216004f;
            j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        EnumMap enumMap = new EnumMap(en.c.class);
                        enumMap.put(en.c.MARGIN, vq.b.e(0));
                        enumMap.put(en.c.CHARACTER_SET, fu.d.UTF_8.name());
                        hn.b bVarA = new en.e().a(qrCode.getContentToEncode(), en.a.QR_CODE, qrCode.getSize(), qrCode.getSize(), enumMap);
                        int iJ = bVarA.j();
                        int i15 = bVarA.i();
                        int[] iArr = new int[iJ * i15];
                        for (int i16 = 0; i16 < i15; i16++) {
                            int i17 = i16 * iJ;
                            for (int i18 = 0; i18 < iJ; i18++) {
                                iArr[i17 + i18] = bVarA.g(i18, i16) ? -16777216 : -1;
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iJ, i15, Bitmap.Config.RGB_565);
                        bitmapCreateBitmap.setPixels(iArr, 0, iJ, 0, 0, iJ, i15);
                        return new i.Right(bitmapCreateBitmap);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                f fVar = f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof i.Left) {
                    objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                } else {
                    if (!(objA instanceof i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((i.Right) objA).b();
                }
                return new i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<? extends dx.b, Bitmap>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f216004f, eVar);
        }
    }

    public c(d dVar) {
        this.dispatcherProvider = dVar;
    }

    private final Object b(wz.b.BarCode barCode, e<? super i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new a(barCode, null), eVar);
    }

    private final Object c(wz.b.QrCode qrCode, e<? super i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new b(qrCode, null), eVar);
    }

    @Override // wz.a
    public Object a(wz.b bVar, e<? super i<? extends dx.b, Bitmap>> eVar) {
        if (bVar instanceof wz.b.BarCode) {
            return b((wz.b.BarCode) bVar, eVar);
        }
        if (bVar instanceof wz.b.QrCode) {
            return c((wz.b.QrCode) bVar, eVar);
        }
        throw new oq.p();
    }
}
