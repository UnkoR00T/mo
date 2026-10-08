package ae3;

import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tv0.BENewCollisionData;
import tv0.BESavedDraftCollision;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lae3/r;", "", "Lae3/r$a;", "Loq/i0;", "Lzd3/a;", "collisionStorageRepository", "Lvd3/a;", "vehicleCollisionContainersInteractor", "<init>", "(Lzd3/a;Lvd3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lae3/r$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzd3/a;", "b", "Lvd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zd3.a collisionStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vd3.a vehicleCollisionContainersInteractor;

    /* JADX INFO: renamed from: ae3.r$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lae3/r$a;", "Lgz/b$a;", "Ltv0/c;", "step", "Ltv0/e;", "newCollisionData", "<init>", "(Ltv0/c;Ltv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/c;", "b", "()Ltv0/c;", "Ltv0/e;", "()Ltv0/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tv0.c step;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BENewCollisionData newCollisionData;

        public Params(tv0.c cVar, BENewCollisionData bENewCollisionData) {
            this.step = cVar;
            this.newCollisionData = bENewCollisionData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BENewCollisionData getNewCollisionData() {
            return this.newCollisionData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final tv0.c getStep() {
            return this.step;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.step == params.step && fr.t.c(this.newCollisionData, params.newCollisionData);
        }

        public int hashCode() {
            tv0.c cVar = this.step;
            return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.newCollisionData.hashCode();
        }

        public String toString() {
            return "Params(step=" + this.step + ", newCollisionData=" + this.newCollisionData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5901h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5903k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5904l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5905m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5906n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5907p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5909r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5910s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5911t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5912v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f5913w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f5915y;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5913w = obj;
            this.f5915y |= PKIFailureInfo.systemUnavail;
            return r.this.d(null, this);
        }
    }

    public r(zd3.a aVar, vd3.a aVar2) {
        this.collisionStorageRepository = aVar;
        this.vehicleCollisionContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:14:0x0053, B:57:0x01da, B:58:0x01dc, B:61:0x01ed, B:64:0x01fc, B:48:0x0177, B:51:0x0181, B:53:0x0185, B:59:0x01e7, B:60:0x01ec, B:34:0x00c6, B:43:0x0136, B:37:0x00d3, B:39:0x00fc, B:44:0x013a), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0185 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:14:0x0053, B:57:0x01da, B:58:0x01dc, B:61:0x01ed, B:64:0x01fc, B:48:0x0177, B:51:0x0181, B:53:0x0185, B:59:0x01e7, B:60:0x01ec, B:34:0x00c6, B:43:0x0136, B:37:0x00d3, B:39:0x00fc, B:44:0x013a), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e7 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:14:0x0053, B:57:0x01da, B:58:0x01dc, B:61:0x01ed, B:64:0x01fc, B:48:0x0177, B:51:0x0181, B:53:0x0185, B:59:0x01e7, B:60:0x01ec, B:34:0x00c6, B:43:0x0136, B:37:0x00d3, B:39:0x00fc, B:44:0x013a), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x025e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        Object left;
        dx.j<dx.b> jVarA;
        ex.b aVar;
        ProcessId processId;
        BESavedDraftCollision bESavedDraftCollision;
        Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar4;
        dx.i iVar;
        Params params3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f5915y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5915y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f5913w;
        Object objE = uq.b.e();
        ?? r15 = bVar.f5915y;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objF);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    processId = (ProcessId) aVar.a(params.getNewCollisionData().d());
                    bESavedDraftCollision = new BESavedDraftCollision(params.getStep(), params.getNewCollisionData());
                    if (this.vehicleCollisionContainersInteractor.a()) {
                        zd3.a aVar2 = this.collisionStorageRepository;
                        bVar.f5897d = vq.j.a(params);
                        bVar.f5898e = jVarA;
                        bVar.f5899f = vq.j.a(aVar);
                        bVar.f5900g = vq.j.a(aVar);
                        bVar.f5901h = vq.j.a(processId);
                        bVar.f5902j = vq.j.a(bESavedDraftCollision);
                        bVar.f5903k = aVar;
                        bVar.f5906n = 0;
                        bVar.f5907p = 0;
                        bVar.f5908q = 0;
                        bVar.f5909r = 0;
                        bVar.f5910s = 0;
                        bVar.f5915y = 1;
                        objF = aVar2.e(processId, bESavedDraftCollision, bVar);
                        if (objF != objE) {
                            bVar4 = aVar;
                            iVar = (dx.i) objF;
                            bVar4.a(iVar);
                            left = new dx.i.Right(i0.f148189a);
                        }
                    } else {
                        zd3.a aVar3 = this.collisionStorageRepository;
                        bVar.f5897d = vq.j.a(params);
                        bVar.f5898e = jVarA;
                        bVar.f5899f = vq.j.a(aVar);
                        bVar.f5900g = vq.j.a(aVar);
                        bVar.f5901h = processId;
                        bVar.f5902j = vq.j.a(bESavedDraftCollision);
                        bVar.f5903k = aVar;
                        bVar.f5906n = 0;
                        bVar.f5907p = 0;
                        bVar.f5908q = 0;
                        bVar.f5909r = 0;
                        bVar.f5910s = 0;
                        bVar.f5915y = 2;
                        objF = aVar3.f(processId, bESavedDraftCollision, bVar);
                        if (objF != objE) {
                            params2 = params;
                            bVar2 = aVar;
                            bVar3 = bVar2;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            iVar = (dx.i) objF;
                            params3 = params2;
                            if (!(iVar instanceof dx.i.Left)) {
                                bVar4 = aVar;
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
                                vd3.a aVar4 = this.vehicleCollisionContainersInteractor;
                                bVar.f5897d = vq.j.a(params3);
                                bVar.f5898e = jVarA;
                                bVar.f5899f = vq.j.a(bVar3);
                                bVar.f5900g = vq.j.a(bVar2);
                                bVar.f5901h = vq.j.a(processId);
                                bVar.f5902j = vq.j.a(bESavedDraftCollision);
                                bVar.f5903k = aVar;
                                bVar.f5904l = vq.j.a(iVar);
                                bVar.f5905m = vq.j.a(bArr);
                                bVar.f5906n = i19;
                                bVar.f5907p = i18;
                                bVar.f5908q = i17;
                                bVar.f5909r = i16;
                                bVar.f5910s = i15;
                                bVar.f5911t = 0;
                                bVar.f5912v = 0;
                                bVar.f5915y = 3;
                                objF = aVar4.f(processId, bArr, bVar);
                                if (objF != objE) {
                                    bVar4 = aVar;
                                    iVar = (dx.i) objF;
                                }
                            }
                            bVar4.a(iVar);
                            left = new dx.i.Right(i0.f148189a);
                        }
                    }
                    return objE;
                }
                if (r15 != 1) {
                    try {
                        if (r15 == 2) {
                            int i26 = bVar.f5910s;
                            i16 = bVar.f5909r;
                            i17 = bVar.f5908q;
                            i18 = bVar.f5907p;
                            i19 = bVar.f5906n;
                            ex.b bVar5 = (ex.b) bVar.f5903k;
                            bESavedDraftCollision = (BESavedDraftCollision) bVar.f5902j;
                            processId = (ProcessId) bVar.f5901h;
                            ex.b bVar6 = (ex.b) bVar.f5900g;
                            bVar3 = (ex.b) bVar.f5899f;
                            dx.j<dx.b> jVar = (dx.j) bVar.f5898e;
                            params2 = (Params) bVar.f5897d;
                            try {
                                oq.u.b(objF);
                                i15 = i26;
                                jVarA = jVar;
                                aVar = bVar5;
                                bVar2 = bVar6;
                                iVar = (dx.i) objF;
                                params3 = params2;
                                if (!(iVar instanceof dx.i.Left)) {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    byte[] bArr2 = (byte[]) ((dx.i.Right) iVar).b();
                                    vd3.a aVar5 = this.vehicleCollisionContainersInteractor;
                                    bVar.f5897d = vq.j.a(params3);
                                    bVar.f5898e = jVarA;
                                    bVar.f5899f = vq.j.a(bVar3);
                                    bVar.f5900g = vq.j.a(bVar2);
                                    bVar.f5901h = vq.j.a(processId);
                                    bVar.f5902j = vq.j.a(bESavedDraftCollision);
                                    bVar.f5903k = aVar;
                                    bVar.f5904l = vq.j.a(iVar);
                                    bVar.f5905m = vq.j.a(bArr2);
                                    bVar.f5906n = i19;
                                    bVar.f5907p = i18;
                                    bVar.f5908q = i17;
                                    bVar.f5909r = i16;
                                    bVar.f5910s = i15;
                                    bVar.f5911t = 0;
                                    bVar.f5912v = 0;
                                    bVar.f5915y = 3;
                                    objF = aVar5.f(processId, bArr2, bVar);
                                    if (objF != objE) {
                                        bVar4 = aVar;
                                    }
                                    return objE;
                                }
                                bVar4 = aVar;
                                bVar4.a(iVar);
                                left = new dx.i.Right(i0.f148189a);
                            } catch (ex.c e15) {
                                e = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
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
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) bVar.f5903k;
                            oq.u.b(objF);
                        }
                        iVar = (dx.i) objF;
                        bVar4.a(iVar);
                        left = new dx.i.Right(i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } else {
                    bVar4 = (ex.b) bVar.f5903k;
                    oq.u.b(objF);
                    iVar = (dx.i) objF;
                    bVar4.a(iVar);
                    left = new dx.i.Right(i0.f148189a);
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
        if (left instanceof dx.i.Left) {
            dx.b bVar7 = (dx.b) ((dx.i.Left) left).b();
            if (bVar7 instanceof dx.b.Generic) {
                dx.b.Generic generic = (dx.b.Generic) bVar7;
                if (generic.getE() != null) {
                    px.f.e(px.f.f163100a, "Can not save collision", generic.getE(), null, 4, null);
                } else {
                    px.f.e(px.f.f163100a, bVar7.toString(), null, null, 6, null);
                }
            } else {
                px.f.e(px.f.f163100a, bVar7.toString(), null, null, 6, null);
            }
        }
        return left;
    }
}
