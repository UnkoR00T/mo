package nw0;

import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnw0/g;", "Law0/h;", "Law0/l;", "signVehicleCollisionConfirmationStatementUC", "Ljw0/e;", "repository", "<init>", "(Law0/l;Ljw0/e;)V", "Law0/h$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Law0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Law0/l;", "b", "Ljw0/e;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements aw0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aw0.l signVehicleCollisionConfirmationStatementUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jw0.e repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f139154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f139156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f139157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f139158h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f139159j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f139160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f139161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f139162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f139163n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f139164p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f139165q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f139166r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f139167s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f139168t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f139170w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f139168t = obj;
            this.f139170w |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(aw0.l lVar, jw0.e eVar) {
        this.signVehicleCollisionConfirmationStatementUC = lVar;
        this.repository = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(aw0.h.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        aw0.h.Params params2;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar4;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f139170w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f139170w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objY = aVar.f139168t;
        Object objE = uq.b.e();
        ?? r15 = aVar.f139170w;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objY);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    aw0.l lVar = this.signVehicleCollisionConfirmationStatementUC;
                    aw0.l.Params params3 = new aw0.l.Params(params.getReadyToSignStatement(), params.getChallenge(), params.c());
                    aVar.f139154d = params;
                    aVar.f139155e = jVarA;
                    aVar.f139156f = vq.j.a(aVar2);
                    aVar.f139157g = vq.j.a(aVar2);
                    aVar.f139158h = aVar2;
                    aVar.f139161l = 0;
                    aVar.f139162m = 0;
                    aVar.f139163n = 0;
                    aVar.f139164p = 0;
                    aVar.f139165q = 0;
                    aVar.f139170w = 1;
                    objY = lVar.c(params3, aVar);
                    if (objY != objE) {
                        i15 = 0;
                        i18 = 0;
                        i17 = 0;
                        params2 = params;
                        bVar = aVar2;
                        bVar3 = bVar;
                        bVar2 = bVar3;
                        i19 = 0;
                        i16 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f139165q;
                        int i27 = aVar.f139164p;
                        int i28 = aVar.f139163n;
                        int i29 = aVar.f139162m;
                        int i35 = aVar.f139161l;
                        bVar = (ex.b) aVar.f139158h;
                        ex.b bVar5 = (ex.b) aVar.f139157g;
                        ex.b bVar6 = (ex.b) aVar.f139156f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f139155e;
                        params2 = (aw0.h.Params) aVar.f139154d;
                        try {
                            oq.u.b(objY);
                            i15 = i26;
                            jVarA = jVar;
                            bVar2 = bVar6;
                            bVar3 = bVar5;
                            i16 = i35;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
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
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) aVar.f139158h;
                        oq.u.b(objY);
                    }
                    iVar = (dx.i) objY;
                    bVar = bVar4;
                    bVar.a(iVar);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                iVar = (dx.i) objY;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    iy.b0 data = ((ry.a) ((dx.i.Right) iVar).b()).getData();
                    jw0.e eVar2 = this.repository;
                    ProcessId processId = params2.getReadyToSignStatement().getProcessId();
                    aVar.f139154d = vq.j.a(params2);
                    aVar.f139155e = jVarA;
                    aVar.f139156f = vq.j.a(bVar2);
                    aVar.f139157g = vq.j.a(bVar3);
                    aVar.f139158h = bVar;
                    aVar.f139159j = vq.j.a(iVar);
                    aVar.f139160k = vq.j.a(data);
                    aVar.f139161l = i16;
                    aVar.f139162m = i17;
                    aVar.f139163n = i18;
                    aVar.f139164p = i19;
                    aVar.f139165q = i15;
                    aVar.f139166r = 0;
                    aVar.f139167s = 0;
                    aVar.f139170w = 2;
                    objY = eVar2.y(processId, data, aVar);
                    if (objY != objE) {
                        bVar4 = bVar;
                        iVar = (dx.i) objY;
                        bVar = bVar4;
                    }
                    return objE;
                }
                bVar.a(iVar);
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
