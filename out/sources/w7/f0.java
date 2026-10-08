package w7;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t7.a0 f210637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.a0.d f210638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f210639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f210640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t7.e0.b f210641e = new t7.e0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f210642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f210643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f210644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f210645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f210646j;

    class a implements t7.a0.d {
        a() {
        }

        @Override // t7.a0.d
        public void K(t7.a0 a0Var, t7.a0.c cVar) {
            f0.this.i();
        }
    }

    public interface b {
        void C(g0 g0Var);
    }

    private final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f210648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f210649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f210650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f210651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f210652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f210653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f210654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f210655h;

        public c(int i15) {
            this.f210648a = i15;
        }

        public void a() {
            if (f0.this.f210637a.B() != 2 || !f0.this.f210637a.u() || f0.this.f210637a.q() != 0) {
                if (this.f210654g) {
                    f0.this.f210642f.n(1);
                }
                this.f210654g = false;
                return;
            }
            t7.e0 e0VarR = f0.this.f210637a.r();
            Object objM = e0VarR.q() ? null : e0VarR.m(f0.this.f210637a.v());
            int iO = f0.this.f210637a.o();
            int iX = f0.this.f210637a.x();
            long jZ = f0.this.f210637a.z();
            long jMax = Math.max(0L, f0.this.f210637a.e() - Math.max(0L, jZ - f0.this.f210637a.G()));
            if (objM != null && iO == -1) {
                jZ -= e0VarR.h(objM, f0.this.f210641e).n();
            }
            long jB = f0.this.f210640d.b();
            if (this.f210654g && Objects.equals(objM, this.f210649b) && iO == this.f210650c && iX == this.f210651d && jZ == this.f210652e && jMax == this.f210653f) {
                if (jB - this.f210655h >= this.f210648a) {
                    f0.this.f210639c.C(new g0(1, this.f210648a));
                    return;
                }
                return;
            }
            this.f210654g = true;
            this.f210655h = jB;
            this.f210649b = objM;
            this.f210650c = iO;
            this.f210651d = iX;
            this.f210652e = jZ;
            this.f210653f = jMax;
            f0.this.f210642f.n(1);
            f0.this.f210642f.a(1, this.f210648a);
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f210657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f210658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f210659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f210660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f210661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f210662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f210663g;

        public d(int i15) {
            this.f210657a = i15;
        }

        public void a() {
            if (!f0.this.f210637a.C()) {
                if (this.f210662f) {
                    f0.this.f210642f.n(2);
                }
                this.f210662f = false;
                return;
            }
            t7.e0 e0VarR = f0.this.f210637a.r();
            Object objM = e0VarR.q() ? null : e0VarR.m(f0.this.f210637a.v());
            int iO = f0.this.f210637a.o();
            int iX = f0.this.f210637a.x();
            long jG = f0.this.f210637a.G();
            if (objM != null && iO == -1) {
                jG -= e0VarR.h(objM, f0.this.f210641e).n();
            }
            long jB = f0.this.f210640d.b();
            if (this.f210662f && Objects.equals(objM, this.f210658b) && iO == this.f210659c && iX == this.f210660d && jG == this.f210661e) {
                if (jB - this.f210663g >= this.f210657a) {
                    f0.this.f210639c.C(new g0(2, this.f210657a));
                    return;
                }
                return;
            }
            this.f210662f = true;
            this.f210663g = jB;
            this.f210658b = objM;
            this.f210659c = iO;
            this.f210660d = iX;
            this.f210661e = jG;
            f0.this.f210642f.n(2);
            f0.this.f210642f.a(2, this.f210657a);
        }
    }

    private final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f210665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f210666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f210667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f210668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f210669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f210670f;

        public e(int i15) {
            this.f210665a = i15;
        }

        public void a() {
            long duration;
            t7.e0 e0VarR = f0.this.f210637a.r();
            Object objM = e0VarR.q() ? null : e0VarR.m(f0.this.f210637a.v());
            int iO = f0.this.f210637a.o();
            int iX = f0.this.f210637a.x();
            long jG = f0.this.f210637a.G();
            if (objM == null || iO != -1) {
                duration = iO != -1 ? f0.this.f210637a.getDuration() : -9223372036854775807L;
            } else {
                e0VarR.h(objM, f0.this.f210641e);
                jG -= f0.this.f210641e.n();
                duration = f0.this.f210641e.j();
            }
            boolean zC = f0.this.f210637a.C();
            if (!zC || duration == -9223372036854775807L || jG < duration) {
                f0.this.f210642f.n(3);
                if (zC && duration != -9223372036854775807L) {
                    f0.this.f210642f.a(3, (int) Math.ceil((duration - jG) / f0.this.f210637a.d().f188663a));
                }
                this.f210669e = false;
                return;
            }
            long jB = f0.this.f210640d.b();
            if (this.f210669e && Objects.equals(objM, this.f210666b) && iO == this.f210667c && iX == this.f210668d) {
                if (jB - this.f210670f >= this.f210665a) {
                    f0.this.f210639c.C(new g0(3, this.f210665a));
                    return;
                }
                return;
            }
            this.f210669e = true;
            this.f210670f = jB;
            this.f210666b = objM;
            this.f210667c = iO;
            this.f210668d = iX;
            f0.this.f210642f.n(3);
            f0.this.f210642f.a(3, this.f210665a);
        }
    }

    private final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f210672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f210673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f210674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f210675d;

        public f(int i15) {
            this.f210672a = i15;
        }

        public void a() {
            int iQ = f0.this.f210637a.q();
            if (!f0.this.f210637a.u() || f0.this.f210637a.B() == 1 || f0.this.f210637a.B() == 4 || iQ == 0 || iQ == 1) {
                if (this.f210674c) {
                    f0.this.f210642f.n(4);
                }
                this.f210674c = false;
                return;
            }
            long jB = f0.this.f210640d.b();
            if (this.f210674c && this.f210673b == iQ) {
                if (jB - this.f210675d >= this.f210672a) {
                    f0.this.f210639c.C(new g0(4, this.f210672a));
                }
            } else {
                this.f210674c = true;
                this.f210675d = jB;
                this.f210673b = iQ;
                f0.this.f210642f.n(4);
                f0.this.f210642f.a(4, this.f210672a);
            }
        }
    }

    public f0(t7.a0 a0Var, b bVar, h hVar, int i15, int i16, int i17, int i18) {
        this.f210637a = a0Var;
        this.f210639c = bVar;
        this.f210640d = hVar;
        this.f210642f = hVar.e(a0Var.s(), new Handler.Callback() { // from class: w7.e0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f210636a.h(message);
            }
        });
        this.f210643g = new c(i15);
        this.f210644h = new d(i16);
        this.f210645i = new e(i17);
        this.f210646j = new f(i18);
        a aVar = new a();
        this.f210638b = aVar;
        a0Var.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(Message message) {
        int i15 = message.what;
        if (i15 == 1) {
            this.f210643g.a();
            return true;
        }
        if (i15 == 2) {
            this.f210644h.a();
            return true;
        }
        if (i15 == 3) {
            this.f210645i.a();
            return true;
        }
        if (i15 != 4) {
            return false;
        }
        this.f210646j.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f210643g.a();
        this.f210644h.a();
        this.f210645i.a();
        this.f210646j.a();
    }

    public void j() {
        this.f210642f.f(null);
        this.f210637a.l(this.f210638b);
    }
}
