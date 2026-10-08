package vg1;

import ah1.ServiceEntry;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.dashboard.data.model.ServiceEntryDto;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvg1/a;", "", "<init>", "()V", "Lah1/e;", "Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;", "b", "(Lah1/e;)Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;", "a", "(Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;)Lah1/e;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f206701a = new a();

    private a() {
    }

    public final ServiceEntry a(ServiceEntryDto serviceEntryDto) {
        return new ServiceEntry(serviceEntryDto.getType(), serviceEntryDto.getSupplementOrigin());
    }

    public final ServiceEntryDto b(ServiceEntry serviceEntry) {
        return new ServiceEntryDto(serviceEntry.getType(), serviceEntry.getSupplementOrigin());
    }
}
