package xl0;

import al0.Adult;
import al0.BEFileInfo;
import al0.Child;
import al0.Ward;
import al0.w0;
import fr.t;
import gm0.CommunityOfficeDto;
import gm0.SubmitPhysicalIdCardApplicationV4Request;
import gm0.m1;
import iy.b0;
import iy.c0;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lxl0/g;", "Lxw/f;", "Lxl0/g$a;", "Lgm0/c7;", "<init>", "()V", "Lal0/b0;", "Lgm0/m1;", "e", "(Lal0/b0;)Lgm0/m1;", "params", "c", "(Lxl0/g$a;)Lgm0/c7;", "a", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, SubmitPhysicalIdCardApplicationV4Request> {

    /* JADX INFO: renamed from: xl0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, d2 = {"Lxl0/g$a;", "", "Lry/a;", "signedBase64Xml", "Lal0/b0;", "data", "Lal0/g;", "ownerWithAge", "", "officeEdorAddress", "", "Lal0/l;", "filesInfo", "<init>", "(Liy/b0;Lal0/b0;Lal0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "e", "()Liy/b0;", "b", "Lal0/b0;", "()Lal0/b0;", "c", "Lal0/g;", "d", "()Lal0/g;", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedBase64Xml;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.b0 data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String officeEdorAddress;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> filesInfo;

        public /* synthetic */ Params(b0 b0Var, al0.b0 b0Var2, al0.g gVar, String str, List list, fr.k kVar) {
            this(b0Var, b0Var2, gVar, str, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final al0.b0 getData() {
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
        public final al0.g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return ry.a.d(this.signedBase64Xml, params.signedBase64Xml) && t.c(this.data, params.data) && t.c(this.ownerWithAge, params.ownerWithAge) && t.c(this.officeEdorAddress, params.officeEdorAddress) && t.c(this.filesInfo, params.filesInfo);
        }

        public int hashCode() {
            int iE = ((((ry.a.e(this.signedBase64Xml) * 31) + this.data.hashCode()) * 31) + this.ownerWithAge.hashCode()) * 31;
            String str = this.officeEdorAddress;
            return ((iE + (str == null ? 0 : str.hashCode())) * 31) + this.filesInfo.hashCode();
        }

        public String toString() {
            return "Params(signedBase64Xml=" + ((Object) ry.a.f(this.signedBase64Xml)) + ", data=" + this.data + ", ownerWithAge=" + this.ownerWithAge + ", officeEdorAddress=" + this.officeEdorAddress + ", filesInfo=" + this.filesInfo + ')';
        }

        private Params(b0 b0Var, al0.b0 b0Var2, al0.g gVar, String str, List<BEFileInfo> list) {
            this.signedBase64Xml = b0Var;
            this.data = b0Var2;
            this.ownerWithAge = gVar;
            this.officeEdorAddress = str;
            this.filesInfo = list;
        }
    }

    private final m1 e(al0.b0 b0Var) {
        if (b0Var instanceof Adult) {
            return null;
        }
        if (!(b0Var instanceof Child)) {
            if (b0Var instanceof Ward) {
                return m1.WARD;
            }
            throw new p();
        }
        w0 selectedChild = ((Child) b0Var).getSelectedChild();
        if (t.c(selectedChild, w0.a.f7557a) || t.c(selectedChild, w0.b.f7558a)) {
            return m1.CHILD_WITHOUT_PARENTIZATION;
        }
        if (selectedChild instanceof w0.Specific) {
            return m1.CHILD_WITH_PARENTIZATION;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SubmitPhysicalIdCardApplicationV4Request b(Params params) {
        al0.b0 data = params.getData();
        return new SubmitPhysicalIdCardApplicationV4Request(f.a(params.getOwnerWithAge()), new CommunityOfficeDto(data.getCommunityOffice().getId(), params.getOfficeEdorAddress()), c0.e(params.getSignedBase64Xml()), e(params.getData()), f.k(data.getBeContactDetailsData()), null, e.c(params.b()), 32, null);
    }
}
