package p114t0;

import c5.r;
import er.l;
import fr.w;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lt0/j;", "Le4/w0;", "Lt0/m;", "scope", "<init>", "(Lt0/m;)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "a", "Lt0/m;", "getScope", "()Lt0/m;", "", "b", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<a2> f186324b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends a2> list) {
            super(1);
            this.f186324b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            List<a2> list = this.f186324b;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                a2.a.E(aVar, list.get(i15), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public j(m mVar) {
        this.scope = mVar;
    }

    @Override // p036e4.w0
    public int c(p036e4.w wVar, List<? extends v> list, int i15) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE0 = list.get(0).e0(i15);
        int iP = pq.v.p(list);
        int i16 = 1;
        if (1 <= iP) {
            while (true) {
                int iE1 = list.get(i16).e0(i15);
                if (iE1 > iE0) {
                    iE0 = iE1;
                }
                if (i16 == iP) {
                    break;
                }
                i16++;
            }
        }
        return iE0;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a2 a2VarO0 = list.get(i15).o0(j15);
            iMax = Math.max(iMax, a2VarO0.getWidth());
            iMax2 = Math.max(iMax2, a2VarO0.getHeight());
            arrayList.add(a2VarO0);
        }
        if (y0Var.J0()) {
            this.hasLookaheadOccurred = true;
            this.scope.a().setValue(r.b(r.c((BodyPartID.bodyIdMax & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.a().setValue(r.b(r.c((BodyPartID.bodyIdMax & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return y0.j2(y0Var, iMax, iMax2, null, new a(arrayList), 4, null);
    }

    @Override // p036e4.w0
    public int f(p036e4.w wVar, List<? extends v> list, int i15) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = list.get(0).n(i15);
        int iP = pq.v.p(list);
        int i16 = 1;
        if (1 <= iP) {
            while (true) {
                int iN2 = list.get(i16).n(i15);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i16 == iP) {
                    break;
                }
                i16++;
            }
        }
        return iN;
    }

    @Override // p036e4.w0
    public int h(p036e4.w wVar, List<? extends v> list, int i15) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU = list.get(0).U(i15);
        int iP = pq.v.p(list);
        int i16 = 1;
        if (1 <= iP) {
            while (true) {
                int iU2 = list.get(i16).U(i15);
                if (iU2 > iU) {
                    iU = iU2;
                }
                if (i16 == iP) {
                    break;
                }
                i16++;
            }
        }
        return iU;
    }

    @Override // p036e4.w0
    public int i(p036e4.w wVar, List<? extends v> list, int i15) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM0 = list.get(0).m0(i15);
        int iP = pq.v.p(list);
        int i16 = 1;
        if (1 <= iP) {
            while (true) {
                int iM1 = list.get(i16).m0(i15);
                if (iM1 > iM0) {
                    iM0 = iM1;
                }
                if (i16 == iP) {
                    break;
                }
                i16++;
            }
        }
        return iM0;
    }
}
