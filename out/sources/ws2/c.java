package ws2;

import ay.Challenge;
import er.l;
import er.p;
import fr.t;
import iy.b0;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lws2/c;", "", "Lws2/c$a;", "Loq/i0;", "Lus0/a;", "beDisableRestrictionUC", "Lwz3/e;", "getChallengeUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Lus0/a;Lwz3/e;Lac4/a;Lwz3/d;)V", "params", "Ldx/i;", "Ldx/b;", "g", "(Lws2/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lus0/a;", "b", "Lwz3/e;", "c", "Lac4/a;", "d", "Lwz3/d;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final us0.a beDisableRestrictionUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: ws2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lws2/c$a;", "Lgz/b$a;", "Ljava/time/OffsetDateTime;", "restrictedToDate", "<init>", "(Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime restrictedToDate;

        public Params(OffsetDateTime offsetDateTime) {
            this.restrictedToDate = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OffsetDateTime getRestrictedToDate() {
            return this.restrictedToDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.restrictedToDate, ((Params) other).restrictedToDate);
        }

        public int hashCode() {
            OffsetDateTime offsetDateTime = this.restrictedToDate;
            if (offsetDateTime == null) {
                return 0;
            }
            return offsetDateTime.hashCode();
        }

        public String toString() {
            return "Params(restrictedToDate=" + this.restrictedToDate + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f214850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f214851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f214852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f214853h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f214854j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f214855k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f214856l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f214857m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f214858n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f214859p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f214860q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f214861r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Params f214863t;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liy/b0;", "value", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Liy/b0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements p<b0, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f214864e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f214865f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f214866g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f214866g = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                b0 b0Var = (b0) this.f214865f;
                Object objE = uq.b.e();
                int i15 = this.f214864e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                wz3.d dVar = this.f214866g.getBase64SignedValueUseCase;
                wz3.d.Params params = new wz3.d.Params(b0Var);
                this.f214865f = vq.j.a(b0Var);
                this.f214864e = 1;
                Object objC = dVar.c(params, this);
                return objC == objE ? objE : objC;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(b0 b0Var, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) {
                return ((a) v(b0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f214866g, eVar);
                aVar.f214865f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f214863t = params;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            c cVar;
            Params params;
            ex.b bVar;
            int i15;
            int i16;
            dx.j<dx.b> jVarA;
            ex.b bVar2;
            ex.b aVar;
            int i17;
            int i18;
            int i19;
            Object objC;
            ex.b bVar3;
            Object objC2;
            Object objE = uq.b.e();
            ?? r15 = this.f214861r;
            try {
                try {
                    if (r15 == 0) {
                        u.b(obj);
                        c cVar2 = c.this;
                        Params params2 = this.f214863t;
                        jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        wz3.e eVar = cVar2.getChallengeUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        this.f214850e = cVar2;
                        this.f214851f = params2;
                        this.f214852g = jVarA;
                        this.f214853h = vq.j.a(aVar);
                        this.f214854j = aVar;
                        this.f214855k = aVar;
                        i16 = 0;
                        this.f214856l = 0;
                        this.f214857m = 0;
                        this.f214858n = 0;
                        this.f214859p = 0;
                        this.f214860q = 0;
                        this.f214861r = 1;
                        objC = eVar.c(c1792a, this);
                        if (objC != objE) {
                            i19 = 0;
                            i18 = 0;
                            i17 = 0;
                            i15 = 0;
                            bVar2 = aVar;
                            cVar = cVar2;
                            params = params2;
                            bVar = bVar2;
                        }
                        return objE;
                    }
                    try {
                        if (r15 == 1) {
                            int i25 = this.f214860q;
                            int i26 = this.f214859p;
                            int i27 = this.f214858n;
                            int i28 = this.f214857m;
                            int i29 = this.f214856l;
                            ex.b bVar4 = (ex.b) this.f214855k;
                            ex.b bVar5 = (ex.b) this.f214854j;
                            ex.b bVar6 = (ex.b) this.f214853h;
                            dx.j<dx.b> jVar = (dx.j) this.f214852g;
                            Params params3 = (Params) this.f214851f;
                            c cVar3 = (c) this.f214850e;
                            try {
                                u.b(obj);
                                cVar = cVar3;
                                params = params3;
                                bVar = bVar6;
                                i15 = i29;
                                i16 = i25;
                                jVarA = jVar;
                                bVar2 = bVar4;
                                aVar = bVar5;
                                i17 = i28;
                                i18 = i27;
                                i19 = i26;
                                objC = obj;
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
                            bVar3 = (ex.b) this.f214853h;
                            u.b(obj);
                            objC2 = obj;
                        }
                        bVar3.a((dx.i) objC2);
                        return new dx.i.Right(i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                    Challenge challenge = (Challenge) bVar2.a((dx.i) objC);
                    us0.a aVar2 = cVar.beDisableRestrictionUC;
                    us0.a.Params params4 = new us0.a.Params(challenge.getChallenge(), params.getRestrictedToDate(), new a(cVar, null));
                    this.f214850e = jVarA;
                    this.f214851f = vq.j.a(bVar);
                    this.f214852g = vq.j.a(aVar);
                    this.f214853h = aVar;
                    this.f214854j = vq.j.a(challenge);
                    this.f214855k = null;
                    this.f214856l = i15;
                    this.f214857m = i17;
                    this.f214858n = i18;
                    this.f214859p = i19;
                    this.f214860q = i16;
                    this.f214861r = 2;
                    objC2 = aVar2.c(params4, this);
                    if (objC2 != objE) {
                        bVar3 = aVar;
                        bVar3.a((dx.i) objC2);
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new b(this.f214863t, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public c(us0.a aVar, wz3.e eVar, ac4.a aVar2, wz3.d dVar) {
        this.beDisableRestrictionUC = aVar;
        this.getChallengeUC = eVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getBase64SignedValueUseCase = dVar;
    }

    public Object g(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
