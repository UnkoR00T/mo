package p02;

import eo0.OwTokens;
import eo0.z0;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lp02/q0;", "", "Lp02/q0$a;", "Loq/i0;", "Lgo0/k0;", "beSignUpdUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "Lwz3/j;", "signBase64XmlUC", "Lmx/c;", "labelProvider", "<init>", "(Lgo0/k0;Ls02/b;Lp02/f0;Lwz3/j;Lmx/c;)V", "", "title", "Ldx/b$c;", "g", "(Ljava/lang/String;)Ldx/b$c;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lp02/q0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/k0;", "b", "Ls02/b;", "c", "Lp02/f0;", "d", "Lwz3/j;", "e", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.k0 beSignUpdUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p02.q0$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp02/q0$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Leo0/i;", "xmlToSign", "<init>", "(Ljava/lang/String;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f151329c = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 xmlToSign;

        public /* synthetic */ Params(String str, iy.b0 b0Var, fr.k kVar) {
            this(str, b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getXmlToSign() {
            return this.xmlToSign;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return eo0.g0.d(this.messageId, params.messageId) && eo0.i.d(this.xmlToSign, params.xmlToSign);
        }

        public int hashCode() {
            return (eo0.g0.e(this.messageId) * 31) + eo0.i.e(this.xmlToSign);
        }

        public String toString() {
            return "Params(messageId=" + ((Object) eo0.g0.f(this.messageId)) + ", xmlToSign=" + ((Object) eo0.i.f(this.xmlToSign)) + ')';
        }

        private Params(String str, iy.b0 b0Var) {
            this.messageId = str;
            this.xmlToSign = b0Var;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151336h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f151338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151339l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f151341n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f151342p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151343q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f151344r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f151346t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151344r = obj;
            this.f151346t |= PKIFailureInfo.systemUnavail;
            return q0.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "refreshedToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151348f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151350h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ iy.b0 f151351j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ dx.b f151352k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, iy.b0 b0Var, dx.b bVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151350h = params;
            this.f151351j = b0Var;
            this.f151352k = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151348f;
            Object objE = uq.b.e();
            int i15 = this.f151347e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.k0 k0Var = q0.this.beSignUpdUC;
                go0.k0.Params params = new go0.k0.Params(this.f151350h.getMessageId(), access, z0.a(this.f151351j), null);
                this.f151348f = vq.j.a(access);
                this.f151347e = 1;
                obj = k0Var.c(params, this);
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
            dx.b bVar = this.f151352k;
            q0 q0Var = q0.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (iVar instanceof dx.i.Right) {
                    return iVar;
                }
                throw new oq.p();
            }
            if (bVar instanceof dx.b.g.Http) {
                dx.b.g.Http http = (dx.b.g.Http) bVar;
                Object objB = http.b();
                PayloadErrorData payloadErrorData = objB instanceof PayloadErrorData ? (PayloadErrorData) objB : null;
                if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "UPD_SEND_ERROR")) {
                    Object objB2 = http.b();
                    PayloadErrorData payloadErrorData2 = objB2 instanceof PayloadErrorData ? (PayloadErrorData) objB2 : null;
                    return payloadErrorData2 != null ? new dx.i.Left(q0Var.g(payloadErrorData2.getTitle())) : new dx.i.Left(bVar);
                }
            }
            return new dx.i.Left(bVar);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q0.this.new c(this.f151350h, this.f151351j, this.f151352k, eVar);
            cVar.f151348f = obj;
            return cVar;
        }
    }

    public q0(go0.k0 k0Var, s02.b bVar, f0 f0Var, wz3.j jVar, mx.c cVar) {
        this.beSignUpdUC = k0Var;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
        this.signBase64XmlUC = jVar;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business g(String title) {
        Label labelC;
        n02.a aVar = n02.a.UPD_SEND_ERROR;
        dx.b.f fVar = dx.b.f.FAILURE;
        if (title == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
            labelC = this.labelProvider.c(e02.a.f46611t0);
        }
        return new dx.b.Business(aVar, fVar, labelC, null, null, Label.INSTANCE.c(), null, 88, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0169  */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0201  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ee, code lost:
    
        if (r0 == r7) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(p02.q0.Params r18, tq.e<? super dx.i<? extends dx.b, oq.i0>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.q0.f(p02.q0$a, tq.e):java.lang.Object");
    }
}
