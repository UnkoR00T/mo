package or;

import er.p;
import fr.q;
import mr.g;
import oq.r;
import ot.l0;
import p071kotlin.Metadata;
import pr.l;
import pr.l1;
import pr.y3;
import us.j;
import vr.g1;
import ys.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Loq/e;", "Lmr/g;", "a", "(Loq/e;)Lmr/g;", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements p<l0, j, g1> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f148262j = new a();

        a() {
            super(2, l0.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final g1 B(l0 l0Var, j jVar) {
            return l0Var.v(jVar);
        }
    }

    public static final <R> g<R> a(oq.e<? extends R> eVar) {
        Metadata metadata = (Metadata) eVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        r<ys.e, j> rVarJ = h.j(strArrD1, metadata.d2());
        ys.e eVarA = rVarJ.a();
        j jVarB = rVarJ.b();
        return new l1(l.f161879d, (g1) y3.h(eVar.getClass(), jVarB, eVarA, new ws.h(jVarB.M0()), new ws.c(metadata.mv(), (metadata.xi() & 8) != 0), a.f148262j));
    }
}
