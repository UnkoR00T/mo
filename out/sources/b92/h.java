package b92;

import fp0.ApplicantDetails;
import fp0.SummaryData;
import i82.x0;
import j92.ViolationDescriptionResult;
import mx.Label;
import p071kotlin.Metadata;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0011"}, d2 = {"Lb92/h;", "Lh00/a;", "Li82/s;", "", "Lfp0/j;", "Lfp0/k;", "violationTypeTag", "<init>", "(Lfp0/k;)V", "h", "()Lfp0/j;", "c", "Lfp0/k;", "g", "()Lfp0/k;", "i", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends h00.a<i82.s, Object, SummaryData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private fp0.k violationTypeTag;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lb92/h$a;", "", "Lfp0/k;", "violationTypeTag", "Lb92/h;", "a", "(Lfp0/k;)Lb92/h;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        h a(fp0.k violationTypeTag);
    }

    public h(fp0.k kVar) {
        this.violationTypeTag = kVar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final fp0.k getViolationTypeTag() {
        return this.violationTypeTag;
    }

    @Override // h00.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SummaryData e() {
        ViolationDescriptionResult.Data data = (ViolationDescriptionResult.Data) f(i82.s.e.f90224b);
        fp0.k kVar = this.violationTypeTag;
        fp0.l wasReported = data.getWasReported();
        Label violationEntityName = data.getViolationEntityName();
        Label violationDescription = data.getViolationDescription();
        wx.i.Image photo = data.getPhoto();
        Label officeReportedTo = data.getOfficeReportedTo();
        if (data.getWasReported() != fp0.l.YES) {
            officeReportedTo = null;
        }
        if (officeReportedTo == null) {
            officeReportedTo = Label.INSTANCE.c();
        }
        Label label = officeReportedTo;
        SummaryData.LocationDetails locationDetailsA = x0.a((LocationDetails) f(i82.s.c.f90222b));
        ApplicantDetails applicantDetails = (ApplicantDetails) f(i82.s.a.f90220b);
        fp0.m mVar = (fp0.m) b(i82.s.i.f90228b);
        if (mVar == null) {
            mVar = fp0.m.d.f65852a;
        }
        return new SummaryData(kVar, mVar, wasReported, label, violationEntityName, violationDescription, photo, locationDetailsA, applicantDetails, null);
    }

    public final void i(fp0.k kVar) {
        this.violationTypeTag = kVar;
    }
}
