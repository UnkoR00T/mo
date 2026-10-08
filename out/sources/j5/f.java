package j5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    private static class a implements Iterator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f99452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f99453b = 0;

        a(f fVar) {
            this.f99452a = fVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = (d) this.f99452a.f99444f.get(this.f99453b);
            this.f99453b++;
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f99453b < this.f99452a.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }

    @Override // j5.b
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return (f) super.clone();
    }
}
