package vb3;

import iy.b0;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import z93.TravelChildData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz93/p;", "", "isChecked", "Lvb3/c;", "b", "(Lz93/p;Z)Lvb3/c;", "Lz93/j;", "a", "(Lz93/j;Z)Lvb3/c;", "", "Liy/b0;", "chosenParticipantsPesels", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final ParticipantUIData a(TravelChildData travelChildData, boolean z15) {
        return new ParticipantUIData(z15, new TravelPersonalData(travelChildData.getFirstName(), travelChildData.getPesel(), travelChildData.getSurname(), null));
    }

    public static final ParticipantUIData b(TravelPersonalData travelPersonalData, boolean z15) {
        return new ParticipantUIData(z15, new TravelPersonalData(travelPersonalData.getFirstName(), travelPersonalData.getPesel(), travelPersonalData.getSurname(), null));
    }

    public static final List<ParticipantUIData> c(List<TravelChildData> list, List<b0> list2) {
        List<TravelChildData> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        for (TravelChildData travelChildData : list3) {
            arrayList.add(a(travelChildData, list2.contains(travelChildData.getPesel())));
        }
        return arrayList;
    }
}
