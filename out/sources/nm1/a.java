package nm1;

import al0.BEContactDetailsData;
import al0.BEFileInfo;
import al0.CommunityOffice;
import al0.w0;
import fr.t;
import gl0.GenerateChildXmlData;
import gl0.SubmitChildXmlData;
import iy.b0;
import iy.c0;
import j44.Access;
import java.util.List;
import ju3.ChildData;
import ju3.e;
import oq.p;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;
import ru3.ContactDetailsData;
import wn1.SummaryModel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u001a\u001a\u00020\u0019*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lju3/e;", "Lal0/w0;", "e", "(Lju3/e;)Lal0/w0;", "Lwn1/a;", "Lgl0/b;", "f", "(Lwn1/a;)Lgl0/b;", "Lpy3/b$b;", "Lal0/v;", "c", "(Lpy3/b$b;)Lal0/v;", "Lru3/b;", "Lal0/j;", "b", "(Lru3/b;)Lal0/j;", "Leu3/a;", "Lgl0/a;", "d", "(Leu3/a;)Lgl0/a;", "Lu04/d;", "signedBase64Xml", "", "Lal0/l;", "filesInfo", "Lgl0/d;", "h", "(Lwn1/a;Liy/b0;Ljava/util/List;)Lgl0/d;", "Lgl0/d$a;", "g", "(Lpy3/b$b;)Lgl0/d$a;", "Lj44/f;", "Lal0/a;", "a", "(Lj44/f;)Liy/b0;", "dependentidsuspension_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nm1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3383a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137255a;

        static {
            int[] iArr = new int[eu3.a.values().length];
            try {
                iArr[eu3.a.OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eu3.a.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eu3.a.EDOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137255a = iArr;
        }
    }

    public static final b0 a(Access access) {
        return al0.a.a(c0.g(access.getValue()));
    }

    private static final BEContactDetailsData b(ContactDetailsData contactDetailsData) {
        return new BEContactDetailsData(contactDetailsData.getPhoneNumber(), contactDetailsData.getEmailAddress());
    }

    private static final CommunityOffice c(OfficeSelectionData.Office office) {
        return new CommunityOffice(CommunityOffice.a.a(office.getId()), office.getName(), null);
    }

    private static final gl0.a d(eu3.a aVar) {
        int i15 = C3383a.f137255a[aVar.ordinal()];
        if (i15 == 1) {
            return gl0.a.OFFICE;
        }
        if (i15 == 2) {
            return gl0.a.REJECTED;
        }
        if (i15 == 3) {
            return gl0.a.EDOR;
        }
        throw new p();
    }

    public static final w0 e(e eVar) {
        if (t.c(eVar, e.a.f106016a)) {
            return w0.a.f7557a;
        }
        if (t.c(eVar, e.b.f106017a)) {
            return w0.b.f7558a;
        }
        if (!(eVar instanceof e.Specific)) {
            throw new p();
        }
        ChildData childData = ((e.Specific) eVar).getChildData();
        String childId = childData.getChildId();
        String strE = c0.e(childData.getFirstName());
        b0 pesel = childData.getPesel();
        String strE2 = c0.e(childData.getSurname());
        b0 secondName = childData.getSecondName();
        return new w0.Specific(new al0.ChildData(childId, strE, pesel, strE2, secondName != null ? c0.e(secondName) : null, null));
    }

    public static final GenerateChildXmlData f(SummaryModel summaryModel) {
        return new GenerateChildXmlData(summaryModel.getAction(), summaryModel.getParentOrGuardData(), summaryModel.getChildData(), d(summaryModel.getCertReceiveMethod()), c(summaryModel.getOffice()), summaryModel.getConfirmationDocument(), b(summaryModel.getContactDetails()), summaryModel.getProcessType());
    }

    private static final SubmitChildXmlData.Office g(OfficeSelectionData.Office office) {
        return new SubmitChildXmlData.Office(office.getId(), office.getEdorAddress());
    }

    public static final SubmitChildXmlData h(SummaryModel summaryModel, b0 b0Var, List<BEFileInfo> list) {
        return new SubmitChildXmlData(summaryModel.getAction(), g(summaryModel.getOffice()), ry.a.b(b0Var), b(summaryModel.getContactDetails()), d(summaryModel.getCertReceiveMethod()), list, summaryModel.getProcessType(), null);
    }
}
