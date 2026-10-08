package c10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my.JWSHeaderData;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sn.h;
import sn.j;
import sn.r;
import xn.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc10/d;", "Lly/b;", "Lmy/a;", "<init>", "()V", "data", "", "b", "(Lmy/a;Ltq/e;)Ljava/lang/Object;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements ly.b<JWSHeaderData> {
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    @Override // ly.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(JWSHeaderData jWSHeaderData, tq.e<? super String> eVar) throws h {
        r.a aVarF;
        r.a aVar = new r.a(c.b(jWSHeaderData.getAlgorithm()));
        String type = jWSHeaderData.getType();
        if (type != null) {
            aVar.j(new j(type));
        }
        List<String> listB = jWSHeaderData.b();
        if (listB != null) {
            List<String> list = listB;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(io.a.e((String) it.next()));
            }
            aVar.k(arrayList);
        }
        JWSHeaderData.InterfaceC3214a jwkType = jWSHeaderData.getJwkType();
        if (jwkType != null) {
            if (jwkType instanceof JWSHeaderData.InterfaceC3214a.MapStructure) {
                aVar.f(xn.d.u(((JWSHeaderData.InterfaceC3214a.MapStructure) jwkType).a()));
            } else if (jwkType instanceof JWSHeaderData.InterfaceC3214a.Certificate) {
                JWSHeaderData.InterfaceC3214a.Certificate certificate = (JWSHeaderData.InterfaceC3214a.Certificate) jwkType;
                xn.d dVarT = xn.d.t(certificate.getCert());
                iy.h algorithm = certificate.getAlgorithm();
                if (algorithm == null) {
                    aVar.f(dVarT.A());
                } else {
                    if (algorithm instanceof iy.h.a) {
                        aVarF = aVar.f(dVarT.y().A());
                    } else if (algorithm instanceof iy.h.b) {
                        xn.b bVarV = dVarT.v();
                        aVarF = aVar.f(new xn.b.a(bVarV.F(), bVarV.G(), bVarV.H()).a());
                    } else {
                        if (!(algorithm instanceof iy.h.c)) {
                            throw new p();
                        }
                        m mVarB = dVarT.B();
                        aVarF = aVar.f(new m.a(mVarB.C(), mVarB.D()).a());
                    }
                    if (aVarF == null) {
                        aVar.f(dVarT.A());
                    }
                }
            } else if (jwkType instanceof JWSHeaderData.InterfaceC3214a.Json) {
                aVar.f(xn.d.s(((JWSHeaderData.InterfaceC3214a.Json) jwkType).getJson()));
            } else {
                if (!(jwkType instanceof JWSHeaderData.InterfaceC3214a.Attestation)) {
                    throw new p();
                }
                aVar.e("key_attestation", ((JWSHeaderData.InterfaceC3214a.Attestation) jwkType).getAttestation());
            }
        }
        return aVar.b().h().toString();
    }
}
