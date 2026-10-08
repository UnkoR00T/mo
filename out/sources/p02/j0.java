package p02;

import eo0.OwTokens;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lp02/j0;", "", "Lp02/j0$a;", "Loq/i0;", "Ls02/b;", "getOwAccessTokenUseCase", "Lgo0/c;", "deleteEdorAttachmentUC", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "Lmx/c;", "labelProvider", "<init>", "(Ls02/b;Lgo0/c;Lp02/f0;Lmx/c;)V", "", "title", "Ldx/b$c;", "g", "(Ljava/lang/String;)Ldx/b$c;", "Ldx/b;", "domainError", "h", "(Ldx/b;)Ljava/lang/String;", "params", "Ldx/i;", "i", "(Lp02/j0$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls02/b;", "b", "Lgo0/c;", "c", "Lp02/f0;", "d", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go0.c deleteEdorAttachmentUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p02.j0$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0016"}, d2 = {"Lp02/j0$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Leo0/y;", "attachmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        public /* synthetic */ Params(String str, String str2, fr.k kVar) {
            this(str, str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return eo0.g0.d(this.messageId, params.messageId) && eo0.y.d(this.attachmentId, params.attachmentId);
        }

        public int hashCode() {
            return (eo0.g0.e(this.messageId) * 31) + eo0.y.e(this.attachmentId);
        }

        public String toString() {
            return "Params(messageId=" + ((Object) eo0.g0.f(this.messageId)) + ", attachmentId=" + ((Object) eo0.y.f(this.attachmentId)) + ')';
        }

        private Params(String str, String str2) {
            this.messageId = str;
            this.attachmentId = str2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151124h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151125j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151126k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151127l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151128m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151129n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151131q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151129n = obj;
            this.f151131q |= PKIFailureInfo.systemUnavail;
            return j0.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151133f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151135h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ dx.b f151136j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, dx.b bVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151135h = params;
            this.f151136j = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151133f;
            Object objE = uq.b.e();
            int i15 = this.f151132e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.c cVar = j0.this.deleteEdorAttachmentUC;
                go0.c.Params params = new go0.c.Params(this.f151135h.getAttachmentId(), this.f151135h.getMessageId(), access, null);
                this.f151133f = vq.j.a(access);
                this.f151132e = 1;
                obj = cVar.c(params, this);
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
            j0 j0Var = j0.this;
            dx.b bVar = this.f151136j;
            if (iVar instanceof dx.i.Left) {
                String strH = j0Var.h(bVar);
                return strH != null ? new dx.i.Left(j0Var.g(strH)) : new dx.i.Left(bVar);
            }
            if (iVar instanceof dx.i.Right) {
                return iVar;
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = j0.this.new c(this.f151135h, this.f151136j, eVar);
            cVar.f151133f = obj;
            return cVar;
        }
    }

    public j0(s02.b bVar, go0.c cVar, f0 f0Var, mx.c cVar2) {
        this.getOwAccessTokenUseCase = bVar;
        this.deleteEdorAttachmentUC = cVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business g(String title) {
        Label labelC;
        n02.a aVar = n02.a.GET_ATTACHMENT_ERROR;
        dx.b.f fVar = dx.b.f.FAILURE;
        if (title == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
            labelC = this.labelProvider.c(e02.a.f46611t0);
        }
        return new dx.b.Business(aVar, fVar, labelC, null, null, this.labelProvider.c(e02.a.f46550j), null, 88, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(dx.b domainError) {
        if (domainError instanceof dx.b.g.Http) {
            dx.b.g.Http http = (dx.b.g.Http) domainError;
            Object objB = http.b();
            PayloadErrorData payloadErrorData = objB instanceof PayloadErrorData ? (PayloadErrorData) objB : null;
            if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "GET_ATTACHMENT_ERROR")) {
                Object objB2 = http.b();
                PayloadErrorData payloadErrorData2 = objB2 instanceof PayloadErrorData ? (PayloadErrorData) objB2 : null;
                if (payloadErrorData2 != null) {
                    return payloadErrorData2.getTitle();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        if (r15 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(p02.j0.Params r14, tq.e<? super dx.i<? extends dx.b, oq.i0>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.j0.i(p02.j0$a, tq.e):java.lang.Object");
    }
}
