package tc4;

import ch1.f;
import dx.i;
import dx.j;
import i24.VehicleDocumentsFullData;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.e1;
import q34.i1;
import tq.e;
import vq.d;
import w24.q1;
import w24.y1;
import xw.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u0012H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ltc4/b;", "Lx34/a;", "Lch1/f;", "deleteDocumentFromOrderUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lw24/y1;", "hasOnlyOneCertificateUC", "Lq34/i1;", "isContainOneParentTypeDocumentUseCase", "Lw24/q1;", "getVehiclesDataUC", "Lq34/e1;", "getVehiclesDataUseCase", "<init>", "(Lch1/f;Lc54/b;Lw24/y1;Lq34/i1;Lw24/q1;Lq34/e1;)V", "", "documentTypeName", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "c", "Lch1/f;", "Lc54/b;", "Lw24/y1;", "d", "Lq34/i1;", "e", "Lw24/q1;", "f", "Lq34/e1;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements x34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f deleteDocumentFromOrderUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y1 hasOnlyOneCertificateUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i1 isContainOneParentTypeDocumentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q1 getVehiclesDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e1 getVehiclesDataUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f189548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f189551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f189553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f189554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f189555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f189556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f189557n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f189559q;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189557n = obj;
            this.f189559q |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    /* JADX INFO: renamed from: tc4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4928b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f189560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f189563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189564h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f189565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f189566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f189567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f189568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f189569n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f189571q;

        C4928b(e<? super C4928b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189569n = obj;
            this.f189571q |= PKIFailureInfo.systemUnavail;
            return b.this.c(this);
        }
    }

    public b(f fVar, c54.b bVar, y1 y1Var, i1 i1Var, q1 q1Var, e1 e1Var) {
        this.deleteDocumentFromOrderUC = fVar;
        this.isFeatureEnabledUseCase = bVar;
        this.hasOnlyOneCertificateUC = y1Var;
        this.isContainOneParentTypeDocumentUseCase = i1Var;
        this.getVehiclesDataUC = q1Var;
        this.getVehiclesDataUseCase = e1Var;
    }

    @Override // x34.a
    public Object a(String str, e<? super i<? extends dx.b, i0>> eVar) {
        return this.deleteDocumentFromOrderUC.c(new f.Params(str), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tc4.b$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // x34.a
    public Object b(e<? super i<? extends dx.b, Boolean>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.b bVar;
        boolean zBooleanValue;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f189559q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f189559q = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f189557n;
        Object objE = uq.b.e();
        int i16 = aVar.f189559q;
        try {
            try {
                try {
                    if (i16 == 0) {
                        u.b(obj);
                        j<dx.b> jVarA = c.f221622a.a();
                        try {
                            ex.a aVar3 = new ex.a();
                            boolean zBooleanValue2 = this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                y1 y1Var = this.hasOnlyOneCertificateUC;
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                aVar.f189553j = jVarA;
                                aVar.f189554k = vq.j.a(aVar3);
                                aVar.f189555l = vq.j.a(aVar3);
                                aVar.f189556m = aVar3;
                                aVar.f189548d = 0;
                                aVar.f189549e = 0;
                                aVar.f189550f = 0;
                                aVar.f189551g = 0;
                                aVar.f189552h = 0;
                                aVar.f189559q = 1;
                                Object objC = y1Var.c(c1792a, aVar);
                                if (objC != objE) {
                                    obj = objC;
                                    bVar = aVar3;
                                    zBooleanValue = ((Boolean) bVar.a((i) obj)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new p();
                                }
                                i1 i1Var = this.isContainOneParentTypeDocumentUseCase;
                                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                aVar.f189553j = jVarA;
                                aVar.f189554k = vq.j.a(aVar3);
                                aVar.f189555l = vq.j.a(aVar3);
                                aVar.f189548d = 0;
                                aVar.f189549e = 0;
                                aVar.f189550f = 0;
                                aVar.f189551g = 0;
                                aVar.f189552h = 0;
                                aVar.f189559q = 2;
                                Object objC2 = i1Var.c(c1792a2, aVar);
                                if (objC2 != objE) {
                                    obj = objC2;
                                    zBooleanValue = ((Boolean) obj).booleanValue();
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            aVar = jVarA;
                            e = e17;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(aVar));
                            i iVarA = aVar.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar = (ex.b) aVar.f189556m;
                        u.b(obj);
                        zBooleanValue = ((Boolean) bVar.a((i) obj)).booleanValue();
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                        zBooleanValue = ((Boolean) obj).booleanValue();
                    }
                    return new i.Right(vq.b.a(zBooleanValue));
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tc4.b$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // x34.a
    public Object c(e<? super Boolean> eVar) throws Throwable {
        ?? c4928b;
        Object objB;
        i left;
        ex.b bVar;
        ex.b bVar2;
        boolean zIsEmpty;
        if (eVar instanceof C4928b) {
            C4928b c4928b2 = (C4928b) eVar;
            int i15 = c4928b2.f189571q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4928b2.f189571q = i15 - PKIFailureInfo.systemUnavail;
                c4928b = c4928b2;
            } else {
                c4928b = new C4928b(eVar);
            }
        } else {
            c4928b = new C4928b(eVar);
        }
        Object obj = c4928b.f189569n;
        Object objE = uq.b.e();
        int i16 = c4928b.f189571q;
        try {
            try {
                try {
                    if (i16 == 0) {
                        u.b(obj);
                        j<dx.b> jVarA = c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                q1 q1Var = this.getVehiclesDataUC;
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                c4928b.f189565j = jVarA;
                                c4928b.f189566k = vq.j.a(aVar);
                                c4928b.f189567l = vq.j.a(aVar);
                                c4928b.f189568m = aVar;
                                c4928b.f189560d = 0;
                                c4928b.f189561e = 0;
                                c4928b.f189562f = 0;
                                c4928b.f189563g = 0;
                                c4928b.f189564h = 0;
                                c4928b.f189571q = 1;
                                Object objC = q1Var.c(c1792a, c4928b);
                                if (objC != objE) {
                                    obj = objC;
                                    bVar2 = aVar;
                                    zIsEmpty = ((VehicleDocumentsFullData) bVar2.a((i) obj)).a().isEmpty();
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new p();
                                }
                                e1 e1Var = this.getVehiclesDataUseCase;
                                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                c4928b.f189565j = jVarA;
                                c4928b.f189566k = vq.j.a(aVar);
                                c4928b.f189567l = vq.j.a(aVar);
                                c4928b.f189568m = aVar;
                                c4928b.f189560d = 0;
                                c4928b.f189561e = 0;
                                c4928b.f189562f = 0;
                                c4928b.f189563g = 0;
                                c4928b.f189564h = 0;
                                c4928b.f189571q = 2;
                                Object objC2 = e1Var.c(c1792a2, c4928b);
                                if (objC2 != objE) {
                                    obj = objC2;
                                    bVar = aVar;
                                    zIsEmpty = ((List) bVar.a((i) obj)).isEmpty();
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            left = new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            c4928b = jVarA;
                            e = e17;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(c4928b));
                            i iVarA = c4928b.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            left = new i.Left(objB);
                        }
                    } else if (i16 == 1) {
                        bVar2 = (ex.b) c4928b.f189568m;
                        u.b(obj);
                        zIsEmpty = ((VehicleDocumentsFullData) bVar2.a((i) obj)).a().isEmpty();
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) c4928b.f189568m;
                        u.b(obj);
                        zIsEmpty = ((List) bVar.a((i) obj)).isEmpty();
                    }
                    left = new i.Right(vq.b.a(zIsEmpty));
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
        if (left instanceof i.Left) {
            return vq.b.a(true);
        }
        if (left instanceof i.Right) {
            return ((i.Right) left).b();
        }
        throw new p();
    }
}
