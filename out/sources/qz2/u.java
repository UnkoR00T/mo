package qz2;

import fr.q0;
import jk0.QualifiedSignatureInfo;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\u0019*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lqz2/u;", "Ll00/g;", "Lqz2/m;", "Lqz2/l;", "Lqz2/n;", "", "Lyy/a;", "stateMachineFactory", "Lsz2/c;", "mapper", "Lkk0/e;", "beGetQualifiedSignatureInfoUC", "Lhb4/d;", "errorVMSFactory", "Lsz2/b;", "qualifiedSignatureErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Lsz2/c;Lkk0/e;Lhb4/d;Lsz2/b;Lac4/a;)V", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "s9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "state", "Lqz2/n$a;", "t9", "(Lqz2/m;)Lqz2/n$a;", "b", "Lsz2/c;", "c", "Lkk0/e;", "d", "Lhb4/d;", "e", "Lsz2/b;", "f", "Lac4/a;", "Lxw/b;", "Lqz2/l$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lqz2/m$c;", "h", "Lqz2/m$c;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<m, l> implements n, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sz2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kk0.e beGetQualifiedSignatureInfoUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sz2.b qualifiedSignatureErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m.c initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m, l> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<n.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f169732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f169733b;

        /* JADX INFO: renamed from: qz2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4292a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f169734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f169735b;

            /* JADX INFO: renamed from: qz2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4293a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f169736d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169737e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f169738f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f169740h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f169741j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f169742k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f169743l;

                public C4293a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f169736d = obj;
                    this.f169737e |= PKIFailureInfo.systemUnavail;
                    return C4292a.this.F(null, this);
                }
            }

            public C4292a(mu.h hVar, u uVar) {
                this.f169734a = hVar;
                this.f169735b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4293a c4293a;
                if (eVar instanceof C4293a) {
                    c4293a = (C4293a) eVar;
                    int i15 = c4293a.f169737e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4293a.f169737e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4293a = new C4293a(eVar);
                    }
                } else {
                    c4293a = new C4293a(eVar);
                }
                Object obj2 = c4293a.f169736d;
                Object objE = uq.b.e();
                int i16 = c4293a.f169737e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f169734a;
                    n.a aVarT9 = this.f169735b.t9((m) obj);
                    c4293a.f169738f = vq.j.a(obj);
                    c4293a.f169740h = vq.j.a(c4293a);
                    c4293a.f169741j = vq.j.a(obj);
                    c4293a.f169742k = vq.j.a(hVar);
                    c4293a.f169743l = 0;
                    c4293a.f169737e = 1;
                    if (hVar.F(aVarT9, c4293a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f169732a = gVar;
            this.f169733b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n.a> hVar, tq.e eVar) {
            Object objA = this.f169732a.a(new C4292a(hVar, this.f169733b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqz2/l$b;", "<unused var>", "Lqz2/m;", "Loq/i0;", "<anonymous>", "(Lqz2/l$b;Lqz2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l.b, m, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169744e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169744e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l.d> bVarY1 = u.this.Y1();
                l.d.a aVar = l.d.a.f169698a;
                this.f169744e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(l.b bVar, m mVar, tq.e<? super i0> eVar) {
            return u.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqz2/m$c;", "state", "Lk10/l;", "Lqz2/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<m.c>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169747f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqz2/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f169749e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f169750f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<m.c> f169751g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<m.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f169750f = uVar;
                this.f169751g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m.Error X(u uVar, dx.b bVar, m.c cVar) {
                return new m.Error(uVar.errorVMSFactory.a(uVar.s9(bVar, uVar.b9(l.e.f169700a), uVar.b9(l.b.f169696a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m.Initialized Y(QualifiedSignatureInfo qualifiedSignatureInfo, m.c cVar) {
                return new m.Initialized(qualifiedSignatureInfo);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f169749e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    kk0.e eVar = this.f169750f.beGetQualifiedSignatureInfoUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f169749e = 1;
                    obj = eVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<m.c> c0Var = this.f169751g;
                final u uVar = this.f169750f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: qz2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.X(uVar, bVar, (m.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final QualifiedSignatureInfo qualifiedSignatureInfo = (QualifiedSignatureInfo) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: qz2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.Y(qualifiedSignatureInfo, (m.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f169750f, this.f169751g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends m>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f169747f;
            Object objE = uq.b.e();
            int i15 = this.f169746e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f169747f = vq.j.a(c0Var);
            this.f169746e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<m.c> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f169747f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqz2/l$f;", "<unused var>", "Lqz2/m$d;", "state", "Loq/i0;", "<anonymous>", "(Lqz2/l$f;Lqz2/m$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l.f, m.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169753f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m.Initialized initialized = (m.Initialized) this.f169753f;
            Object objE = uq.b.e();
            int i15 = this.f169752e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l.d> bVarY1 = u.this.Y1();
                l.d.ToProviderList toProviderList = new l.d.ToProviderList(initialized.getQualifiedSignatureInfo());
                this.f169753f = vq.j.a(initialized);
                this.f169752e = 1;
                if (bVarY1.F(toProviderList, this) == objE) {
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
        public final Object w(l.f fVar, m.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f169753f = initialized;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqz2/l$c;", "<unused var>", "Lk10/c0;", "Lqz2/m$d;", "state", "Lk10/l;", "Lqz2/m;", "<anonymous>", "(Lqz2/l$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l.c, k10.c0<m.Initialized>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169756f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.InfoPage O(k10.c0 c0Var, m.Initialized initialized) {
            return new m.InfoPage(((m.Initialized) c0Var.a()).getQualifiedSignatureInfo());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f169756f;
            uq.b.e();
            if (this.f169755e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qz2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(c0Var, (m.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l.c cVar, k10.c0<m.Initialized> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f169756f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqz2/l$a;", "<unused var>", "Lk10/c0;", "Lqz2/m$b;", "state", "Lk10/l;", "Lqz2/m;", "<anonymous>", "(Lqz2/l$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<l.a, k10.c0<m.InfoPage>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169758f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.Initialized O(k10.c0 c0Var, m.InfoPage infoPage) {
            return new m.Initialized(((m.InfoPage) c0Var.a()).getQualifiedSignatureInfo());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f169758f;
            uq.b.e();
            if (this.f169757e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qz2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(c0Var, (m.InfoPage) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l.a aVar, k10.c0<m.InfoPage> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            f fVar = new f(eVar);
            fVar.f169758f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqz2/l$e;", "<unused var>", "Lk10/c0;", "Lqz2/m$a;", "state", "Lk10/l;", "Lqz2/m;", "<anonymous>", "(Lqz2/l$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<l.e, k10.c0<m.Error>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169760f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.c O(m.Error error) {
            return m.c.f169704a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f169760f;
            uq.b.e();
            if (this.f169759e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qz2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((m.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l.e eVar, k10.c0<m.Error> c0Var, tq.e<? super k10.l<? extends m>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f169760f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, sz2.c cVar, kk0.e eVar, hb4.d dVar, sz2.b bVar, ac4.a aVar2) {
        this.mapper = cVar;
        this.beGetQualifiedSignatureInfoUC = eVar;
        this.errorVMSFactory = dVar;
        this.qualifiedSignatureErrorMapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        m.c cVar2 = m.c.f169704a;
        this.initialState = cVar2;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: qz2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.v9(this.f169719a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(k10.z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(l.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b s9(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
        return this.qualifiedSignatureErrorMapper.b(new sz2.b.Params(bVar, aVar2, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a t9(m state) {
        return this.mapper.b(new sz2.c.Params(state, b9(l.b.f169696a), b9(l.a.f169695a), b9(l.f.f169701a), b9(l.c.f169697a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(m.class), new er.l() { // from class: qz2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f169720a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.c.class), new er.l() { // from class: qz2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f169721a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.Initialized.class), new er.l() { // from class: qz2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f169722a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.InfoPage.class), new er.l() { // from class: qz2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9((k10.z) obj);
            }
        });
        vVar.c(q0.c(m.Error.class), new er.l() { // from class: qz2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(l.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(u uVar, k10.z zVar) {
        zVar.A(uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l.f.class), oVar, dVar);
        zVar.v(q0.c(l.c.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(l.a.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m, l> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
