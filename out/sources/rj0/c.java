package rj0;

import dx.i;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;
import xi0.ContactDetail;
import xi0.ContactDetails;
import xi0.ContactDetailsConfirmation;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001a\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\bH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001e\u0010\u0013J,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001f\u0010\u0016¨\u0006 À\u0006\u0003"}, d2 = {"Lrj0/c;", "", "", "code", "Liy/b0;", "email", "Lny/a;", "wkToken", "Ldx/i;", "Ldx/b;", "Lxi0/f;", "f", "(Ljava/lang/String;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "phoneNumber", "prefix", "c", "(Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lxi0/a;", "h", "(Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lxw/h;", "i", "(Lxw/h;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "Lxi0/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "g", "e", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Object a(tq.e<? super i<? extends dx.b, ContactDetails>> eVar);

    Object b(b0 b0Var, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object c(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super i<? extends dx.b, ContactDetailsConfirmation>> eVar);

    Object d(b0 b0Var, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object e(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super i<? extends dx.b, ContactDetail>> eVar);

    Object f(String str, b0 b0Var, b0 b0Var2, tq.e<? super i<? extends dx.b, ContactDetailsConfirmation>> eVar);

    Object g(b0 b0Var, b0 b0Var2, tq.e<? super i<? extends dx.b, ContactDetail>> eVar);

    Object h(b0 b0Var, b0 b0Var2, tq.e<? super i<? extends dx.b, ContactDetail>> eVar);

    Object i(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super i<? extends dx.b, ContactDetail>> eVar);
}
