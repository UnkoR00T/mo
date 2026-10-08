package wj3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import m70.TimelineData;
import m70.TimelineItemData;
import mx.Label;
import mx.c;
import n50.CustomSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import uj3.State;
import uj3.h;
import uv0.VehicleHistoryEvent;
import uv0.VehicleHistoryEventDetail;
import uv0.VehicleHistoryTimeline;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwj3/b;", "Lxw/f;", "Lwj3/b$a;", "Luj3/h$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Luv0/t;", "Lm70/a;", "f", "(Luv0/t;)Lm70/a;", "params", "e", "(Lwj3/b$a;)Luj3/h$a;", "a", "Lmx/c;", "b", "Lez/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: wj3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwj3/b$a;", "", "Luj3/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "<init>", "(Luj3/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luj3/g;", "b", "()Luj3/g;", "Ler/a;", "()Ler/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.backAction = aVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ')';
        }
    }

    public b(c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final TimelineData f(VehicleHistoryTimeline vehicleHistoryTimeline) {
        String strV0;
        List listE = v.e(new TimelineItemData(mx.b.b(String.valueOf(vehicleHistoryTimeline.getYearOfProduction()), "yearOfProduction"), this.labelProvider.c(yi3.a.f227226f1), null, 4, null));
        List<VehicleHistoryEvent> listA = vehicleHistoryTimeline.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (VehicleHistoryEvent vehicleHistoryEvent : listA) {
            Label labelB = mx.b.b(this.dateConverter.a(vehicleHistoryEvent.getDate()), "date");
            Label labelB2 = mx.b.b(vehicleHistoryEvent.getName(), "name");
            List<VehicleHistoryEventDetail> listB = vehicleHistoryEvent.b();
            arrayList.add(new TimelineItemData(labelB, labelB2, (listB == null || (strV0 = v.v0(listB, null, null, null, 0, null, new l() { // from class: wj3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.h((VehicleHistoryEventDetail) obj);
                }
            }, 31, null)) == null) ? null : mx.b.b(strV0, "description")));
        }
        return new TimelineData(v.L0(listE, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    public static final CharSequence h(VehicleHistoryEventDetail vehicleHistoryEventDetail) {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(vehicleHistoryEventDetail.getName());
        String value = vehicleHistoryEventDetail.getValue();
        if (value != null) {
            str = " : " + value;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb5.append(str);
        String string = sb5.toString();
        if (vehicleHistoryEventDetail.a().isEmpty()) {
            return string;
        }
        return string + '\n' + v.v0(vehicleHistoryEventDetail.a(), "\n", null, null, 0, null, null, 62, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        State state = params.getState();
        return new h.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(yi3.a.f227250n1), null, null, null, 28, null), null, null, null, null, 61, null), new CustomSingleCardData("timeline", new vj3.b(f(state.getTimelinePayload().getVehicleHistoryTimeline())), null, false, null, null, false, null, 252, null));
    }
}
