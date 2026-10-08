package fe;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface o<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zd.f f61675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<zd.f> f61676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f61677c;

        public a(zd.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(zd.f fVar, List<zd.f> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f61675a = (zd.f) ve.k.d(fVar);
            this.f61676b = (List) ve.k.d(list);
            this.f61677c = (com.bumptech.glide.load.data.d) ve.k.d(dVar);
        }
    }

    a<Data> a(Model model, int i15, int i16, zd.h hVar);

    boolean b(Model model);
}
