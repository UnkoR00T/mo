package wi1;

import ay.Challenge;
import er.p;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwi1/h;", "", "Lwi1/h$a;", "Loq/i0;", "Laq0/g;", "beUnregisterForDefenceTrainingUC", "Lwz3/e;", "getChallengeUC", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Laq0/g;Lwz3/e;Lwz3/d;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lwi1/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Laq0/g;", "b", "Lwz3/e;", "c", "Lwz3/d;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aq0.g beUnregisterForDefenceTrainingUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: wi1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lwi1/h$a;", "Lgz/b$a;", "", "trainingId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int trainingId;

        public Params(int i15) {
            this.trainingId = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getTrainingId() {
            return this.trainingId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.trainingId == ((Params) other).trainingId;
        }

        public int hashCode() {
            return Integer.hashCode(this.trainingId);
        }

        public String toString() {
            return "Params(trainingId=" + this.trainingId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213684h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213685j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213686k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213687l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213688m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213689n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213690p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213691q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213692r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f213693s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213695v;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213693s = obj;
            this.f213695v |= PKIFailureInfo.systemUnavail;
            return h.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liy/b0;", "value", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Liy/b0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<b0, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213697f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b0 b0Var = (b0) this.f213697f;
            Object objE = uq.b.e();
            int i15 = this.f213696e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wz3.d dVar = h.this.getBase64SignedValueUseCase;
            wz3.d.Params params = new wz3.d.Params(b0Var);
            this.f213697f = j.a(b0Var);
            this.f213696e = 1;
            Object objC = dVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b0 b0Var, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) {
            return ((c) v(b0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = h.this.new c(eVar);
            cVar.f213697f = obj;
            return cVar;
        }
    }

    public h(aq0.g gVar, wz3.e eVar, wz3.d dVar) {
        this.beUnregisterForDefenceTrainingUC = gVar;
        this.getChallengeUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        aq0.g gVar;
        ex.b aVar;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        dx.j<dx.b> jVar;
        Object obj;
        ex.b bVar5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i26 = bVar.f213695v;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213695v = i26 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f213693s;
        Object objE = uq.b.e();
        ?? r15 = bVar.f213695v;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    gVar = this.beUnregisterForDefenceTrainingUC;
                    int trainingId = params.getTrainingId();
                    wz3.e eVar2 = this.getChallengeUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f213680d = j.a(params);
                    bVar.f213681e = jVarA;
                    bVar.f213682f = j.a(aVar);
                    bVar.f213683g = j.a(aVar);
                    bVar.f213684h = aVar;
                    bVar.f213685j = aVar;
                    bVar.f213686k = gVar;
                    i18 = 0;
                    bVar.f213687l = 0;
                    bVar.f213688m = 0;
                    bVar.f213689n = 0;
                    bVar.f213690p = 0;
                    bVar.f213691q = 0;
                    bVar.f213692r = trainingId;
                    bVar.f213695v = 1;
                    Object objC2 = eVar2.c(c1792a, bVar);
                    if (objC2 != objE) {
                        obj = objC2;
                        i16 = 0;
                        i17 = 0;
                        i19 = 0;
                        i25 = 0;
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        bVar4 = bVar3;
                        jVar = jVarA;
                        i15 = trainingId;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        i15 = bVar.f213692r;
                        i16 = bVar.f213691q;
                        i17 = bVar.f213690p;
                        i18 = bVar.f213689n;
                        i19 = bVar.f213688m;
                        i25 = bVar.f213687l;
                        gVar = (aq0.g) bVar.f213686k;
                        aVar = (ex.b) bVar.f213685j;
                        bVar2 = (ex.b) bVar.f213684h;
                        bVar3 = (ex.b) bVar.f213683g;
                        bVar4 = (ex.b) bVar.f213682f;
                        jVar = (dx.j) bVar.f213681e;
                        obj = objC;
                        Params params2 = (Params) bVar.f213680d;
                        try {
                            u.b(obj);
                            params = params2;
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
                        bVar5 = (ex.b) bVar.f213684h;
                        u.b(objC);
                    }
                    bVar5.a((dx.i) objC);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                Challenge challenge = (Challenge) aVar.a((dx.i) obj);
                ex.b bVar6 = bVar3;
                aq0.g.Params params3 = new aq0.g.Params(i15, challenge, new c(null));
                bVar.f213680d = j.a(params);
                bVar.f213681e = jVar;
                bVar.f213682f = j.a(bVar4);
                bVar.f213683g = j.a(bVar6);
                bVar.f213684h = bVar2;
                bVar.f213685j = null;
                bVar.f213686k = null;
                bVar.f213687l = i25;
                bVar.f213688m = i19;
                bVar.f213689n = i18;
                bVar.f213690p = i17;
                bVar.f213691q = i16;
                bVar.f213695v = 2;
                objC = gVar.c(params3, bVar);
                if (objC != objE) {
                    bVar5 = bVar2;
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
