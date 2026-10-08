package x52;

import p024c42.r2;
import p024c42.s2;
import p024c42.v2;
import p024c42.y2;
import p071kotlin.Metadata;
import s52.StampDutyPaymentsSummaryData;
import y52.StampDutyCommitmentTypeData;
import y52.StampDutyCommitmentVariantData;
import y52.StampDutyInstitutionsData;
import y52.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx52/a;", "Lh00/a;", "", "Ls52/a;", "<init>", "()V", "g", "()Ls52/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends h00.a<Object, Object, StampDutyPaymentsSummaryData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216912c = h00.a.f79185b;

    @Override // h00.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public StampDutyPaymentsSummaryData e() {
        return new StampDutyPaymentsSummaryData((StampDutyCommitmentTypeData) f(r2.f23298a), (StampDutyCommitmentVariantData) f(s2.f23303a), (StampDutyInstitutionsData) f(v2.f23327a), (g) f(y2.f23361a));
    }
}
