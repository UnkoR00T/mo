package p02;

import eo0.OwTokens;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/r;", "", "Lp02/r$a;", "Ljava/io/InputStream;", "Lgo0/t;", "getMessageAttachmentsUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Lgo0/t;Ls02/b;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/r$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/t;", "b", "Ls02/b;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.t getMessageAttachmentsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: p02.r$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0019"}, d2 = {"Lp02/r$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Leo0/r;", "directoryId", "Leo0/y;", "attachmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        public /* synthetic */ Params(String str, String str2, String str3, fr.k kVar) {
            this(str, str2, str3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return eo0.g0.d(this.messageId, params.messageId) && eo0.r.d(this.directoryId, params.directoryId) && eo0.y.d(this.attachmentId, params.attachmentId);
        }

        public int hashCode() {
            return (((eo0.g0.e(this.messageId) * 31) + eo0.r.e(this.directoryId)) * 31) + eo0.y.e(this.attachmentId);
        }

        public String toString() {
            return "Params(messageId=" + ((Object) eo0.g0.f(this.messageId)) + ", directoryId=" + ((Object) eo0.r.f(this.directoryId)) + ", attachmentId=" + ((Object) eo0.y.f(this.attachmentId)) + ')';
        }

        private Params(String str, String str2, String str3) {
            this.messageId = str;
            this.directoryId = str2;
            this.attachmentId = str3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151363h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151365k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151366l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151367m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151368n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151370q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151368n = obj;
            this.f151370q |= PKIFailureInfo.systemUnavail;
            return r.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Ljava/io/InputStream;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151372f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151374h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151374h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151372f;
            Object objE = uq.b.e();
            int i15 = this.f151371e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.t tVar = r.this.getMessageAttachmentsUC;
                go0.t.Params params = new go0.t.Params(access, this.f151374h.getMessageId(), this.f151374h.getDirectoryId(), this.f151374h.getAttachmentId(), null);
                this.f151372f = vq.j.a(access);
                this.f151371e = 1;
                obj = tVar.c(params, this);
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
            if (iVar instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right((InputStream) ((dx.i.Right) iVar).b());
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = r.this.new c(this.f151374h, eVar);
            cVar.f151372f = obj;
            return cVar;
        }
    }

    public r(go0.t tVar, s02.b bVar, f0 f0Var) {
        this.getMessageAttachmentsUC = tVar;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p02.r.Params r14, tq.e<? super dx.i<? extends dx.b, ? extends java.io.InputStream>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.r.e(p02.r$a, tq.e):java.lang.Object");
    }
}
