package os;

import er.l;
import st.e1;

/* JADX INFO: loaded from: classes4.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.e f149662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f149663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e1 f149664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f149665d;

    public h(vr.e eVar, i iVar, e1 e1Var, a aVar) {
        this.f149662a = eVar;
        this.f149663b = iVar;
        this.f149664c = e1Var;
        this.f149665d = aVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return i.k(this.f149662a, this.f149663b, this.f149664c, this.f149665d, (tt.g) obj);
    }
}
