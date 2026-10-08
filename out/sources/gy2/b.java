package gy2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.ParentOrGuardData;
import al0.Ward;
import al0.g;
import cy2.AddPhotoResult;
import cy2.AdditionalAttachmentsResult;
import cy2.CheckParentOrGuardDataResult;
import cy2.ChildDataResult;
import cy2.ContactDetailsResult;
import cy2.CorrespondenceAddressResult;
import cy2.OfficeSelectionResult;
import cy2.ParentsDataResult;
import cy2.PersonalSignatureResult;
import cy2.ReasonForApplyingResult;
import cy2.UserEdorAddressWrapper;
import gw2.AdditionalAttachmentsConfigurationData;
import hy2.GuardianCertificateResult;
import iy.b0;
import mu.p0;
import p071kotlin.Metadata;
import p130wv2.b1;
import py3.OfficeSelectionData;
import wx.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b4\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010M\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0016\u0010P\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010V\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010\\\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010]R\u0016\u0010a\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010d\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010l\u001a\u0004\u0018\u00010i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0016\u0010n\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020.0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010p¨\u0006r"}, d2 = {"Lgy2/b;", "Lzx2/a;", "Lzx2/c$c;", "Lgy2/c;", "dataSource", "faceDetectionContract", "", "isFaceDetectionFeatureEnabled", "Lcy2/l;", "userEdorAddressWrapper", "<init>", "(Lgy2/c;Lzx2/a;ZLcy2/l;)V", "Lal0/c;", "data", "Loq/i0;", "s", "(Lal0/c;)V", "Lal0/b;", "O0", "(Lal0/b;)V", "Lal0/j;", "h", "(Lal0/j;)V", "Lwx/i;", "l", "(Lwx/i;)V", "Lpy3/b$b;", "x", "(Lpy3/b$b;)V", "Lal0/f$b;", "o", "(Lal0/f$b;)V", "i", "(Z)V", "Lal0/h;", "p", "(Lal0/h;)V", "Lal0/k;", "A0", "(Lal0/k;)V", "Lal0/j0;", "q", "(Lal0/j0;)V", "Lal0/f$a;", "w", "(Lal0/f$a;)V", "Lzx2/a$a;", "state", "y", "(Lzx2/a$a;)V", "a", "Lgy2/c;", "b", "Lzx2/a;", "c", "Z", "j", "()Z", "d", "Lcy2/l;", "getUserEdorAddressWrapper", "()Lcy2/l;", "Llv2/a;", "e", "Llv2/a;", "()Llv2/a;", "applicationOwner", "Lal0/g$c;", "z", "()Lal0/g$c;", "requireOwnerWithAge", "Lgw2/q;", "t", "()Lgw2/q;", "attachmentsConfigurationData", "v", "()Lal0/c;", "attachmentsData", "U0", "()Lal0/b;", "photoData", "z0", "()Lal0/j;", "contactDetailsData", "r", "()Lwx/i;", "guardianCertificate", "u", "()Lpy3/b$b;", "selectedOffice", "k", "()Lal0/k;", "correspondenceAddressData", "()Lal0/f$b;", "parentsData", "g", "()Ljava/lang/Boolean;", "hasPersonalSigningCertificate", "m", "()Lal0/h;", "reasonForApplying", "Lal0/y0;", "A", "()Lal0/y0;", "summaryData", "", "n", "()Ljava/lang/String;", "officeEdorAddress", "()Lal0/f$a;", "childData", "Lmu/p0;", "()Lmu/p0;", "faceDetectionInstallationState", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements zx2.a, zx2.c.InterfaceC6439c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78448f = b0.f97726c | h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zx2.a faceDetectionContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceDetectionFeatureEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final UserEdorAddressWrapper userEdorAddressWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lv2.a applicationOwner = lv2.a.WARD;

    public b(c cVar, zx2.a aVar, boolean z15, UserEdorAddressWrapper userEdorAddressWrapper) {
        this.dataSource = cVar;
        this.faceDetectionContract = aVar;
        this.isFaceDetectionFeatureEnabled = z15;
        this.userEdorAddressWrapper = userEdorAddressWrapper;
    }

    @Override // sx2.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Ward c() {
        return this.dataSource.g(this.userEdorAddressWrapper.getUserEdorAddress());
    }

    @Override // bx2.a
    public void A0(BECorrespondenceAddressData data) {
        this.dataSource.a(b1.f.f215354b, new CorrespondenceAddressResult(data));
    }

    @Override // kw2.a
    public void O0(AddPhotoData data) {
        this.dataSource.a(b1.a.f215349b, new AddPhotoResult(data));
    }

    @Override // kw2.a
    public AddPhotoData U0() {
        return (AddPhotoData) this.dataSource.b(b1.a.f215349b);
    }

    @Override // tw2.a
    public ApplicantDataResultData.BasicInfo a() {
        return (ApplicantDataResultData.BasicInfo) this.dataSource.b(b1.n.f215362b);
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
        return (ApplicantDataResultData.ParentInfo) this.dataSource.b(b1.j.f215358b);
    }

    @Override // mx2.a
    public Boolean g() {
        return (Boolean) this.dataSource.b(b1.k.f215359b);
    }

    @Override // zw2.a
    public void h(BEContactDetailsData data) {
        this.dataSource.a(b1.e.f215353b, new ContactDetailsResult(new BEContactDetailsData(data.getPhoneNumber(), data.getEmailAddress())));
    }

    @Override // mx2.a
    public void i(boolean data) {
        this.dataSource.a(b1.k.f215359b, new PersonalSignatureResult(data));
    }

    @Override // bw2.a
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsFaceDetectionFeatureEnabled() {
        return this.isFaceDetectionFeatureEnabled;
    }

    @Override // kw2.a, hw2.a
    public BECorrespondenceAddressData k() {
        return (BECorrespondenceAddressData) this.dataSource.b(b1.f.f215354b);
    }

    @Override // ex2.a
    public void l(i data) {
        this.dataSource.a(b1.h.f215356b, new GuardianCertificateResult(data));
    }

    @Override // px2.a
    public ApplicationReason m() {
        return (ApplicationReason) this.dataSource.b(b1.l.f215360b);
    }

    @Override // sx2.a
    public String n() {
        OfficeSelectionData.Office office = (OfficeSelectionData.Office) this.dataSource.b(b1.i.f215357b);
        if (office != null) {
            return office.getEdorAddress();
        }
        return null;
    }

    @Override // jx2.a
    public void o(ApplicantDataResultData.ParentInfo data) {
        this.dataSource.a(b1.j.f215358b, new ParentsDataResult(data));
    }

    @Override // px2.a
    public void p(ApplicationReason data) {
        this.dataSource.a(b1.l.f215360b, new ReasonForApplyingResult(data));
    }

    @Override // qw2.a
    public void q(ParentOrGuardData data) {
        this.dataSource.a(b1.c.f215351b, new CheckParentOrGuardDataResult(data));
    }

    @Override // ex2.a
    public i r() {
        return (i) this.dataSource.b(b1.h.f215356b);
    }

    @Override // hw2.a
    public void s(AdditionalAttachmentsData data) {
        this.dataSource.a(b1.b.f215350b, new AdditionalAttachmentsResult(data));
    }

    @Override // hw2.a
    public AdditionalAttachmentsConfigurationData t() {
        AddPhotoData addPhotoData = (AddPhotoData) this.dataSource.f(b1.a.f215349b);
        return new AdditionalAttachmentsConfigurationData(addPhotoData.getIsFaceCoveringPhotoOptionChecked(), addPhotoData.getIsPhotoWithGlassesOptionChecked());
    }

    @Override // hx2.a
    public OfficeSelectionData.Office u() {
        return (OfficeSelectionData.Office) this.dataSource.b(b1.i.f215357b);
    }

    @Override // hw2.a
    public AdditionalAttachmentsData v() {
        return (AdditionalAttachmentsData) this.dataSource.b(b1.b.f215350b);
    }

    @Override // tw2.a
    public void w(ApplicantDataResultData.BasicInfo data) {
        this.dataSource.a(b1.n.f215362b, new ChildDataResult(data));
    }

    @Override // hx2.a
    public void x(OfficeSelectionData.Office data) {
        this.dataSource.a(b1.i.f215357b, new OfficeSelectionResult(data));
    }

    @Override // zx2.a
    public void y(zx2.a.EnumC6438a state) {
        this.faceDetectionContract.y(state);
    }

    @Override // px2.a, kw2.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g.Ward getRequireOwnerWithAge() {
        ApplicantDataResultData.BasicInfo basicInfoA = a();
        if (basicInfoA != null) {
            return new g.Ward(basicInfoA.getAge());
        }
        throw new IllegalStateException("ImplementationError: Failed to get age");
    }

    @Override // bx2.a
    public BEContactDetailsData z0() {
        return (BEContactDetailsData) this.dataSource.b(b1.e.f215353b);
    }
}
