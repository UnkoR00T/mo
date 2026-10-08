package n5;

import java.util.ArrayList;
import java.util.Arrays;
import o5.o;

/* JADX INFO: loaded from: classes.dex */
public class j extends e implements i {
    public e[] L0 = new e[4];
    public int M0 = 0;

    @Override // n5.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i15 = this.M0 + 1;
        e[] eVarArr = this.L0;
        if (i15 > eVarArr.length) {
            this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.L0;
        int i16 = this.M0;
        eVarArr2[i16] = eVar;
        this.M0 = i16 + 1;
    }

    @Override // n5.i
    public void b() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    @Override // n5.i
    public void c(f fVar) {
    }

    public void u1(ArrayList<o> arrayList, int i15, o oVar) {
        for (int i16 = 0; i16 < this.M0; i16++) {
            oVar.a(this.L0[i16]);
        }
        for (int i17 = 0; i17 < this.M0; i17++) {
            o5.i.a(this.L0[i17], i15, arrayList, oVar);
        }
    }

    public int v1(int i15) {
        int i16;
        int i17;
        for (int i18 = 0; i18 < this.M0; i18++) {
            e eVar = this.L0[i18];
            if (i15 == 0 && (i17 = eVar.I0) != -1) {
                return i17;
            }
            if (i15 == 1 && (i16 = eVar.J0) != -1) {
                return i16;
            }
        }
        return -1;
    }
}
