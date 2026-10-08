package qa2;

import ez.e;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mx.Label;
import mx.b;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pa2.m;
import pa2.n;
import pq.v;
import q40.IconPageData;
import q40.j;
import ra2.DataTransferModel;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y92.InstitutionHistoryModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%'B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u00120\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u00100\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0014\u00102\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-¨\u00063"}, d2 = {"Lqa2/a;", "Lxw/f;", "Lqa2/a$a;", "Lpa2/n$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/c;Lez/e;Lez/a;)V", "", "Ly92/c;", "params", "Lra2/a;", "f", "(Ljava/util/List;Lqa2/a$a;)Lra2/a;", "Loq/r;", "Lmx/a;", "Ln50/k;", "l", "(Ljava/util/List;)Ljava/util/List;", "i", "", "serviceName", "institutionName", "c", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "Lkotlin/Function0;", "Loq/i0;", "onBackPress", "Lpa2/n$a$a;", "h", "(Ler/a;)Lpa2/n$a$a;", "e", "(Lqa2/a$a;)Lpa2/n$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lmx/a;", "title", "", "d", "J", "nowTime", "today", "lastWeek", "g", "lastMonth", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long nowTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long today;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long lastWeek;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long lastMonth;

    /* JADX INFO: renamed from: qa2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqa2/a$a;", "", "Lpa2/m;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackPress", "<init>", "(Lpa2/m;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpa2/m;", "b", "()Lpa2/m;", "Ler/a;", "()Ler/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPress;

        public Params(m mVar, er.a<i0> aVar) {
            this.state = mVar;
            this.onBackPress = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackPress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackPress, params.onBackPress);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackPress.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackPress=" + this.onBackPress + ')';
        }
    }

    /* JADX INFO: renamed from: qa2.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqa2/a$b;", "", "", "dayAndDate", "hourAndMin", "Lmx/a;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lmx/a;", "()Lmx/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class ThisWeekTmp {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dayAndDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hourAndMin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        public ThisWeekTmp(String str, String str2, Label label) {
            this.dayAndDate = str;
            this.hourAndMin = str2;
            this.message = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDayAndDate() {
            return this.dayAndDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHourAndMin() {
            return this.hourAndMin;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThisWeekTmp)) {
                return false;
            }
            ThisWeekTmp thisWeekTmp = (ThisWeekTmp) other;
            return t.c(this.dayAndDate, thisWeekTmp.dayAndDate) && t.c(this.hourAndMin, thisWeekTmp.hourAndMin) && t.c(this.message, thisWeekTmp.message);
        }

        public int hashCode() {
            return (((this.dayAndDate.hashCode() * 31) + this.hourAndMin.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "ThisWeekTmp(dayAndDate=" + this.dayAndDate + ", hourAndMin=" + this.hourAndMin + ", message=" + this.message + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Long.valueOf(((InstitutionHistoryModel) t16).getTimestamp()), Long.valueOf(((InstitutionHistoryModel) t15).getTimestamp()));
        }
    }

    public a(mx.c cVar, e eVar, ez.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.title = cVar.c(x92.a.f217612d);
        long jA = aVar.a();
        this.nowTime = jA;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.today = jA - timeUnit.toMillis(1L);
        this.lastWeek = jA - timeUnit.toMillis(7L);
        this.lastMonth = jA - timeUnit.toMillis(30L);
    }

    private final Label c(String serviceName, String institutionName) {
        String str;
        if (r.t0(serviceName)) {
            str = " ";
        } else {
            str = " (" + serviceName + ") ";
        }
        Label labelC = this.labelProvider.c(x92.a.f217611c);
        Label labelC2 = this.labelProvider.c(x92.a.f217613e);
        return new Label(labelC.getText() + str + labelC2.getText() + ' ' + institutionName, labelC.getTag() + labelC2.getTag());
    }

    private final DataTransferModel f(List<InstitutionHistoryModel> list, Params params) {
        DataTransferModel dataTransferModel = new DataTransferModel(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.title, null, null, null, 28, null), null, null, null, null, 61, null), v.n(), this.labelProvider.c(x92.a.f217632x), v.n(), this.labelProvider.c(x92.a.f217631w), v.n(), this.labelProvider.c(x92.a.f217633y), v.n());
        List listU0 = v.U0(list, new c());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listU0) {
            if (((InstitutionHistoryModel) obj).getTimestamp() > this.today) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        oq.r rVar = new oq.r(arrayList, arrayList2);
        dataTransferModel.l(l((List) rVar.c()));
        Iterable iterable = (Iterable) rVar.d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : iterable) {
            if (((InstitutionHistoryModel) obj2).getTimestamp() > this.lastWeek) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        oq.r rVar2 = new oq.r(arrayList3, arrayList4);
        dataTransferModel.j(i((List) rVar2.c()));
        Iterable iterable2 = (Iterable) rVar2.d();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : iterable2) {
            if (((InstitutionHistoryModel) obj3).getTimestamp() > this.lastMonth) {
                arrayList5.add(obj3);
            } else {
                arrayList6.add(obj3);
            }
        }
        oq.r rVar3 = new oq.r(arrayList5, arrayList6);
        dataTransferModel.i(i((List) rVar3.c()));
        dataTransferModel.k(i((List) rVar3.d()));
        return dataTransferModel;
    }

    private final n.a.Initial h(er.a<i0> onBackPress) {
        return new n.a.Initial(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackPress), this.title, null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106754d2), this.labelProvider.c(x92.a.f217610b), null, null, null, null, false, 76, null));
    }

    private final List<k> i(List<InstitutionHistoryModel> list) {
        List<InstitutionHistoryModel> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (InstitutionHistoryModel institutionHistoryModel : list2) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(b.b(this.dateFormatter.d(new fz.b.Long(institutionHistoryModel.getTimestamp()), fz.c.DOTTED), "formattedDate"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(institutionHistoryModel.getServiceName(), institutionHistoryModel.getInstitutionName()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        return arrayList;
    }

    private final List<oq.r<Label, List<k>>> l(List<InstitutionHistoryModel> list) {
        ArrayList arrayList = new ArrayList();
        List<InstitutionHistoryModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        for (InstitutionHistoryModel institutionHistoryModel : list2) {
            String strD = this.dateFormatter.d(new fz.b.Long(institutionHistoryModel.getTimestamp()), fz.c.FULLDAY_DATEDOT);
            if (strD.length() > 0) {
                strD = Character.toUpperCase(strD.charAt(0)) + strD.substring(1);
            }
            arrayList2.add(new ThisWeekTmp(strD, this.dateFormatter.d(new fz.b.Long(institutionHistoryModel.getTimestamp()), fz.c.ONLY_HOUR), c(institutionHistoryModel.getServiceName(), institutionHistoryModel.getInstitutionName())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList2) {
            String dayAndDate = ((ThisWeekTmp) obj).getDayAndDate();
            Object arrayList3 = linkedHashMap.get(dayAndDate);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(dayAndDate, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list3 = (List) entry.getValue();
            Label labelB = b.b(str, "dayAndDate");
            List<ThisWeekTmp> list4 = list3;
            ArrayList arrayList4 = new ArrayList(v.y(list4, 10));
            for (ThisWeekTmp thisWeekTmp : list4) {
                arrayList4.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(b.b(thisWeekTmp.getHourAndMin(), "hourAndMin"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(thisWeekTmp.getMessage(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
            }
            arrayList.add(new oq.r(labelB, arrayList4));
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n.a b(Params params) {
        m state = params.getState();
        if (state instanceof m.Initialized) {
            return new n.a.Initialized(f(((m.Initialized) state).a(), params));
        }
        if (state instanceof m.a) {
            return h(params.a());
        }
        throw new p();
    }
}
