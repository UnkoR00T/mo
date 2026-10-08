package v33;

import java.util.List;
import k23.BusinessDetailsData;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.PlaceOfPurchaseData;
import k23.ProductData;
import k23.ReportLocationDescription;
import p071kotlin.Metadata;
import st3.AddressData;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H&¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b+\u0010,¨\u0006-À\u0006\u0003"}, d2 = {"Lv33/j;", "", "Lk23/g;", "i0", "()Lk23/g;", "Ltt0/g;", ip.a.f96137b, "()Ltt0/g;", "Ltt0/h;", "h6", "()Ltt0/h;", "Lk23/h;", "P0", "()Lk23/h;", "Lk23/k;", "K0", "()Lk23/k;", "Lk23/l;", "I", "()Lk23/l;", "Lst3/b;", "o", "()Lst3/b;", "Lk23/j;", "G0", "()Lk23/j;", "Lk23/i;", "N", "()Lk23/i;", "Lk23/c;", "businessSelection", "Lk23/b;", "M0", "(Lk23/c;)Lk23/b;", "", "Lwx/i;", "h", "()Ljava/util/List;", "Ltt0/b;", "p2", "()Ltt0/b;", "configuration", "Loq/i0;", "s0", "(Ltt0/b;)V", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    ProductData G0();

    ReportLocationDescription I();

    k23.k K0();

    BusinessDetailsData M0(k23.c businessSelection);

    PlaceOfPurchaseData N();

    OtherReportData P0();

    BEReportCategory S();

    List<wx.i> h();

    BEReportSubCategory h6();

    DetailsModel i0();

    AddressData o();

    BEAttachmentsConfiguration p2();

    void s0(BEAttachmentsConfiguration configuration);
}
