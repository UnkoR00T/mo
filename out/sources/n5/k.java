package n5;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f131957a = new boolean[3];

    static void a(f fVar, g5.d dVar, e eVar) {
        eVar.f131877t = -1;
        eVar.f131879u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i15 = eVar.O.f131826g;
            int iY = fVar.Y() - eVar.Q.f131826g;
            d dVar2 = eVar.O;
            dVar2.f131828i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f131828i = dVar.q(dVar3);
            dVar.f(eVar.O.f131828i, i15);
            dVar.f(eVar.Q.f131828i, iY);
            eVar.f131877t = 2;
            eVar.R0(i15, iY);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i16 = eVar.P.f131826g;
        int iX = fVar.x() - eVar.R.f131826g;
        d dVar4 = eVar.P;
        dVar4.f131828i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f131828i = dVar.q(dVar5);
        dVar.f(eVar.P.f131828i, i16);
        dVar.f(eVar.R.f131828i, iX);
        if (eVar.f131862l0 > 0 || eVar.X() == 8) {
            d dVar6 = eVar.S;
            dVar6.f131828i = dVar.q(dVar6);
            dVar.f(eVar.S.f131828i, eVar.f131862l0 + i16);
        }
        eVar.f131879u = 2;
        eVar.i1(i16, iX);
    }

    public static final boolean b(int i15, int i16) {
        return (i15 & i16) == i16;
    }
}
