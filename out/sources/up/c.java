package up;

import bp.h;
import bp.i;
import bp.p;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class c implements hp.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f199556b = i.f20842q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f199557c = i.f20796l3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f199558d = i.f20784k1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f199559e = i.f20885t9;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f199560f = i.f20832p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f199561g = i.f20803m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f199562h = i.J3("ETSI.CAdES.detached");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f199563j = i.f20813n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f199564a;

    public c() {
        bp.d dVar = new bp.d();
        this.f199564a = dVar;
        dVar.Y4(i.f20732e9, i.U7);
    }

    public int[] a() {
        bp.a aVarJ4 = this.f199564a.j4(i.P0);
        if (aVarJ4 == null) {
            return new int[0];
        }
        int size = aVarJ4.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 < size; i15++) {
            iArr[i15] = aVarJ4.getInt(i15);
        }
        return iArr;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f199564a;
    }

    public void c(int[] iArr) {
        if (iArr.length != 4) {
            return;
        }
        bp.a aVar = new bp.a();
        for (int i15 : iArr) {
            aVar.A3(h.g4(i15));
        }
        this.f199564a.Y4(i.P0, aVar);
        aVar.A2(true);
    }

    public void d(byte[] bArr) {
        p pVar = new p(bArr);
        pVar.X3(true);
        this.f199564a.Y4(i.N1, pVar);
    }

    public void e(i iVar) {
        this.f199564a.Y4(i.f20933y3, iVar);
    }

    public void f(String str) {
        this.f199564a.g5(i.M5, str);
    }

    public void g(Calendar calendar) {
        this.f199564a.S4(i.f20837p5, calendar);
    }

    public void h(i iVar) {
        this.f199564a.Y4(i.f20894u8, iVar);
    }

    public c(bp.d dVar) {
        this.f199564a = dVar;
    }
}
