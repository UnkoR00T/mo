package p02;

import eo0.OwTokens;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp02/j;", "", "Lp02/j$a;", "", "Lfo0/c;", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "Lgo0/w;", "getMessagesUC", "<init>", "(Ls02/b;Lp02/f0;Lgo0/w;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls02/b;", "b", "Lp02/f0;", "c", "Lgo0/w;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final go0.w getMessagesUC;

    /* JADX INFO: renamed from: p02.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lp02/j$a;", "Lgz/b$a;", "Leo0/r;", "directoryId", "", "pageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pageId;

        public /* synthetic */ Params(String str, String str2, fr.k kVar) {
            this(str, str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return eo0.r.d(this.directoryId, params.directoryId) && fr.t.c(this.pageId, params.pageId);
        }

        public int hashCode() {
            int iE = eo0.r.e(this.directoryId) * 31;
            String str = this.pageId;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(directoryId=" + ((Object) eo0.r.f(this.directoryId)) + ", pageId=" + this.pageId + ')';
        }

        private Params(String str, String str2) {
            this.directoryId = str;
            this.pageId = str2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151102h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151107n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151109q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151107n = obj;
            this.f151109q |= PKIFailureInfo.systemUnavail;
            return j.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "", "Lfo0/c;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends fo0.c>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151111f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f151113h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151113h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151111f;
            Object objE = uq.b.e();
            int i15 = this.f151110e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.w wVar = j.this.getMessagesUC;
                go0.w.Params params = new go0.w.Params(access, this.f151113h.getDirectoryId(), this.f151113h.getPageId(), null);
                this.f151111f = vq.j.a(access);
                this.f151110e = 1;
                obj = wVar.c(params, this);
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
                return new dx.i.Right((List) ((dx.i.Right) iVar).b());
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<fo0.c>>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = j.this.new c(this.f151113h, eVar);
            cVar.f151111f = obj;
            return cVar;
        }
    }

    public j(s02.b bVar, f0 f0Var, go0.w wVar) {
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
        this.getMessagesUC = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p02.j.Params r14, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<fo0.c>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.j.e(p02.j$a, tq.e):java.lang.Object");
    }
}
