package a00;

import android.graphics.Bitmap;
import dx.g;
import dx.j;
import java.util.concurrent.CancellationException;
import ju.g2;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import vq.d;
import wx.i;
import zz.h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"La00/c;", "La00/b;", "Lb00/c;", "imageConverter", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Lb00/c;Lqx/a;)V", "Lwx/i$a;", "Ldx/i;", "Ldx/b;", "Lzz/h$a;", "c", "(Lwx/i$a;Ltq/e;)Ljava/lang/Object;", "La00/b$a;", "params", "Ldx/g;", "Lzz/h;", "a", "(La00/b$a;Ltq/e;)Ljava/lang/Object;", "Lb00/c;", "b", "Lqx/a;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1091f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1093h;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1091f = obj;
            this.f1093h |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f1098h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f1099j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f1100k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f1101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f1102m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1103n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f1104p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f1105q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1107s;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1105q = obj;
            this.f1107s |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(b00.c cVar, qx.a aVar) {
        this.imageConverter = cVar;
        this.imagePropertiesProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final Object c(i.Image image, e<? super dx.i<? extends dx.b, h.Image>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        j<dx.b> jVar;
        i.Image image2;
        int i16;
        int i17;
        int i18;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i19;
        Bitmap bitmap;
        i.Image image3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f1107s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f1107s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objH = bVar.f1105q;
        Object objE = uq.b.e();
        int i26 = bVar.f1107s;
        ?? r15 = 2;
        try {
            try {
                if (i26 == 0) {
                    u.b(objH);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        b00.c cVar = this.imageConverter;
                        byte[] bytes = image.getFileContent().getBytes();
                        bVar.f1094d = image;
                        bVar.f1095e = jVarA;
                        bVar.f1096f = vq.j.a(aVar);
                        bVar.f1097g = aVar;
                        bVar.f1098h = aVar;
                        i15 = 0;
                        bVar.f1100k = 0;
                        bVar.f1101l = 0;
                        bVar.f1102m = 0;
                        bVar.f1103n = 0;
                        bVar.f1104p = 0;
                        bVar.f1107s = 1;
                        objH = cVar.h(bytes, bVar);
                        if (objH != objE) {
                            jVar = jVarA;
                            image2 = image;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar2 = aVar;
                            bVar3 = bVar2;
                            bVar4 = bVar3;
                            i19 = 0;
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        f fVar = f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) bVar.f1099j;
                    bVar2 = (ex.b) bVar.f1098h;
                    image3 = (i.Image) bVar.f1094d;
                    try {
                        u.b(objH);
                        return new dx.i.Right(new h.Image(image3, (Bitmap) bVar2.a((dx.i) objH), bitmap.getHeight(), bitmap.getWidth()));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = bVar.f1104p;
                i16 = bVar.f1103n;
                i17 = bVar.f1102m;
                i18 = bVar.f1101l;
                int i28 = bVar.f1100k;
                ex.b bVar5 = (ex.b) bVar.f1098h;
                ex.b bVar6 = (ex.b) bVar.f1097g;
                bVar4 = (ex.b) bVar.f1096f;
                jVar = (j) bVar.f1095e;
                image2 = (i.Image) bVar.f1094d;
                try {
                    u.b(objH);
                    i15 = i27;
                    bVar2 = bVar6;
                    bVar3 = bVar5;
                    i19 = i28;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVar;
                    f fVar2 = f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
                Bitmap bitmap2 = (Bitmap) bVar3.a((dx.i) objH);
                g2.j(bVar.getContext());
                b00.c cVar2 = this.imageConverter;
                b00.f.ReduceDimension reduceDimension = new b00.f.ReduceDimension(this.imagePropertiesProvider.getThumbnailMaxSide());
                bVar.f1094d = image2;
                bVar.f1095e = jVar;
                bVar.f1096f = vq.j.a(bVar4);
                bVar.f1097g = vq.j.a(bVar2);
                bVar.f1098h = bVar2;
                bVar.f1099j = bitmap2;
                bVar.f1100k = i19;
                bVar.f1101l = i18;
                bVar.f1102m = i17;
                bVar.f1103n = i16;
                bVar.f1104p = i15;
                bVar.f1107s = 2;
                Object objF = cVar2.f(bitmap2, reduceDimension, bVar);
                if (objF != objE) {
                    bitmap = bitmap2;
                    objH = objF;
                    image3 = image2;
                    return new dx.i.Right(new h.Image(image3, (Bitmap) bVar2.a((dx.i) objH), bitmap.getHeight(), bitmap.getWidth()));
                }
                return objE;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a00.b
    public Object a(a00.b.Params params, e<? super dx.i<g, ? extends h>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f1093h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f1093h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f1091f;
        Object objE = uq.b.e();
        int i16 = aVar.f1093h;
        if (i16 == 0) {
            u.b(objC);
            i pickedFile = params.getPickedFile();
            if (!(pickedFile instanceof i.Image)) {
                if (pickedFile instanceof i.Regular) {
                    return new dx.i.Right(new h.Regular((i.Regular) pickedFile));
                }
                throw new p();
            }
            aVar.f1089d = vq.j.a(params);
            aVar.f1090e = vq.j.a(pickedFile);
            aVar.f1093h = 1;
            objC = c((i.Image) pickedFile, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left(g.f45096a);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new p();
    }
}
