package go3;

import co3.QrCodeData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgo3/l0;", "", "Lgo3/l0$a;", "Loq/i0;", "Lac4/a;", "callActionWithLoaderUseCase", "Lgo3/s;", "getOwnerDocumentUseCase", "Lgo3/m0;", "sendVerificationUseCase", "<init>", "(Lac4/a;Lgo3/s;Lgo3/m0;)V", "params", "Ldx/i;", "Ldx/b;", "f", "(Lgo3/l0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lac4/a;", "b", "Lgo3/s;", "c", "Lgo3/m0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s getOwnerDocumentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 sendVerificationUseCase;

    /* JADX INFO: renamed from: go3.l0$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010¨\u0006'"}, d2 = {"Lgo3/l0$a;", "Lgz/b$a;", "Loq/r;", "Lk34/a0;", "scope", "", "sessionUuid", "encodedCertificate", "Lco3/e;", "qrCodeData", "Lrq0/b;", "selectedDocumentType", "expirationDateTime", "<init>", "(Loq/r;Ljava/lang/String;Ljava/lang/String;Lco3/e;Lrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loq/r;", "d", "()Loq/r;", "b", "Ljava/lang/String;", "h", "c", "Lco3/e;", "()Lco3/e;", "e", "Lrq0/b;", "f", "()Lrq0/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b selectedDocumentType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expirationDateTime;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(oq.r<? extends k34.a0, ? extends k34.a0> rVar, String str, String str2, QrCodeData qrCodeData, rq0.b bVar, String str3) {
            this.scope = rVar;
            this.sessionUuid = str;
            this.encodedCertificate = str2;
            this.qrCodeData = qrCodeData;
            this.selectedDocumentType = bVar;
            this.expirationDateTime = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExpirationDateTime() {
            return this.expirationDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public final oq.r<k34.a0, k34.a0> d() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scope, params.scope) && fr.t.c(this.sessionUuid, params.sessionUuid) && fr.t.c(this.encodedCertificate, params.encodedCertificate) && fr.t.c(this.qrCodeData, params.qrCodeData) && fr.t.c(this.selectedDocumentType, params.selectedDocumentType) && fr.t.c(this.expirationDateTime, params.expirationDateTime);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final rq0.b getSelectedDocumentType() {
            return this.selectedDocumentType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        public int hashCode() {
            return (((((((((this.scope.hashCode() * 31) + this.sessionUuid.hashCode()) * 31) + this.encodedCertificate.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31) + this.selectedDocumentType.hashCode()) * 31) + this.expirationDateTime.hashCode();
        }

        public String toString() {
            return "Params(scope=" + this.scope + ", sessionUuid=" + this.sessionUuid + ", encodedCertificate=" + this.encodedCertificate + ", qrCodeData=" + this.qrCodeData + ", selectedDocumentType=" + this.selectedDocumentType + ", expirationDateTime=" + this.expirationDateTime + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75580h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75581j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75582k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Params f75584m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f75584m = params;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
        
            if (r2 == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f75582k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L31
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r1 = r0.f75579g
                go3.m0$b r1 = (go3.m0.Params) r1
                java.lang.Object r1 = r0.f75578f
                co3.b r1 = (co3.EncodedDocumentWithAdditionalScope) r1
                java.lang.Object r1 = r0.f75577e
                dx.i r1 = (dx.i) r1
                oq.u.b(r20)
                r2 = r20
                goto Lb6
            L23:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2b:
                oq.u.b(r20)
                r2 = r20
                goto L4f
            L31:
                oq.u.b(r20)
                go3.l0 r2 = go3.l0.this
                go3.s r2 = go3.l0.d(r2)
                go3.s$a r5 = new go3.s$a
                go3.l0$a r6 = r0.f75584m
                oq.r r6 = r6.d()
                r7 = 0
                r5.<init>(r6, r7)
                r0.f75582k = r4
                java.lang.Object r2 = r2.d(r5, r0)
                if (r2 != r1) goto L4f
                goto Lb5
            L4f:
                dx.i r2 = (dx.i) r2
                go3.l0$a r4 = r0.f75584m
                go3.l0 r5 = go3.l0.this
                boolean r6 = r2 instanceof dx.i.Left
                if (r6 == 0) goto L5a
                return r2
            L5a:
                boolean r6 = r2 instanceof dx.i.Right
                if (r6 == 0) goto Lb9
                r6 = r2
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                co3.b r6 = (co3.EncodedDocumentWithAdditionalScope) r6
                go3.m0$b r7 = new go3.m0$b
                java.lang.String r8 = r4.getSessionUuid()
                java.lang.String r9 = r4.getEncodedCertificate()
                oq.r r10 = r4.d()
                java.lang.String r11 = r6.d()
                co3.j r12 = r6.c()
                java.lang.String r13 = r4.getExpirationDateTime()
                rq0.b r14 = r4.getSelectedDocumentType()
                co3.e r15 = r4.getQrCodeData()
                r17 = 256(0x100, float:3.59E-43)
                r18 = 0
                r16 = 0
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                go3.m0 r4 = go3.l0.e(r5)
                java.lang.Object r2 = vq.j.a(r2)
                r0.f75577e = r2
                java.lang.Object r2 = vq.j.a(r6)
                r0.f75578f = r2
                java.lang.Object r2 = vq.j.a(r7)
                r0.f75579g = r2
                r2 = 0
                r0.f75580h = r2
                r0.f75581j = r2
                r0.f75582k = r3
                java.lang.Object r2 = r4.d(r7, r0)
                if (r2 != r1) goto Lb6
            Lb5:
                return r1
            Lb6:
                dx.i r2 = (dx.i) r2
                return r2
            Lb9:
                oq.p r1 = new oq.p
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: go3.l0.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return l0.this.new b(this.f75584m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public l0(ac4.a aVar, s sVar, m0 m0Var) {
        this.callActionWithLoaderUseCase = aVar;
        this.getOwnerDocumentUseCase = sVar;
        this.sendVerificationUseCase = m0Var;
    }

    public Object f(Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
