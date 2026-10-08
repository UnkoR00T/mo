package fg0;

import hg0.CertificateEntity;
import iy.i0;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.g1;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;
import pq.v;
import py.m;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\nH\u0096@¢\u0006\u0004\b\u0019\u0010\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0\nH\u0096@¢\u0006\u0004\b\u001b\u0010\u0016J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u001c\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\"0\nH\u0096@¢\u0006\u0004\b#\u0010\u0016J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010$\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)¨\u0006*"}, d2 = {"Lfg0/a;", "Lmg0/a;", "Lp10/f;", "dbProvider", "Liy/i0;", "certificateDecoder", "Lpy/m;", "rsaKeyDecoder", "<init>", "(Lp10/f;Liy/i0;Lpy/m;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase;", "k", "()Ldx/i;", "Lry/c;", "certKeyPair", "Loq/i0;", "c", "(Lry/c;Ltq/e;)Ljava/lang/Object;", "b", "f", "(Ltq/e;)Ljava/lang/Object;", "", "h", "j", "Lwf0/a;", "d", "status", "a", "(Lwf0/a;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "i", "()Lmu/g;", "", "g", "isAccepted", "e", "(ZLtq/e;)Ljava/lang/Object;", "Lp10/f;", "Liy/i0;", "Lpy/m;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements mg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p10.f dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 certificateDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m rsaKeyDecoder;

    /* JADX INFO: renamed from: fg0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1410a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62327h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62328j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62329k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62330l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62331m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62333p;

        C1410a(tq.e<? super C1410a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62331m = obj;
            this.f62333p |= PKIFailureInfo.systemUnavail;
            return a.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62338h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62339j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62340k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62341l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62342m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62344p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62342m = obj;
            this.f62344p |= PKIFailureInfo.systemUnavail;
            return a.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62349h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62354n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62355p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f62356q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f62357r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62359t;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62357r = obj;
            this.f62359t |= PKIFailureInfo.systemUnavail;
            return a.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62364h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62367l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62368m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62370p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62368m = obj;
            this.f62370p |= PKIFailureInfo.systemUnavail;
            return a.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62375h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62378l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62379m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62381p;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62379m = obj;
            this.f62381p |= PKIFailureInfo.systemUnavail;
            return a.this.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<wf0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f62382a;

        /* JADX INFO: renamed from: fg0.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1411a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f62383a;

            /* JADX INFO: renamed from: fg0.a$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1412a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f62384d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f62385e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f62386f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f62388h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f62389j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f62390k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f62391l;

                public C1412a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f62384d = obj;
                    this.f62385e |= PKIFailureInfo.systemUnavail;
                    return C1411a.this.F(null, this);
                }
            }

            public C1411a(mu.h hVar) {
                this.f62383a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1412a c1412a;
                CertificateStatusEntity certificateStatus;
                if (eVar instanceof C1412a) {
                    c1412a = (C1412a) eVar;
                    int i15 = c1412a.f62385e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1412a.f62385e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1412a = new C1412a(eVar);
                    }
                } else {
                    c1412a = new C1412a(eVar);
                }
                Object obj2 = c1412a.f62384d;
                Object objE = uq.b.e();
                int i16 = c1412a.f62385e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f62383a;
                    CertificateEntity certificateEntity = (CertificateEntity) obj;
                    wf0.a aVarR = (certificateEntity == null || (certificateStatus = certificateEntity.getCertificateStatus()) == null) ? null : fg0.d.r(certificateStatus);
                    c1412a.f62386f = vq.j.a(obj);
                    c1412a.f62388h = vq.j.a(c1412a);
                    c1412a.f62389j = vq.j.a(obj);
                    c1412a.f62390k = vq.j.a(hVar);
                    c1412a.f62391l = 0;
                    c1412a.f62385e = 1;
                    if (hVar.F(aVarR, c1412a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public f(mu.g gVar) {
            this.f62382a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wf0.a> hVar, tq.e eVar) {
            Object objA = this.f62382a.a(new C1411a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62396h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62397j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62398k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62399l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62400m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62401n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62403q;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62401n = obj;
            this.f62403q |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f62404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62408h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62409j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62410k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62411l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62412m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62413n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62415q;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62413n = obj;
            this.f62415q |= PKIFailureInfo.systemUnavail;
            return a.this.e(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62420h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62423l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62424m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62425n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62427q;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62425n = obj;
            this.f62427q |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62432h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62433j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62434k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62435l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62436m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62437n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62439q;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62437n = obj;
            this.f62439q |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    public a(p10.f fVar, i0 i0Var, m mVar) {
        this.dbProvider = fVar;
        this.certificateDecoder = i0Var;
        this.rsaKeyDecoder = mVar;
    }

    private final dx.i<dx.b, ContainersDatabase> k() {
        p10.f fVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        ContainersDatabase.Companion cVar = ContainersDatabase.INSTANCE;
        return fVar.b(ContainersDatabase.class, listN, v.q(cVar.b(), cVar.c()), cVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, wf0.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.a
    public Object a(wf0.a aVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        i iVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f62427q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f62427q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f62425n;
        Object objE = uq.b.e();
        int i16 = iVar.f62427q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        gg0.a aVarC0 = ((ContainersDatabase) aVar2.a(k())).c0();
                        CertificateStatusEntity certificateStatusEntityU = fg0.d.u(aVar);
                        iVar.f62416d = vq.j.a(aVar);
                        iVar.f62417e = jVarA;
                        iVar.f62418f = vq.j.a(aVar2);
                        iVar.f62419g = vq.j.a(aVar2);
                        iVar.f62420h = 0;
                        iVar.f62421j = 0;
                        iVar.f62422k = 0;
                        iVar.f62423l = 0;
                        iVar.f62424m = 0;
                        iVar.f62427q = 1;
                        if (aVarC0.j(certificateStatusEntityU, iVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        aVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        dx.i iVarA = aVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ry.c] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.a
    public Object b(CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        j jVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f62439q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f62439q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object obj = jVar.f62437n;
        Object objE = uq.b.e();
        int i16 = jVar.f62439q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.a aVarC0 = ((ContainersDatabase) aVar.a(k())).c0();
                        byte[] encoded = certKeyPair.getCertificate().getEncoded();
                        byte[] encoded2 = certKeyPair.getPrivateKey().getEncoded();
                        CertificateStatusEntity certificateStatusEntity = CertificateStatusEntity.NOT_ACTIVATED;
                        jVar.f62428d = vq.j.a(certKeyPair);
                        jVar.f62429e = jVarA;
                        jVar.f62430f = vq.j.a(aVar);
                        jVar.f62431g = vq.j.a(aVar);
                        jVar.f62432h = 0;
                        jVar.f62433j = 0;
                        jVar.f62434k = 0;
                        jVar.f62435l = 0;
                        jVar.f62436m = 0;
                        jVar.f62439q = 1;
                        if (aVarC0.i(encoded, encoded2, certificateStatusEntity, jVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        certKeyPair = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(certKeyPair));
                        dx.i iVarA = certKeyPair.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // mg0.a
    public Object c(CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        g gVar;
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        ex.b aVar2;
        int i15;
        CertKeyPair certKeyPair2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i25 = gVar.f62403q;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f62403q = i25 - PKIFailureInfo.systemUnavail;
                aVar = this;
            } else {
                aVar = this;
                gVar = aVar.new g(eVar);
            }
        } else {
            aVar = this;
            gVar = aVar.new g(eVar);
        }
        Object obj = gVar.f62401n;
        ?? E = uq.b.e();
        int i26 = gVar.f62403q;
        try {
            try {
                if (i26 == 0) {
                    u.b(obj);
                    jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        gg0.a aVarC0 = ((ContainersDatabase) aVar2.a(aVar.k())).c0();
                        gVar.f62392d = certKeyPair;
                        gVar.f62393e = jVarA;
                        gVar.f62394f = vq.j.a(aVar2);
                        gVar.f62395g = aVar2;
                        i15 = 0;
                        gVar.f62396h = 0;
                        gVar.f62397j = 0;
                        gVar.f62398k = 0;
                        gVar.f62399l = 0;
                        gVar.f62400m = 0;
                        gVar.f62403q = 1;
                        if (aVarC0.h(gVar) != E) {
                            certKeyPair2 = certKeyPair;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = gVar.f62400m;
                i17 = gVar.f62399l;
                i18 = gVar.f62398k;
                int i28 = gVar.f62397j;
                i19 = gVar.f62396h;
                aVar2 = (ex.b) gVar.f62395g;
                bVar = (ex.b) gVar.f62394f;
                dx.j<dx.b> jVar = (dx.j) gVar.f62393e;
                certKeyPair2 = (CertKeyPair) gVar.f62392d;
                try {
                    u.b(obj);
                    i16 = i28;
                    i15 = i27;
                    jVarA = jVar;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
                gg0.a aVarC1 = ((ContainersDatabase) aVar2.a(aVar.k())).c0();
                CertificateEntity certificateEntity = new CertificateEntity(0, certKeyPair2.getCertificate().getEncoded(), certKeyPair2.getPrivateKey().getEncoded(), CertificateStatusEntity.NOT_ACTIVATED, false, 17, null);
                gVar.f62392d = vq.j.a(certKeyPair2);
                gVar.f62393e = jVarA;
                gVar.f62394f = vq.j.a(bVar);
                gVar.f62395g = vq.j.a(aVar2);
                gVar.f62396h = i19;
                gVar.f62397j = i16;
                gVar.f62398k = i18;
                gVar.f62399l = i17;
                gVar.f62400m = i15;
                gVar.f62403q = 2;
                if (aVarC1.k(certificateEntity, gVar) != E) {
                    return new dx.i.Right(oq.i0.f148189a);
                }
                return E;
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.a$d, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.a] */
    @Override // mg0.a
    public Object d(tq.e<? super dx.i<? extends dx.b, ? extends wf0.a>> eVar) throws Throwable {
        ?? dVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        CertificateEntity certificateEntity;
        CertificateStatusEntity certificateStatus;
        wf0.a aVarR;
        if (eVar instanceof d) {
            d dVar2 = (d) eVar;
            int i15 = dVar2.f62370p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f62370p = i15 - PKIFailureInfo.systemUnavail;
                dVar = dVar2;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f62368m;
        Object objE = uq.b.e();
        int i16 = dVar.f62370p;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) dVar.f62367l;
                    try {
                        u.b(obj);
                        certificateEntity = (CertificateEntity) obj;
                        if (certificateEntity == null && (certificateStatus = certificateEntity.getCertificateStatus()) != null && (aVarR = fg0.d.r(certificateStatus)) != null) {
                            return new dx.i.Right(aVarR);
                        }
                        bVar.b(new dx.b.Generic(new Exception("Could not get the certificate status.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    ?? C0 = ((ContainersDatabase) aVar.a(k())).c0();
                    dVar.f62365j = jVarA;
                    dVar.f62366k = vq.j.a(aVar);
                    dVar.f62367l = aVar;
                    dVar.f62360d = 0;
                    dVar.f62361e = 0;
                    dVar.f62362f = 0;
                    dVar.f62363g = 0;
                    dVar.f62364h = 0;
                    dVar.f62370p = 1;
                    Object objD = C0.d(dVar);
                    if (objD == objE) {
                        return objE;
                    }
                    obj = objD;
                    bVar = aVar;
                    certificateEntity = (CertificateEntity) obj;
                    if (certificateEntity == null) {
                    }
                    bVar.b(new dx.b.Generic(new Exception("Could not get the certificate status.")));
                    throw new oq.g();
                } catch (ex.c e18) {
                    e15 = e18;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    dVar = jVarA;
                    e = e25;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(dVar));
                    dx.i iVarA = dVar.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.a
    public Object e(boolean z15, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        h hVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f62415q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f62415q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f62413n;
        Object objE = uq.b.e();
        int i16 = hVar.f62415q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.a aVarC0 = ((ContainersDatabase) aVar.a(k())).c0();
                        hVar.f62410k = jVarA;
                        hVar.f62411l = vq.j.a(aVar);
                        hVar.f62412m = vq.j.a(aVar);
                        hVar.f62404d = z15;
                        hVar.f62405e = 0;
                        hVar.f62406f = 0;
                        hVar.f62407g = 0;
                        hVar.f62408h = 0;
                        hVar.f62409j = 0;
                        hVar.f62415q = 1;
                        if (aVarC0.e(z15, hVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        z15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(z15));
                        dx.i iVarA = z15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: Exception -> 0x0125, c -> 0x0128, CancellationException -> 0x012b, TRY_LEAVE, TryCatch #7 {c -> 0x0128, CancellationException -> 0x012b, Exception -> 0x0125, blocks: (B:37:0x00cb, B:39:0x00cf, B:51:0x012e, B:52:0x0142, B:33:0x0094), top: B:74:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e A[Catch: Exception -> 0x0125, c -> 0x0128, CancellationException -> 0x012b, TRY_ENTER, TryCatch #7 {c -> 0x0128, CancellationException -> 0x012b, Exception -> 0x0125, blocks: (B:37:0x00cb, B:39:0x00cf, B:51:0x012e, B:52:0x0142, B:33:0x0094), top: B:74:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x018a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [gg0.a] */
    /* JADX WARN: Type inference failed for: r15v1, types: [py.m] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [fg0.a$c, tq.e] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // mg0.a
    public Object f(tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) throws Throwable {
        ?? cVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        int i19;
        CertificateEntity certificateEntity;
        X509Certificate x509Certificate;
        ex.b bVar3;
        X509Certificate x509Certificate2;
        if (eVar instanceof c) {
            c cVar2 = (c) eVar;
            int i25 = cVar2.f62359t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f62359t = i25 - PKIFailureInfo.systemUnavail;
                cVar = cVar2;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f62357r;
        Object objE = uq.b.e();
        int i26 = cVar.f62359t;
        try {
            try {
                if (i26 == 0) {
                    u.b(objD);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? C0 = ((ContainersDatabase) aVar.a(k())).c0();
                        cVar.f62351k = jVarA;
                        cVar.f62352l = vq.j.a(aVar);
                        cVar.f62353m = aVar;
                        cVar.f62345d = 0;
                        cVar.f62346e = 0;
                        cVar.f62347f = 0;
                        cVar.f62348g = 0;
                        cVar.f62349h = 0;
                        cVar.f62359t = 1;
                        objD = C0.d(cVar);
                        if (objD != objE) {
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                            i19 = 0;
                            certificateEntity = (CertificateEntity) objD;
                            if (certificateEntity != null) {
                                bVar.b(new dx.b.Generic(new Exception("Could not get the CertKeyPair.")));
                                throw new oq.g();
                            }
                            x509Certificate = (X509Certificate) bVar.a(this.certificateDecoder.decode(certificateEntity.getCertificateBytes()));
                            ?? r15 = this.rsaKeyDecoder;
                            byte[] privateKeyBytes = certificateEntity.getPrivateKeyBytes();
                            cVar.f62351k = jVarA;
                            cVar.f62352l = vq.j.a(bVar2);
                            cVar.f62353m = bVar;
                            cVar.f62354n = vq.j.a(certificateEntity);
                            cVar.f62355p = x509Certificate;
                            cVar.f62356q = bVar;
                            cVar.f62345d = i19;
                            cVar.f62346e = i18;
                            cVar.f62347f = i17;
                            cVar.f62348g = i16;
                            cVar.f62349h = i15;
                            cVar.f62350j = 0;
                            cVar.f62359t = 2;
                            objD = r15.b(privateKeyBytes, cVar);
                            if (objD != objE) {
                                bVar3 = bVar;
                                x509Certificate2 = x509Certificate;
                                return new dx.i.Right(new CertKeyPair(x509Certificate2, (PrivateKey) bVar3.a((dx.i) objD)));
                            }
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        cVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(cVar));
                        iVarA = cVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = (ex.b) cVar.f62356q;
                    x509Certificate2 = (X509Certificate) cVar.f62355p;
                    try {
                        u.b(objD);
                        return new dx.i.Right(new CertKeyPair(x509Certificate2, (PrivateKey) bVar3.a((dx.i) objD)));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = cVar.f62349h;
                int i28 = cVar.f62348g;
                int i29 = cVar.f62347f;
                int i35 = cVar.f62346e;
                int i36 = cVar.f62345d;
                bVar = (ex.b) cVar.f62353m;
                ex.b bVar4 = (ex.b) cVar.f62352l;
                dx.j<dx.b> jVar = (dx.j) cVar.f62351k;
                try {
                    u.b(objD);
                    i15 = i27;
                    jVarA = jVar;
                    bVar2 = bVar4;
                    i19 = i36;
                    i18 = i35;
                    i17 = i29;
                    i16 = i28;
                    certificateEntity = (CertificateEntity) objD;
                    if (certificateEntity != null) {
                        bVar.b(new dx.b.Generic(new Exception("Could not get the CertKeyPair.")));
                        throw new oq.g();
                    }
                    x509Certificate = (X509Certificate) bVar.a(this.certificateDecoder.decode(certificateEntity.getCertificateBytes()));
                    ?? r16 = this.rsaKeyDecoder;
                    byte[] privateKeyBytes2 = certificateEntity.getPrivateKeyBytes();
                    cVar.f62351k = jVarA;
                    cVar.f62352l = vq.j.a(bVar2);
                    cVar.f62353m = bVar;
                    cVar.f62354n = vq.j.a(certificateEntity);
                    cVar.f62355p = x509Certificate;
                    cVar.f62356q = bVar;
                    cVar.f62345d = i19;
                    cVar.f62346e = i18;
                    cVar.f62347f = i17;
                    cVar.f62348g = i16;
                    cVar.f62349h = i15;
                    cVar.f62350j = 0;
                    cVar.f62359t = 2;
                    objD = r16.b(privateKeyBytes2, cVar);
                    if (objD != objE) {
                        bVar3 = bVar;
                        x509Certificate2 = x509Certificate;
                        return new dx.i.Right(new CertKeyPair(x509Certificate2, (PrivateKey) bVar3.a((dx.i) objD)));
                    }
                    return objE;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    cVar = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(cVar));
                    iVarA = cVar.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.a$e, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.a] */
    @Override // mg0.a
    public Object g(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        ?? eVar2;
        Object objB;
        ex.c e15;
        if (eVar instanceof e) {
            e eVar3 = (e) eVar;
            int i15 = eVar3.f62381p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar3.f62381p = i15 - PKIFailureInfo.systemUnavail;
                eVar2 = eVar3;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f62379m;
        Object objE = uq.b.e();
        int i16 = eVar2.f62381p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? C0 = ((ContainersDatabase) aVar.a(k())).c0();
                        eVar2.f62376j = jVarA;
                        eVar2.f62377k = vq.j.a(aVar);
                        eVar2.f62378l = vq.j.a(aVar);
                        eVar2.f62371d = 0;
                        eVar2.f62372e = 0;
                        eVar2.f62373f = 0;
                        eVar2.f62374g = 0;
                        eVar2.f62375h = 0;
                        eVar2.f62381p = 1;
                        Object objG = C0.g(eVar2);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        eVar2 = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(eVar2));
                        dx.i iVarA = eVar2.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(vq.b.a(((Boolean) obj).booleanValue()));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #4 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x0084, B:29:0x0088, B:30:0x0097, B:31:0x00ab, B:38:0x00bb, B:41:0x00c9), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #4 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x0084, B:29:0x0088, B:30:0x0097, B:31:0x00ab, B:38:0x00bb, B:41:0x00c9), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.a$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.a] */
    @Override // mg0.a
    public Object h(tq.e<? super dx.i<? extends dx.b, Integer>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        ex.b bVar2;
        CertificateEntity certificateEntity;
        if (eVar instanceof b) {
            b bVar3 = (b) eVar;
            int i15 = bVar3.f62344p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar3.f62344p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar3;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f62342m;
        Object objE = uq.b.e();
        int i16 = bVar.f62344p;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f62341l;
                    try {
                        u.b(obj);
                        certificateEntity = (CertificateEntity) obj;
                        if (certificateEntity != null) {
                            return new dx.i.Right(vq.b.e(certificateEntity.getId()));
                        }
                        bVar2.b(new dx.b.Generic(new Exception("Could not get the CertKeyPair ID.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    ?? C0 = ((ContainersDatabase) aVar.a(k())).c0();
                    bVar.f62339j = jVarA;
                    bVar.f62340k = vq.j.a(aVar);
                    bVar.f62341l = aVar;
                    bVar.f62334d = 0;
                    bVar.f62335e = 0;
                    bVar.f62336f = 0;
                    bVar.f62337g = 0;
                    bVar.f62338h = 0;
                    bVar.f62344p = 1;
                    Object objD = C0.d(bVar);
                    if (objD == objE) {
                        return objE;
                    }
                    obj = objD;
                    bVar2 = aVar;
                    certificateEntity = (CertificateEntity) obj;
                    if (certificateEntity != null) {
                        return new dx.i.Right(vq.b.e(certificateEntity.getId()));
                    }
                    bVar2.b(new dx.b.Generic(new Exception("Could not get the CertKeyPair ID.")));
                    throw new oq.g();
                } catch (ex.c e18) {
                    e15 = e18;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    bVar = jVarA;
                    e = e25;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(bVar));
                    dx.i iVarA = bVar.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // mg0.a
    public mu.g<wf0.a> i() {
        dx.i<dx.b, ContainersDatabase> iVarK = k();
        if (iVarK instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarK instanceof dx.i.Right) {
            return mu.i.M(new f(mu.i.p(((ContainersDatabase) ((dx.i.Right) iVarK).b()).c0().f())), g1.b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.a$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.a] */
    @Override // mg0.a
    public Object j(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        ?? c1410a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C1410a) {
            C1410a c1410a2 = (C1410a) eVar;
            int i15 = c1410a2.f62333p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1410a2.f62333p = i15 - PKIFailureInfo.systemUnavail;
                c1410a = c1410a2;
            } else {
                c1410a = new C1410a(eVar);
            }
        } else {
            c1410a = new C1410a(eVar);
        }
        Object obj = c1410a.f62331m;
        Object objE = uq.b.e();
        int i16 = c1410a.f62333p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? C0 = ((ContainersDatabase) aVar.a(k())).c0();
                        c1410a.f62328j = jVarA;
                        c1410a.f62329k = vq.j.a(aVar);
                        c1410a.f62330l = vq.j.a(aVar);
                        c1410a.f62323d = 0;
                        c1410a.f62324e = 0;
                        c1410a.f62325f = 0;
                        c1410a.f62326g = 0;
                        c1410a.f62327h = 0;
                        c1410a.f62333p = 1;
                        if (C0.h(c1410a) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c1410a = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c1410a));
                        dx.i iVarA = c1410a.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
