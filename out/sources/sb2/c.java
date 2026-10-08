package sb2;

import al0.BEFileInfo;
import dx.i;
import er.p;
import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import j44.Access;
import java.util.List;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import rl0.d;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsb2/c;", "Lgz/b;", "Lsb2/c$a;", "Ldx/i;", "Lk44/a;", "Loq/i0;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lrl0/d;", "submitTheftXmlUC", "<init>", "(Ll44/a;Lrl0/d;)V", "params", "e", "(Lsb2/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lrl0/d;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<Params, i<? extends k44.a, ? extends i0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d submitTheftXmlUC;

    /* JADX INFO: renamed from: sb2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsb2/c$a;", "Lgz/b$a;", "Lhl0/a$d;", "data", "Lu04/d;", "signedBase64Xml", "", "Lal0/l;", "files", "<init>", "(Lhl0/a$d;Liy/b0;Ljava/util/List;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/a$d;", "()Lhl0/a$d;", "b", "Liy/b0;", "c", "()Liy/b0;", "Ljava/util/List;", "()Ljava/util/List;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hl0.a.Theft data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedBase64Xml;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> files;

        public /* synthetic */ Params(hl0.a.Theft theft, b0 b0Var, List list, k kVar) {
            this(theft, b0Var, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hl0.a.Theft getData() {
            return this.data;
        }

        public final List<BEFileInfo> b() {
            return this.files;
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
            return t.c(this.data, params.data) && u04.d.d(this.signedBase64Xml, params.signedBase64Xml) && t.c(this.files, params.files);
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + u04.d.e(this.signedBase64Xml)) * 31) + this.files.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", signedBase64Xml=" + ((Object) u04.d.f(this.signedBase64Xml)) + ", files=" + this.files + ')';
        }

        private Params(hl0.a.Theft theft, b0 b0Var, List<BEFileInfo> list) {
            this.data = theft;
            this.signedBase64Xml = b0Var;
            this.files = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<Access, e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179902f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f179904h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, e<? super b> eVar) {
            super(2, eVar);
            this.f179904h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f179902f;
            Object objE = uq.b.e();
            int i15 = this.f179901e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            d dVar = c.this.submitTheftXmlUC;
            d.Params params = new d.Params(al0.a.a(c0.g(access.getValue())), this.f179904h.getData(), ry.a.b(this.f179904h.getSignedBase64Xml()), this.f179904h.b(), null);
            this.f179902f = j.a(access);
            this.f179901e = 1;
            Object objC = dVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, e<? super i<? extends dx.b, i0>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = c.this.new b(this.f179904h, eVar);
            bVar.f179902f = obj;
            return bVar;
        }
    }

    public c(l44.a aVar, d dVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.submitTheftXmlUC = dVar;
    }

    public Object e(Params params, e<? super i<? extends k44.a, i0>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, null), eVar);
    }
}
