package mb3;

import ba3.ContactDetails;
import hb3.l1;
import ia3.SummaryData;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;
import vb3.ChosenParticipantsData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmb3/e;", "Lh00/a;", "Lhb3/l1$d;", "Lh00/b;", "Lia3/a;", "Lz93/p;", "personalData", "<init>", "(Lz93/p;)V", "g", "()Lia3/a;", "c", "Lz93/p;", "getPersonalData", "()Lz93/p;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends h00.a<l1.d, h00.b, SummaryData> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125269d = h00.a.f79185b | b0.f97726c;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TravelPersonalData personalData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmb3/e$a;", "", "Lz93/p;", "personalData", "Lmb3/e;", "a", "(Lz93/p;)Lmb3/e;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        e a(TravelPersonalData personalData);
    }

    public e(TravelPersonalData travelPersonalData) {
        this.personalData = travelPersonalData;
    }

    @Override // h00.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SummaryData e() {
        return new SummaryData(this.personalData, (ContactDetails) f(l1.d.a.f82927d), (ChosenParticipantsData) f(l1.d.C1907d.f82930d), (List) f(l1.d.f.f82932d));
    }
}
