package go3;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/z;", "", "Lgo3/z$a;", "Loq/r;", "Lk34/a0;", "Lco3/i;", "scopeMapper", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lco3/i;Lbo3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/z$a;Ltq/e;)Ljava/lang/Object;", "a", "Lco3/i;", "b", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgo3/z$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public Params(rq0.b bVar) {
            this.documentType = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.documentType, ((Params) other).documentType);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75763h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75765k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75766l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75767m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75768n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f75769p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75771r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75769p = obj;
            this.f75771r |= PKIFailureInfo.systemUnavail;
            return z.this.d(null, this);
        }
    }

    public z(co3.i iVar, bo3.a aVar) {
        this.scopeMapper = iVar;
        this.verificationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, ? extends oq.r<? extends k34.a0, ? extends k34.a0>>> eVar) {
        b bVar;
        Object objB;
        int i15;
        int i16;
        Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        rq0.b bVar4;
        Params params3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f75771r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75771r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f75769p;
        Object objE2 = uq.b.e();
        ?? r15 = bVar.f75771r;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objE);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    bo3.a aVar2 = this.verificationContainersInteractor;
                    bVar.f75759d = params;
                    bVar.f75760e = jVarA;
                    bVar.f75761f = vq.j.a(aVar);
                    bVar.f75762g = vq.j.a(aVar);
                    i17 = 0;
                    bVar.f75764j = 0;
                    bVar.f75765k = 0;
                    bVar.f75766l = 0;
                    bVar.f75767m = 0;
                    bVar.f75768n = 0;
                    bVar.f75771r = 1;
                    objE = aVar2.e(bVar);
                    if (objE != objE2) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar3 = aVar;
                        bVar2 = bVar3;
                        i18 = 0;
                    }
                    return objE2;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f75768n;
                        i15 = bVar.f75767m;
                        i16 = bVar.f75766l;
                        int i27 = bVar.f75765k;
                        int i28 = bVar.f75764j;
                        ex.b bVar5 = (ex.b) bVar.f75762g;
                        ex.b bVar6 = (ex.b) bVar.f75761f;
                        dx.j<dx.b> jVar = (dx.j) bVar.f75760e;
                        params2 = (Params) bVar.f75759d;
                        try {
                            oq.u.b(objE);
                            i17 = i26;
                            jVarA = jVar;
                            bVar2 = bVar6;
                            bVar3 = bVar5;
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
                        bVar4 = (rq0.b) bVar.f75763h;
                        params3 = (Params) bVar.f75759d;
                        oq.u.b(objE);
                    }
                    return new dx.i.Right(this.scopeMapper.c(params3.getDocumentType(), bVar4, (rq0.b) objE));
                } catch (CancellationException e18) {
                    throw e18;
                }
                rq0.b bVar7 = (rq0.b) ((dx.i) objE).a();
                bo3.a aVar3 = this.verificationContainersInteractor;
                rq0.b documentType = params2.getDocumentType();
                bVar.f75759d = params2;
                bVar.f75760e = jVarA;
                bVar.f75761f = vq.j.a(bVar2);
                bVar.f75762g = vq.j.a(bVar3);
                bVar.f75763h = bVar7;
                bVar.f75764j = i18;
                bVar.f75765k = i19;
                bVar.f75766l = i16;
                bVar.f75767m = i15;
                bVar.f75768n = i17;
                bVar.f75771r = 2;
                Object objY = aVar3.y(documentType, bVar);
                if (objY != objE2) {
                    bVar4 = bVar7;
                    objE = objY;
                    params3 = params2;
                    return new dx.i.Right(this.scopeMapper.c(params3.getDocumentType(), bVar4, (rq0.b) objE));
                }
                return objE2;
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
