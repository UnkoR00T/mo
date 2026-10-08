package mb3;

import ba3.ContactDetails;
import ga3.Stage;
import hb3.l1;
import ia3.SummaryData;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vb3.ChosenParticipantsData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010 \"\u0004\b\u0013\u0010!R0\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020$0#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010.¨\u00060"}, d2 = {"Lmb3/d;", "Lmb3/b;", "Lz93/p;", "personalData", "Lmb3/a;", "tripContext", "Lmb3/e$a;", "dataSourceFactory", "<init>", "(Lz93/p;Lmb3/a;Lmb3/e$a;)V", "Lba3/a;", "data", "Loq/i0;", "W", "(Lba3/a;)V", "a", "Lz93/p;", "i", "()Lz93/p;", "b", "Lmb3/a;", "d", "()Lmb3/a;", "c", "Lmb3/e$a;", "Lmb3/e;", "Loq/k;", "j", "()Lmb3/e;", "dataSource", "Lvb3/a;", "value", "()Lvb3/a;", "(Lvb3/a;)V", "chosenParticipantsData", "", "Lga3/c;", "e", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "stages", "V", "()Lba3/a;", "contactDetails", "Lia3/a;", "()Lia3/a;", "summaryData", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TravelPersonalData personalData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mb3.a tripContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e.a dataSourceFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k dataSource = oq.l.a(new er.a() { // from class: mb3.c
        @Override // er.a
        public final Object a() {
            return d.h(this.f125264a);
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmb3/d$a;", "", "Lz93/p;", "personalData", "Lmb3/a;", "tripContext", "Lmb3/d;", "a", "(Lz93/p;Lmb3/a;)Lmb3/d;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        d a(TravelPersonalData personalData, mb3.a tripContext);
    }

    public d(TravelPersonalData travelPersonalData, mb3.a aVar, e.a aVar2) {
        this.personalData = travelPersonalData;
        this.tripContext = aVar;
        this.dataSourceFactory = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e h(d dVar) {
        return dVar.dataSourceFactory.a(dVar.getPersonalData());
    }

    private final e j() {
        return (e) this.dataSource.getValue();
    }

    @Override // jb3.a
    public ContactDetails V() {
        return (ContactDetails) j().b(l1.d.a.f82927d);
    }

    @Override // jb3.a
    public void W(ContactDetails data) {
        j().a(l1.d.a.f82927d, new TripResult(data));
    }

    @Override // tb3.a, ac3.a
    public ChosenParticipantsData a() {
        ChosenParticipantsData chosenParticipantsData = (ChosenParticipantsData) j().b(l1.d.C1907d.f82930d);
        return chosenParticipantsData == null ? ChosenParticipantsData.INSTANCE.a() : chosenParticipantsData;
    }

    @Override // tb3.a
    public void b(ChosenParticipantsData chosenParticipantsData) {
        j().a(l1.d.C1907d.f82930d, new TripResult(chosenParticipantsData));
    }

    @Override // ma3.a
    public SummaryData c() {
        return j().e();
    }

    @Override // ma3.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public mb3.a getTripContext() {
        return this.tripContext;
    }

    @Override // ac3.a
    public List<Stage> e() {
        List<Stage> list = (List) j().b(l1.d.f.f82932d);
        return list == null ? v.n() : list;
    }

    @Override // ac3.a
    public void f(List<Stage> list) {
        j().a(l1.d.f.f82932d, new TripResult(list));
    }

    @Override // tb3.a
    /* JADX INFO: renamed from: i, reason: from getter */
    public TravelPersonalData getPersonalData() {
        return this.personalData;
    }
}
