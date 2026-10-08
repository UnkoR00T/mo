package vv2;

import al0.BEFileInfo;
import al0.b0;
import al0.g;
import dx.i;
import er.p;
import fr.k;
import fr.t;
import iy.c0;
import j44.Access;
import java.util.List;
import ml0.y;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import u04.d;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvv2/b;", "Lgz/b;", "Lvv2/b$a;", "Ldx/i;", "Lk44/a;", "Loq/i0;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lml0/y;", "submitXmlUC", "<init>", "(Ll44/a;Lml0/y;)V", "params", "e", "(Lvv2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lml0/y;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, i<? extends k44.a, ? extends i0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y submitXmlUC;

    /* JADX INFO: renamed from: vv2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lvv2/b$a;", "Lgz/b$a;", "Lal0/b0;", "data", "Lu04/d;", "signedBase64Xml", "Lal0/g;", "ownerWithAge", "", "officeEdorAddress", "", "Lal0/l;", "filesInfo", "<init>", "(Lal0/b0;Liy/b0;Lal0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/b0;", "()Lal0/b0;", "b", "Liy/b0;", "f", "()Liy/b0;", "c", "Lal0/g;", "d", "()Lal0/g;", "Ljava/lang/String;", "e", "Ljava/util/List;", "()Ljava/util/List;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 signedBase64Xml;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final g ownerWithAge;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String officeEdorAddress;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> filesInfo;

        public /* synthetic */ Params(b0 b0Var, iy.b0 b0Var2, g gVar, String str, List list, k kVar) {
            this(b0Var, b0Var2, gVar, str, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getData() {
            return this.data;
        }

        public final List<BEFileInfo> b() {
            return this.filesInfo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOfficeEdorAddress() {
            return this.officeEdorAddress;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && d.d(this.signedBase64Xml, params.signedBase64Xml) && t.c(this.ownerWithAge, params.ownerWithAge) && t.c(this.officeEdorAddress, params.officeEdorAddress) && t.c(this.filesInfo, params.filesInfo);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final iy.b0 getSignedBase64Xml() {
            return this.signedBase64Xml;
        }

        public int hashCode() {
            int iHashCode = ((((this.data.hashCode() * 31) + d.e(this.signedBase64Xml)) * 31) + this.ownerWithAge.hashCode()) * 31;
            String str = this.officeEdorAddress;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.filesInfo.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", signedBase64Xml=" + ((Object) d.f(this.signedBase64Xml)) + ", ownerWithAge=" + this.ownerWithAge + ", officeEdorAddress=" + this.officeEdorAddress + ", filesInfo=" + this.filesInfo + ')';
        }

        private Params(b0 b0Var, iy.b0 b0Var2, g gVar, String str, List<BEFileInfo> list) {
            this.data = b0Var;
            this.signedBase64Xml = b0Var2;
            this.ownerWithAge = gVar;
            this.officeEdorAddress = str;
            this.filesInfo = list;
        }
    }

    /* JADX INFO: renamed from: vv2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5472b extends vq.k implements p<Access, e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f208505f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f208507h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5472b(Params params, e<? super C5472b> eVar) {
            super(2, eVar);
            this.f208507h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f208505f;
            Object objE = uq.b.e();
            int i15 = this.f208504e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            y yVar = b.this.submitXmlUC;
            y.Params params = new y.Params(al0.a.a(c0.g(access.getValue())), this.f208507h.getData(), ry.a.b(this.f208507h.getSignedBase64Xml()), this.f208507h.getOwnerWithAge(), this.f208507h.getOfficeEdorAddress(), this.f208507h.b(), null);
            this.f208505f = j.a(access);
            this.f208504e = 1;
            Object objC = yVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, e<? super i<? extends dx.b, i0>> eVar) {
            return ((C5472b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            C5472b c5472b = b.this.new C5472b(this.f208507h, eVar);
            c5472b.f208505f = obj;
            return c5472b;
        }
    }

    public b(l44.a aVar, y yVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.submitXmlUC = yVar;
    }

    public Object e(Params params, e<? super i<? extends k44.a, i0>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new C5472b(params, null), eVar);
    }
}
