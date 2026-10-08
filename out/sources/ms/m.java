package ms;

import java.util.Map;
import ns.b1;
import qs.y;
import qs.z;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f128056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.m f128057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<y, Integer> f128059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.h<y, b1> f128060e;

    public m(k kVar, vr.m mVar, z zVar, int i15) {
        this.f128056a = kVar;
        this.f128057b = mVar;
        this.f128058c = i15;
        this.f128059d = cu.a.d(zVar.getTypeParameters());
        this.f128060e = kVar.e().a(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 c(m mVar, y yVar) {
        Integer num = mVar.f128059d.get(yVar);
        if (num == null) {
            return null;
        }
        return new b1(c.k(c.c(mVar.f128056a, mVar), mVar.f128057b.getAnnotations()), yVar, mVar.f128058c + num.intValue(), mVar.f128057b);
    }

    @Override // ms.p
    public m1 a(y yVar) {
        b1 b1VarB = this.f128060e.b(yVar);
        return b1VarB != null ? b1VarB : this.f128056a.f().a(yVar);
    }
}
