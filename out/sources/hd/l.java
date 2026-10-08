package hd;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83645d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final od.j f83647f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83642a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f83643b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f83644c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<m> f83646e = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83648a;

        static {
            int[] iArr = new int[od.j.a.values().length];
            f83648a = iArr;
            try {
                iArr[od.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83648a[od.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83648a[od.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83648a[od.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83648a[od.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(od.j jVar) {
        this.f83645d = jVar.c();
        this.f83647f = jVar;
    }

    private void a() {
        for (int i15 = 0; i15 < this.f83646e.size(); i15++) {
            this.f83644c.addPath(this.f83646e.get(i15).W());
        }
    }

    @TargetApi(19)
    private void c(Path.Op op4) {
        this.f83643b.reset();
        this.f83642a.reset();
        for (int size = this.f83646e.size() - 1; size >= 1; size--) {
            m mVar = this.f83646e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path pathW = listL.get(size2).W();
                    pathW.transform(dVar.m());
                    this.f83643b.addPath(pathW);
                }
            } else {
                this.f83643b.addPath(mVar.W());
            }
        }
        m mVar2 = this.f83646e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listL2 = dVar2.l();
            for (int i15 = 0; i15 < listL2.size(); i15++) {
                Path pathW2 = listL2.get(i15).W();
                pathW2.transform(dVar2.m());
                this.f83642a.addPath(pathW2);
            }
        } else {
            this.f83642a.set(mVar2.W());
        }
        this.f83644c.op(this.f83642a, this.f83643b, op4);
    }

    @Override // hd.m
    public Path W() {
        this.f83644c.reset();
        if (this.f83647f.d()) {
            return this.f83644c;
        }
        int i15 = a.f83648a[this.f83647f.b().ordinal()];
        if (i15 == 1) {
            a();
        } else if (i15 == 2) {
            c(Path.Op.UNION);
        } else if (i15 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i15 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i15 == 5) {
            c(Path.Op.XOR);
        }
        return this.f83644c;
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < this.f83646e.size(); i15++) {
            this.f83646e.get(i15).b(list, list2);
        }
    }

    @Override // hd.j
    public void h(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f83646e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }
}
