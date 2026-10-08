package s2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import oq.b0;
import oq.r;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.c5;
import p076m2.f4;
import p076m2.h4;
import p076m2.l0;
import p076m2.o1;
import p076m2.o2;
import p076m2.r2;
import p076m2.s1;
import p076m2.s2;
import pq.v;
import r0.k0;
import r2.a0;
import r2.o;
import r2.t;
import r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0010\u001a\u00060\fj\u0002`\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001f\u001a\u00020\u001b*\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"*\f\b\u0000\u0010#\"\u00020\f2\u00020\f¨\u0006$"}, d2 = {"Lr2/t;", "slots", "Lm2/c;", "", "applier", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "Loq/i0;", "j", "(Lr2/t;Lm2/c;J)V", "destination", "", "i", "(Lr2/t;JLm2/c;)I", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "h", "(Lr2/t;I)I", "Lm2/l0;", "composition", "Lm2/v;", "parentContext", "Lm2/s2;", "reference", "k", "(Lm2/l0;Lm2/v;Lm2/s2;Lr2/t;Lm2/c;)V", "", "Lq2/g;", "errorContext", "editor", "f", "(Ljava/lang/Throwable;Lq2/g;Lr2/t;J)Ljava/lang/Throwable;", "l", "(Lq2/g;Lr2/t;)Lq2/g;", "IntParameter", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"s2/k$a", "Lm2/h4;", "Lm2/f4;", "scope", "", "instance", "Lm2/s1;", "i", "(Lm2/f4;Ljava/lang/Object;)Lm2/s1;", "Loq/i0;", "g", "(Lm2/f4;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f177593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s2 f177594b;

        a(l0 l0Var, s2 s2Var) {
            this.f177593a = l0Var;
            this.f177594b = s2Var;
        }

        @Override // p076m2.h4
        public void a(Object value) {
        }

        @Override // p076m2.h4
        public void g(f4 scope) {
        }

        @Override // p076m2.h4
        public s1 i(f4 scope, Object instance) {
            s1 s1VarI;
            l0 l0Var = this.f177593a;
            h4 h4Var = l0Var instanceof h4 ? (h4) l0Var : null;
            if (h4Var == null || (s1VarI = h4Var.i(scope, instance)) == null) {
                s1VarI = s1.IGNORED;
            }
            if (s1VarI != s1.IGNORED) {
                return s1VarI;
            }
            s2 s2Var = this.f177594b;
            List<r<f4, Object>> listD = s2Var.d();
            if (instance == null) {
                instance = c5.f122830a;
            }
            s2Var.i(v.M0(listD, y.a(scope, instance)));
            return s1.SCHEDULED;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"s2/k$b", "Lq2/g;", "", "currentOffset", "", "Le3/d;", "b", "(Ljava/lang/Integer;)Ljava/util/List;", "", "c", "()Z", "sourceInformationEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements q2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q2.g f177595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f177596b;

        b(q2.g gVar, t tVar) {
            this.f177595a = gVar;
            this.f177596b = tVar;
        }

        @Override // q2.g
        public List<ComposeStackTraceFrame> b(Integer currentOffset) {
            List<ComposeStackTraceFrame> listB = this.f177595a.b(null);
            int parent = this.f177596b.getParent();
            return parent < 0 ? listB : v.L0(w.c(this.f177596b, currentOffset, parent), listB);
        }

        @Override // q2.g
        public boolean c() {
            return this.f177595a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th4, final q2.g gVar, final t tVar, final long j15) {
        return gVar == null ? th4 : e3.e.b(th4, new er.a() { // from class: s2.j
            @Override // er.a
            public final Object a() {
                return k.g(j15, tVar, gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3.a g(long j15, t tVar, q2.g gVar) {
        if (j15 != -1) {
            tVar.F(j15);
        }
        List listD = w.d(tVar, null, 0, 3, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) v.z0(listD);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listB = gVar.b(groupOffset);
        if (groupOffset != null && !listB.isEmpty()) {
            listB = v.L0(v.e(ComposeStackTraceFrame.b((ComposeStackTraceFrame) v.l0(listB), 0, null, groupOffset, 3, null)), v.f0(listB, 1));
        }
        return new e3.a(v.L0(listD, listB), gVar.c());
    }

    private static final int h(t tVar, int i15) {
        if (i15 < 0) {
            return 0;
        }
        o table = tVar.getTable();
        int[] groups = table.getAddressSpace().getGroups();
        int i16 = i15;
        int i17 = i16;
        int iY = 0;
        while (i16 > 0) {
            if (tVar.r(i16)) {
                return iY;
            }
            int iZ = tVar.z(i16);
            int[] groups2 = table.getAddressSpace().getGroups();
            for (int root = iZ < 0 ? table.getRoot() : tVar.e(iZ); root >= 0 && root != i17; root = groups2[root + 1]) {
                iY += tVar.y(root);
            }
            i16 = groups[i16 + 2];
            i17 = iZ;
        }
        if (!(i16 != 0)) {
            p076m2.t.b("Traversing parent of group not in the slot table: " + i15);
        }
        return iY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(t tVar, long j15, p076m2.c<Object> cVar) {
        j(tVar, cVar, j15);
        int parent = tVar.getParent();
        int iB = r2.f.b(j15);
        o1 o1Var = new o1();
        int[] groups = tVar.getTable().getAddressSpace().getGroups();
        int i15 = iB;
        while (true) {
            if (i15 <= 0) {
                if (!(i15 != 0)) {
                    p076m2.t.b("Traversing parent of group not in the slot table: " + iB);
                    break;
                }
                break;
            }
            if (i15 == parent) {
                break;
            }
            o1Var.i(i15);
            i15 = groups[i15 + 2];
        }
        if (!(tVar.getParent() == parent)) {
            p076m2.t.b("Unexpected slot table structure when inserting movable content");
        }
        int current = tVar.getCurrent();
        int iJ = 0;
        boolean z15 = false;
        while (tVar.getCurrent() != iB) {
            if (o1Var.tos == 0 || tVar.getCurrent() != o1Var.c()) {
                iJ += tVar.J();
            } else {
                if (tVar.q()) {
                    cVar.g(tVar.i());
                    z15 = true;
                    iJ = 0;
                }
                tVar.K();
                o1Var.g();
            }
        }
        return iJ + (z15 ? 0 : h(tVar, current));
    }

    private static final void j(t tVar, p076m2.c<Object> cVar, long j15) {
        if (tVar.getParent() >= 0) {
            k0 k0VarB = r0.t.b();
            o table = tVar.getTable();
            int iZ = tVar.z(r2.f.b(j15));
            int[] groups = table.getAddressSpace().getGroups();
            int i15 = iZ;
            while (i15 > 0) {
                k0VarB.h(i15);
                i15 = groups[i15 + 2];
            }
            if (!(i15 != 0)) {
                p076m2.t.b("Traversing parent of group not in the slot table: " + iZ);
            }
            while (tVar.getParent() >= 0 && !k0VarB.a(tVar.getParent())) {
                if (tVar.s()) {
                    cVar.j();
                }
                tVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(l0 l0Var, p076m2.v vVar, s2 s2Var, t tVar, p076m2.c<?> cVar) {
        o table = tVar.getTable();
        o.Companion companion = o.INSTANCE;
        r2.r rVar = new r2.r(table.getAddressSpace(), false, false);
        rVar.f();
        o2<Object> o2VarC = s2Var.c();
        rVar.B(126665345, o2VarC == p076m2.r.INSTANCE.a() ? 0 : 16777216, o2VarC, null, null);
        rVar.b(268435456);
        rVar.c(s2Var.getParameter());
        rVar.u(tVar, (((long) 0) << 32) | (((long) b0.e(tVar.getTable().getAddressSpace().getGroups()[r2.j.c(s2Var.getAnchor()).getAddress() + 3])) & BodyPartID.bodyIdMax));
        rVar.i();
        o oVarD = rVar.d();
        r2 r2Var = new r2(oVarD);
        if (oVarD.T(oVarD.getRoot())) {
            a0.e(oVarD, oVarD.getRoot(), new a(l0Var, s2Var));
        }
        vVar.p(s2Var, r2Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q2.g l(q2.g gVar, t tVar) {
        return new b(gVar, tVar);
    }
}
