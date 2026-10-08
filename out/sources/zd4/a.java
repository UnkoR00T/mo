package zd4;

import ay.Challenge;
import dx.i;
import er.p;
import fr.t;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import vq.j;
import vq.k;
import wz3.d;
import wz3.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzd4/a;", "", "Lzd4/a$a;", "Loq/i0;", "Ltl0/b;", "withdrawPassportAgreementUC", "Lwz3/e;", "getChallengeUC", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Ltl0/b;Lwz3/e;Lwz3/d;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lzd4/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ltl0/b;", "b", "Lwz3/e;", "c", "Lwz3/d;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tl0.b withdrawPassportAgreementUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e getChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: zd4.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzd4/a$a;", "Lgz/b$a;", "", "agreementId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String agreementId;

        public Params(String str) {
            this.agreementId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.agreementId, ((Params) other).agreementId);
        }

        public int hashCode() {
            return this.agreementId.hashCode();
        }

        public String toString() {
            return "Params(agreementId=" + this.agreementId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f234431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f234433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f234434g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f234435h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f234436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f234437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f234438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f234439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f234440n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f234441p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f234442q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f234443r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f234444s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f234446v;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f234444s = obj;
            this.f234446v |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liy/b0;", "value", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Liy/b0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<b0, tq.e<? super i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234448f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b0 b0Var = (b0) this.f234448f;
            Object objE = uq.b.e();
            int i15 = this.f234447e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            d dVar = a.this.getBase64SignedValueUseCase;
            d.Params params = new d.Params(b0Var);
            this.f234448f = j.a(b0Var);
            this.f234447e = 1;
            Object objC = dVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b0 b0Var, tq.e<? super i<? extends dx.b, ry.a>> eVar) {
            return ((c) v(b0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = a.this.new c(eVar);
            cVar.f234448f = obj;
            return cVar;
        }
    }

    public a(tl0.b bVar, e eVar, d dVar) {
        this.withdrawPassportAgreementUC = bVar;
        this.getChallengeUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object e(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        tl0.b bVar2;
        String agreementId;
        ex.b aVar;
        ex.b bVar3;
        ex.b bVar4;
        ex.b bVar5;
        Object obj;
        int i18;
        dx.j<dx.b> jVarA;
        int i19;
        ex.b bVar6;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f234446v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f234446v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f234444s;
        Object objE = uq.b.e();
        ?? r15 = bVar.f234446v;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    bVar2 = this.withdrawPassportAgreementUC;
                    agreementId = params.getAgreementId();
                    e eVar2 = this.getChallengeUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f234431d = j.a(params);
                    bVar.f234432e = jVarA;
                    bVar.f234433f = j.a(aVar);
                    bVar.f234434g = j.a(aVar);
                    bVar.f234435h = aVar;
                    bVar.f234436j = aVar;
                    bVar.f234437k = agreementId;
                    bVar.f234438l = bVar2;
                    i18 = 0;
                    bVar.f234439m = 0;
                    bVar.f234440n = 0;
                    bVar.f234441p = 0;
                    bVar.f234442q = 0;
                    bVar.f234443r = 0;
                    bVar.f234446v = 1;
                    Object objC2 = eVar2.c(c1792a, bVar);
                    if (objC2 != objE) {
                        obj = objC2;
                        i19 = 0;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        bVar3 = aVar;
                        bVar4 = bVar3;
                        bVar5 = bVar4;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f234443r;
                        i15 = bVar.f234442q;
                        int i27 = bVar.f234441p;
                        i16 = bVar.f234440n;
                        i17 = bVar.f234439m;
                        bVar2 = (tl0.b) bVar.f234438l;
                        agreementId = (String) bVar.f234437k;
                        aVar = (ex.b) bVar.f234436j;
                        bVar3 = (ex.b) bVar.f234435h;
                        bVar4 = (ex.b) bVar.f234434g;
                        bVar5 = (ex.b) bVar.f234433f;
                        dx.j<dx.b> jVar = (dx.j) bVar.f234432e;
                        obj = objC;
                        Params params2 = (Params) bVar.f234431d;
                        try {
                            u.b(obj);
                            i18 = i26;
                            jVarA = jVar;
                            i19 = i27;
                            params = params2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            f fVar = f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            i iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar6 = (ex.b) bVar.f234435h;
                        u.b(objC);
                    }
                    bVar6.a((i) objC);
                    return new i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                Challenge challenge = (Challenge) aVar.a((i) obj);
                ex.b bVar7 = bVar4;
                tl0.b.Params params3 = new tl0.b.Params(agreementId, challenge, new c(null));
                bVar.f234431d = j.a(params);
                bVar.f234432e = jVarA;
                bVar.f234433f = j.a(bVar5);
                bVar.f234434g = j.a(bVar7);
                bVar.f234435h = bVar3;
                bVar.f234436j = null;
                bVar.f234437k = null;
                bVar.f234438l = null;
                bVar.f234439m = i17;
                bVar.f234440n = i16;
                bVar.f234441p = i19;
                bVar.f234442q = i15;
                bVar.f234443r = i18;
                bVar.f234446v = 2;
                objC = bVar2.c(params3, bVar);
                if (objC != objE) {
                    bVar6 = bVar3;
                    bVar6.a((i) objC);
                    return new i.Right(i0.f148189a);
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
