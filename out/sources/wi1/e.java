package wi1;

import ay.Challenge;
import er.p;
import fr.t;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;
import zp0.BERegisterForDefenceTraining;
import zp0.BEUserRegisteredDefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwi1/e;", "", "Lwi1/e$a;", "Lzp0/u;", "Laq0/e;", "bERegisterForDefenceTrainingUC", "Lwz3/d;", "getBase64SignedValueUseCase", "Lwz3/e;", "getChallengeUC", "<init>", "(Laq0/e;Lwz3/d;Lwz3/e;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lwi1/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Laq0/e;", "b", "Lwz3/d;", "c", "Lwz3/e;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aq0.e bERegisterForDefenceTrainingUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: wi1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwi1/e$a;", "Lgz/b$a;", "Lzp0/g;", "register", "<init>", "(Lzp0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp0/g;", "()Lzp0/g;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BERegisterForDefenceTraining register;

        public Params(BERegisterForDefenceTraining bERegisterForDefenceTraining) {
            this.register = bERegisterForDefenceTraining;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BERegisterForDefenceTraining getRegister() {
            return this.register;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.register, ((Params) other).register);
        }

        public int hashCode() {
            return this.register.hashCode();
        }

        public String toString() {
            return "Params(register=" + this.register + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213654h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213656k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213657l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213658m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213659n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213660p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213661q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213662r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f213663s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213665v;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213663s = obj;
            this.f213665v |= PKIFailureInfo.systemUnavail;
            return e.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liy/b0;", "value", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Liy/b0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<b0, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213667f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b0 b0Var = (b0) this.f213667f;
            Object objE = uq.b.e();
            int i15 = this.f213666e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wz3.d dVar = e.this.getBase64SignedValueUseCase;
            wz3.d.Params params = new wz3.d.Params(b0Var);
            this.f213667f = j.a(b0Var);
            this.f213666e = 1;
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
            c cVar = e.this.new c(eVar);
            cVar.f213667f = obj;
            return cVar;
        }
    }

    public e(aq0.e eVar, wz3.d dVar, wz3.e eVar2) {
        this.bERegisterForDefenceTrainingUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
        this.getChallengeUC = eVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, BEUserRegisteredDefenceTraining>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        aq0.e eVar2;
        BERegisterForDefenceTraining register;
        ex.b aVar;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        Object obj;
        int i18;
        dx.j<dx.b> jVarA;
        int i19;
        ex.b bVar5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f213665v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213665v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f213663s;
        Object objE = uq.b.e();
        ?? r15 = bVar.f213665v;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    eVar2 = this.bERegisterForDefenceTrainingUC;
                    register = params.getRegister();
                    wz3.e eVar3 = this.getChallengeUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f213650d = j.a(params);
                    bVar.f213651e = jVarA;
                    bVar.f213652f = j.a(aVar);
                    bVar.f213653g = j.a(aVar);
                    bVar.f213654h = aVar;
                    bVar.f213655j = aVar;
                    bVar.f213656k = register;
                    bVar.f213657l = eVar2;
                    i18 = 0;
                    bVar.f213658m = 0;
                    bVar.f213659n = 0;
                    bVar.f213660p = 0;
                    bVar.f213661q = 0;
                    bVar.f213662r = 0;
                    bVar.f213665v = 1;
                    Object objC2 = eVar3.c(c1792a, bVar);
                    if (objC2 != objE) {
                        obj = objC2;
                        i19 = 0;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        bVar4 = bVar3;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f213662r;
                        i15 = bVar.f213661q;
                        int i27 = bVar.f213660p;
                        i16 = bVar.f213659n;
                        i17 = bVar.f213658m;
                        eVar2 = (aq0.e) bVar.f213657l;
                        register = (BERegisterForDefenceTraining) bVar.f213656k;
                        aVar = (ex.b) bVar.f213655j;
                        bVar2 = (ex.b) bVar.f213654h;
                        bVar3 = (ex.b) bVar.f213653g;
                        bVar4 = (ex.b) bVar.f213652f;
                        dx.j<dx.b> jVar = (dx.j) bVar.f213651e;
                        obj = objC;
                        Params params2 = (Params) bVar.f213650d;
                        try {
                            u.b(obj);
                            i18 = i26;
                            jVarA = jVar;
                            i19 = i27;
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
                        bVar5 = (ex.b) bVar.f213654h;
                        u.b(objC);
                    }
                    return new dx.i.Right((BEUserRegisteredDefenceTraining) bVar5.a((dx.i) objC));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Challenge challenge = (Challenge) aVar.a((dx.i) obj);
                ex.b bVar6 = bVar3;
                aq0.e.Params params3 = new aq0.e.Params(register, challenge, new c(null));
                bVar.f213650d = j.a(params);
                bVar.f213651e = jVarA;
                bVar.f213652f = j.a(bVar4);
                bVar.f213653g = j.a(bVar6);
                bVar.f213654h = bVar2;
                bVar.f213655j = null;
                bVar.f213656k = null;
                bVar.f213657l = null;
                bVar.f213658m = i17;
                bVar.f213659n = i16;
                bVar.f213660p = i19;
                bVar.f213661q = i15;
                bVar.f213662r = i18;
                bVar.f213665v = 2;
                objC = eVar2.c(params3, bVar);
                if (objC != objE) {
                    bVar5 = bVar2;
                    return new dx.i.Right((BEUserRegisteredDefenceTraining) bVar5.a((dx.i) objC));
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
