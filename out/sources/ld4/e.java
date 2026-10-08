package ld4;

import dx.i;
import er.p;
import h64.l;
import h64.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g1;
import ju.j;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.k;
import oq.u;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.CertificatePin;
import pl.gov.coi.common.network.DomainPins;
import pl.gov.coi.common.network.r;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u000fR\u001b\u0010(\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u000f¨\u0006-"}, d2 = {"Lld4/e;", "Lpl/gov/coi/common/network/b;", "Lh64/m;", "getTrustedDomainCertificateUseCase", "Lh64/l;", "trustedCertificatesUseCase", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Ly04/a;", "buildConfigRepository", "<init>", "(Lh64/m;Lh64/l;Lpl/gov/coi/common/network/r;Ly04/a;)V", "", "", "a", "()Ljava/util/List;", "domain", "Ldx/i;", "Ldx/b;", "Lry/a;", "c", "(Ljava/lang/String;)Ldx/i;", "Lpl/gov/coi/common/network/j;", "b", "()Lpl/gov/coi/common/network/j;", "Lh64/m;", "Lh64/l;", "Lpl/gov/coi/common/network/r;", "d", "Ly04/a;", "e", "Loq/k;", "l", "pinningWhitelistDomains", "f", "n", "trustedDomains", "g", "m", "()Ljava/lang/String;", "serverHostDomain", "h", "k", "pinSha256List", "i", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements pl.gov.coi.common.network.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f117927j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m getTrustedDomainCertificateUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l trustedCertificatesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r httpClientConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k pinningWhitelistDomains = oq.l.a(new er.a() { // from class: ld4.a
        @Override // er.a
        public final Object a() {
            return e.p(this.f117922a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k trustedDomains = oq.l.a(new er.a() { // from class: ld4.b
        @Override // er.a
        public final Object a() {
            return e.r(this.f117923a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k serverHostDomain = oq.l.a(new er.a() { // from class: ld4.c
        @Override // er.a
        public final Object a() {
            return e.q(this.f117924a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k pinSha256List = oq.l.a(new er.a() { // from class: ld4.d
        @Override // er.a
        public final Object a() {
            return e.o(this.f117925a);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lry/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i<? extends dx.b, ? extends List<? extends ry.a>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f117937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f117938g;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lry/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super i<? extends dx.b, ? extends List<? extends ry.a>>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f117939e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f117940f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f117941g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f117942h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, e eVar, tq.e<? super a> eVar2) {
                super(2, eVar2);
                this.f117941g = str;
                this.f117942h = eVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
            
                if (r7 == r1) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
            
                if (r7 == r1) goto L26;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 240
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ld4.e.b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, ? extends List<ry.a>>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f117941g, this.f117942h, eVar);
                aVar.f117940f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, e eVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f117937f = str;
            this.f117938g = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117936e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l0 l0VarB = g1.b();
            a aVar = new a(this.f117937f, this.f117938g, null);
            this.f117936e = 1;
            Object objG = ju.i.g(l0VarB, aVar, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, ? extends List<ry.a>>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f117937f, this.f117938g, eVar);
        }
    }

    public e(m mVar, l lVar, r rVar, y04.a aVar) {
        this.getTrustedDomainCertificateUseCase = mVar;
        this.trustedCertificatesUseCase = lVar;
        this.httpClientConfig = rVar;
        this.buildConfigRepository = aVar;
    }

    private final List<String> k() {
        return (List) this.pinSha256List.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> l() {
        return (List) this.pinningWhitelistDomains.getValue();
    }

    private final String m() {
        return (String) this.serverHostDomain.getValue();
    }

    private final List<String> n() {
        return (List) this.trustedDomains.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(e eVar) {
        List<CertificatePin> listK = eVar.httpClientConfig.k();
        ArrayList arrayList = new ArrayList(v.y(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(((CertificatePin) it.next()).getSha256());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(e eVar) {
        return fu.r.V0(eVar.buildConfigRepository.getPinningWhitelistDomains(), new String[]{";"}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(e eVar) {
        return eVar.buildConfigRepository.getServerHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(e eVar) {
        return fu.r.V0(eVar.buildConfigRepository.getTrustedDomains(), new String[]{";"}, false, 0, 6, null);
    }

    @Override // pl.gov.coi.common.network.b
    public List<String> a() {
        return n();
    }

    @Override // pl.gov.coi.common.network.b
    public DomainPins b() {
        return new DomainPins(m(), k());
    }

    @Override // pl.gov.coi.common.network.b
    public i<dx.b, List<ry.a>> c(String domain) {
        return (i) j.b(null, new b(domain, this, null), 1, null);
    }
}
