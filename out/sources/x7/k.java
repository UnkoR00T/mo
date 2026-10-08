package x7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import w7.c0;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f217270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<c0> f217271b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f217272c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f217273d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f217274e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f217275f;

    private static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f217277b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c0> f217276a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f217277b, aVar.f217277b);
        }

        public void e(long j15, c0 c0Var) {
            p.d(j15 != -9223372036854775807L);
            p.w(this.f217276a.isEmpty());
            this.f217277b = j15;
            this.f217276a.add(c0Var);
        }
    }

    public interface b {
        void a(long j15, c0 c0Var);
    }

    public k(b bVar) {
        this.f217270a = bVar;
    }

    private c0 c(c0 c0Var) {
        c0 c0Var2 = this.f217271b.isEmpty() ? new c0() : this.f217271b.pop();
        c0Var2.b0(c0Var.a());
        System.arraycopy(c0Var.f(), c0Var.g(), c0Var2.f(), 0, c0Var2.a());
        return c0Var2;
    }

    private void e(int i15) {
        while (this.f217273d.size() > i15) {
            a aVar = (a) o0.h(this.f217273d.poll());
            for (int i16 = 0; i16 < aVar.f217276a.size(); i16++) {
                this.f217270a.a(aVar.f217277b, aVar.f217276a.get(i16));
                this.f217271b.push(aVar.f217276a.get(i16));
            }
            aVar.f217276a.clear();
            a aVar2 = this.f217275f;
            if (aVar2 != null && aVar2.f217277b == aVar.f217277b) {
                this.f217275f = null;
            }
            this.f217272c.push(aVar);
        }
    }

    public void a(long j15, c0 c0Var) {
        int i15;
        if (j15 == -9223372036854775807L || (i15 = this.f217274e) == 0 || (i15 != -1 && this.f217273d.size() >= this.f217274e && j15 < ((a) o0.h(this.f217273d.peek())).f217277b)) {
            this.f217270a.a(j15, c0Var);
            return;
        }
        c0 c0VarC = c(c0Var);
        a aVar = this.f217275f;
        if (aVar != null && j15 == aVar.f217277b) {
            aVar.f217276a.add(c0VarC);
            return;
        }
        a aVar2 = this.f217272c.isEmpty() ? new a() : this.f217272c.pop();
        aVar2.e(j15, c0VarC);
        this.f217273d.add(aVar2);
        this.f217275f = aVar2;
        int i16 = this.f217274e;
        if (i16 != -1) {
            e(i16);
        }
    }

    public void b() {
        this.f217273d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f217274e;
    }

    public void g(int i15) {
        p.w(i15 >= 0);
        this.f217274e = i15;
        e(i15);
    }
}
