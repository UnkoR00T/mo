package qa1;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import ma1.CompanyCategory;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pa1.d;
import pa1.e;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqa1/a;", "Lxw/f;", "Lqa1/a$a;", "Lpa1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lqa1/a$a;)Lpa1/e$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: qa1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqa1/a$a;", "", "Lpa1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Lpa1/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpa1/d;", "b", "()Lpa1/d;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(d dVar, er.a<i0> aVar) {
            this.state = dVar;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        Label labelE;
        ArrayList arrayList;
        d state = params.getState();
        if (t.c(state, d.a.f153800a)) {
            return e.a.C3805a.f153802a;
        }
        if (!(state instanceof d.Initialized)) {
            throw new p();
        }
        d.Initialized initialized = (d.Initialized) state;
        va1.a items = initialized.getItems();
        if (items instanceof va1.a.Address) {
            labelE = this.labelProvider.c(ha1.a.f82529x0);
        } else {
            if (!(items instanceof va1.a.Pkd)) {
                throw new p();
            }
            c cVar = this.labelProvider;
            int i15 = ha1.a.B4;
            String year = ((va1.a.Pkd) initialized.getItems()).getYear();
            if (year == null) {
                year = "-";
            }
            labelE = cVar.e(i15, year);
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), labelE, null, null, null, 28, null), null, null, null, null, 61, null);
        va1.a items2 = initialized.getItems();
        int i16 = 0;
        if (items2 instanceof va1.a.Address) {
            List<String> listA = ((va1.a.Address) items2).a();
            arrayList = new ArrayList(v.y(listA, 10));
            for (Object obj : listA) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(mx.b.b((String) obj, "CompanyCardListItem" + i16), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null));
                i16 = i17;
            }
        } else {
            if (!(items2 instanceof va1.a.Pkd)) {
                throw new p();
            }
            List<CompanyCategory> listA2 = ((va1.a.Pkd) items2).a();
            arrayList = new ArrayList(v.y(listA2, 10));
            for (Object obj2 : listA2) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                CompanyCategory companyCategory = (CompanyCategory) obj2;
                arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(mx.b.b(companyCategory.getCode(), "CompanyCardListItem" + i16), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(companyCategory.getName(), "CompanyCardListItemDescription" + i16), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3839, null));
                i16 = i18;
            }
        }
        return new e.a.Initialized(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
