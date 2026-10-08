package z93;

import fr.t;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: z93.o, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, d2 = {"Lz93/o;", "", "", "Lz93/k;", "contactDetails", "<init>", "(Ljava/util/List;)V", "Liy/b0;", "a", "(Liy/b0;)Liy/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContactDetails", "()Ljava/util/List;", "b", "Liy/b0;", "()Liy/b0;", "registeredEmail", "Lxw/h;", "c", "Lxw/h;", "()Lxw/h;", "registeredPhoneNumber", "d", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelContactDetails {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f233760e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TravelContactDetail> contactDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 registeredEmail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PhoneNumber registeredPhoneNumber;

    public TravelContactDetails(List<TravelContactDetail> list) {
        PhoneNumber phoneNumber;
        Object next;
        Object next2;
        b0 value;
        Object next3;
        b0 value2;
        this.contactDetails = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TravelContactDetail) obj).getType() == n.EMAIL) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            phoneNumber = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TravelContactDetail) next).getStatus() != m.IN_REGISTRY);
        TravelContactDetail travelContactDetail = (TravelContactDetail) next;
        this.registeredEmail = travelContactDetail != null ? travelContactDetail.getValue() : null;
        List<TravelContactDetail> list2 = this.contactDetails;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((TravelContactDetail) obj2).getType() == n.PHONE) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((TravelContactDetail) next2).getStatus() != m.IN_REGISTRY);
        TravelContactDetail travelContactDetail2 = (TravelContactDetail) next2;
        if (travelContactDetail2 != null && (value = travelContactDetail2.getValue()) != null) {
            Iterator<T> it5 = travelContactDetail2.a().iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (!t.c(((TravelContactDetailAdditionalValue) next3).getKey(), "PREFIX"));
            TravelContactDetailAdditionalValue travelContactDetailAdditionalValue = (TravelContactDetailAdditionalValue) next3;
            if (travelContactDetailAdditionalValue != null && (value2 = travelContactDetailAdditionalValue.getValue()) != null) {
                phoneNumber = new PhoneNumber(PhoneNumber.c.c(a(value2)), PhoneNumber.b.c(value), null);
            }
        }
        this.registeredPhoneNumber = phoneNumber;
    }

    private final b0 a(b0 b0Var) {
        String strE = c0.e(b0Var);
        if ((fu.r.V(strE, "+", false, 2, null) ? null : strE) != null) {
            String str = '+' + strE;
            if (str != null) {
                strE = str;
            }
        }
        return c0.g(strE);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getRegisteredEmail() {
        return this.registeredEmail;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhoneNumber getRegisteredPhoneNumber() {
        return this.registeredPhoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TravelContactDetails) && t.c(this.contactDetails, ((TravelContactDetails) other).contactDetails);
    }

    public int hashCode() {
        return this.contactDetails.hashCode();
    }

    public String toString() {
        return "TravelContactDetails(contactDetails=" + this.contactDetails + ')';
    }
}
