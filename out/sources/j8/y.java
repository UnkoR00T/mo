package j8;

import a8.b3;
import java.util.Objects;
import t7.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3[] f100152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f100153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f100154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f100155e;

    public y(b3[] b3VarArr, r[] rVarArr, i0 i0Var, Object obj) {
        zj.p.d(b3VarArr.length == rVarArr.length);
        this.f100152b = b3VarArr;
        this.f100153c = (r[]) rVarArr.clone();
        this.f100154d = i0Var;
        this.f100155e = obj;
        this.f100151a = b3VarArr.length;
    }

    public boolean a(y yVar) {
        if (yVar == null || yVar.f100153c.length != this.f100153c.length) {
            return false;
        }
        for (int i15 = 0; i15 < this.f100153c.length; i15++) {
            if (!b(yVar, i15)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(y yVar, int i15) {
        return yVar != null && Objects.equals(this.f100152b[i15], yVar.f100152b[i15]) && Objects.equals(this.f100153c[i15], yVar.f100153c[i15]);
    }

    public boolean c(int i15) {
        return this.f100152b[i15] != null;
    }
}
