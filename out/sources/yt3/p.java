package yt3;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lyt3/p;", "Ll00/g;", "Lyt3/b;", "Lyt3/a;", "Lyt3/c;", "Lst3/f;", "Lyy/a;", "stateMachineFactory", "Lyt3/d;", "mapper", "Lst3/h;", "addressFormVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lst3/d;", "setupData", "<init>", "(Lyy/a;Lyt3/d;Lst3/h;Lib4/c;Lst3/d;)V", "state", "Lyt3/c$a;", "o9", "(Lyt3/b;)Lyt3/c$a;", "b", "Lyt3/d;", "c", "Lib4/c;", "d", "Lst3/d;", "e", "Lyt3/b;", "initialState", "Lxw/b;", "Lst3/f$a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, yt3.a> implements yt3.c, st3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yt3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AddressFormData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<st3.f.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, yt3.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<yt3.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<yt3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f229377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f229378b;

        /* JADX INFO: renamed from: yt3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6161a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f229379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f229380b;

            /* JADX INFO: renamed from: yt3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6162a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f229381d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f229382e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f229383f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f229385h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f229386j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f229387k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f229388l;

                public C6162a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f229381d = obj;
                    this.f229382e |= PKIFailureInfo.systemUnavail;
                    return C6161a.this.F(null, this);
                }
            }

            public C6161a(mu.h hVar, p pVar) {
                this.f229379a = hVar;
                this.f229380b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6162a c6162a;
                if (eVar instanceof C6162a) {
                    c6162a = (C6162a) eVar;
                    int i15 = c6162a.f229382e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6162a.f229382e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6162a = new C6162a(eVar);
                    }
                } else {
                    c6162a = new C6162a(eVar);
                }
                Object obj2 = c6162a.f229381d;
                Object objE = uq.b.e();
                int i16 = c6162a.f229382e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f229379a;
                    yt3.c.Data aVarO9 = this.f229380b.o9((State) obj);
                    c6162a.f229383f = vq.j.a(obj);
                    c6162a.f229385h = vq.j.a(c6162a);
                    c6162a.f229386j = vq.j.a(obj);
                    c6162a.f229387k = vq.j.a(hVar);
                    c6162a.f229388l = 0;
                    c6162a.f229382e = 1;
                    if (hVar.F(aVarO9, c6162a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f229377a = gVar;
            this.f229378b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yt3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f229377a.a(new C6161a(hVar, this.f229378b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$b;", "<unused var>", "Lyt3/b;", "state", "Loq/i0;", "<anonymous>", "(Lyt3/a$b;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<yt3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229390f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f229390f;
            Object objE = uq.b.e();
            int i15 = this.f229389e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                st3.f.a.Back c4758a = new st3.f.a.Back(state.getAddressData());
                this.f229390f = vq.j.a(state);
                this.f229389e = 1;
                if (pVar.F(c4758a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = p.this.new b(eVar);
            bVar2.f229390f = state;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Lyt3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<st3.g.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229393f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f229393f
                st3.g$b r0 = (st3.g.b) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f229392e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L23
                if (r2 == r5) goto L1e
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L9b
            L23:
                oq.u.b(r7)
                st3.g$b$a r7 = st3.g.b.a.f184307a
                boolean r7 = fr.t.c(r0, r7)
                if (r7 == 0) goto L45
                yt3.p r7 = yt3.p.this
                st3.f$a$a r2 = new st3.f$a$a
                r3 = 0
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f229393f = r0
                r6.f229392e = r5
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
                goto L86
            L45:
                boolean r7 = r0 instanceof st3.g.b.GoToError
                if (r7 == 0) goto L66
                yt3.p r7 = yt3.p.this
                st3.f$a$c r2 = new st3.f$a$c
                r3 = r0
                st3.g$b$b r3 = (st3.g.b.GoToError) r3
                jb4.b r3 = r3.getErrorData()
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f229393f = r0
                r6.f229392e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
                goto L86
            L66:
                boolean r7 = r0 instanceof st3.g.b.GoToSearch
                if (r7 == 0) goto L87
                yt3.p r7 = yt3.p.this
                st3.f$a$e r2 = new st3.f$a$e
                r4 = r0
                st3.g$b$c r4 = (st3.g.b.GoToSearch) r4
                tt3.b r4 = r4.getModel()
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f229393f = r0
                r6.f229392e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
            L86:
                return r1
            L87:
                boolean r7 = r0 instanceof st3.g.b.Validated
                if (r7 == 0) goto L9e
                yt3.p r7 = yt3.p.this
                yt3.a$f r1 = new yt3.a$f
                st3.g$b$d r0 = (st3.g.b.Validated) r0
                st3.k r0 = r0.getAddressResult()
                r1.<init>(r0)
                yt3.p.k9(r7, r1)
            L9b:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L9e:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yt3.p.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f229393f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lst3/g$c;", "event", "Lk10/c0;", "Lyt3/b;", "state", "Lk10/l;", "<anonymous>", "(Lst3/g$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<st3.g.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229397g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(st3.g.c cVar, State state) {
            return State.b(state, null, null, ((st3.g.c.Content) cVar).getAddressData(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final st3.g.c cVar = (st3.g.c) this.f229396f;
            c0 c0Var = (c0) this.f229397g;
            uq.b.e();
            if (this.f229395e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar instanceof st3.g.c.Content) {
                return c0Var.b(new er.l() { // from class: yt3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.d.O(cVar, (State) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f229396f = cVar;
            dVar.f229397g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$d;", "action", "Lyt3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyt3/a$d;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yt3.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229399f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(yt3.a.OnError onError, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    onError.b().a();
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    onError.c().a();
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yt3.a.OnError onError = (yt3.a.OnError) this.f229399f;
            Object objE = uq.b.e();
            int i15 = this.f229398e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.f.a> bVarY1 = p.this.Y1();
                st3.f.a.GoToError cVar = new st3.f.a.GoToError(p.this.genericDomainErrorMapper.b(new ib4.c.Params(onError.getDomainError(), false, new er.l() { // from class: yt3.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.O(onError, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f229399f = vq.j.a(onError);
                this.f229398e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.OnError onError, State state, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f229399f = onError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$a;", "event", "Lyt3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyt3/a$a;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yt3.a.GoToSearch, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229402f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yt3.a.GoToSearch goToSearch = (yt3.a.GoToSearch) this.f229402f;
            Object objE = uq.b.e();
            int i15 = this.f229401e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                st3.f.a.GoToSearch eVar = new st3.f.a.GoToSearch(goToSearch.getModel());
                this.f229402f = vq.j.a(goToSearch);
                this.f229401e = 1;
                if (pVar.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.GoToSearch goToSearch, State state, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f229402f = goToSearch;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$e;", "<unused var>", "Lyt3/b;", "state", "Loq/i0;", "<anonymous>", "(Lyt3/a$e;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yt3.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229405f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f229405f;
            Object objE = uq.b.e();
            int i15 = this.f229404e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f229405f = vq.j.a(state);
                this.f229404e = 1;
                if (bVarE.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.e eVar, State state, tq.e<? super i0> eVar2) {
            g gVar = new g(eVar2);
            gVar.f229405f = state;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$f;", "action", "Lyt3/b;", "state", "Loq/i0;", "<anonymous>", "(Lyt3/a$f;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yt3.a.OnValidated, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229408g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            if (r7.F(r3, r6) == r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        
            if (r7.F(r3, r6) == r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f229407f
                yt3.a$f r0 = (yt3.a.OnValidated) r0
                java.lang.Object r1 = r6.f229408g
                yt3.b r1 = (yt3.State) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f229406e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L23
                if (r3 == r5) goto L1f
                if (r3 != r4) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                oq.u.b(r7)
                goto L77
            L23:
                oq.u.b(r7)
                st3.k r7 = r0.getAddressResult()
                boolean r7 = r7 instanceof st3.k.ValidWithResult
                if (r7 == 0) goto L58
                yt3.p r7 = yt3.p.this
                xw.b r7 = r7.Y1()
                st3.f$a$d r3 = new st3.f$a$d
                st3.k r4 = r0.getAddressResult()
                st3.k$b r4 = (st3.k.ValidWithResult) r4
                st3.b r4 = r4.getAddressData()
                r3.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f229407f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r6.f229408g = r0
                r6.f229406e = r5
                java.lang.Object r7 = r7.F(r3, r6)
                if (r7 != r2) goto L77
                goto L76
            L58:
                st3.g r7 = r1.getAddressFormVMS()
                xw.b r7 = r7.e()
                st3.g$a$b r3 = st3.g.a.b.f184305a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f229407f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r6.f229408g = r0
                r6.f229406e = r4
                java.lang.Object r7 = r7.F(r3, r6)
                if (r7 != r2) goto L77
            L76:
                return r2
            L77:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yt3.p.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.OnValidated onValidated, State state, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f229407f = onValidated;
            hVar.f229408g = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyt3/a$c;", "<unused var>", "Lyt3/b;", "state", "Loq/i0;", "<anonymous>", "(Lyt3/a$c;Lyt3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yt3.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229411f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f229411f;
            Object objE = uq.b.e();
            int i15 = this.f229410e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                st3.f.a.Close bVar = new st3.f.a.Close(state.getAddressData());
                this.f229411f = vq.j.a(state);
                this.f229410e = 1;
                if (pVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yt3.a.c cVar, State state, tq.e<? super i0> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f229411f = state;
            return iVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, yt3.d dVar, st3.h hVar, ib4.c cVar, AddressFormData addressFormData) {
        this.mapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.setupData = addressFormData;
        AddressFormVMSSetupData.b mode = addressFormData.getMode();
        AddressData initialData = addressFormData.getInitialData();
        State state = new State(addressFormData, hVar.a(new AddressFormVMSSetupData(mode, false, initialData != null ? st3.j.a(initialData) : null, 2, null)), null, 4, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: yt3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f229369a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yt3.c.Data o9(State state) {
        return this.mapper.b(new yt3.d.Params(state, b9(yt3.a.e.f229345a), b9(yt3.a.c.f229341a), b9(yt3.a.b.f229340a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: yt3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f229368a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        k10.k.r(zVar, new er.l() { // from class: yt3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9((State) obj);
            }
        }, null, pVar.new c(null), 2, null);
        k10.k.l(zVar, new er.l() { // from class: yt3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9((State) obj);
            }
        }, null, new d(null), 2, null);
        e eVar = pVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yt3.a.OnError.class), oVar, eVar);
        zVar.x(q0.c(yt3.a.GoToSearch.class), oVar, pVar.new f(null));
        zVar.x(q0.c(yt3.a.e.class), oVar, new g(null));
        zVar.x(q0.c(yt3.a.OnValidated.class), oVar, pVar.new h(null));
        zVar.x(q0.c(yt3.a.c.class), oVar, pVar.new i(null));
        zVar.x(q0.c(yt3.a.b.class), oVar, pVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g s9(State state) {
        return state.getAddressFormVMS().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g t9(State state) {
        return state.getAddressFormVMS().getState();
    }

    @Override // zx.b
    public xw.b<st3.f.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, yt3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yt3.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(st3.f.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AddressFormData addressFormData) {
        super.P5(addressFormData);
    }
}
