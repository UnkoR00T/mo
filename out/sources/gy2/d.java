package gy2;

import al0.AddPhotoData;
import al0.AdditionalAttachmentsData;
import al0.ApplicantDataResultData;
import al0.ApplicationReason;
import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.ParentOrGuardData;
import al0.Ward;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;
import p130wv2.b1;
import py3.OfficeSelectionData;
import wx.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgy2/d;", "Lgy2/c;", "<init>", "()V", "Loq/i0;", "h", "Liy/b0;", "userEdorAddress", "Lal0/y0;", "g", "(Liy/b0;)Lal0/y0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78455d = h00.a.f79185b;

    @Override // h00.a
    public /* bridge */ /* synthetic */ i0 e() {
        h();
        return i0.f148189a;
    }

    @Override // gy2.c
    public Ward g(b0 userEdorAddress) {
        return new Ward(userEdorAddress, (ParentOrGuardData) f(b1.c.f215351b), (i) f(b1.h.f215356b), (ApplicantDataResultData.BasicInfo) f(b1.n.f215362b), (ApplicantDataResultData.ParentInfo) f(b1.j.f215358b), (ApplicationReason) f(b1.l.f215360b), (Boolean) b(b1.k.f215359b), (AddPhotoData) f(b1.a.f215349b), (AdditionalAttachmentsData) b(b1.b.f215350b), kv2.a.b((OfficeSelectionData.Office) f(b1.i.f215357b)), (BECorrespondenceAddressData) f(b1.f.f215354b), (BEContactDetailsData) f(b1.e.f215353b));
    }

    public void h() {
    }
}
