package hp0;

import ay.j;
import dx.i;
import fp0.ReportData;
import fp0.SummaryData;
import fr.k;
import fr.q0;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import ju.g2;
import lp0.AttachmentDto;
import lp0.ReportSummaryRequestDto;
import lp0.SendReportRequestDto;
import lp0.UserDataRequestDto;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 &2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0014*\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001c\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%¨\u0006'"}, d2 = {"Lhp0/d;", "Lhp0/c;", "Lay/j;", "jsonSerializer", "Lez/a;", "timeProvider", "Liy/a;", "base64Coder", "Liy/j;", "cmsManager", "Lhp0/a;", "giosAttachmentCreator", "<init>", "(Lay/j;Lez/a;Liy/a;Liy/j;Lhp0/a;)V", "Lfp0/i;", "Ljava/time/Instant;", "creationTimestamp", "", "Llp0/b;", "attachments", "Ldx/i;", "Ldx/b;", "Lhp0/c$a;", "e", "(Lfp0/i;Ljava/time/Instant;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lfp0/j;", "d", "(Lfp0/j;Ltq/e;)Ljava/lang/Object;", "data", "a", "(Lfp0/i;Ltq/e;)Ljava/lang/Object;", "Lay/j;", "b", "Lez/a;", "c", "Liy/a;", "Liy/j;", "Lhp0/a;", "f", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements hp0.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f86182f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f86183g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hp0.a giosAttachmentCreator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhp0/d$a;", "", "<init>", "()V", "", "PL_LOCALE_TAG", "Ljava/lang/String;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f86193h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f86194j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86196l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86194j = obj;
            this.f86196l |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f86198e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86200g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86198e = obj;
            this.f86200g |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    /* JADX INFO: renamed from: hp0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2009d extends vq.d {
        int A;
        int B;
        int C;
        /* synthetic */ Object D;
        int F;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86205h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f86206j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f86207k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f86208l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f86209m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f86210n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f86211p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f86212q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f86213r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f86214s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f86215t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f86216v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f86217w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f86218x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f86219y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f86220z;

        C2009d(tq.e<? super C2009d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.D = obj;
            this.F |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, null, null, this);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f86183g = gu.d.q(300, gu.e.SECONDS);
    }

    public d(j jVar, ez.a aVar, iy.a aVar2, iy.j jVar2, hp0.a aVar3) {
        this.jsonSerializer = jVar;
        this.timeProvider = aVar;
        this.base64Coder = aVar2;
        this.cmsManager = jVar2;
        this.giosAttachmentCreator = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(SummaryData summaryData, tq.e<? super i<? extends dx.b, ? extends List<AttachmentDto>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f86200g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f86200g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA = cVar.f86198e;
        Object objE = uq.b.e();
        int i16 = cVar.f86200g;
        if (i16 == 0) {
            u.b(objA);
            hp0.a aVar = this.giosAttachmentCreator;
            wx.i.Image photo = summaryData.getPhoto();
            Integer imageMaxSide = summaryData.getImageMaxSide();
            cVar.f86197d = vq.j.a(summaryData);
            cVar.f86200g = 1;
            objA = aVar.a(photo, imageMaxSide, cVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        i iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(v.e((AttachmentDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ReportData reportData, Instant instant, List<AttachmentDto> list, tq.e<? super i<? extends dx.b, hp0.c.a>> eVar) throws Throwable {
        C2009d c2009d;
        if (eVar instanceof C2009d) {
            c2009d = (C2009d) eVar;
            int i15 = c2009d.F;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2009d.F = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2009d = new C2009d(eVar);
            }
        } else {
            c2009d = new C2009d(eVar);
        }
        Object right = c2009d.D;
        Object objE = uq.b.e();
        int i16 = c2009d.F;
        if (i16 == 0) {
            u.b(right);
            CertKeyPair certKeyPair = reportData.getCertKeyPair();
            ReportSummaryRequestDto reportSummaryRequestDtoI = kp0.a.i(reportData, instant, Locale.forLanguageTag("pl"), list);
            i<dx.b, byte[]> iVarC = this.cmsManager.c(this.jsonSerializer.b(reportSummaryRequestDtoI, q0.n(ReportSummaryRequestDto.class)), certKeyPair);
            g2.j(c2009d.getContext());
            if (iVarC instanceof i.Left) {
                return iVarC;
            }
            if (!(iVarC instanceof i.Right)) {
                throw new p();
            }
            byte[] bArr = (byte[]) ((i.Right) iVarC).b();
            CertKeyPair certKeyPair2 = reportData.getCertKeyPair();
            UserDataRequestDto userDataRequestDtoJ = kp0.a.j(reportData.getInstitutionCardAndCertData(), iy.a.e(this.base64Coder, bArr, null, 2, null), instant, f86183g);
            i<dx.b, byte[]> iVarC2 = this.cmsManager.c(this.jsonSerializer.b(userDataRequestDtoJ, q0.n(UserDataRequestDto.class)), certKeyPair2);
            g2.j(c2009d.getContext());
            if (iVarC2 instanceof i.Left) {
                return iVarC2;
            }
            if (!(iVarC2 instanceof i.Right)) {
                throw new p();
            }
            byte[] bArr2 = (byte[]) ((i.Right) iVarC2).b();
            c2009d.f86201d = reportData;
            c2009d.f86202e = vq.j.a(instant);
            c2009d.f86203f = vq.j.a(list);
            c2009d.f86204g = vq.j.a(this);
            c2009d.f86205h = vq.j.a(certKeyPair);
            c2009d.f86206j = vq.j.a(reportSummaryRequestDtoI);
            c2009d.f86207k = vq.j.a(iVarC);
            c2009d.f86208l = vq.j.a(bArr);
            c2009d.f86209m = vq.j.a(c2009d);
            c2009d.f86210n = vq.j.a(bArr);
            c2009d.f86211p = vq.j.a(this);
            c2009d.f86212q = vq.j.a(certKeyPair2);
            c2009d.f86213r = vq.j.a(userDataRequestDtoJ);
            c2009d.f86214s = vq.j.a(c2009d);
            c2009d.f86215t = vq.j.a(iVarC2);
            c2009d.f86216v = vq.j.a(bArr2);
            c2009d.f86217w = 0;
            c2009d.f86218x = 0;
            c2009d.f86219y = 0;
            c2009d.f86220z = 0;
            c2009d.A = 0;
            c2009d.B = 0;
            c2009d.C = 0;
            c2009d.F = 1;
            right = new i.Right(hp0.c.a.a(hp0.c.a.b(this.jsonSerializer.b(new SendReportRequestDto(reportData.getInstitutionCardAndCertData().getCard().getInstitutionId(), reportData.getInstitutionCardAndCertData().getCard().getCardId(), this.cmsManager.d(bArr2, reportData.getInstitutionCardAndCertData().getCertificate())), q0.n(SendReportRequestDto.class)))));
            if (right == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(right);
        }
        return (i) right;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r8 == r1) goto L26;
     */
    @Override // hp0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(fp0.ReportData r7, tq.e<? super dx.i<? extends dx.b, hp0.c.a>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hp0.d.b
            if (r0 == 0) goto L13
            r0 = r8
            hp0.d$b r0 = (hp0.d.b) r0
            int r1 = r0.f86196l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86196l = r1
            goto L18
        L13:
            hp0.d$b r0 = new hp0.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f86194j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f86196l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f86191f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f86190e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f86189d
            fp0.i r7 = (fp0.ReportData) r7
            oq.u.b(r8)
            goto L94
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f86189d
            fp0.i r7 = (fp0.ReportData) r7
            oq.u.b(r8)
            goto L5a
        L48:
            oq.u.b(r8)
            fp0.j r8 = r7.getSummaryData()
            r0.f86189d = r7
            r0.f86196l = r4
            java.lang.Object r8 = r6.d(r8, r0)
            if (r8 != r1) goto L5a
            goto L93
        L5a:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L61
            return r8
        L61:
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto L97
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            java.util.List r2 = (java.util.List) r2
            ez.a r4 = r6.timeProvider
            java.time.Instant r4 = r4.d()
            java.lang.Object r5 = vq.j.a(r7)
            r0.f86189d = r5
            java.lang.Object r8 = vq.j.a(r8)
            r0.f86190e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f86191f = r8
            r8 = 0
            r0.f86192g = r8
            r0.f86193h = r8
            r0.f86196l = r3
            java.lang.Object r8 = r6.e(r7, r4, r2, r0)
            if (r8 != r1) goto L94
        L93:
            return r1
        L94:
            dx.i r8 = (dx.i) r8
            return r8
        L97:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hp0.d.a(fp0.i, tq.e):java.lang.Object");
    }
}
