package ha3;

import fr.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lha3/a;", "Lgz/a;", "Lha3/a$a;", "Ljava/time/LocalDate;", "Lg14/a;", "getInfoFromPeselUC", "<init>", "(Lg14/a;)V", "params", "b", "(Lha3/a$a;)Ljava/time/LocalDate;", "a", "Lg14/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, LocalDate> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: ha3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lha3/a$a;", "Lgz/b$a;", "", "Lz93/p;", "childrenParticipants", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<TravelPersonalData> childrenParticipants;

        public Params(List<TravelPersonalData> list) {
            this.childrenParticipants = list;
        }

        public final List<TravelPersonalData> a() {
            return this.childrenParticipants;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.childrenParticipants, ((Params) other).childrenParticipants);
        }

        public int hashCode() {
            return this.childrenParticipants.hashCode();
        }

        public String toString() {
            return "Params(childrenParticipants=" + this.childrenParticipants + ')';
        }
    }

    public a(g14.a aVar) {
        this.getInfoFromPeselUC = aVar;
    }

    public LocalDate b(Params params) {
        LocalDate localDate;
        List<TravelPersonalData> listA = params.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (true) {
            localDate = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(this.getInfoFromPeselUC.a(new g14.a.Params(((TravelPersonalData) it.next()).getPesel(), null)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof g14.a.b.Success) {
                arrayList2.add(obj);
            }
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            LocalDate birthDate = ((g14.a.b.Success) it4.next()).getBirthDate();
            loop2: while (true) {
                localDate = birthDate;
                while (it4.hasNext()) {
                    birthDate = ((g14.a.b.Success) it4.next()).getBirthDate();
                    if (localDate.compareTo(birthDate) > 0) {
                    }
                }
                break loop2;
            }
        }
        return localDate;
    }
}
