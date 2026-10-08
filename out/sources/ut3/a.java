package ut3;

import au3.m;
import cu3.w;
import f00.SharedDestinationSpec;
import f00.r;
import j14.o;
import java.util.List;
import p071kotlin.Metadata;
import yt3.p;
import zt3.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lut3/a;", "", "<init>", "()V", "Lmx/c;", "labelProvider", "Lyt3/d;", "a", "(Lmx/c;)Lyt3/d;", "Lau3/m;", "c", "(Lmx/c;)Lau3/m;", "Lxt3/b;", "isBuildingNumberValidUseCase", "Lxt3/c;", "isOptionalApartmentNumberValidUC", "Lhz/d;", "conditionValidator", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "Lxt3/i;", "e", "(Lmx/c;Lxt3/b;Lxt3/c;Lhz/d;Lj14/o;)Lxt3/i;", "validateCorrespondenceAddressUseCase", "Lbu3/b;", "d", "(Lxt3/i;)Lbu3/b;", "Lst3/h;", "b", "()Lst3/h;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public a() {
        List<SharedDestinationSpec> listK = r.K();
        i iVar = i.f201442a;
        listK.add(new SharedDestinationSpec(st3.e.class, p.class, iVar.c()));
        r.K().add(new SharedDestinationSpec(tt3.c.class, w.class, iVar.d()));
    }

    public final yt3.d a(mx.c labelProvider) {
        return new yt3.d(labelProvider);
    }

    public final st3.h b() {
        return new j();
    }

    public final m c(mx.c labelProvider) {
        return new m(labelProvider);
    }

    public final bu3.b d(xt3.i validateCorrespondenceAddressUseCase) {
        return new bu3.b(validateCorrespondenceAddressUseCase);
    }

    public final xt3.i e(mx.c labelProvider, xt3.b isBuildingNumberValidUseCase, xt3.c isOptionalApartmentNumberValidUC, hz.d conditionValidator, o checkPolishPostalCodeCorrectUC) {
        return new xt3.j(labelProvider, isBuildingNumberValidUseCase, isOptionalApartmentNumberValidUC, conditionValidator, checkPolishPostalCodeCorrectUC);
    }
}
