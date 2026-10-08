package a8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class y2 extends a8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f4797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f4798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t7.e0[] f4799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f4800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f4801n;

    class a extends h8.v {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final t7.e0.c f4802f;

        a(t7.e0 e0Var) {
            super(e0Var);
            this.f4802f = new t7.e0.c();
        }

        @Override // h8.v, t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            t7.e0.b bVarG = super.g(i15, bVar, z15);
            if (super.n(bVarG.f188138c, this.f4802f).f()) {
                bVarG.u(bVar.f188136a, bVar.f188137b, bVar.f188138c, bVar.f188139d, bVar.f188140e, t7.a.f188028g, true);
                return bVarG;
            }
            bVarG.f188141f = true;
            return bVarG;
        }
    }

    public y2(Collection<? extends h2> collection, h8.b1 b1Var) {
        this(G(collection), H(collection), b1Var);
    }

    private static t7.e0[] G(Collection<? extends h2> collection) {
        t7.e0[] e0VarArr = new t7.e0[collection.size()];
        Iterator<? extends h2> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            e0VarArr[i15] = it.next().b();
            i15++;
        }
        return e0VarArr;
    }

    private static Object[] H(Collection<? extends h2> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends h2> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            objArr[i15] = it.next().a();
            i15++;
        }
        return objArr;
    }

    @Override // a8.a
    protected int A(int i15) {
        return this.f4798k[i15];
    }

    @Override // a8.a
    protected t7.e0 D(int i15) {
        return this.f4799l[i15];
    }

    public y2 E(h8.b1 b1Var) {
        t7.e0[] e0VarArr = new t7.e0[this.f4799l.length];
        int i15 = 0;
        while (true) {
            t7.e0[] e0VarArr2 = this.f4799l;
            if (i15 >= e0VarArr2.length) {
                return new y2(e0VarArr, this.f4800m, b1Var);
            }
            e0VarArr[i15] = new a(e0VarArr2[i15]);
            i15++;
        }
    }

    List<t7.e0> F() {
        return Arrays.asList(this.f4799l);
    }

    @Override // t7.e0
    public int i() {
        return this.f4796i;
    }

    @Override // t7.e0
    public int p() {
        return this.f4795h;
    }

    @Override // a8.a
    protected int s(Object obj) {
        Integer num = this.f4801n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // a8.a
    protected int t(int i15) {
        return w7.o0.f(this.f4797j, i15 + 1, false, false);
    }

    @Override // a8.a
    protected int u(int i15) {
        return w7.o0.f(this.f4798k, i15 + 1, false, false);
    }

    @Override // a8.a
    protected Object x(int i15) {
        return this.f4800m[i15];
    }

    @Override // a8.a
    protected int z(int i15) {
        return this.f4797j[i15];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private y2(t7.e0[] e0VarArr, Object[] objArr, h8.b1 b1Var) {
        super(false, b1Var);
        int i15 = 0;
        int length = e0VarArr.length;
        this.f4799l = e0VarArr;
        this.f4797j = new int[length];
        this.f4798k = new int[length];
        this.f4800m = objArr;
        this.f4801n = new HashMap<>();
        int length2 = e0VarArr.length;
        int iP = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length2) {
            t7.e0 e0Var = e0VarArr[i15];
            this.f4799l[i17] = e0Var;
            this.f4798k[i17] = iP;
            this.f4797j[i17] = i16;
            iP += e0Var.p();
            i16 += this.f4799l[i17].i();
            this.f4801n.put(objArr[i17], Integer.valueOf(i17));
            i15++;
            i17++;
        }
        this.f4795h = iP;
        this.f4796i = i16;
    }
}
