package nr;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import mr.r;
import mr.s;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pr.b1;
import pr.d3;
import pr.i3;
import st.e1;
import st.e2;
import st.f2;
import st.l1;
import st.p2;
import st.t0;
import st.t1;
import st.w0;
import st.x1;
import vr.h;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmr/e;", "", "Lmr/r;", "arguments", "", "nullable", "", "annotations", "Lmr/p;", "b", "(Lmr/e;Ljava/util/List;ZLjava/util/List;)Lmr/p;", "Lst/t1;", "attributes", "Lst/x1;", "typeConstructor", "Lst/e1;", "a", "(Lst/t1;Lst/x1;Ljava/util/List;Z)Lst/e1;", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137833a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137833a = iArr;
        }
    }

    private static final e1 a(t1 t1Var, x1 x1Var, List<r> list, boolean z15) {
        e2 l1Var;
        List<m1> parameters = x1Var.getParameters();
        List<r> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            r rVar = (r) obj;
            d3 d3Var = (d3) rVar.c();
            t0 t0VarU = d3Var != null ? d3Var.getType() : null;
            s sVarD = rVar.d();
            int i17 = sVarD == null ? -1 : a.f137833a[sVarD.ordinal()];
            if (i17 == -1) {
                l1Var = new l1(parameters.get(i15));
            } else if (i17 == 1) {
                l1Var = new f2(p2.INVARIANT, t0VarU);
            } else if (i17 == 2) {
                l1Var = new f2(p2.IN_VARIANCE, t0VarU);
            } else {
                if (i17 != 3) {
                    throw new p();
                }
                l1Var = new f2(p2.OUT_VARIANCE, t0VarU);
            }
            arrayList.add(l1Var);
            i15 = i16;
        }
        return w0.k(t1Var, x1Var, arrayList, z15, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mr.p b(mr.e eVar, List<r> list, boolean z15, List<? extends Annotation> list2) {
        h descriptor;
        er.a aVar = null;
        Object[] objArr = 0;
        b1 b1Var = eVar instanceof b1 ? (b1) eVar : null;
        if (b1Var == null || (descriptor = b1Var.getDescriptor()) == null) {
            throw new i3("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        x1 x1VarO = descriptor.o();
        List<m1> parameters = x1VarO.getParameters();
        if (parameters.size() == list.size()) {
            return new d3(a(list2.isEmpty() ? t1.f184126b.k() : t1.f184126b.k(), x1VarO, list, z15), aVar, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }

    public static /* synthetic */ mr.p c(mr.e eVar, List list, boolean z15, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = v.n();
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            list2 = v.n();
        }
        return b(eVar, list, z15, list2);
    }
}
