package ox0;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import fr.q0;
import iy.b0;
import java.util.regex.Pattern;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import th0.InitExternalAuthInput;
import th0.InitExternalAuthMobileResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bk\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J)\u00102\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b2\u00103J'\u00108\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020*2\u0006\u0010:\u001a\u00020-2\u0006\u0010.\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010d\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lox0/l;", "Ll00/g;", "Lox0/c;", "Lox0/a;", "Lox0/d;", "", "Lw70/n;", "Lyy/a;", "stateMachineFactory", "Lox0/t;", "wkDomainProvider", "Lib4/c;", "errorMapper", "Luh0/k;", "getExternalAuthTokenUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "Ldx0/n;", "startEdoAppIntentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lpx0/a;", "activationScreenMapper", "Lpx/d;", "remoteLogger", "Lcx0/c;", "documentsContainerInteractor", "Lox0/b;", "setupData", "<init>", "(Lyy/a;Lox0/t;Lib4/c;Luh0/k;Lc54/b;Ldx0/n;Lac4/a;Lhb4/d;Lpx0/a;Lpx/d;Lcx0/c;Lox0/b;)V", "state", "Lox0/d$a;", "x9", "(Lox0/c;)Lox0/d$a;", "Ldx/b;", "Ljb4/b;", "y9", "(Ldx/b;)Ljb4/b;", "domainError", "Loq/i0;", "w9", "(Ldx/b;)V", "", "url", "Liy/b0;", "content", "title", "n1", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "scheme", "Landroid/net/Uri;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "b", "Lox0/t;", "c", "Lib4/c;", "d", "Luh0/k;", "e", "Lc54/b;", "f", "Ldx0/n;", "g", "Lac4/a;", "h", "Lhb4/d;", "j", "Lpx0/a;", "k", "Lpx/d;", "l", "Lcx0/c;", "m", "Lox0/b;", "Lox0/c$b;", "n", "Lox0/c$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lox0/a$b;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<ox0.c, ox0.a> implements ox0.d, zx.d, w70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t wkDomainProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uh0.k getExternalAuthTokenUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dx0.n startEdoAppIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px0.a activationScreenMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cx0.c documentsContainerInteractor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ox0.c.b initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ox0.c, ox0.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ox0.a.b> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<ox0.d.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ dx.b f150413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f150414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, l lVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f150413f = bVar;
            this.f150414g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150412e;
            if (i15 == 0) {
                u.b(obj);
                if (this.f150413f instanceof dx.b.g) {
                    cx0.c cVar = this.f150414g.documentsContainerInteractor;
                    this.f150412e = 1;
                    obj = cVar.g(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    this.f150414g.d9(ox0.a.C3701a.f150363a);
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (((Boolean) obj).booleanValue()) {
                this.f150414g.d9(ox0.a.C3701a.f150363a);
            } else {
                this.f150414g.d9(ox0.a.c.f150368a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new a(this.f150413f, this.f150414g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ox0.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f150415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f150416b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f150417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f150418b;

            /* JADX INFO: renamed from: ox0.l$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3706a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f150419d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f150420e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f150421f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f150423h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f150424j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f150425k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f150426l;

                public C3706a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f150419d = obj;
                    this.f150420e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l lVar) {
                this.f150417a = hVar;
                this.f150418b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3706a c3706a;
                if (eVar instanceof C3706a) {
                    c3706a = (C3706a) eVar;
                    int i15 = c3706a.f150420e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3706a.f150420e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3706a = new C3706a(eVar);
                    }
                } else {
                    c3706a = new C3706a(eVar);
                }
                Object obj2 = c3706a.f150419d;
                Object objE = uq.b.e();
                int i16 = c3706a.f150420e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f150417a;
                    ox0.d.a aVarX9 = this.f150418b.x9((ox0.c) obj);
                    c3706a.f150421f = vq.j.a(obj);
                    c3706a.f150423h = vq.j.a(c3706a);
                    c3706a.f150424j = vq.j.a(obj);
                    c3706a.f150425k = vq.j.a(hVar);
                    c3706a.f150426l = 0;
                    c3706a.f150420e = 1;
                    if (hVar.F(aVarX9, c3706a) == objE) {
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

        public b(mu.g gVar, l lVar) {
            this.f150415a = gVar;
            this.f150416b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ox0.d.a> hVar, tq.e eVar) {
            Object objA = this.f150415a.a(new a(hVar, this.f150416b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lox0/a$i;", "action", "Lk10/c0;", "Lox0/c;", "state", "Lk10/l;", "<anonymous>", "(Lox0/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ox0.a.ShowError, c0<ox0.c>, tq.e<? super k10.l<? extends ox0.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150429g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox0.c.Error O(l lVar, ox0.a.ShowError showError, ox0.c cVar) {
            return new ox0.c.Error(lVar.errorVMSFactory.a(lVar.y9(showError.getDomainError())));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ox0.a.ShowError showError = (ox0.a.ShowError) this.f150428f;
            c0 c0Var = (c0) this.f150429g;
            uq.b.e();
            if (this.f150427e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final l lVar = l.this;
            return c0Var.d(new er.l() { // from class: ox0.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.c.O(lVar, showError, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.ShowError showError, c0<ox0.c> c0Var, tq.e<? super k10.l<? extends ox0.c>> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f150428f = showError;
            cVar.f150429g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lox0/a$c;", "<unused var>", "Lox0/c;", "Loq/i0;", "<anonymous>", "(Lox0/a$c;Lox0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ox0.a.c, ox0.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150431e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150431e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                ox0.a.b.C3703b c3703b = ox0.a.b.C3703b.f150365a;
                this.f150431e = 1;
                if (lVar.F(c3703b, this) == objE) {
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
        public final Object w(ox0.a.c cVar, ox0.c cVar2, tq.e<? super i0> eVar) {
            return l.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lox0/a$a;", "<unused var>", "Lox0/c;", "Loq/i0;", "<anonymous>", "(Lox0/a$a;Lox0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ox0.a.C3701a, ox0.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150433e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150433e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                ox0.a.b.C3702a c3702a = ox0.a.b.C3702a.f150364a;
                this.f150433e = 1;
                if (lVar.F(c3702a, this) == objE) {
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
        public final Object w(ox0.a.C3701a c3701a, ox0.c cVar, tq.e<? super i0> eVar) {
            return l.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lox0/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lox0/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<ox0.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150435e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z<ox0.c.b, ox0.c, ox0.a> f150437g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f150438e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f150439f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l f150440g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ z<ox0.c.b, ox0.c, ox0.a> f150441h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, z<ox0.c.b, ox0.c, ox0.a> zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f150440g = lVar;
                this.f150441h = zVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                InitExternalAuthInput.a aVar;
                Object objE = uq.b.e();
                int i15 = this.f150439f;
                if (i15 == 0) {
                    u.b(obj);
                    rq0.b documentType = this.f150440g.setupData.getDocumentType();
                    if (documentType == rq0.b.d.ID_CARD) {
                        aVar = InitExternalAuthInput.a.MOBILE_ID_CARD;
                    } else {
                        if (documentType != rq0.b.d.DIIA_REFUGEE_CARD) {
                            px.b.y5(this.f150440g.remoteLogger, "ActivationVM: Wrong main document type: " + this.f150440g.setupData.getDocumentType(), null, px.c.a(this.f150441h), 2, null);
                            this.f150440g.d9(new ox0.a.ShowError(new dx.b.Generic(new Exception("Activation error, wrong main document type"))));
                            return i0.f148189a;
                        }
                        aVar = InitExternalAuthInput.a.DIIA_PL;
                    }
                    uh0.k kVar = this.f150440g.getExternalAuthTokenUseCase;
                    uh0.k.Params params = new uh0.k.Params(aVar);
                    this.f150438e = vq.j.a(aVar);
                    this.f150439f = 1;
                    obj = kVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                l lVar = this.f150440g;
                z<ox0.c.b, ox0.c, ox0.a> zVar = this.f150441h;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    px.b.y5(lVar.remoteLogger, "ActivationVM: GetExternalAuthToken error: " + bVar, null, px.c.a(zVar), 2, null);
                    lVar.d9(new ox0.a.ShowError(bVar));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    lVar.d9(new ox0.a.PzReady((InitExternalAuthMobileResponse) ((dx.i.Right) iVar).b()));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f150440g, this.f150441h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z<ox0.c.b, ox0.c, ox0.a> zVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f150437g = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150435e;
            if (i15 == 0) {
                u.b(obj);
                l.this.remoteLogger.F8("ActivationVM: (" + l.this.setupData.getDocumentType() + ") activation via WK has started", px.d.a.GENERAL);
                ac4.a aVar = l.this.callActionWithLoaderUseCase;
                a aVar2 = new a(l.this, this.f150437g, null);
                this.f150435e = 1;
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ox0.c.b bVar, tq.e<? super i0> eVar) {
            return ((f) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new f(this.f150437g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lox0/a$e;", "action", "Lox0/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lox0/a$e;Lox0/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ox0.a.OnSslError, ox0.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150443f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ z<ox0.c.b, ox0.c, ox0.a> f150445h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z<ox0.c.b, ox0.c, ox0.a> zVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f150445h = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox0.a.OnSslError onSslError = (ox0.a.OnSslError) this.f150443f;
            uq.b.e();
            if (this.f150442e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            px.b.y5(l.this.remoteLogger, "ActivationVM: SSL error on " + onSslError.getUrl() + " before initialization", null, px.c.a(this.f150445h), 2, null);
            l.this.d9(new ox0.a.ShowError(new dx.b.g.SslCertificate(false)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.OnSslError onSslError, ox0.c.b bVar, tq.e<? super i0> eVar) {
            g gVar = l.this.new g(this.f150445h, eVar);
            gVar.f150443f = onSslError;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox0/a$g;", "action", "Lk10/c0;", "Lox0/c$b;", "state", "Lk10/l;", "Lox0/c;", "<anonymous>", "(Lox0/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ox0.a.PzReady, c0<ox0.c.b>, tq.e<? super k10.l<? extends ox0.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150448g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox0.c.PzReady O(ox0.a.PzReady pzReady, ox0.c.b bVar) {
            return new ox0.c.PzReady(pzReady.getData(), false, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ox0.a.PzReady pzReady = (ox0.a.PzReady) this.f150447f;
            c0 c0Var = (c0) this.f150448g;
            uq.b.e();
            if (this.f150446e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: ox0.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.h.O(pzReady, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.PzReady pzReady, c0<ox0.c.b> c0Var, tq.e<? super k10.l<? extends ox0.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f150447f = pzReady;
            hVar.f150448g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lox0/c$c;", "it", "Loq/i0;", "<anonymous>", "(Lox0/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<ox0.c.PzReady, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150449e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f150449e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.remoteLogger.F8("ActivationVM: WK webView is ready", px.d.a.GENERAL);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ox0.c.PzReady pzReady, tq.e<? super i0> eVar) {
            return ((i) v(pzReady, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox0/a$d;", "action", "Lk10/c0;", "Lox0/c$c;", "state", "Lk10/l;", "Lox0/c;", "<anonymous>", "(Lox0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ox0.a.OnPageLoaded, c0<ox0.c.PzReady>, tq.e<? super k10.l<? extends ox0.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150453g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox0.c.PzReady O(ox0.a.OnPageLoaded onPageLoaded, ox0.c.PzReady pzReady) {
            return ox0.c.PzReady.b(pzReady, null, false, onPageLoaded.getUrl(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ox0.a.OnPageLoaded onPageLoaded = (ox0.a.OnPageLoaded) this.f150452f;
            c0 c0Var = (c0) this.f150453g;
            uq.b.e();
            if (this.f150451e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.remoteLogger.F8("ActivationVM: new page (" + onPageLoaded.getUrl() + ") has loaded (sslError: " + ((ox0.c.PzReady) c0Var.a()).getIsSslError() + ')', px.d.a.GENERAL);
            if (!((ox0.c.PzReady) c0Var.a()).getIsSslError() && fr.t.c(onPageLoaded.getUrl(), ((ox0.c.PzReady) c0Var.a()).getWebViewData().getSuccessRedirectUrl())) {
                l.this.d9(new ox0.a.RedirectionSuccess(onPageLoaded.getContent()));
            }
            return c0Var.b(new er.l() { // from class: ox0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.j.O(onPageLoaded, (c.PzReady) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.OnPageLoaded onPageLoaded, c0<ox0.c.PzReady> c0Var, tq.e<? super k10.l<? extends ox0.c>> eVar) {
            j jVar = l.this.new j(eVar);
            jVar.f150452f = onPageLoaded;
            jVar.f150453g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox0/a$e;", "action", "Lk10/c0;", "Lox0/c$c;", "state", "Lk10/l;", "Lox0/c;", "<anonymous>", "(Lox0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ox0.a.OnSslError, c0<ox0.c.PzReady>, tq.e<? super k10.l<? extends ox0.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150457g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z<ox0.c.PzReady, ox0.c, ox0.a> f150459j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(z<ox0.c.PzReady, ox0.c, ox0.a> zVar, tq.e<? super k> eVar) {
            super(3, eVar);
            this.f150459j = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox0.c.PzReady O(c0 c0Var, ox0.c.PzReady pzReady) {
            return ox0.c.PzReady.b((ox0.c.PzReady) c0Var.a(), null, true, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox0.a.OnSslError onSslError = (ox0.a.OnSslError) this.f150456f;
            final c0 c0Var = (c0) this.f150457g;
            uq.b.e();
            if (this.f150455e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            px.b.y5(l.this.remoteLogger, "ActivationVM: SSL error on " + onSslError.getUrl(), null, px.c.a(this.f150459j), 2, null);
            l.this.d9(new ox0.a.ShowError(new dx.b.g.SslCertificate(false)));
            return c0Var.b(new er.l() { // from class: ox0.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.k.O(c0Var, (c.PzReady) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.OnSslError onSslError, c0<ox0.c.PzReady> c0Var, tq.e<? super k10.l<? extends ox0.c>> eVar) {
            k kVar = l.this.new k(this.f150459j, eVar);
            kVar.f150456f = onSslError;
            kVar.f150457g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ox0.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lox0/a$f;", "action", "Lox0/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lox0/a$f;Lox0/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3707l extends vq.k implements er.q<ox0.a.OnUrlLoadingOverridden, ox0.c.PzReady, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f150461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f150462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f150463h;

        C3707l(tq.e<? super C3707l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean zMatches;
            ox0.a.OnUrlLoadingOverridden onUrlLoadingOverridden = (ox0.a.OnUrlLoadingOverridden) this.f150463h;
            Object objE = uq.b.e();
            int i15 = this.f150462g;
            if (i15 == 0) {
                u.b(obj);
                l.this.remoteLogger.F8("ActivationVM: override url loading (" + onUrlLoadingOverridden.getScheme() + ')', px.d.a.GENERAL);
                if (fr.t.c(onUrlLoadingOverridden.getScheme(), "edohub") && (zMatches = Pattern.matches("edohub:\\/\\/application\\/\\?code=[0-9]{6}", onUrlLoadingOverridden.getUrl().toString()))) {
                    dx0.n nVar = l.this.startEdoAppIntentUseCase;
                    dx0.n.Params params = new dx0.n.Params(onUrlLoadingOverridden.getUrl().toString());
                    this.f150463h = vq.j.a(onUrlLoadingOverridden);
                    this.f150460e = vq.j.a("edohub:\\/\\/application\\/\\?code=[0-9]{6}");
                    this.f150461f = zMatches;
                    this.f150462g = 1;
                    obj = nVar.d(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            dx.i iVar = (dx.i) obj;
            l lVar = l.this;
            if (iVar instanceof dx.i.Right) {
                lVar.remoteLogger.F8("ActivationVM: edoApp intent has started", px.d.a.GENERAL);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ox0.a.OnUrlLoadingOverridden onUrlLoadingOverridden, ox0.c.PzReady pzReady, tq.e<? super i0> eVar) {
            C3707l c3707l = l.this.new C3707l(eVar);
            c3707l.f150463h = onUrlLoadingOverridden;
            return c3707l.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lox0/a$h;", "action", "Lox0/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lox0/a$h;Lox0/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ox0.a.RedirectionSuccess, ox0.c.PzReady, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150466f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox0.a.RedirectionSuccess redirectionSuccess = (ox0.a.RedirectionSuccess) this.f150466f;
            Object objE = uq.b.e();
            int i15 = this.f150465e;
            if (i15 == 0) {
                u.b(obj);
                l.this.remoteLogger.F8("ActivationVM: redirection success, navigation to loader", px.d.a.GENERAL);
                l lVar = l.this;
                ox0.a.b.ToMainDocumentLoader toMainDocumentLoader = new ox0.a.b.ToMainDocumentLoader(l.this.setupData.getDocumentType(), redirectionSuccess.getActivationContent());
                this.f150466f = vq.j.a(redirectionSuccess);
                this.f150465e = 1;
                if (lVar.F(toMainDocumentLoader, this) == objE) {
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
        public final Object w(ox0.a.RedirectionSuccess redirectionSuccess, ox0.c.PzReady pzReady, tq.e<? super i0> eVar) {
            m mVar = l.this.new m(eVar);
            mVar.f150466f = redirectionSuccess;
            return mVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, t tVar, ib4.c cVar, uh0.k kVar, c54.b bVar, dx0.n nVar, ac4.a aVar2, hb4.d dVar, px0.a aVar3, px.d dVar2, cx0.c cVar2, SetupData setupData) {
        this.wkDomainProvider = tVar;
        this.errorMapper = cVar;
        this.getExternalAuthTokenUseCase = kVar;
        this.isFeatureEnabledUseCase = bVar;
        this.startEdoAppIntentUseCase = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.activationScreenMapper = aVar3;
        this.remoteLogger = dVar2;
        this.documentsContainerInteractor = cVar2;
        this.setupData = setupData;
        ox0.c.b bVar2 = ox0.c.b.f150381a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: ox0.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.B9(this.f150396a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), x9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final l lVar, v vVar) {
        vVar.c(q0.c(ox0.c.class), new er.l() { // from class: ox0.g
            @Override // er.l
            public final Object b(Object obj) {
                return l.C9(this.f150391a, (z) obj);
            }
        });
        vVar.c(q0.c(ox0.c.b.class), new er.l() { // from class: ox0.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.D9(this.f150392a, (z) obj);
            }
        });
        vVar.c(q0.c(ox0.c.PzReady.class), new er.l() { // from class: ox0.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.E9(this.f150393a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(l lVar, z zVar) {
        c cVar = lVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ox0.a.ShowError.class), oVar, cVar);
        zVar.x(q0.c(ox0.a.c.class), oVar, lVar.new d(null));
        zVar.x(q0.c(ox0.a.C3701a.class), oVar, lVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(l lVar, z zVar) {
        zVar.C(lVar.new f(zVar, null));
        g gVar = lVar.new g(zVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ox0.a.OnSslError.class), oVar, gVar);
        zVar.v(q0.c(ox0.a.PzReady.class), oVar, new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(l lVar, z zVar) {
        zVar.C(lVar.new i(null));
        j jVar = lVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ox0.a.OnPageLoaded.class), oVar, jVar);
        zVar.v(q0.c(ox0.a.OnSslError.class), oVar, lVar.new k(zVar, null));
        zVar.x(q0.c(ox0.a.OnUrlLoadingOverridden.class), oVar, lVar.new C3707l(null));
        zVar.x(q0.c(ox0.a.RedirectionSuccess.class), oVar, lVar.new m(null));
        return i0.f148189a;
    }

    private final void w9(dx.b domainError) {
        i00.a.a(this, new a(domainError, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ox0.d.a x9(ox0.c state) {
        return this.activationScreenMapper.b(new px0.a.Params(state, this.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue(), this, this.wkDomainProvider.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b y9(final dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ox0.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.z9(this.f150394a, bVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(l lVar, dx.b bVar, ib4.c.b bVar2) {
        if (bVar2 instanceof ib4.c.b.a.Close) {
            lVar.d9(ox0.a.C3701a.f150363a);
        } else if (bVar2 instanceof ib4.c.b.a.Primary) {
            lVar.d9(ox0.a.c.f150368a);
        } else if (bVar2 instanceof ib4.c.b.a.Secondary) {
            lVar.d9(ox0.a.C3701a.f150363a);
        } else {
            if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            lVar.w9(bVar);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // w70.n
    public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
        super.M1(str, z15, aVar);
    }

    @Override // w70.n
    public /* bridge */ void N7(String str, er.l<? super String, i0> lVar) {
        super.N7(str, lVar);
    }

    @Override // w70.n
    public /* bridge */ void O1(DownloadFileData downloadFileData) {
        super.O1(downloadFileData);
    }

    @Override // w70.n
    public /* bridge */ void R2(int i15) {
        super.R2(i15);
    }

    @Override // zx.b
    public xw.b<ox0.a.b> Y1() {
        return this.navAction;
    }

    @Override // w70.n
    public /* bridge */ void b8(ValueCallback<Uri[]> valueCallback) {
        super.b8(valueCallback);
    }

    @Override // w70.n
    public void c2(String scheme, Uri url) {
        d9(new ox0.a.OnUrlLoadingOverridden(scheme, url));
    }

    @Override // l00.g
    protected k10.t<ox0.c, ox0.a> e9() {
        return this.stateMachine;
    }

    @Override // w70.n
    public void f6(String url, int primaryError, SslCertificate certificate) {
        d9(new ox0.a.OnSslError(url));
    }

    @Override // l00.e
    public p0<ox0.d.a> getState() {
        return this.state;
    }

    @Override // w70.n
    public void n1(String url, b0 content, String title) {
        d9(new ox0.a.OnPageLoaded(url, content));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ox0.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // w70.n
    public /* bridge */ void z7(Uri uri) {
        super.z7(uri);
    }
}
