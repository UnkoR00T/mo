package vf3;

import p071kotlin.Metadata;
import xw.PhoneNumber;
import yf3.ContactDetailsFields;

/* JADX INFO: renamed from: vf3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lvf3/b;", "", "Lyf3/a;", "contactDetailsFields", "Ld60/j;", "Lyf3/a$b;", "scrollInstance", "<init>", "(Lyf3/a;Ld60/j;)V", "a", "(Lyf3/a;Ld60/j;)Lvf3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyf3/a;", "c", "()Lyf3/a;", "b", "Ld60/j;", "d", "()Ld60/j;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f206476c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactDetailsFields contactDetailsFields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<ContactDetailsFields.b> scrollInstance;

    static {
        int i15 = iy.b0.f97726c;
        int i16 = hz.b.f86845b;
        f206476c = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16 | PhoneNumber.f221634d | i16 | i16;
    }

    public FormData(ContactDetailsFields contactDetailsFields, d60.j<ContactDetailsFields.b> jVar) {
        this.contactDetailsFields = contactDetailsFields;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormData b(FormData formData, ContactDetailsFields contactDetailsFields, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            contactDetailsFields = formData.contactDetailsFields;
        }
        if ((i15 & 2) != 0) {
            jVar = formData.scrollInstance;
        }
        return formData.a(contactDetailsFields, jVar);
    }

    public final FormData a(ContactDetailsFields contactDetailsFields, d60.j<ContactDetailsFields.b> scrollInstance) {
        return new FormData(contactDetailsFields, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContactDetailsFields getContactDetailsFields() {
        return this.contactDetailsFields;
    }

    public final d60.j<ContactDetailsFields.b> d() {
        return this.scrollInstance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) other;
        return fr.t.c(this.contactDetailsFields, formData.contactDetailsFields) && fr.t.c(this.scrollInstance, formData.scrollInstance);
    }

    public int hashCode() {
        int iHashCode = this.contactDetailsFields.hashCode() * 31;
        d60.j<ContactDetailsFields.b> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "FormData(contactDetailsFields=" + this.contactDetailsFields + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ FormData(ContactDetailsFields contactDetailsFields, d60.j jVar, int i15, fr.k kVar) {
        this(contactDetailsFields, (i15 & 2) != 0 ? null : jVar);
    }
}
