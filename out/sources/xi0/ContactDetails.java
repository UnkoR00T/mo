package xi0;

import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: xi0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0019\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u0017\u0010-\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lxi0/e;", "", "", "Lxi0/a;", "contactDetails", "<init>", "(Ljava/util/List;)V", "Liy/b0;", "a", "(Liy/b0;)Liy/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lxi0/a;", "c", "()Lxi0/a;", "emailData", "Liy/b0;", "g", "()Liy/b0;", "registeredEmail", "d", "phoneData", "Lxw/h;", "e", "Lxw/h;", "h", "()Lxw/h;", "registeredPhoneNumber", "f", "previousEmailData", "previousPhoneNumberData", "Z", "i", "()Z", "isSomeRegistryContactAdded", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ContactDetail> contactDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ContactDetail emailData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0 registeredEmail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ContactDetail phoneData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PhoneNumber registeredPhoneNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ContactDetail previousEmailData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ContactDetail previousPhoneNumberData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isSomeRegistryContactAdded;

    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    public ContactDetails(List<ContactDetail> list) {
        ContactDetail aVar;
        Object next;
        ContactDetail aVar2;
        Object next2;
        PhoneNumber phoneNumber;
        Object next3;
        Object next4;
        b0 b0VarD;
        Object next5;
        b0 value;
        Object next6;
        Object next7;
        this.contactDetails = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ContactDetail) obj).getType() == d.EMAIL) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        boolean z15 = false;
        if (size == 0) {
            aVar = null;
        } else if (size != 1) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it.next();
            } while (((ContactDetail) next7).getStatus() != c.PENDING);
            aVar = (ContactDetail) next7;
        } else {
            aVar = (ContactDetail) arrayList.get(0);
        }
        this.emailData = aVar;
        List<ContactDetail> list2 = this.contactDetails;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((ContactDetail) obj2).getType() == d.EMAIL) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (((ContactDetail) next).getStatus() != c.IN_REGISTRY);
        ContactDetail aVar3 = (ContactDetail) next;
        this.registeredEmail = aVar3 != null ? aVar3.getValue() : null;
        List<ContactDetail> list3 = this.contactDetails;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (((ContactDetail) obj3).getType() == d.PHONE) {
                arrayList3.add(obj3);
            }
        }
        int size2 = arrayList3.size();
        if (size2 == 0) {
            aVar2 = null;
        } else if (size2 != 1) {
            Iterator it5 = arrayList3.iterator();
            do {
                if (!it5.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it5.next();
            } while (((ContactDetail) next6).getStatus() != c.PENDING);
            aVar2 = (ContactDetail) next6;
        } else {
            aVar2 = (ContactDetail) arrayList3.get(0);
        }
        this.phoneData = aVar2;
        List<ContactDetail> list4 = this.contactDetails;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list4) {
            if (((ContactDetail) obj4).getType() == d.PHONE) {
                arrayList4.add(obj4);
            }
        }
        Iterator it6 = arrayList4.iterator();
        do {
            if (!it6.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it6.next();
        } while (((ContactDetail) next2).getStatus() != c.IN_REGISTRY);
        ContactDetail aVar4 = (ContactDetail) next2;
        if (aVar4 == null || (b0VarD = aVar4.getValue()) == null) {
            phoneNumber = null;
        } else {
            Iterator<T> it7 = aVar4.a().iterator();
            do {
                if (!it7.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it7.next();
            } while (!t.c(((ContactDetailAdditionalValue) next5).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next5;
            if (contactDetailAdditionalValue == null || (value = contactDetailAdditionalValue.getValue()) == null) {
                phoneNumber = null;
            } else {
                phoneNumber = new PhoneNumber(PhoneNumber.c.c(a(value)), PhoneNumber.b.c(b0VarD), null);
            }
        }
        this.registeredPhoneNumber = phoneNumber;
        Iterator<T> it8 = this.contactDetails.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it8.next();
            ContactDetail aVar5 = (ContactDetail) next3;
            if (aVar5.getType() == d.EMAIL && aVar5.getStatus() == c.IN_REGISTRY) {
                break;
            }
        }
        ContactDetail aVar6 = this.emailData;
        this.previousEmailData = (ContactDetail) ((aVar6 != null ? aVar6.getStatus() : null) != c.PENDING ? null : next3);
        Iterator<T> it9 = this.contactDetails.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it9.next();
            ContactDetail aVar7 = (ContactDetail) next4;
            if (aVar7.getType() == d.PHONE && aVar7.getStatus() == c.IN_REGISTRY) {
                break;
            }
        }
        ContactDetail aVar8 = this.phoneData;
        this.previousPhoneNumberData = (ContactDetail) ((aVar8 != null ? aVar8.getStatus() : null) == c.PENDING ? next4 : null);
        List<ContactDetail> list5 = this.contactDetails;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            z15 = true;
        } else {
            Iterator<T> it10 = list5.iterator();
            while (it10.hasNext()) {
                if (((ContactDetail) it10.next()).getStatus() == c.IN_REGISTRY) {
                }
            }
            z15 = true;
        }
        this.isSomeRegistryContactAdded = !z15;
    }

    private final b0 a(b0 b0Var) {
        String strE = c0.e(b0Var);
        if ((r.V(strE, "+", false, 2, null) ? null : strE) != null) {
            String str = "+" + strE;
            if (str != null) {
                strE = str;
            }
        }
        return c0.g(strE);
    }

    public final List<ContactDetail> b() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContactDetail getEmailData() {
        return this.emailData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ContactDetail getPhoneData() {
        return this.phoneData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ContactDetail getPreviousEmailData() {
        return this.previousEmailData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContactDetails) && t.c(this.contactDetails, ((ContactDetails) other).contactDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ContactDetail getPreviousPhoneNumberData() {
        return this.previousPhoneNumberData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getRegisteredEmail() {
        return this.registeredEmail;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PhoneNumber getRegisteredPhoneNumber() {
        return this.registeredPhoneNumber;
    }

    public int hashCode() {
        return this.contactDetails.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsSomeRegistryContactAdded() {
        return this.isSomeRegistryContactAdded;
    }

    public String toString() {
        return "ContactDetails(contactDetails=" + this.contactDetails + ")";
    }
}
