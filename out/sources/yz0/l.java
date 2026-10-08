package yz0;

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
import tz0.ApplicationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lyz0/l;", "Ll00/g;", "Lyz0/f;", "Lyz0/e;", "Lyz0/g;", "", "Lyy/a;", "stateMachineFactory", "Lc54/b;", "isFeatureEnabledUseCase", "Lzz0/c;", "genericApplicationsScreenMapper", "Lzz0/b;", "errorMapper", "<init>", "(Lyy/a;Lc54/b;Lzz0/c;Lzz0/b;)V", "Ltz0/a;", "applicationData", "La01/a;", "redirection", "Loq/i0;", "o9", "(Ltz0/a;La01/a;)V", "b", "Lc54/b;", "c", "Lzz0/c;", "d", "Lzz0/b;", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lyz0/e$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lyz0/g$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<yz0.f, yz0.e> implements g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zz0.c genericApplicationsScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zz0.b errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<yz0.f, yz0.e> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yz0.e.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state = a9(new a(e9().getState(), this), g.a.b.f230873a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f230888b;

        /* JADX INFO: renamed from: yz0.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6207a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f230890b;

            /* JADX INFO: renamed from: yz0.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6208a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230891d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230892e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230893f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230895h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230896j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230897k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230898l;

                public C6208a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230891d = obj;
                    this.f230892e |= PKIFailureInfo.systemUnavail;
                    return C6207a.this.F(null, this);
                }
            }

            public C6207a(mu.h hVar, l lVar) {
                this.f230889a = hVar;
                this.f230890b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6208a c6208a;
                if (eVar instanceof C6208a) {
                    c6208a = (C6208a) eVar;
                    int i15 = c6208a.f230892e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6208a.f230892e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6208a = new C6208a(eVar);
                    }
                } else {
                    c6208a = new C6208a(eVar);
                }
                Object obj2 = c6208a.f230891d;
                Object objE = uq.b.e();
                int i16 = c6208a.f230892e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f230889a;
                    g.a aVarB = this.f230890b.genericApplicationsScreenMapper.b(new zz0.c.Params((yz0.f) obj, this.f230890b.b9(yz0.e.a.f230857a), this.f230890b.b9(yz0.e.b.f230858a), this.f230890b.b9(yz0.e.f.f230866a)));
                    c6208a.f230893f = vq.j.a(obj);
                    c6208a.f230895h = vq.j.a(c6208a);
                    c6208a.f230896j = vq.j.a(obj);
                    c6208a.f230897k = vq.j.a(hVar);
                    c6208a.f230898l = 0;
                    c6208a.f230892e = 1;
                    if (hVar.F(aVarB, c6208a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f230887a = gVar;
            this.f230888b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a> hVar, tq.e eVar) {
            Object objA = this.f230887a.a(new C6207a(hVar, this.f230888b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyz0/e$a;", "<unused var>", "Lyz0/f;", "Loq/i0;", "<anonymous>", "(Lyz0/e$a;Lyz0/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<yz0.e.a, yz0.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230899e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230899e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<yz0.e.d> bVarY1 = l.this.Y1();
                yz0.e.d.a aVar = yz0.e.d.a.f230861a;
                this.f230899e = 1;
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
        public final Object w(yz0.e.a aVar, yz0.f fVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyz0/e$b;", "<unused var>", "Lyz0/f;", "Loq/i0;", "<anonymous>", "(Lyz0/e$b;Lyz0/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yz0.e.b, yz0.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230901e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230901e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<yz0.e.d> bVarY1 = l.this.Y1();
                yz0.e.d.b bVar = yz0.e.d.b.f230862a;
                this.f230901e = 1;
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
        public final Object w(yz0.e.b bVar, yz0.f fVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyz0/e$c;", "action", "Lyz0/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyz0/e$c;Lyz0/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yz0.e.GenericError, yz0.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230905g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f230906h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f230908a;

            static {
                int[] iArr = new int[a01.a.values().length];
                try {
                    iArr[a01.a.GLOBAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a01.a.LOCAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f230908a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yz0.e eVar;
            yz0.e.GenericError genericError = (yz0.e.GenericError) this.f230906h;
            Object objE = uq.b.e();
            int i15 = this.f230905g;
            if (i15 == 0) {
                u.b(obj);
                zz0.b bVar = l.this.errorMapper;
                dx.b domainError = genericError.getDomainError();
                l lVar = l.this;
                int i16 = a.f230908a[genericError.getRedirection().ordinal()];
                if (i16 == 1) {
                    eVar = yz0.e.b.f230858a;
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    eVar = yz0.e.a.f230857a;
                }
                jb4.b bVarB = bVar.b(new zz0.b.a.GenericError(domainError, lVar.b9(eVar)));
                xw.b<yz0.e.d> bVarY1 = l.this.Y1();
                yz0.e.d.ShowError showError = new yz0.e.d.ShowError(bVarB);
                this.f230906h = vq.j.a(genericError);
                this.f230903e = vq.j.a(bVarB);
                this.f230904f = 0;
                this.f230905g = 1;
                if (bVarY1.F(showError, this) == objE) {
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
        public final Object w(yz0.e.GenericError genericError, yz0.f fVar, tq.e<? super i0> eVar) {
            d dVar = l.this.new d(eVar);
            dVar.f230906h = genericError;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyz0/e$e;", "action", "Lk10/c0;", "Lyz0/f$b;", "state", "Lk10/l;", "Lyz0/f;", "<anonymous>", "(Lyz0/e$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yz0.e.Setup, c0<yz0.f.b>, tq.e<? super k10.l<? extends yz0.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230911g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yz0.f.Ready O(yz0.e.Setup setup, l lVar, yz0.f.b bVar) {
            return new yz0.f.Ready(setup.getApplicationData(), setup.getRedirection(), lVar.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yz0.e.Setup setup = (yz0.e.Setup) this.f230910f;
            c0 c0Var = (c0) this.f230911g;
            uq.b.e();
            if (this.f230909e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final l lVar = l.this;
            return c0Var.d(new er.l() { // from class: yz0.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O(setup, lVar, (f.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yz0.e.Setup setup, c0<yz0.f.b> c0Var, tq.e<? super k10.l<? extends yz0.f>> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f230910f = setup;
            eVar2.f230911g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyz0/e$f;", "<unused var>", "Lk10/c0;", "Lyz0/f$c;", "state", "Lk10/l;", "Lyz0/f;", "<anonymous>", "(Lyz0/e$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yz0.e.f, c0<yz0.f.Ready>, tq.e<? super k10.l<? extends yz0.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f230916h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f230918a;

            static {
                int[] iArr = new int[a01.a.values().length];
                try {
                    iArr[a01.a.GLOBAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a01.a.LOCAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f230918a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yz0.f.a O(yz0.f.Ready ready) {
            return yz0.f.a.f230867a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yz0.e eVar;
            c0 c0Var = (c0) this.f230916h;
            Object objE = uq.b.e();
            int i15 = this.f230915g;
            if (i15 == 0) {
                u.b(obj);
                zz0.b bVar = l.this.errorMapper;
                l lVar = l.this;
                int i16 = a.f230918a[((yz0.f.Ready) c0Var.a()).getRedirection().ordinal()];
                if (i16 == 1) {
                    eVar = yz0.e.b.f230858a;
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    eVar = yz0.e.a.f230857a;
                }
                jb4.b bVarB = bVar.b(new zz0.b.a.SslError(lVar.b9(eVar)));
                xw.b<yz0.e.d> bVarY1 = l.this.Y1();
                yz0.e.d.ShowError showError = new yz0.e.d.ShowError(bVarB);
                this.f230916h = c0Var;
                this.f230913e = vq.j.a(bVarB);
                this.f230914f = 0;
                this.f230915g = 1;
                if (bVarY1.F(showError, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: yz0.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.f.O((f.Ready) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yz0.e.f fVar, c0<yz0.f.Ready> c0Var, tq.e<? super k10.l<? extends yz0.f>> eVar) {
            f fVar2 = l.this.new f(eVar);
            fVar2.f230916h = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, c54.b bVar, zz0.c cVar, zz0.b bVar2) {
        this.isFeatureEnabledUseCase = bVar;
        this.genericApplicationsScreenMapper = cVar;
        this.errorMapper = bVar2;
        this.stateMachine = aVar.a(yz0.f.b.f230868a, new er.l() { // from class: yz0.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f230877a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final l lVar, v vVar) {
        vVar.c(q0.c(yz0.f.class), new er.l() { // from class: yz0.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.r9(this.f230878a, (z) obj);
            }
        });
        vVar.c(q0.c(yz0.f.b.class), new er.l() { // from class: yz0.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.s9(this.f230879a, (z) obj);
            }
        });
        vVar.c(q0.c(yz0.f.Ready.class), new er.l() { // from class: yz0.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.t9(this.f230880a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yz0.e.a.class), oVar, bVar);
        zVar.x(q0.c(yz0.e.b.class), oVar, lVar.new c(null));
        zVar.x(q0.c(yz0.e.GenericError.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(l lVar, z zVar) {
        e eVar = lVar.new e(null);
        zVar.v(q0.c(yz0.e.Setup.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(l lVar, z zVar) {
        f fVar = lVar.new f(null);
        zVar.v(q0.c(yz0.e.f.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yz0.e.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<yz0.f, yz0.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    public void o9(ApplicationData applicationData, a01.a redirection) {
        d9(new yz0.e.Setup(applicationData, redirection));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g.a aVar) {
        super.P5(aVar);
    }
}
