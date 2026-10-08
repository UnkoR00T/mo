package jk1;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import al0.BEFileInfo;
import fl0.BEChildInvalidationGenerateXmlData;
import fl0.BEChildInvalidationSubmitXmlData;
import iy.b0;
import java.util.List;
import nk1.SummaryModel;
import oq.p;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;
import ru3.ContactDetailsData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnk1/a;", "Lfl0/a;", "d", "(Lnk1/a;)Lfl0/a;", "Lpy3/b$b;", "Lal0/i;", "a", "(Lpy3/b$b;)Lal0/i;", "Leu3/a;", "Lgl0/a;", "c", "(Leu3/a;)Lgl0/a;", "Lru3/b;", "Lal0/j;", "b", "(Lru3/b;)Lal0/j;", "Lu04/d;", "signedDocument", "", "Lal0/l;", "files", "Lfl0/c;", "e", "(Lnk1/a;Liy/b0;Ljava/util/List;)Lfl0/c;", "dependentidinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: jk1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2461a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103501a;

        static {
            int[] iArr = new int[eu3.a.values().length];
            try {
                iArr[eu3.a.OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eu3.a.EDOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eu3.a.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103501a = iArr;
        }
    }

    public static final BECommunityOffice a(OfficeSelectionData.Office office) {
        return new BECommunityOffice(BECommunityOffice.a.a(office.getId()), office.getName(), office.getEdorAddress(), null);
    }

    public static final BEContactDetailsData b(ContactDetailsData contactDetailsData) {
        return new BEContactDetailsData(contactDetailsData.getPhoneNumber(), contactDetailsData.getEmailAddress());
    }

    public static final gl0.a c(eu3.a aVar) {
        int i15 = C2461a.f103501a[aVar.ordinal()];
        if (i15 == 1) {
            return gl0.a.OFFICE;
        }
        if (i15 == 2) {
            return gl0.a.EDOR;
        }
        if (i15 == 3) {
            return gl0.a.REJECTED;
        }
        throw new p();
    }

    public static final BEChildInvalidationGenerateXmlData d(SummaryModel summaryModel) {
        return new BEChildInvalidationGenerateXmlData(summaryModel.getInvalidationReason(), summaryModel.getParentOrGuardData(), summaryModel.getChildAndParentsData(), summaryModel.getSelectedOffice(), summaryModel.getCertReceiveMethod(), summaryModel.getContactDetails(), summaryModel.getProcessType(), summaryModel.getConfirmationDocument());
    }

    public static final BEChildInvalidationSubmitXmlData e(SummaryModel summaryModel, b0 b0Var, List<BEFileInfo> list) {
        return new BEChildInvalidationSubmitXmlData(ry.a.b(b0Var), summaryModel.getSelectedOffice(), summaryModel.getProcessType(), summaryModel.getInvalidationReason(), summaryModel.getCertReceiveMethod(), summaryModel.getContactDetails(), list, null);
    }
}
