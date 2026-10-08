package zv1;

import bw1.SetupData;
import cb4.DialogData;
import fr.q0;
import fv0.BEDiploma;
import fv0.BEDiplomasToDownload;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 x2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001^B\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010'H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=09H\u0096\u0001¢\u0006\u0004\b>\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010`\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010w\u001a\b\u0012\u0004\u0012\u00020/0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006y"}, d2 = {"Lzv1/v;", "Ll00/g;", "Lzv1/e;", "Lzv1/c;", "Lzv1/g;", "", "Li70/e;", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Law1/b;", "mapper", "Lgv0/b;", "beGetDiplomasToDownloadUC", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lev1/a;", "documentSchemaDecoder", "Loz/q;", "ownerViewLifecycleManager", "Lac4/a;", "callActionWithLoaderUC", "La14/y;", "requestPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lmx/c;", "labelProvider", "globalSnackBarManager", "Lvv1/g;", "storagePermissionNotGrantedDialogMapper", "Lzv1/d;", "setupData", "<init>", "(Lyy/a;Law1/b;Lgv0/b;Lib4/c;Lhb4/d;Lev1/a;Loz/q;Lac4/a;La14/y;La14/m;Lcb4/j;Lmx/c;Li70/e;Lvv1/g;Lzv1/d;)V", "Lcb4/d;", "A9", "(Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "Lhb4/c;", "B9", "(Ldx/b;)Lhb4/c;", "Lzv1/g$a;", "D9", "(Lzv1/e;)Lzv1/g$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Law1/b;", "c", "Lgv0/b;", "d", "Lib4/c;", "e", "Lhb4/d;", "f", "Lev1/a;", "g", "Loz/q;", "h", "Lac4/a;", "j", "La14/y;", "k", "La14/m;", "l", "Lcb4/j;", "m", "Lmx/c;", "n", "Li70/e;", "p", "Lvv1/g;", "q", "Lzv1/d;", "Loz/j;", "r", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lzv1/e$c;", "s", "Lzv1/e$c;", "initialState", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzv1/c$e;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "x", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<zv1.e, zv1.c> implements zv1.g, zx.d, i70.e, nx.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f237960y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aw1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gv0.b beGetDiplomasToDownloadUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ev1.a documentSchemaDecoder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final vv1.g storagePermissionNotGrantedDialogMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final zv1.e.c initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<zv1.e, zv1.c> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zv1.c.e> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<zv1.g.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f237980d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f237982f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f237980d = obj;
            this.f237982f |= PKIFailureInfo.systemUnavail;
            return v.this.A9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<zv1.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f237983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f237984b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f237985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f237986b;

            /* JADX INFO: renamed from: zv1.v$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6424a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f237987d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f237988e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f237989f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f237991h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f237992j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f237993k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f237994l;

                public C6424a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f237987d = obj;
                    this.f237988e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f237985a = hVar;
                this.f237986b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6424a c6424a;
                if (eVar instanceof C6424a) {
                    c6424a = (C6424a) eVar;
                    int i15 = c6424a.f237988e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6424a.f237988e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6424a = new C6424a(eVar);
                    }
                } else {
                    c6424a = new C6424a(eVar);
                }
                Object obj2 = c6424a.f237987d;
                Object objE = uq.b.e();
                int i16 = c6424a.f237988e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f237985a;
                    zv1.g.a aVarD9 = this.f237986b.D9((zv1.e) obj);
                    c6424a.f237989f = vq.j.a(obj);
                    c6424a.f237991h = vq.j.a(c6424a);
                    c6424a.f237992j = vq.j.a(obj);
                    c6424a.f237993k = vq.j.a(hVar);
                    c6424a.f237994l = 0;
                    c6424a.f237988e = 1;
                    if (hVar.F(aVarD9, c6424a) == objE) {
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

        public c(mu.g gVar, v vVar) {
            this.f237983a = gVar;
            this.f237984b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super zv1.g.a> hVar, tq.e eVar) {
            Object objA = this.f237983a.a(new a(hVar, this.f237984b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzv1/c$e;", "action", "Lzv1/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzv1/c$e;Lzv1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<zv1.c.e, zv1.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237996f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zv1.c.e eVar = (zv1.c.e) this.f237996f;
            Object objE = uq.b.e();
            int i15 = this.f237995e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zv1.c.e> bVarY1 = v.this.Y1();
                this.f237996f = vq.j.a(eVar);
                this.f237995e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(zv1.c.e eVar, zv1.e eVar2, tq.e<? super i0> eVar3) {
            d dVar = v.this.new d(eVar3);
            dVar.f237996f = eVar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzv1/c$h;", "action", "Lzv1/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzv1/c$h;Lzv1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<zv1.c.ShowSnackBar, zv1.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237999f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zv1.c.ShowSnackBar showSnackBar = (zv1.c.ShowSnackBar) this.f237999f;
            uq.b.e();
            if (this.f237998e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.ShowSnackBar showSnackBar, zv1.e eVar, tq.e<? super i0> eVar2) {
            e eVar3 = v.this.new e(eVar2);
            eVar3.f237999f = showSnackBar;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lzv1/e$c;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<zv1.e.c>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238002f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzv1/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zv1.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f238004e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f238005f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f238006g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f238007h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f238008j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f238009k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f238010l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f238011m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f238012n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f238013p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f238014q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f238015r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f238016s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ v f238017t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ k10.c0<zv1.e.c> f238018v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<zv1.e.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f238017t = vVar;
                this.f238018v = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zv1.e.LoadingError X(v vVar, dx.b bVar, zv1.e.c cVar) {
                return new zv1.e.LoadingError(vVar.B9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zv1.e.b.Content Y(zv1.e.b.Content content, zv1.e.c cVar) {
                return content;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x0100  */
            /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: Exception -> 0x002c, c -> 0x0030, CancellationException -> 0x0034, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0027, B:40:0x00fa, B:46:0x0120, B:43:0x0101, B:45:0x0105, B:47:0x012d, B:48:0x0132, B:55:0x0186, B:58:0x0196), top: B:81:0x0007 }] */
            /* JADX WARN: Code duplicated, block: B:45:0x0105 A[Catch: Exception -> 0x002c, c -> 0x0030, CancellationException -> 0x0034, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0027, B:40:0x00fa, B:46:0x0120, B:43:0x0101, B:45:0x0105, B:47:0x012d, B:48:0x0132, B:55:0x0186, B:58:0x0196), top: B:81:0x0007 }] */
            /* JADX WARN: Code duplicated, block: B:47:0x012d A[Catch: Exception -> 0x002c, c -> 0x0030, CancellationException -> 0x0034, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0027, B:40:0x00fa, B:46:0x0120, B:43:0x0101, B:45:0x0105, B:47:0x012d, B:48:0x0132, B:55:0x0186, B:58:0x0196), top: B:81:0x0007 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Exception exc;
                Object objB;
                dx.i left;
                ex.c cVar;
                fv0.c next;
                ex.b bVar;
                fv0.c cVar2;
                Object right;
                Object objE = uq.b.e();
                int i15 = this.f238016s;
                ?? r15 = 1;
                try {
                    try {
                        if (i15 == 0) {
                            oq.u.b(obj);
                            v vVar = this.f238017t;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                ev1.a aVar2 = vVar.documentSchemaDecoder;
                                gv1.s sVar = gv1.s.TEXT;
                                String strF = ev1.a.f(aVar2, sVar, "documentUuid", null, null, vVar.setupData.getScopeData(), null, 44, null);
                                if (strF == null) {
                                    aVar.b(new dx.b.Parsing(new Exception("documentUuid is null")));
                                    throw new oq.g();
                                }
                                String strF2 = ev1.a.f(vVar.documentSchemaDecoder, sVar, "diplomaType", null, null, vVar.setupData.getScopeData(), null, 44, null);
                                if (strF2 == null) {
                                    aVar.b(new dx.b.Parsing(new Exception("diplomaType is null")));
                                    throw new oq.g();
                                }
                                Iterator<fv0.c> it = fv0.c.e().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(next.name(), strF2));
                                fv0.c cVar3 = next;
                                if (cVar3 == null) {
                                    aVar.b(new dx.b.Parsing(new Exception("diplomaType " + strF2 + " doesn't correspond to any enum value")));
                                    throw new oq.g();
                                }
                                gv0.b bVar2 = vVar.beGetDiplomasToDownloadUC;
                                gv0.b.Params params = new gv0.b.Params(cVar3, strF);
                                this.f238009k = jVarA;
                                this.f238010l = vq.j.a(aVar);
                                this.f238011m = vq.j.a(aVar);
                                this.f238012n = vq.j.a(strF2);
                                this.f238013p = vq.j.a(strF);
                                this.f238014q = cVar3;
                                this.f238015r = aVar;
                                this.f238004e = 0;
                                this.f238005f = 0;
                                this.f238006g = 0;
                                this.f238007h = 0;
                                this.f238008j = 0;
                                this.f238016s = 1;
                                obj = bVar2.c(params, this);
                                if (obj == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                cVar2 = cVar3;
                                right = (dx.i) obj;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    right = new dx.i.Right(new zv1.e.b.Content(new StateContent(((BEDiplomasToDownload) ((dx.i.Right) right).b()).a(), cVar2)));
                                }
                                left = new dx.i.Right((zv1.e.b.Content) bVar.a(right));
                            } catch (ex.c e15) {
                                cVar = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(cVar));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                exc = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = exc.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, exc, px.c.a(r15));
                                dx.i iVarA = r15.a(exc);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f238015r;
                            cVar2 = (fv0.c) this.f238014q;
                            try {
                                oq.u.b(obj);
                                right = (dx.i) obj;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    right = new dx.i.Right(new zv1.e.b.Content(new StateContent(((BEDiplomasToDownload) ((dx.i.Right) right).b()).a(), cVar2)));
                                }
                                left = new dx.i.Right((zv1.e.b.Content) bVar.a(right));
                            } catch (ex.c e18) {
                                cVar = e18;
                                left = new dx.i.Left((dx.b) ex.d.a(cVar));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                } catch (Exception e26) {
                    exc = e26;
                }
                k10.c0<zv1.e.c> c0Var = this.f238018v;
                final v vVar2 = this.f238017t;
                if (left instanceof dx.i.Left) {
                    final dx.b bVar3 = (dx.b) ((dx.i.Left) left).b();
                    return c0Var.d(new er.l() { // from class: zv1.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.f.a.X(vVar2, bVar3, (e.c) obj2);
                        }
                    });
                }
                if (!(left instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final zv1.e.b.Content content = (zv1.e.b.Content) ((dx.i.Right) left).b();
                return c0Var.d(new er.l() { // from class: zv1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.f.a.Y(content, (e.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f238017t, this.f238018v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zv1.e>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.a O(zv1.e.c cVar) {
            return zv1.e.a.f237917a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f238002f;
            Object objE = uq.b.e();
            int i15 = this.f238001e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            if (!v.this.setupData.getIsDocumentValid()) {
                return c0Var.d(new er.l() { // from class: zv1.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.f.O((e.c) obj2);
                    }
                });
            }
            ac4.a aVar = v.this.callActionWithLoaderUC;
            a aVar2 = new a(v.this, c0Var, null);
            this.f238002f = vq.j.a(c0Var);
            this.f238001e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<zv1.e.c> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f238002f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzv1/c$c;", "<unused var>", "Lk10/c0;", "Lzv1/e$d;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lzv1/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<zv1.c.C6420c, k10.c0<zv1.e.LoadingError>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238020f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.c O(zv1.e.LoadingError loadingError) {
            return zv1.e.c.f237923a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f238020f;
            uq.b.e();
            if (this.f238019e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zv1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.g.O((e.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.C6420c c6420c, k10.c0<zv1.e.LoadingError> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            g gVar = new g(eVar);
            gVar.f238020f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzv1/c$b;", "<unused var>", "Lzv1/e$d;", "Loq/i0;", "<anonymous>", "(Lzv1/c$b;Lzv1/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zv1.c.b, zv1.e.LoadingError, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238021e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f238021e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(zv1.c.e.a.f237906a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.b bVar, zv1.e.LoadingError loadingError, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzv1/c$f;", "<unused var>", "Lk10/c0;", "Lzv1/e$b;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lzv1/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<zv1.c.f, k10.c0<zv1.e.b>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238024f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.b.Content O(k10.c0 c0Var, zv1.e.b bVar) {
            return new zv1.e.b.Content(((zv1.e.b) c0Var.a()).getStateContent());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f238024f;
            uq.b.e();
            if (this.f238023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zv1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(c0Var, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.f fVar, k10.c0<zv1.e.b> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            i iVar = new i(eVar);
            iVar.f238024f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzv1/c$a;", "action", "Lk10/c0;", "Lzv1/e$b;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lzv1/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<zv1.c.Download, k10.c0<zv1.e.b>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238027g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.b.Downloading O(zv1.c.Download download, zv1.e.b bVar) {
            return new zv1.e.b.Downloading(bVar.getStateContent(), download.getDiploma());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zv1.c.Download download = (zv1.c.Download) this.f238026f;
            k10.c0 c0Var = (k10.c0) this.f238027g;
            uq.b.e();
            if (this.f238025e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zv1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.j.O(download, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.Download download, k10.c0<zv1.e.b> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f238026f = download;
            jVar.f238027g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzv1/e$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lzv1/e$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<zv1.e.b.Downloading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238029f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zv1.e.b.Downloading downloading = (zv1.e.b.Downloading) this.f238029f;
            Object objE = uq.b.e();
            int i15 = this.f238028e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f238029f = downloading;
                this.f238028e = 1;
                obj = vVar.A9(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            DialogData dialogData = (DialogData) obj;
            if (dialogData != null) {
                v.this.d9(new zv1.c.ShowDialog(dialogData));
                return i0.f148189a;
            }
            v.this.d9(new zv1.c.e.ToLoader(new SetupData(downloading.getStateContent().getDiplomaType(), downloading.getDiploma().getDiplomaSubtype(), downloading.getDiploma().getDiplomaUuid())));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(zv1.e.b.Downloading downloading, tq.e<? super i0> eVar) {
            return ((k) v(downloading, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f238029f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnx/a;", "viewLifecycle", "Lk10/c0;", "Lzv1/e$b$b;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lnx/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<nx.a, k10.c0<zv1.e.b.Downloading>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238033g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.c O(zv1.e.b.Downloading downloading) {
            return zv1.e.c.f237923a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f238032f;
            k10.c0 c0Var = (k10.c0) this.f238033g;
            uq.b.e();
            if (this.f238031e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return aVar == nx.a.STARTED ? c0Var.d(new er.l() { // from class: zv1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O((e.b.Downloading) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, k10.c0<zv1.e.b.Downloading> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            l lVar = new l(eVar);
            lVar.f238032f = aVar;
            lVar.f238033g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzv1/c$g;", "action", "Lk10/c0;", "Lzv1/e$b$b;", "state", "Lk10/l;", "Lzv1/e;", "<anonymous>", "(Lzv1/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<zv1.c.ShowDialog, k10.c0<zv1.e.b.Downloading>, tq.e<? super k10.l<? extends zv1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238036g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zv1.e.b.PermissionDialog O(k10.c0 c0Var, v vVar, zv1.c.ShowDialog showDialog, zv1.e.b.Downloading downloading) {
            return new zv1.e.b.PermissionDialog(((zv1.e.b.Downloading) c0Var.a()).getStateContent(), vVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zv1.c.ShowDialog showDialog = (zv1.c.ShowDialog) this.f238035f;
            final k10.c0 c0Var = (k10.c0) this.f238036g;
            uq.b.e();
            if (this.f238034e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: zv1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.m.O(c0Var, vVar, showDialog, (e.b.Downloading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.ShowDialog showDialog, k10.c0<zv1.e.b.Downloading> c0Var, tq.e<? super k10.l<? extends zv1.e>> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f238035f = showDialog;
            mVar.f238036g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzv1/c$d;", "<unused var>", "Lzv1/e$b$c;", "Loq/i0;", "<anonymous>", "(Lzv1/c$d;Lzv1/e$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<zv1.c.d, zv1.e.b.PermissionDialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238038e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f238038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = v.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            v vVar = v.this;
            if (iVarA instanceof dx.i.Left) {
                vVar.d9(new zv1.c.ShowSnackBar(vVar.labelProvider.c(dv1.a.f44662t0)));
            }
            v.this.d9(zv1.c.f.f237908a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zv1.c.d dVar, zv1.e.b.PermissionDialog permissionDialog, tq.e<? super i0> eVar) {
            return v.this.new n(eVar).J(i0.f148189a);
        }
    }

    public v(yy.a aVar, aw1.b bVar, gv0.b bVar2, ib4.c cVar, hb4.d dVar, ev1.a aVar2, oz.q qVar, ac4.a aVar3, a14.y yVar, a14.m mVar, cb4.j jVar, mx.c cVar2, i70.e eVar, vv1.g gVar, SetupData setupData) {
        this.mapper = bVar;
        this.beGetDiplomasToDownloadUC = bVar2;
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.documentSchemaDecoder = aVar2;
        this.ownerViewLifecycleManager = qVar;
        this.callActionWithLoaderUC = aVar3;
        this.requestPermissionUseCase = yVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.labelProvider = cVar2;
        this.globalSnackBarManager = eVar;
        this.storagePermissionNotGrantedDialogMapper = gVar;
        this.setupData = setupData;
        this.lifecycleConnector = qVar;
        zv1.e.c cVar3 = zv1.e.c.f237923a;
        this.initialState = cVar3;
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: zv1.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.G9(this.f237958a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), D9(cVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A9(tq.e<? super DialogData> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f237982f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f237982f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f237980d;
        Object objE = uq.b.e();
        int i16 = bVar.f237982f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.y yVar = this.requestPermissionUseCase;
            a14.y.Params params = new a14.y.Params(gy.d.EXTERNAL_STORAGE);
            bVar.f237982f = 1;
            objC = yVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if (cVar instanceof u04.c.b) {
            return this.storagePermissionNotGrantedDialogMapper.b(new vv1.g.Params(b9(zv1.c.f.f237908a), b9(zv1.c.d.f237905a)));
        }
        if (cVar instanceof u04.c.a) {
            return null;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c B9(dx.b error) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: zv1.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f237957a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(v vVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            vVar.d9(zv1.c.C6420c.f237904a);
        } else {
            vVar.d9(zv1.c.e.a.f237906a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zv1.g.a D9(zv1.e eVar) {
        return this.mapper.b(new aw1.b.Params(eVar, b9(zv1.c.e.a.f237906a), new er.l() { // from class: zv1.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.E9(this.f237951a, (BEDiploma) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(v vVar, BEDiploma bEDiploma) {
        vVar.d9(new zv1.c.Download(bEDiploma));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(zv1.e.class), new er.l() { // from class: zv1.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f237952a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(zv1.e.c.class), new er.l() { // from class: zv1.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.I9(this.f237953a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(zv1.e.LoadingError.class), new er.l() { // from class: zv1.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(this.f237954a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(zv1.e.b.class), new er.l() { // from class: zv1.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9((k10.z) obj);
            }
        });
        vVar2.c(q0.c(zv1.e.b.Downloading.class), new er.l() { // from class: zv1.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.L9(this.f237955a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(zv1.e.b.PermissionDialog.class), new er.l() { // from class: zv1.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.M9(this.f237956a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(v vVar, k10.z zVar) {
        d dVar = vVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zv1.c.e.class), oVar, dVar);
        zVar.x(q0.c(zv1.c.ShowSnackBar.class), oVar, vVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(v vVar, k10.z zVar) {
        zVar.A(vVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(v vVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(zv1.c.C6420c.class), oVar, gVar);
        zVar.x(q0.c(zv1.c.b.class), oVar, vVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(zv1.c.f.class), oVar, iVar);
        zVar.v(q0.c(zv1.c.Download.class), oVar, new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(v vVar, k10.z zVar) {
        zVar.C(vVar.new k(null));
        k10.k.m(zVar, mu.i.r(vVar.x8(), 1), null, new l(null), 2, null);
        m mVar = vVar.new m(null);
        zVar.v(q0.c(zv1.c.ShowDialog.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(v vVar, k10.z zVar) {
        n nVar = vVar.new n(null);
        zVar.x(q0.c(zv1.c.d.class), k10.o.CANCEL_PREVIOUS, nVar);
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<zv1.c.e> Y1() {
        return this.navAction;
    }

    @Override // zv1.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<zv1.e, zv1.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<zv1.g.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
