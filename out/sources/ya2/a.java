package ya2;

import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import oq.i0;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xa2.n;
import xa2.o;
import xw.f;
import y92.VerificationHistoryModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lya2/a;", "Lxw/f;", "Lya2/a$a;", "Lxa2/o$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/c;Lez/e;Lez/c;Lez/a;)V", "", "Ly92/h;", "verificationHistoryList", "Loq/r;", "Lmx/a;", "Ln50/k;", "h", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ly92/h;)Ljava/lang/String;", "Lfz/c;", "formatType", "i", "(Ly92/h;Lfz/c;)Ln50/k;", "Lkotlin/Function0;", "Loq/i0;", "onBackPress", "Lxa2/o$a$a;", "f", "(Ler/a;)Lxa2/o$a$a;", "params", "e", "(Lya2/a$a;)Lxa2/o$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lez/c;", "d", "Lez/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: ya2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lya2/a$a;", "", "Lxa2/n;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "<init>", "(Lxa2/n;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxa2/n;", "b", "()Lxa2/n;", "Ler/a;", "()Ler/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        public Params(n nVar, er.a<i0> aVar) {
            this.state = nVar;
            this.onBackPressed = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackPressed, params.onBackPressed);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackPressed=" + this.onBackPressed + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Long.valueOf(((VerificationHistoryModel) t15).getTimestamp()), Long.valueOf(((VerificationHistoryModel) t16).getTimestamp()));
        }
    }

    public a(c cVar, e eVar, ez.c cVar2, ez.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.currentTimeProvider = aVar;
    }

    private final String c(VerificationHistoryModel verificationHistoryModel) {
        String str;
        if (verificationHistoryModel.getConnectionError()) {
            str = '\n' + this.labelProvider.c(x92.a.D).getText();
        } else if (verificationHistoryModel.getIsAccepted()) {
            str = "";
        } else {
            str = '\n' + this.labelProvider.c(x92.a.C).getText();
        }
        return this.labelProvider.c(x92.a.B).getText() + " (" + verificationHistoryModel.getDescription() + ')' + str;
    }

    private final o.a.Initial f(er.a<i0> onBackPress) {
        return new o.a.Initial(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackPress), this.labelProvider.c(x92.a.E), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106754d2), this.labelProvider.c(x92.a.A), null, null, null, null, false, 76, null));
    }

    private final List<r<Label, List<k>>> h(List<VerificationHistoryModel> verificationHistoryList) {
        ArrayList arrayList;
        Label label;
        boolean zAdd;
        LocalDate localDateC = this.currentTimeProvider.c();
        Label labelB = mx.b.b(this.dateFormatter.d(new fz.b.LocalDateTime(this.currentTimeProvider.i()), fz.c.FULLDAY_DATEDOT), "todayHeader");
        ArrayList arrayList2 = new ArrayList();
        Label labelC = this.labelProvider.c(x92.a.f217632x);
        ArrayList arrayList3 = new ArrayList();
        Label labelC2 = this.labelProvider.c(x92.a.f217631w);
        ArrayList arrayList4 = new ArrayList();
        Label labelC3 = this.labelProvider.c(x92.a.f217633y);
        ArrayList arrayList5 = new ArrayList();
        List<VerificationHistoryModel> listU0 = v.U0(verificationHistoryList, new b());
        ArrayList arrayList6 = new ArrayList(v.y(listU0, 10));
        for (VerificationHistoryModel verificationHistoryModel : listU0) {
            LocalDateTime localDateTimeB = this.dateConverter.b(verificationHistoryModel.getTimestamp());
            if (localDateTimeB.toLocalDate().isEqual(localDateC)) {
                zAdd = arrayList2.add(i(verificationHistoryModel, fz.c.ONLY_HOUR));
                arrayList = arrayList2;
                label = labelC;
            } else {
                arrayList = arrayList2;
                label = labelC;
                zAdd = localDateTimeB.toLocalDate().isAfter(localDateC.minusDays(7L)) ? arrayList3.add(i(verificationHistoryModel, fz.c.DOTTED)) : localDateTimeB.toLocalDate().isAfter(localDateC.minusDays(30L)) ? arrayList4.add(i(verificationHistoryModel, fz.c.DOTTED)) : arrayList5.add(i(verificationHistoryModel, fz.c.DOTTED));
            }
            arrayList6.add(Boolean.valueOf(zAdd));
            arrayList2 = arrayList;
            labelC = label;
        }
        ArrayList arrayList7 = arrayList2;
        Label label2 = labelC;
        ArrayList arrayList8 = new ArrayList();
        if (!arrayList7.isEmpty()) {
            arrayList8.add(y.a(labelB, v.N0(arrayList7)));
        }
        if (!arrayList3.isEmpty()) {
            arrayList8.add(y.a(label2, v.N0(arrayList3)));
        }
        if (!arrayList4.isEmpty()) {
            arrayList8.add(y.a(labelC2, v.N0(arrayList4)));
        }
        if (!arrayList5.isEmpty()) {
            arrayList8.add(y.a(labelC3, v.N0(arrayList5)));
        }
        return arrayList8;
    }

    private final k i(VerificationHistoryModel verificationHistoryModel, fz.c cVar) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.d(new fz.b.LocalDateTime(this.dateConverter.b(verificationHistoryModel.getTimestamp())), cVar), "dateInfo"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c(verificationHistoryModel), "VerificationHistory"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o.a b(Params params) {
        n state = params.getState();
        if (state instanceof n.Initialized) {
            return new o.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(x92.a.E), null, null, null, 28, null), null, null, null, null, 61, null), h(((n.Initialized) state).a()));
        }
        if (state instanceof n.a) {
            return f(params.a());
        }
        throw new p();
    }
}
