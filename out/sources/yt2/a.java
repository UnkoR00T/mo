package yt2;

import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lyt2/a;", "", "Lbu2/b;", "companyDetails", "Loq/i0;", "a", "(Lbu2/b;)V", "L0", "()Lbu2/b;", "Lbu2/d;", "verificationCheckData", "d", "(Lbu2/d;)V", "c", "()Lbu2/d;", "Lbu2/e;", "verifiedStatus", "e", "(Lbu2/e;)V", "b", "()Lbu2/e;", "clear", "()V", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    CompanyDetails L0();

    void a(CompanyDetails companyDetails);

    VerifiedStatus b();

    VerificationCheckData c();

    void clear();

    void d(VerificationCheckData verificationCheckData);

    void e(VerifiedStatus verifiedStatus);
}
