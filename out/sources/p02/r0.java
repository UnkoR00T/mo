package p02;

import eo0.OwTokens;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/r0;", "", "Lp02/r0$a;", "Leo0/y;", "Ls02/b;", "getOwAccessTokenUseCase", "Lgo0/a;", "addEdorAttachmentUC", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Ls02/b;Lgo0/a;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/r0$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls02/b;", "b", "Lgo0/a;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go0.a addEdorAttachmentUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: p02.r0$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp02/r0$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Lzz/a;", "file", "<init>", "(Ljava/lang/String;Lzz/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzz/a;", "()Lzz/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.a file;

        public /* synthetic */ Params(String str, zz.a aVar, fr.k kVar) {
            this(str, aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zz.a getFile() {
            return this.file;
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
            return eo0.g0.d(this.messageId, params.messageId) && fr.t.c(this.file, params.file);
        }

        public int hashCode() {
            return (eo0.g0.e(this.messageId) * 31) + this.file.hashCode();
        }

        public String toString() {
            return "Params(messageId=" + ((Object) eo0.g0.f(this.messageId)) + ", file=" + this.file + ')';
        }

        private Params(String str, zz.a aVar) {
            this.messageId = str;
            this.file = aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151384h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151385j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151386k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151387l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151388m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151389n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151391q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151389n = obj;
            this.f151391q |= PKIFailureInfo.systemUnavail;
            return r0.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Leo0/y;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends eo0.y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151393f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151395h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151395h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151393f;
            Object objE = uq.b.e();
            int i15 = this.f151392e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            go0.a aVar = r0.this.addEdorAttachmentUC;
            go0.a.Params params = new go0.a.Params(l02.a.a(this.f151395h.getFile()), this.f151395h.getMessageId(), access, null);
            this.f151393f = vq.j.a(access);
            this.f151392e = 1;
            Object objC = aVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, eo0.y>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = r0.this.new c(this.f151395h, eVar);
            cVar.f151393f = obj;
            return cVar;
        }
    }

    public r0(s02.b bVar, go0.a aVar, f0 f0Var) {
        this.getOwAccessTokenUseCase = bVar;
        this.addEdorAttachmentUC = aVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0112  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p02.r0.Params r14, tq.e<? super dx.i<? extends dx.b, eo0.y>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.r0.e(p02.r0$a, tq.e):java.lang.Object");
    }
}
