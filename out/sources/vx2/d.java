package vx2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.Child;
import al0.ParentOrGuardData;
import al0.w0;
import fr.t;
import iy.b0;
import oq.i0;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import p130wv2.q0;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvx2/d;", "Lvx2/c;", "<init>", "()V", "Lal0/f$a;", "i", "()Lal0/f$a;", "Lal0/f$b;", "k", "()Lal0/f$b;", "Lal0/f;", "h", "()Lal0/f;", "Loq/i0;", "j", "Liy/b0;", "userEdorAddress", "Lal0/t;", "g", "(Liy/b0;)Lal0/t;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f208652d = h00.a.f79185b;

    private final ApplicantDataResultData h() {
        return (ApplicantDataResultData) f(q0.d.f215420b);
    }

    private final ApplicantDataResultData.BasicInfo i() {
        return (ApplicantDataResultData.BasicInfo) f(q0.e.f215421b);
    }

    private final ApplicantDataResultData.ParentInfo k() {
        return (ApplicantDataResultData.ParentInfo) f(q0.l.f215428b);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ i0 e() {
        j();
        return i0.f148189a;
    }

    @Override // vx2.c
    public Child g(b0 userEdorAddress) {
        r rVarA;
        w0 w0Var = (w0) f(q0.f.f215422b);
        if (t.c(w0Var, w0.b.f7558a) || t.c(w0Var, w0.a.f7557a)) {
            rVarA = y.a(i(), k());
        } else {
            if (!(w0Var instanceof w0.Specific)) {
                throw new p();
            }
            ApplicantDataResultData applicantDataResultDataH = h();
            rVarA = y.a(applicantDataResultDataH.getBasicInfo(), applicantDataResultDataH.getParentInfo());
        }
        return new Child(userEdorAddress, (ParentOrGuardData) f(q0.c.f215419b), w0Var, (ApplicantDataResultData.BasicInfo) rVarA.a(), (ApplicantDataResultData.ParentInfo) rVarA.b(), (ApplicationReason) f(q0.n.f215430b), (Boolean) b(q0.m.f215429b), (AddPhotoData) f(q0.a.f215417b), (AdditionalAttachmentsData) b(q0.b.f215418b), kv2.a.b((OfficeSelectionData.Office) f(q0.k.f215427b)), (BECorrespondenceAddressData) f(q0.i.f215425b), (BEContactDetailsData) f(q0.h.f215424b));
    }

    public void j() {
    }
}
