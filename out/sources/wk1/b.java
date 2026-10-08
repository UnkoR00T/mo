package wk1;

import al0.BEFileInfo;
import dx.i;
import er.p;
import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import j44.Access;
import java.util.List;
import nk1.SummaryModel;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import u04.d;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwk1/b;", "Lgz/b;", "Lwk1/b$a;", "Ldx/i;", "Lk44/a;", "Loq/i0;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lsl0/b;", "submitChildXmlUC", "<init>", "(Ll44/a;Lsl0/b;)V", "params", "e", "(Lwk1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lsl0/b;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, i<? extends k44.a, ? extends i0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sl0.b submitChildXmlUC;

    /* JADX INFO: renamed from: wk1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lwk1/b$a;", "Lgz/b$a;", "Lu04/d;", "signedDocument", "", "Lal0/l;", "files", "Lnk1/a;", "data", "<init>", "(Liy/b0;Ljava/util/List;Lnk1/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lnk1/a;", "()Lnk1/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> files;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryModel data;

        public /* synthetic */ Params(b0 b0Var, List list, SummaryModel summaryModel, k kVar) {
            this(b0Var, list, summaryModel);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SummaryModel getData() {
            return this.data;
        }

        public final List<BEFileInfo> b() {
            return this.files;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getSignedDocument() {
            return this.signedDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return d.d(this.signedDocument, params.signedDocument) && t.c(this.files, params.files) && t.c(this.data, params.data);
        }

        public int hashCode() {
            return (((d.e(this.signedDocument) * 31) + this.files.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Params(signedDocument=" + ((Object) d.f(this.signedDocument)) + ", files=" + this.files + ", data=" + this.data + ')';
        }

        private Params(b0 b0Var, List<BEFileInfo> list, SummaryModel summaryModel) {
            this.signedDocument = b0Var;
            this.files = list;
            this.data = summaryModel;
        }
    }

    /* JADX INFO: renamed from: wk1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5655b extends vq.k implements p<Access, e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213887f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f213889h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5655b(Params params, e<? super C5655b> eVar) {
            super(2, eVar);
            this.f213889h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f213887f;
            Object objE = uq.b.e();
            int i15 = this.f213886e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            sl0.b bVar = b.this.submitChildXmlUC;
            sl0.b.Params params = new sl0.b.Params(al0.a.a(c0.g(access.getValue())), jk1.a.e(this.f213889h.getData(), this.f213889h.getSignedDocument(), this.f213889h.b()), null);
            this.f213887f = j.a(access);
            this.f213886e = 1;
            Object objC = bVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, e<? super i<? extends dx.b, i0>> eVar) {
            return ((C5655b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            C5655b c5655b = b.this.new C5655b(this.f213889h, eVar);
            c5655b.f213887f = obj;
            return c5655b;
        }
    }

    public b(l44.a aVar, sl0.b bVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.submitChildXmlUC = bVar;
    }

    public Object e(Params params, e<? super i<? extends k44.a, i0>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new C5655b(params, null), eVar);
    }
}
