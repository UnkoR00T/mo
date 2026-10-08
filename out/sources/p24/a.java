package p24;

import f24.CertificateData;
import f24.CertificateTypeStatus;
import iy.b0;
import iy.c0;
import iy.i0;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.g1;
import l24.n;
import m24.CertificateEntity;
import m24.ParentDocumentWithCertificate;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.ContainersDatabase;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;
import pq.v;
import py.m;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u0001\u001fB)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001d\u0010\u001bJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001e0\fH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b%\u0010\u001bJ$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b'\u0010\u001bJ,\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,H\u0016¢\u0006\u0004\b.\u0010/J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107¨\u00068"}, d2 = {"Lp24/a;", "Lv24/a;", "Lp10/f;", "dbProvider", "Lpy/m;", "rsaKeyDecoder", "Liy/i0;", "certificateDecoder", "Lpx/d;", "remoteLogger", "<init>", "(Lp10/f;Lpy/m;Liy/i0;Lpx/d;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/ContainersDatabase;", "k", "()Ldx/i;", "Lf24/c;", "certificateType", "Lry/c;", "certKeyPair", "Liy/b0;", "peselTicket", "", "g", "(Lf24/c;Lry/c;Liy/b0;Ltq/e;)Ljava/lang/Object;", "j", "(Lf24/c;Ltq/e;)Ljava/lang/Object;", "Lf24/a;", "b", "", "a", "(Ltq/e;)Ljava/lang/Object;", "Lf24/i;", "parentDocumentType", "d", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "h", "Loq/i0;", "c", "Lf24/b;", "newStatus", "i", "(Lf24/c;Lf24/b;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lf24/d;", "f", "()Lmu/g;", "", "onlyActive", "e", "(ZLtq/e;)Ljava/lang/Object;", "Lp10/f;", "Lpy/m;", "Liy/i0;", "Lpx/d;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements v24.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<f24.c> f151943f = v.q(f24.c.CITIZEN, f24.c.UNIVERSITY, f24.c.REFUGEE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p10.f dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m rsaKeyDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 certificateDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151948a;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.c.CITIZEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.c.REFUGEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151948a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f151953h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151954j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151955k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151956l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151957m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151958n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151960q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151958n = obj;
            this.f151960q |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f151961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f151963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f151964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f151965h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151966j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151967k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151968l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f151969m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f151970n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f151971p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f151972q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f151973r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f151974s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f151975t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f151976v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f151977w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f151978x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f151979y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f151980z;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151985h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151986j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f151987k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151988l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151989m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f151990n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f151991p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151992q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f151993r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f151994s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f151996v;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151994s = obj;
            this.f151996v |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152001h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152005m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152006n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152007p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152008q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152009r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f152010s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f152012v;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152010s = obj;
            this.f152012v |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152017h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152018j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152019k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152020l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152021m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152022n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152024q;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152022n = obj;
            this.f152024q |= PKIFailureInfo.systemUnavail;
            return a.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f152025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152029h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152030j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152031k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152032l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152033m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f152034n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f152035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f152036q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f152037r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f152038s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f152039t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f152040v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f152041w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f152042x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f152044z;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152042x = obj;
            this.f152044z |= PKIFailureInfo.systemUnavail;
            return a.this.e(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152049h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152053m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152054n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152056q;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152054n = obj;
            this.f152056q |= PKIFailureInfo.systemUnavail;
            return a.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements mu.g<CertificateTypeStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f152057a;

        /* JADX INFO: renamed from: p24.a$j$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3744a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f152058a;

            /* JADX INFO: renamed from: p24.a$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3745a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f152059d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f152060e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f152061f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f152063h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f152064j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f152065k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f152066l;

                public C3745a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f152059d = obj;
                    this.f152060e |= PKIFailureInfo.systemUnavail;
                    return C3744a.this.F(null, this);
                }
            }

            public C3744a(mu.h hVar) {
                this.f152058a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3745a c3745a;
                if (eVar instanceof C3745a) {
                    c3745a = (C3745a) eVar;
                    int i15 = c3745a.f152060e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3745a.f152060e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3745a = new C3745a(eVar);
                    }
                } else {
                    c3745a = new C3745a(eVar);
                }
                Object obj2 = c3745a.f152059d;
                Object objE = uq.b.e();
                int i16 = c3745a.f152060e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f152058a;
                    CertificateEntity certificateEntity = (CertificateEntity) obj;
                    CertificateTypeStatus certificateTypeStatus = certificateEntity != null ? new CertificateTypeStatus(n24.a.i(certificateEntity.getCertificateTypeEntity()), n24.a.h(certificateEntity.getCertificateStatus())) : null;
                    c3745a.f152061f = vq.j.a(obj);
                    c3745a.f152063h = vq.j.a(c3745a);
                    c3745a.f152064j = vq.j.a(obj);
                    c3745a.f152065k = vq.j.a(hVar);
                    c3745a.f152066l = 0;
                    c3745a.f152060e = 1;
                    if (hVar.F(certificateTypeStatus, c3745a) == objE) {
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

        public j(mu.g gVar) {
            this.f152057a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super CertificateTypeStatus> hVar, tq.e eVar) {
            Object objA = this.f152057a.a(new C3744a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152071h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152073k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152074l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152076n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152077p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152078q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152079r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152080s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152081t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f152082v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152084x;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152082v = obj;
            this.f152084x |= PKIFailureInfo.systemUnavail;
            return a.this.g(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152089h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152090j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152091k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152092l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152093m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152094n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f152095p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152097r;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152095p = obj;
            this.f152097r |= PKIFailureInfo.systemUnavail;
            return a.this.i(null, null, this);
        }
    }

    public a(p10.f fVar, m mVar, i0 i0Var, px.d dVar) {
        this.dbProvider = fVar;
        this.rsaKeyDecoder = mVar;
        this.certificateDecoder = i0Var;
        this.remoteLogger = dVar;
    }

    private final dx.i<dx.b, ContainersDatabase> k() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right((ContainersDatabase) new ex.a().a(this.dbProvider.b(ContainersDatabase.class, v.n(), v.n(), ContainersDatabase.INSTANCE.a())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0134 A[Catch: Exception -> 0x01f4, c -> 0x01f8, CancellationException -> 0x01fc, TRY_LEAVE, TryCatch #8 {c -> 0x01f8, CancellationException -> 0x01fc, Exception -> 0x01f4, blocks: (B:33:0x012e, B:35:0x0134), top: B:85:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x008c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:16:0x008c */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x019f -> B:83:0x01ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v24.a
    public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<f24.CertificateData>>> r24) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p24.a.a(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[Catch: Exception -> 0x007f, c -> 0x0083, CancellationException -> 0x0087, TRY_LEAVE, TryCatch #8 {c -> 0x0083, CancellationException -> 0x0087, Exception -> 0x007f, blocks: (B:24:0x007b, B:37:0x00cf, B:39:0x00d3, B:45:0x0144, B:46:0x0170), top: B:72:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144 A[Catch: Exception -> 0x007f, c -> 0x0083, CancellationException -> 0x0087, TRY_ENTER, TryCatch #8 {c -> 0x0083, CancellationException -> 0x0087, Exception -> 0x007f, blocks: (B:24:0x007b, B:37:0x00cf, B:39:0x00d3, B:45:0x0144, B:46:0x0170), top: B:72:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0192  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0144, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // v24.a
    public Object b(f24.c cVar, tq.e<? super dx.i<? extends dx.b, CertificateData>> eVar) throws Throwable {
        e eVar2;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        f24.c cVar2;
        dx.j<dx.b> jVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        CertificateEntity certificateEntity;
        X509Certificate x509Certificate;
        Object objB2;
        CertificateEntity certificateEntity2;
        ex.b bVar2;
        X509Certificate x509Certificate2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i25 = eVar2.f151996v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f151996v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f151994s;
        Object objE = uq.b.e();
        int i26 = eVar2.f151996v;
        ?? r15 = 2;
        try {
            try {
                if (i26 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        l24.a aVarA0 = ((ContainersDatabase) aVar.a(k())).a0();
                        eVar2.f151981d = cVar;
                        eVar2.f151982e = jVarA;
                        eVar2.f151983f = vq.j.a(aVar);
                        eVar2.f151984g = aVar;
                        eVar2.f151988l = 0;
                        eVar2.f151989m = 0;
                        eVar2.f151990n = 0;
                        eVar2.f151991p = 0;
                        eVar2.f151992q = 0;
                        eVar2.f151996v = 1;
                        Object objB3 = aVarA0.b(cVar, eVar2);
                        if (objB3 != objE) {
                            cVar2 = cVar;
                            jVar = jVarA;
                            obj = objB3;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar;
                            certificateEntity = (CertificateEntity) obj;
                            if (certificateEntity != null) {
                                bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate")));
                                throw new oq.g();
                            }
                            x509Certificate = (X509Certificate) bVar.a(this.certificateDecoder.decode(certificateEntity.getCertificate()));
                            m mVar = this.rsaKeyDecoder;
                            byte[] privateKey = certificateEntity.getPrivateKey();
                            eVar2.f151981d = cVar2;
                            eVar2.f151982e = jVar;
                            eVar2.f151983f = vq.j.a(aVar);
                            eVar2.f151984g = bVar;
                            eVar2.f151985h = certificateEntity;
                            eVar2.f151986j = bVar;
                            eVar2.f151987k = x509Certificate;
                            eVar2.f151988l = i19;
                            eVar2.f151989m = i18;
                            eVar2.f151990n = i17;
                            eVar2.f151991p = i16;
                            eVar2.f151992q = i15;
                            eVar2.f151993r = 0;
                            eVar2.f151996v = 2;
                            objB2 = mVar.b(privateKey, eVar2);
                            if (objB2 != objE) {
                                certificateEntity2 = certificateEntity;
                                bVar2 = bVar;
                                obj = objB2;
                                x509Certificate2 = x509Certificate;
                                return new dx.i.Right(new CertificateData(new CertKeyPair(x509Certificate2, (PrivateKey) bVar2.a((dx.i) obj)), n24.a.i(certificateEntity2.getCertificateTypeEntity()), n24.a.h(certificateEntity2.getCertificateStatus()), certificateEntity2.getId()));
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
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                    x509Certificate2 = (X509Certificate) eVar2.f151987k;
                    bVar2 = (ex.b) eVar2.f151986j;
                    certificateEntity2 = (CertificateEntity) eVar2.f151985h;
                    try {
                        u.b(obj);
                        return new dx.i.Right(new CertificateData(new CertKeyPair(x509Certificate2, (PrivateKey) bVar2.a((dx.i) obj)), n24.a.i(certificateEntity2.getCertificateTypeEntity()), n24.a.h(certificateEntity2.getCertificateStatus()), certificateEntity2.getId()));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                i15 = eVar2.f151992q;
                i16 = eVar2.f151991p;
                i17 = eVar2.f151990n;
                i18 = eVar2.f151989m;
                i19 = eVar2.f151988l;
                bVar = (ex.b) eVar2.f151984g;
                aVar = (ex.b) eVar2.f151983f;
                jVar = (dx.j) eVar2.f151982e;
                cVar2 = (f24.c) eVar2.f151981d;
                try {
                    u.b(obj);
                    certificateEntity = (CertificateEntity) obj;
                    if (certificateEntity != null) {
                        bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate")));
                        throw new oq.g();
                    }
                    x509Certificate = (X509Certificate) bVar.a(this.certificateDecoder.decode(certificateEntity.getCertificate()));
                    m mVar2 = this.rsaKeyDecoder;
                    byte[] privateKey2 = certificateEntity.getPrivateKey();
                    eVar2.f151981d = cVar2;
                    eVar2.f151982e = jVar;
                    eVar2.f151983f = vq.j.a(aVar);
                    eVar2.f151984g = bVar;
                    eVar2.f151985h = certificateEntity;
                    eVar2.f151986j = bVar;
                    eVar2.f151987k = x509Certificate;
                    eVar2.f151988l = i19;
                    eVar2.f151989m = i18;
                    eVar2.f151990n = i17;
                    eVar2.f151991p = i16;
                    eVar2.f151992q = i15;
                    eVar2.f151993r = 0;
                    eVar2.f151996v = 2;
                    objB2 = mVar2.b(privateKey2, eVar2);
                    if (objB2 != objE) {
                        certificateEntity2 = certificateEntity;
                        bVar2 = bVar;
                        obj = objB2;
                        x509Certificate2 = x509Certificate;
                        return new dx.i.Right(new CertificateData(new CertKeyPair(x509Certificate2, (PrivateKey) bVar2.a((dx.i) obj)), n24.a.i(certificateEntity2.getCertificateTypeEntity()), n24.a.h(certificateEntity2.getCertificateStatus()), certificateEntity2.getId()));
                    }
                    return objE;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
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
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [f24.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // v24.a
    public Object c(f24.c cVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        c cVar2;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar2 = (c) eVar;
            int i15 = cVar2.f151960q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f151960q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(eVar);
            }
        } else {
            cVar2 = new c(eVar);
        }
        Object obj = cVar2.f151958n;
        Object objE = uq.b.e();
        int i16 = cVar2.f151960q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.a aVarA0 = ((ContainersDatabase) aVar.a(k())).a0();
                        CertificateEntityType certificateEntityTypeI1 = n24.a.i1(cVar);
                        cVar2.f151949d = vq.j.a(cVar);
                        cVar2.f151950e = jVarA;
                        cVar2.f151951f = vq.j.a(aVar);
                        cVar2.f151952g = vq.j.a(aVar);
                        cVar2.f151953h = 0;
                        cVar2.f151954j = 0;
                        cVar2.f151955k = 0;
                        cVar2.f151956l = 0;
                        cVar2.f151957m = 0;
                        cVar2.f151960q = 1;
                        if (aVarA0.c(certificateEntityTypeI1, cVar2) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        cVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(cVar));
                        dx.i iVarA = cVar.a(e);
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

    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // v24.a
    public Object d(f24.i iVar, tq.e<? super dx.i<? extends dx.b, CertificateData>> eVar) throws Throwable {
        f fVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        dx.j<dx.b> jVar;
        int i15;
        int i16;
        int i17;
        int i18;
        f24.i iVar2;
        ex.b bVar;
        int i19;
        ParentDocumentWithCertificate parentDocumentWithCertificate;
        CertificateEntity certificate;
        X509Certificate x509Certificate;
        CertificateEntity certificateEntity;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i25 = fVar.f152012v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f152012v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objN = fVar.f152010s;
        Object objE = uq.b.e();
        int i26 = fVar.f152012v;
        ?? r15 = 1;
        try {
            try {
                if (i26 == 0) {
                    u.b(objN);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        n nVarB0 = ((ContainersDatabase) aVar.a(k())).b0();
                        DocumentEntityType documentEntityTypeD = n24.a.d(iVar);
                        fVar.f151997d = iVar;
                        fVar.f151998e = jVarA;
                        fVar.f151999f = vq.j.a(aVar);
                        fVar.f152000g = aVar;
                        fVar.f152004l = 0;
                        fVar.f152005m = 0;
                        fVar.f152006n = 0;
                        fVar.f152007p = 0;
                        fVar.f152008q = 0;
                        fVar.f152012v = 1;
                        objN = nVarB0.n(documentEntityTypeD, fVar);
                        if (objN != objE) {
                            jVar = jVarA;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            iVar2 = iVar;
                            bVar = aVar;
                            i19 = 0;
                            parentDocumentWithCertificate = (ParentDocumentWithCertificate) objN;
                            if (parentDocumentWithCertificate != null) {
                            }
                            bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + iVar2 + " certificate")));
                            throw new oq.g();
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                    x509Certificate = (X509Certificate) fVar.f152003k;
                    bVar = (ex.b) fVar.f152002j;
                    certificateEntity = (CertificateEntity) fVar.f152001h;
                    try {
                        u.b(objN);
                        return new dx.i.Right(new CertificateData(new CertKeyPair(x509Certificate, (PrivateKey) bVar.a((dx.i) objN)), n24.a.i(certificateEntity.getCertificateTypeEntity()), n24.a.h(certificateEntity.getCertificateStatus()), certificateEntity.getId()));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = fVar.f152008q;
                int i28 = fVar.f152007p;
                int i29 = fVar.f152006n;
                int i35 = fVar.f152005m;
                int i36 = fVar.f152004l;
                ex.b bVar2 = (ex.b) fVar.f152000g;
                aVar = (ex.b) fVar.f151999f;
                jVar = (dx.j) fVar.f151998e;
                iVar2 = (f24.i) fVar.f151997d;
                try {
                    u.b(objN);
                    i15 = i27;
                    bVar = bVar2;
                    i18 = i36;
                    i17 = i35;
                    i19 = i29;
                    i16 = i28;
                    parentDocumentWithCertificate = (ParentDocumentWithCertificate) objN;
                    if (parentDocumentWithCertificate != null || (certificate = parentDocumentWithCertificate.getCertificate()) == null) {
                        bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + iVar2 + " certificate")));
                        throw new oq.g();
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) bVar.a(this.certificateDecoder.decode(certificate.getCertificate()));
                    m mVar = this.rsaKeyDecoder;
                    byte[] privateKey = certificate.getPrivateKey();
                    fVar.f151997d = iVar2;
                    fVar.f151998e = jVar;
                    fVar.f151999f = vq.j.a(aVar);
                    fVar.f152000g = bVar;
                    fVar.f152001h = certificate;
                    fVar.f152002j = bVar;
                    fVar.f152003k = x509Certificate2;
                    fVar.f152004l = i18;
                    fVar.f152005m = i17;
                    fVar.f152006n = i19;
                    fVar.f152007p = i16;
                    fVar.f152008q = i15;
                    fVar.f152009r = 0;
                    fVar.f152012v = 2;
                    Object objB2 = mVar.b(privateKey, fVar);
                    if (objB2 != objE) {
                        x509Certificate = x509Certificate2;
                        certificateEntity = certificate;
                        objN = objB2;
                        return new dx.i.Right(new CertificateData(new CertKeyPair(x509Certificate, (PrivateKey) bVar.a((dx.i) objN)), n24.a.i(certificateEntity.getCertificateTypeEntity()), n24.a.h(certificateEntity.getCertificateStatus()), certificateEntity.getId()));
                    }
                    return objE;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVar;
                    px.f fVar3 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar3.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
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
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x0058, B:47:0x019a, B:49:0x019e, B:34:0x00d3, B:36:0x00d9, B:38:0x00f2, B:42:0x0143, B:43:0x0151, B:51:0x01b2, B:55:0x01c2, B:56:0x01e0, B:57:0x01e1, B:60:0x01ef, B:33:0x00ba), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2 A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x0058, B:47:0x019a, B:49:0x019e, B:34:0x00d3, B:36:0x00d9, B:38:0x00f2, B:42:0x0143, B:43:0x0151, B:51:0x01b2, B:55:0x01c2, B:56:0x01e0, B:57:0x01e1, B:60:0x01ef, B:33:0x00ba), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x019e A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x0058, B:47:0x019a, B:49:0x019e, B:34:0x00d3, B:36:0x00d9, B:38:0x00f2, B:42:0x0143, B:43:0x0151, B:51:0x01b2, B:55:0x01c2, B:56:0x01e0, B:57:0x01e1, B:60:0x01ef, B:33:0x00ba), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ad -> B:34:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v24.a
    public java.lang.Object e(boolean r18, tq.e<? super dx.i<? extends dx.b, ? extends f24.c>> r19) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p24.a.e(boolean, tq.e):java.lang.Object");
    }

    @Override // v24.a
    public mu.g<CertificateTypeStatus> f() {
        dx.i<dx.b, ContainersDatabase> iVarK = k();
        if (iVarK instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarK instanceof dx.i.Right) {
            return mu.i.M(new j(mu.i.p(((ContainersDatabase) ((dx.i.Right) iVarK).b()).a0().f())), g1.b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0453  */
    /* JADX WARN: Code duplicated, block: B:106:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:119:0x0507  */
    /* JADX WARN: Code duplicated, block: B:121:0x050b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0518  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0287  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x032e A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TryCatch #9 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:22:0x008f, B:77:0x0303, B:103:0x045d, B:32:0x00e6, B:100:0x0420, B:44:0x017a, B:64:0x029a, B:71:0x02b7, B:72:0x02bc, B:73:0x02bd, B:78:0x032e, B:80:0x0334, B:86:0x03a2, B:87:0x03a9, B:89:0x03af, B:94:0x03ca, B:96:0x03cf), top: B:127:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0334 A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TRY_LEAVE, TryCatch #9 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:22:0x008f, B:77:0x0303, B:103:0x045d, B:32:0x00e6, B:100:0x0420, B:44:0x017a, B:64:0x029a, B:71:0x02b7, B:72:0x02bc, B:73:0x02bd, B:78:0x032e, B:80:0x0334, B:86:0x03a2, B:87:0x03a9, B:89:0x03af, B:94:0x03ca, B:96:0x03cf), top: B:127:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0373  */
    /* JADX WARN: Code duplicated, block: B:86:0x03a2 A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TRY_ENTER, TryCatch #9 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:22:0x008f, B:77:0x0303, B:103:0x045d, B:32:0x00e6, B:100:0x0420, B:44:0x017a, B:64:0x029a, B:71:0x02b7, B:72:0x02bc, B:73:0x02bd, B:78:0x032e, B:80:0x0334, B:86:0x03a2, B:87:0x03a9, B:89:0x03af, B:94:0x03ca, B:96:0x03cf), top: B:127:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x03af A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TryCatch #9 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:22:0x008f, B:77:0x0303, B:103:0x045d, B:32:0x00e6, B:100:0x0420, B:44:0x017a, B:64:0x029a, B:71:0x02b7, B:72:0x02bc, B:73:0x02bd, B:78:0x032e, B:80:0x0334, B:86:0x03a2, B:87:0x03a9, B:89:0x03af, B:94:0x03ca, B:96:0x03cf), top: B:127:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x03c4 A[LOOP:0: B:87:0x03a9->B:92:0x03c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x03cf A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TryCatch #9 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:22:0x008f, B:77:0x0303, B:103:0x045d, B:32:0x00e6, B:100:0x0420, B:44:0x017a, B:64:0x029a, B:71:0x02b7, B:72:0x02bc, B:73:0x02bd, B:78:0x032e, B:80:0x0334, B:86:0x03a2, B:87:0x03a9, B:89:0x03af, B:94:0x03ca, B:96:0x03cf), top: B:127:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0414  */
    /* JADX WARN: Code duplicated, block: B:99:0x0416  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00a5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:26:0x00a5 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00a9: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:28:0x00a9 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ad: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:30:0x00ad */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // v24.a
    public Object g(f24.c cVar, CertKeyPair certKeyPair, b0 b0Var, tq.e<? super dx.i<? extends dx.b, Integer>> eVar) throws Throwable {
        k kVar;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        int i15;
        f24.c cVar2;
        CertKeyPair certKeyPair2;
        b0 b0Var2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ContainersDatabase containersDatabase;
        int i19;
        List list;
        ex.b bVar3;
        ex.b bVar4;
        b0 b0Var3;
        Object objE;
        List list2;
        dx.j<dx.b> jVar;
        f24.c cVar3;
        int i25;
        int i26;
        ex.b bVar5;
        ex.b bVar6;
        ContainersDatabase containersDatabase2;
        int i27;
        int i28;
        int i29;
        b0 b0Var4;
        ex.b bVar7;
        CertKeyPair certKeyPair3;
        int iLongValue;
        int i35;
        Iterator it;
        b0 b0Var5;
        Object next;
        CertificateEntity certificateEntity;
        f24.c cVar4;
        CertKeyPair certKeyPair4;
        ex.b bVar8;
        b0 b0Var6;
        int i36;
        n nVarB0;
        int id5;
        ex.b bVar9;
        ContainersDatabase containersDatabase3;
        CertKeyPair certKeyPair5;
        List list3;
        CertificateEntity certificateEntity2;
        n nVarB1;
        f24.c cVar5;
        dx.j<dx.b> jVar2;
        b0 b0Var7;
        n nVarB2;
        ex.b bVar10;
        l24.a aVarA0;
        CertificateEntityType certificateEntityTypeI1;
        f24.c cVar6;
        int i37;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i38 = kVar.f152084x;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f152084x = i38 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objA = kVar.f152082v;
        Object objE2 = uq.b.e();
        ?? r15 = kVar.f152084x;
        try {
            try {
                try {
                    try {
                        switch (r15) {
                            case 0:
                                u.b(objA);
                                jVarA = xw.c.f221622a.a();
                                ex.a aVar = new ex.a();
                                ContainersDatabase containersDatabase4 = (ContainersDatabase) aVar.a(k());
                                l24.a aVarA1 = containersDatabase4.a0();
                                kVar.f152067d = cVar;
                                kVar.f152068e = certKeyPair;
                                kVar.f152069f = b0Var;
                                kVar.f152070g = jVarA;
                                kVar.f152071h = vq.j.a(aVar);
                                kVar.f152072j = vq.j.a(aVar);
                                kVar.f152073k = containersDatabase4;
                                i15 = 0;
                                kVar.f152076n = 0;
                                kVar.f152077p = 0;
                                kVar.f152078q = 0;
                                kVar.f152079r = 0;
                                kVar.f152080s = 0;
                                kVar.f152084x = 1;
                                objA = aVarA1.a(kVar);
                                if (objA != objE2) {
                                    cVar2 = cVar;
                                    certKeyPair2 = certKeyPair;
                                    b0Var2 = b0Var;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    bVar = aVar;
                                    bVar2 = bVar;
                                    containersDatabase = containersDatabase4;
                                    i19 = 0;
                                    list = (List) objA;
                                    bVar3 = bVar;
                                    l24.a aVarA2 = containersDatabase.a0();
                                    CertificateEntity certificateEntity3 = new CertificateEntity(0, certKeyPair2.getCertificate().getEncoded(), certKeyPair2.getPrivateKey().getEncoded(), CertificateEntityStatus.ACTIVE, n24.a.i1(cVar2), c0.e(b0Var2), 1, null);
                                    bVar4 = bVar2;
                                    kVar.f152067d = cVar2;
                                    b0Var3 = b0Var2;
                                    kVar.f152068e = vq.j.a(certKeyPair2);
                                    kVar.f152069f = vq.j.a(b0Var3);
                                    kVar.f152070g = jVarA;
                                    kVar.f152071h = vq.j.a(bVar4);
                                    kVar.f152072j = vq.j.a(bVar3);
                                    kVar.f152073k = containersDatabase;
                                    kVar.f152074l = list;
                                    kVar.f152076n = i19;
                                    kVar.f152077p = i18;
                                    kVar.f152078q = i17;
                                    kVar.f152079r = i16;
                                    kVar.f152080s = i15;
                                    kVar.f152084x = 2;
                                    objE = aVarA2.e(certificateEntity3, kVar);
                                    if (objE != objE2) {
                                        list2 = list;
                                        objA = objE;
                                        f24.c cVar7 = cVar2;
                                        jVar = jVarA;
                                        cVar3 = cVar7;
                                        int i39 = i15;
                                        i25 = i17;
                                        i26 = i39;
                                        bVar5 = bVar3;
                                        bVar6 = bVar4;
                                        containersDatabase2 = containersDatabase;
                                        i27 = i19;
                                        i28 = i18;
                                        i29 = i16;
                                        b0Var4 = b0Var3;
                                        bVar7 = bVar5;
                                        certKeyPair3 = certKeyPair2;
                                        iLongValue = (int) ((Number) objA).longValue();
                                        i35 = b.f151948a[cVar3.ordinal()];
                                        if (i35 != 1) {
                                            if (i35 != 2 && i35 != 3) {
                                                throw new p();
                                            }
                                            nVarB2 = containersDatabase2.b0();
                                            kVar.f152067d = cVar3;
                                            kVar.f152068e = vq.j.a(certKeyPair3);
                                            kVar.f152069f = vq.j.a(b0Var4);
                                            kVar.f152070g = jVar;
                                            kVar.f152071h = vq.j.a(bVar6);
                                            kVar.f152072j = vq.j.a(bVar7);
                                            kVar.f152073k = containersDatabase2;
                                            kVar.f152074l = vq.j.a(list2);
                                            kVar.f152076n = i27;
                                            kVar.f152077p = i28;
                                            kVar.f152078q = i25;
                                            kVar.f152079r = i29;
                                            kVar.f152080s = i26;
                                            kVar.f152081t = iLongValue;
                                            kVar.f152084x = 5;
                                            if (nVarB2.p(iLongValue, kVar) != objE2) {
                                                f24.c cVar8 = cVar3;
                                                i36 = iLongValue;
                                                cVar5 = cVar8;
                                                bVar10 = bVar7;
                                                ContainersDatabase containersDatabase5 = containersDatabase2;
                                                List list4 = list2;
                                                int i45 = i27;
                                                int i46 = i28;
                                                int i47 = i25;
                                                int i48 = i29;
                                                int i49 = i26;
                                                b0 b0Var8 = b0Var4;
                                                this.remoteLogger.F8("ParentCertificateId updated with new certificate id: " + i36, px.d.a.GENERAL);
                                                i26 = i49;
                                                i29 = i48;
                                                i25 = i47;
                                                i28 = i46;
                                                i27 = i45;
                                                list2 = list4;
                                                containersDatabase2 = containersDatabase5;
                                                bVar8 = bVar10;
                                                certKeyPair4 = certKeyPair3;
                                                b0Var6 = b0Var8;
                                                aVarA0 = containersDatabase2.a0();
                                                List list5 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list5);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        } else if (list2.isEmpty()) {
                                            nVarB1 = containersDatabase2.b0();
                                            kVar.f152067d = cVar3;
                                            kVar.f152068e = vq.j.a(certKeyPair3);
                                            kVar.f152069f = vq.j.a(b0Var4);
                                            kVar.f152070g = jVar;
                                            kVar.f152071h = vq.j.a(bVar6);
                                            kVar.f152072j = vq.j.a(bVar7);
                                            kVar.f152073k = containersDatabase2;
                                            kVar.f152074l = vq.j.a(list2);
                                            kVar.f152076n = i27;
                                            kVar.f152077p = i28;
                                            kVar.f152078q = i25;
                                            kVar.f152079r = i29;
                                            kVar.f152080s = i26;
                                            kVar.f152081t = iLongValue;
                                            kVar.f152084x = 3;
                                            if (nVarB1.p(iLongValue, kVar) != objE2) {
                                                f24.c cVar9 = cVar3;
                                                i36 = iLongValue;
                                                cVar5 = cVar9;
                                                bVar8 = bVar7;
                                                jVar2 = jVar;
                                                b0Var7 = b0Var4;
                                                px.d dVar = this.remoteLogger;
                                                int i55 = i26;
                                                StringBuilder sb5 = new StringBuilder();
                                                int i56 = i29;
                                                sb5.append("Empty parentCertificateId documents updated with new certificate id: ");
                                                sb5.append(i36);
                                                dVar.F8(sb5.toString(), px.d.a.GENERAL);
                                                dx.j<dx.b> jVar3 = jVar2;
                                                certKeyPair4 = certKeyPair3;
                                                b0Var6 = b0Var7;
                                                jVar = jVar3;
                                                i26 = i55;
                                                i29 = i56;
                                                aVarA0 = containersDatabase2.a0();
                                                List list6 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list6);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        } else {
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    b0Var5 = b0Var4;
                                                    if (n24.a.i(((CertificateEntity) next).getCertificateTypeEntity()) != cVar3) {
                                                        b0Var4 = b0Var5;
                                                    }
                                                } else {
                                                    b0Var5 = b0Var4;
                                                    next = null;
                                                }
                                            }
                                            certificateEntity = (CertificateEntity) next;
                                            if (certificateEntity != null) {
                                                nVarB0 = containersDatabase2.b0();
                                                id5 = certificateEntity.getId();
                                                kVar.f152067d = cVar3;
                                                cVar4 = cVar3;
                                                kVar.f152068e = vq.j.a(certKeyPair3);
                                                kVar.f152069f = vq.j.a(b0Var5);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar7);
                                                kVar.f152073k = containersDatabase2;
                                                kVar.f152074l = vq.j.a(list2);
                                                kVar.f152075m = certificateEntity;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = iLongValue;
                                                kVar.f152084x = 4;
                                                if (nVarB0.x(id5, iLongValue, kVar) != objE2) {
                                                    bVar9 = bVar7;
                                                    i36 = iLongValue;
                                                    containersDatabase3 = containersDatabase2;
                                                    certKeyPair5 = certKeyPair3;
                                                    b0Var6 = b0Var5;
                                                    list3 = list2;
                                                    certificateEntity2 = certificateEntity;
                                                    this.remoteLogger.F8("Documents with parentCertificateId=" + certificateEntity2.getId() + " updated to new certificate id: " + i36, px.d.a.GENERAL);
                                                    i26 = i26;
                                                    i29 = i29;
                                                    list2 = list3;
                                                    containersDatabase2 = containersDatabase3;
                                                    bVar8 = bVar9;
                                                    certKeyPair4 = certKeyPair5;
                                                    cVar5 = cVar4;
                                                    aVarA0 = containersDatabase2.a0();
                                                    List list7 = list2;
                                                    certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                    kVar.f152067d = cVar5;
                                                    kVar.f152068e = vq.j.a(certKeyPair4);
                                                    kVar.f152069f = vq.j.a(b0Var6);
                                                    kVar.f152070g = jVar;
                                                    kVar.f152071h = vq.j.a(bVar6);
                                                    kVar.f152072j = vq.j.a(bVar8);
                                                    kVar.f152073k = vq.j.a(containersDatabase2);
                                                    kVar.f152074l = vq.j.a(list7);
                                                    kVar.f152075m = null;
                                                    kVar.f152076n = i27;
                                                    kVar.f152077p = i28;
                                                    kVar.f152078q = i25;
                                                    kVar.f152079r = i29;
                                                    kVar.f152080s = i26;
                                                    kVar.f152081t = i36;
                                                    kVar.f152084x = 6;
                                                    if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                        cVar6 = cVar5;
                                                        i37 = i36;
                                                        this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                        return new dx.i.Right(vq.b.e(i37));
                                                    }
                                                }
                                            } else {
                                                cVar4 = cVar3;
                                                certKeyPair4 = certKeyPair3;
                                                bVar8 = bVar7;
                                                b0Var6 = b0Var5;
                                                i36 = iLongValue;
                                                cVar5 = cVar4;
                                                aVarA0 = containersDatabase2.a0();
                                                List list8 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list8);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        }
                                    }
                                }
                                return objE2;
                            case 1:
                                int i57 = kVar.f152080s;
                                i16 = kVar.f152079r;
                                i17 = kVar.f152078q;
                                i18 = kVar.f152077p;
                                int i58 = kVar.f152076n;
                                ContainersDatabase containersDatabase6 = (ContainersDatabase) kVar.f152073k;
                                ex.b bVar11 = (ex.b) kVar.f152072j;
                                ex.b bVar12 = (ex.b) kVar.f152071h;
                                dx.j<dx.b> jVar4 = (dx.j) kVar.f152070g;
                                b0Var2 = (b0) kVar.f152069f;
                                certKeyPair2 = (CertKeyPair) kVar.f152068e;
                                cVar2 = (f24.c) kVar.f152067d;
                                try {
                                    u.b(objA);
                                    i15 = i57;
                                    jVarA = jVar4;
                                    bVar2 = bVar12;
                                    bVar = bVar11;
                                    containersDatabase = containersDatabase6;
                                    i19 = i58;
                                    list = (List) objA;
                                    bVar3 = bVar;
                                    l24.a aVarA3 = containersDatabase.a0();
                                    CertificateEntity certificateEntity4 = new CertificateEntity(0, certKeyPair2.getCertificate().getEncoded(), certKeyPair2.getPrivateKey().getEncoded(), CertificateEntityStatus.ACTIVE, n24.a.i1(cVar2), c0.e(b0Var2), 1, null);
                                    bVar4 = bVar2;
                                    kVar.f152067d = cVar2;
                                    b0Var3 = b0Var2;
                                    kVar.f152068e = vq.j.a(certKeyPair2);
                                    kVar.f152069f = vq.j.a(b0Var3);
                                    kVar.f152070g = jVarA;
                                    kVar.f152071h = vq.j.a(bVar4);
                                    kVar.f152072j = vq.j.a(bVar3);
                                    kVar.f152073k = containersDatabase;
                                    kVar.f152074l = list;
                                    kVar.f152076n = i19;
                                    kVar.f152077p = i18;
                                    kVar.f152078q = i17;
                                    kVar.f152079r = i16;
                                    kVar.f152080s = i15;
                                    kVar.f152084x = 2;
                                    objE = aVarA3.e(certificateEntity4, kVar);
                                    if (objE != objE2) {
                                        list2 = list;
                                        objA = objE;
                                        f24.c cVar10 = cVar2;
                                        jVar = jVarA;
                                        cVar3 = cVar10;
                                        int i310 = i15;
                                        i25 = i17;
                                        i26 = i310;
                                        bVar5 = bVar3;
                                        bVar6 = bVar4;
                                        containersDatabase2 = containersDatabase;
                                        i27 = i19;
                                        i28 = i18;
                                        i29 = i16;
                                        b0Var4 = b0Var3;
                                        bVar7 = bVar5;
                                        certKeyPair3 = certKeyPair2;
                                        iLongValue = (int) ((Number) objA).longValue();
                                        i35 = b.f151948a[cVar3.ordinal()];
                                        if (i35 != 1) {
                                            if (i35 != 2) {
                                                throw new p();
                                            }
                                            nVarB2 = containersDatabase2.b0();
                                            kVar.f152067d = cVar3;
                                            kVar.f152068e = vq.j.a(certKeyPair3);
                                            kVar.f152069f = vq.j.a(b0Var4);
                                            kVar.f152070g = jVar;
                                            kVar.f152071h = vq.j.a(bVar6);
                                            kVar.f152072j = vq.j.a(bVar7);
                                            kVar.f152073k = containersDatabase2;
                                            kVar.f152074l = vq.j.a(list2);
                                            kVar.f152076n = i27;
                                            kVar.f152077p = i28;
                                            kVar.f152078q = i25;
                                            kVar.f152079r = i29;
                                            kVar.f152080s = i26;
                                            kVar.f152081t = iLongValue;
                                            kVar.f152084x = 5;
                                            if (nVarB2.p(iLongValue, kVar) != objE2) {
                                                f24.c cVar11 = cVar3;
                                                i36 = iLongValue;
                                                cVar5 = cVar11;
                                                bVar10 = bVar7;
                                                ContainersDatabase containersDatabase7 = containersDatabase2;
                                                List list9 = list2;
                                                int i410 = i27;
                                                int i411 = i28;
                                                int i412 = i25;
                                                int i413 = i29;
                                                int i414 = i26;
                                                b0 b0Var9 = b0Var4;
                                                this.remoteLogger.F8("ParentCertificateId updated with new certificate id: " + i36, px.d.a.GENERAL);
                                                i26 = i414;
                                                i29 = i413;
                                                i25 = i412;
                                                i28 = i411;
                                                i27 = i410;
                                                list2 = list9;
                                                containersDatabase2 = containersDatabase7;
                                                bVar8 = bVar10;
                                                certKeyPair4 = certKeyPair3;
                                                b0Var6 = b0Var9;
                                                aVarA0 = containersDatabase2.a0();
                                                List list10 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list10);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        } else if (list2.isEmpty()) {
                                            nVarB1 = containersDatabase2.b0();
                                            kVar.f152067d = cVar3;
                                            kVar.f152068e = vq.j.a(certKeyPair3);
                                            kVar.f152069f = vq.j.a(b0Var4);
                                            kVar.f152070g = jVar;
                                            kVar.f152071h = vq.j.a(bVar6);
                                            kVar.f152072j = vq.j.a(bVar7);
                                            kVar.f152073k = containersDatabase2;
                                            kVar.f152074l = vq.j.a(list2);
                                            kVar.f152076n = i27;
                                            kVar.f152077p = i28;
                                            kVar.f152078q = i25;
                                            kVar.f152079r = i29;
                                            kVar.f152080s = i26;
                                            kVar.f152081t = iLongValue;
                                            kVar.f152084x = 3;
                                            if (nVarB1.p(iLongValue, kVar) != objE2) {
                                                f24.c cVar12 = cVar3;
                                                i36 = iLongValue;
                                                cVar5 = cVar12;
                                                bVar8 = bVar7;
                                                jVar2 = jVar;
                                                b0Var7 = b0Var4;
                                                px.d dVar2 = this.remoteLogger;
                                                int i59 = i26;
                                                StringBuilder sb6 = new StringBuilder();
                                                int i510 = i29;
                                                sb6.append("Empty parentCertificateId documents updated with new certificate id: ");
                                                sb6.append(i36);
                                                dVar2.F8(sb6.toString(), px.d.a.GENERAL);
                                                dx.j<dx.b> jVar5 = jVar2;
                                                certKeyPair4 = certKeyPair3;
                                                b0Var6 = b0Var7;
                                                jVar = jVar5;
                                                i26 = i59;
                                                i29 = i510;
                                                aVarA0 = containersDatabase2.a0();
                                                List list11 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list11);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        } else {
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    b0Var5 = b0Var4;
                                                    if (n24.a.i(((CertificateEntity) next).getCertificateTypeEntity()) != cVar3) {
                                                        b0Var4 = b0Var5;
                                                    }
                                                } else {
                                                    b0Var5 = b0Var4;
                                                    next = null;
                                                }
                                            }
                                            certificateEntity = (CertificateEntity) next;
                                            if (certificateEntity != null) {
                                                nVarB0 = containersDatabase2.b0();
                                                id5 = certificateEntity.getId();
                                                kVar.f152067d = cVar3;
                                                cVar4 = cVar3;
                                                kVar.f152068e = vq.j.a(certKeyPair3);
                                                kVar.f152069f = vq.j.a(b0Var5);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar7);
                                                kVar.f152073k = containersDatabase2;
                                                kVar.f152074l = vq.j.a(list2);
                                                kVar.f152075m = certificateEntity;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = iLongValue;
                                                kVar.f152084x = 4;
                                                if (nVarB0.x(id5, iLongValue, kVar) != objE2) {
                                                    bVar9 = bVar7;
                                                    i36 = iLongValue;
                                                    containersDatabase3 = containersDatabase2;
                                                    certKeyPair5 = certKeyPair3;
                                                    b0Var6 = b0Var5;
                                                    list3 = list2;
                                                    certificateEntity2 = certificateEntity;
                                                    this.remoteLogger.F8("Documents with parentCertificateId=" + certificateEntity2.getId() + " updated to new certificate id: " + i36, px.d.a.GENERAL);
                                                    i26 = i26;
                                                    i29 = i29;
                                                    list2 = list3;
                                                    containersDatabase2 = containersDatabase3;
                                                    bVar8 = bVar9;
                                                    certKeyPair4 = certKeyPair5;
                                                    cVar5 = cVar4;
                                                    aVarA0 = containersDatabase2.a0();
                                                    List list12 = list2;
                                                    certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                    kVar.f152067d = cVar5;
                                                    kVar.f152068e = vq.j.a(certKeyPair4);
                                                    kVar.f152069f = vq.j.a(b0Var6);
                                                    kVar.f152070g = jVar;
                                                    kVar.f152071h = vq.j.a(bVar6);
                                                    kVar.f152072j = vq.j.a(bVar8);
                                                    kVar.f152073k = vq.j.a(containersDatabase2);
                                                    kVar.f152074l = vq.j.a(list12);
                                                    kVar.f152075m = null;
                                                    kVar.f152076n = i27;
                                                    kVar.f152077p = i28;
                                                    kVar.f152078q = i25;
                                                    kVar.f152079r = i29;
                                                    kVar.f152080s = i26;
                                                    kVar.f152081t = i36;
                                                    kVar.f152084x = 6;
                                                    if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                        cVar6 = cVar5;
                                                        i37 = i36;
                                                        this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                        return new dx.i.Right(vq.b.e(i37));
                                                    }
                                                }
                                            } else {
                                                cVar4 = cVar3;
                                                certKeyPair4 = certKeyPair3;
                                                bVar8 = bVar7;
                                                b0Var6 = b0Var5;
                                                i36 = iLongValue;
                                                cVar5 = cVar4;
                                                aVarA0 = containersDatabase2.a0();
                                                List list13 = list2;
                                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                                kVar.f152067d = cVar5;
                                                kVar.f152068e = vq.j.a(certKeyPair4);
                                                kVar.f152069f = vq.j.a(b0Var6);
                                                kVar.f152070g = jVar;
                                                kVar.f152071h = vq.j.a(bVar6);
                                                kVar.f152072j = vq.j.a(bVar8);
                                                kVar.f152073k = vq.j.a(containersDatabase2);
                                                kVar.f152074l = vq.j.a(list13);
                                                kVar.f152075m = null;
                                                kVar.f152076n = i27;
                                                kVar.f152077p = i28;
                                                kVar.f152078q = i25;
                                                kVar.f152079r = i29;
                                                kVar.f152080s = i26;
                                                kVar.f152081t = i36;
                                                kVar.f152084x = 6;
                                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                    cVar6 = cVar5;
                                                    i37 = i36;
                                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                    return new dx.i.Right(vq.b.e(i37));
                                                }
                                            }
                                        }
                                    }
                                    return objE2;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar4;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
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
                            case 2:
                                int i65 = kVar.f152080s;
                                int i66 = kVar.f152079r;
                                i25 = kVar.f152078q;
                                i28 = kVar.f152077p;
                                i27 = kVar.f152076n;
                                list2 = (List) kVar.f152074l;
                                containersDatabase2 = (ContainersDatabase) kVar.f152073k;
                                bVar5 = (ex.b) kVar.f152072j;
                                ex.b bVar13 = (ex.b) kVar.f152071h;
                                jVar = (dx.j) kVar.f152070g;
                                b0 b0Var10 = (b0) kVar.f152069f;
                                CertKeyPair certKeyPair6 = (CertKeyPair) kVar.f152068e;
                                cVar3 = (f24.c) kVar.f152067d;
                                u.b(objA);
                                bVar6 = bVar13;
                                certKeyPair2 = certKeyPair6;
                                i29 = i66;
                                b0Var4 = b0Var10;
                                i26 = i65;
                                bVar7 = bVar5;
                                certKeyPair3 = certKeyPair2;
                                iLongValue = (int) ((Number) objA).longValue();
                                i35 = b.f151948a[cVar3.ordinal()];
                                if (i35 != 1) {
                                    if (i35 != 2) {
                                        throw new p();
                                    }
                                    nVarB2 = containersDatabase2.b0();
                                    kVar.f152067d = cVar3;
                                    kVar.f152068e = vq.j.a(certKeyPair3);
                                    kVar.f152069f = vq.j.a(b0Var4);
                                    kVar.f152070g = jVar;
                                    kVar.f152071h = vq.j.a(bVar6);
                                    kVar.f152072j = vq.j.a(bVar7);
                                    kVar.f152073k = containersDatabase2;
                                    kVar.f152074l = vq.j.a(list2);
                                    kVar.f152076n = i27;
                                    kVar.f152077p = i28;
                                    kVar.f152078q = i25;
                                    kVar.f152079r = i29;
                                    kVar.f152080s = i26;
                                    kVar.f152081t = iLongValue;
                                    kVar.f152084x = 5;
                                    if (nVarB2.p(iLongValue, kVar) != objE2) {
                                        f24.c cVar13 = cVar3;
                                        i36 = iLongValue;
                                        cVar5 = cVar13;
                                        bVar10 = bVar7;
                                        ContainersDatabase containersDatabase8 = containersDatabase2;
                                        List list14 = list2;
                                        int i415 = i27;
                                        int i416 = i28;
                                        int i417 = i25;
                                        int i418 = i29;
                                        int i419 = i26;
                                        b0 b0Var11 = b0Var4;
                                        this.remoteLogger.F8("ParentCertificateId updated with new certificate id: " + i36, px.d.a.GENERAL);
                                        i26 = i419;
                                        i29 = i418;
                                        i25 = i417;
                                        i28 = i416;
                                        i27 = i415;
                                        list2 = list14;
                                        containersDatabase2 = containersDatabase8;
                                        bVar8 = bVar10;
                                        certKeyPair4 = certKeyPair3;
                                        b0Var6 = b0Var11;
                                        aVarA0 = containersDatabase2.a0();
                                        List list15 = list2;
                                        certificateEntityTypeI1 = n24.a.i1(cVar5);
                                        kVar.f152067d = cVar5;
                                        kVar.f152068e = vq.j.a(certKeyPair4);
                                        kVar.f152069f = vq.j.a(b0Var6);
                                        kVar.f152070g = jVar;
                                        kVar.f152071h = vq.j.a(bVar6);
                                        kVar.f152072j = vq.j.a(bVar8);
                                        kVar.f152073k = vq.j.a(containersDatabase2);
                                        kVar.f152074l = vq.j.a(list15);
                                        kVar.f152075m = null;
                                        kVar.f152076n = i27;
                                        kVar.f152077p = i28;
                                        kVar.f152078q = i25;
                                        kVar.f152079r = i29;
                                        kVar.f152080s = i26;
                                        kVar.f152081t = i36;
                                        kVar.f152084x = 6;
                                        if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                            cVar6 = cVar5;
                                            i37 = i36;
                                            this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                            return new dx.i.Right(vq.b.e(i37));
                                        }
                                    }
                                } else if (list2.isEmpty()) {
                                    nVarB1 = containersDatabase2.b0();
                                    kVar.f152067d = cVar3;
                                    kVar.f152068e = vq.j.a(certKeyPair3);
                                    kVar.f152069f = vq.j.a(b0Var4);
                                    kVar.f152070g = jVar;
                                    kVar.f152071h = vq.j.a(bVar6);
                                    kVar.f152072j = vq.j.a(bVar7);
                                    kVar.f152073k = containersDatabase2;
                                    kVar.f152074l = vq.j.a(list2);
                                    kVar.f152076n = i27;
                                    kVar.f152077p = i28;
                                    kVar.f152078q = i25;
                                    kVar.f152079r = i29;
                                    kVar.f152080s = i26;
                                    kVar.f152081t = iLongValue;
                                    kVar.f152084x = 3;
                                    if (nVarB1.p(iLongValue, kVar) != objE2) {
                                        f24.c cVar14 = cVar3;
                                        i36 = iLongValue;
                                        cVar5 = cVar14;
                                        bVar8 = bVar7;
                                        jVar2 = jVar;
                                        b0Var7 = b0Var4;
                                        px.d dVar3 = this.remoteLogger;
                                        int i511 = i26;
                                        StringBuilder sb7 = new StringBuilder();
                                        int i512 = i29;
                                        sb7.append("Empty parentCertificateId documents updated with new certificate id: ");
                                        sb7.append(i36);
                                        dVar3.F8(sb7.toString(), px.d.a.GENERAL);
                                        dx.j<dx.b> jVar6 = jVar2;
                                        certKeyPair4 = certKeyPair3;
                                        b0Var6 = b0Var7;
                                        jVar = jVar6;
                                        i26 = i511;
                                        i29 = i512;
                                        aVarA0 = containersDatabase2.a0();
                                        List list16 = list2;
                                        certificateEntityTypeI1 = n24.a.i1(cVar5);
                                        kVar.f152067d = cVar5;
                                        kVar.f152068e = vq.j.a(certKeyPair4);
                                        kVar.f152069f = vq.j.a(b0Var6);
                                        kVar.f152070g = jVar;
                                        kVar.f152071h = vq.j.a(bVar6);
                                        kVar.f152072j = vq.j.a(bVar8);
                                        kVar.f152073k = vq.j.a(containersDatabase2);
                                        kVar.f152074l = vq.j.a(list16);
                                        kVar.f152075m = null;
                                        kVar.f152076n = i27;
                                        kVar.f152077p = i28;
                                        kVar.f152078q = i25;
                                        kVar.f152079r = i29;
                                        kVar.f152080s = i26;
                                        kVar.f152081t = i36;
                                        kVar.f152084x = 6;
                                        if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                            cVar6 = cVar5;
                                            i37 = i36;
                                            this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                            return new dx.i.Right(vq.b.e(i37));
                                        }
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            b0Var5 = b0Var4;
                                            if (n24.a.i(((CertificateEntity) next).getCertificateTypeEntity()) != cVar3) {
                                                b0Var4 = b0Var5;
                                            }
                                        } else {
                                            b0Var5 = b0Var4;
                                            next = null;
                                        }
                                    }
                                    certificateEntity = (CertificateEntity) next;
                                    if (certificateEntity != null) {
                                        nVarB0 = containersDatabase2.b0();
                                        id5 = certificateEntity.getId();
                                        kVar.f152067d = cVar3;
                                        cVar4 = cVar3;
                                        kVar.f152068e = vq.j.a(certKeyPair3);
                                        kVar.f152069f = vq.j.a(b0Var5);
                                        kVar.f152070g = jVar;
                                        kVar.f152071h = vq.j.a(bVar6);
                                        kVar.f152072j = vq.j.a(bVar7);
                                        kVar.f152073k = containersDatabase2;
                                        kVar.f152074l = vq.j.a(list2);
                                        kVar.f152075m = certificateEntity;
                                        kVar.f152076n = i27;
                                        kVar.f152077p = i28;
                                        kVar.f152078q = i25;
                                        kVar.f152079r = i29;
                                        kVar.f152080s = i26;
                                        kVar.f152081t = iLongValue;
                                        kVar.f152084x = 4;
                                        if (nVarB0.x(id5, iLongValue, kVar) != objE2) {
                                            bVar9 = bVar7;
                                            i36 = iLongValue;
                                            containersDatabase3 = containersDatabase2;
                                            certKeyPair5 = certKeyPair3;
                                            b0Var6 = b0Var5;
                                            list3 = list2;
                                            certificateEntity2 = certificateEntity;
                                            this.remoteLogger.F8("Documents with parentCertificateId=" + certificateEntity2.getId() + " updated to new certificate id: " + i36, px.d.a.GENERAL);
                                            i26 = i26;
                                            i29 = i29;
                                            list2 = list3;
                                            containersDatabase2 = containersDatabase3;
                                            bVar8 = bVar9;
                                            certKeyPair4 = certKeyPair5;
                                            cVar5 = cVar4;
                                            aVarA0 = containersDatabase2.a0();
                                            List list17 = list2;
                                            certificateEntityTypeI1 = n24.a.i1(cVar5);
                                            kVar.f152067d = cVar5;
                                            kVar.f152068e = vq.j.a(certKeyPair4);
                                            kVar.f152069f = vq.j.a(b0Var6);
                                            kVar.f152070g = jVar;
                                            kVar.f152071h = vq.j.a(bVar6);
                                            kVar.f152072j = vq.j.a(bVar8);
                                            kVar.f152073k = vq.j.a(containersDatabase2);
                                            kVar.f152074l = vq.j.a(list17);
                                            kVar.f152075m = null;
                                            kVar.f152076n = i27;
                                            kVar.f152077p = i28;
                                            kVar.f152078q = i25;
                                            kVar.f152079r = i29;
                                            kVar.f152080s = i26;
                                            kVar.f152081t = i36;
                                            kVar.f152084x = 6;
                                            if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                                cVar6 = cVar5;
                                                i37 = i36;
                                                this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                                return new dx.i.Right(vq.b.e(i37));
                                            }
                                        }
                                    } else {
                                        cVar4 = cVar3;
                                        certKeyPair4 = certKeyPair3;
                                        bVar8 = bVar7;
                                        b0Var6 = b0Var5;
                                        i36 = iLongValue;
                                        cVar5 = cVar4;
                                        aVarA0 = containersDatabase2.a0();
                                        List list18 = list2;
                                        certificateEntityTypeI1 = n24.a.i1(cVar5);
                                        kVar.f152067d = cVar5;
                                        kVar.f152068e = vq.j.a(certKeyPair4);
                                        kVar.f152069f = vq.j.a(b0Var6);
                                        kVar.f152070g = jVar;
                                        kVar.f152071h = vq.j.a(bVar6);
                                        kVar.f152072j = vq.j.a(bVar8);
                                        kVar.f152073k = vq.j.a(containersDatabase2);
                                        kVar.f152074l = vq.j.a(list18);
                                        kVar.f152075m = null;
                                        kVar.f152076n = i27;
                                        kVar.f152077p = i28;
                                        kVar.f152078q = i25;
                                        kVar.f152079r = i29;
                                        kVar.f152080s = i26;
                                        kVar.f152081t = i36;
                                        kVar.f152084x = 6;
                                        if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                            cVar6 = cVar5;
                                            i37 = i36;
                                            this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                            return new dx.i.Right(vq.b.e(i37));
                                        }
                                    }
                                }
                                return objE2;
                            case 3:
                                int i67 = kVar.f152081t;
                                int i68 = kVar.f152080s;
                                int i69 = kVar.f152079r;
                                int i75 = kVar.f152078q;
                                int i76 = kVar.f152077p;
                                int i77 = kVar.f152076n;
                                List list19 = (List) kVar.f152074l;
                                ContainersDatabase containersDatabase9 = (ContainersDatabase) kVar.f152073k;
                                ex.b bVar14 = (ex.b) kVar.f152072j;
                                ex.b bVar15 = (ex.b) kVar.f152071h;
                                jVar2 = (dx.j) kVar.f152070g;
                                b0Var7 = (b0) kVar.f152069f;
                                CertKeyPair certKeyPair7 = (CertKeyPair) kVar.f152068e;
                                f24.c cVar15 = (f24.c) kVar.f152067d;
                                try {
                                    u.b(objA);
                                    cVar5 = cVar15;
                                    bVar6 = bVar15;
                                    i36 = i67;
                                    certKeyPair3 = certKeyPair7;
                                    bVar8 = bVar14;
                                    containersDatabase2 = containersDatabase9;
                                    list2 = list19;
                                    i27 = i77;
                                    i28 = i76;
                                    i25 = i75;
                                    i29 = i69;
                                    i26 = i68;
                                    px.d dVar4 = this.remoteLogger;
                                    int i513 = i26;
                                    StringBuilder sb8 = new StringBuilder();
                                    int i514 = i29;
                                    sb8.append("Empty parentCertificateId documents updated with new certificate id: ");
                                    sb8.append(i36);
                                    dVar4.F8(sb8.toString(), px.d.a.GENERAL);
                                    dx.j<dx.b> jVar7 = jVar2;
                                    certKeyPair4 = certKeyPair3;
                                    b0Var6 = b0Var7;
                                    jVar = jVar7;
                                    i26 = i513;
                                    i29 = i514;
                                    aVarA0 = containersDatabase2.a0();
                                    List list110 = list2;
                                    certificateEntityTypeI1 = n24.a.i1(cVar5);
                                    kVar.f152067d = cVar5;
                                    kVar.f152068e = vq.j.a(certKeyPair4);
                                    kVar.f152069f = vq.j.a(b0Var6);
                                    kVar.f152070g = jVar;
                                    kVar.f152071h = vq.j.a(bVar6);
                                    kVar.f152072j = vq.j.a(bVar8);
                                    kVar.f152073k = vq.j.a(containersDatabase2);
                                    kVar.f152074l = vq.j.a(list110);
                                    kVar.f152075m = null;
                                    kVar.f152076n = i27;
                                    kVar.f152077p = i28;
                                    kVar.f152078q = i25;
                                    kVar.f152079r = i29;
                                    kVar.f152080s = i26;
                                    kVar.f152081t = i36;
                                    kVar.f152084x = 6;
                                    if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                        cVar6 = cVar5;
                                        i37 = i36;
                                        this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                        return new dx.i.Right(vq.b.e(i37));
                                    }
                                    return objE2;
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r15 = jVar2;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
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
                            case 4:
                                int i78 = kVar.f152081t;
                                int i79 = kVar.f152080s;
                                int i85 = kVar.f152079r;
                                int i86 = kVar.f152078q;
                                int i87 = kVar.f152077p;
                                int i88 = kVar.f152076n;
                                CertificateEntity certificateEntity5 = (CertificateEntity) kVar.f152075m;
                                List list20 = (List) kVar.f152074l;
                                ContainersDatabase containersDatabase10 = (ContainersDatabase) kVar.f152073k;
                                ex.b bVar16 = (ex.b) kVar.f152072j;
                                ex.b bVar17 = (ex.b) kVar.f152071h;
                                jVar = (dx.j) kVar.f152070g;
                                b0 b0Var12 = (b0) kVar.f152069f;
                                CertKeyPair certKeyPair8 = (CertKeyPair) kVar.f152068e;
                                f24.c cVar16 = (f24.c) kVar.f152067d;
                                u.b(objA);
                                certKeyPair5 = certKeyPair8;
                                cVar4 = cVar16;
                                bVar6 = bVar17;
                                i36 = i78;
                                b0Var6 = b0Var12;
                                bVar9 = bVar16;
                                containersDatabase3 = containersDatabase10;
                                list3 = list20;
                                certificateEntity2 = certificateEntity5;
                                i27 = i88;
                                i28 = i87;
                                i25 = i86;
                                i29 = i85;
                                i26 = i79;
                                this.remoteLogger.F8("Documents with parentCertificateId=" + certificateEntity2.getId() + " updated to new certificate id: " + i36, px.d.a.GENERAL);
                                i26 = i26;
                                i29 = i29;
                                list2 = list3;
                                containersDatabase2 = containersDatabase3;
                                bVar8 = bVar9;
                                certKeyPair4 = certKeyPair5;
                                cVar5 = cVar4;
                                aVarA0 = containersDatabase2.a0();
                                List list111 = list2;
                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                kVar.f152067d = cVar5;
                                kVar.f152068e = vq.j.a(certKeyPair4);
                                kVar.f152069f = vq.j.a(b0Var6);
                                kVar.f152070g = jVar;
                                kVar.f152071h = vq.j.a(bVar6);
                                kVar.f152072j = vq.j.a(bVar8);
                                kVar.f152073k = vq.j.a(containersDatabase2);
                                kVar.f152074l = vq.j.a(list111);
                                kVar.f152075m = null;
                                kVar.f152076n = i27;
                                kVar.f152077p = i28;
                                kVar.f152078q = i25;
                                kVar.f152079r = i29;
                                kVar.f152080s = i26;
                                kVar.f152081t = i36;
                                kVar.f152084x = 6;
                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                    cVar6 = cVar5;
                                    i37 = i36;
                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                    return new dx.i.Right(vq.b.e(i37));
                                }
                                return objE2;
                            case 5:
                                int i89 = kVar.f152081t;
                                i26 = kVar.f152080s;
                                i29 = kVar.f152079r;
                                i25 = kVar.f152078q;
                                i28 = kVar.f152077p;
                                i27 = kVar.f152076n;
                                list2 = (List) kVar.f152074l;
                                containersDatabase2 = (ContainersDatabase) kVar.f152073k;
                                ex.b bVar18 = (ex.b) kVar.f152072j;
                                ex.b bVar19 = (ex.b) kVar.f152071h;
                                jVar = (dx.j) kVar.f152070g;
                                b0Var4 = (b0) kVar.f152069f;
                                CertKeyPair certKeyPair9 = (CertKeyPair) kVar.f152068e;
                                f24.c cVar17 = (f24.c) kVar.f152067d;
                                u.b(objA);
                                cVar5 = cVar17;
                                bVar6 = bVar19;
                                i36 = i89;
                                certKeyPair3 = certKeyPair9;
                                bVar10 = bVar18;
                                ContainersDatabase containersDatabase11 = containersDatabase2;
                                List list112 = list2;
                                int i4110 = i27;
                                int i4111 = i28;
                                int i4112 = i25;
                                int i4113 = i29;
                                int i4114 = i26;
                                b0 b0Var13 = b0Var4;
                                this.remoteLogger.F8("ParentCertificateId updated with new certificate id: " + i36, px.d.a.GENERAL);
                                i26 = i4114;
                                i29 = i4113;
                                i25 = i4112;
                                i28 = i4111;
                                i27 = i4110;
                                list2 = list112;
                                containersDatabase2 = containersDatabase11;
                                bVar8 = bVar10;
                                certKeyPair4 = certKeyPair3;
                                b0Var6 = b0Var13;
                                aVarA0 = containersDatabase2.a0();
                                List list113 = list2;
                                certificateEntityTypeI1 = n24.a.i1(cVar5);
                                kVar.f152067d = cVar5;
                                kVar.f152068e = vq.j.a(certKeyPair4);
                                kVar.f152069f = vq.j.a(b0Var6);
                                kVar.f152070g = jVar;
                                kVar.f152071h = vq.j.a(bVar6);
                                kVar.f152072j = vq.j.a(bVar8);
                                kVar.f152073k = vq.j.a(containersDatabase2);
                                kVar.f152074l = vq.j.a(list113);
                                kVar.f152075m = null;
                                kVar.f152076n = i27;
                                kVar.f152077p = i28;
                                kVar.f152078q = i25;
                                kVar.f152079r = i29;
                                kVar.f152080s = i26;
                                kVar.f152081t = i36;
                                kVar.f152084x = 6;
                                if (aVarA0.d(certificateEntityTypeI1, i36, kVar) != objE2) {
                                    cVar6 = cVar5;
                                    i37 = i36;
                                    this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                    return new dx.i.Right(vq.b.e(i37));
                                }
                                return objE2;
                            case 6:
                                i37 = kVar.f152081t;
                                cVar6 = (f24.c) kVar.f152067d;
                                u.b(objA);
                                this.remoteLogger.F8("Old certificate removed for type " + cVar6.name(), px.d.a.GENERAL);
                                return new dx.i.Right(vq.b.e(i37));
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (CancellationException e26) {
                        throw e26;
                    }
                } catch (Exception e27) {
                    e = e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        } catch (ex.c e35) {
            e = e35;
        } catch (CancellationException e36) {
            throw e36;
        } catch (Exception e37) {
            e = e37;
            r15 = obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #2 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008a, B:29:0x008e, B:31:0x0094, B:33:0x009a, B:35:0x00a0, B:36:0x00a7, B:37:0x00d3, B:38:0x00d4, B:39:0x0100, B:46:0x010a, B:49:0x0119), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #2 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008a, B:29:0x008e, B:31:0x0094, B:33:0x009a, B:35:0x00a0, B:36:0x00a7, B:37:0x00d3, B:38:0x00d4, B:39:0x0100, B:46:0x010a, B:49:0x0119), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #2 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008a, B:29:0x008e, B:31:0x0094, B:33:0x009a, B:35:0x00a0, B:36:0x00a7, B:37:0x00d3, B:38:0x00d4, B:39:0x0100, B:46:0x010a, B:49:0x0119), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00a7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.a
    public Object h(f24.c cVar, tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        i iVar;
        Object objB;
        f24.c cVar2;
        ex.b bVar;
        CertificateEntity certificateEntity;
        String ticket;
        b0 b0VarG;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f152056q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f152056q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f152054n;
        ?? E = uq.b.e();
        int i16 = iVar.f152056q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) iVar.f152048g;
                    cVar2 = (f24.c) iVar.f152045d;
                    try {
                        u.b(obj);
                        certificateEntity = (CertificateEntity) obj;
                        if (certificateEntity != null && (ticket = certificateEntity.getTicket()) != null) {
                            if (ticket.length() != 0) {
                                bVar.b(new dx.b.Generic(new NullPointerException("Pesel ticket is empty for " + cVar2.name() + " certificate")));
                                throw new oq.g();
                            }
                            b0VarG = c0.g(ticket);
                            if (b0VarG != null) {
                                return new dx.i.Right(b0VarG);
                            }
                        }
                        bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate peselTicket")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    l24.a aVarA0 = ((ContainersDatabase) aVar.a(k())).a0();
                    iVar.f152045d = cVar;
                    iVar.f152046e = jVarA;
                    iVar.f152047f = vq.j.a(aVar);
                    iVar.f152048g = aVar;
                    iVar.f152049h = 0;
                    iVar.f152050j = 0;
                    iVar.f152051k = 0;
                    iVar.f152052l = 0;
                    iVar.f152053m = 0;
                    iVar.f152056q = 1;
                    Object objB2 = aVarA0.b(cVar, iVar);
                    if (objB2 == E) {
                        return E;
                    }
                    obj = objB2;
                    cVar2 = cVar;
                    bVar = aVar;
                    certificateEntity = (CertificateEntity) obj;
                    if (certificateEntity != null) {
                        if (ticket.length() != 0) {
                            bVar.b(new dx.b.Generic(new NullPointerException("Pesel ticket is empty for " + cVar2.name() + " certificate")));
                            throw new oq.g();
                        }
                        b0VarG = c0.g(ticket);
                        if (b0VarG != null) {
                            return new dx.i.Right(b0VarG);
                        }
                    }
                    bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate peselTicket")));
                    throw new oq.g();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    E = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(E));
                    dx.i iVarA = E.a(e);
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
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [f24.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // v24.a
    public Object i(f24.c cVar, f24.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        l lVar;
        Object objB;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f152097r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f152097r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object obj = lVar.f152095p;
        Object objE = uq.b.e();
        int i16 = lVar.f152097r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.a aVarA0 = ((ContainersDatabase) aVar.a(k())).a0();
                        CertificateEntityStatus certificateEntityStatusH1 = n24.a.h1(bVar);
                        lVar.f152085d = vq.j.a(cVar);
                        lVar.f152086e = vq.j.a(bVar);
                        lVar.f152087f = jVarA;
                        lVar.f152088g = vq.j.a(aVar);
                        lVar.f152089h = vq.j.a(aVar);
                        lVar.f152090j = 0;
                        lVar.f152091k = 0;
                        lVar.f152092l = 0;
                        lVar.f152093m = 0;
                        lVar.f152094n = 0;
                        lVar.f152097r = 1;
                        if (aVarA0.g(certificateEntityStatusH1, lVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        cVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(cVar));
                        dx.i iVarA = cVar.a(e);
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
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #6 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008a, B:29:0x008e, B:30:0x009d, B:31:0x00c9, B:38:0x00d3, B:41:0x00e1), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #6 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008a, B:29:0x008e, B:30:0x009d, B:31:0x00c9, B:38:0x00d3, B:41:0x00e1), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x009d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.a
    public Object j(f24.c cVar, tq.e<? super dx.i<? extends dx.b, Integer>> eVar) throws Throwable {
        g gVar;
        Object objB;
        f24.c cVar2;
        ex.b bVar;
        CertificateEntity certificateEntity;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f152024q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f152024q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f152022n;
        ?? E = uq.b.e();
        int i16 = gVar.f152024q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) gVar.f152016g;
                    cVar2 = (f24.c) gVar.f152013d;
                    try {
                        u.b(obj);
                        certificateEntity = (CertificateEntity) obj;
                        if (certificateEntity != null) {
                            return new dx.i.Right(vq.b.e(certificateEntity.getId()));
                        }
                        bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate id")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    l24.a aVarA0 = ((ContainersDatabase) aVar.a(k())).a0();
                    gVar.f152013d = cVar;
                    gVar.f152014e = jVarA;
                    gVar.f152015f = vq.j.a(aVar);
                    gVar.f152016g = aVar;
                    gVar.f152017h = 0;
                    gVar.f152018j = 0;
                    gVar.f152019k = 0;
                    gVar.f152020l = 0;
                    gVar.f152021m = 0;
                    gVar.f152024q = 1;
                    Object objB2 = aVarA0.b(cVar, gVar);
                    if (objB2 == E) {
                        return E;
                    }
                    obj = objB2;
                    cVar2 = cVar;
                    bVar = aVar;
                    certificateEntity = (CertificateEntity) obj;
                    if (certificateEntity != null) {
                        return new dx.i.Right(vq.b.e(certificateEntity.getId()));
                    }
                    bVar.b(new dx.b.Generic(new NullPointerException("Could not get " + cVar2.name() + " certificate id")));
                    throw new oq.g();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    E = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(E));
                    dx.i iVarA = E.a(e);
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
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
