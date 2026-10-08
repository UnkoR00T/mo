package aw2;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Law2/m;", "Ll00/g;", "Law2/c;", "Law2/a;", "Law2/d;", "", "Lyy/a;", "stateMachineFactory", "Lcw2/b;", "mapper", "Lcw2/a;", "errorMapper", "Law2/b;", "data", "<init>", "(Lyy/a;Lcw2/b;Lcw2/a;Law2/b;)V", "state", "Law2/d$a;", "o9", "(Law2/c;)Law2/d$a;", "b", "Lcw2/b;", "c", "Lcw2/a;", "Law2/c$b;", "d", "Law2/c$b;", "initialState", "Lxw/b;", "Law2/a$a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<aw2.c, aw2.a> implements aw2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cw2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cw2.a errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw2.c.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<aw2.a.InterfaceC0329a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<aw2.c, aw2.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<aw2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<aw2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f14811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f14812b;

        /* JADX INFO: renamed from: aw2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0332a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f14813a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f14814b;

            /* JADX INFO: renamed from: aw2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0333a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f14815d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f14816e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f14817f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f14819h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f14820j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f14821k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f14822l;

                public C0333a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f14815d = obj;
                    this.f14816e |= PKIFailureInfo.systemUnavail;
                    return C0332a.this.F(null, this);
                }
            }

            public C0332a(mu.h hVar, m mVar) {
                this.f14813a = hVar;
                this.f14814b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0333a c0333a;
                if (eVar instanceof C0333a) {
                    c0333a = (C0333a) eVar;
                    int i15 = c0333a.f14816e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0333a.f14816e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0333a = new C0333a(eVar);
                    }
                } else {
                    c0333a = new C0333a(eVar);
                }
                Object obj2 = c0333a.f14815d;
                Object objE = uq.b.e();
                int i16 = c0333a.f14816e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f14813a;
                    aw2.d.a aVarO9 = this.f14814b.o9((aw2.c) obj);
                    c0333a.f14817f = vq.j.a(obj);
                    c0333a.f14819h = vq.j.a(c0333a);
                    c0333a.f14820j = vq.j.a(obj);
                    c0333a.f14821k = vq.j.a(hVar);
                    c0333a.f14822l = 0;
                    c0333a.f14816e = 1;
                    if (hVar.F(aVarO9, c0333a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f14811a = gVar;
            this.f14812b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super aw2.d.a> hVar, tq.e eVar) {
            Object objA = this.f14811a.a(new C0332a(hVar, this.f14812b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Law2/a$c;", "action", "Law2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Law2/a$c;Law2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<aw2.a.OnNext, aw2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14824f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            aw2.a.OnNext onNext = (aw2.a.OnNext) this.f14824f;
            Object objE = uq.b.e();
            int i15 = this.f14823e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                aw2.a.InterfaceC0329a.Next next = new aw2.a.InterfaceC0329a.Next(onNext.getIdentityPhotoEnabled());
                this.f14824f = vq.j.a(onNext);
                this.f14823e = 1;
                if (mVar.F(next, this) == objE) {
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
        public final Object w(aw2.a.OnNext onNext, aw2.c cVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f14824f = onNext;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Law2/c$b;", "state", "Lk10/l;", "Law2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<aw2.c.b>, tq.e<? super k10.l<? extends aw2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SetupData f14828g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m f14829h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SetupData setupData, m mVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f14828g = setupData;
            this.f14829h = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final aw2.c.a O(aw2.c.b bVar) {
            return aw2.c.a.f14787a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f14827f;
            uq.b.e();
            if (this.f14826e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            boolean isFaceDetectionFeatureEnabled = this.f14828g.getContract().getIsFaceDetectionFeatureEnabled();
            if (isFaceDetectionFeatureEnabled) {
                return c0Var.d(new er.l() { // from class: aw2.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.c.O((c.b) obj2);
                    }
                });
            }
            if (isFaceDetectionFeatureEnabled) {
                throw new oq.p();
            }
            k10.l lVarC = c0Var.c();
            this.f14829h.d9(new aw2.a.OnNext(false));
            return lVarC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<aw2.c.b> c0Var, tq.e<? super k10.l<? extends aw2.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f14828g, this.f14829h, eVar);
            cVar.f14827f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Law2/a$e;", "<unused var>", "Law2/c$a;", "Loq/i0;", "<anonymous>", "(Law2/a$e;Law2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<aw2.a.e, aw2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14830e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14830e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                aw2.a.InterfaceC0329a.C0330a c0330a = aw2.a.InterfaceC0329a.C0330a.f14778a;
                this.f14830e = 1;
                if (mVar.F(c0330a, this) == objE) {
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
        public final Object w(aw2.a.e eVar, aw2.c.a aVar, tq.e<? super i0> eVar2) {
            return m.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzx2/a$a;", "installationState", "Law2/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzx2/a$a;Law2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<zx2.a.EnumC6438a, aw2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14833f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zx2.a.EnumC6438a enumC6438a = (zx2.a.EnumC6438a) this.f14833f;
            uq.b.e();
            if (this.f14832e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (enumC6438a == zx2.a.EnumC6438a.SUCCESS) {
                m.this.d9(new aw2.a.OnNext(true));
            }
            if (enumC6438a == zx2.a.EnumC6438a.FAILURE) {
                m.this.d9(aw2.a.b.f14781a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zx2.a.EnumC6438a enumC6438a, aw2.c.a aVar, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f14833f = enumC6438a;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Law2/a$b;", "<unused var>", "Law2/c$a;", "Loq/i0;", "<anonymous>", "(Law2/a$b;Law2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<aw2.a.b, aw2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14835e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(m mVar) {
            mVar.d9(aw2.a.d.f14783a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(m mVar) {
            mVar.d9(new aw2.a.OnNext(false));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14835e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                cw2.a aVar = m.this.errorMapper;
                final m mVar2 = m.this;
                er.a aVar2 = new er.a() { // from class: aw2.o
                    @Override // er.a
                    public final Object a() {
                        return m.f.V(mVar2);
                    }
                };
                final m mVar3 = m.this;
                aw2.a.InterfaceC0329a.Error error = new aw2.a.InterfaceC0329a.Error(aVar.b(new cw2.a.Params(aVar2, new er.a() { // from class: aw2.p
                    @Override // er.a
                    public final Object a() {
                        return m.f.X(mVar3);
                    }
                })));
                this.f14835e = 1;
                if (mVar.F(error, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(aw2.a.b bVar, aw2.c.a aVar, tq.e<? super i0> eVar) {
            return m.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Law2/a$d;", "<unused var>", "Law2/c$a;", "Loq/i0;", "<anonymous>", "(Law2/a$d;Law2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<aw2.a.d, aw2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SetupData f14838f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SetupData setupData, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f14838f = setupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f14837e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f14838f.b().a();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(aw2.a.d dVar, aw2.c.a aVar, tq.e<? super i0> eVar) {
            return new g(this.f14838f, eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, cw2.b bVar, cw2.a aVar2, final SetupData setupData) {
        this.mapper = bVar;
        this.errorMapper = aVar2;
        aw2.c.b bVar2 = aw2.c.b.f14788a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: aw2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f14803a, setupData, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aw2.d.a o9(aw2.c state) {
        return this.mapper.b(new cw2.b.Params(state, b9(aw2.a.e.f14784a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final m mVar, final SetupData setupData, v vVar) {
        vVar.c(q0.c(aw2.c.class), new er.l() { // from class: aw2.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f14798a, (z) obj);
            }
        });
        vVar.c(q0.c(aw2.c.b.class), new er.l() { // from class: aw2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(setupData, mVar, (z) obj);
            }
        });
        vVar.c(q0.c(aw2.c.a.class), new er.l() { // from class: aw2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(setupData, mVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(aw2.a.OnNext.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(SetupData setupData, m mVar, z zVar) {
        zVar.A(new c(setupData, mVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(SetupData setupData, m mVar, z zVar) {
        d dVar = mVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(aw2.a.e.class), oVar, dVar);
        k10.k.s(zVar, setupData.getContract().d(), null, mVar.new e(null), 2, null);
        zVar.x(q0.c(aw2.a.b.class), oVar, mVar.new f(null));
        zVar.x(q0.c(aw2.a.d.class), oVar, new g(setupData, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<aw2.a.InterfaceC0329a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<aw2.c, aw2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<aw2.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(aw2.a.InterfaceC0329a interfaceC0329a, tq.e<? super i0> eVar) {
        return super.F(interfaceC0329a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
