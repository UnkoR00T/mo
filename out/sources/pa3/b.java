package pa3;

import ba3.ContactDetails;
import fr.t;
import ka3.p;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpa3/b;", "Lxw/f;", "Lpa3/b$a;", "Lka3/p$a$d;", "Lmx/c;", "labelProvider", "Lpa3/i;", "singleCardMapper", "<init>", "(Lmx/c;Lpa3/i;)V", "Lba3/a;", "Ln50/g;", "e", "(Lba3/a;)Ln50/g;", "f", "params", "c", "(Lpa3/b$a;)Lka3/p$a$d;", "a", "Lmx/c;", "b", "Lpa3/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, p.a.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i singleCardMapper;

    /* JADX INFO: renamed from: pa3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpa3/b$a;", "", "Lba3/a;", "data", "<init>", "(Lba3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lba3/a;", "()Lba3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f153906b = PhoneNumber.f221634d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetails data;

        public Params(ContactDetails contactDetails) {
            this.data = contactDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ContactDetails getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public b(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.singleCardMapper = iVar;
    }

    private final DefaultSingleCardData e(ContactDetails contactDetails) {
        String email = contactDetails.getEmail();
        if (!contactDetails.getIsEmailChecked()) {
            email = null;
        }
        if (email != null) {
            return this.singleCardMapper.b(new i.Params(null, this.labelProvider.c(r93.a.f172477g0), null, mx.b.b(email, "email"), null, 21, null));
        }
        return null;
    }

    private final DefaultSingleCardData f(ContactDetails contactDetails) {
        PhoneNumber phoneNumber = contactDetails.getPhoneNumber();
        if (!contactDetails.getIsPhoneNumberChecked()) {
            phoneNumber = null;
        }
        if (phoneNumber != null) {
            return this.singleCardMapper.b(new i.Params(null, this.labelProvider.c(r93.a.f172486j0), null, mx.b.b(phoneNumber.f(), "phoneNumber"), null, 21, null));
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p.a.Section b(Params params) {
        ContactDetails data = params.getData();
        return new p.a.Section(this.labelProvider.c(r93.a.f172489k0), new CardListData(v.s(e(data), f(data)), null, false, null, null, 30, null));
    }
}
