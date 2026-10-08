package kb0;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import lb0.m;
import lb0.n;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import o20.BaseDocumentData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xf0.CategoryContainer;
import xf0.DrivingLicenceDataContainer;
import xf0.DrivingLicenceDocument;
import xf0.DrivingLicenceScope;
import xf0.MnemonicHeaderContainerDL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0014\u001a\u00020\u0013*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b \u0010!J)\u0010#\u001a\u00020\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lkb0/b;", "Lxw/f;", "Lkb0/b$a;", "Llb0/n$a$b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/e;Lez/c;)V", "Llb0/m$d$b;", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lxf0/c;", "onDetailsAction", "Llb0/n$a$b$b;", "l", "(Llb0/m$d$b;Ler/a;Ler/l;)Llb0/n$a$b$b;", "Llb0/m$d$a;", "onMoreAction", "Llb0/n$a$b$a;", "h", "(Llb0/m$d$a;Ler/a;Ler/a;)Llb0/n$a$b$a;", "Lxf0/e;", "drivingLicence", "moreButtonAction", "", "Lo20/l;", "e", "(Lxf0/e;Ler/a;)Ljava/util/List;", "Lo20/l$e;", "i", "(Lxf0/e;Ler/a;)Lo20/l$e;", "", "f", "(Lxf0/e;)Ljava/util/Collection;", "params", "q", "(Lkb0/b$a;)Llb0/n$a$b;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lez/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, n.a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: kb0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lkb0/b$a;", "", "Llb0/m$d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lxf0/c;", "onDetailsAction", "onMoreAction", "<init>", "(Llb0/m$d;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llb0/m$d;", "d", "()Llb0/m$d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DrivingLicenceDocument, i0> onDetailsAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m.d dVar, er.a<i0> aVar, l<? super DrivingLicenceDocument, i0> lVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.onDetailsAction = lVar;
            this.onMoreAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<DrivingLicenceDocument, i0> b() {
            return this.onDetailsAction;
        }

        public final er.a<i0> c() {
            return this.onMoreAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onDetailsAction, params.onDetailsAction) && t.c(this.onMoreAction, params.onMoreAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onDetailsAction.hashCode()) * 31) + this.onMoreAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onDetailsAction=" + this.onDetailsAction + ", onMoreAction=" + this.onMoreAction + ')';
        }
    }

    /* JADX INFO: renamed from: kb0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C2622b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f109738a;

        public C2622b(Comparator comparator) {
            this.f109738a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            DrivingLicenceDataContainer drivingLicenceDataContainer;
            DrivingLicenceDataContainer drivingLicenceDataContainer2;
            Comparator comparator = this.f109738a;
            DrivingLicenceScope scopeData = ((DrivingLicenceDocument) t15).getScopeData();
            LocalDate releaseDate = null;
            LocalDate releaseDate2 = (scopeData == null || (drivingLicenceDataContainer2 = scopeData.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer2.getReleaseDate();
            DrivingLicenceScope scopeData2 = ((DrivingLicenceDocument) t16).getScopeData();
            if (scopeData2 != null && (drivingLicenceDataContainer = scopeData2.getDrivingLicenceDataContainer()) != null) {
                releaseDate = drivingLicenceDataContainer.getReleaseDate();
            }
            return comparator.compare(releaseDate2, releaseDate);
        }
    }

    public b(mx.c cVar, ez.e eVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
    }

    private final List<o20.l> e(DrivingLicenceScope drivingLicence, er.a<i0> moreButtonAction) {
        List<o20.l> listT = v.t(i(drivingLicence, moreButtonAction));
        listT.addAll(f(drivingLicence));
        return listT;
    }

    private final Collection<o20.l> f(DrivingLicenceScope drivingLicence) {
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<CategoryContainer> listC;
        mx.c cVar = this.labelProvider;
        ArrayList arrayList = new ArrayList();
        if (drivingLicence != null && (drivingLicenceDataContainer = drivingLicence.getDrivingLicenceDataContainer()) != null && (listC = drivingLicenceDataContainer.c()) != null) {
            arrayList.add(new o20.l.Section(cVar.c(fb0.a.f60707d), v.n()));
            List<CategoryContainer> list = listC;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                CategoryContainer categoryContainer = (CategoryContainer) obj;
                DefaultSingleCardData defaultSingleCardDataE = h.e(Label.f(cVar.c(fb0.a.N), String.valueOf(i15), null, 2, null), mx.b.d(this.dateConverter.a(categoryContainer.getFormReleaseDate()), "categoryAcquisitionDateValue" + i15), null, 4, null);
                DefaultSingleCardData defaultSingleCardDataE2 = h.e(Label.f(cVar.c(fb0.a.M), String.valueOf(i15), null, 2, null), mx.b.d(this.dateConverter.a(categoryContainer.getExpiredDate()), "categoryExpiryDateValue" + i15), null, 4, null);
                Label labelF = Label.f(cVar.c(fb0.a.O), String.valueOf(i15), null, 2, null);
                List<String> listB = categoryContainer.b();
                List listT = v.t(defaultSingleCardDataE, defaultSingleCardDataE2, h.e(labelF, mx.b.d(listB != null ? h.b(listB) : null, "categoryRestrictionsValue" + i15), null, 4, null));
                String categoryStatus = categoryContainer.getCategoryStatus();
                if (categoryStatus != null) {
                    listT.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(Label.f(cVar.c(fb0.a.P), String.valueOf(i15), null, 2, null), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d(categoryStatus, "categoryStatusValue" + i15), null, 0, r50.f.NEGATIVE, 13, null)), null, 4, null), null, null, null, 3839, null));
                }
                arrayList2.add(new o20.l.Expandable(Label.f(cVar.f(fb0.a.L, mx.b.d(categoryContainer.getCategoryName(), "categoryNameValue" + i15)), String.valueOf(i15), null, 2, null), new CardListData(listT, null, false, null, null, 30, null)));
                i15 = i16;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private final n.a.b.Details h(m.d.Details details, er.a<i0> aVar, er.a<i0> aVar2) {
        details.getDrivingLicence();
        return new n.a.b.Details(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), this.labelProvider.c(fb0.a.R), null, null, null, 28, null), null, null, null, null, 61, null), new BaseDocumentData(null, new BaseScaffoldData(null, null, null, null, null, null, 63, null), null, null, e(details.getDrivingLicence().getScopeData(), aVar2), null, null, 101, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    private final o20.l.Section i(DrivingLicenceScope drivingLicence, er.a<i0> moreButtonAction) {
        Label labelC;
        x0.Button button;
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<String> listK;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
        DrivingLicenceDataContainer drivingLicenceDataContainer2;
        DrivingLicenceDataContainer drivingLicenceDataContainer3;
        DrivingLicenceDataContainer drivingLicenceDataContainer4;
        DrivingLicenceDataContainer drivingLicenceDataContainer5;
        DrivingLicenceDataContainer drivingLicenceDataContainer6;
        DrivingLicenceDataContainer drivingLicenceDataContainer7;
        LocalDate releaseDate;
        DrivingLicenceDataContainer drivingLicenceDataContainer8;
        LocalDate expiredDate;
        mx.c cVar = this.labelProvider;
        Label labelC2 = cVar.c(fb0.a.J);
        Label labelC3 = cVar.c(fb0.a.G);
        if (drivingLicence == null || (drivingLicenceDataContainer8 = drivingLicence.getDrivingLicenceDataContainer()) == null || (expiredDate = drivingLicenceDataContainer8.getExpiredDate()) == null || (labelC = mx.b.d(this.dateConverter.a(expiredDate), "expiryDateValue")) == null) {
            labelC = cVar.c(fb0.a.K);
        }
        DefaultSingleCardData defaultSingleCardDataE = h.e(labelC3, labelC, null, 4, null);
        DefaultSingleCardData defaultSingleCardDataE2 = h.e(cVar.c(fb0.a.H), mx.b.d((drivingLicence == null || (drivingLicenceDataContainer7 = drivingLicence.getDrivingLicenceDataContainer()) == null || (releaseDate = drivingLicenceDataContainer7.getReleaseDate()) == null) ? null : this.dateConverter.a(releaseDate), "releaseDateValue"), null, 4, null);
        BodySection bodySection = new BodySection(n50.l.b(cVar.c(fb0.a.W), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d((drivingLicence == null || (drivingLicenceDataContainer6 = drivingLicence.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer6.getDocumentState(), "documentStatusValue"), null, 0, t.c((drivingLicence == null || (drivingLicenceDataContainer5 = drivingLicence.getDrivingLicenceDataContainer()) == null) ? null : Boolean.valueOf(drivingLicenceDataContainer5.n()), Boolean.TRUE) ? r50.f.POSITIVE : r50.f.NEGATIVE, 13, null)), null, 4, null);
        if (drivingLicence == null || (drivingLicenceDataContainer4 = drivingLicence.getDrivingLicenceDataContainer()) == null) {
            button = null;
        } else {
            if (drivingLicenceDataContainer4.n() || !drivingLicenceDataContainer4.m()) {
                drivingLicenceDataContainer4 = null;
            }
            if (drivingLicenceDataContainer4 != null) {
                button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(fb0.a.f60723l), null, 2, null), k30.d.a.f107773a, null, moreButtonAction, 35, null));
            } else {
                button = null;
            }
        }
        return new o20.l.Section(labelC2, v.q(defaultSingleCardDataE, defaultSingleCardDataE2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null), h.e(cVar.c(fb0.a.F), mx.b.d((drivingLicence == null || (drivingLicenceDataContainer3 = drivingLicence.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer3.getLongDocumentId(), "documentNumberValue"), null, 4, null), h.e(cVar.c(fb0.a.U), mx.b.d((drivingLicence == null || (drivingLicenceDataContainer2 = drivingLicence.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer2.getFormNumber(), "blankNumberValue"), null, 4, null), h.e(cVar.c(fb0.a.V), mx.b.d((drivingLicence == null || (mnemonicHeaderContainerDL = drivingLicence.getMnemonicHeaderContainerDL()) == null) ? null : mnemonicHeaderContainerDL.getId(), "issuingAuthorityValue"), null, 4, null), h.e(cVar.c(fb0.a.O), mx.b.d((drivingLicence == null || (drivingLicenceDataContainer = drivingLicence.getDrivingLicenceDataContainer()) == null || (listK = drivingLicenceDataContainer.k()) == null) ? null : h.b(listK), "drivingLicenceRestrictionsValue"), null, 4, null)));
    }

    private final n.a.b.List l(m.d.List list, er.a<i0> aVar, final l<? super DrivingLicenceDocument, i0> lVar) {
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        LocalDate releaseDate;
        m.StateData stateData = list.getStateData();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), this.labelProvider.c(fb0.a.R), null, null, null, 28, null), null, null, null, null, 61, null);
        List<DrivingLicenceDocument> listU0 = v.U0(stateData.a(), new C2622b(sq.a.h(sq.a.g())));
        ArrayList arrayList = new ArrayList(v.y(listU0, 10));
        for (final DrivingLicenceDocument drivingLicenceDocument : listU0) {
            DrivingLicenceScope scopeData = drivingLicenceDocument.getScopeData();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: kb0.a
                @Override // er.a
                public final Object a() {
                    return b.m(lVar, drivingLicenceDocument);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.f(fb0.a.Q, mx.b.d((scopeData == null || (drivingLicenceDataContainer = scopeData.getDrivingLicenceDataContainer()) == null || (releaseDate = drivingLicenceDataContainer.getReleaseDate()) == null) ? null : this.dateFormatter.d(new fz.b.LocalDate(releaseDate), fz.c.DOTTED), "driving_licence_release_date")), null, null, 3, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new n.a.b.List(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, DrivingLicenceDocument drivingLicenceDocument) {
        lVar.b(drivingLicenceDocument);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public n.a.b b(Params params) {
        m.d state = params.getState();
        if (state instanceof m.d.List) {
            return l((m.d.List) state, params.a(), params.b());
        }
        if (state instanceof m.d.Details) {
            return h((m.d.Details) state, params.a(), params.c());
        }
        throw new p();
    }
}
