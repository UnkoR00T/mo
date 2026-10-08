package p51;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: p51.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0010\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lp51/d;", "", "Lp51/d$a$a;", "temporaryAddressEndDateField", "<init>", "(Lp51/d$a$a;)V", "", "Lp51/d$a;", "b", "()Ljava/util/List;", "", "e", "()Z", "Lp51/d$b;", "c", "()Lp51/d$b;", "a", "(Lp51/d$a$a;)Lp51/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lp51/d$a$a;", "d", "()Lp51/d$a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisteredAddressFields {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153063b = fz.b.LocalDate.f68860b | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.TemporaryAddressEndDate temporaryAddressEndDateField;

    /* JADX INFO: renamed from: p51.d$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lp51/d$b;", "", "a", "Lp51/d$b$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: p51.d$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lp51/d$b$a;", "Lp51/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum a implements b {
            TemporaryAddressEndDate;


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ wq.a f153071c = wq.b.a(b());
        }
    }

    public RegisteredAddressFields(a.TemporaryAddressEndDate temporaryAddressEndDate) {
        this.temporaryAddressEndDateField = temporaryAddressEndDate;
    }

    private final List<a> b() {
        return pq.v.r(this.temporaryAddressEndDateField);
    }

    public final RegisteredAddressFields a(a.TemporaryAddressEndDate temporaryAddressEndDateField) {
        return new RegisteredAddressFields(temporaryAddressEndDateField);
    }

    public final b c() {
        Object next;
        Iterator<T> it = b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).isValid());
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.getIndex();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a.TemporaryAddressEndDate getTemporaryAddressEndDateField() {
        return this.temporaryAddressEndDateField;
    }

    public final boolean e() {
        List<a> listB = b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            return true;
        }
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RegisteredAddressFields) && fr.t.c(this.temporaryAddressEndDateField, ((RegisteredAddressFields) other).temporaryAddressEndDateField);
    }

    public int hashCode() {
        a.TemporaryAddressEndDate temporaryAddressEndDate = this.temporaryAddressEndDateField;
        if (temporaryAddressEndDate == null) {
            return 0;
        }
        return temporaryAddressEndDate.hashCode();
    }

    public String toString() {
        return "RegisteredAddressFields(temporaryAddressEndDateField=" + this.temporaryAddressEndDateField + ')';
    }

    /* JADX INFO: renamed from: p51.d$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lp51/d$a;", "", "", "isValid", "()Z", "Lp51/d$b;", "getIndex", "()Lp51/d$b;", "index", "a", "Lp51/d$a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        b getIndex();

        boolean isValid();

        /* JADX INFO: renamed from: p51.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lp51/d$a$a;", "Lp51/d$a;", "Lhz/b;", "validationState", "Lfz/b$c;", "date", "<init>", "(Lhz/b;Lfz/b$c;)V", "", "isValid", "()Z", "a", "(Lhz/b;Lfz/b$c;)Lp51/d$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "e", "()Lhz/b;", "b", "Lfz/b$c;", "c", "()Lfz/b$c;", "Lp51/d$b$a;", "Lp51/d$b$a;", "d", "()Lp51/d$b$a;", "index", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TemporaryAddressEndDate implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f153065d = fz.b.LocalDate.f68860b | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final fz.b.LocalDate date;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final b.a index;

            public TemporaryAddressEndDate(hz.b bVar, fz.b.LocalDate localDate) {
                this.validationState = bVar;
                this.date = localDate;
                this.index = b.a.TemporaryAddressEndDate;
            }

            public static /* synthetic */ TemporaryAddressEndDate b(TemporaryAddressEndDate temporaryAddressEndDate, hz.b bVar, fz.b.LocalDate localDate, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = temporaryAddressEndDate.validationState;
                }
                if ((i15 & 2) != 0) {
                    localDate = temporaryAddressEndDate.date;
                }
                return temporaryAddressEndDate.a(bVar, localDate);
            }

            public final TemporaryAddressEndDate a(hz.b validationState, fz.b.LocalDate date) {
                return new TemporaryAddressEndDate(validationState, date);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final fz.b.LocalDate getDate() {
                return this.date;
            }

            @Override // p51.RegisteredAddressFields.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public b.a getIndex() {
                return this.index;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TemporaryAddressEndDate)) {
                    return false;
                }
                TemporaryAddressEndDate temporaryAddressEndDate = (TemporaryAddressEndDate) other;
                return fr.t.c(this.validationState, temporaryAddressEndDate.validationState) && fr.t.c(this.date, temporaryAddressEndDate.date);
            }

            public int hashCode() {
                int iHashCode = this.validationState.hashCode() * 31;
                fz.b.LocalDate localDate = this.date;
                return iHashCode + (localDate == null ? 0 : localDate.hashCode());
            }

            @Override // p51.RegisteredAddressFields.a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "TemporaryAddressEndDate(validationState=" + this.validationState + ", date=" + this.date + ')';
            }

            public /* synthetic */ TemporaryAddressEndDate(hz.b bVar, fz.b.LocalDate localDate, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, localDate);
            }
        }
    }
}
