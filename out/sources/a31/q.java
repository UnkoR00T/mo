package a31;

import a14.a0;
import fr.q0;
import java.time.format.DateTimeFormatter;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001iB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\n +*\u0004\u0018\u00010*0*H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020*H\u0082@¢\u0006\u0004\b0\u00101J\u0013\u00104\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030]8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010&\u001a\b\u0012\u0004\u0012\u00020'0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006j"}, d2 = {"La31/q;", "Ll00/g;", "La31/e;", "La31/c;", "La31/f;", "", "Lyy/a;", "stateMachineFactory", "Lb31/a;", "mapper", "Lib4/c;", "errorMapper", "Lb31/b;", "downloadInterruptionDialogMapper", "Lv21/a;", "interactor", "La14/a0;", "saveFileOnDeviceUC", "Lez/a;", "currentTimeProvider", "Laz/d;", "fileConverter", "Lac4/n;", "openUriIntentUseCase", "Lcb4/j;", "dialogVMSFactory", "Lhb4/d;", "errorVMSFactory", "Li70/e;", "globalSnackBarManager", "Laz/f;", "fileManager", "Lmx/c;", "labelProvider", "La31/d;", "setupData", "<init>", "(Lyy/a;Lb31/a;Lib4/c;Lb31/b;Lv21/a;La14/a0;Lez/a;Laz/d;Lac4/n;Lcb4/j;Lhb4/d;Li70/e;Laz/f;Lmx/c;La31/d;)V", "state", "La31/f$a;", "A9", "(La31/e;)La31/f$a;", "", "kotlin.jvm.PlatformType", "z9", "()Ljava/lang/String;", "filePath", "Loq/i0;", "B9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "Ljb4/b;", "C9", "(Ldx/b;)Ljb4/b;", "b", "Lb31/a;", "c", "Lib4/c;", "d", "Lb31/b;", "e", "Lv21/a;", "f", "La14/a0;", "g", "Lez/a;", "h", "Laz/d;", "j", "Lac4/n;", "k", "Lcb4/j;", "l", "Lhb4/d;", "m", "Li70/e;", "n", "Laz/f;", "p", "Lmx/c;", "q", "La31/d;", "La31/e$b;", "r", "La31/e$b;", "initialState", "Lxw/b;", "La31/c$a;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "w", "a", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<a31.e, a31.c> implements a31.f, zx.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final a f2306w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f2307x = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b31.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b31.b downloadInterruptionDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v21.a interactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFileOnDeviceUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a31.e.DownloadingConfirmation initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a31.c.a> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<a31.e, a31.c> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<a31.f.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La31/q$a;", "", "<init>", "()V", "", "CONFIRMATION_FILE_NAME_PREFIX", "Ljava/lang/String;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2328f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2330h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2328f = obj;
            this.f2330h |= PKIFailureInfo.systemUnavail;
            return q.this.B9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<a31.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f2331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f2332b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f2333a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f2334b;

            /* JADX INFO: renamed from: a31.q$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0032a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2335d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f2336e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f2337f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f2339h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f2340j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f2341k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f2342l;

                public C0032a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f2335d = obj;
                    this.f2336e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f2333a = hVar;
                this.f2334b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0032a c0032a;
                if (eVar instanceof C0032a) {
                    c0032a = (C0032a) eVar;
                    int i15 = c0032a.f2336e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0032a.f2336e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0032a = new C0032a(eVar);
                    }
                } else {
                    c0032a = new C0032a(eVar);
                }
                Object obj2 = c0032a.f2335d;
                Object objE = uq.b.e();
                int i16 = c0032a.f2336e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f2333a;
                    a31.f.a aVarA9 = this.f2334b.A9((a31.e) obj);
                    c0032a.f2337f = vq.j.a(obj);
                    c0032a.f2339h = vq.j.a(c0032a);
                    c0032a.f2340j = vq.j.a(obj);
                    c0032a.f2341k = vq.j.a(hVar);
                    c0032a.f2342l = 0;
                    c0032a.f2336e = 1;
                    if (hVar.F(aVarA9, c0032a) == objE) {
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

        public c(mu.g gVar, q qVar) {
            this.f2331a = gVar;
            this.f2332b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a31.f.a> hVar, tq.e eVar) {
            Object objA = this.f2331a.a(new a(hVar, this.f2332b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "La31/e$b;", "state", "Lk10/l;", "La31/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<a31.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends a31.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2346h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f2347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f2348k;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.Error V(q qVar, dx.b bVar, a31.e.DownloadingConfirmation downloadingConfirmation) {
            return new a31.e.Error(downloadingConfirmation.getQueryUuid(), qVar.errorVMSFactory.a(qVar.C9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.DownloadingConfirmation X(String str, a31.e.DownloadingConfirmation downloadingConfirmation) {
            return a31.e.DownloadingConfirmation.b(downloadingConfirmation, null, null, str, 3, null);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        
            if (r10 == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a31.q.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<a31.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends a31.e>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f2348k = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La31/c$c;", "action", "La31/e$b;", "state", "Loq/i0;", "<anonymous>", "(La31/c$c;La31/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a31.c.OnDownloadFinish, a31.e.DownloadingConfirmation, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2352g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a31.c.OnDownloadFinish onDownloadFinish = (a31.c.OnDownloadFinish) this.f2351f;
            a31.e.DownloadingConfirmation downloadingConfirmation = (a31.e.DownloadingConfirmation) this.f2352g;
            Object objE = uq.b.e();
            int i15 = this.f2350e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (downloadingConfirmation.getDialogVMSAdapter() == null) {
                    q qVar = q.this;
                    String filePath = onDownloadFinish.getFilePath();
                    this.f2351f = vq.j.a(onDownloadFinish);
                    this.f2352g = vq.j.a(downloadingConfirmation);
                    this.f2350e = 1;
                    if (qVar.B9(filePath, this) == objE) {
                        return objE;
                    }
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
        public final Object w(a31.c.OnDownloadFinish onDownloadFinish, a31.e.DownloadingConfirmation downloadingConfirmation, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f2351f = onDownloadFinish;
            eVar2.f2352g = downloadingConfirmation;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La31/c$b;", "<unused var>", "Lk10/c0;", "La31/e$b;", "state", "Lk10/l;", "La31/e;", "<anonymous>", "(La31/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a31.c.b, c0<a31.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends a31.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2355f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.DownloadingConfirmation O(q qVar, a31.e.DownloadingConfirmation downloadingConfirmation) {
            return a31.e.DownloadingConfirmation.b(downloadingConfirmation, null, qVar.dialogVMSFactory.a(qVar.downloadInterruptionDialogMapper.b(new b31.b.Params(qVar.b9(a31.a.f2276a), qVar.b9(a31.b.f2277a)))), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2355f;
            uq.b.e();
            if (this.f2354e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: a31.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(qVar, (e.DownloadingConfirmation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a31.c.b bVar, c0<a31.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends a31.e>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f2355f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La31/a;", "<unused var>", "Lk10/c0;", "La31/e$b;", "state", "Lk10/l;", "La31/e;", "<anonymous>", "(La31/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a31.a, c0<a31.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends a31.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2360h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f2361j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f2362k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f2363l;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.DownloadingConfirmation O(a31.e.DownloadingConfirmation downloadingConfirmation) {
            return a31.e.DownloadingConfirmation.b(downloadingConfirmation, null, null, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2363l;
            Object objE = uq.b.e();
            int i15 = this.f2362k;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f2357e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: a31.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O((e.DownloadingConfirmation) obj2);
                }
            });
            q qVar = q.this;
            String filePath = ((a31.e.DownloadingConfirmation) c0Var.a()).getFilePath();
            if (filePath != null) {
                this.f2363l = vq.j.a(c0Var);
                this.f2357e = lVarB;
                this.f2358f = vq.j.a(lVarB);
                this.f2359g = vq.j.a(filePath);
                this.f2360h = 0;
                this.f2361j = 0;
                this.f2362k = 1;
                if (qVar.B9(filePath, this) == objE) {
                    return objE;
                }
            }
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a31.a aVar, c0<a31.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends a31.e>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f2363l = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La31/b;", "<unused var>", "Lk10/c0;", "La31/e$b;", "state", "Lk10/l;", "La31/e;", "<anonymous>", "(La31/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a31.b, c0<a31.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends a31.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2366f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.DownloadInterrupted O(a31.e.DownloadingConfirmation downloadingConfirmation) {
            return new a31.e.DownloadInterrupted(downloadingConfirmation.getFilePath());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2366f;
            uq.b.e();
            if (this.f2365e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a31.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.O((e.DownloadingConfirmation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a31.b bVar, c0<a31.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends a31.e>> eVar) {
            h hVar = new h(eVar);
            hVar.f2366f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La31/e$a;", "state", "Loq/i0;", "<anonymous>", "(La31/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<a31.e.DownloadInterrupted, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f2370h;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (r8 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (r8.F(r2, r7) == r1) goto L18;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f2370h
                a31.e$a r0 = (a31.e.DownloadInterrupted) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f2369g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L6a
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r2 = r7.f2367e
                java.lang.String r2 = (java.lang.String) r2
                oq.u.b(r8)
                goto L52
            L26:
                oq.u.b(r8)
                java.lang.String r8 = r0.getFilePath()
                if (r8 == 0) goto L54
                a31.q r2 = a31.q.this
                az.f r2 = a31.q.q9(r2)
                az.g$b r5 = new az.g$b
                r5.<init>(r8)
                java.lang.Object r6 = vq.j.a(r0)
                r7.f2370h = r6
                java.lang.Object r8 = vq.j.a(r8)
                r7.f2367e = r8
                r8 = 0
                r7.f2368f = r8
                r7.f2369g = r4
                java.lang.Object r8 = r2.e(r5, r7)
                if (r8 != r1) goto L52
                goto L69
            L52:
                dx.i r8 = (dx.i) r8
            L54:
                a31.q r8 = a31.q.this
                a31.c$a$a r2 = a31.c.a.C0029a.f2278a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f2370h = r0
                r0 = 0
                r7.f2367e = r0
                r7.f2369g = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto L6a
            L69:
                return r1
            L6a:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a31.q.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a31.e.DownloadInterrupted downloadInterrupted, tq.e<? super i0> eVar) {
            return ((i) v(downloadInterrupted, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f2370h = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La31/c$d;", "<unused var>", "Lk10/c0;", "La31/e$c;", "state", "Lk10/l;", "La31/e;", "<anonymous>", "(La31/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a31.c.d, c0<a31.e.Error>, tq.e<? super k10.l<? extends a31.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2373f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a31.e.DownloadingConfirmation O(a31.e.Error error) {
            return new a31.e.DownloadingConfirmation(error.getQueryUuid(), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2373f;
            uq.b.e();
            if (this.f2372e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a31.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O((e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a31.c.d dVar, c0<a31.e.Error> c0Var, tq.e<? super k10.l<? extends a31.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f2373f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La31/c$b;", "<unused var>", "La31/e$c;", "Loq/i0;", "<anonymous>", "(La31/c$b;La31/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a31.c.b, a31.e.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2374e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2374e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                a31.c.a.C0029a c0029a = a31.c.a.C0029a.f2278a;
                this.f2374e = 1;
                if (qVar.F(c0029a, this) == objE) {
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
        public final Object w(a31.c.b bVar, a31.e.Error error, tq.e<? super i0> eVar) {
            return q.this.new k(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, b31.a aVar2, ib4.c cVar, b31.b bVar, v21.a aVar3, a0 a0Var, ez.a aVar4, az.d dVar, ac4.n nVar, cb4.j jVar, hb4.d dVar2, i70.e eVar, az.f fVar, mx.c cVar2, SetupData setupData) {
        this.mapper = aVar2;
        this.errorMapper = cVar;
        this.downloadInterruptionDialogMapper = bVar;
        this.interactor = aVar3;
        this.saveFileOnDeviceUC = a0Var;
        this.currentTimeProvider = aVar4;
        this.fileConverter = dVar;
        this.openUriIntentUseCase = nVar;
        this.dialogVMSFactory = jVar;
        this.errorVMSFactory = dVar2;
        this.globalSnackBarManager = eVar;
        this.fileManager = fVar;
        this.labelProvider = cVar2;
        this.setupData = setupData;
        a31.e.DownloadingConfirmation downloadingConfirmation = new a31.e.DownloadingConfirmation(setupData.getQueryUuid(), null, null, 6, null);
        this.initialState = downloadingConfirmation;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(downloadingConfirmation, new er.l() { // from class: a31.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9(this.f2305a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), A9(downloadingConfirmation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a31.f.a A9(a31.e state) {
        return this.mapper.b(new b31.a.Params(state, b9(a31.c.b.f2280a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (F(r2, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B9(java.lang.String r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a31.q.b
            if (r0 == 0) goto L13
            r0 = r13
            a31.q$b r0 = (a31.q.b) r0
            int r1 = r0.f2330h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2330h = r1
            goto L18
        L13:
            a31.q$b r0 = new a31.q$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f2328f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f2330h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r12 = r0.f2327e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f2326d
            java.lang.String r12 = (java.lang.String) r12
            oq.u.b(r13)
            goto Lb2
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            java.lang.Object r12 = r0.f2327e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.f2326d
            java.lang.String r2 = (java.lang.String) r2
            oq.u.b(r13)
            r10 = r13
            r13 = r12
            r12 = r2
            r2 = r10
            goto L77
        L4d:
            oq.u.b(r13)
            az.d r13 = r11.fileConverter
            java.io.File r2 = new java.io.File
            r2.<init>(r12)
            java.lang.String r13 = r13.a(r2)
            ac4.n r2 = r11.openUriIntentUseCase
            ac4.n$a r5 = new ac4.n$a
            r5.<init>(r13)
            java.lang.Object r6 = vq.j.a(r12)
            r0.f2326d = r6
            java.lang.Object r6 = vq.j.a(r13)
            r0.f2327e = r6
            r0.f2330h = r4
            java.lang.Object r2 = r2.c(r5, r0)
            if (r2 != r1) goto L77
            goto Lb1
        L77:
            dx.i r2 = (dx.i) r2
            boolean r4 = r2 instanceof dx.i.Left
            if (r4 == 0) goto L9b
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b$c r2 = (dx.b.Business) r2
            i70.e r2 = r11.globalSnackBarManager
            p50.a$a r4 = new p50.a$a
            mx.c r5 = r11.labelProvider
            int r6 = t21.a.f187168j0
            mx.a r5 = r5.c(r6)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r2.y(r4)
        L9b:
            a31.c$a$b r2 = a31.c.a.b.f2279a
            java.lang.Object r12 = vq.j.a(r12)
            r0.f2326d = r12
            java.lang.Object r12 = vq.j.a(r13)
            r0.f2327e = r12
            r0.f2330h = r3
            java.lang.Object r12 = r11.F(r2, r0)
            if (r12 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.q.B9(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b C9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: a31.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f2304a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            qVar.d9(a31.c.b.f2280a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            qVar.d9(a31.c.d.f2282a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(a31.e.DownloadingConfirmation.class), new er.l() { // from class: a31.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.G9(this.f2301a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a31.e.DownloadInterrupted.class), new er.l() { // from class: a31.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.H9(this.f2302a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a31.e.Error.class), new er.l() { // from class: a31.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.I9(this.f2303a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(q qVar, k10.z zVar) {
        zVar.A(qVar.new d(null));
        e eVar = qVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a31.c.OnDownloadFinish.class), oVar, eVar);
        zVar.v(q0.c(a31.c.b.class), oVar, qVar.new f(null));
        zVar.v(q0.c(a31.a.class), oVar, qVar.new g(null));
        zVar.v(q0.c(a31.b.class), oVar, new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(q qVar, k10.z zVar) {
        zVar.C(qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(q qVar, k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a31.c.d.class), oVar, jVar);
        zVar.x(q0.c(a31.c.b.class), oVar, qVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String z9() {
        return this.currentTimeProvider.i().format(DateTimeFormatter.ofPattern(fz.c.FULL_TIME_WITHOUT_MS.getFormat()));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<a31.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<a31.e, a31.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a31.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a31.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
