package ae3;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tv0.BENewCollisionData;
import tv0.BESavedDraftCollision;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lae3/i;", "Lgz/b;", "Lae3/i$a;", "Ltv0/g;", "Lzd3/a;", "collisionStorageRepository", "Lvd3/a;", "vehicleCollisionContainersInteractor", "<init>", "(Lzd3/a;Lvd3/a;)V", "params", "d", "(Lae3/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzd3/a;", "b", "Lvd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, BESavedDraftCollision> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zd3.a collisionStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vd3.a vehicleCollisionContainersInteractor;

    /* JADX INFO: renamed from: ae3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/i$a;", "Lgz/b$a;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public Params(ProcessId processId) {
            this.processId = processId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.processId, ((Params) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "Params(processId=" + this.processId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5792h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5793j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5794k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5795l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5796m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5797n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5798p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f5799q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5801s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5799q = obj;
            this.f5801s |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, this);
        }
    }

    public i(zd3.a aVar, vd3.a aVar2) {
        this.collisionStorageRepository = aVar;
        this.vehicleCollisionContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:103:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x025b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01db  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x0207  */
    /* JADX WARN: Code duplicated, block: B:98:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [dx.j] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [ae3.i$a] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3, types: [ae3.i$a] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [ae3.i$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ae3.i$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Object d(Params params, tq.e<? super BESavedDraftCollision> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ?? r15;
        dx.i left;
        boolean z15;
        dx.b bVar2;
        dx.b.Generic generic;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        ?? r16;
        ?? r17;
        int i18;
        ex.b bVar4;
        ex.b bVar5;
        int i19;
        ?? A;
        ex.b bVar6;
        dx.i iVar;
        ex.b bVar7;
        ex.b bVar8;
        ex.b bVar9;
        ?? r18;
        ?? r19 = params;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f5801s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5801s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f5799q;
        ?? E = uq.b.e();
        int i26 = bVar.f5801s;
        try {
            try {
                if (i26 != 0) {
                    try {
                        if (i26 != 1) {
                            if (i26 == 2) {
                                int i27 = bVar.f5798p;
                                i15 = bVar.f5797n;
                                i16 = bVar.f5796m;
                                i17 = bVar.f5795l;
                                int i28 = bVar.f5794k;
                                ex.b bVar10 = (ex.b) bVar.f5793j;
                                ex.b bVar11 = (ex.b) bVar.f5792h;
                                ex.b bVar12 = (ex.b) bVar.f5791g;
                                ex.b bVar13 = (ex.b) bVar.f5790f;
                                r16 = (dx.j) bVar.f5789e;
                                r17 = (Params) bVar.f5788d;
                                try {
                                    oq.u.b(objA);
                                    i18 = i27;
                                    bVar4 = bVar11;
                                    bVar5 = bVar10;
                                    i19 = i28;
                                    bVar9 = bVar12;
                                    bVar8 = bVar13;
                                    r16 = r16;
                                    r17 = r17;
                                    byte[] bArr = (byte[]) bVar5.a((dx.i) objA);
                                    zd3.a aVar = this.collisionStorageRepository;
                                    ProcessId processId = r17.getProcessId();
                                    bVar.f5788d = r17;
                                    bVar.f5789e = r16;
                                    bVar.f5790f = vq.j.a(bVar8);
                                    bVar.f5791g = vq.j.a(bVar9);
                                    bVar.f5792h = bVar4;
                                    bVar.f5793j = vq.j.a(bArr);
                                    bVar.f5794k = i19;
                                    bVar.f5795l = i17;
                                    bVar.f5796m = i16;
                                    bVar.f5797n = i15;
                                    bVar.f5798p = i18;
                                    A = 3;
                                    bVar.f5801s = 3;
                                    objA = aVar.a(processId, bArr, bVar);
                                    r19 = bVar4;
                                    if (objA != E) {
                                        E = r16;
                                        bVar6 = bVar4;
                                        r17 = r17;
                                    }
                                    r19 = r19;
                                    A = A;
                                    r19 = r19;
                                    A = A;
                                    return E;
                                } catch (ex.c e15) {
                                    e = e15;
                                    r19 = r17;
                                    r15 = r19;
                                    left = new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    e = e16;
                                    throw e;
                                } catch (Exception e17) {
                                    e = e17;
                                    E = r16;
                                    r19 = r17;
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
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    r15 = r19;
                                    left = new dx.i.Left(objB);
                                }
                            } else {
                                if (i26 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ex.b bVar14 = (ex.b) bVar.f5792h;
                                dx.j jVar = (dx.j) bVar.f5789e;
                                Params params2 = (Params) bVar.f5788d;
                                oq.u.b(objA);
                                r17 = params2;
                                bVar6 = bVar14;
                                E = jVar;
                            }
                            try {
                                iVar = (dx.i) objA;
                                bVar7 = bVar6;
                                E = E;
                                r17 = r17;
                                left = new dx.i.Right((BESavedDraftCollision) bVar7.a(iVar));
                                r15 = r17;
                            } catch (ex.c e18) {
                                e = e18;
                                r19 = r17;
                                r15 = r19;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                e = e19;
                                throw e;
                            } catch (Exception e25) {
                                e = e25;
                                r19 = r17;
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
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                r15 = r19;
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            ex.b bVar15 = (ex.b) bVar.f5792h;
                            dx.j jVar2 = (dx.j) bVar.f5789e;
                            Params params3 = (Params) bVar.f5788d;
                            oq.u.b(objA);
                            bVar3 = bVar15;
                            r19 = params3;
                            r18 = jVar2;
                            try {
                                iVar = (dx.i) objA;
                                r17 = r19;
                                E = r18;
                                bVar7 = bVar3;
                                left = new dx.i.Right((BESavedDraftCollision) bVar7.a(iVar));
                                r15 = r17;
                            } catch (ex.c e26) {
                                e = e26;
                                r15 = r19;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            }
                        }
                    } catch (ex.c e28) {
                        e = e28;
                        r19 = bVar;
                        r15 = r19;
                        left = new dx.i.Left((dx.b) ex.d.a(e));
                        z15 = left instanceof dx.i.Left;
                        if (z15) {
                            bVar2 = (dx.b) ((dx.i.Left) left).b();
                            if (bVar2 instanceof dx.b.Generic) {
                                generic = (dx.b.Generic) bVar2;
                                if (generic.getE() != null) {
                                    px.f.e(px.f.f163100a, "Can not fetch collision", generic.getE(), null, 4, null);
                                } else {
                                    px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
                                }
                            } else {
                                px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
                            }
                        }
                        if (z15) {
                            return new BESavedDraftCollision(null, new BENewCollisionData(new dx.i.Right(r15.getProcessId()), null, null, 6, null));
                        }
                        if (left instanceof dx.i.Right) {
                            return ((dx.i.Right) left).b();
                        }
                        throw new oq.p();
                    } catch (CancellationException e29) {
                        throw e29;
                    } catch (Exception e35) {
                        e = e35;
                        r19 = bVar;
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
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        r15 = r19;
                        left = new dx.i.Left(objB);
                    }
                } else {
                    oq.u.b(objA);
                    A = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        i18 = 0;
                        if (this.vehicleCollisionContainersInteractor.a()) {
                            zd3.a aVar3 = this.collisionStorageRepository;
                            ProcessId processId2 = r19.getProcessId();
                            bVar.f5788d = r19;
                            bVar.f5789e = A;
                            bVar.f5790f = vq.j.a(aVar2);
                            bVar.f5791g = vq.j.a(aVar2);
                            bVar.f5792h = aVar2;
                            bVar.f5794k = 0;
                            bVar.f5795l = 0;
                            bVar.f5796m = 0;
                            bVar.f5797n = 0;
                            bVar.f5798p = 0;
                            bVar.f5801s = 1;
                            objA = aVar3.c(processId2, bVar);
                            if (objA != E) {
                                r19 = r19;
                                A = A;
                                r18 = A;
                                r19 = r19;
                                bVar3 = aVar2;
                                iVar = (dx.i) objA;
                                r17 = r19;
                                E = r18;
                                bVar7 = bVar3;
                                left = new dx.i.Right((BESavedDraftCollision) bVar7.a(iVar));
                                r15 = r17;
                            }
                        } else {
                            vd3.a aVar4 = this.vehicleCollisionContainersInteractor;
                            ProcessId processId3 = r19.getProcessId();
                            bVar.f5788d = r19;
                            bVar.f5789e = A;
                            bVar.f5790f = vq.j.a(aVar2);
                            bVar.f5791g = vq.j.a(aVar2);
                            bVar.f5792h = aVar2;
                            bVar.f5793j = aVar2;
                            bVar.f5794k = 0;
                            bVar.f5795l = 0;
                            bVar.f5796m = 0;
                            bVar.f5797n = 0;
                            bVar.f5798p = 0;
                            bVar.f5801s = 2;
                            objA = aVar4.c(processId3, bVar);
                            if (objA != E) {
                                r19 = r19;
                                A = A;
                                r17 = r19;
                                r16 = A;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                ex.a aVar5 = aVar2;
                                ex.a aVar6 = aVar5;
                                ex.a aVar7 = aVar6;
                                bVar8 = aVar7;
                                i19 = 0;
                                bVar4 = aVar5;
                                bVar5 = aVar6;
                                bVar9 = aVar7;
                                byte[] bArr2 = (byte[]) bVar5.a((dx.i) objA);
                                zd3.a aVar8 = this.collisionStorageRepository;
                                ProcessId processId4 = r17.getProcessId();
                                bVar.f5788d = r17;
                                bVar.f5789e = r16;
                                bVar.f5790f = vq.j.a(bVar8);
                                bVar.f5791g = vq.j.a(bVar9);
                                bVar.f5792h = bVar4;
                                bVar.f5793j = vq.j.a(bArr2);
                                bVar.f5794k = i19;
                                bVar.f5795l = i17;
                                bVar.f5796m = i16;
                                bVar.f5797n = i15;
                                bVar.f5798p = i18;
                                A = 3;
                                bVar.f5801s = 3;
                                objA = aVar8.a(processId4, bArr2, bVar);
                                r19 = bVar4;
                                if (objA != E) {
                                    E = r16;
                                    bVar6 = bVar4;
                                    r17 = r17;
                                    iVar = (dx.i) objA;
                                    bVar7 = bVar6;
                                    E = E;
                                    r17 = r17;
                                    left = new dx.i.Right((BESavedDraftCollision) bVar7.a(iVar));
                                    r15 = r17;
                                }
                            }
                        }
                        r19 = r19;
                        A = A;
                        r19 = r19;
                        A = A;
                        return E;
                    } catch (ex.c e36) {
                        e = e36;
                        r15 = r19;
                        left = new dx.i.Left((dx.b) ex.d.a(e));
                        z15 = left instanceof dx.i.Left;
                        if (z15) {
                            bVar2 = (dx.b) ((dx.i.Left) left).b();
                            if (bVar2 instanceof dx.b.Generic) {
                                generic = (dx.b.Generic) bVar2;
                                if (generic.getE() != null) {
                                    px.f.e(px.f.f163100a, "Can not fetch collision", generic.getE(), null, 4, null);
                                } else {
                                    px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
                                }
                            } else {
                                px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
                            }
                        }
                        if (z15) {
                            return new BESavedDraftCollision(null, new BENewCollisionData(new dx.i.Right(r15.getProcessId()), null, null, 6, null));
                        }
                        if (left instanceof dx.i.Right) {
                            return ((dx.i.Right) left).b();
                        }
                        throw new oq.p();
                    } catch (CancellationException e37) {
                        throw e37;
                    } catch (Exception e38) {
                        e = e38;
                        E = A;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        r15 = r19;
                        left = new dx.i.Left(objB);
                    }
                }
            } catch (CancellationException e39) {
                throw e39;
            }
        } catch (Exception e45) {
            e = e45;
        }
        z15 = left instanceof dx.i.Left;
        if (z15) {
            bVar2 = (dx.b) ((dx.i.Left) left).b();
            if (bVar2 instanceof dx.b.Generic) {
                generic = (dx.b.Generic) bVar2;
                if (generic.getE() != null) {
                    px.f.e(px.f.f163100a, "Can not fetch collision", generic.getE(), null, 4, null);
                } else {
                    px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
                }
            } else {
                px.f.e(px.f.f163100a, bVar2.toString(), null, null, 6, null);
            }
        }
        if (z15) {
            return new BESavedDraftCollision(null, new BENewCollisionData(new dx.i.Right(r15.getProcessId()), null, null, 6, null));
        }
        if (left instanceof dx.i.Right) {
            return ((dx.i.Right) left).b();
        }
        throw new oq.p();
    }
}
