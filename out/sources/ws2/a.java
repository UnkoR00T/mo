package ws2;

import ay.Challenge;
import er.l;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lws2/a;", "", "Lgz/b$a$a;", "Loq/i0;", "Lus0/b;", "cancelPlannedUseCase", "Lwz3/e;", "getChallengeUC", "Lwz3/d;", "getBase64SignedValueUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lus0/b;Lwz3/e;Lwz3/d;Lac4/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lus0/b;", "b", "Lwz3/e;", "c", "Lwz3/d;", "d", "Lac4/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final us0.b cancelPlannedUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: ws2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5705a extends k implements l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f214829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f214830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f214831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f214832h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f214833j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f214834k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f214835l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f214836m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f214837n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f214838p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f214839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f214840r;

        C5705a(tq.e<? super C5705a> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x012b  */
        /* JADX WARN: Code duplicated, block: B:38:0x012c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0179  */
        /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:60:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:61:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:63:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0074: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:22:0x0074 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0078: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:24:0x0078 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x007c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:26:0x007c */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            Object obj2;
            int i15;
            dx.j<dx.b> jVar;
            ex.b bVar;
            a aVar;
            ex.b bVar2;
            ex.b bVar3;
            int i16;
            int i17;
            int i18;
            int i19;
            Object objC;
            int i25;
            int i26;
            ex.b bVar4;
            ex.b bVar5;
            a aVar2;
            int i27;
            Challenge challenge;
            Object objC2;
            ex.b bVar6;
            Object objC3;
            Challenge challenge2;
            Object objE = uq.b.e();
            ?? r15 = this.f214840r;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            u.b(obj);
                            a aVar3 = a.this;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar4 = new ex.a();
                                wz3.e eVar = aVar3.getChallengeUC;
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                this.f214829e = aVar3;
                                this.f214830f = jVarA;
                                this.f214831g = vq.j.a(aVar4);
                                this.f214832h = aVar4;
                                this.f214833j = aVar4;
                                i15 = 0;
                                this.f214835l = 0;
                                this.f214836m = 0;
                                this.f214837n = 0;
                                this.f214838p = 0;
                                this.f214839q = 0;
                                this.f214840r = 1;
                                objC = eVar.c(c1792a, this);
                                if (objC != objE) {
                                    aVar = aVar3;
                                    jVar = jVarA;
                                    bVar3 = aVar4;
                                    bVar = bVar3;
                                    bVar2 = bVar;
                                    i19 = 0;
                                    i18 = 0;
                                    i17 = 0;
                                    i16 = 0;
                                    challenge2 = (Challenge) bVar3.a((dx.i) objC);
                                    wz3.d dVar = aVar.getBase64SignedValueUseCase;
                                    wz3.d.Params params = new wz3.d.Params(challenge2.getChallenge());
                                    this.f214829e = aVar;
                                    this.f214830f = jVar;
                                    this.f214831g = vq.j.a(bVar2);
                                    this.f214832h = bVar;
                                    this.f214833j = bVar;
                                    this.f214834k = vq.j.a(challenge2);
                                    this.f214835l = i16;
                                    this.f214836m = i17;
                                    this.f214837n = i18;
                                    this.f214838p = i19;
                                    this.f214839q = i15;
                                    this.f214840r = 2;
                                    objC2 = dVar.c(params, this);
                                    if (objC2 == objE) {
                                        int i28 = i16;
                                        challenge = challenge2;
                                        i25 = i18;
                                        i26 = i28;
                                        i27 = i15;
                                        bVar4 = bVar;
                                        bVar5 = bVar2;
                                        aVar2 = aVar;
                                        b0 data = ((ry.a) bVar.a((dx.i) objC2)).getData();
                                        us0.b bVar7 = aVar2.cancelPlannedUseCase;
                                        us0.b.Params params2 = new us0.b.Params(data);
                                        this.f214829e = jVar;
                                        this.f214830f = vq.j.a(bVar5);
                                        this.f214831g = vq.j.a(bVar4);
                                        this.f214832h = bVar4;
                                        this.f214833j = vq.j.a(challenge);
                                        this.f214834k = vq.j.a(data);
                                        this.f214835l = i26;
                                        this.f214836m = i17;
                                        this.f214837n = i25;
                                        this.f214838p = i19;
                                        this.f214839q = i27;
                                        this.f214840r = 3;
                                        objC3 = bVar7.c(params2, this);
                                        if (objC3 != objE) {
                                            bVar6 = bVar4;
                                            bVar6.a((dx.i) objC3);
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        try {
                            if (r15 == 1) {
                                int i29 = this.f214839q;
                                int i35 = this.f214838p;
                                int i36 = this.f214837n;
                                int i37 = this.f214836m;
                                int i38 = this.f214835l;
                                ex.b bVar8 = (ex.b) this.f214833j;
                                ex.b bVar9 = (ex.b) this.f214832h;
                                ex.b bVar10 = (ex.b) this.f214831g;
                                dx.j<dx.b> jVar2 = (dx.j) this.f214830f;
                                a aVar5 = (a) this.f214829e;
                                u.b(obj);
                                i15 = i29;
                                jVar = jVar2;
                                bVar = bVar9;
                                aVar = aVar5;
                                bVar2 = bVar10;
                                bVar3 = bVar8;
                                i16 = i38;
                                i17 = i37;
                                i18 = i36;
                                i19 = i35;
                                objC = obj;
                                challenge2 = (Challenge) bVar3.a((dx.i) objC);
                                wz3.d dVar2 = aVar.getBase64SignedValueUseCase;
                                wz3.d.Params params3 = new wz3.d.Params(challenge2.getChallenge());
                                this.f214829e = aVar;
                                this.f214830f = jVar;
                                this.f214831g = vq.j.a(bVar2);
                                this.f214832h = bVar;
                                this.f214833j = bVar;
                                this.f214834k = vq.j.a(challenge2);
                                this.f214835l = i16;
                                this.f214836m = i17;
                                this.f214837n = i18;
                                this.f214838p = i19;
                                this.f214839q = i15;
                                this.f214840r = 2;
                                objC2 = dVar2.c(params3, this);
                                if (objC2 == objE) {
                                    int i210 = i16;
                                    challenge = challenge2;
                                    i25 = i18;
                                    i26 = i210;
                                    i27 = i15;
                                    bVar4 = bVar;
                                    bVar5 = bVar2;
                                    aVar2 = aVar;
                                    b0 data2 = ((ry.a) bVar.a((dx.i) objC2)).getData();
                                    us0.b bVar11 = aVar2.cancelPlannedUseCase;
                                    us0.b.Params params4 = new us0.b.Params(data2);
                                    this.f214829e = jVar;
                                    this.f214830f = vq.j.a(bVar5);
                                    this.f214831g = vq.j.a(bVar4);
                                    this.f214832h = bVar4;
                                    this.f214833j = vq.j.a(challenge);
                                    this.f214834k = vq.j.a(data2);
                                    this.f214835l = i26;
                                    this.f214836m = i17;
                                    this.f214837n = i25;
                                    this.f214838p = i19;
                                    this.f214839q = i27;
                                    this.f214840r = 3;
                                    objC3 = bVar11.c(params4, this);
                                    if (objC3 != objE) {
                                        bVar6 = bVar4;
                                    }
                                }
                                return objE;
                            }
                            if (r15 == 2) {
                                int i39 = this.f214839q;
                                int i45 = this.f214838p;
                                i25 = this.f214837n;
                                int i46 = this.f214836m;
                                i26 = this.f214835l;
                                Challenge challenge3 = (Challenge) this.f214834k;
                                ex.b bVar12 = (ex.b) this.f214833j;
                                bVar4 = (ex.b) this.f214832h;
                                bVar5 = (ex.b) this.f214831g;
                                dx.j<dx.b> jVar3 = (dx.j) this.f214830f;
                                aVar2 = (a) this.f214829e;
                                u.b(obj);
                                i27 = i39;
                                jVar = jVar3;
                                bVar = bVar12;
                                challenge = challenge3;
                                i17 = i46;
                                i19 = i45;
                                objC2 = obj;
                                b0 data3 = ((ry.a) bVar.a((dx.i) objC2)).getData();
                                us0.b bVar13 = aVar2.cancelPlannedUseCase;
                                us0.b.Params params5 = new us0.b.Params(data3);
                                this.f214829e = jVar;
                                this.f214830f = vq.j.a(bVar5);
                                this.f214831g = vq.j.a(bVar4);
                                this.f214832h = bVar4;
                                this.f214833j = vq.j.a(challenge);
                                this.f214834k = vq.j.a(data3);
                                this.f214835l = i26;
                                this.f214836m = i17;
                                this.f214837n = i25;
                                this.f214838p = i19;
                                this.f214839q = i27;
                                this.f214840r = 3;
                                objC3 = bVar13.c(params5, this);
                                if (objC3 != objE) {
                                    bVar6 = bVar4;
                                }
                                return objE;
                            }
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar6 = (ex.b) this.f214832h;
                            u.b(obj);
                            objC3 = obj;
                            bVar6.a((dx.i) objC3);
                            return new dx.i.Right(i0.f148189a);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = obj2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (CancellationException e26) {
                        throw e26;
                    }
                } catch (Exception e27) {
                    e = e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a.this.new C5705a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((C5705a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(us0.b bVar, wz3.e eVar, wz3.d dVar, ac4.a aVar) {
        this.cancelPlannedUseCase = bVar;
        this.getChallengeUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new C5705a(null), eVar, 1, null);
    }
}
