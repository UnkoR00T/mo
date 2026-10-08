package bj2;

import java.util.ArrayList;
import p071kotlin.Metadata;
import xi2.InstitutionHistory;
import xi2.VerificationHistory;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR2\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0004j\b\u0012\u0004\u0012\u00020\u000e`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0015"}, d2 = {"Lbj2/a;", "Lcj2/c;", "<init>", "()V", "Ljava/util/ArrayList;", "Lxi2/b;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "g", "()Ljava/util/ArrayList;", "setVerificationHistory", "(Ljava/util/ArrayList;)V", "verificationHistory", "Lxi2/a;", "d", "f", "setInstitutionHistory", "institutionHistory", "e", "a", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends cj2.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19836f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @vl.c("verHis")
    private ArrayList<VerificationHistory> verificationHistory = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @vl.c("instHis")
    private ArrayList<InstitutionHistory> institutionHistory = new ArrayList<>();

    public final ArrayList<InstitutionHistory> f() {
        return this.institutionHistory;
    }

    public final ArrayList<VerificationHistory> g() {
        return this.verificationHistory;
    }
}
