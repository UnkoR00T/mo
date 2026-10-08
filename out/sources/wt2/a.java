package wt2;

import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwt2/a;", "Lyt2/a;", "<init>", "()V", "Lbu2/b;", "companyDetails", "Loq/i0;", "a", "(Lbu2/b;)V", "L0", "()Lbu2/b;", "Lbu2/d;", "verificationCheckData", "d", "(Lbu2/d;)V", "c", "()Lbu2/d;", "Lbu2/e;", "verifiedStatus", "e", "(Lbu2/e;)V", "b", "()Lbu2/e;", "clear", "Lbu2/b;", "Lbu2/d;", "Lbu2/e;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements yt2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CompanyDetails companyDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private VerificationCheckData verificationCheckData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private VerifiedStatus verifiedStatus;

    @Override // yt2.a
    /* JADX INFO: renamed from: L0, reason: from getter */
    public CompanyDetails getCompanyDetails() {
        return this.companyDetails;
    }

    @Override // yt2.a
    public void a(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    @Override // yt2.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public VerifiedStatus getVerifiedStatus() {
        return this.verifiedStatus;
    }

    @Override // yt2.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public VerificationCheckData getVerificationCheckData() {
        return this.verificationCheckData;
    }

    @Override // yt2.a
    public void clear() {
        this.companyDetails = null;
        this.verificationCheckData = null;
        this.verifiedStatus = null;
    }

    @Override // yt2.a
    public void d(VerificationCheckData verificationCheckData) {
        this.verificationCheckData = verificationCheckData;
    }

    @Override // yt2.a
    public void e(VerifiedStatus verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }
}
