package rd;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final sd.c.a f173198f = sd.c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final sd.c.a f173199g = sd.c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nd.a f173200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nd.b f173201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nd.b f173202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nd.b f173203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nd.b f173204e;

    private void a(sd.c cVar, fd.f fVar) {
        cVar.Y();
        String strQ2 = "";
        while (cVar.p()) {
            int iE = cVar.E(f173199g);
            if (iE != 0) {
                if (iE == 1) {
                    strQ2.getClass();
                    switch (strQ2) {
                        case "Distance":
                            this.f173203d = d.e(cVar, fVar);
                            break;
                        case "Opacity":
                            this.f173201b = d.f(cVar, fVar, false);
                            break;
                        case "Direction":
                            this.f173202c = d.f(cVar, fVar, false);
                            break;
                        case "Shadow Color":
                            this.f173200a = d.c(cVar, fVar);
                            break;
                        case "Softness":
                            this.f173204e = d.e(cVar, fVar);
                            break;
                        default:
                            cVar.G0();
                            break;
                    }
                } else {
                    cVar.H();
                    cVar.G0();
                }
            } else {
                strQ2 = cVar.q2();
            }
        }
        cVar.h0();
    }

    j b(sd.c cVar, fd.f fVar) {
        nd.b bVar;
        nd.b bVar2;
        nd.b bVar3;
        nd.b bVar4;
        while (cVar.p()) {
            if (cVar.E(f173198f) != 0) {
                cVar.H();
                cVar.G0();
            } else {
                cVar.h();
                while (cVar.p()) {
                    a(cVar, fVar);
                }
                cVar.m();
            }
        }
        nd.a aVar = this.f173200a;
        if (aVar == null || (bVar = this.f173201b) == null || (bVar2 = this.f173202c) == null || (bVar3 = this.f173203d) == null || (bVar4 = this.f173204e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
