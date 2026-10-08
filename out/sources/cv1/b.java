package cv1;

import er.l;
import fr.t;
import h30.ButtonData;
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
import n50.x0;
import oq.i0;
import ou1.DrivingLicenceCategory;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceScope;
import ou1.MnemonicHeader;
import p071kotlin.Metadata;
import pq.v;
import r50.f;
import r50.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00020\u001b0\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lou1/f;", "drivingLicence", "", "isTemporary", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lkotlin/Function0;", "Loq/i0;", "moreButtonAction", "", "Lo20/l;", "d", "(Lou1/f;ZLmx/c;Lez/c;Ler/a;)Ljava/util/List;", "Lo20/l$e;", "f", "(Lou1/f;ZLmx/c;Lez/c;Ler/a;)Lo20/l$e;", "Lmx/a;", "info", "title", "Ln50/g;", "g", "(Lmx/a;Lmx/a;)Ln50/g;", "", "e", "(Lou1/f;Lmx/c;Lez/c;)Ljava/util/Collection;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final String b(List<String> list) {
        String strV0 = v.v0(list, null, null, null, 0, null, new l() { // from class: cv1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.c((String) obj);
            }
        }, 31, null);
        if (strV0.length() == 0) {
            return null;
        }
        return strV0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(String str) {
        return str;
    }

    public static final List<o20.l> d(DrivingLicenceData drivingLicenceData, boolean z15, c cVar, ez.c cVar2, er.a<i0> aVar) {
        List<o20.l> listT = v.t(f(drivingLicenceData, z15, cVar, cVar2, aVar));
        listT.addAll(e(drivingLicenceData, cVar, cVar2));
        return listT;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    private static final Collection<o20.l> e(DrivingLicenceData drivingLicenceData, c cVar, ez.c cVar2) {
        DrivingLicenceScope scope;
        DrivingLicenceContainerData data;
        List<DrivingLicenceCategory> listD;
        Label labelC;
        ArrayList arrayList = new ArrayList();
        if (drivingLicenceData != null && (scope = drivingLicenceData.getScope()) != null && (data = scope.getData()) != null && (listD = data.d()) != null) {
            arrayList.add(new o20.l.Section(cVar.c(iu1.a.f97134c), v.n()));
            List<DrivingLicenceCategory> list = listD;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                DrivingLicenceCategory drivingLicenceCategory = (DrivingLicenceCategory) obj;
                Label labelF = Label.f(cVar.c(iu1.a.P), String.valueOf(i15), null, 2, null);
                LocalDate formReleaseDate = drivingLicenceCategory.getFormReleaseDate();
                DefaultSingleCardData defaultSingleCardDataG = g(labelF, mx.b.d(formReleaseDate != null ? cVar2.a(formReleaseDate) : null, "categoryAcquisitionDateValue" + i15));
                Label labelF2 = Label.f(cVar.c(iu1.a.O), String.valueOf(i15), null, 2, null);
                LocalDate expiredDate = drivingLicenceCategory.getExpiredDate();
                if (expiredDate != null) {
                    labelC = mx.b.d(cVar2.a(expiredDate), "categoryExpiryDateValue" + i15);
                    if (labelC == null) {
                        labelC = cVar.c(iu1.a.M);
                    }
                } else {
                    labelC = cVar.c(iu1.a.M);
                }
                DefaultSingleCardData defaultSingleCardDataG2 = g(labelF2, labelC);
                Label labelF3 = Label.f(cVar.c(iu1.a.Q), String.valueOf(i15), null, 2, null);
                List<String> listB = drivingLicenceCategory.b();
                List listT = v.t(defaultSingleCardDataG, defaultSingleCardDataG2, g(labelF3, mx.b.d(listB != null ? b(listB) : null, "categoryRestrictionsValue" + i15)));
                String categoryStatus = drivingLicenceCategory.getCategoryStatus();
                if (categoryStatus != null) {
                    listT.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(Label.f(cVar.c(iu1.a.R), String.valueOf(i15), null, 2, null), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d(categoryStatus, "categoryStatusValue" + i15), null, 0, f.NEGATIVE, 13, null)), null, 4, null), null, null, null, 3839, null));
                }
                arrayList2.add(new o20.l.Expandable(Label.f(cVar.e(iu1.a.N, mx.b.d(drivingLicenceCategory.getCategoryName(), "").getText()), String.valueOf(i15), null, 2, null), new CardListData(listT, null, false, null, null, 30, null)));
                i15 = i16;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    private static final o20.l.Section f(DrivingLicenceData drivingLicenceData, boolean z15, c cVar, ez.c cVar2, er.a<i0> aVar) {
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
        Label labelC2 = cVar.c(iu1.a.L);
        Label labelC3 = cVar.c(iu1.a.G);
        if (drivingLicenceData == null || (scope9 = drivingLicenceData.getScope()) == null || (data8 = scope9.getData()) == null || (expiredDate = data8.getExpiredDate()) == null || (labelC = mx.b.d(cVar2.a(expiredDate), "expiryDateValue")) == null) {
            labelC = cVar.c(iu1.a.M);
        }
        DefaultSingleCardData defaultSingleCardDataG = g(labelC3, labelC);
        String strB = null;
        DefaultSingleCardData defaultSingleCardDataG2 = g(cVar.c(iu1.a.H), mx.b.d((drivingLicenceData == null || (scope8 = drivingLicenceData.getScope()) == null || (data7 = scope8.getData()) == null || (releaseDate = data7.getReleaseDate()) == null) ? null : cVar2.a(releaseDate), "releaseDateValue"));
        BodySection bodySection = new BodySection(n50.l.b(cVar.c(z15 ? iu1.a.f97179y0 : iu1.a.J), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.d((drivingLicenceData == null || (scope7 = drivingLicenceData.getScope()) == null || (data6 = scope7.getData()) == null) ? null : data6.getDocumentState(), "documentStatusValue"), null, 0, false, t.c((drivingLicenceData == null || (scope6 = drivingLicenceData.getScope()) == null || (data5 = scope6.getData()) == null) ? null : Boolean.valueOf(data5.q()), Boolean.TRUE) ? g.POSITIVE : g.NEGATIVE, 13, null)), null, 4, null);
        if (drivingLicenceData == null || (scope5 = drivingLicenceData.getScope()) == null || (data4 = scope5.getData()) == null) {
            button = null;
        } else {
            if (data4.q() || !data4.p()) {
                data4 = null;
            }
            if (data4 != null) {
                button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(iu1.a.f97146i), null, 2, null), d.a.f107773a, null, aVar, 35, null));
            } else {
                button = null;
            }
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null);
        DefaultSingleCardData defaultSingleCardDataG3 = g(cVar.c(iu1.a.F), mx.b.d((drivingLicenceData == null || (scope4 = drivingLicenceData.getScope()) == null || (data3 = scope4.getData()) == null) ? null : data3.getLongDocumentId(), "documentNumberValue"));
        DefaultSingleCardData defaultSingleCardDataG4 = g(cVar.c(z15 ? iu1.a.f97175w0 : iu1.a.E), mx.b.d((drivingLicenceData == null || (scope3 = drivingLicenceData.getScope()) == null || (data2 = scope3.getData()) == null) ? null : data2.getFormNumber(), "blankNumberValue"));
        DefaultSingleCardData defaultSingleCardDataG5 = g(cVar.c(z15 ? iu1.a.f97177x0 : iu1.a.I), mx.b.d((drivingLicenceData == null || (scope2 = drivingLicenceData.getScope()) == null || (dataHeader = scope2.getDataHeader()) == null) ? null : dataHeader.getId(), "issuingAuthorityValue"));
        Label labelC4 = cVar.c(iu1.a.Q);
        if (drivingLicenceData != null && (scope = drivingLicenceData.getScope()) != null && (data = scope.getData()) != null && (listM = data.m()) != null) {
            strB = b(listM);
        }
        return new o20.l.Section(labelC2, v.q(defaultSingleCardDataG, defaultSingleCardDataG2, defaultSingleCardData, defaultSingleCardDataG3, defaultSingleCardDataG4, defaultSingleCardDataG5, g(labelC4, mx.b.d(strB, "drivingLicenceRestrictionsValue"))));
    }

    private static final DefaultSingleCardData g(Label label, Label label2) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(label, null, null, 3, null), new n50.b.Title(n50.l.b(label2, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }
}
