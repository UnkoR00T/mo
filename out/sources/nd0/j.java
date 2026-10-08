package nd0;

import cg0.Address;
import cg0.School;
import cg0.SchoolCardDataContainer;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import pe0.DocumentPhotoData;
import pe0.ItemData;
import pe0.VerificationDocumentData;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnd0/j;", "Lxw/f;", "Lnd0/j$a;", "Lpe0/d;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lcg0/c;", "", "e", "(Lcg0/c;)Ljava/lang/String;", "Lcg0/b;", "f", "(Lcg0/b;)Ljava/lang/String;", "Lcg0/a;", "c", "(Lcg0/a;)Ljava/lang/String;", "params", "h", "(Lnd0/j$a;)Lpe0/d;", "a", "Lmx/c;", "b", "Lez/e;", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, VerificationDocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: nd0.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnd0/j$a;", "", "Lod0/i$e$a;", "state", "<init>", "(Lod0/i$e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lod0/i$e$a;", "()Lod0/i$e$a;", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final od0.i.e.Displaying state;

        public Params(od0.i.e.Displaying displaying) {
            this.state = displaying;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final od0.i.e.Displaying getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.state, ((Params) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ')';
        }
    }

    public j(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String c(Address address) {
        StringBuilder sb5 = new StringBuilder();
        String street = address.getStreet();
        if (street != null) {
            sb5.append(street);
            sb5.append(" ");
        } else {
            String city = address.getCity();
            if (city != null) {
                sb5.append(city);
                sb5.append(" ");
            }
        }
        String buildingNumber = address.getBuildingNumber();
        if (buildingNumber != null) {
            sb5.append(buildingNumber);
        }
        String flatNumber = address.getFlatNumber();
        if (flatNumber != null) {
            sb5.append("/");
            sb5.append(flatNumber);
        }
        sb5.append(",");
        String zipCode = address.getZipCode();
        if (zipCode != null) {
            sb5.append(zipCode);
            sb5.append(" ");
        }
        String postOffice = address.getPostOffice();
        if (postOffice != null) {
            sb5.append(postOffice);
        } else {
            String city2 = address.getCity();
            if (city2 != null) {
                sb5.append(city2);
                i0 i0Var = i0.f148189a;
            }
        }
        return sb5.toString();
    }

    private final String e(SchoolCardDataContainer schoolCardDataContainer) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(schoolCardDataContainer.getFirstName());
        String secondName = schoolCardDataContainer.getSecondName();
        if (secondName != null) {
            sb5.append(" ");
            sb5.append(secondName);
        }
        return sb5.toString();
    }

    private final String f(School school) {
        return school.getHeadmasterFirstName() + " " + school.getHeadmasterLastName();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VerificationDocumentData b(Params params) {
        String documentId = params.getState().getSchoolCardData().getDocumentId();
        pe0.e eVar = pe0.e.SCHOOL_CARD;
        Label labelC = this.labelProvider.c(jd0.b.f101875v);
        int i15 = jz.a.P2;
        String scopeName = params.getState().getSchoolCardData().getScopeName();
        DocumentPhotoData documentPhotoData = new DocumentPhotoData(params.getState().getSchoolCardData().getScopeData().getContainer().getPicture(), params.getState().getSchoolCardData().getDocumentId(), params.getState().getSchoolCardData().getScopeName());
        ItemData itemData = new ItemData(this.labelProvider.c(jd0.b.f101868o), mx.b.d(e(params.getState().getSchoolCardData().getScopeData().getContainer()), "name"));
        ItemData itemData2 = new ItemData(this.labelProvider.c(jd0.b.f101871r), mx.b.d(params.getState().getSchoolCardData().getScopeData().getContainer().getLastName(), "lastName"));
        Label labelC2 = this.labelProvider.c(jd0.b.f101864k);
        ez.e eVar2 = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(params.getState().getSchoolCardData().getScopeData().getContainer().getDateOfBirth());
        fz.c cVar = fz.c.DOTTED;
        return new VerificationDocumentData(documentId, eVar, labelC, i15, scopeName, documentPhotoData, v.q(itemData, itemData2, new ItemData(labelC2, mx.b.d(eVar2.d(localDate, cVar), "dateOfBirth")), new ItemData(this.labelProvider.c(jd0.b.f101870q), mx.b.d(params.getState().getSchoolCardData().getScopeData().getContainer().getPesel(), "pesel")), new ItemData(this.labelProvider.c(jd0.b.f101858e), mx.b.d(this.dateFormatter.d(new fz.b.LocalDate(params.getState().getSchoolCardData().getScopeData().getContainer().getIssueDate()), cVar), "distributionDate")), new ItemData(this.labelProvider.c(jd0.b.f101860g), mx.b.d(this.dateFormatter.d(new fz.b.LocalDate(params.getState().getSchoolCardData().getScopeData().getContainer().getExpirationDate()), cVar), "expirationDate")), new ItemData(this.labelProvider.c(jd0.b.F), mx.b.d(params.getState().getSchoolCardData().getScopeData().getContainer().getSchool().getName(), "schoolName")), new ItemData(this.labelProvider.c(jd0.b.D), mx.b.d(c(params.getState().getSchoolCardData().getScopeData().getContainer().getSchool().getAddress()), "schoolAddress")), new ItemData(this.labelProvider.c(jd0.b.G), mx.b.d(params.getState().getSchoolCardData().getScopeData().getContainer().getSchool().getPhoneNumber(), "schoolName")), new ItemData(this.labelProvider.c(jd0.b.E), mx.b.d(f(params.getState().getSchoolCardData().getScopeData().getContainer().getSchool()), "schoolHeadmaster"))), null, null, MLKEMEngine.KyberPolyBytes, null);
    }
}
