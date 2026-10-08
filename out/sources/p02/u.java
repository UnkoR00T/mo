package p02;

import eo0.OwTokens;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/u;", "", "Lp02/u$a;", "Lwx/a;", "Lgo0/s;", "getEvidenceFileUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Lgo0/s;Ls02/b;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/s;", "b", "Ls02/b;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.s getEvidenceFileUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: p02.u$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lp02/u$a;", "Lgz/b$a;", "Leo0/c0;", "evidenceId", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String evidenceId;

        public /* synthetic */ Params(String str, fr.k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEvidenceId() {
            return this.evidenceId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && eo0.c0.d(this.evidenceId, ((Params) other).evidenceId);
        }

        public int hashCode() {
            return eo0.c0.e(this.evidenceId);
        }

        public String toString() {
            return "Params(evidenceId=" + ((Object) eo0.c0.f(this.evidenceId)) + ')';
        }

        private Params(String str) {
            this.evidenceId = str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151423h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151425k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151426l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151427m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151428n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151430q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151428n = obj;
            this.f151430q |= PKIFailureInfo.systemUnavail;
            return u.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Lwx/a;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends DomainFile>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151432f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151434h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151434h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151432f;
            Object objE = uq.b.e();
            int i15 = this.f151431e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            go0.s sVar = u.this.getEvidenceFileUC;
            go0.s.Params params = new go0.s.Params(this.f151434h.getEvidenceId(), access, null);
            this.f151432f = vq.j.a(access);
            this.f151431e = 1;
            Object objC = sVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(this.f151434h, eVar);
            cVar.f151432f = obj;
            return cVar;
        }
    }

    public u(go0.s sVar, s02.b bVar, f0 f0Var) {
        this.getEvidenceFileUC = sVar;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p02.u.Params r14, tq.e<? super dx.i<? extends dx.b, wx.DomainFile>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.u.e(p02.u$a, tq.e):java.lang.Object");
    }
}
