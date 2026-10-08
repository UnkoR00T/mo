package pa3;

import ba3.ContactDetails;
import fr.t;
import iy.b0;
import iy.c0;
import ka3.p;
import n30.CardListData;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpa3/h;", "Lxw/f;", "Lpa3/h$a;", "Lka3/p$a$d;", "Lmx/c;", "labelProvider", "Lpa3/i;", "singleCardMapper", "<init>", "(Lmx/c;Lpa3/i;)V", "params", "c", "(Lpa3/h$a;)Lka3/p$a$d;", "a", "Lmx/c;", "b", "Lpa3/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, p.a.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i singleCardMapper;

    /* JADX INFO: renamed from: pa3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpa3/h$a;", "", "Lz93/p;", "personalData", "Lba3/a;", "contactDetails", "<init>", "(Lz93/p;Lba3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/p;", "()Lz93/p;", "b", "Lba3/a;", "getContactDetails", "()Lba3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f153930c = PhoneNumber.f221634d | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TravelPersonalData personalData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetails contactDetails;

        public Params(TravelPersonalData travelPersonalData, ContactDetails contactDetails) {
            this.personalData = travelPersonalData;
            this.contactDetails = contactDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelPersonalData getPersonalData() {
            return this.personalData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.personalData, params.personalData) && t.c(this.contactDetails, params.contactDetails);
        }

        public int hashCode() {
            return (this.personalData.hashCode() * 31) + this.contactDetails.hashCode();
        }

        public String toString() {
            return "Params(personalData=" + this.personalData + ", contactDetails=" + this.contactDetails + ')';
        }
    }

    public h(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.singleCardMapper = iVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p.a.Section b(Params params) {
        return new p.a.Section(this.labelProvider.c(r93.a.O0), new CardListData(v.s(this.singleCardMapper.b(new i.Params(new i.Params.TopInfoLabel(this.labelProvider.c(r93.a.f172530y), null, 2, null), mx.b.b(params.getPersonalData().b(), "nameAndSurname"), null, null, null, 28, null)), this.singleCardMapper.b(new i.Params(new i.Params.TopInfoLabel(this.labelProvider.c(r93.a.J), null, 2, null), mx.b.b(c0.e(params.getPersonalData().getPesel()), "pesel"), j70.a.LETTER_BY_LETTER, null, null, 24, null))), null, false, null, null, 30, null));
    }
}
