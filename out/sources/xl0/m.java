package xl0;

import al0.Child;
import al0.Ward;
import al0.w0;
import al0.x0;
import fr.t;
import gm0.PersonalChildDataDto;
import gm0.m1;
import iy.c0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lal0/x0;", "Lgm0/m1;", "a", "(Lal0/x0;)Lgm0/m1;", "Lgm0/q5;", "b", "(Lal0/x0;)Lgm0/q5;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final m1 a(x0 x0Var) {
        if (!(x0Var instanceof Child)) {
            if (x0Var instanceof Ward) {
                return m1.WARD;
            }
            throw new p();
        }
        w0 selectedChild = ((Child) x0Var).getSelectedChild();
        if (t.c(selectedChild, w0.b.f7558a) || t.c(selectedChild, w0.a.f7557a)) {
            return m1.CHILD_WITHOUT_PARENTIZATION;
        }
        if (selectedChild instanceof w0.Specific) {
            return m1.CHILD_WITH_PARENTIZATION;
        }
        throw new p();
    }

    public static final PersonalChildDataDto b(x0 x0Var) {
        return new PersonalChildDataDto(x0Var.getChildData().getDateOfBirth(), x0Var.getParentsData().getFathersName(), x0Var.getChildData().getFirstName(), f.l(x0Var.getChildData().getGender()), x0Var.getChildData().getFamilyName(), x0Var.getParentsData().getMothersMaidenName(), x0Var.getParentsData().getMothersName(), x0Var.getChildData().getNationality(), c0.e(x0Var.getChildData().getPesel()), x0Var.getChildData().getPlaceOfBirth(), x0Var.getChildData().getSurname(), x0Var.getChildData().getSecondName());
    }
}
