package p51;

import bl0.BEChildBirthRegistrationApplicantAddress;
import bl0.BEChildBirthRegistrationInitial;
import fr.q0;
import java.time.LocalDate;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lp51/p;", "Ll00/g;", "Lp51/b;", "Lp51/a;", "Lp51/c;", "", "Lyy/a;", "stateMachineFactory", "Lr51/a;", "mapper", "Lq31/c;", "exitDialogMapper", "Lmx/c;", "labelProvider", "Lst3/h;", "addressFormVMSFactory", "Lq51/a;", "contract", "<init>", "(Lyy/a;Lr51/a;Lq31/c;Lmx/c;Lst3/h;Lq51/a;)V", "Lst3/i;", "o9", "()Lst3/i;", "Lp51/d;", "v9", "(Lp51/d;)Lp51/d;", "Lp51/c$a;", "q9", "(Lp51/b;)Lp51/c$a;", "b", "Lr51/a;", "c", "Lq31/c;", "d", "Lmx/c;", "e", "Lq51/a;", "f", "Lp51/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lp51/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, p51.a> implements p51.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r51.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q51.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, p51.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p51.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<p51.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153090a;

        static {
            int[] iArr = new int[bl0.s.values().length];
            try {
                iArr[bl0.s.MyTemporaryAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bl0.s.TemporaryFatherAddress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bl0.s.TemporaryMotherAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153090a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<p51.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f153092b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f153094b;

            /* JADX INFO: renamed from: p51.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3767a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153095d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153096e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153097f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153099h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153100j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153101k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153102l;

                public C3767a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153095d = obj;
                    this.f153096e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f153093a = hVar;
                this.f153094b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3767a c3767a;
                if (eVar instanceof C3767a) {
                    c3767a = (C3767a) eVar;
                    int i15 = c3767a.f153096e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3767a.f153096e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3767a = new C3767a(eVar);
                    }
                } else {
                    c3767a = new C3767a(eVar);
                }
                Object obj2 = c3767a.f153095d;
                Object objE = uq.b.e();
                int i16 = c3767a.f153096e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f153093a;
                    p51.c.Data dataQ9 = this.f153094b.q9((State) obj);
                    c3767a.f153097f = vq.j.a(obj);
                    c3767a.f153099h = vq.j.a(c3767a);
                    c3767a.f153100j = vq.j.a(obj);
                    c3767a.f153101k = vq.j.a(hVar);
                    c3767a.f153102l = 0;
                    c3767a.f153096e = 1;
                    if (hVar.F(dataQ9, c3767a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f153091a = gVar;
            this.f153092b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p51.c.Data> hVar, tq.e eVar) {
            Object objA = this.f153091a.a(new a(hVar, this.f153092b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Lp51/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Lp51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<st3.g.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153104f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        
            if (r7.F(r2, r6) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
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
                java.lang.Object r0 = r6.f153104f
                st3.g$b r0 = (st3.g.b) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f153103e
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
                goto L97
            L23:
                oq.u.b(r7)
                st3.g$b$a r7 = st3.g.b.a.f184307a
                boolean r7 = fr.t.c(r0, r7)
                if (r7 == 0) goto L41
                p51.p r7 = p51.p.this
                p51.a$b$a r2 = p51.a.b.C3764a.f153039a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f153104f = r0
                r6.f153103e = r5
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L97
                goto L82
            L41:
                boolean r7 = r0 instanceof st3.g.b.GoToError
                if (r7 == 0) goto L62
                p51.p r7 = p51.p.this
                p51.a$b$c r2 = new p51.a$b$c
                r3 = r0
                st3.g$b$b r3 = (st3.g.b.GoToError) r3
                jb4.b r3 = r3.getErrorData()
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f153104f = r0
                r6.f153103e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L97
                goto L82
            L62:
                boolean r7 = r0 instanceof st3.g.b.GoToSearch
                if (r7 == 0) goto L83
                p51.p r7 = p51.p.this
                p51.a$b$e r2 = new p51.a$b$e
                r4 = r0
                st3.g$b$c r4 = (st3.g.b.GoToSearch) r4
                tt3.b r4 = r4.getModel()
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f153104f = r0
                r6.f153103e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L97
            L82:
                return r1
            L83:
                boolean r7 = r0 instanceof st3.g.b.Validated
                if (r7 == 0) goto L9a
                p51.p r7 = p51.p.this
                p51.a$f r1 = new p51.a$f
                st3.g$b$d r0 = (st3.g.b.Validated) r0
                st3.k r0 = r0.getAddressResult()
                r1.<init>(r0)
                p51.p.j9(r7, r1)
            L97:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L9a:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p51.p.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f153104f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp51/a$g;", "<unused var>", "Lp51/b;", "Loq/i0;", "<anonymous>", "(Lp51/a$g;Lp51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<p51.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153106e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f153108e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f153109f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f153109f = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f153108e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<p51.a.b> bVarY1 = this.f153109f.Y1();
                    p51.a.b.C3765b c3765b = p51.a.b.C3765b.f153040a;
                    this.f153108e = 1;
                    if (bVarY1.F(c3765b, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f153109f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar) {
            i00.a.a(pVar, new a(pVar, null));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153106e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p51.a.b> bVarY1 = p.this.Y1();
                q31.c cVar = p.this.exitDialogMapper;
                final p pVar = p.this;
                p51.a.b.ShowDialog showDialog = new p51.a.b.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: p51.q
                    @Override // er.a
                    public final Object a() {
                        return p.d.O(pVar);
                    }
                })));
                this.f153106e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(p51.a.g gVar, State state, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp51/a$e;", "<unused var>", "Lk10/c0;", "Lp51/b;", "state", "Lk10/l;", "<anonymous>", "(Lp51/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<p51.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153111f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(p pVar, LocalDate localDate) {
            pVar.d9(new p51.a.OnDateChanged(new fz.b.LocalDate(localDate)));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            RegisteredAddressFields fields = state.getFields();
            RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateField = state.getFields().getTemporaryAddressEndDateField();
            return State.b(state, null, null, false, fields.a(temporaryAddressEndDateField != null ? RegisteredAddressFields.a.TemporaryAddressEndDate.b(temporaryAddressEndDateField, hz.b.C2039b.f86846c, null, 2, null) : null), null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fz.b.LocalDate date;
            c0 c0Var = (c0) this.f153111f;
            Object objE = uq.b.e();
            int i15 = this.f153110e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateField = ((State) c0Var.a()).getFields().getTemporaryAddressEndDateField();
                LocalDate date2 = (temporaryAddressEndDateField == null || (date = temporaryAddressEndDateField.getDate()) == null) ? null : date.getDate();
                final p pVar2 = p.this;
                p51.a.b.ShowDatePicker showDatePicker = new p51.a.b.ShowDatePicker(new uw.j.Single(null, date2, new er.l() { // from class: p51.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.V(pVar2, (LocalDate) obj2);
                    }
                }, LocalDate.now().plusDays(1L), null, 17, null));
                this.f153111f = c0Var;
                this.f153110e = 1;
                if (pVar.F(showDatePicker, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: p51.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(p51.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            e eVar3 = p.this.new e(eVar2);
            eVar3.f153111f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp51/a$d;", "action", "Lk10/c0;", "Lp51/b;", "state", "Lk10/l;", "<anonymous>", "(Lp51/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<p51.a.OnDateChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f153115g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p51.a.OnDateChanged onDateChanged, State state) {
            RegisteredAddressFields fields = state.getFields();
            RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateField = state.getFields().getTemporaryAddressEndDateField();
            return State.b(state, null, null, false, fields.a(temporaryAddressEndDateField != null ? RegisteredAddressFields.a.TemporaryAddressEndDate.b(temporaryAddressEndDateField, null, onDateChanged.getDate(), 1, null) : null), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p51.a.OnDateChanged onDateChanged = (p51.a.OnDateChanged) this.f153114f;
            c0 c0Var = (c0) this.f153115g;
            uq.b.e();
            if (this.f153113e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p51.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(onDateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p51.a.OnDateChanged onDateChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f153114f = onDateChanged;
            fVar.f153115g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp51/a$a;", "<unused var>", "Lp51/b;", "Loq/i0;", "<anonymous>", "(Lp51/a$a;Lp51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<p51.a.C3763a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153116e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153116e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p51.a.b> bVarY1 = p.this.Y1();
                p51.a.b.C3764a c3764a = p51.a.b.C3764a.f153039a;
                this.f153116e = 1;
                if (bVarY1.F(c3764a, this) == objE) {
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
        public final Object w(p51.a.C3763a c3763a, State state, tq.e<? super i0> eVar) {
            return p.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp51/a$c;", "<unused var>", "Lp51/b;", "state", "Loq/i0;", "<anonymous>", "(Lp51/a$c;Lp51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<p51.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153119f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f153119f;
            Object objE = uq.b.e();
            int i15 = this.f153118e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f153119f = vq.j.a(state);
                this.f153118e = 1;
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
        public final Object w(p51.a.c cVar, State state, tq.e<? super i0> eVar) {
            h hVar = new h(eVar);
            hVar.f153119f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp51/a$f;", "action", "Lk10/c0;", "Lp51/b;", "state", "Lk10/l;", "<anonymous>", "(Lp51/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<p51.a.OnValidated, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f153120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f153121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f153122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f153123h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(RegisteredAddressFields registeredAddressFields, RegisteredAddressFields.b bVar, State state) {
            RegisteredAddressFields.b.a aVar = bVar instanceof RegisteredAddressFields.b.a ? (RegisteredAddressFields.b.a) bVar : null;
            return State.b(state, null, null, false, registeredAddressFields, aVar != null ? new d60.j(aVar) : null, 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(RegisteredAddressFields registeredAddressFields, State state) {
            return State.b(state, null, null, false, registeredAddressFields, null, 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
        
            if (r3.F(r4, r8) == r2) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p51.p.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(p51.a.OnValidated onValidated, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f153122g = onValidated;
            iVar.f153123h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, r51.a aVar2, q31.c cVar, mx.c cVar2, st3.h hVar, q51.a aVar3) {
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDate;
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDate2;
        fz.b.LocalDate temporaryAddressEndDate3;
        this.mapper = aVar2;
        this.exitDialogMapper = cVar;
        this.labelProvider = cVar2;
        this.contract = aVar3;
        st3.g gVarA = hVar.a(o9());
        bl0.s sVarR0 = aVar3.r0();
        boolean zL = aVar3.l();
        q51.a.Data dataK1 = aVar3.K1();
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDate4 = null;
        if (dataK1 == null || (temporaryAddressEndDate3 = dataK1.getTemporaryAddressEndDate()) == null) {
            int i15 = a.f153090a[aVar3.r0().ordinal()];
            if (i15 != 1) {
                temporaryAddressEndDate = (i15 == 2 || i15 == 3) ? new RegisteredAddressFields.a.TemporaryAddressEndDate(null, null, 1, null) : temporaryAddressEndDate;
                temporaryAddressEndDate2 = temporaryAddressEndDate4;
            } else {
                temporaryAddressEndDate = new RegisteredAddressFields.a.TemporaryAddressEndDate(null, aVar3.i().getTemporaryAddressEndDate(), 1, null);
            }
            temporaryAddressEndDate4 = temporaryAddressEndDate;
            temporaryAddressEndDate2 = temporaryAddressEndDate4;
        } else {
            temporaryAddressEndDate2 = new RegisteredAddressFields.a.TemporaryAddressEndDate(null, temporaryAddressEndDate3, 1, null);
        }
        State state = new State(gVarA, sVarR0, zL, new RegisteredAddressFields(temporaryAddressEndDate2), null, 16, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: p51.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f153081a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), q9(state));
    }

    private final AddressFormVMSSetupData o9() {
        AddressFormVMSSetupData.a aVar;
        BEChildBirthRegistrationApplicantAddress temporaryAddress;
        AddressData addressData;
        q51.a.Data dataK1 = this.contract.K1();
        AddressFormVMSSetupData.a aVarF = null;
        AddressFormVMSSetupData.a aVarA = (dataK1 == null || (addressData = dataK1.getAddressData()) == null) ? null : st3.j.a(addressData);
        BEChildBirthRegistrationInitial bEChildBirthRegistrationInitialI = this.contract.i();
        bl0.s sVarR0 = this.contract.r0();
        AddressFormVMSSetupData.b.C4761b c4761b = AddressFormVMSSetupData.b.C4761b.f184325a;
        if (aVarA == null) {
            if (sVarR0 == bl0.s.MyPermanentAddress) {
                BEChildBirthRegistrationApplicantAddress permanentAddress = bEChildBirthRegistrationInitialI.getPermanentAddress();
                if (permanentAddress != null) {
                    aVarF = q31.d.f(permanentAddress);
                }
            } else if (sVarR0 == bl0.s.MyTemporaryAddress && (temporaryAddress = bEChildBirthRegistrationInitialI.getTemporaryAddress()) != null) {
                aVarF = q31.d.f(temporaryAddress);
            }
            aVar = aVarF;
        } else {
            aVar = aVarA;
        }
        return new AddressFormVMSSetupData(c4761b, false, aVar, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p51.c.Data q9(State state) {
        return this.mapper.b(new r51.a.Params(state, b9(p51.a.e.f153049a), b9(p51.a.c.f153046a), b9(p51.a.g.f153051a), b9(p51.a.C3763a.f153038a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: p51.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f153080a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        k10.k.r(zVar, new er.l() { // from class: p51.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9((State) obj);
            }
        }, null, pVar.new c(null), 2, null);
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p51.a.g.class), oVar, dVar);
        zVar.v(q0.c(p51.a.e.class), oVar, pVar.new e(null));
        zVar.v(q0.c(p51.a.OnDateChanged.class), oVar, new f(null));
        zVar.x(q0.c(p51.a.C3763a.class), oVar, pVar.new g(null));
        zVar.x(q0.c(p51.a.c.class), oVar, new h(null));
        zVar.v(q0.c(p51.a.OnValidated.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g u9(State state) {
        return state.getAddressFormVMS().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RegisteredAddressFields v9(RegisteredAddressFields registeredAddressFields) {
        hz.b invalid;
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateField = registeredAddressFields.getTemporaryAddressEndDateField();
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateB = null;
        if (temporaryAddressEndDateField != null) {
            boolean z15 = registeredAddressFields.getTemporaryAddressEndDateField().getDate() == null;
            if (z15) {
                invalid = new hz.b.Invalid(this.labelProvider.c(j31.a.f99170k1));
            } else {
                if (z15) {
                    throw new oq.p();
                }
                invalid = hz.b.d.f86848c;
            }
            temporaryAddressEndDateB = RegisteredAddressFields.a.TemporaryAddressEndDate.b(temporaryAddressEndDateField, invalid, null, 2, null);
        }
        return registeredAddressFields.a(temporaryAddressEndDateB);
    }

    @Override // zx.b
    public xw.b<p51.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, p51.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p51.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p51.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(q51.a aVar) {
        super.P5(aVar);
    }
}
