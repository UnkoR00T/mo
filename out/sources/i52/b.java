package i52;

import er.l;
import fr.t;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import wr0.BEPaymentAddress;
import xw.f;
import zr0.BEInstitution;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Li52/b;", "Lxw/f;", "Li52/b$a;", "Ln50/k;", "<init>", "()V", "Lwr0/a;", "Lmx/a;", "h", "(Lwr0/a;)Lmx/a;", "params", "e", "(Li52/b$a;)Ln50/k;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, k> {

    /* JADX INFO: renamed from: i52.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Li52/b$a;", "", "Lzr0/c;", "institution", "Lkotlin/Function1;", "Loq/i0;", "onInstitutionSelectedAction", "<init>", "(Lzr0/c;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzr0/c;", "()Lzr0/c;", "b", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEInstitution institution;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEInstitution, i0> onInstitutionSelectedAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(BEInstitution bEInstitution, l<? super BEInstitution, i0> lVar) {
            this.institution = bEInstitution;
            this.onInstitutionSelectedAction = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEInstitution getInstitution() {
            return this.institution;
        }

        public final l<BEInstitution, i0> b() {
            return this.onInstitutionSelectedAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.institution, params.institution) && t.c(this.onInstitutionSelectedAction, params.onInstitutionSelectedAction);
        }

        public int hashCode() {
            return (this.institution.hashCode() * 31) + this.onInstitutionSelectedAction.hashCode();
        }

        public String toString() {
            return "Params(institution=" + this.institution + ", onInstitutionSelectedAction=" + this.onInstitutionSelectedAction + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params) {
        params.b().b(params.getInstitution());
        return i0.f148189a;
    }

    private final Label h(BEPaymentAddress bEPaymentAddress) {
        StringBuilder sb5 = new StringBuilder();
        String street = bEPaymentAddress.getStreet();
        if (street != null) {
            sb5.append("ul. " + street);
        }
        String buildingNumber = bEPaymentAddress.getBuildingNumber();
        if (buildingNumber != null) {
            sb5.append(' ' + buildingNumber);
        }
        String apartmentNumber = bEPaymentAddress.getApartmentNumber();
        if (apartmentNumber != null) {
            sb5.append('/' + apartmentNumber);
        }
        String postalCode = bEPaymentAddress.getPostalCode();
        if (postalCode != null) {
            sb5.append(", " + postalCode);
        }
        String city = bEPaymentAddress.getCity();
        if (city != null) {
            sb5.append(' ' + city);
        }
        return mx.b.b(sb5.toString(), "institutionDescription");
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k b(final Params params) {
        return new DefaultSingleCardData(null, new er.a() { // from class: i52.a
            @Override // er.a
            public final Object a() {
                return b.f(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(params.getInstitution().getName(), "institutionTitle"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(h(params.getInstitution().getAddress()), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }
}
