package hc4;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhc4/n;", "Lbc4/o;", "Lb00/c;", "imageConverter", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Lb00/c;Lqx/a;)V", "Lbc4/o$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lbc4/o$a;Ltq/e;)Ljava/lang/Object;", "a", "Lb00/c;", "b", "Lqx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements bc4.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83533h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83534j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83535k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f83536l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f83537m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83538n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f83539p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83540q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f83541r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f83542s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f83544v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83542s = obj;
            this.f83544v |= PKIFailureInfo.systemUnavail;
            return n.this.c(null, this);
        }
    }

    public n(b00.c cVar, qx.a aVar) {
        this.imageConverter = cVar;
        this.imagePropertiesProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0193  */
    /* JADX WARN: Code duplicated, block: B:55:0x0194  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    /* JADX WARN: Code duplicated, block: B:79:0x0224  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:82:0x0236  */
    /* JADX WARN: Code duplicated, block: B:85:0x0242  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.o.Params params, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        int i16;
        Object obj;
        bc4.o.Params params2;
        dx.j<dx.b> jVar;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        ex.b bVar;
        ex.b bVar2;
        Bitmap bitmap;
        bc4.o.Params params3;
        Object objF;
        int i27;
        ex.b bVar3;
        Bitmap bitmap2;
        Object obj2;
        int i28;
        int i29;
        bc4.o.Params params4;
        byte[] bArr;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i35 = aVar.f83544v;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83544v = i35 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objI = aVar.f83542s;
        ?? E = uq.b.e();
        int i36 = aVar.f83544v;
        try {
            try {
                if (i36 == 0) {
                    u.b(objI);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        Integer numE = vq.b.e(params.getOrientation());
                        numE.intValue();
                        if (params.getOrientation() == 0) {
                            numE = null;
                        }
                        if (numE != null) {
                            int iIntValue = numE.intValue();
                            b00.c cVar = this.imageConverter;
                            byte[] image = params.getImage();
                            aVar.f83529d = vq.j.a(params);
                            aVar.f83530e = jVarA;
                            aVar.f83531f = vq.j.a(aVar2);
                            aVar.f83532g = aVar2;
                            aVar.f83533h = aVar2;
                            i15 = 0;
                            aVar.f83535k = 0;
                            aVar.f83536l = 0;
                            aVar.f83537m = 0;
                            aVar.f83538n = 0;
                            aVar.f83539p = 0;
                            aVar.f83540q = iIntValue;
                            aVar.f83541r = 0;
                            aVar.f83544v = 1;
                            Object objH = cVar.h(image, aVar);
                            if (objH != E) {
                                i16 = iIntValue;
                                obj = objH;
                                params2 = params;
                                jVar = jVarA;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                i25 = 0;
                                i26 = 0;
                                bVar = aVar2;
                                bVar2 = bVar;
                                bitmap = (Bitmap) aVar2.a((dx.i) obj);
                                b00.c cVar2 = this.imageConverter;
                                params3 = params2;
                                b00.f.Rotate rotate = new b00.f.Rotate(i16);
                                aVar.f83529d = vq.j.a(params3);
                                aVar.f83530e = jVar;
                                aVar.f83531f = vq.j.a(bVar2);
                                aVar.f83532g = vq.j.a(bVar);
                                aVar.f83533h = bVar;
                                aVar.f83534j = vq.j.a(bitmap);
                                aVar.f83535k = i26;
                                aVar.f83536l = i25;
                                aVar.f83537m = i15;
                                aVar.f83538n = i19;
                                aVar.f83539p = i18;
                                aVar.f83540q = i16;
                                aVar.f83541r = i17;
                                aVar.f83544v = 2;
                                objF = cVar2.f(bitmap, rotate, aVar);
                                if (objF == E) {
                                    i27 = i26;
                                    bVar3 = bVar;
                                    bitmap2 = bitmap;
                                    obj2 = objF;
                                    i28 = i16;
                                    i29 = i17;
                                    params4 = params3;
                                    Bitmap bitmap3 = (Bitmap) bVar.a((dx.i) obj2);
                                    b00.c cVar3 = this.imageConverter;
                                    bc4.o.Params params5 = params4;
                                    int defaultImageQuality = this.imagePropertiesProvider.getDefaultImageQuality();
                                    aVar.f83529d = vq.j.a(params5);
                                    aVar.f83530e = jVar;
                                    aVar.f83531f = vq.j.a(bVar2);
                                    aVar.f83532g = vq.j.a(bVar3);
                                    aVar.f83533h = vq.j.a(bitmap2);
                                    aVar.f83534j = vq.j.a(bitmap3);
                                    aVar.f83535k = i27;
                                    aVar.f83536l = i25;
                                    aVar.f83537m = i15;
                                    aVar.f83538n = i19;
                                    aVar.f83539p = i18;
                                    aVar.f83540q = i28;
                                    aVar.f83541r = i29;
                                    aVar.f83544v = 3;
                                    objI = cVar3.i(bitmap3, defaultImageQuality, aVar);
                                    if (objI != E) {
                                    }
                                }
                            }
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i36 == 1) {
                        int i37 = aVar.f83541r;
                        int i38 = aVar.f83540q;
                        int i39 = aVar.f83539p;
                        int i45 = aVar.f83538n;
                        int i46 = aVar.f83537m;
                        int i47 = aVar.f83536l;
                        int i48 = aVar.f83535k;
                        aVar2 = (ex.b) aVar.f83533h;
                        ex.b bVar4 = (ex.b) aVar.f83532g;
                        ex.b bVar5 = (ex.b) aVar.f83531f;
                        jVar = (dx.j) aVar.f83530e;
                        params2 = (bc4.o.Params) aVar.f83529d;
                        try {
                            u.b(objI);
                            i17 = i37;
                            obj = objI;
                            bVar2 = bVar5;
                            bVar = bVar4;
                            i26 = i48;
                            i25 = i47;
                            i15 = i46;
                            i19 = i45;
                            i18 = i39;
                            i16 = i38;
                            bitmap = (Bitmap) aVar2.a((dx.i) obj);
                            b00.c cVar4 = this.imageConverter;
                            params3 = params2;
                            b00.f.Rotate rotate2 = new b00.f.Rotate(i16);
                            aVar.f83529d = vq.j.a(params3);
                            aVar.f83530e = jVar;
                            aVar.f83531f = vq.j.a(bVar2);
                            aVar.f83532g = vq.j.a(bVar);
                            aVar.f83533h = bVar;
                            aVar.f83534j = vq.j.a(bitmap);
                            aVar.f83535k = i26;
                            aVar.f83536l = i25;
                            aVar.f83537m = i15;
                            aVar.f83538n = i19;
                            aVar.f83539p = i18;
                            aVar.f83540q = i16;
                            aVar.f83541r = i17;
                            aVar.f83544v = 2;
                            objF = cVar4.f(bitmap, rotate2, aVar);
                            if (objF == E) {
                                i27 = i26;
                                bVar3 = bVar;
                                bitmap2 = bitmap;
                                obj2 = objF;
                                i28 = i16;
                                i29 = i17;
                                params4 = params3;
                                Bitmap bitmap4 = (Bitmap) bVar.a((dx.i) obj2);
                                b00.c cVar5 = this.imageConverter;
                                bc4.o.Params params6 = params4;
                                int defaultImageQuality2 = this.imagePropertiesProvider.getDefaultImageQuality();
                                aVar.f83529d = vq.j.a(params6);
                                aVar.f83530e = jVar;
                                aVar.f83531f = vq.j.a(bVar2);
                                aVar.f83532g = vq.j.a(bVar3);
                                aVar.f83533h = vq.j.a(bitmap2);
                                aVar.f83534j = vq.j.a(bitmap4);
                                aVar.f83535k = i27;
                                aVar.f83536l = i25;
                                aVar.f83537m = i15;
                                aVar.f83538n = i19;
                                aVar.f83539p = i18;
                                aVar.f83540q = i28;
                                aVar.f83541r = i29;
                                aVar.f83544v = 3;
                                objI = cVar5.i(bitmap4, defaultImageQuality2, aVar);
                                if (objI != E) {
                                }
                            }
                            return E;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            E = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i36 == 2) {
                        int i49 = aVar.f83541r;
                        i28 = aVar.f83540q;
                        i18 = aVar.f83539p;
                        i19 = aVar.f83538n;
                        i15 = aVar.f83537m;
                        i25 = aVar.f83536l;
                        i27 = aVar.f83535k;
                        bitmap2 = (Bitmap) aVar.f83534j;
                        bVar = (ex.b) aVar.f83533h;
                        ex.b bVar6 = (ex.b) aVar.f83532g;
                        ex.b bVar7 = (ex.b) aVar.f83531f;
                        dx.j<dx.b> jVar2 = (dx.j) aVar.f83530e;
                        bc4.o.Params params7 = (bc4.o.Params) aVar.f83529d;
                        try {
                            u.b(objI);
                            params4 = params7;
                            obj2 = objI;
                            bVar2 = bVar7;
                            bVar3 = bVar6;
                            jVar = jVar2;
                            i29 = i49;
                            Bitmap bitmap5 = (Bitmap) bVar.a((dx.i) obj2);
                            b00.c cVar6 = this.imageConverter;
                            bc4.o.Params params8 = params4;
                            int defaultImageQuality3 = this.imagePropertiesProvider.getDefaultImageQuality();
                            aVar.f83529d = vq.j.a(params8);
                            aVar.f83530e = jVar;
                            aVar.f83531f = vq.j.a(bVar2);
                            aVar.f83532g = vq.j.a(bVar3);
                            aVar.f83533h = vq.j.a(bitmap2);
                            aVar.f83534j = vq.j.a(bitmap5);
                            aVar.f83535k = i27;
                            aVar.f83536l = i25;
                            aVar.f83537m = i15;
                            aVar.f83538n = i19;
                            aVar.f83539p = i18;
                            aVar.f83540q = i28;
                            aVar.f83541r = i29;
                            aVar.f83544v = 3;
                            objI = cVar6.i(bitmap5, defaultImageQuality3, aVar);
                            bArr = objI != E ? (byte[]) objI : null;
                            return E;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            E = jVar2;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i36 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(objI);
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    }
                }
                return new dx.i.Right(bArr);
            } catch (Exception e36) {
                e = e36;
            }
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
