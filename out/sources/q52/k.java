package q52;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lq52/k;", "Ll00/g;", "Lq52/b;", "Lq52/a;", "Lq52/c;", "", "Lyy/a;", "stateMachineFactory", "Lr52/a;", "mapper", "Lw52/g;", "setupContact", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lfs0/a;", "createStampDutyPaymentUC", "<init>", "(Lyy/a;Lr52/a;Lw52/g;Lac4/a;Lib4/c;Lfs0/a;)V", "state", "Lq52/c$a;", "o9", "(Lq52/b;)Lq52/c$a;", "b", "Lr52/a;", "c", "Lw52/g;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Lfs0/a;", "g", "Lq52/b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lq52/a$f;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, q52.a> implements q52.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r52.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w52.g setupContact;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final fs0.a createStampDutyPaymentUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, q52.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q52.a.f> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<q52.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<q52.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f164843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f164844b;

        /* JADX INFO: renamed from: q52.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4097a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f164845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f164846b;

            /* JADX INFO: renamed from: q52.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4098a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f164847d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f164848e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f164849f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f164851h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f164852j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f164853k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f164854l;

                public C4098a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f164847d = obj;
                    this.f164848e |= PKIFailureInfo.systemUnavail;
                    return C4097a.this.F(null, this);
                }
            }

            public C4097a(mu.h hVar, k kVar) {
                this.f164845a = hVar;
                this.f164846b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4098a c4098a;
                if (eVar instanceof C4098a) {
                    c4098a = (C4098a) eVar;
                    int i15 = c4098a.f164848e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4098a.f164848e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4098a = new C4098a(eVar);
                    }
                } else {
                    c4098a = new C4098a(eVar);
                }
                Object obj2 = c4098a.f164847d;
                Object objE = uq.b.e();
                int i16 = c4098a.f164848e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f164845a;
                    q52.c.Data dataO9 = this.f164846b.o9((State) obj);
                    c4098a.f164849f = vq.j.a(obj);
                    c4098a.f164851h = vq.j.a(c4098a);
                    c4098a.f164852j = vq.j.a(obj);
                    c4098a.f164853k = vq.j.a(hVar);
                    c4098a.f164854l = 0;
                    c4098a.f164848e = 1;
                    if (hVar.F(dataO9, c4098a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f164843a = gVar;
            this.f164844b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q52.c.Data> hVar, tq.e eVar) {
            Object objA = this.f164843a.a(new C4097a(hVar, this.f164844b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq52/a$a;", "<unused var>", "Lq52/b;", "Loq/i0;", "<anonymous>", "(Lq52/a$a;Lq52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<q52.a.C4095a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164855e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164855e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<q52.a.f> bVarY1 = k.this.Y1();
                q52.a.f.C4096a c4096a = q52.a.f.C4096a.f164813a;
                this.f164855e = 1;
                if (bVarY1.F(c4096a, this) == objE) {
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
        public final Object w(q52.a.C4095a c4095a, State state, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq52/a$b;", "<unused var>", "Lq52/b;", "Loq/i0;", "<anonymous>", "(Lq52/a$b;Lq52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<q52.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164857e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164857e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<q52.a.f> bVarY1 = k.this.Y1();
                q52.a.f.b bVar = q52.a.f.b.f164814a;
                this.f164857e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(q52.a.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq52/a$c;", "<unused var>", "Lq52/b;", "Loq/i0;", "<anonymous>", "(Lq52/a$c;Lq52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<q52.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164859e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164859e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<q52.a.f> bVarY1 = k.this.Y1();
                q52.a.f.c cVar = q52.a.f.c.f164815a;
                this.f164859e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(q52.a.c cVar, State state, tq.e<? super i0> eVar) {
            return k.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq52/a$d;", "<unused var>", "Lq52/b;", "state", "Loq/i0;", "<anonymous>", "(Lq52/a$d;Lq52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<q52.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164862f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f164864e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f164865f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f164866g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f164867h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f164868j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ k f164869k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f164870l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f164869k = kVar;
                this.f164870l = state;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
            
                if (r1.F(r4, r11) == r0) goto L20;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q52.k.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f164869k, this.f164870l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f164862f;
            Object objE = uq.b.e();
            int i15 = this.f164861e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = k.this.callActionWithLoaderUseCase;
                a aVar2 = new a(k.this, state, null);
                this.f164862f = vq.j.a(state);
                this.f164861e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(q52.a.d dVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = k.this.new e(eVar);
            eVar2.f164862f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq52/a$e;", "action", "Lq52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq52/a$e;Lq52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<q52.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164872f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(k kVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                kVar.d9(q52.a.c.f164810a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                kVar.d9(q52.a.d.f164811a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new p();
                }
                kVar.d9(q52.a.c.f164810a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q52.a.Error error = (q52.a.Error) this.f164872f;
            Object objE = uq.b.e();
            int i15 = this.f164871e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                ib4.c cVar = k.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final k kVar2 = k.this;
                q52.a.f.Error error2 = new q52.a.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: q52.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.f.O(kVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f164872f = vq.j.a(error);
                this.f164871e = 1;
                if (kVar.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q52.a.Error error, State state, tq.e<? super i0> eVar) {
            f fVar = k.this.new f(eVar);
            fVar.f164872f = error;
            return fVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, r52.a aVar2, w52.g gVar, ac4.a aVar3, ib4.c cVar, fs0.a aVar4) {
        this.mapper = aVar2;
        this.setupContact = gVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.createStampDutyPaymentUC = aVar4;
        State state = new State(gVar.c());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: q52.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f164833a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q52.c.Data o9(State state) {
        return this.mapper.b(new r52.a.Params(state, b9(q52.a.C4095a.f164808a), b9(q52.a.b.f164809a), b9(q52.a.d.f164811a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: q52.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.r9(this.f164832a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q52.a.C4095a.class), oVar, bVar);
        zVar.x(q0.c(q52.a.b.class), oVar, kVar.new c(null));
        zVar.x(q0.c(q52.a.c.class), oVar, kVar.new d(null));
        zVar.x(q0.c(q52.a.d.class), oVar, kVar.new e(null));
        zVar.x(q0.c(q52.a.Error.class), oVar, kVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<q52.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, q52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q52.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(q52.a.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w52.g gVar) {
        super.P5(gVar);
    }
}
