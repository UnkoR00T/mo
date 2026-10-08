package ce1;

import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import de1.b;
import de1.c;
import de1.d;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lce1/a;", "", "Lde1/f;", "data", "Loq/i0;", "K8", "(Lde1/f;)V", "Lld1/i;", "c8", "(Lld1/i;)V", "Lld1/r;", "F4", "(Lld1/r;)V", "Lde1/d;", "V3", "(Lde1/d;)V", "Lde1/b;", "Q3", "(Lde1/b;)V", "Lde1/c;", "M8", "(Lde1/c;)V", "Lde1/a;", "p4", "(Lde1/a;)V", "Lde1/e;", "m3", "()Lde1/e;", "krusData", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void F4(TaxOfficeModel data);

    void K8(SocialInsuranceQuestions data);

    void M8(c data);

    void Q3(b data);

    void V3(d data);

    void c8(KrusOfficeModel data);

    KrusData m3();

    void p4(IncomeTaxExceededAddFileModel data);
}
