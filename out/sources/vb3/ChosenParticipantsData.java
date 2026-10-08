package vb3;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import z93.TravelPersonalData;

/* JADX INFO: renamed from: vb3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvb3/a;", "", "", "isUserParticipant", "", "Lz93/p;", "childrenParticipants", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChosenParticipantsData {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f205948d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ChosenParticipantsData f205949e = new ChosenParticipantsData(true, v.n());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserParticipant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TravelPersonalData> childrenParticipants;

    /* JADX INFO: renamed from: vb3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvb3/a$a;", "", "<init>", "()V", "Lvb3/a;", "ONLY_USER", "Lvb3/a;", "a", "()Lvb3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final ChosenParticipantsData a() {
            return ChosenParticipantsData.f205949e;
        }

        private Companion() {
        }
    }

    public ChosenParticipantsData(boolean z15, List<TravelPersonalData> list) {
        this.isUserParticipant = z15;
        this.childrenParticipants = list;
    }

    public final List<TravelPersonalData> b() {
        return this.childrenParticipants;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsUserParticipant() {
        return this.isUserParticipant;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChosenParticipantsData)) {
            return false;
        }
        ChosenParticipantsData chosenParticipantsData = (ChosenParticipantsData) other;
        return this.isUserParticipant == chosenParticipantsData.isUserParticipant && t.c(this.childrenParticipants, chosenParticipantsData.childrenParticipants);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isUserParticipant) * 31) + this.childrenParticipants.hashCode();
    }

    public String toString() {
        return "ChosenParticipantsData(isUserParticipant=" + this.isUserParticipant + ", childrenParticipants=" + this.childrenParticipants + ')';
    }
}
