package pa3;

import fr.t;
import fz.FormattedRangeDate;
import ga3.Stage;
import java.util.ArrayList;
import java.util.List;
import ka3.p;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpa3/j;", "Lxw/f;", "Lpa3/j$a;", "Lka3/p$a$d;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lpa3/i;", "singleCardMapper", "Lda3/a;", "addressFormatter", "<init>", "(Lmx/c;Lez/e;Lpa3/i;Lda3/a;)V", "", "index", "Lga3/c;", "stage", "Lmx/a;", "c", "(ILga3/c;)Lmx/a;", "params", "e", "(Lpa3/j$a;)Lka3/p$a$d;", "a", "Lmx/c;", "b", "Lez/e;", "Lpa3/i;", "d", "Lda3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, p.a.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i singleCardMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final da3.a addressFormatter;

    /* JADX INFO: renamed from: pa3.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpa3/j$a;", "", "", "Lga3/c;", "data", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Stage> data;

        public Params(List<Stage> list) {
            this.data = list;
        }

        public final List<Stage> a() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public j(mx.c cVar, ez.e eVar, i iVar, da3.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.singleCardMapper = iVar;
        this.addressFormatter = aVar;
    }

    private final Label c(int index, Stage stage) {
        ez.e eVar = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(stage.getDateRange().getStart());
        fz.c cVar = fz.c.SPACED;
        return this.labelProvider.e(r93.a.f172458a, String.valueOf(index), eVar.d(localDate, cVar), this.dateFormatter.d(new fz.b.LocalDate(stage.getDateRange().getEnd()), cVar));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p.a.Section b(Params params) {
        List<Stage> listA = params.a();
        Label labelC = this.labelProvider.c(r93.a.f172529x1);
        List<Stage> list = listA;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            Stage stage = (Stage) obj;
            arrayList.add(this.singleCardMapper.b(new i.Params(new i.Params.TopInfoLabel(mx.b.b(FormattedRangeDate.b(this.dateFormatter.a(stage.getDateRange()), null, 1, null), "stageDateRange_" + i15), c(i16, stage)), mx.b.b(this.addressFormatter.b(stage.getPlace()), "stageFullAddress_" + i15), null, null, null, 28, null)));
            i15 = i16;
        }
        return new p.a.Section(labelC, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
