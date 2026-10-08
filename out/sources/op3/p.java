package op3;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oo0.Idea;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lop3/p;", "Ll00/g;", "Lop3/f;", "", "Lop3/g;", "Lyy/a;", "stateMachineFactory", "Lpp3/a;", "ideaDetailsMapper", "Lpo0/l;", "voteForIdeaUC", "Lib4/c;", "genericDomainErrorMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Lkp3/a;", "ideaDetailsData", "<init>", "(Lyy/a;Lpp3/a;Lpo0/l;Lib4/c;Lc54/b;Lkp3/a;)V", "state", "Lop3/g$a;", "p9", "(Lop3/f;)Lop3/g$a;", "Loo0/i;", "idea", "Loq/i0;", "u9", "(Loo0/i;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "n9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "Lpp3/a;", "c", "Lpo0/l;", "d", "Lib4/c;", "e", "Lc54/b;", "f", "Lkp3/a;", "g", "Lop3/f;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lop3/d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<op3.f, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pp3.a ideaDetailsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.l voteForIdeaUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kp3.a ideaDetailsData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final op3.f initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<op3.f, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<op3.d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f148126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f148127b;

        /* JADX INFO: renamed from: op3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3677a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f148128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f148129b;

            /* JADX INFO: renamed from: op3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3678a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f148130d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f148131e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f148132f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f148134h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f148135j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f148136k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f148137l;

                public C3678a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f148130d = obj;
                    this.f148131e |= PKIFailureInfo.systemUnavail;
                    return C3677a.this.F(null, this);
                }
            }

            public C3677a(mu.h hVar, p pVar) {
                this.f148128a = hVar;
                this.f148129b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3678a c3678a;
                if (eVar instanceof C3678a) {
                    c3678a = (C3678a) eVar;
                    int i15 = c3678a.f148131e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3678a.f148131e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3678a = new C3678a(eVar);
                    }
                } else {
                    c3678a = new C3678a(eVar);
                }
                Object obj2 = c3678a.f148130d;
                Object objE = uq.b.e();
                int i16 = c3678a.f148131e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f148128a;
                    g.Data dataP9 = this.f148129b.p9((op3.f) obj);
                    c3678a.f148132f = vq.j.a(obj);
                    c3678a.f148134h = vq.j.a(c3678a);
                    c3678a.f148135j = vq.j.a(obj);
                    c3678a.f148136k = vq.j.a(hVar);
                    c3678a.f148137l = 0;
                    c3678a.f148131e = 1;
                    if (hVar.F(dataP9, c3678a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f148126a = gVar;
            this.f148127b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f148126a.a(new C3677a(hVar, this.f148127b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lop3/a;", "<unused var>", "Lop3/f;", "Loq/i0;", "<anonymous>", "(Lop3/a;Lop3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<op3.a, op3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148138e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f148138e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<op3.d> bVarY1 = p.this.Y1();
                op3.d.a aVar = op3.d.a.f148092a;
                this.f148138e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(op3.a aVar, op3.f fVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lop3/e;", "<unused var>", "Lop3/f$a;", "state", "Loq/i0;", "<anonymous>", "(Lop3/e;Lop3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<op3.e, op3.f.ActiveRoundIdeaDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148141f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails = (op3.f.ActiveRoundIdeaDetails) this.f148141f;
            Object objE = uq.b.e();
            int i15 = this.f148140e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                Idea ideaData = activeRoundIdeaDetails.getIdeaDetailsData().getIdeaData();
                this.f148141f = vq.j.a(activeRoundIdeaDetails);
                this.f148140e = 1;
                if (pVar.u9(ideaData, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(op3.e eVar, op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails, tq.e<? super i0> eVar2) {
            c cVar = p.this.new c(eVar2);
            cVar.f148141f = activeRoundIdeaDetails;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lop3/c;", "<unused var>", "Lop3/f$a;", "state", "Loq/i0;", "<anonymous>", "(Lop3/c;Lop3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<op3.c, op3.f.ActiveRoundIdeaDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148144f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails = (op3.f.ActiveRoundIdeaDetails) this.f148144f;
            Object objE = uq.b.e();
            int i15 = this.f148143e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<op3.d> bVarY1 = p.this.Y1();
                op3.d.GoToSuccess goToSuccess = new op3.d.GoToSuccess(activeRoundIdeaDetails.getIdeaDetailsData());
                this.f148144f = vq.j.a(activeRoundIdeaDetails);
                this.f148143e = 1;
                if (bVarY1.F(goToSuccess, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(op3.c cVar, op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f148144f = activeRoundIdeaDetails;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lop3/b;", "<unused var>", "Lop3/f$a;", "Loq/i0;", "<anonymous>", "(Lop3/b;Lop3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<op3.b, op3.f.ActiveRoundIdeaDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148146e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f148146e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L54
            L1b:
                oq.u.b(r5)
                op3.p r5 = op3.p.this
                c54.b r5 = op3.p.k9(r5)
                b54.c r1 = b54.c.VOTE_IDEA_DEV
                java.lang.Object r5 = r5.a(r1)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L43
                op3.p r5 = op3.p.this
                xw.b r5 = r5.Y1()
                op3.d$c r1 = op3.d.c.f148094a
                r4.f148146e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L54
                goto L53
            L43:
                op3.p r5 = op3.p.this
                xw.b r5 = r5.Y1()
                op3.d$e r1 = op3.d.e.f148096a
                r4.f148146e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: op3.p.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(op3.b bVar, op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f148148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f148149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f148150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f148151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f148152h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f148153j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f148155l;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f148153j = obj;
            this.f148155l |= PKIFailureInfo.systemUnavail;
            return p.this.u9(null, this);
        }
    }

    public p(yy.a aVar, pp3.a aVar2, po0.l lVar, ib4.c cVar, c54.b bVar, kp3.a aVar3) {
        op3.f endedRoundIdeaDetails;
        this.ideaDetailsMapper = aVar2;
        this.voteForIdeaUC = lVar;
        this.genericDomainErrorMapper = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.ideaDetailsData = aVar3;
        if (aVar3 instanceof kp3.a.ActiveRoundIdea) {
            endedRoundIdeaDetails = new op3.f.ActiveRoundIdeaDetails((kp3.a.ActiveRoundIdea) aVar3);
        } else {
            if (!(aVar3 instanceof kp3.a.EndedRoundIdea)) {
                throw new oq.p();
            }
            endedRoundIdeaDetails = new op3.f.EndedRoundIdeaDetails((kp3.a.EndedRoundIdea) aVar3);
        }
        this.initialState = endedRoundIdeaDetails;
        this.stateMachine = aVar.a(endedRoundIdeaDetails, new er.l() { // from class: op3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f148116a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(endedRoundIdeaDetails));
        this.navAction = new xw.b<>();
    }

    private final Object n9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new op3.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: op3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(er.a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data p9(op3.f state) {
        return this.ideaDetailsMapper.b(new pp3.a.Params(state, b9(op3.a.f148089a), b9(op3.e.f148097a), b9(op3.b.f148090a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final p pVar, v vVar) {
        vVar.c(q0.c(op3.f.class), new er.l() { // from class: op3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f148113a, (z) obj);
            }
        });
        vVar.c(q0.c(op3.f.ActiveRoundIdeaDetails.class), new er.l() { // from class: op3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f148114a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(op3.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(op3.e.class), oVar, cVar);
        zVar.x(q0.c(op3.c.class), oVar, pVar.new d(null));
        zVar.x(q0.c(op3.b.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (n9(r2, r4, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u9(oo0.Idea r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof op3.p.f
            if (r0 == 0) goto L13
            r0 = r9
            op3.p$f r0 = (op3.p.f) r0
            int r1 = r0.f148155l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148155l = r1
            goto L18
        L13:
            op3.p$f r0 = new op3.p$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f148153j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f148155l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f148150f
            dx.b r8 = (dx.b) r8
            java.lang.Object r8 = r0.f148149e
            dx.i r8 = (dx.i) r8
            java.lang.Object r8 = r0.f148148d
            oo0.i r8 = (oo0.Idea) r8
            oq.u.b(r9)
            goto Lab
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f148148d
            oo0.i r8 = (oo0.Idea) r8
            oq.u.b(r9)
            goto L65
        L48:
            oq.u.b(r9)
            po0.l r9 = r7.voteForIdeaUC
            po0.l$a r2 = new po0.l$a
            long r5 = r8.getId()
            r2.<init>(r5)
            java.lang.Object r5 = vq.j.a(r8)
            r0.f148148d = r5
            r0.f148155l = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L65
            goto L99
        L65:
            dx.i r9 = (dx.i) r9
            boolean r2 = r9 instanceof dx.i.Left
            if (r2 == 0) goto L9a
            r2 = r9
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            op3.e r4 = op3.e.f148097a
            er.a r4 = r7.b9(r4)
            java.lang.Object r8 = vq.j.a(r8)
            r0.f148148d = r8
            java.lang.Object r8 = vq.j.a(r9)
            r0.f148149e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f148150f = r8
            r8 = 0
            r0.f148151g = r8
            r0.f148152h = r8
            r0.f148155l = r3
            java.lang.Object r8 = r7.n9(r2, r4, r0)
            if (r8 != r1) goto Lab
        L99:
            return r1
        L9a:
            boolean r8 = r9 instanceof dx.i.Right
            if (r8 == 0) goto Lae
            dx.i$c r9 = (dx.i.Right) r9
            java.lang.Object r8 = r9.b()
            oq.i0 r8 = (oq.i0) r8
            op3.c r8 = op3.c.f148091a
            r7.d9(r8)
        Lab:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        Lae:
            oq.p r8 = new oq.p
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: op3.p.u9(oo0.i, tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<op3.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<op3.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kp3.a aVar) {
        super.P5(aVar);
    }
}
