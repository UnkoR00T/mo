package gh3;

import fr.q0;
import jb4.PayloadErrorData;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001iBq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010.\u001a\u00020-2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\u000207*\u00020\u0002H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u0004\u0018\u00010;*\u00020:H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR&\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030V8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010&\u001a\b\u0012\u0004\u0012\u0002070c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lgh3/c0;", "Ll00/g;", "Lgh3/c;", "Lgh3/a;", "Lgh3/e;", "", "Lyy/a;", "stateMachineFactory", "La14/x;", "requestCameraPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lae3/d0;", "validQrCodeUseCase", "Law0/z;", "joinToCollisionUseCase", "Lmx/c;", "labelProvider", "Lih3/f;", "screenMapper", "Lib4/c;", "domainErrorMapper", "Lsz/d;", "cameraScannerPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "Lhh3/a;", "contract", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;La14/x;La14/m;Lae3/d0;Law0/z;Lmx/c;Lih3/f;Lib4/c;Lsz/d;Lac4/r;Lhh3/a;Lhb4/d;)V", "Lhz/b;", "R9", "(Ljava/lang/String;)Lhz/b;", "Lk10/c0;", "Lgh3/c$a$a;", "state", "code", "", "isFromQrScan", "Lk10/l;", "C9", "(Lk10/c0;Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "Lgh3/a$l;", "action", "K9", "(Lgh3/a$l;Lk10/c0;)Lk10/l;", "Lhb4/c;", "y9", "(Lgh3/a$l;)Lhb4/c;", "Ldx/b$c;", "I9", "()Ldx/b$c;", "Lgh3/e$a;", "E9", "(Lgh3/c;)Lgh3/e$a;", "Ldx/b;", "Ljb4/f;", "B9", "(Ldx/b;)Ljb4/f;", "b", "La14/x;", "c", "La14/m;", "d", "Lae3/d0;", "e", "Law0/z;", "f", "Lmx/c;", "g", "Lih3/f;", "h", "Lib4/c;", "j", "Lac4/r;", "k", "Lhh3/a;", "l", "Lhb4/d;", "Lgh3/c$a$b;", "m", "Lgh3/c$a$b;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lgh3/a$d;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "r", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<gh3.c, a> implements gh3.e, zx.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f73062s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ae3.d0 validQrCodeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aw0.z joinToCollisionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ih3.f screenMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hh3.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final gh3.c.a.Scanner initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gh3.c, a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.d> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<gh3.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73078a;

        static {
            int[] iArr = new int[sv0.o.values().length];
            try {
                iArr[sv0.o.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sv0.o.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73078a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f73079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f73080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f73081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f73082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f73083h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f73084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f73085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f73086l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73088n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f73086l = obj;
            this.f73088n |= PKIFailureInfo.systemUnavail;
            return c0.this.C9(null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<gh3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f73089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f73090b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f73091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f73092b;

            /* JADX INFO: renamed from: gh3.c0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1674a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73093d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73094e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f73095f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f73097h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f73098j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f73099k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f73100l;

                public C1674a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f73093d = obj;
                    this.f73094e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f73091a = hVar;
                this.f73092b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1674a c1674a;
                if (eVar instanceof C1674a) {
                    c1674a = (C1674a) eVar;
                    int i15 = c1674a.f73094e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1674a.f73094e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1674a = new C1674a(eVar);
                    }
                } else {
                    c1674a = new C1674a(eVar);
                }
                Object obj2 = c1674a.f73093d;
                Object objE = uq.b.e();
                int i16 = c1674a.f73094e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f73091a;
                    gh3.e.a aVarE9 = this.f73092b.E9((gh3.c) obj);
                    c1674a.f73095f = vq.j.a(obj);
                    c1674a.f73097h = vq.j.a(c1674a);
                    c1674a.f73098j = vq.j.a(obj);
                    c1674a.f73099k = vq.j.a(hVar);
                    c1674a.f73100l = 0;
                    c1674a.f73094e = 1;
                    if (hVar.F(aVarE9, c1674a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public d(mu.g gVar, c0 c0Var) {
            this.f73089a = gVar;
            this.f73090b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gh3.e.a> hVar, tq.e eVar) {
            Object objA = this.f73089a.a(new a(hVar, this.f73090b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgh3/a$d;", "action", "Lgh3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgh3/a$d;Lgh3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.d, gh3.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73102f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.d dVar = (a.d) this.f73102f;
            Object objE = uq.b.e();
            int i15 = this.f73101e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                this.f73102f = vq.j.a(dVar);
                this.f73101e = 1;
                if (c0Var.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, gh3.c cVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = c0.this.new e(eVar);
            eVar2.f73102f = dVar;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgh3/a$g;", "<unused var>", "Lgh3/c;", "Loq/i0;", "<anonymous>", "(Lgh3/a$g;Lgh3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.g, gh3.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73104e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73104e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                a.d.C1671d c1671d = a.d.C1671d.f73029a;
                this.f73104e = 1;
                if (c0Var.F(c1671d, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.g gVar, gh3.c cVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgh3/a$a;", "<unused var>", "Lgh3/c;", "Loq/i0;", "<anonymous>", "(Lgh3/a$a;Lgh3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.C1669a, gh3.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73106e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73106e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                a.d.C1670a c1670a = a.d.C1670a.f73026a;
                this.f73106e = 1;
                if (c0Var.F(c1670a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C1669a c1669a, gh3.c cVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$k;", "<unused var>", "Lk10/c0;", "Lgh3/c$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.k, k10.c0<gh3.c.Error>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73109f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(k10.c0 c0Var, gh3.c.Error error) {
            return new gh3.c.a.Scanner(((gh3.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f73109f;
            uq.b.e();
            if (this.f73108e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gh3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.h.O(c0Var, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.k kVar, k10.c0<gh3.c.Error> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f73109f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$c;", "<unused var>", "Lk10/c0;", "Lgh3/c$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.JoinToCollision, k10.c0<gh3.c.Error>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73111f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.JoiningCollision O(k10.c0 c0Var, gh3.c.Error error) {
            return new gh3.c.a.JoiningCollision(((gh3.c.Error) c0Var.a()).getData(), error.getIsFromQrScan());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f73111f;
            uq.b.e();
            if (this.f73110e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gh3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.i.O(c0Var, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.JoinToCollision joinToCollision, k10.c0<gh3.c.Error> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            i iVar = new i(eVar);
            iVar.f73111f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgh3/c$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lgh3/c$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<gh3.c.a.JoiningCollision, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73113f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gh3.c.a.JoiningCollision joiningCollision = (gh3.c.a.JoiningCollision) this.f73113f;
            uq.b.e();
            if (this.f73112e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.d9(new a.JoinToCollision(joiningCollision.getData().getCode(), joiningCollision.getIsFromQrScan()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(gh3.c.a.JoiningCollision joiningCollision, tq.e<? super oq.i0> eVar) {
            return ((j) v(joiningCollision, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = c0.this.new j(eVar);
            jVar.f73113f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$l;", "action", "Lk10/c0;", "Lgh3/c$a$a;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.ShowError, k10.c0<gh3.c.a.JoiningCollision>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73117g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowError showError = (a.ShowError) this.f73116f;
            k10.c0 c0Var = (k10.c0) this.f73117g;
            uq.b.e();
            if (this.f73115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0.this.K9(showError, c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowError showError, k10.c0<gh3.c.a.JoiningCollision> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f73116f = showError;
            kVar.f73117g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$c;", "action", "Lk10/c0;", "Lgh3/c$a$a;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.JoinToCollision, k10.c0<gh3.c.a.JoiningCollision>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73121g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.JoinToCollision joinToCollision = (a.JoinToCollision) this.f73120f;
            k10.c0 c0Var = (k10.c0) this.f73121g;
            Object objE = uq.b.e();
            int i15 = this.f73119e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            c0 c0Var2 = c0.this;
            String code = joinToCollision.getCode();
            boolean isFromQrScan = joinToCollision.getIsFromQrScan();
            this.f73120f = vq.j.a(joinToCollision);
            this.f73121g = vq.j.a(c0Var);
            this.f73119e = 1;
            Object objC9 = c0Var2.C9(c0Var, code, isFromQrScan, this);
            return objC9 == objE ? objE : objC9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.JoinToCollision joinToCollision, k10.c0<gh3.c.a.JoiningCollision> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f73120f = joinToCollision;
            lVar.f73121g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgh3/a$b;", "<unused var>", "Lgh3/c$a$b;", "Loq/i0;", "<anonymous>", "(Lgh3/a$b;Lgh3/c$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.b, gh3.c.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73123e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f73123e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, gh3.c.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            return c0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgh3/c$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lgh3/c$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<gh3.c.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73125e;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f73125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.d9(a.j.f73036a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(gh3.c.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            return ((n) v(scanner, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c0.this.new n(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$j;", "<unused var>", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.j, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73128f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(u04.c cVar, gh3.c.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, cVar, null, null, 111, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f73128f;
            Object objE = uq.b.e();
            int i15 = this.f73127e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = c0.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f73128f = c0Var;
                this.f73127e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u04.c cVar = (u04.c) obj;
            c0.this.d9(a.i.f73035a);
            return c0Var.b(new er.l() { // from class: gh3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.o.O(cVar, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.j jVar, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            o oVar = c0.this.new o(eVar);
            oVar.f73128f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$m;", "action", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.UpdateCodeBottomSheet, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73132g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(a.UpdateCodeBottomSheet updateCodeBottomSheet, gh3.c.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), updateCodeBottomSheet.getShow(), null, null, false, null, null, null, 126, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.UpdateCodeBottomSheet updateCodeBottomSheet = (a.UpdateCodeBottomSheet) this.f73131f;
            k10.c0 c0Var = (k10.c0) this.f73132g;
            uq.b.e();
            if (this.f73130e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gh3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.p.O(updateCodeBottomSheet, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.UpdateCodeBottomSheet updateCodeBottomSheet, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f73131f = updateCodeBottomSheet;
            pVar.f73132g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$e;", "action", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.OnCodeChange, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73135g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(a.OnCodeChange onCodeChange, gh3.c.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, onCodeChange.getCode(), hz.b.d.f86848c, false, null, null, null, 121, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnCodeChange onCodeChange = (a.OnCodeChange) this.f73134f;
            k10.c0 c0Var = (k10.c0) this.f73135g;
            uq.b.e();
            if (this.f73133e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gh3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.q.O(onCodeChange, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnCodeChange onCodeChange, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            q qVar = new q(eVar);
            qVar.f73134f = onCodeChange;
            qVar.f73135g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$f;", "<unused var>", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.f, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73137f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(gh3.c.a.Scanner scanner, gh3.c.a.Scanner scanner2) {
            return scanner;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f73137f;
            uq.b.e();
            if (this.f73136e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            hz.b bVarR9 = c0.this.R9(((gh3.c.a.Scanner) c0Var.a()).getData().getCode());
            final gh3.c.a.Scanner scannerB = ((gh3.c.a.Scanner) c0Var.a()).b(ContentModelData.b(((gh3.c.a.Scanner) c0Var.a()).getData(), false, null, bVarR9, true, null, null, null, 115, null));
            boolean zA = bVarR9.a();
            if (zA) {
                c0.this.d9(new a.JoinToCollision(((gh3.c.a.Scanner) c0Var.a()).getData().getCode(), false));
                return c0Var.c();
            }
            if (zA) {
                throw new oq.p();
            }
            return c0Var.b(new er.l() { // from class: gh3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.r.O(scannerB, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            r rVar = c0.this.new r(eVar);
            rVar.f73137f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Lgh3/c$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lgh3/c$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, gh3.c.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73140f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f73140f;
            uq.b.e();
            if (this.f73139e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0 c0Var = c0.this;
            if (iVar instanceof dx.i.Right) {
                c0Var.d9(new a.OnScannedQrCode((String) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, gh3.c.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            s sVar = c0.this.new s(eVar);
            sVar.f73140f = iVar;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$h;", "action", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.OnScannedQrCode, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73144g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(a.OnScannedQrCode onScannedQrCode, gh3.c.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, null, null, onScannedQrCode.getCode(), 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnScannedQrCode onScannedQrCode = (a.OnScannedQrCode) this.f73143f;
            k10.c0 c0Var = (k10.c0) this.f73144g;
            uq.b.e();
            if (this.f73142e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(onScannedQrCode.getCode(), ((gh3.c.a.Scanner) c0Var.a()).getData().getLastScannedCode())) {
                return c0Var.c();
            }
            c0.this.d9(new a.JoinToCollision(onScannedQrCode.getCode(), true));
            return c0Var.b(new er.l() { // from class: gh3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.t.O(onScannedQrCode, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnScannedQrCode onScannedQrCode, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            t tVar = c0.this.new t(eVar);
            tVar.f73143f = onScannedQrCode;
            tVar.f73144g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$c;", "action", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.JoinToCollision, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f73148g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.JoiningCollision O(k10.c0 c0Var, a.JoinToCollision joinToCollision, gh3.c.a.Scanner scanner) {
            return new gh3.c.a.JoiningCollision(ContentModelData.b(((gh3.c.a.Scanner) c0Var.a()).getData(), false, joinToCollision.getCode(), null, false, null, null, null, 125, null), joinToCollision.getIsFromQrScan());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.JoinToCollision joinToCollision = (a.JoinToCollision) this.f73147f;
            final k10.c0 c0Var = (k10.c0) this.f73148g;
            uq.b.e();
            if (this.f73146e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gh3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.u.O(c0Var, joinToCollision, (c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.JoinToCollision joinToCollision, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            u uVar = new u(eVar);
            uVar.f73147f = joinToCollision;
            uVar.f73148g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgh3/a$i;", "<unused var>", "Lk10/c0;", "Lgh3/c$a$b;", "state", "Lk10/l;", "Lgh3/c;", "<anonymous>", "(Lgh3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.i, k10.c0<gh3.c.a.Scanner>, tq.e<? super k10.l<? extends gh3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73150f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gh3.c.a.Scanner O(gh3.c.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, null, null, "", 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f73150f;
            uq.b.e();
            if (this.f73149e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gh3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.v.O((c.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.i iVar, k10.c0<gh3.c.a.Scanner> c0Var, tq.e<? super k10.l<? extends gh3.c>> eVar) {
            v vVar = new v(eVar);
            vVar.f73150f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, a14.x xVar, a14.m mVar, ae3.d0 d0Var, aw0.z zVar, mx.c cVar, ih3.f fVar, ib4.c cVar2, sz.d dVar, ac4.r<String> rVar, hh3.a aVar2, hb4.d dVar2) {
        this.requestCameraPermissionUseCase = xVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.validQrCodeUseCase = d0Var;
        this.joinToCollisionUseCase = zVar;
        this.labelProvider = cVar;
        this.screenMapper = fVar;
        this.domainErrorMapper = cVar2;
        this.scanCameraUseCase = rVar;
        this.contract = aVar2;
        this.errorVMSFactory = dVar2;
        gh3.c.a.Scanner scanner = new gh3.c.a.Scanner(new ContentModelData(false, "", hz.b.d.f86848c, false, new u04.c.b(false), dVar, ""));
        this.initialState = scanner;
        this.stateMachine = aVar.a(scanner, new er.l() { // from class: gh3.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.M9(this.f73217a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), E9(scanner));
    }

    private final PayloadErrorData B9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0144  */
    /* JADX WARN: Code duplicated, block: B:40:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0191  */
    /* JADX WARN: Code duplicated, block: B:46:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018e, code lost:
    
        if (F(r6, r3) == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ba, code lost:
    
        if (F(r6, r3) == r4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C9(k10.c0<gh3.c.a.JoiningCollision> r17, java.lang.String r18, boolean r19, tq.e<? super k10.l<? extends gh3.c>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gh3.c0.C9(k10.c0, java.lang.String, boolean, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gh3.c.a.Scanner D9(k10.c0 c0Var, gh3.c.a.JoiningCollision joiningCollision) {
        return new gh3.c.a.Scanner(ContentModelData.b(((gh3.c.a.JoiningCollision) c0Var.a()).getData(), false, "", null, false, null, null, null, 125, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gh3.e.a E9(gh3.c cVar) {
        return this.screenMapper.b(new ih3.f.Params(cVar, new er.a() { // from class: gh3.r
            @Override // er.a
            public final Object a() {
                return c0.F9(this.f73216a);
            }
        }, new er.l() { // from class: gh3.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.G9(this.f73218a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: gh3.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.H9(this.f73219a, (String) obj);
            }
        }, b9(a.f.f73032a), b9(a.b.f73023a), b9(a.g.f73033a), b9(a.d.C1670a.f73026a), b9(a.d.b.f73027a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(c0 c0Var) {
        c0Var.d9(new a.UpdateCodeBottomSheet(true));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(c0 c0Var, boolean z15) {
        c0Var.d9(new a.UpdateCodeBottomSheet(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(c0 c0Var, String str) {
        c0Var.d9(new a.OnCodeChange(str));
        return oq.i0.f148189a;
    }

    private final dx.b.Business I9() {
        mx.c cVar = this.labelProvider;
        return new dx.b.Business(Companion.C1673a.f73077a, dx.b.f.FAILURE, cVar.c(md3.b.f125794o6), cVar.c(md3.b.f125786n6), null, cVar.c(md3.b.f125731h), null, 80, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<gh3.c> K9(final a.ShowError action, final k10.c0<gh3.c.a.JoiningCollision> state) {
        return state.d(new er.l() { // from class: gh3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.L9(state, this, action, (c.a.JoiningCollision) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gh3.c.Error L9(k10.c0 c0Var, c0 c0Var2, a.ShowError showError, gh3.c.a.JoiningCollision joiningCollision) {
        return new gh3.c.Error(((gh3.c.a.JoiningCollision) c0Var.a()).getData(), joiningCollision.getIsFromQrScan(), c0Var2.y9(showError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(final c0 c0Var, k10.v vVar) {
        vVar.c(q0.c(gh3.c.class), new er.l() { // from class: gh3.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.N9(this.f73220a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gh3.c.Error.class), new er.l() { // from class: gh3.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.O9((k10.z) obj);
            }
        });
        vVar.c(q0.c(gh3.c.a.JoiningCollision.class), new er.l() { // from class: gh3.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9(this.f73221a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gh3.c.a.Scanner.class), new er.l() { // from class: gh3.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f73222a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(c0 c0Var, k10.z zVar) {
        e eVar = c0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.d.class), oVar, eVar);
        zVar.x(q0.c(a.g.class), oVar, c0Var.new f(null));
        zVar.x(q0.c(a.C1669a.class), oVar, c0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.k.class), oVar, hVar);
        zVar.v(q0.c(a.JoinToCollision.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(c0 c0Var, k10.z zVar) {
        zVar.C(c0Var.new j(null));
        k kVar = c0Var.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.ShowError.class), oVar, kVar);
        zVar.v(q0.c(a.JoinToCollision.class), oVar, c0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, k10.z zVar) {
        zVar.C(c0Var.new n(null));
        o oVar = c0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.j.class), oVar2, oVar);
        zVar.v(q0.c(a.UpdateCodeBottomSheet.class), oVar2, new p(null));
        zVar.v(q0.c(a.OnCodeChange.class), oVar2, new q(null));
        zVar.v(q0.c(a.f.class), oVar2, c0Var.new r(null));
        k10.k.s(zVar, (mu.g) c0Var.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.QrScanner(null, 1, null), 2, null)), null, c0Var.new s(null), 2, null);
        zVar.v(q0.c(a.OnScannedQrCode.class), oVar2, c0Var.new t(null));
        zVar.v(q0.c(a.JoinToCollision.class), oVar2, new u(null));
        zVar.v(q0.c(a.i.class), oVar2, new v(null));
        zVar.x(q0.c(a.b.class), oVar2, c0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b R9(String str) {
        return hz.b.INSTANCE.a(this.validQrCodeUseCase.b(new ae3.d0.Param(str)));
    }

    private final hb4.c y9(final a.ShowError action) {
        dx.b error = action.getError();
        hb4.d dVar = this.errorVMSFactory;
        ib4.c cVar = this.domainErrorMapper;
        if (error instanceof dx.b.g.Http) {
            PayloadErrorData payloadErrorDataB9 = B9(error);
            if (fr.t.c(payloadErrorDataB9 != null ? payloadErrorDataB9.getCode() : null, "VEHICLE_COLLISION_PROCESS_CODE_INVALID") && action.getIsFromQrScan()) {
                error = I9();
            }
        }
        return dVar.a(cVar.b(new ib4.c.Params(error, false, new er.l() { // from class: gh3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.z9(this.f73052a, action, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(c0 c0Var, a.ShowError showError, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            c0Var.d9(new a.JoinToCollision(showError.getCode(), true));
        } else {
            c0Var.d9(a.k.f73037a);
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hh3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gh3.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gh3.e.a> getState() {
        return this.state;
    }
}
