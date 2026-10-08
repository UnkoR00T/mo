package ju2;

import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import iu2.WizardResultData;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010 \u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'À\u0006\u0003"}, d2 = {"Lju2/f;", "", "Lcu2/i$g;", "destination", "Loq/i0;", "Y5", "(Lcu2/i$g;)V", "Lbu2/d;", "verificationCheckData", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "(Ltq/e;)Ljava/lang/Object;", "Lbu2/e;", "verifiedStatus", "w0", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "Y", "Liu2/a;", "wizardResultData", "H0", "(Liu2/a;)V", "Ljb4/b;", "errorData", "b0", "(Ljb4/b;)V", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "onDateChange", "minimumDate", "maximumDate", "t0", "(Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "Lxw/b;", "Lju2/e$e;", "g", "()Lxw/b;", "nestedNavAction", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    void H0(WizardResultData wizardResultData);

    Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar);

    Object Y(tq.e<? super VerifiedStatus> eVar);

    void Y5(cu2.i.g destination);

    void b0(jb4.b errorData);

    xw.b<e.AbstractC2511e> g();

    Object s(tq.e<? super VerificationCheckData> eVar);

    void t0(LocalDate initialDate, er.l<? super LocalDate, oq.i0> onDateChange, LocalDate minimumDate, LocalDate maximumDate);

    Object w0(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar);
}
