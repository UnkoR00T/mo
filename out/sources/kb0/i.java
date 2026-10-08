package kb0;

import fr.t;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb0.m;
import mx.Label;
import p071kotlin.Metadata;
import pe0.AdditionalSectionData;
import pe0.DocumentPhotoData;
import pe0.ItemData;
import pe0.VerificationDocumentData;
import pq.v;
import xf0.CategoryContainer;
import xf0.DrivingLicenceDataContainer;
import xf0.DrivingLicenceScope;
import xf0.MnemonicHeaderContainerDL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkb0/i;", "Lxw/f;", "Lkb0/i$a;", "Lpe0/d;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "params", "c", "(Lkb0/i$a;)Lpe0/d;", "a", "Lmx/c;", "b", "Lez/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, VerificationDocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: kb0.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkb0/i$a;", "", "Llb0/m$g$a;", "state", "<init>", "(Llb0/m$g$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llb0/m$g$a;", "()Llb0/m$g$a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m.g.Displaying state;

        public Params(m.g.Displaying displaying) {
            this.state = displaying;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m.g.Displaying getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.state, ((Params) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ')';
        }
    }

    public i(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDocumentData b(Params params) {
        Label label;
        ArrayList arrayList;
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<CategoryContainer> listC;
        DrivingLicenceDataContainer drivingLicenceDataContainer2;
        List<String> listK;
        DrivingLicenceDataContainer drivingLicenceDataContainer3;
        DrivingLicenceDataContainer drivingLicenceDataContainer4;
        DrivingLicenceDataContainer drivingLicenceDataContainer5;
        DrivingLicenceDataContainer drivingLicenceDataContainer6;
        LocalDate expiredDate;
        DrivingLicenceDataContainer drivingLicenceDataContainer7;
        LocalDate releaseDate;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
        DrivingLicenceDataContainer drivingLicenceDataContainer8;
        DrivingLicenceDataContainer drivingLicenceDataContainer9;
        LocalDate birthday;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL2;
        b0 pe4;
        DrivingLicenceDataContainer drivingLicenceDataContainer10;
        DrivingLicenceDataContainer drivingLicenceDataContainer11;
        i iVar = this;
        String documentId = params.getState().getStateData().getDrivingLicenceData().getDocumentId();
        pe0.e eVar = pe0.e.DRIVING_LICENCE;
        Label labelC = iVar.labelProvider.c(fb0.a.Y);
        int i15 = jz.a.M2;
        String scopeName = params.getState().getStateData().getDrivingLicenceData().getScopeName();
        DocumentPhotoData documentPhotoData = new DocumentPhotoData(params.getState().getStateData().getPhoto().getPhoto(), params.getState().getStateData().getPhoto().getDocumentId(), params.getState().getStateData().getPhoto().getScopeName());
        Label labelC2 = iVar.labelProvider.c(fb0.a.f60737t);
        DrivingLicenceScope scopeData = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData = new ItemData(labelC2, mx.b.d((scopeData == null || (drivingLicenceDataContainer11 = scopeData.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer11.g(), "firstNamesValue"));
        Label labelC3 = iVar.labelProvider.c(fb0.a.f60740w);
        DrivingLicenceScope scopeData2 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData2 = new ItemData(labelC3, mx.b.d((scopeData2 == null || (drivingLicenceDataContainer10 = scopeData2.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer10.getSurname(), "surnameValue"));
        Label labelC4 = iVar.labelProvider.c(fb0.a.f60739v);
        DrivingLicenceScope scopeData3 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData3 = new ItemData(labelC4, mx.b.d((scopeData3 == null || (mnemonicHeaderContainerDL2 = scopeData3.getMnemonicHeaderContainerDL()) == null || (pe4 = mnemonicHeaderContainerDL2.getPe()) == null) ? null : c0.e(pe4), "peselValue"));
        Label labelC5 = iVar.labelProvider.c(fb0.a.f60731p);
        DrivingLicenceScope scopeData4 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData4 = new ItemData(labelC5, mx.b.d((scopeData4 == null || (drivingLicenceDataContainer9 = scopeData4.getDrivingLicenceDataContainer()) == null || (birthday = drivingLicenceDataContainer9.getBirthday()) == null) ? null : iVar.dateConverter.a(birthday), "birthDateValue"));
        Label labelC6 = iVar.labelProvider.c(fb0.a.f60701a);
        DrivingLicenceScope scopeData5 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData5 = new ItemData(labelC6, mx.b.d((scopeData5 == null || (drivingLicenceDataContainer8 = scopeData5.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer8.getBirthplace(), "birthPlaceValue"));
        Label labelC7 = iVar.labelProvider.c(fb0.a.f60728n0);
        DrivingLicenceScope scopeData6 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData6 = new ItemData(labelC7, mx.b.d((scopeData6 == null || (mnemonicHeaderContainerDL = scopeData6.getMnemonicHeaderContainerDL()) == null) ? null : mnemonicHeaderContainerDL.getId(), "issuingAuthorityValue"));
        Label labelC8 = iVar.labelProvider.c(fb0.a.f60709e);
        DrivingLicenceScope scopeData7 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData7 = new ItemData(labelC8, mx.b.d((scopeData7 == null || (drivingLicenceDataContainer7 = scopeData7.getDrivingLicenceDataContainer()) == null || (releaseDate = drivingLicenceDataContainer7.getReleaseDate()) == null) ? null : iVar.dateConverter.a(releaseDate), "releaseDateValue"));
        Label labelC9 = iVar.labelProvider.c(fb0.a.f60734q0);
        DrivingLicenceScope scopeData8 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData8 = new ItemData(labelC9, mx.b.d((scopeData8 == null || (drivingLicenceDataContainer6 = scopeData8.getDrivingLicenceDataContainer()) == null || (expiredDate = drivingLicenceDataContainer6.getExpiredDate()) == null) ? null : iVar.dateConverter.a(expiredDate), "expireDateValue"));
        Label labelC10 = iVar.labelProvider.c(fb0.a.f60724l0);
        DrivingLicenceScope scopeData9 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData9 = new ItemData(labelC10, mx.b.d((scopeData9 == null || (drivingLicenceDataContainer5 = scopeData9.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer5.getLongDocumentId(), "documentNumberValue"));
        Label labelC11 = iVar.labelProvider.c(fb0.a.f60730o0);
        DrivingLicenceScope scopeData10 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData10 = new ItemData(labelC11, mx.b.d((scopeData10 == null || (drivingLicenceDataContainer4 = scopeData10.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer4.getFormNumber(), "blankNumberValue"));
        Label labelC12 = iVar.labelProvider.c(fb0.a.f60732p0);
        DrivingLicenceScope scopeData11 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        ItemData itemData11 = new ItemData(labelC12, mx.b.d((scopeData11 == null || (drivingLicenceDataContainer3 = scopeData11.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer3.getDocumentState(), "documentStateValue"));
        Label labelC13 = iVar.labelProvider.c(fb0.a.f60726m0);
        DrivingLicenceScope scopeData12 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        List listQ = v.q(itemData, itemData2, itemData3, itemData4, itemData5, itemData6, itemData7, itemData8, itemData9, itemData10, itemData11, new ItemData(labelC13, mx.b.d((scopeData12 == null || (drivingLicenceDataContainer2 = scopeData12.getDrivingLicenceDataContainer()) == null || (listK = drivingLicenceDataContainer2.k()) == null) ? null : h.b(listK), "restrictionsValue")));
        DrivingLicenceScope scopeData13 = params.getState().getStateData().getDrivingLicenceData().getScopeData();
        if (scopeData13 == null || (drivingLicenceDataContainer = scopeData13.getDrivingLicenceDataContainer()) == null || (listC = drivingLicenceDataContainer.c()) == null) {
            label = labelC;
            arrayList = null;
        } else {
            List<CategoryContainer> list = listC;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                CategoryContainer categoryContainer = (CategoryContainer) next;
                Label labelN = iVar.labelProvider.e(fb0.a.L, mx.b.d(categoryContainer.getCategoryName(), "").getText()).n("categoryName" + i16);
                Iterator it4 = it;
                ItemData itemData12 = new ItemData(Label.f(iVar.labelProvider.c(fb0.a.N), String.valueOf(i16), null, 2, null), mx.b.d(iVar.dateConverter.a(categoryContainer.getFormReleaseDate()), "categoryAcquisitionDateValue" + i16));
                Label label2 = labelC;
                ItemData itemData13 = new ItemData(Label.f(iVar.labelProvider.c(fb0.a.M), String.valueOf(i16), null, 2, null), mx.b.d(iVar.dateConverter.a(categoryContainer.getExpiredDate()), "categoryExpiryDateValue" + i16));
                Label labelF = Label.f(iVar.labelProvider.c(fb0.a.O), String.valueOf(i16), null, 2, null);
                List<String> listB = categoryContainer.b();
                arrayList2.add(new AdditionalSectionData(labelN, v.q(itemData12, itemData13, new ItemData(labelF, mx.b.d(listB != null ? h.b(listB) : null, "categoryRestrictionsValue" + i16)))));
                iVar = this;
                it = it4;
                i16 = i17;
                labelC = label2;
            }
            label = labelC;
            arrayList = arrayList2;
        }
        return new VerificationDocumentData(documentId, eVar, label, i15, scopeName, documentPhotoData, listQ, null, arrayList, 128, null);
    }
}
