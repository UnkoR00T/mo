package tx2;

import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.CommunityOffice;
import al0.ParentOrGuardData;
import iy.b0;
import p071kotlin.Metadata;
import ux2.Section;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020-2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00109¨\u0006:"}, d2 = {"Ltx2/h;", "", "Ltx2/i;", "parentOrGuardDataMapper", "Ltx2/b;", "applicantBasicInfoMapper", "Ltx2/c;", "applicantParentInfoMapper", "Ltx2/d;", "reasonMapper", "Ltx2/j;", "personalSignatureMapper", "Ltx2/e;", "communityOfficeMapper", "Ltx2/g;", "correspondenceAddressDataMapper", "Ltx2/f;", "contactDetailsDataMapper", "<init>", "(Ltx2/i;Ltx2/b;Ltx2/c;Ltx2/d;Ltx2/j;Ltx2/e;Ltx2/g;Ltx2/f;)V", "Lal0/j0;", "data", "Lux2/a;", "f", "(Lal0/j0;)Lux2/a;", "Lal0/f$a;", "Lal0/g;", "ownerWithAge", "a", "(Lal0/f$a;Lal0/g;)Lux2/a;", "Lal0/f$b;", "e", "(Lal0/f$b;Lal0/g;)Lux2/a;", "Lal0/h;", "h", "(Lal0/h;)Lux2/a;", "", "g", "(Z)Lux2/a;", "Lal0/v;", "b", "(Lal0/v;)Lux2/a;", "Lal0/k;", "d", "(Lal0/k;)Lux2/a;", "Lal0/j;", "Liy/b0;", "userEdorAddress", "c", "(Lal0/j;Liy/b0;)Lux2/a;", "Ltx2/i;", "Ltx2/b;", "Ltx2/c;", "Ltx2/d;", "Ltx2/j;", "Ltx2/e;", "Ltx2/g;", "Ltx2/f;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i parentOrGuardDataMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b applicantBasicInfoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c applicantParentInfoMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d reasonMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j personalSignatureMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e communityOfficeMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g correspondenceAddressDataMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f contactDetailsDataMapper;

    public h(i iVar, b bVar, c cVar, d dVar, j jVar, e eVar, g gVar, f fVar) {
        this.parentOrGuardDataMapper = iVar;
        this.applicantBasicInfoMapper = bVar;
        this.applicantParentInfoMapper = cVar;
        this.reasonMapper = dVar;
        this.personalSignatureMapper = jVar;
        this.communityOfficeMapper = eVar;
        this.correspondenceAddressDataMapper = gVar;
        this.contactDetailsDataMapper = fVar;
    }

    public final Section a(ApplicantDataResultData.BasicInfo data, al0.g ownerWithAge) {
        return this.applicantBasicInfoMapper.b(new b.Params(data, ownerWithAge));
    }

    public final Section b(CommunityOffice data) {
        return this.communityOfficeMapper.b(new e.Params(data));
    }

    public final Section c(BEContactDetailsData data, b0 userEdorAddress) {
        return this.contactDetailsDataMapper.b(new f.Params(data, userEdorAddress));
    }

    public final Section d(BECorrespondenceAddressData data) {
        return this.correspondenceAddressDataMapper.b(new g.Params(data));
    }

    public final Section e(ApplicantDataResultData.ParentInfo data, al0.g ownerWithAge) {
        return this.applicantParentInfoMapper.b(new c.Params(data, ownerWithAge));
    }

    public final Section f(ParentOrGuardData data) {
        return this.parentOrGuardDataMapper.b(new i.Params(data));
    }

    public final Section g(boolean data) {
        return this.personalSignatureMapper.b(new j.Params(data));
    }

    public final Section h(ApplicationReason data) {
        return this.reasonMapper.b(new d.Params(data));
    }
}
