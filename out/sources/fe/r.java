package fe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class r<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f61682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i6.f<List<Throwable>> f61683b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f61684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6.f<List<Throwable>> f61685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f61686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.g f61687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.load.data.d.a<? super Data> f61688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Throwable> f61689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f61690g;

        a(List<com.bumptech.glide.load.data.d<Data>> list, i6.f<List<Throwable>> fVar) {
            this.f61685b = fVar;
            ve.k.c(list);
            this.f61684a = list;
            this.f61686c = 0;
        }

        private void g() {
            if (this.f61690g) {
                return;
            }
            if (this.f61686c < this.f61684a.size() - 1) {
                this.f61686c++;
                e(this.f61687d, this.f61688e);
            } else {
                ve.k.d(this.f61689f);
                this.f61688e.c(new be.q("Fetch failed", new ArrayList(this.f61689f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f61684a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f61689f;
            if (list != null) {
                this.f61685b.A(list);
            }
            this.f61689f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f61684a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) ve.k.d(this.f61689f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f61690g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f61684a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return this.f61684a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            this.f61687d = gVar;
            this.f61688e = aVar;
            this.f61689f = this.f61685b.z();
            this.f61684a.get(this.f61686c).e(gVar, this);
            if (this.f61690g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f61688e.f(data);
            } else {
                g();
            }
        }
    }

    r(List<o<Model, Data>> list, i6.f<List<Throwable>> fVar) {
        this.f61682a = list;
        this.f61683b = fVar;
    }

    @Override // fe.o
    public o.a<Data> a(Model model, int i15, int i16, zd.h hVar) {
        o.a<Data> aVarA;
        int size = this.f61682a.size();
        ArrayList arrayList = new ArrayList(size);
        zd.f fVar = null;
        for (int i17 = 0; i17 < size; i17++) {
            o<Model, Data> oVar = this.f61682a.get(i17);
            if (oVar.b(model) && (aVarA = oVar.a(model, i15, i16, hVar)) != null) {
                fVar = aVarA.f61675a;
                arrayList.add(aVarA.f61677c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f61683b));
    }

    @Override // fe.o
    public boolean b(Model model) {
        Iterator<o<Model, Data>> it = this.f61682a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f61682a.toArray()) + '}';
    }
}
