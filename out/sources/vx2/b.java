package vx2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.Child;
import al0.ParentOrGuardData;
import al0.g;
import al0.w0;
import cy2.AddPhotoResult;
import cy2.AdditionalAttachmentsResult;
import cy2.ApplicantDataResult;
import cy2.CheckParentOrGuardDataResult;
import cy2.ChildDataResult;
import cy2.ContactDetailsResult;
import cy2.CorrespondenceAddressResult;
import cy2.OfficeSelectionResult;
import cy2.ParentsDataResult;
import cy2.PersonalSignatureResult;
import cy2.ReasonForApplyingResult;
import cy2.UserEdorAddressWrapper;
import fr.t;
import gw2.AdditionalAttachmentsConfigurationData;
import iy.b0;
import mu.p0;
import oq.p;
import p071kotlin.Metadata;
import p130wv2.q0;
import py3.OfficeSelectionData;
import wx2.ChooseChildResult;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b7\u0010DR\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010]\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010c\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010f\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010h\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010gR\u0016\u0010k\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u0004\u0018\u00010o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010x\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u0002010y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010z¨\u0006|"}, d2 = {"Lvx2/b;", "Lzx2/a;", "Lzx2/c$a;", "Lvx2/c;", "dataSource", "faceDetectionContract", "", "isFaceDetectionFeatureEnabled", "Lcy2/l;", "userEdorAddressWrapper", "<init>", "(Lvx2/c;Lzx2/a;ZLcy2/l;)V", "Lal0/c;", "data", "Loq/i0;", "s", "(Lal0/c;)V", "Lal0/b;", "O0", "(Lal0/b;)V", "Lal0/j;", "h", "(Lal0/j;)V", "Lpy3/b$b;", "x", "(Lpy3/b$b;)V", "Lal0/f$b;", "o", "(Lal0/f$b;)V", "i", "(Z)V", "Lal0/h;", "p", "(Lal0/h;)V", "Lal0/k;", "A0", "(Lal0/k;)V", "Lal0/f;", "r", "(Lal0/f;)V", "Lal0/j0;", "q", "(Lal0/j0;)V", "Lal0/f$a;", "w", "(Lal0/f$a;)V", "Lal0/w0;", "l", "(Lal0/w0;)V", "Lzx2/a$a;", "state", "y", "(Lzx2/a$a;)V", "a", "Lvx2/c;", "b", "Lzx2/a;", "c", "Z", "j", "()Z", "d", "Lcy2/l;", "getUserEdorAddressWrapper", "()Lcy2/l;", "Llv2/a;", "e", "Llv2/a;", "()Llv2/a;", "applicationOwner", "", "A", "()I", "requireChildAge", "z", "()Lal0/f;", "applicantData", "Lal0/g$a;", "B", "()Lal0/g$a;", "requireOwnerWithAge", "Lgw2/q;", "t", "()Lgw2/q;", "attachmentsConfigurationData", "v", "()Lal0/c;", "attachmentsData", "U0", "()Lal0/b;", "photoData", "C", "()Lal0/w0;", "selectedChild", "z0", "()Lal0/j;", "contactDetailsData", "u", "()Lpy3/b$b;", "selectedOffice", "k", "()Lal0/k;", "correspondenceAddressData", "()Lal0/f$b;", "parentsData", "g", "()Ljava/lang/Boolean;", "hasPersonalSigningCertificate", "m", "()Lal0/h;", "reasonForApplying", "", "n", "()Ljava/lang/String;", "officeEdorAddress", "Lal0/t;", ip.a.f96138c, "()Lal0/t;", "summaryData", "()Lal0/f$a;", "childData", "Lmu/p0;", "()Lmu/p0;", "faceDetectionInstallationState", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements zx2.a, zx2.c.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f208645f = b0.f97726c | h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zx2.a faceDetectionContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceDetectionFeatureEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final UserEdorAddressWrapper userEdorAddressWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lv2.a applicationOwner = lv2.a.CHILD;

    public b(c cVar, zx2.a aVar, boolean z15, UserEdorAddressWrapper userEdorAddressWrapper) {
        this.dataSource = cVar;
        this.faceDetectionContract = aVar;
        this.isFaceDetectionFeatureEnabled = z15;
        this.userEdorAddressWrapper = userEdorAddressWrapper;
    }

    private final int A() {
        ApplicantDataResultData.BasicInfo basicInfo;
        w0 w0VarC = C();
        if (w0VarC != null) {
            Integer numValueOf = null;
            if (t.c(w0VarC, w0.a.f7557a) || t.c(w0VarC, w0.b.f7558a)) {
                ApplicantDataResultData.BasicInfo basicInfoA = a();
                if (basicInfoA != null) {
                    numValueOf = Integer.valueOf(basicInfoA.getAge());
                }
            } else {
                if (!(w0VarC instanceof w0.Specific)) {
                    throw new p();
                }
                ApplicantDataResultData applicantDataResultDataZ = z();
                if (applicantDataResultDataZ != null && (basicInfo = applicantDataResultDataZ.getBasicInfo()) != null) {
                    numValueOf = Integer.valueOf(basicInfo.getAge());
                }
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        throw new IllegalStateException("ImplementationError: Failed to get age");
    }

    private final ApplicantDataResultData z() {
        return (ApplicantDataResultData) this.dataSource.b(q0.d.f215420b);
    }

    @Override // bx2.a
    public void A0(BECorrespondenceAddressData data) {
        this.dataSource.a(q0.i.f215425b, new CorrespondenceAddressResult(data));
    }

    @Override // px2.a, kw2.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public g.Child getRequireOwnerWithAge() {
        return new g.Child(A());
    }

    public w0 C() {
        return (w0) this.dataSource.b(q0.f.f215422b);
    }

    @Override // sx2.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Child c() {
        return this.dataSource.g(this.userEdorAddressWrapper.getUserEdorAddress());
    }

    @Override // kw2.a
    public void O0(AddPhotoData data) {
        this.dataSource.a(q0.a.f215417b, new AddPhotoResult(data));
    }

    @Override // kw2.a
    public AddPhotoData U0() {
        return (AddPhotoData) this.dataSource.b(q0.a.f215417b);
    }

    @Override // tw2.a
    public ApplicantDataResultData.BasicInfo a() {
        return (ApplicantDataResultData.BasicInfo) this.dataSource.b(q0.e.f215421b);
    }

    @Override // qw2.a, mx2.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public lv2.a getApplicationOwner() {
        return this.applicationOwner;
    }

    @Override // zx2.a, bw2.a
    public p0<zx2.a.EnumC6438a> d() {
        return this.faceDetectionContract.d();
    }

    @Override // jx2.a
    public ApplicantDataResultData.ParentInfo e() {
        return (ApplicantDataResultData.ParentInfo) this.dataSource.b(q0.l.f215428b);
    }

    @Override // mx2.a
    public Boolean g() {
        return (Boolean) this.dataSource.b(q0.m.f215429b);
    }

    @Override // zw2.a
    public void h(BEContactDetailsData data) {
        this.dataSource.a(q0.h.f215424b, new ContactDetailsResult(new BEContactDetailsData(data.getPhoneNumber(), data.getEmailAddress())));
    }

    @Override // mx2.a
    public void i(boolean data) {
        this.dataSource.a(q0.m.f215429b, new PersonalSignatureResult(data));
    }

    @Override // bw2.a
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsFaceDetectionFeatureEnabled() {
        return this.isFaceDetectionFeatureEnabled;
    }

    @Override // kw2.a, hw2.a
    public BECorrespondenceAddressData k() {
        return (BECorrespondenceAddressData) this.dataSource.b(q0.i.f215425b);
    }

    @Override // vw2.a
    public void l(w0 data) {
        this.dataSource.a(q0.f.f215422b, new ChooseChildResult(data));
    }

    @Override // px2.a
    public ApplicationReason m() {
        return (ApplicationReason) this.dataSource.b(q0.n.f215430b);
    }

    @Override // sx2.a
    public String n() {
        OfficeSelectionData.Office office = (OfficeSelectionData.Office) this.dataSource.b(q0.k.f215427b);
        if (office != null) {
            return office.getEdorAddress();
        }
        return null;
    }

    @Override // jx2.a
    public void o(ApplicantDataResultData.ParentInfo data) {
        this.dataSource.a(q0.l.f215428b, new ParentsDataResult(data));
    }

    @Override // px2.a
    public void p(ApplicationReason data) {
        this.dataSource.a(q0.n.f215430b, new ReasonForApplyingResult(data));
    }

    @Override // qw2.a
    public void q(ParentOrGuardData data) {
        this.dataSource.a(q0.c.f215419b, new CheckParentOrGuardDataResult(data));
    }

    @Override // nw2.a
    public void r(ApplicantDataResultData data) {
        this.dataSource.a(q0.d.f215420b, new ApplicantDataResult(data));
    }

    @Override // hw2.a
    public void s(AdditionalAttachmentsData data) {
        this.dataSource.a(q0.b.f215418b, new AdditionalAttachmentsResult(data));
    }

    @Override // hw2.a
    public AdditionalAttachmentsConfigurationData t() {
        AddPhotoData addPhotoData = (AddPhotoData) this.dataSource.f(q0.a.f215417b);
        return new AdditionalAttachmentsConfigurationData(addPhotoData.getIsFaceCoveringPhotoOptionChecked(), addPhotoData.getIsPhotoWithGlassesOptionChecked());
    }

    @Override // hx2.a
    public OfficeSelectionData.Office u() {
        return (OfficeSelectionData.Office) this.dataSource.b(q0.k.f215427b);
    }

    @Override // hw2.a
    public AdditionalAttachmentsData v() {
        return (AdditionalAttachmentsData) this.dataSource.b(q0.b.f215418b);
    }

    @Override // tw2.a
    public void w(ApplicantDataResultData.BasicInfo data) {
        this.dataSource.a(q0.e.f215421b, new ChildDataResult(data));
    }

    @Override // hx2.a
    public void x(OfficeSelectionData.Office data) {
        this.dataSource.a(q0.k.f215427b, new OfficeSelectionResult(data));
    }

    @Override // zx2.a
    public void y(zx2.a.EnumC6438a state) {
        this.faceDetectionContract.y(state);
    }

    @Override // bx2.a
    public BEContactDetailsData z0() {
        return (BEContactDetailsData) this.dataSource.b(q0.h.f215424b);
    }
}
