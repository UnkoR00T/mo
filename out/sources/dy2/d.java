package dy2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.Adult;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;
import p130wv2.x0;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldy2/d;", "Ldy2/c;", "<init>", "()V", "Loq/i0;", "h", "Liy/b0;", "userEdorAddress", "Lal0/d;", "g", "(Liy/b0;)Lal0/d;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45569d = h00.a.f79185b;

    @Override // h00.a
    public /* bridge */ /* synthetic */ i0 e() {
        h();
        return i0.f148189a;
    }

    @Override // dy2.c
    public Adult g(b0 userEdorAddress) {
        return new Adult(userEdorAddress, (ApplicantDataResultData) f(x0.c.f215455b), (ApplicationReason) f(x0.i.f215461b), ((Boolean) f(x0.h.f215460b)).booleanValue(), (AddPhotoData) f(x0.a.f215453b), (AdditionalAttachmentsData) b(x0.b.f215454b), kv2.a.b((OfficeSelectionData.Office) f(x0.g.f215459b)), (BECorrespondenceAddressData) f(x0.e.f215457b), (BEContactDetailsData) f(x0.d.f215456b));
    }

    public void h() {
    }
}
