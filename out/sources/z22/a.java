package z22;

import c22.d;
import d12.SearchQueryParameter;
import eo0.AdditionalServiceActivationDates;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.b;
import n50.k;
import n50.l;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y22.State;
import y22.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,¨\u0006-"}, d2 = {"Lz22/a;", "Lxw/f;", "Lz22/a$a;", "Ly22/e$a;", "Lmx/c;", "labelProvider", "Lc22/d;", "searchRequestParamsMapper", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lc22/d;Lez/e;)V", "Ly22/c;", "Lmx/a;", "m", "(Ly22/c;)Lmx/a;", "Ln30/b;", "f", "(Ly22/c;)Ln30/b;", "Ly22/c$a;", "", "Ln50/k;", "i", "(Ly22/c$a;)Ljava/util/List;", "Ly22/c$b;", "Ln50/g;", "l", "(Ly22/c$b;)Ljava/util/List;", "Leo0/a;", "", "h", "(Leo0/a;)Ljava/lang/String;", "info", "description", "tag", "e", "(Lmx/a;Ljava/lang/String;Ljava/lang/String;)Ln50/g;", "params", "c", "(Lz22/a$a;)Ly22/e$a;", "a", "Lmx/c;", "b", "Lc22/d;", "Lez/e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d searchRequestParamsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: z22.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz22/a$a;", "", "Ly22/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Ly22/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly22/d;", "b", "()Ly22/d;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
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
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public a(c cVar, d dVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.searchRequestParamsMapper = dVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData e(Label info, String description, String tag) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(info, null, null, 3, null), new b.Title(l.b(mx.b.b(description, tag), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final CardListData f(y22.c cVar) {
        List<k> listL;
        if (cVar instanceof y22.c.Query) {
            listL = i((y22.c.Query) cVar);
        } else {
            if (!(cVar instanceof y22.c.Result)) {
                throw new p();
            }
            listL = l((y22.c.Result) cVar);
        }
        return new CardListData(listL, null, false, null, null, 30, null);
    }

    private final String h(AdditionalServiceActivationDates additionalServiceActivationDates) {
        String str;
        String str2 = null;
        if (additionalServiceActivationDates.getActivationDate() == null && additionalServiceActivationDates.getResignationDate() == null) {
            return null;
        }
        fz.b.LocalDate activationDate = additionalServiceActivationDates.getActivationDate();
        if (activationDate != null) {
            str = this.labelProvider.c(e02.a.D2).getText() + ' ' + this.dateFormatter.d(activationDate, fz.c.DASHED_REVERSED);
        } else {
            str = null;
        }
        fz.b.LocalDate resignationDate = additionalServiceActivationDates.getResignationDate();
        if (resignationDate != null) {
            str2 = this.labelProvider.c(e02.a.A4).getText() + ' ' + this.dateFormatter.d(resignationDate, fz.c.DASHED_REVERSED);
        }
        return v.v0(v.s(str, str2), " ", null, null, 0, null, null, 62, null);
    }

    private final List<k> i(y22.c.Query query) {
        List<SearchQueryParameter> listB = this.searchRequestParamsMapper.b(new d.Params(query.getSearchRequest()));
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            SearchQueryParameter searchQueryParameter = (SearchQueryParameter) obj;
            arrayList.add(e(mx.b.b(searchQueryParameter.getKey(), "searchQueryInfo" + i15), searchQueryParameter.getValue(), "searchQueryCard" + i15));
            i15 = i16;
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> l(y22.c.Result result) {
        String strH;
        fz.b.LocalDate dateOfEnteringToBAE = result.getRecipientInfo().getDateOfEnteringToBAE();
        DefaultSingleCardData defaultSingleCardDataE = null;
        DefaultSingleCardData defaultSingleCardDataE2 = dateOfEnteringToBAE != null ? e(this.labelProvider.c(e02.a.A1), this.dateFormatter.d(dateOfEnteringToBAE, fz.c.DASHED_REVERSED), "dateOfEntering") : null;
        fz.b.LocalDate dateOfRemovalFromBAE = result.getRecipientInfo().getDateOfRemovalFromBAE();
        DefaultSingleCardData defaultSingleCardDataE3 = dateOfRemovalFromBAE != null ? e(this.labelProvider.c(e02.a.C1), this.dateFormatter.d(dateOfRemovalFromBAE, fz.c.DASHED_REVERSED), "dateOfRemoval") : null;
        AdditionalServiceActivationDates additionalServiceActivationDates = result.getRecipientInfo().getAdditionalServiceActivationDates();
        if (additionalServiceActivationDates != null && (strH = h(additionalServiceActivationDates)) != null) {
            defaultSingleCardDataE = e(this.labelProvider.c(e02.a.f46642y1), strH, "dateAdditionalService");
        }
        return v.s(defaultSingleCardDataE2, defaultSingleCardDataE3, defaultSingleCardDataE);
    }

    private final Label m(y22.c cVar) {
        int i15;
        c cVar2 = this.labelProvider;
        if (cVar instanceof y22.c.Query) {
            i15 = e02.a.H1;
        } else {
            if (!(cVar instanceof y22.c.Result)) {
                throw new p();
            }
            i15 = e02.a.f46636x1;
        }
        return cVar2.c(i15);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), m(params.getState().getEntryData()), null, null, null, 28, null), null, null, null, null, 61, null), f(params.getState().getEntryData()));
    }
}
