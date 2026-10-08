package tz2;

import fr.q0;
import jk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequest;
import jk0.QualifiedSignatureInfo;
import jk0.QualifiedSignatureProviderEntryResponse;
import jk0.QualifiedSignatureProviderMobile;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B{\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J/\u0010*\u001a\u00020)*\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020&2\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030]8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010j¨\u0006l"}, d2 = {"Ltz2/t;", "Ll00/g;", "Ltz2/j;", "Ltz2/i;", "Ltz2/k;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lvz2/e;", "mapper", "Lhb4/d;", "errorVMSFactory", "La14/w;", "openUrlIntentUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "snackBarManagerStateHolder", "Lvz2/b;", "dialogMapper", "Lkk0/d;", "beGenerateProviderEntryUrlUC", "La14/p;", "goToNotificationSettingsUseCase", "La14/y;", "requestPermissionUseCase", "Lho2/a;", "getSystemNotificationsStatusUseCase", "Lxy2/a;", "notificationsInteractor", "Ljk0/m;", "qualifiedSignatureInfo", "<init>", "(Lyy/a;Lvz2/e;Lhb4/d;La14/w;Lib4/c;Lac4/a;Li70/n;Lvz2/b;Lkk0/d;La14/p;La14/y;Lho2/a;Lxy2/a;Ljk0/m;)V", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "B9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "state", "Ltz2/k$a;", "D9", "(Ltz2/j;)Ltz2/k$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lvz2/e;", "c", "Lhb4/d;", "d", "La14/w;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Li70/n;", "h", "Lvz2/b;", "j", "Lkk0/d;", "k", "La14/p;", "l", "La14/y;", "m", "Lho2/a;", "n", "Lxy2/a;", "p", "Ljk0/m;", "getQualifiedSignatureInfo", "()Ljk0/m;", "Lxw/b;", "Ltz2/i$c;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Ltz2/j$c;", "r", "Ltz2/j$c;", "initialState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<tz2.j, tz2.i> implements tz2.k, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vz2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vz2.b dialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final kk0.d beGenerateProviderEntryUrlUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.p goToNotificationSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ho2.a getSystemNotificationsStatusUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xy2.a notificationsInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final QualifiedSignatureInfo qualifiedSignatureInfo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<tz2.i.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final tz2.j.Initialized initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<tz2.j, tz2.i> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<tz2.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<tz2.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f192833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f192834b;

        /* JADX INFO: renamed from: tz2.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5043a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f192835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f192836b;

            /* JADX INFO: renamed from: tz2.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5044a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f192837d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f192838e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f192839f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f192841h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f192842j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f192843k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f192844l;

                public C5044a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f192837d = obj;
                    this.f192838e |= PKIFailureInfo.systemUnavail;
                    return C5043a.this.F(null, this);
                }
            }

            public C5043a(mu.h hVar, t tVar) {
                this.f192835a = hVar;
                this.f192836b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5044a c5044a;
                if (eVar instanceof C5044a) {
                    c5044a = (C5044a) eVar;
                    int i15 = c5044a.f192838e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5044a.f192838e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5044a = new C5044a(eVar);
                    }
                } else {
                    c5044a = new C5044a(eVar);
                }
                Object obj2 = c5044a.f192837d;
                Object objE = uq.b.e();
                int i16 = c5044a.f192838e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f192835a;
                    tz2.k.a aVarD9 = this.f192836b.D9((tz2.j) obj);
                    c5044a.f192839f = vq.j.a(obj);
                    c5044a.f192841h = vq.j.a(c5044a);
                    c5044a.f192842j = vq.j.a(obj);
                    c5044a.f192843k = vq.j.a(hVar);
                    c5044a.f192844l = 0;
                    c5044a.f192838e = 1;
                    if (hVar.F(aVarD9, c5044a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f192833a = gVar;
            this.f192834b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super tz2.k.a> hVar, tq.e eVar) {
            Object objA = this.f192833a.a(new C5043a(hVar, this.f192834b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltz2/i$a;", "<unused var>", "Ltz2/j$c;", "Loq/i0;", "<anonymous>", "(Ltz2/i$a;Ltz2/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<tz2.i.a, tz2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192845e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192845e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<tz2.i.c> bVarY1 = t.this.Y1();
                tz2.i.c.a aVar = tz2.i.c.a.f192785a;
                this.f192845e = 1;
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
        public final Object w(tz2.i.a aVar, tz2.j.Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltz2/i$d;", "action", "Lk10/c0;", "Ltz2/j$c;", "state", "Lk10/l;", "Ltz2/j;", "<anonymous>", "(Ltz2/i$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<tz2.i.OnProviderSelected, k10.c0<tz2.j.Initialized>, tq.e<? super k10.l<? extends tz2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192849g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tz2.j.GenerateProviderEntry Y(k10.c0 c0Var, tz2.i.OnProviderSelected onProviderSelected, tz2.j.Initialized initialized) {
            return new tz2.j.GenerateProviderEntry(((tz2.j.Initialized) c0Var.a()).getQualifiedSignatureInfo(), onProviderSelected.getProvider().getId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z() {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 a0() {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tz2.j.GenerateProviderEntry b0(k10.c0 c0Var, tz2.i.OnProviderSelected onProviderSelected, tz2.j.Initialized initialized) {
            return new tz2.j.GenerateProviderEntry(((tz2.j.Initialized) c0Var.a()).getQualifiedSignatureInfo(), onProviderSelected.getProvider().getId());
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0099  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            if (r9.a(r8) == r2) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tz2.t.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object w(tz2.i.OnProviderSelected onProviderSelected, k10.c0<tz2.j.Initialized> c0Var, tq.e<? super k10.l<? extends tz2.j>> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f192848f = onProviderSelected;
            cVar.f192849g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltz2/i$e;", "<unused var>", "Ltz2/j$c;", "Loq/i0;", "<anonymous>", "(Ltz2/i$e;Ltz2/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<tz2.i.e, tz2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192851e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192851e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.p pVar = t.this.goToNotificationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f192851e = 1;
                if (pVar.c(c1792a, this) == objE) {
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
        public final Object w(tz2.i.e eVar, tz2.j.Initialized initialized, tq.e<? super i0> eVar2) {
            return t.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltz2/i$h;", "action", "Ltz2/j$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ltz2/i$h;Ltz2/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<tz2.i.ShowDialog, tz2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192854f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tz2.i.ShowDialog showDialog = (tz2.i.ShowDialog) this.f192854f;
            Object objE = uq.b.e();
            int i15 = this.f192853e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<tz2.i.c> bVarY1 = t.this.Y1();
                tz2.i.c.ShowNavigationDialog showNavigationDialog = new tz2.i.c.ShowNavigationDialog(t.this.dialogMapper.b(showDialog.getDialogType()));
                this.f192854f = vq.j.a(showDialog);
                this.f192853e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(tz2.i.ShowDialog showDialog, tz2.j.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f192854f = showDialog;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ltz2/j$b;", "state", "Lk10/l;", "Ltz2/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<tz2.j.GenerateProviderEntry>, tq.e<? super k10.l<? extends tz2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192857f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ltz2/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends tz2.j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f192859e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f192860f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<tz2.j.GenerateProviderEntry> f192861g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, k10.c0<tz2.j.GenerateProviderEntry> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f192860f = tVar;
                this.f192861g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final tz2.j.Error X(k10.c0 c0Var, t tVar, dx.b bVar, tz2.j.GenerateProviderEntry generateProviderEntry) {
                return new tz2.j.Error(((tz2.j.GenerateProviderEntry) c0Var.a()).getQualifiedSignatureInfo(), ((tz2.j.GenerateProviderEntry) c0Var.a()).getProviderId(), tVar.errorVMSFactory.a(tVar.B9(bVar, tVar.b9(tz2.i.g.f192791a), tVar.b9(tz2.i.a.f192783a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final tz2.j.RedirectionToProvider Y(k10.c0 c0Var, QualifiedSignatureProviderEntryResponse qualifiedSignatureProviderEntryResponse, tz2.j.GenerateProviderEntry generateProviderEntry) {
                return new tz2.j.RedirectionToProvider(((tz2.j.GenerateProviderEntry) c0Var.a()).getQualifiedSignatureInfo(), qualifiedSignatureProviderEntryResponse.getProviderEntryUrl());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f192859e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    kk0.d dVar = this.f192860f.beGenerateProviderEntryUrlUC;
                    kk0.d.Params params = new kk0.d.Params(new ExternalQualifiedSignatureGenerateProviderEntryUrlRequest(this.f192861g.a().getProviderId()));
                    this.f192859e = 1;
                    obj = dVar.c(params, this);
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
                final k10.c0<tz2.j.GenerateProviderEntry> c0Var = this.f192861g;
                final t tVar = this.f192860f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: tz2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.f.a.X(c0Var, tVar, bVar, (j.GenerateProviderEntry) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final QualifiedSignatureProviderEntryResponse qualifiedSignatureProviderEntryResponse = (QualifiedSignatureProviderEntryResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: tz2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.f.a.Y(c0Var, qualifiedSignatureProviderEntryResponse, (j.GenerateProviderEntry) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f192860f, this.f192861g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends tz2.j>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192857f;
            Object objE = uq.b.e();
            int i15 = this.f192856e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f192857f = vq.j.a(c0Var);
            this.f192856e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<tz2.j.GenerateProviderEntry> c0Var, tq.e<? super k10.l<? extends tz2.j>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f192857f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltz2/j$d;", "state", "Loq/i0;", "<anonymous>", "(Ltz2/j$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<tz2.j.RedirectionToProvider, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192863f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tz2.j.RedirectionToProvider redirectionToProvider = (tz2.j.RedirectionToProvider) this.f192863f;
            uq.b.e();
            if (this.f192862e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new tz2.i.ShowDialog(new vz2.c.ToProvider(t.this.b9(new tz2.i.OpenUrl(redirectionToProvider.getProviderEntryUrl())), t.this.b9(tz2.i.a.f192783a))));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(tz2.j.RedirectionToProvider redirectionToProvider, tq.e<? super i0> eVar) {
            return ((g) v(redirectionToProvider, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f192863f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltz2/i$h;", "action", "Ltz2/j$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ltz2/i$h;Ltz2/j$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<tz2.i.ShowDialog, tz2.j.RedirectionToProvider, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192866f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tz2.i.ShowDialog showDialog = (tz2.i.ShowDialog) this.f192866f;
            Object objE = uq.b.e();
            int i15 = this.f192865e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<tz2.i.c> bVarY1 = t.this.Y1();
                tz2.i.c.ShowNavigationDialog showNavigationDialog = new tz2.i.c.ShowNavigationDialog(t.this.dialogMapper.b(showDialog.getDialogType()));
                this.f192866f = vq.j.a(showDialog);
                this.f192865e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(tz2.i.ShowDialog showDialog, tz2.j.RedirectionToProvider redirectionToProvider, tq.e<? super i0> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f192866f = showDialog;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltz2/i$f;", "<unused var>", "Ltz2/j$d;", "state", "Loq/i0;", "<anonymous>", "(Ltz2/i$f;Ltz2/j$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<tz2.i.OpenUrl, tz2.j.RedirectionToProvider, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192869f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tz2.j.RedirectionToProvider redirectionToProvider = (tz2.j.RedirectionToProvider) this.f192869f;
            Object objE = uq.b.e();
            int i15 = this.f192868e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = t.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(redirectionToProvider.getProviderEntryUrl(), false, 2, null);
                this.f192869f = vq.j.a(redirectionToProvider);
                this.f192868e = 1;
                obj = wVar.c(params, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            t.this.d9(tz2.i.b.f192784a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(tz2.i.OpenUrl openUrl, tz2.j.RedirectionToProvider redirectionToProvider, tq.e<? super i0> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f192869f = redirectionToProvider;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltz2/i$a;", "<unused var>", "Lk10/c0;", "Ltz2/j$d;", "state", "Lk10/l;", "Ltz2/j;", "<anonymous>", "(Ltz2/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<tz2.i.a, k10.c0<tz2.j.RedirectionToProvider>, tq.e<? super k10.l<? extends tz2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192872f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tz2.j.Initialized O(k10.c0 c0Var, tz2.j.RedirectionToProvider redirectionToProvider) {
            return new tz2.j.Initialized(((tz2.j.RedirectionToProvider) c0Var.a()).getQualifiedSignatureInfo());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f192872f;
            uq.b.e();
            if (this.f192871e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: tz2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.j.O(c0Var, (j.RedirectionToProvider) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(tz2.i.a aVar, k10.c0<tz2.j.RedirectionToProvider> c0Var, tq.e<? super k10.l<? extends tz2.j>> eVar) {
            j jVar = new j(eVar);
            jVar.f192872f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltz2/i$b;", "<unused var>", "Ltz2/j$d;", "Loq/i0;", "<anonymous>", "(Ltz2/i$b;Ltz2/j$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<tz2.i.b, tz2.j.RedirectionToProvider, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192873e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192873e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<tz2.i.c> bVarY1 = t.this.Y1();
                tz2.i.c.b bVar = tz2.i.c.b.f192786a;
                this.f192873e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(tz2.i.b bVar, tz2.j.RedirectionToProvider redirectionToProvider, tq.e<? super i0> eVar) {
            return t.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltz2/i$g;", "<unused var>", "Lk10/c0;", "Ltz2/j$a;", "state", "Lk10/l;", "Ltz2/j;", "<anonymous>", "(Ltz2/i$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<tz2.i.g, k10.c0<tz2.j.Error>, tq.e<? super k10.l<? extends tz2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192876f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tz2.j.GenerateProviderEntry O(k10.c0 c0Var, tz2.j.Error error) {
            return new tz2.j.GenerateProviderEntry(((tz2.j.Error) c0Var.a()).getQualifiedSignatureInfo(), ((tz2.j.Error) c0Var.a()).getProviderId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f192876f;
            uq.b.e();
            if (this.f192875e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: tz2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.l.O(c0Var, (j.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(tz2.i.g gVar, k10.c0<tz2.j.Error> c0Var, tq.e<? super k10.l<? extends tz2.j>> eVar) {
            l lVar = new l(eVar);
            lVar.f192876f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltz2/i$a;", "<unused var>", "Lk10/c0;", "Ltz2/j$a;", "state", "Lk10/l;", "Ltz2/j;", "<anonymous>", "(Ltz2/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<tz2.i.a, k10.c0<tz2.j.Error>, tq.e<? super k10.l<? extends tz2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192878f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tz2.j.Initialized O(k10.c0 c0Var, tz2.j.Error error) {
            return new tz2.j.Initialized(((tz2.j.Error) c0Var.a()).getQualifiedSignatureInfo());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f192878f;
            uq.b.e();
            if (this.f192877e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: tz2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.m.O(c0Var, (j.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(tz2.i.a aVar, k10.c0<tz2.j.Error> c0Var, tq.e<? super k10.l<? extends tz2.j>> eVar) {
            m mVar = new m(eVar);
            mVar.f192878f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, vz2.e eVar, hb4.d dVar, a14.w wVar, ib4.c cVar, ac4.a aVar2, i70.n nVar, vz2.b bVar, kk0.d dVar2, a14.p pVar, a14.y yVar, ho2.a aVar3, xy2.a aVar4, QualifiedSignatureInfo qualifiedSignatureInfo) {
        this.mapper = eVar;
        this.errorVMSFactory = dVar;
        this.openUrlIntentUseCase = wVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.snackBarManagerStateHolder = nVar;
        this.dialogMapper = bVar;
        this.beGenerateProviderEntryUrlUC = dVar2;
        this.goToNotificationSettingsUseCase = pVar;
        this.requestPermissionUseCase = yVar;
        this.getSystemNotificationsStatusUseCase = aVar3;
        this.notificationsInteractor = aVar4;
        this.qualifiedSignatureInfo = qualifiedSignatureInfo;
        tz2.j.Initialized initialized = new tz2.j.Initialized(qualifiedSignatureInfo);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: tz2.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f192815a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), D9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: tz2.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                aVar.a();
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                aVar2.a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tz2.k.a D9(tz2.j state) {
        return this.mapper.b(new vz2.e.Params(state, b9(tz2.i.a.f192783a), new er.l() { // from class: tz2.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f192808a, (QualifiedSignatureProviderMobile) obj);
            }
        }, new er.l() { // from class: tz2.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f192809a, (vz2.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(t tVar, QualifiedSignatureProviderMobile qualifiedSignatureProviderMobile) {
        tVar.d9(new tz2.i.OnProviderSelected(qualifiedSignatureProviderMobile));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(t tVar, vz2.c cVar) {
        tVar.d9(new tz2.i.ShowDialog(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(tz2.j.Initialized.class), new er.l() { // from class: tz2.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.I9(this.f192810a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(tz2.j.GenerateProviderEntry.class), new er.l() { // from class: tz2.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(this.f192811a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(tz2.j.RedirectionToProvider.class), new er.l() { // from class: tz2.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(this.f192812a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(tz2.j.Error.class), new er.l() { // from class: tz2.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.L9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(tz2.i.a.class), oVar, bVar);
        zVar.v(q0.c(tz2.i.OnProviderSelected.class), oVar, tVar.new c(null));
        zVar.x(q0.c(tz2.i.e.class), oVar, tVar.new d(null));
        zVar.x(q0.c(tz2.i.ShowDialog.class), oVar, tVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(t tVar, k10.z zVar) {
        zVar.A(tVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(t tVar, k10.z zVar) {
        zVar.C(tVar.new g(null));
        h hVar = tVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(tz2.i.ShowDialog.class), oVar, hVar);
        zVar.x(q0.c(tz2.i.OpenUrl.class), oVar, tVar.new i(null));
        zVar.v(q0.c(tz2.i.a.class), oVar, new j(null));
        zVar.x(q0.c(tz2.i.b.class), oVar, tVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(tz2.i.g.class), oVar, lVar);
        zVar.v(q0.c(tz2.i.a.class), oVar, new m(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(QualifiedSignatureInfo qualifiedSignatureInfo) {
        super.P5(qualifiedSignatureInfo);
    }

    @Override // zx.b
    public xw.b<tz2.i.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<tz2.j, tz2.i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<tz2.k.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
