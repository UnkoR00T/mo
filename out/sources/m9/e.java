package m9;

import java.util.ArrayDeque;
import l9.k;
import l9.l;
import l9.p;
import l9.q;
import w7.o0;
import z7.g;

/* JADX INFO: loaded from: classes3.dex */
abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f124670a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<q> f124671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f124672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f124673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f124674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f124675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f124676g;

    private static final class b extends p implements Comparable<b> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f124677l;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (p() != bVar.p()) {
                return p() ? 1 : -1;
            }
            long j15 = this.f233230f - bVar.f233230f;
            if (j15 == 0) {
                j15 = this.f124677l - bVar.f124677l;
                if (j15 == 0) {
                    return 0;
                }
            }
            return j15 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g.a<c> f124678g;

        public c(g.a<c> aVar) {
            this.f124678g = aVar;
        }

        @Override // z7.g
        public final void w() {
            this.f124678g.a(this);
        }
    }

    public e() {
        for (int i15 = 0; i15 < 10; i15++) {
            this.f124670a.add(new b());
        }
        this.f124671b = new ArrayDeque<>();
        for (int i16 = 0; i16 < 2; i16++) {
            this.f124671b.add(new c(new g.a() { // from class: m9.d
                @Override // z7.g.a
                public final void a(g gVar) {
                    this.f124669a.q((e.c) gVar);
                }
            }));
        }
        this.f124672c = new ArrayDeque<>();
        this.f124676g = -9223372036854775807L;
    }

    private void p(b bVar) {
        bVar.l();
        this.f124670a.add(bVar);
    }

    @Override // z7.d
    public void b() {
    }

    @Override // l9.l
    public void c(long j15) {
        this.f124674e = j15;
    }

    @Override // z7.d
    public final void f(long j15) {
        this.f124676g = j15;
    }

    @Override // z7.d
    public void flush() {
        this.f124675f = 0L;
        this.f124674e = 0L;
        while (!this.f124672c.isEmpty()) {
            p((b) o0.h(this.f124672c.poll()));
        }
        b bVar = this.f124673d;
        if (bVar != null) {
            p(bVar);
            this.f124673d = null;
        }
    }

    protected abstract k h();

    protected abstract void i(p pVar);

    @Override // z7.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p g() {
        zj.p.w(this.f124673d == null);
        if (this.f124670a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f124670a.pollFirst();
        this.f124673d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // z7.d, e8.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public q a() {
        if (this.f124671b.isEmpty()) {
            return null;
        }
        while (!this.f124672c.isEmpty() && ((b) o0.h(this.f124672c.peek())).f233230f <= this.f124674e) {
            b bVar = (b) o0.h(this.f124672c.poll());
            if (bVar.p()) {
                q qVar = (q) o0.h(this.f124671b.pollFirst());
                qVar.k(4);
                p(bVar);
                return qVar;
            }
            i(bVar);
            if (n()) {
                k kVarH = h();
                q qVar2 = (q) o0.h(this.f124671b.pollFirst());
                qVar2.x(bVar.f233230f, kVarH, Long.MAX_VALUE);
                p(bVar);
                return qVar2;
            }
            p(bVar);
        }
        return null;
    }

    protected final q l() {
        return this.f124671b.pollFirst();
    }

    protected final long m() {
        return this.f124674e;
    }

    protected abstract boolean n();

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // z7.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void e(p pVar) {
        zj.p.d(pVar == this.f124673d);
        b bVar = (b) pVar;
        if (bVar.p()) {
            long j15 = this.f124675f;
            this.f124675f = 1 + j15;
            bVar.f124677l = j15;
            this.f124672c.add(bVar);
        } else {
            long j16 = bVar.f233230f;
            if (j16 != Long.MIN_VALUE) {
                long j17 = this.f124676g;
                if (j17 == -9223372036854775807L || j16 >= j17) {
                    long j18 = this.f124675f;
                    this.f124675f = 1 + j18;
                    bVar.f124677l = j18;
                    this.f124672c.add(bVar);
                } else {
                    p(bVar);
                }
            } else {
                long j19 = this.f124675f;
                this.f124675f = 1 + j19;
                bVar.f124677l = j19;
                this.f124672c.add(bVar);
            }
        }
        this.f124673d = null;
    }

    protected void q(q qVar) {
        qVar.l();
        this.f124671b.add(qVar);
    }
}
