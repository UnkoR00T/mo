package p02;

import eo0.OwTokens;
import eo0.RecipientResult;
import eo0.SearchRequest;
import java.util.List;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001!B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00152\u0006\u0010\u001e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lp02/a;", "", "Lp02/a$a;", "", "Leo0/n0;", "Lgo0/f0;", "beSearchRecipientUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "Lmx/c;", "labelProvider", "<init>", "(Lgo0/f0;Ls02/b;Lp02/f0;Lmx/c;)V", "Leo0/w0;", "searchRequest", "Leo0/i0$a;", "accessToken", "", "nextPageId", "Ldx/i;", "Ldx/b;", "h", "(Leo0/w0;Leo0/i0$a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "title", "message", "Ldx/b$c;", "f", "(Ljava/lang/String;Ljava/lang/String;)Ldx/b$c;", "params", "g", "(Lp02/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/f0;", "b", "Ls02/b;", "c", "Lp02/f0;", "d", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.f0 beSearchRecipientUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/a$a;", "Lgz/b$a;", "", "nextPageId", "Leo0/w0;", "searchRequest", "<init>", "(Ljava/lang/String;Leo0/w0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Leo0/w0;", "()Leo0/w0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nextPageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchRequest searchRequest;

        public Params(String str, SearchRequest searchRequest) {
            this.nextPageId = str;
            this.searchRequest = searchRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNextPageId() {
            return this.nextPageId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SearchRequest getSearchRequest() {
            return this.searchRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.nextPageId, params.nextPageId) && fr.t.c(this.searchRequest, params.searchRequest);
        }

        public int hashCode() {
            String str = this.nextPageId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.searchRequest.hashCode();
        }

        public String toString() {
            return "Params(nextPageId=" + this.nextPageId + ", searchRequest=" + this.searchRequest + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f150877h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f150878j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f150879k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f150880l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f150881m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f150882n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f150884q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150882n = obj;
            this.f150884q |= PKIFailureInfo.systemUnavail;
            return a.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leo0/i0$a;", "refreshedToken", "Ldx/i;", "Ldx/b;", "", "Leo0/n0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends RecipientResult>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f150887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f150888h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ dx.b f150889j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, a aVar, dx.b bVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f150887g = params;
            this.f150888h = aVar;
            this.f150889j = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f150886f;
            Object objE = uq.b.e();
            int i15 = this.f150885e;
            if (i15 == 0) {
                oq.u.b(obj);
                SearchRequest searchRequest = this.f150887g.getSearchRequest();
                String nextPageId = this.f150887g.getNextPageId();
                a aVar = this.f150888h;
                this.f150886f = vq.j.a(access);
                this.f150885e = 1;
                obj = aVar.h(searchRequest, access, nextPageId, this);
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
            dx.b bVar = this.f150889j;
            a aVar2 = this.f150888h;
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
                if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "EDOR_SEARCH_ERROR")) {
                    Object objB2 = http.b();
                    PayloadErrorData payloadErrorData2 = objB2 instanceof PayloadErrorData ? (PayloadErrorData) objB2 : null;
                    return payloadErrorData2 != null ? new dx.i.Left(aVar2.f(payloadErrorData2.getTitle(), payloadErrorData2.getMessage())) : new dx.i.Left(bVar);
                }
            }
            return new dx.i.Left(bVar);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<RecipientResult>>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f150887g, this.f150888h, this.f150889j, eVar);
            cVar.f150886f = obj;
            return cVar;
        }
    }

    public a(go0.f0 f0Var, s02.b bVar, f0 f0Var2, mx.c cVar) {
        this.beSearchRecipientUC = f0Var;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var2;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business f(String title, String message) {
        Label labelC;
        Label labelC2;
        n02.a aVar = n02.a.EDOR_SEARCH_ERROR;
        dx.b.f fVar = dx.b.f.FAILURE;
        if (title == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
            labelC = this.labelProvider.c(e02.a.f46611t0);
        }
        Label label = labelC;
        Label labelC3 = this.labelProvider.c(e02.a.f46550j);
        if (message == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
            labelC2 = this.labelProvider.c(e02.a.f46605s0);
        }
        return new dx.b.Business(aVar, fVar, label, labelC2, null, labelC3, null, 80, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(SearchRequest searchRequest, OwTokens.Access access, String str, tq.e<? super dx.i<? extends dx.b, ? extends List<RecipientResult>>> eVar) {
        return this.beSearchRecipientUC.c(new go0.f0.Params(str, searchRequest, access), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if (r15 == r1) goto L53;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c0, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p02.a.Params r14, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<eo0.RecipientResult>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.a.g(p02.a$a, tq.e):java.lang.Object");
    }
}
