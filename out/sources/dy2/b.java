package dy2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.Adult;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.g;
import cy2.AddPhotoResult;
import cy2.AdditionalAttachmentsResult;
import cy2.ApplicantDataResult;
import cy2.ContactDetailsResult;
import cy2.CorrespondenceAddressResult;
import cy2.OfficeSelectionResult;
import cy2.PersonalSignatureResult;
import cy2.ReasonForApplyingResult;
import cy2.UserEdorAddressWrapper;
import gw2.AdditionalAttachmentsConfigurationData;
import mu.p0;
import p071kotlin.Metadata;
import p130wv2.x0;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u001a\u0010>\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b)\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0016\u0010[\u001a\u0004\u0018\u00010X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020%0_8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010`¨\u0006b"}, d2 = {"Ldy2/b;", "Lzx2/a;", "Lzx2/c$b;", "Ldy2/c;", "dataSource", "faceDetectionContract", "", "isFaceDetectionFeatureEnabled", "Lcy2/l;", "userEdorAddressWrapper", "<init>", "(Ldy2/c;Lzx2/a;ZLcy2/l;)V", "Lal0/c;", "data", "Loq/i0;", "s", "(Lal0/c;)V", "Lal0/b;", "O0", "(Lal0/b;)V", "Lal0/j;", "h", "(Lal0/j;)V", "Lpy3/b$b;", "x", "(Lpy3/b$b;)V", "i", "(Z)V", "Lal0/h;", "p", "(Lal0/h;)V", "Lal0/k;", "A0", "(Lal0/k;)V", "Lal0/f;", "r", "(Lal0/f;)V", "Lzx2/a$a;", "state", "y", "(Lzx2/a$a;)V", "a", "Ldy2/c;", "b", "Lzx2/a;", "c", "Z", "j", "()Z", "d", "Lcy2/l;", "getUserEdorAddressWrapper", "()Lcy2/l;", "Llv2/a;", "e", "Llv2/a;", "()Llv2/a;", "applicationOwner", "Lal0/g$b;", "f", "Lal0/g$b;", "()Lal0/g$b;", "requireOwnerWithAge", "u", "()Lpy3/b$b;", "selectedOffice", "Lgw2/q;", "t", "()Lgw2/q;", "attachmentsConfigurationData", "v", "()Lal0/c;", "attachmentsData", "U0", "()Lal0/b;", "photoData", "z0", "()Lal0/j;", "contactDetailsData", "k", "()Lal0/k;", "correspondenceAddressData", "g", "()Ljava/lang/Boolean;", "hasPersonalSigningCertificate", "m", "()Lal0/h;", "reasonForApplying", "", "n", "()Ljava/lang/String;", "officeEdorAddress", "Lal0/d;", "()Lal0/d;", "summaryData", "Lmu/p0;", "()Lmu/p0;", "faceDetectionInstallationState", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements zx2.a, zx2.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zx2.a faceDetectionContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceDetectionFeatureEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final UserEdorAddressWrapper userEdorAddressWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lv2.a applicationOwner = lv2.a.MYSELF;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g.b requireOwnerWithAge = g.b.f7359a;

    public b(c cVar, zx2.a aVar, boolean z15, UserEdorAddressWrapper userEdorAddressWrapper) {
        this.dataSource = cVar;
        this.faceDetectionContract = aVar;
        this.isFaceDetectionFeatureEnabled = z15;
        this.userEdorAddressWrapper = userEdorAddressWrapper;
    }

    @Override // bx2.a
    public void A0(BECorrespondenceAddressData data) {
        this.dataSource.a(x0.e.f215457b, new CorrespondenceAddressResult(data));
    }

    @Override // kw2.a
    public void O0(AddPhotoData data) {
        this.dataSource.a(x0.a.f215453b, new AddPhotoResult(data));
    }

    @Override // kw2.a
    public AddPhotoData U0() {
        return (AddPhotoData) this.dataSource.b(x0.a.f215453b);
    }

    @Override // px2.a, kw2.a
    /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
    public g.b f() {
        return this.requireOwnerWithAge;
    }

    @Override // mx2.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public lv2.a getApplicationOwner() {
        return this.applicationOwner;
    }

    @Override // zx2.a, bw2.a
    public p0<zx2.a.EnumC6438a> d() {
        return this.faceDetectionContract.d();
    }

    @Override // sx2.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Adult c() {
        return this.dataSource.g(this.userEdorAddressWrapper.getUserEdorAddress());
    }

    @Override // mx2.a
    public Boolean g() {
        return (Boolean) this.dataSource.b(x0.h.f215460b);
    }

    @Override // zw2.a
    public void h(BEContactDetailsData data) {
        this.dataSource.a(x0.d.f215456b, new ContactDetailsResult(new BEContactDetailsData(data.getPhoneNumber(), data.getEmailAddress())));
    }

    @Override // mx2.a
    public void i(boolean data) {
        this.dataSource.a(x0.h.f215460b, new PersonalSignatureResult(data));
    }

    @Override // bw2.a
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsFaceDetectionFeatureEnabled() {
        return this.isFaceDetectionFeatureEnabled;
    }

    @Override // kw2.a, hw2.a
    public BECorrespondenceAddressData k() {
        return (BECorrespondenceAddressData) this.dataSource.b(x0.e.f215457b);
    }

    @Override // px2.a
    public ApplicationReason m() {
        return (ApplicationReason) this.dataSource.b(x0.i.f215461b);
    }

    @Override // sx2.a
    public String n() {
        OfficeSelectionData.Office office = (OfficeSelectionData.Office) this.dataSource.b(x0.g.f215459b);
        if (office != null) {
            return office.getEdorAddress();
        }
        return null;
    }

    @Override // px2.a
    public void p(ApplicationReason data) {
        this.dataSource.a(x0.i.f215461b, new ReasonForApplyingResult(data));
    }

    @Override // nw2.a
    public void r(ApplicantDataResultData data) {
        this.dataSource.a(x0.c.f215455b, new ApplicantDataResult(data));
    }

    @Override // hw2.a
    public void s(AdditionalAttachmentsData data) {
        this.dataSource.a(x0.b.f215454b, new AdditionalAttachmentsResult(data));
    }

    @Override // hw2.a
    public AdditionalAttachmentsConfigurationData t() {
        AddPhotoData addPhotoData = (AddPhotoData) this.dataSource.f(x0.a.f215453b);
        return new AdditionalAttachmentsConfigurationData(addPhotoData.getIsFaceCoveringPhotoOptionChecked(), addPhotoData.getIsPhotoWithGlassesOptionChecked());
    }

    @Override // hx2.a
    public OfficeSelectionData.Office u() {
        return (OfficeSelectionData.Office) this.dataSource.b(x0.g.f215459b);
    }

    @Override // hw2.a
    public AdditionalAttachmentsData v() {
        return (AdditionalAttachmentsData) this.dataSource.b(x0.b.f215454b);
    }

    @Override // hx2.a
    public void x(OfficeSelectionData.Office data) {
        this.dataSource.a(x0.g.f215459b, new OfficeSelectionResult(data));
    }

    @Override // zx2.a
    public void y(zx2.a.EnumC6438a state) {
        this.faceDetectionContract.y(state);
    }

    @Override // bx2.a
    public BEContactDetailsData z0() {
        return (BEContactDetailsData) this.dataSource.b(x0.d.f215456b);
    }
}
