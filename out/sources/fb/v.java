package fb;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class v extends k {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    int f60682r0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private k[] f60685u0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    ArrayList<k> f60680h0 = new ArrayList<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f60681q0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    boolean f60683s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f60684t0 = 0;

    class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f60686a;

        a(k kVar) {
            this.f60686a = kVar;
        }

        @Override // fb.r, fb.k.h
        public void k(k kVar) {
            this.f60686a.r0();
            kVar.n0(this);
        }
    }

    class b extends r {
        b() {
        }

        @Override // fb.r, fb.k.h
        public void l(k kVar) {
            v.this.f60680h0.remove(kVar);
            if (v.this.W()) {
                return;
            }
            v.this.j0(k.i.f60669c, false);
            v vVar = v.this;
            vVar.E = true;
            vVar.j0(k.i.f60668b, false);
        }
    }

    static class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        v f60689a;

        c(v vVar) {
            this.f60689a = vVar;
        }

        @Override // fb.r, fb.k.h
        public void h(k kVar) {
            v vVar = this.f60689a;
            if (vVar.f60683s0) {
                return;
            }
            vVar.z0();
            this.f60689a.f60683s0 = true;
        }

        @Override // fb.r, fb.k.h
        public void k(k kVar) {
            v vVar = this.f60689a;
            int i15 = vVar.f60682r0 - 1;
            vVar.f60682r0 = i15;
            if (i15 == 0) {
                vVar.f60683s0 = false;
                vVar.y();
            }
            kVar.n0(this);
        }
    }

    private void E0(k kVar) {
        this.f60680h0.add(kVar);
        kVar.f60641t = this;
    }

    private int I0(long j15) {
        for (int i15 = 1; i15 < this.f60680h0.size(); i15++) {
            if (this.f60680h0.get(i15).R > j15) {
                return i15 - 1;
            }
        }
        return this.f60680h0.size() - 1;
    }

    private void L0(k[] kVarArr) {
        Arrays.fill(kVarArr, (Object) null);
        this.f60685u0 = kVarArr;
    }

    private void R0() {
        c cVar = new c(this);
        Iterator<k> it = this.f60680h0.iterator();
        while (it.hasNext()) {
            it.next().e(cVar);
        }
        this.f60682r0 = this.f60680h0.size();
    }

    private k[] S0() {
        k[] kVarArr = this.f60685u0;
        this.f60685u0 = null;
        if (kVarArr == null) {
            kVarArr = new k[this.f60680h0.size()];
        }
        return (k[]) this.f60680h0.toArray(kVarArr);
    }

    @Override // fb.k
    String A0(String str) {
        String strA0 = super.A0(str);
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strA0);
            sb5.append("\n");
            sb5.append(this.f60680h0.get(i15).A0(str + "  "));
            strA0 = sb5.toString();
        }
        return strA0;
    }

    @Override // fb.k
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public v e(k.h hVar) {
        return (v) super.e(hVar);
    }

    @Override // fb.k
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public v g(View view) {
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            this.f60680h0.get(i15).g(view);
        }
        return (v) super.g(view);
    }

    public v D0(k kVar) {
        E0(kVar);
        long j15 = this.f60626c;
        if (j15 >= 0) {
            kVar.t0(j15);
        }
        if ((this.f60684t0 & 1) != 0) {
            kVar.v0(D());
        }
        if ((this.f60684t0 & 2) != 0) {
            I();
            kVar.x0(null);
        }
        if ((this.f60684t0 & 4) != 0) {
            kVar.w0(H());
        }
        if ((this.f60684t0 & 8) != 0) {
            kVar.u0(A());
        }
        return this;
    }

    public k F0(int i15) {
        if (i15 < 0 || i15 >= this.f60680h0.size()) {
            return null;
        }
        return this.f60680h0.get(i15);
    }

    public int G0() {
        return this.f60680h0.size();
    }

    @Override // fb.k
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public v n0(k.h hVar) {
        return (v) super.n0(hVar);
    }

    @Override // fb.k
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public v o0(View view) {
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            this.f60680h0.get(i15).o0(view);
        }
        return (v) super.o0(view);
    }

    @Override // fb.k
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public v t0(long j15) {
        ArrayList<k> arrayList;
        super.t0(j15);
        if (this.f60626c >= 0 && (arrayList = this.f60680h0) != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f60680h0.get(i15).t0(j15);
            }
        }
        return this;
    }

    @Override // fb.k
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public v v0(TimeInterpolator timeInterpolator) {
        this.f60684t0 |= 1;
        ArrayList<k> arrayList = this.f60680h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f60680h0.get(i15).v0(timeInterpolator);
            }
        }
        return (v) super.v0(timeInterpolator);
    }

    public v P0(int i15) {
        if (i15 == 0) {
            this.f60681q0 = true;
            return this;
        }
        if (i15 == 1) {
            this.f60681q0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i15);
    }

    @Override // fb.k
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public v y0(long j15) {
        return (v) super.y0(j15);
    }

    @Override // fb.k
    boolean W() {
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            if (this.f60680h0.get(i15).W()) {
                return true;
            }
        }
        return false;
    }

    @Override // fb.k
    public boolean X() {
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!this.f60680h0.get(i15).X()) {
                return false;
            }
        }
        return true;
    }

    @Override // fb.k
    protected void cancel() {
        super.cancel();
        k[] kVarArrS0 = S0();
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            kVarArrS0[i15].cancel();
        }
        L0(kVarArrS0);
    }

    @Override // fb.k
    public void k0(View view) {
        super.k0(view);
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f60680h0.get(i15).k0(view);
        }
    }

    @Override // fb.k
    public void m(x xVar) {
        if (a0(xVar.f60692b)) {
            for (k kVar : this.f60680h0) {
                if (kVar.a0(xVar.f60692b)) {
                    kVar.m(xVar);
                    xVar.f60693c.add(kVar);
                }
            }
        }
    }

    @Override // fb.k
    void m0() {
        this.O = 0L;
        b bVar = new b();
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            k kVar = this.f60680h0.get(i15);
            kVar.e(bVar);
            kVar.m0();
            long jS = kVar.S();
            if (this.f60681q0) {
                this.O = Math.max(this.O, jS);
            } else {
                long j15 = this.O;
                kVar.R = j15;
                this.O = j15 + jS;
            }
        }
    }

    @Override // fb.k
    void o(x xVar) {
        super.o(xVar);
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f60680h0.get(i15).o(xVar);
        }
    }

    @Override // fb.k
    public void p(x xVar) {
        if (a0(xVar.f60692b)) {
            for (k kVar : this.f60680h0) {
                if (kVar.a0(xVar.f60692b)) {
                    kVar.p(xVar);
                    xVar.f60693c.add(kVar);
                }
            }
        }
    }

    @Override // fb.k
    public void p0(View view) {
        super.p0(view);
        k[] kVarArrS0 = S0();
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            kVarArrS0[i15].p0(view);
        }
        L0(kVarArrS0);
    }

    @Override // fb.k
    protected void r0() {
        if (this.f60680h0.isEmpty()) {
            z0();
            y();
            return;
        }
        R0();
        if (this.f60681q0) {
            Iterator<k> it = this.f60680h0.iterator();
            while (it.hasNext()) {
                it.next().r0();
            }
            return;
        }
        for (int i15 = 1; i15 < this.f60680h0.size(); i15++) {
            this.f60680h0.get(i15 - 1).e(new a(this.f60680h0.get(i15)));
        }
        k kVar = this.f60680h0.get(0);
        if (kVar != null) {
            kVar.r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // fb.k
    void s0(long j15, long j16) {
        long j17;
        long jS = S();
        long j18 = 0;
        if (this.f60641t != null) {
            if (j15 < 0 && j16 < 0) {
                return;
            }
            if (j15 > jS && j16 > jS) {
                return;
            }
        }
        boolean z15 = j15 < j16;
        if ((j15 >= 0 && j16 < 0) || (j15 <= jS && j16 > jS)) {
            this.E = false;
            j0(k.i.f60667a, z15);
        }
        if (!this.f60681q0) {
            int iI0 = I0(j16);
            if (j15 >= j16) {
                while (true) {
                    if (iI0 < this.f60680h0.size()) {
                        k kVar = this.f60680h0.get(iI0);
                        long j19 = kVar.R;
                        j17 = j18;
                        long j25 = j15 - j19;
                        if (j25 < j17) {
                            break;
                        }
                        kVar.s0(j25, j16 - j19);
                        iI0++;
                        j18 = j17;
                    }
                }
            } else {
                j17 = 0;
                while (iI0 >= 0) {
                    k kVar2 = this.f60680h0.get(iI0);
                    long j26 = kVar2.R;
                    long j27 = j15 - j26;
                    kVar2.s0(j27, j16 - j26);
                    if (j27 >= 0) {
                        break;
                    } else {
                        iI0--;
                    }
                }
            }
            if (this.f60641t != null) {
                if ((j15 > jS || j16 > jS) && (j15 >= 0 || j16 < j17)) {
                    return;
                }
                if (j15 > jS) {
                    this.E = true;
                }
                j0(k.i.f60668b, z15);
            }
        }
        for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
            this.f60680h0.get(i15).s0(j15, j16);
        }
        j17 = j18;
        if (this.f60641t != null) {
            if (j15 > jS) {
                return;
            } else {
                return;
            }
            if (j15 > jS) {
                this.E = true;
            }
            j0(k.i.f60668b, z15);
        }
    }

    @Override // fb.k
    /* JADX INFO: renamed from: t */
    public k clone() {
        v vVar = (v) super.clone();
        vVar.f60680h0 = new ArrayList<>();
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            vVar.E0(this.f60680h0.get(i15).clone());
        }
        return vVar;
    }

    @Override // fb.k
    public void u0(k.e eVar) {
        super.u0(eVar);
        this.f60684t0 |= 8;
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f60680h0.get(i15).u0(eVar);
        }
    }

    @Override // fb.k
    void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long jN = N();
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            k kVar = this.f60680h0.get(i15);
            if (jN > 0 && (this.f60681q0 || i15 == 0)) {
                long jN2 = kVar.N();
                if (jN2 > 0) {
                    kVar.y0(jN2 + jN);
                } else {
                    kVar.y0(jN);
                }
            }
            kVar.w(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // fb.k
    public void w0(g gVar) {
        super.w0(gVar);
        this.f60684t0 |= 4;
        if (this.f60680h0 != null) {
            for (int i15 = 0; i15 < this.f60680h0.size(); i15++) {
                this.f60680h0.get(i15).w0(gVar);
            }
        }
    }

    @Override // fb.k
    public void x0(t tVar) {
        super.x0(tVar);
        this.f60684t0 |= 2;
        int size = this.f60680h0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f60680h0.get(i15).x0(tVar);
        }
    }
}
