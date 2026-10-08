package pm1;

import al0.BEFileInfo;
import dx.i;
import er.p;
import fr.k;
import fr.t;
import iy.b0;
import j44.Access;
import java.util.List;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import u04.d;
import vq.j;
import wn1.SummaryModel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpm1/b;", "Lgz/b;", "Lpm1/b$a;", "Ldx/i;", "Lk44/a;", "Loq/i0;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lql0/b;", "submitXmlUC", "<init>", "(Ll44/a;Lql0/b;)V", "params", "e", "(Lpm1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lql0/b;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, i<? extends k44.a, ? extends i0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ql0.b submitXmlUC;

    /* JADX INFO: renamed from: pm1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpm1/b$a;", "Lgz/b$a;", "Lwn1/a;", "data", "", "Lal0/l;", "filesInfo", "Lu04/d;", "signedBase64Xml", "<init>", "(Lwn1/a;Ljava/util/List;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn1/a;", "()Lwn1/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Liy/b0;", "()Liy/b0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryModel data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> filesInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedBase64Xml;

        public /* synthetic */ Params(SummaryModel summaryModel, List list, b0 b0Var, k kVar) {
            this(summaryModel, list, b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SummaryModel getData() {
            return this.data;
        }

        public final List<BEFileInfo> b() {
            return this.filesInfo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getSignedBase64Xml() {
            return this.signedBase64Xml;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.filesInfo, params.filesInfo) && d.d(this.signedBase64Xml, params.signedBase64Xml);
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + this.filesInfo.hashCode()) * 31) + d.e(this.signedBase64Xml);
        }

        public String toString() {
            return "Params(data=" + this.data + ", filesInfo=" + this.filesInfo + ", signedBase64Xml=" + ((Object) d.f(this.signedBase64Xml)) + ')';
        }

        private Params(SummaryModel summaryModel, List<BEFileInfo> list, b0 b0Var) {
            this.data = summaryModel;
            this.filesInfo = list;
            this.signedBase64Xml = b0Var;
        }
    }

    /* JADX INFO: renamed from: pm1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "owAccessToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C3961b extends vq.k implements p<Access, e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160910f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f160912h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3961b(Params params, e<? super C3961b> eVar) {
            super(2, eVar);
            this.f160912h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f160910f;
            Object objE = uq.b.e();
            int i15 = this.f160909e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ql0.b bVar = b.this.submitXmlUC;
            ql0.b.Params params = new ql0.b.Params(nm1.a.a(access), nm1.a.h(this.f160912h.getData(), this.f160912h.getSignedBase64Xml(), this.f160912h.b()), null);
            this.f160910f = j.a(access);
            this.f160909e = 1;
            Object objC = bVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, e<? super i<? extends dx.b, i0>> eVar) {
            return ((C3961b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            C3961b c3961b = b.this.new C3961b(this.f160912h, eVar);
            c3961b.f160910f = obj;
            return c3961b;
        }
    }

    public b(l44.a aVar, ql0.b bVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.submitXmlUC = bVar;
    }

    public Object e(Params params, e<? super i<? extends k44.a, i0>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new C3961b(params, null), eVar);
    }
}
