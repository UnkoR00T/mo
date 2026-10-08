package gp;

import bp.k;
import bp.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e implements hp.c, zo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f75795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f75796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hp.g f75797c;

    class a implements tp.a {
        a() {
        }

        @Override // tp.a
        public boolean a(tp.b bVar) {
            return true;
        }
    }

    public e(hp.g gVar) {
        bp.d dVar = new bp.d();
        this.f75795a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.B6);
        dVar.Z4(bp.i.B5, gVar);
    }

    private hp.g b(hp.g gVar) {
        hp.g gVarH = h();
        hp.g gVar2 = new hp.g();
        gVar2.i(Math.max(gVarH.d(), gVar.d()));
        gVar2.j(Math.max(gVarH.e(), gVar.e()));
        gVar2.k(Math.min(gVarH.f(), gVar.f()));
        gVar2.l(Math.min(gVarH.g(), gVar.g()));
        return gVar2;
    }

    @Override // zo.a
    public InputStream a() {
        bp.b bVarP4 = this.f75795a.p4(bp.i.N1);
        if (bVarP4 instanceof o) {
            return ((o) bVarP4).l5();
        }
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            if (aVar.size() > 0) {
                byte[] bArr = {10};
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < aVar.size(); i15++) {
                    bp.b bVarK4 = aVar.k4(i15);
                    if (bVarK4 instanceof o) {
                        arrayList.add(((o) bVarK4).l5());
                        arrayList.add(new ByteArrayInputStream(bArr));
                    }
                }
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    public List<tp.b> c() {
        return d(new a());
    }

    public List<tp.b> d(tp.a aVar) throws IOException {
        bp.d dVar = this.f75795a;
        bp.i iVar = bp.i.D;
        bp.b bVarP4 = dVar.p4(iVar);
        if (!(bVarP4 instanceof bp.a)) {
            return new hp.a(this.f75795a, iVar);
        }
        bp.a aVar2 = (bp.a) bVarP4;
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < aVar2.size(); i15++) {
            bp.b bVarK4 = aVar2.k4(i15);
            if (bVarK4 != null) {
                tp.b bVarA = tp.b.a(bVarK4);
                if (aVar.a(bVarA)) {
                    arrayList.add(bVarA);
                }
            }
        }
        return new hp.a(arrayList, aVar2);
    }

    public hp.g e() {
        return g();
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).D1() == D1();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f75795a;
    }

    public hp.g g() {
        bp.b bVarO = g.o(this.f75795a, bp.i.T1);
        return bVarO instanceof bp.a ? b(new hp.g((bp.a) bVarO)) : h();
    }

    public hp.g h() {
        if (this.f75797c == null) {
            bp.b bVarO = g.o(this.f75795a, bp.i.B5);
            if (bVarO instanceof bp.a) {
                this.f75797c = new hp.g((bp.a) bVarO);
            } else {
                this.f75797c = hp.g.f86147b;
            }
        }
        return this.f75797c;
    }

    public int hashCode() {
        return this.f75795a.hashCode();
    }

    public int i() {
        bp.b bVarO = g.o(this.f75795a, bp.i.E7);
        if (!(bVarO instanceof k)) {
            return 0;
        }
        int iJ3 = ((k) bVarO).J3();
        if (iJ3 % 90 == 0) {
            return ((iJ3 % 360) + 360) % 360;
        }
        return 0;
    }

    public void j(List<tp.b> list) {
        this.f75795a.Y4(bp.i.D, hp.a.h(list));
    }

    public e(bp.d dVar) {
        this.f75795a = dVar;
    }

    e(bp.d dVar, j jVar) {
        this.f75795a = dVar;
        this.f75796b = jVar;
    }
}
