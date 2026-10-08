package p02;

import eo0.OwTokens;
import eo0.Recipient;
import java.util.List;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0018\u0016B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lp02/l;", "", "Lp02/l$b;", "", "Leo0/k0;", "Lgo0/l;", "fetchRecipientsUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Lgo0/l;Ls02/b;Lp02/f0;)V", "Ldx/b;", "domainError", "", "h", "(Ldx/b;)Z", "params", "Ldx/i;", "g", "(Lp02/l$b;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/l;", "b", "Ls02/b;", "c", "Lp02/f0;", "Ldx/b$c;", "d", "Ldx/b$c;", "edaConfirmationError", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f151187f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.l fetchRecipientsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business edaConfirmationError;

    /* JADX INFO: renamed from: p02.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lp02/l$b;", "Lgz/b$a;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String query;

        public Params(String str) {
            this.query = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.query, ((Params) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return "Params(query=" + this.query + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151197h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151199k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151200l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151201m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151202n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151204q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151202n = obj;
            this.f151204q |= PKIFailureInfo.systemUnavail;
            return l.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "", "Leo0/k0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends Recipient>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151206f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151208h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Params params, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f151208h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151206f;
            Object objE = uq.b.e();
            int i15 = this.f151205e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.l lVar = l.this.fetchRecipientsUC;
                go0.l.Params params = new go0.l.Params(this.f151208h.getQuery(), access);
                this.f151206f = vq.j.a(access);
                this.f151205e = 1;
                obj = lVar.c(params, this);
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
            l lVar2 = l.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return lVar2.h(bVar) ? new dx.i.Left(lVar2.edaConfirmationError) : new dx.i.Left(bVar);
            }
            if (iVar instanceof dx.i.Right) {
                return iVar;
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<Recipient>>> eVar) {
            return ((d) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = l.this.new d(this.f151208h, eVar);
            dVar.f151206f = obj;
            return dVar;
        }
    }

    public l(go0.l lVar, s02.b bVar, f0 f0Var) {
        this.fetchRecipientsUC = lVar;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
        n02.a aVar = n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING;
        Label.Companion companion = Label.INSTANCE;
        this.edaConfirmationError = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(dx.b domainError) {
        if (!(domainError instanceof dx.b.g.Http)) {
            return false;
        }
        dx.b.g.Http http = (dx.b.g.Http) domainError;
        if (http.getCode() != dx.b.g.Http.a.BAD_REQUEST) {
            return false;
        }
        PayloadErrorData payloadErrorData = (PayloadErrorData) http.b();
        return fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "EDA_CONFIRMATION_REQUIRED_FIELD_MISSING");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        if (r15 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p02.l.Params r14, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<eo0.Recipient>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.l.g(p02.l$b, tq.e):java.lang.Object");
    }
}
