package a24;

import iy.c0;
import mx.Label;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001e"}, d2 = {"La24/s;", "Lj14/n;", "Lhz/i;", "validatorTextFactory", "Lmx/c;", "labelProvider", "<init>", "(Lhz/i;Lmx/c;)V", "", "polishOnly", "Lhz/h;", "d", "(Z)Lhz/h;", "Lj14/n$a;", "params", "Lhz/g;", "e", "(Lj14/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "b", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "c", "Lhz/h;", "phonePrefixValidator", "phoneNumberGenericValidator", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements j14.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h phonePrefixValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.h phoneNumberGenericValidator;

    public s(hz.i iVar, mx.c cVar) {
        this.validatorTextFactory = iVar;
        this.labelProvider = cVar;
        this.phonePrefixValidator = iVar.a().M(cVar.c(s04.b.W0)).C(cVar.c(s04.b.X0)).y(5, cVar.c(s04.b.Y0));
        this.phoneNumberGenericValidator = iVar.a().M(cVar.c(s04.b.F1)).u(cVar.c(s04.b.A1)).O(5, cVar.c(s04.b.J1)).y(15, cVar.c(s04.b.I1));
    }

    private final hz.h d(boolean polishOnly) {
        Label labelE;
        hz.h hVarU = this.validatorTextFactory.a().M(this.labelProvider.c(s04.b.F1)).u(this.labelProvider.c(s04.b.A1));
        if (polishOnly) {
            labelE = this.labelProvider.e(s04.b.G1, 9);
        } else {
            if (polishOnly) {
                throw new oq.p();
            }
            labelE = this.labelProvider.e(s04.b.H1, 9);
        }
        return hVarU.m(9, labelE);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(j14.n.a aVar, tq.e<? super hz.g> eVar) {
        hz.h hVarD;
        String strE = c0.e(aVar.getText());
        if (!aVar.getIsRequired() && strE.length() == 0) {
            return hz.g.b.f86853b;
        }
        if (aVar instanceof j14.n.a.CheckPrefix) {
            hVarD = this.phonePrefixValidator;
        } else if (aVar instanceof j14.n.a.CheckNumber) {
            hVarD = fr.t.c(c0.e(((j14.n.a.CheckNumber) aVar).getPhoneNumber().h()), c0.e(PhoneNumber.c.INSTANCE.a())) ? d(false) : this.phoneNumberGenericValidator;
        } else {
            if (!(aVar instanceof j14.n.a.CheckNumberPolishOnly)) {
                throw new oq.p();
            }
            hVarD = d(true);
        }
        return hVarD.a(strE);
    }
}
