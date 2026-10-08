package i9;

import java.util.ArrayList;
import java.util.List;
import o8.k0;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zj.t f90475d = zj.t.e(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zj.t f90476e = zj.t.e('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f90477a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f90478b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f90479c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f90481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90482c;

        public a(int i15, long j15, int i16) {
            this.f90480a = i15;
            this.f90481b = j15;
            this.f90482c = i16;
        }
    }

    private void a(o8.q qVar, k0 k0Var) {
        c0 c0Var = new c0(8);
        qVar.readFully(c0Var.f(), 0, 8);
        this.f90479c = c0Var.D() + 8;
        if (c0Var.z() != 1397048916) {
            k0Var.f143128a = 0L;
        } else {
            k0Var.f143128a = qVar.getPosition() - ((long) (this.f90479c - 12));
            this.f90478b = 2;
        }
    }

    private static int b(String str) throws t7.x {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw t7.x.a("Invalid SEF name", null);
        }
    }

    private void d(o8.q qVar, k0 k0Var) {
        long jA = qVar.a();
        int i15 = this.f90479c - 20;
        c0 c0Var = new c0(i15);
        qVar.readFully(c0Var.f(), 0, i15);
        for (int i16 = 0; i16 < i15 / 12; i16++) {
            c0Var.g0(2);
            short sF = c0Var.F();
            if (sF == 2192 || sF == 2816 || sF == 2817 || sF == 2819 || sF == 2820) {
                this.f90477a.add(new a(sF, (jA - ((long) this.f90479c)) - ((long) c0Var.D()), c0Var.D()));
            } else {
                c0Var.g0(8);
            }
        }
        if (this.f90477a.isEmpty()) {
            k0Var.f143128a = 0L;
        } else {
            this.f90478b = 3;
            k0Var.f143128a = this.f90477a.get(0).f90481b;
        }
    }

    private void e(o8.q qVar, List<t7.v.a> list) throws t7.x {
        long position = qVar.getPosition();
        int iA = (int) ((qVar.a() - qVar.getPosition()) - ((long) this.f90479c));
        c0 c0Var = new c0(iA);
        qVar.readFully(c0Var.f(), 0, iA);
        for (int i15 = 0; i15 < this.f90477a.size(); i15++) {
            a aVar = this.f90477a.get(i15);
            c0Var.f0((int) (aVar.f90481b - position));
            c0Var.g0(4);
            int iD = c0Var.D();
            int iB = b(c0Var.N(iD));
            int i16 = aVar.f90482c - (iD + 8);
            if (iB == 2192) {
                list.add(f(c0Var, i16));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static d9.c f(c0 c0Var, int i15) throws t7.x {
        ArrayList arrayList = new ArrayList();
        List<String> listH = f90476e.h(c0Var.N(i15));
        for (int i16 = 0; i16 < listH.size(); i16++) {
            List<String> listH2 = f90475d.h(listH.get(i16));
            if (listH2.size() != 3) {
                throw t7.x.a(null, null);
            }
            try {
                arrayList.add(new d9.c.a(Long.parseLong(listH2.get(0)), Long.parseLong(listH2.get(1)), 1 << (Integer.parseInt(listH2.get(2)) - 1)));
            } catch (NumberFormatException e15) {
                throw t7.x.a(null, e15);
            }
        }
        return new d9.c(arrayList);
    }

    public int c(o8.q qVar, k0 k0Var, List<t7.v.a> list) throws t7.x {
        int i15 = this.f90478b;
        long j15 = 0;
        if (i15 == 0) {
            long jA = qVar.a();
            if (jA != -1 && jA >= 8) {
                j15 = jA - 8;
            }
            k0Var.f143128a = j15;
            this.f90478b = 1;
        } else if (i15 == 1) {
            a(qVar, k0Var);
        } else if (i15 == 2) {
            d(qVar, k0Var);
        } else {
            if (i15 != 3) {
                throw new IllegalStateException();
            }
            e(qVar, list);
            k0Var.f143128a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f90477a.clear();
        this.f90478b = 0;
    }
}
