package tx2;

import al0.x0;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import ux2.Section;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltx2/m;", "Lxw/f;", "Ltx2/m$a;", "", "Lux2/a;", "Ltx2/h;", "dataMapper", "<init>", "(Ltx2/h;)V", "params", "c", "(Ltx2/m$a;)Ljava/util/List;", "a", "Ltx2/h;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, List<? extends Section>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h dataMapper;

    /* JADX INFO: renamed from: tx2.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltx2/m$a;", "", "Lal0/g;", "ownerWithAge", "Lal0/x0;", "data", "<init>", "(Lal0/g;Lal0/x0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/g;", "b", "()Lal0/g;", "Lal0/x0;", "()Lal0/x0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final x0 data;

        public Params(al0.g gVar, x0 x0Var) {
            this.ownerWithAge = gVar;
            this.data = x0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final al0.g getOwnerWithAge() {
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
            return t.c(this.ownerWithAge, params.ownerWithAge) && t.c(this.data, params.data);
        }

        public int hashCode() {
            return (this.ownerWithAge.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Params(ownerWithAge=" + this.ownerWithAge + ", data=" + this.data + ')';
        }
    }

    public m(h hVar) {
        this.dataMapper = hVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<Section> b(Params params) {
        Boolean hasPersonalSigningCertificate;
        x0 data = params.getData();
        Section sectionF = this.dataMapper.f(data.getParentOrGuardData());
        Section sectionA = this.dataMapper.a(data.getChildData(), params.getOwnerWithAge());
        Section sectionE = this.dataMapper.e(data.getParentsData(), params.getOwnerWithAge());
        Section sectionH = this.dataMapper.h(data.getReasonForApplying());
        al0.g ownerWithAge = params.getOwnerWithAge();
        Section sectionG = null;
        if (!ownerWithAge.getIsElectronicSignatureRequired()) {
            ownerWithAge = null;
        }
        if (ownerWithAge != null && (hasPersonalSigningCertificate = data.getHasPersonalSigningCertificate()) != null) {
            sectionG = this.dataMapper.g(hasPersonalSigningCertificate.booleanValue());
        }
        return v.s(sectionF, sectionA, sectionE, sectionH, sectionG, this.dataMapper.b(data.getCommunityOffice()), this.dataMapper.d(data.getCorrespondenceAddressData()), this.dataMapper.c(data.getBeContactDetailsData(), data.getUserEdorAddress()));
    }
}
