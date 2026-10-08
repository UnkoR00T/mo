package yk1;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import al0.ParentOrGuardData;
import al1.q1;
import fr.t;
import il0.BeChildAndParentsData;
import iy.b0;
import nk1.SummaryModel;
import ok1.WelcomeResult;
import oq.p;
import p071kotlin.Metadata;
import pu3.ConfirmationDocumentResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lyk1/b;", "Lh00/a;", "Lal1/q1;", "Lh00/b;", "Lnk1/a;", "Lpl/gov/coi/mobywatel/feature/dependentidinvalidation/presentation/main/DataSource;", "<init>", "()V", "Lju3/e;", "selectedChild", "Lil0/a;", "g", "(Lju3/e;)Lil0/a;", "i", "()Lnk1/a;", "Lgl0/c;", "h", "(Lju3/e;)Lgl0/c;", "processType", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends h00.a<q1, h00.b, SummaryModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f227528c = h00.a.f79185b;

    private final BeChildAndParentsData g(ju3.e selectedChild) {
        if (t.c(selectedChild, ju3.e.a.f106016a) || t.c(selectedChild, ju3.e.b.f106017a) || selectedChild == null) {
            return new BeChildAndParentsData((BeChildAndParentsData.ChildData) f(q1.c.f7670c), (BeChildAndParentsData.ParentsData) f(q1.n.f7681c));
        }
        if (selectedChild instanceof ju3.e.Specific) {
            return (BeChildAndParentsData) f(q1.b.f7669c);
        }
        throw new p();
    }

    private final gl0.c h(ju3.e eVar) {
        if (t.c(eVar, ju3.e.a.f106016a) || t.c(eVar, ju3.e.b.f106017a)) {
            return gl0.c.a.WithoutParentization;
        }
        if (eVar instanceof ju3.e.Specific) {
            return gl0.c.a.Parentization;
        }
        if (eVar == null) {
            return gl0.c.b.f73564a;
        }
        throw new p();
    }

    @Override // h00.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public SummaryModel e() {
        ConfirmationDocumentResult confirmationDocumentResult;
        WelcomeResult welcomeResult = (WelcomeResult) f(q1.s.f7686c);
        ju3.e eVar = (ju3.e) b(q1.d.f7671c);
        gl0.c cVarH = h(eVar);
        ParentOrGuardData parentOrGuardData = welcomeResult.getParentOrGuardData();
        BeChildAndParentsData beChildAndParentsDataG = g(eVar);
        fl0.b bVar = (fl0.b) f(q1.l.f7679c);
        BECommunityOffice bECommunityOffice = (BECommunityOffice) f(q1.m.f7680c);
        gl0.a aVar = (gl0.a) f(q1.a.f7668c);
        BEContactDetailsData bEContactDetailsData = (BEContactDetailsData) f(q1.f.f7673c);
        b0 userEdorAddress = welcomeResult.getUserEdorAddress();
        wx.i document = null;
        if (((cVarH == gl0.c.a.WithoutParentization || t.c(cVarH, gl0.c.b.f73564a)) ? cVarH : null) != null && (confirmationDocumentResult = (ConfirmationDocumentResult) b(q1.e.f7672c)) != null) {
            document = confirmationDocumentResult.getDocument();
        }
        return new SummaryModel(cVarH, parentOrGuardData, beChildAndParentsDataG, bVar, bECommunityOffice, aVar, bEContactDetailsData, userEdorAddress, document);
    }
}
