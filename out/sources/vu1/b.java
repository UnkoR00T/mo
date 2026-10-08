package vu1;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.l;
import n50.x0;
import oq.i0;
import ou1.DrivingLicenceCategory;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceScope;
import ou1.MnemonicHeader;
import p071kotlin.Metadata;
import pq.v;
import uu1.State;
import uu1.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lvu1/b;", "Lxw/f;", "Lvu1/b$a;", "Luu1/e$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Lou1/f;", "drivingLicence", "Lkotlin/Function0;", "Loq/i0;", "moreButtonAction", "onDeleteAction", "", "Lw20/b;", "e", "(Lou1/f;Ler/a;Ler/a;)Ljava/util/List;", "Lw20/b$e;", "l", "(Lou1/f;Ler/a;)Lw20/b$e;", "", "i", "(Lou1/f;)Ljava/util/Collection;", "Lmx/a;", "info", "title", "Ln50/g;", "q", "(Lmx/a;Lmx/a;)Ln50/g;", "params", "m", "(Lvu1/b$a;)Luu1/e$a;", "a", "Lmx/c;", "b", "Lez/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: vu1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvu1/b$a;", "", "Luu1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "moreAction", "backAction", "<init>", "(Luu1/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luu1/c;", "c", "()Luu1/c;", "b", "Ler/a;", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> moreAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.moreAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.moreAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.moreAction, params.moreAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.moreAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", moreAction=" + this.moreAction + ", backAction=" + this.backAction + ')';
        }
    }

    public b(c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final List<w20.b> e(DrivingLicenceData drivingLicence, er.a<i0> moreButtonAction, er.a<i0> onDeleteAction) {
        List<w20.b> listT = v.t(l(drivingLicence, moreButtonAction));
        listT.addAll(i(drivingLicence));
        if (onDeleteAction != null) {
            listT.add(new w20.b.DeleteItem(this.labelProvider.c(iu1.a.f97154m), onDeleteAction));
        }
        return listT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List f(b bVar, DrivingLicenceData drivingLicenceData, er.a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = new er.a() { // from class: vu1.a
                @Override // er.a
                public final Object a() {
                    return b.h();
                }
            };
        }
        if ((i15 & 4) != 0) {
            aVar2 = null;
        }
        return bVar.e(drivingLicenceData, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    private final Collection<w20.b> i(DrivingLicenceData drivingLicence) {
        DrivingLicenceScope scope;
        DrivingLicenceContainerData data;
        List<DrivingLicenceCategory> listD;
        Label labelC;
        ArrayList arrayList = new ArrayList();
        if (drivingLicence != null && (scope = drivingLicence.getScope()) != null && (data = scope.getData()) != null && (listD = data.d()) != null) {
            arrayList.add(new w20.b.Section(this.labelProvider.c(iu1.a.f97134c), v.n()));
            List<DrivingLicenceCategory> list = listD;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                DrivingLicenceCategory drivingLicenceCategory = (DrivingLicenceCategory) obj;
                Label labelF = Label.f(this.labelProvider.c(iu1.a.P), String.valueOf(i15), null, 2, null);
                LocalDate formReleaseDate = drivingLicenceCategory.getFormReleaseDate();
                DefaultSingleCardData defaultSingleCardDataQ = q(labelF, mx.b.d(formReleaseDate != null ? this.dateConverter.a(formReleaseDate) : null, "categoryAcquisitionDateValue" + i15));
                Label labelF2 = Label.f(this.labelProvider.c(iu1.a.O), String.valueOf(i15), null, 2, null);
                LocalDate expiredDate = drivingLicenceCategory.getExpiredDate();
                if (expiredDate != null) {
                    labelC = mx.b.d(this.dateConverter.a(expiredDate), "categoryExpiryDateValue" + i15);
                    if (labelC == null) {
                        labelC = this.labelProvider.c(iu1.a.M);
                    }
                } else {
                    labelC = this.labelProvider.c(iu1.a.M);
                }
                DefaultSingleCardData defaultSingleCardDataQ2 = q(labelF2, labelC);
                Label labelF3 = Label.f(this.labelProvider.c(iu1.a.Q), String.valueOf(i15), null, 2, null);
                List<String> listB = drivingLicenceCategory.b();
                List listT = v.t(defaultSingleCardDataQ, defaultSingleCardDataQ2, q(labelF3, mx.b.d(listB != null ? cv1.b.b(listB) : null, "categoryRestrictionsValue" + i15)));
                String categoryStatus = drivingLicenceCategory.getCategoryStatus();
                if (categoryStatus != null) {
                    listT.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(Label.f(this.labelProvider.c(iu1.a.R), String.valueOf(i15), null, 2, null), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d(categoryStatus, "categoryStatusValue" + i15), null, 0, r50.f.NEGATIVE, 13, null)), null, 4, null), null, null, null, 3839, null));
                }
                arrayList2.add(new w20.b.Expandable(Label.f(this.labelProvider.f(iu1.a.N, mx.b.d(drivingLicenceCategory.getCategoryName(), "categoryNameValue" + i15)), String.valueOf(i15), null, 2, null), new CardListData(listT, null, false, null, null, 30, null)));
                i15 = i16;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    private final w20.b.Section l(DrivingLicenceData drivingLicence, er.a<i0> moreButtonAction) {
        Label labelC;
        x0.Button button;
        DrivingLicenceScope scope;
        DrivingLicenceContainerData data;
        List<String> listM;
        DrivingLicenceScope scope2;
        MnemonicHeader dataHeader;
        DrivingLicenceScope scope3;
        DrivingLicenceContainerData data2;
        DrivingLicenceScope scope4;
        DrivingLicenceContainerData data3;
        DrivingLicenceScope scope5;
        DrivingLicenceContainerData data4;
        DrivingLicenceScope scope6;
        DrivingLicenceContainerData data5;
        DrivingLicenceScope scope7;
        DrivingLicenceContainerData data6;
        DrivingLicenceScope scope8;
        DrivingLicenceContainerData data7;
        LocalDate releaseDate;
        DrivingLicenceScope scope9;
        DrivingLicenceContainerData data8;
        LocalDate expiredDate;
        Label labelC2 = this.labelProvider.c(iu1.a.L);
        Label labelC3 = this.labelProvider.c(iu1.a.G);
        if (drivingLicence == null || (scope9 = drivingLicence.getScope()) == null || (data8 = scope9.getData()) == null || (expiredDate = data8.getExpiredDate()) == null || (labelC = mx.b.d(this.dateConverter.a(expiredDate), "expiryDateValue")) == null) {
            labelC = this.labelProvider.c(iu1.a.M);
        }
        DefaultSingleCardData defaultSingleCardDataQ = q(labelC3, labelC);
        String strB = null;
        DefaultSingleCardData defaultSingleCardDataQ2 = q(this.labelProvider.c(iu1.a.H), mx.b.d((drivingLicence == null || (scope8 = drivingLicence.getScope()) == null || (data7 = scope8.getData()) == null || (releaseDate = data7.getReleaseDate()) == null) ? null : this.dateConverter.a(releaseDate), "releaseDateValue"));
        BodySection bodySection = new BodySection(l.b(this.labelProvider.c(iu1.a.f97179y0), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d((drivingLicence == null || (scope7 = drivingLicence.getScope()) == null || (data6 = scope7.getData()) == null) ? null : data6.getDocumentState(), "documentStatusValue"), null, 0, t.c((drivingLicence == null || (scope6 = drivingLicence.getScope()) == null || (data5 = scope6.getData()) == null) ? null : Boolean.valueOf(data5.q()), Boolean.TRUE) ? r50.f.POSITIVE : r50.f.NEGATIVE, 13, null)), null, 4, null);
        if (drivingLicence == null || (scope5 = drivingLicence.getScope()) == null || (data4 = scope5.getData()) == null) {
            button = null;
        } else {
            if (data4.q() || !data4.p()) {
                data4 = null;
            }
            if (data4 != null) {
                button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(iu1.a.f97146i), null, 2, null), d.a.f107773a, null, moreButtonAction, 35, null));
            } else {
                button = null;
            }
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null);
        DefaultSingleCardData defaultSingleCardDataQ3 = q(this.labelProvider.c(iu1.a.F), mx.b.d((drivingLicence == null || (scope4 = drivingLicence.getScope()) == null || (data3 = scope4.getData()) == null) ? null : data3.getLongDocumentId(), "documentNumberValue"));
        DefaultSingleCardData defaultSingleCardDataQ4 = q(this.labelProvider.c(iu1.a.f97175w0), mx.b.d((drivingLicence == null || (scope3 = drivingLicence.getScope()) == null || (data2 = scope3.getData()) == null) ? null : data2.getFormNumber(), "blankNumberValue"));
        DefaultSingleCardData defaultSingleCardDataQ5 = q(this.labelProvider.c(iu1.a.f97177x0), mx.b.d((drivingLicence == null || (scope2 = drivingLicence.getScope()) == null || (dataHeader = scope2.getDataHeader()) == null) ? null : dataHeader.getId(), "issuingAuthorityValue"));
        Label labelC4 = this.labelProvider.c(iu1.a.Q);
        if (drivingLicence != null && (scope = drivingLicence.getScope()) != null && (data = scope.getData()) != null && (listM = data.m()) != null) {
            strB = cv1.b.b(listM);
        }
        return new w20.b.Section(labelC2, v.q(defaultSingleCardDataQ, defaultSingleCardDataQ2, defaultSingleCardData, defaultSingleCardDataQ3, defaultSingleCardDataQ4, defaultSingleCardDataQ5, q(labelC4, mx.b.d(strB, "drivingLicenceRestrictionsValue"))));
    }

    private final DefaultSingleCardData q(Label info, Label title) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(info, null, null, 3, null), new n50.b.Title(l.b(title, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(iu1.a.f97135c0), null, null, null, 28, null), null, null, null, null, 61, null), new w20.f.Data(new BaseScaffoldData(null, null, null, null, null, null, 63, null), null, null, f(this, params.getState().getPickedDocument(), params.b(), null, 4, null), null, null, null, null, 242, null), null, 4, null);
    }
}
