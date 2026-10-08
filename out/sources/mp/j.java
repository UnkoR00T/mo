package mp;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j extends c {
    public j() {
    }

    public static j i(qo.b bVar) {
        Map<Integer, String> mapB = bVar.b();
        j jVar = new j();
        for (Map.Entry<Integer, String> entry : mapB.entrySet()) {
            jVar.a(entry.getKey().intValue(), entry.getValue());
        }
        return jVar;
    }

    @Override // hp.c
    public bp.b D1() {
        return null;
    }

    @Override // mp.c
    public String d() {
        return "built-in (Type 1)";
    }

    public j(no.e eVar) {
        for (no.b bVar : eVar.j()) {
            a(bVar.b(), bVar.c());
        }
    }
}
