package ae3;

import ay.Challenge;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lae3/l;", "", "Lae3/l$a;", "Loq/i0;", "Law0/h;", "bePostReadyStatementUC", "Lwz3/e;", "getChallengeUC", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Law0/h;Lwz3/e;Lwz3/d;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lae3/l$a;Ltq/e;)Ljava/lang/Object;", "a", "Law0/h;", "b", "Lwz3/e;", "c", "Lwz3/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aw0.h bePostReadyStatementUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: ae3.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/l$a;", "Lgz/b$a;", "Lsv0/c0;", "readyToSignStatement", "<init>", "(Lsv0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/c0;", "()Lsv0/c0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sv0.c0 readyToSignStatement;

        public Params(sv0.c0 c0Var) {
            this.readyToSignStatement = c0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final sv0.c0 getReadyToSignStatement() {
            return this.readyToSignStatement;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.readyToSignStatement, ((Params) other).readyToSignStatement);
        }

        public int hashCode() {
            return this.readyToSignStatement.hashCode();
        }

        public String toString() {
            return "Params(readyToSignStatement=" + this.readyToSignStatement + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5816g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5817h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5822n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5823p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5824q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f5825r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5827t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5825r = obj;
            this.f5827t |= PKIFailureInfo.systemUnavail;
            return l.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liy/b0;", "signBase64", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Liy/b0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<iy.b0, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5829f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 b0Var = (iy.b0) this.f5829f;
            Object objE = uq.b.e();
            int i15 = this.f5828e;
            if (i15 == 0) {
                oq.u.b(obj);
                wz3.d dVar = l.this.getBase64SignedValueUseCase;
                wz3.d.Params params = new wz3.d.Params(b0Var);
                this.f5829f = vq.j.a(b0Var);
                this.f5828e = 1;
                obj = dVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(ry.a.a(ry.a.b(((ry.a) ((dx.i.Right) iVar).b()).getData())));
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) {
            return ((c) v(b0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f5829f = obj;
            return cVar;
        }
    }

    public l(aw0.h hVar, wz3.e eVar, wz3.d dVar) {
        this.bePostReadyStatementUC = hVar;
        this.getChallengeUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        ex.b aVar;
        aw0.h hVar;
        int i18;
        int i19;
        ex.b bVar5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f5827t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5827t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f5825r;
        Object objE = uq.b.e();
        ?? r15 = bVar.f5827t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    aw0.h hVar2 = this.bePostReadyStatementUC;
                    wz3.e eVar2 = this.getChallengeUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f5813d = params;
                    bVar.f5814e = jVarA;
                    bVar.f5815f = vq.j.a(aVar);
                    bVar.f5816g = vq.j.a(aVar);
                    bVar.f5817h = aVar;
                    bVar.f5818j = aVar;
                    bVar.f5819k = hVar2;
                    i17 = 0;
                    bVar.f5820l = 0;
                    bVar.f5821m = 0;
                    bVar.f5822n = 0;
                    bVar.f5823p = 0;
                    bVar.f5824q = 0;
                    bVar.f5827t = 1;
                    objC = eVar2.c(c1792a, bVar);
                    if (objC != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        hVar = hVar2;
                        bVar4 = aVar;
                        bVar3 = bVar4;
                        bVar2 = bVar3;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f5824q;
                        i15 = bVar.f5823p;
                        i16 = bVar.f5822n;
                        int i27 = bVar.f5821m;
                        int i28 = bVar.f5820l;
                        aw0.h hVar3 = (aw0.h) bVar.f5819k;
                        ex.b bVar6 = (ex.b) bVar.f5818j;
                        ex.b bVar7 = (ex.b) bVar.f5817h;
                        ex.b bVar8 = (ex.b) bVar.f5816g;
                        ex.b bVar9 = (ex.b) bVar.f5815f;
                        dx.j<dx.b> jVar = (dx.j) bVar.f5814e;
                        params2 = (Params) bVar.f5813d;
                        try {
                            oq.u.b(objC);
                            i17 = i26;
                            jVarA = jVar;
                            bVar2 = bVar9;
                            bVar3 = bVar8;
                            bVar4 = bVar6;
                            aVar = bVar7;
                            hVar = hVar3;
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
                        bVar5 = (ex.b) bVar.f5817h;
                        oq.u.b(objC);
                    }
                    bVar5.a((dx.i) objC);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                Params params3 = params2;
                aw0.h.Params params4 = new aw0.h.Params(params2.getReadyToSignStatement(), (Challenge) bVar4.a((dx.i) objC), new c(null));
                bVar.f5813d = vq.j.a(params3);
                bVar.f5814e = jVarA;
                bVar.f5815f = vq.j.a(bVar2);
                bVar.f5816g = vq.j.a(bVar3);
                bVar.f5817h = aVar;
                bVar.f5818j = null;
                bVar.f5819k = null;
                bVar.f5820l = i18;
                bVar.f5821m = i19;
                bVar.f5822n = i16;
                bVar.f5823p = i15;
                bVar.f5824q = i17;
                bVar.f5827t = 2;
                objC = hVar.c(params4, bVar);
                if (objC != objE) {
                    bVar5 = aVar;
                    bVar5.a((dx.i) objC);
                    return new dx.i.Right(i0.f148189a);
                }
                return objE;
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
