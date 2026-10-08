package pm0;

import bl0.BEChildBirthApplicationResponse;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationInitial;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import bl0.BEChildBirthRegistrationSubmitApplication;
import bl0.BEGeneratedXmlChildBirth;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00042\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lpm0/a;", "", "", "territorialCode", "Ldx/i;", "Ldx/b;", "", "Lbl0/p;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "municipalOffice", "Lbl0/l;", "c", "(Lbl0/p;Ltq/e;)Ljava/lang/Object;", "Lbl0/n;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lbl0/h;", "childBirthRegistration", "Lbl0/u;", "e", "(Lbl0/h;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "token", "Lbl0/q;", "Lbl0/a;", "d", "(Liy/b0;Lbl0/q;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends List<BEChildBirthRegistrationMunicipalOffice>>> eVar);

    Object b(tq.e<? super dx.i<? extends dx.b, BEChildBirthRegistrationInitial>> eVar);

    Object c(BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, tq.e<? super dx.i<? extends dx.b, BEChildBirthRegistrationCivilRegistryOffices>> eVar);

    Object d(b0 b0Var, BEChildBirthRegistrationSubmitApplication bEChildBirthRegistrationSubmitApplication, tq.e<? super dx.i<? extends dx.b, BEChildBirthApplicationResponse>> eVar);

    Object e(BEChildBirthRegistration bEChildBirthRegistration, tq.e<? super dx.i<? extends dx.b, ? extends List<BEGeneratedXmlChildBirth>>> eVar);
}
